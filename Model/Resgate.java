
package Model;
import.Model.Resgate;

import Db.Database;
import java.sql.*;

public class Resgate{
    private String local_resgate;
    private Date data_resgate;
    private String status;
    private int id;
    private int id_animal;
    private int id_usuario;
    private int id_veterinario;

    public Resgate(String local_resgate, Date data_resgate, String status, int id, int id_animal, int id_usuario, int id_veterinario){
        this.local_resgate = local_resgate;
        this.data_resgate = data_resgate;
        this.status = status;
        this.id = id;
    }

    
    
    public String getLocal_resgate()
    { return local_resgate; }
    public void setLocal_resgate(String local_resgate)
    { this.local_resgate = local_resgate; }

    public String getData_resgate() 
        { return data_resgate; }
        public void setData_resgate(String data_resgate) 
        { this.data_resgate = data_resgate; }

    public String getStatus() 
        { return status; }
        public void setStatus(String status) 
        { this.status = status; }
    
    public int getId() 
    { return id; }
    public void setId(int id)
    { this.id = id; }

    
    
    @Override
    public String toString() {
        return "Local_resgate: " + local_resgate + ", Data_resgate: " + data_resgate + ", Status: " + status + ", ID: " + id;
    }
}
