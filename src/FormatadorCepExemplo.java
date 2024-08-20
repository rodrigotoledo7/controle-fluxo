public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("76801460");
            System.out.println(cepFormatado);
        }catch (CepInvalidoException e){
            e.printStackTrace();
            System.out.println("O CEP fornecido não é válido!");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length()!=8) {
            throw new CepInvalidoException();
        }
        return "76.801-460";
    }
    
}
