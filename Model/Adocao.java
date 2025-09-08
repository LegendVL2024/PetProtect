package Model;

import Db.Database;
import java.sql.*;

public class Adocao {
    private int data_adocao;
    private String status;
    private String observacoes;

    public User(int data_adocao, String status, String observacoes) {
        this.data_adocao = data_adocao;
        this.status = status;
        this.observacoes = observacoes;
    }

    
    public int getdata_adocao() 
    { return data_adocao; }
    public void setId(int data_adocao)
    { this.data_adocao = data_adocao; }

    public String getstatus()
    { return status; }
    public void setstatus(String status)
    { this.status = status; }

    public String getobservacoes() 
    { return observacoes; }
    public void setEmail(String observacoes) 
    { this.observacoes = observacoes; }

  
    @Override
    public String toString() {
        return "data_adocao: " + data_adocao + ", status: " + status + ", observacoes: " + observacoes;
    }
}