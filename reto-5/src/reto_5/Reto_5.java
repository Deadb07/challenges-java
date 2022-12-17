
package reto_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Carolina, Arturo y Nicolás
 */
public class Reto_5 {
    
    public static void main(String[] args) {                        
        try {
            
            String bici = "CREATE TABLE bicicletas("
                        + "     NombreFabricante char(10) primary key,"
                        + "     precioUnitario int,"
                        + "     anioConstruccion char(20))";                
            crear(bici);
            
            String info = 
                ("insert into bicicletas values (\"Cannondale\", 1200000, 2020);"
                +"insert into bicicletas values (\"Trek\", 1450000, 2019);"
                + "insert into bicicletas values (\"Yeti\", 2000000, 2020);"
                + "insert into bicicletas values (\"Fuji\", 950000 , 2021);"
                + "insert into bicicletas values (\"Bmc\", 1950000 , 2018)");            
            insertar(info);
            
            String provee = "CREATE TABLE proveedor("
                    + "     prov_id  int primary key,"
                    + "     prov_nombre  char(20),"
                    + "     prov_direccion char(45),"
                    + "     prov_telefono  bigint(20))";                
            crear(provee);
            
            String info1 = 
                ("insert into proveedor values (101, \"Auteco\",\"calle 7 No. 45-17\", \"05713224459\");"
                +"insert into proveedor values (102, \"Hitachi\", \"calle 19 No. 108-26\", \"05714223344\");"
                + "insert into proveedor values (103, \"Bosch\", \"carrera 68 No. 26-45\", \"05715678798\");"
                + "insert into proveedor values (104, \"Teco\", \"calle 77 No. 68-33\", \"05712213243\");"
                + "insert into proveedor values (105, \"General Electric\", \"calle 29 No. 26-12\", \"05717239919\");");            
            insertar(info1);
            
            String moto = "CREATE TABLE motocicletaselectricas("
                    + "     fabricante varchar(45) NOT NULL,"
                    + "     precio_unitario integer NOT NULL,"
                    + "     autonomia varchar(20) NOT NULL,"
                    + "     nombreproveedor varchar(250) NOT NULL)";                
            crear(moto);
            
            String info2 = 
                ("INSERT INTO motocicletaselectricas VALUES (\"Starker\",\"4200000\", \"18 Horas\",\"Auteco\");"
                + "INSERT INTO motocicletaselectricas VALUES (\"Lucky Lion\",\"5600000\", \"14 Horas\",\"Hitachi\");"
                + "INSERT INTO motocicletaselectricas VALUES (\"Be Electric\",\"4600000\", \"26 Horas\",\"Auteco\");"
                + "INSERT INTO motocicletaselectricas VALUES (\"Mec de Colombia\",\"5900000\", \"20 Horas\",\"Teco\");"
                + "INSERT INTO motocicletaselectricas VALUES (\"Aima\",\"8000000\", \"36 Horas\",\"Bosch\");"
                + "INSERT INTO motocicletaselectricas VALUES (\"Atom Electric\",\"4500000\",\"12 Horas\",\"General Electric\");");
            insertar(info2);
            
            String cliente = "CREATE TABLE clientes("
                    + "     alias varchar(45) NOT NULL PRIMARY KEY,"
                    + "     nombre varchar(45) NOT NULL,"
                    + "     apellidos varchar(45) NOT NULL,"
                    + "     email varchar(45) NOT NULL,"
                    + "     telefono varchar(45) NOT NULL,"
                    + "     contrasena int(20) NOT NULL,"
                    + "     fecha_nacimiento date NOT NULL)";                
            crear(cliente);
            
            String info3 = 
                ("insert into clientes values (\"lucky\", \"Pedro\", \"Perez\", \"pedrop@gmail.com\", 3136754567, 21, '2020-03-27');"
                + "insert into clientes values (\"malopez\", \"Maria\", \"Lopez\", \"malopez@gmail.com\", 3146754567, 23, '2020-04-27');"
                + "insert into clientes values (\"diva\", \"Ana\", \"Diaz\", \"divalopez@gmail.com\", 3206754567, 25, '2020-03-21');"
                + "insert into clientes values (\"dreamer\", \"Luis\", \"Rojas\", \"luisrojas@gmail.com\", 3236754567, 25, '2020-03-21');"
                + "insert into clientes values (\"ninja\", \"Andres\", \"Cruz\", \"acruz@gmail.com\", 3112130987, 30, '2021-03-27');"
                + "insert into clientes values (\"neon\", \"Nelson\", \"Ruiz\", \"NRuiz@gmail.com\", 3166654567, 21, '2021-03-27');"
                + "insert into clientes values (\"rose\", \"Claudia\", \"Mendez\", \"mendezC@gmail.com\", 3166777567, 18, '2020-06-28');"
                + "insert into clientes values (\"green\", \"Jorge\", \"Rodriguez\", \"jorgeR@gmail.com\", 3204357895, 31, '2020-07-16');");
            insertar(info3);
            
            String intencion = "CREATE TABLE intenciones("
                    + "     clientes_alias varchar(45) NOT NULL,"
                    + "     nombre_fabricante varchar(45) NOT NULL,"
                    + "     fecha_Hora datetime NOT NULL,"
                    + "     FOREIGN KEY (clientes_alias) REFERENCES clientes (alias))";                
            crear(intencion);
            
            String info4 = 
                ("INSERT INTO intenciones VALUES (\"lucky\",\"Cannondale\", \"2017-10-25 20:00:00\");"
                + "INSERT INTO intenciones VALUES (\"lucky\",\"Trek\",\"2019-03-15 18:30:00\");"
                + "INSERT INTO intenciones VALUES (\"lucky\",\"Starker\",\"2019-05-20 20:30:00\");"
                + "INSERT INTO intenciones VALUES (\"malopez\",\"Cannondale\",\"2018-05-20 20:30:00\");"
                + "INSERT INTO intenciones VALUES (\"malopez\",\"Starker\",\"2020-01-20 20:30:00\");"
                + "INSERT INTO intenciones VALUES (\"diva\",\"Yeti\",\"2019-05-20 20:30:00\");"
                + "INSERT INTO intenciones VALUES (\"diva\",\"Fuji\",\"2018-06-22 21:30:00\");"
                + "INSERT INTO intenciones VALUES (\"diva\",\"Lucky Lion\",\"2020-03-17 15:30:20\");"
                + "INSERT INTO intenciones VALUES (\"dreamer\",\"Lucky Lion\",\"2020-03-17 15:30:20\");"
                + "INSERT INTO intenciones VALUES (\"dreamer\",\"Be Electric\",\"2020-04-10 18:30:20\");"
                + "INSERT INTO intenciones VALUES (\"ninja\",\"Aima\",\"2020-02-17 20:30:20\");"    
                + "INSERT INTO intenciones VALUES (\"ninja\",\"Starker\",\"2020-02-20 16:30:20\");"    
                + "INSERT INTO intenciones VALUES (\"ninja\",\"Mec de Colombia\",\"2020-03-27 18:30:20\");"    
                + "INSERT INTO intenciones VALUES (\"rose\",\"Atom Electric\",\"2020-03-20 21:30:20\");"
                + "INSERT INTO intenciones VALUES (\"green\",\"Yeti\",\"2020-01-10 17:30:20\");"
                + "INSERT INTO intenciones VALUES (\"green\",\"Trek\",\"2020-02-15 20:30:20\");"
                + "INSERT INTO intenciones VALUES (\"green\",\"Bmc\",\"2020-03-17 18:30:20\")");
            insertar(info4);
            
            String update = "UPDATE bicicletas SET anioConstruccion=2017 WHERE NombreFabricante = \"Cannondale\";";
            actualizar(update);
            
            String update2 = "UPDATE clientes SET telefono=3115678432 WHERE alias = \"ninja\";";
            actualizar(update2);
            
            String borrar = "DELETE FROM intenciones WHERE nombre_fabricante = \"Trek\" and clientes_alias = \"green\";";
            crear(borrar);
            
            String consulta1 = "SELECT NombreFabricante FROM bicicletas "
                    + "UNION ALL SELECT fabricante FROM motocicletaselectricas "
                    + "ORDER BY NombreFabricante ASC;";
            System.out.println("Consulta 1");
            consulta(consulta1);
            
            String consulta2 = "Select*from bicicletas WHERE anioConstruccion >= 2019 "
                    + "AND NOT NombreFabricante = \"Cannondale\" "
                    + "ORDER BY NombreFabricante ASC;";
            System.out.println("Consulta 2");
            consulta(consulta2);
            
            String consulta3 = "Select fabricante from motocicletaselectricas "
                    + "WHERE nombreproveedor = \"Auteco\";";
            System.out.println("Consulta 3");
            consulta(consulta3);
            
            String consulta4 = "Select nombre_fabricante from intenciones "
                    + "WHERE clientes_alias = \"lucky\" "
                    + "ORDER BY nombre_fabricante ASC;";
            System.out.println("Consulta 4");
            consulta(consulta4);
            
            String consulta5 = "select A.alias, A.nombre, A.apellidos "
                    + "from intenciones B inner join clientes A on B.clientes_alias = A.alias "
                    + "where B.nombre_fabricante = \"Yeti\"ORDER BY A.alias ASC;";
            System.out.println("Consulta 5");
            consulta(consulta5);
            
            String consulta6 = "Select count(*) from bicicletas WHERE anioConstruccion > 2019;";
            System.out.println("Consulta 6");
            consulta(consulta6);                        
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }
    
    public static void crear(String info){
        try {
            Connection conn;
            String db = "reto5";
            String user = "root";
            String ps = "";            
            String url = "jdbc:mysql://localhost/"+db;
                        
            conn = DriverManager.getConnection(url,user,ps);            
        
            PreparedStatement in = conn.prepareStatement(info);         
            in.execute();
            System.out.println("Exitoso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }                
    }
    
    public static void insertar(String info){
        try {
            Connection conn;
            String db = "reto5";
            String user = "root";
            String ps = "";            
            String url = "jdbc:mysql://localhost/"+db;
            
            conn = DriverManager.getConnection(url,user,ps);
            //System.out.println("Conectado");
                                   
            String [] texto = info.split(";");
            for (String insert : texto) {
                PreparedStatement in = conn.prepareStatement(insert);         
                in.execute();
                //System.out.println(insert);                   
            }                                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }
    
    public static void consulta(String info){
        try {
            Connection conn;
            String db = "reto5";
            String user = "root";
            String ps = "";            
            String url = "jdbc:mysql://localhost/"+db;
            
            conn = DriverManager.getConnection(url,user,ps);
            //System.out.println("Conectado");
            
            PreparedStatement select = conn.prepareStatement(info);
            ResultSet resultado = select.executeQuery();
            
            while(resultado.next()){
                System.out.println(resultado.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void actualizar(String info){
        try {
            Connection conn;
            String db = "reto5";
            String user = "root";
            String ps = "";            
            String url = "jdbc:mysql://localhost/"+db;
            
            conn = DriverManager.getConnection(url,user,ps);
            //System.out.println("Conectado");
            PreparedStatement update = conn.prepareStatement(info);
            int resultado = update.executeUpdate();
            if (resultado > 0) {
                    System.out.println(" Actualización exitosa exitosa !");
            }
            System.out.println("");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
