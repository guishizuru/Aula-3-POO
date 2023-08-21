public class Mainn {
    public static void main(String[] args) {
        Programa programa1 = new Programa();
        programa1.nome = "Mais Você";
        programa1.pontosDeAudiencia = 8;
        Programa programa2 = new Programa();
        programa2.nome = "Globo rural";
        programa2.pontosDeAudiencia = 10;
        Programa programa3= new Programa();
        programa3.nome = "Fantastico";
        programa3.pontosDeAudiencia = 2;

        Emissora emissora = new Emissora();
        emissora.nome = "Globo";
        emissora.programas.add(programa1);
        emissora.programas.add(programa2);
        emissora.programas.add(programa3);
        Programa programaDeMaiorAudiencia = emissora.getProgramaMaiorAudiencia();
        System.out.println(programaDeMaiorAudiencia.nome);
    }
}
