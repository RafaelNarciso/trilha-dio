package exercicios.trycatch;

public class CepInvalidos {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2876506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("\nCep não corresponde com a regras  de negocio\n ");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "23.765-064";

    }

}
