package challenge;

import challenge.Criptografia;

public class CriptografiaCesariana implements Criptografia  {
    @Override
    public String criptografar(String texto) {
        if(texto.equals("")){
            throw new IllegalArgumentException();
        } else if(texto == null){
            throw new NullPointerException();
        }

        int deslocamento = 3;
        char[] encryptAux = new char[texto.length()];
        String stringEncrypt = "";

        int i = 0;

        texto = texto.toLowerCase();
        System.out.println(texto);

        while(i < texto.length()){
            //saber se vai deslocar pra frente ou para trás
            if (!isNumber(texto.charAt(i)) && texto.charAt(i) != ' '){
                if((int)texto.charAt(i) + deslocamento >= 122)
                    encryptAux[i] = (char)((int)texto.charAt(i) - (26 - deslocamento));
                if((int)texto.charAt(i) + deslocamento < 122)
                    encryptAux[i] = (char)((int)texto.charAt(i) + deslocamento);
            }else{
                encryptAux[i] = texto.charAt(i);
            }    
            
            i++;
        }
        
        for(i=0; i<texto.length(); i++){
            stringEncrypt = stringEncrypt + encryptAux[i];
        }
        texto = stringEncrypt;
    
        return texto;
    }
    
    @Override
    public String descriptografar(String texto) {
        if(texto.equals("")){
            throw new IllegalArgumentException();
        } else if(texto == null){
            throw new NullPointerException();
        }

        int deslocamento = 3;
        char[] encryptAux = new char[texto.length()];
        String stringEncrypt = "";

        int i = 0;

        texto = texto.toLowerCase();

        

        while(i < texto.length()){
            //saber se vai deslocar pra frente ou para trás
            if(!isNumber(texto.charAt(i)) && texto.charAt(i) != ' '){
                if((int)texto.charAt(i) - deslocamento >= 97)
                        encryptAux[i] = (char)((int)texto.charAt(i) - deslocamento);
                    if((int)texto.charAt(i) + deslocamento < 97)
                        encryptAux[i] = (char)((int)texto.charAt(i) + (26 - deslocamento));
            }else{
                encryptAux[i] = texto.charAt(i);
            }
            
            i++;
        }
        
        for(i=0; i<texto.length(); i++){
            stringEncrypt = stringEncrypt + encryptAux[i];
        }
        texto = stringEncrypt;
    
        return texto;
    }

    public boolean isNumber(char c){
        return c >= '0' && c <= '9';
    }

    /*public static void main(String[] args){
        CriptografiaCesariana cript = new CriptografiaCesariana();

        System.out.println(cript.criptografar("Aprender Java gera felicidade"));
    }*/
}
