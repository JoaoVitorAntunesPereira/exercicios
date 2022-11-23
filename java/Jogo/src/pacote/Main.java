package pacote;
 
import java.util.Scanner;
 
public class Main {
    public static Caracteristicas obj = new Caracteristicas();
    public static Inventario inventario = new Inventario();
    public static int escolha;
    static Scanner Scan = new Scanner(System.in);
    static Inicio inicio = new Inicio();
    
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            Inventario mochila = new Inventario();
            obj.Pontos();
            inicio.comeco();
            if(inventario.morte==true) { 
            	jogar_novamente();
            }
    }
    public static void jogar_novamente() {
    	System.out.println("Digite 1 para jogar novamente");
    	escolha = Scan.nextInt();
    	if(escolha == 1) {
    		Main.inventario.morte = false;
    		inicio.comeco();
    	}else {
    		jogar_novamente();
    	}
    }
}
