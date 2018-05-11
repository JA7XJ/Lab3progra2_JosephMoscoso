package lab2_josephmoscoso;
import java.util.*;
public class Lab2_JosephMoscoso {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        char r='s';
        while (r=='s'||r=='S') {
            System.out.println("Bienvenido al videojuego Dev & Dungeon");
            System.out.println("----------------------------------------------");
            System.out.println("1)Iniciar\n2)Nivel de dificultad\n3)salir");
            System.out.println("----------------------------------------------");
            System.out.print("Ingrese la opcion a escoger: ");
            int op=sc.nextInt();
            System.out.println("----------------------------------------------");
            if (op==1) {
                game();
            }
            if (op==2) {
                
            }
            if (op==3) {
                break;
            }
            if (op>3||op<1) {
                System.out.println("Error, esta opcion no existe");
            }
            System.out.println("----------------------------------------------");
            System.out.print("¿Desea volver a iniciar?[S/N]: ");
            r=sc.next().charAt(0);
        }
    }
    public static void game(){
        
    }
    
}
