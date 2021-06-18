package cartas;

import java.util.Scanner;

import cartas.Rally;
/**
 * Serve como main 
 * @author Daviw
 *
 */
public class Main {

	/**
	 * Presenta a parte principal do program 
	 * @param args Sao todos os argumentos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rally jogo;
		final Scanner in = new Scanner(System.in); 
        jogador ans = (Jogador) promptInputValidationByValue( "Gostaria de começar um jogo novo? [Y/N]", in, new Object[]{ 'n', 'y', 'Y', 'N' } );
        
        if(jogador.toLowerCase() == 'y' || 'Y' ){
            jogo = new jogoNovo();
            jogo.start();
        }else{
            print("Desligar Programa...");
        }
        
        in.close();
        System.exit(0);
    }
	
	/**
	 * 
	 * @param msg
	 * @param in
	 * @param expected_values
	 * @return
	 */
	public static final Object promptInputValidationByValue( String msg, Scanner in, Object[] expected_values ){             
        print("[PROMPT] " + msg);
        String value = in.nextLine().trim();
        Object parsed_value = stringToObject( value );
        
        boolean found = false;
        for( Object val : expected_values ){
            if( parsed_value.getClass().equals(val.getClass()) && parsed_value.equals(val) ){ // Avoid tricking java
                found = true;
                break;
            }
        }
        
        if( !found ){
            printError("Error while parsing input! Please try again.");
            return promptInputValidationByValue(msg, in, expected_values);
        }
        
        return parsed_value;
    }
	/**
	 * Serve para fazer o print de erros  
	 * @param msg Representa a mensagem 
	 * @param args Reprresenta os argumentos
	 */
	public static final void printError(String msg, Object... args){
        System.out.printf( "[ERROR] " + msg + "\n", args);
    }
	
	private static Object stringToObject( String value ) {
        Object parsed_value = null;
        try{
            double isNum = Double.parseDouble(value);
            if(isNum == Math.floor(isNum)) {
                parsed_value = Integer.parseInt(value);
            }else {
                parsed_value = Double.parseDouble(value);
            }
        } catch(Exception e) {
            if(value.toCharArray().length == 1) {
                parsed_value = value.charAt(0);
            }else {
                if( "true".equals(value) ){
                    parsed_value = true;
                }else if( "false".equals(value) ){
                    parsed_value = false;
                }else if( "null".equals(value) ){
                    parsed_value = null;
                }else{
                    parsed_value = value;
                }
            }
        }      
        return parsed_value;
    }
	
	public static final void print(String msg, Object... args){
        System.out.printf( "[JOGO RALLY] " + msg + "\n", args );
    }
}
