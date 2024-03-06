package co.edu.uniquindio.poo.util.QuaryBuilder;

public class DbConnection {
    private String DbName;


    public DbConnection(String DbName){
        assert DbName != null;
        
         this.DbName = DbName;

    }

    public String executeQuery(Query query){
        String nombrePedido= "Lampara";
        String numeroEntrega= "N22";
        String vehiculoEntrega= "GXD188";

        String resultado="";
        if (query.getQuerySelect().equals(QuerySelect.NombrePedido)){
            resultado=nombrePedido; 
        } else if (query.getQuerySelect().equals(QuerySelect.NumeroEntrega)){
            resultado=numeroEntrega;
        } else if (query.getQuerySelect().equals(QuerySelect.VehiculoDeEntrega)){
            resultado=vehiculoEntrega;
        }else{
            resultado = nombrePedido+" "+numeroEntrega+" "+vehiculoEntrega;
        }

        return resultado;
}

}