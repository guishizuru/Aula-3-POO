public class Luta {
   Lutador lutador1 = new Lutador();
   Lutador lutador2 = new Lutador();

   public void apresentar(){
       System.out.println("De um lado, pesando"  + lutador1.peso + "kg, temos" + lutador1.nome);
       System.out.println("Do outro lado, pesando " + lutador2.peso +"kg, temos " +lutador2.nome);

   }
   public void iniciarLuta9(){
       System.out.println("Lutardor 1, golpeou :");
       lutador1.golpear();
       System.out.println("Lutardor 2, golpeou :");
       lutador2.golpear();
   }

}
