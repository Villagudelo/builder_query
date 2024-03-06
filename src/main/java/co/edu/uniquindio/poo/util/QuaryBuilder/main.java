package co.edu.uniquindio.poo.util.QuaryBuilder;

import java.time.LocalDate;

import co.edu.uniquindio.poo.util.QuaryBuilder.Query.QueryBuilder;

public class main {
    public static void main(String[] args) {

        DbConnection conexion = new DbConnection("pedidos");

        User user= new User("alfonso", 1026272);

        //crea la consulta a la DB con el contructor normal
        Query query1 = new Query(QuerySelect.NombrePedido, FromFrom.EntregasDB, user, OrderBy.ASC);  

        //Crea la consulta utilizando el metodo Query builder 
        Query query2 = Query.builder()
                           .select(QuerySelect.VehiculoDeEntrega)
                           .from(FromFrom.EnviosDB)
                           .user(user)
                           .build();

        System.out.println(conexion.executeQuery(query2));  
        System.out.println(conexion.executeQuery(query1));
        System.out.println();

         System.out.println("Query:");
         System.out.println("Query Select: " + query1.getQuerySelect());
         System.out.println("From From: " + query1.getFromFrom());
         System.out.println("User: " + query1.getUser().getName() + ", ID: " + query1.getUser().getId());
         System.out.println("Order By: " + query1.getOrderBy());
         System.out.println();

         System.out.println("Query builder:");
         System.out.println("Query Select: " + query2.getQuerySelect());
         System.out.println("From From: " + query2.getFromFrom());
         System.out.println("User: " + query2.getUser().getName() + ", ID: " + query2.getUser().getId());
         System.out.println();
        

}
}