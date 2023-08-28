package com.daniel.prueba.dao.impl;

import com.daniel.prueba.DatabaseConexion.H2Conexion;
import com.daniel.prueba.dao.ITasaRepository;
import com.daniel.prueba.dto.Tasa;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Repository
public class TasaRepository implements ITasaRepository {


    Connection conn = H2Conexion.getH2Instance();
    Statement stmt;

    {
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Tasa update(Tasa tasa) {

        try {
            System.out.println("Creating table in given database...");
            String sql = "update Tasa set tasa = " + tasa.getTasa() + "where MONEDAORIGEN= '" + tasa.getMonedaOrigen() + "' and MONEDADESTINO= '" + tasa.getMonedaDestino() + "';";
            stmt.executeUpdate(sql);
            return tasa;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Tasa> getAll() {
        try {
            String sql = "SELECT * FROM Tasa;";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BigDecimal getTasa(String monedaEntrada, String monedaDestino) {
        BigDecimal tasa = null;

        try {
            String query = "SELECT * FROM Tasa WHERE MONEDAORIGEN= '" + monedaEntrada + "' and MONEDADESTINO= '" + monedaDestino + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                tasa = rs.getBigDecimal("tasa");
            }
            return tasa;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}