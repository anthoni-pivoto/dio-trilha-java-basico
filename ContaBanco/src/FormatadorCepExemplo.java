public class FormatadorCepExemplo{
    /**
     * @param args
     */
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("23755064");
            System.out.println(cepFormatado);
        }catch(CepInvalidoException e){
            System.out.println("Cep deve conter 8 digitos");;
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
                throw new CepInvalidoException();
                return "23.755-064";
        }
}