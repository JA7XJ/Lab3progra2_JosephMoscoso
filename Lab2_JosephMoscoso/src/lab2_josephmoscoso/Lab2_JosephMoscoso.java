package lab2_josephmoscoso;
import java.util.*;
public class Lab2_JosephMoscoso {
static Scanner sc=new Scanner(System.in);
static Random r=new Random();
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
        char r='s';
        ArrayList player=new ArrayList();
        ArrayList<mago> p=new ArrayList();
        ArrayList<berserk> p2=new ArrayList();
        ArrayList<picaro> p3=new ArrayList();
        ArrayList<arquero> p4=new ArrayList();
        System.out.println("Usted escogio comenzar a jugar ");
        System.out.println("----------------------------------------------");
        System.out.println("Por favor escoga una de las 4 clases: "
                + "\n1)Mago"
                + "\n2)Berserk"
                + "\n3)Picaro"
                + "\n4)Arquero");
        System.out.println("----------------------------------------------");
        System.out.print("Ingrese su opcion: ");
        int op=sc.nextInt();
        while (op>4||op<1) {
            System.out.println("Error, opcion incorrecta");
            System.out.println("----------------------------------------------");
            System.out.print("Vuelava a escribir su opcion: ");
            op=sc.nextInt();
        }
        System.out.println("----------------------------------------------");
        if (op==1) {
            p.add(new mago());
            System.out.print("¿Desea crear con atributos por defecto?[S/N]: "); 
            r=sc.next().charAt(0);
            if (r=='s'||r=='S') {
                p.get(0).setHp(120);
                p.get(0).setAd(50);
                p.get(0).setAp(20);
                p.get(0).setEficacia(70);
                p.get(0).setCritic(2);
                p.get(0).setSuerte(20);
                p.get(0).setVelocidad(10);
                System.out.print("Ingrese el grito de batalla: ");
                String scream=sc.nextLine();
                scream=sc.nextLine();
                p.get(0).setGrito(scream);
                System.out.print("Ingrese la edad: ");
                int edad=sc.nextInt();
                p.get(0).setEdad(edad);
                System.out.print("Ingrese el nombre: ");
                String name=sc.nextLine();
                name=sc.nextLine();
                p.get(0).setNombre(name);
                System.out.print("Ingrese la estatura: ");
                int altura=sc.nextInt();
                p.get(0).setEstatura(altura);
                System.out.print("Ingrese el peso: ");
                int peso=sc.nextInt();
                p.get(0).setPeso(peso);
                System.out.print("Ingrese un color de piel: ");
                String color=sc.next();
                p.get(0).setColor(color);
                System.out.print("Ingrese un color de pelo: ");
                String colorp=sc.next();
                p.get(0).setPeloc(colorp);
                player.add(p.get(0));
            }else{
                System.out.print("Ingrese el HP: ");
                int hp=sc.nextInt();
                p.get(0).setHp(hp);
                System.out.print("Ingrese el AD: ");
                int ad=sc.nextInt();
                p.get(0).setAd(ad);
                System.out.print("Ingrese el AP: ");
                int ap=sc.nextInt();
                p.get(0).setAp(ap);
                System.out.print("Ingrese la eficacia: ");
                int eficacia=sc.nextInt();
                while (eficacia>=100||eficacia<=1) {
                    System.out.print("Error, número mayor o igual que 100 o menor o igual que 1, ingrese la eficacia otra vez: ");
                    eficacia=sc.nextInt();
                }
                p.get(0).setEficacia(eficacia);
                System.out.print("Ingrese la probabilidad de criticos: ");
                int critic=sc.nextInt();
                while (critic>=100||critic<=1) {
                    System.out.print("Error, número mayor o igual que 100 o menor o igual que 1, ingrese la probabilidad otra vez: ");
                    critic=sc.nextInt();
                }
                p.get(0).setCritic(critic);
                System.out.print("Ingrese la suerte: ");
                int suerte=sc.nextInt();
                p.get(0).setSuerte(suerte);
                System.out.print("Ingrese la velocidad: ");
                int velocidad=sc.nextInt();
                p.get(0).setVelocidad(velocidad);
                System.out.print("Ingrese el grito de batalla: ");
                String scream=sc.nextLine();
                scream=sc.nextLine();
                p.get(0).setGrito(scream);
                System.out.print("Ingrese la edad: ");
                int edad=sc.nextInt();
                p.get(0).setEdad(edad);
                System.out.print("Ingrese el nombre: ");
                String name=sc.nextLine();
                name=sc.nextLine();
                p.get(0).setNombre(name);
                System.out.print("Ingrese la estatura: ");
                int altura=sc.nextInt();
                p.get(0).setEstatura(altura);
                System.out.print("Ingrese el peso: ");
                int peso=sc.nextInt();
                p.get(0).setPeso(peso);
                System.out.print("Ingrese un color de piel: ");
                String color=sc.next();
                p.get(0).setColor(color);
                System.out.print("Ingrese un color de pelo: ");
                String colorp=sc.next();
                p.get(0).setPeloc(colorp);
                player.add(p.get(0));
            }
        }
        if (op==2) {
            p2.add(new berserk());
            System.out.print("¿Desea crear con atributos por defecto?[S/N]: "); 
            r=sc.next().charAt(0);
            if (r=='s'||r=='S') {
                p2.get(0).setHp(190);
                p2.get(0).setAd(80);
                p2.get(0).setEficacia(80);
                p2.get(0).setCritic(30);
                p2.get(0).setSuerte(15);
                p2.get(0).setVelocidad(20);
                System.out.print("Ingrese el grito de batalla: ");
                String scream=sc.nextLine();
                scream=sc.nextLine();
                p2.get(0).setGrito(scream);
                System.out.print("Ingrese la edad: ");
                int edad=sc.nextInt();
                p2.get(0).setEdad(edad);
                System.out.print("Ingrese el nombre: ");
                String name=sc.nextLine();
                name=sc.nextLine();
                p2.get(0).setNombre(name);
                System.out.print("Ingrese la estatura: ");
                int altura=sc.nextInt();
                p2.get(0).setEstatura(altura);
                System.out.print("Ingrese el peso: ");
                int peso=sc.nextInt();
                p2.get(0).setPeso(peso);
                System.out.print("Ingrese un color de piel: ");
                String color=sc.next();
                p2.get(0).setColor(color);
                System.out.print("Ingrese un color de pelo: ");
                String colorp=sc.next();
                p2.get(0).setPeloc(colorp);
                player.add(p2.get(0));
            }else{
                System.out.print("Ingrese el HP: ");
                int hp=sc.nextInt();
                p2.get(0).setHp(hp);
                System.out.print("Ingrese el AD: ");
                int ad=sc.nextInt();
                p2.get(0).setAd(ad);
                System.out.print("Ingrese la eficacia: ");
                int eficacia=sc.nextInt();
                while (eficacia>=100||eficacia<=1) {
                    System.out.print("Error, número mayor o igual que 100 o menor o igual que 1, ingrese la eficacia otra vez: ");
                    eficacia=sc.nextInt();
                }
                p2.get(0).setEficacia(eficacia);
                System.out.print("Ingrese la probabilidad de criticos: ");
                int critic=sc.nextInt();
                while (critic>=100||critic<=1) {
                    System.out.print("Error, número mayor o igual que 100 o menor o igual que 1, ingrese la probabilidad otra vez: ");
                    critic=sc.nextInt();
                }
                p2.get(0).setCritic(critic);
                System.out.print("Ingrese la suerte: ");
                int suerte=sc.nextInt();
                p2.get(0).setSuerte(suerte);
                System.out.print("Ingrese la velocidad: ");
                int velocidad=sc.nextInt();
                p2.get(0).setVelocidad(velocidad);
                System.out.print("Ingrese el grito de batalla: ");
                String scream=sc.nextLine();
                scream=sc.nextLine();
                p2.get(0).setGrito(scream);
                System.out.print("Ingrese la edad: ");
                int edad=sc.nextInt();
                p2.get(0).setEdad(edad);
                System.out.print("Ingrese el nombre: ");
                String name=sc.nextLine();
                name=sc.nextLine();
                p2.get(0).setNombre(name);
                System.out.print("Ingrese la estatura: ");
                int altura=sc.nextInt();
                p2.get(0).setEstatura(altura);
                System.out.print("Ingrese el peso: ");
                int peso=sc.nextInt();
                p2.get(0).setPeso(peso);
                System.out.print("Ingrese un color de piel: ");
                String color=sc.next();
                p2.get(0).setColor(color);
                System.out.print("Ingrese un color de pelo: ");
                String colorp=sc.next();
                p2.get(0).setPeloc(colorp);
                player.add(p2.get(0));
            }
        }
        if (op==3) {
            p3.add(new picaro());
            System.out.print("¿Desea crear con atributos por defecto?[S/N]: "); 
            r=sc.next().charAt(0);
            if (r=='s'||r=='S') {
                p3.get(0).setHp(150);
                p3.get(0).setAd(55);
                p3.get(0).setEficacia(85);
                p3.get(0).setCritic(60);
                p3.get(0).setSuerte(50);
                p3.get(0).setVelocidad(30);
                System.out.print("Ingrese el grito de batalla: ");
                String scream=sc.nextLine();
                scream=sc.nextLine();
                p3.get(0).setGrito(scream);
                System.out.print("Ingrese la edad: ");
                int edad=sc.nextInt();
                p3.get(0).setEdad(edad);
                System.out.print("Ingrese el nombre: ");
                String name=sc.nextLine();
                name=sc.nextLine();
                p3.get(0).setNombre(name);
                System.out.print("Ingrese la estatura: ");
                int altura=sc.nextInt();
                p3.get(0).setEstatura(altura);
                System.out.print("Ingrese el peso: ");
                int peso=sc.nextInt();
                p3.get(0).setPeso(peso);
                System.out.print("Ingrese un color de piel: ");
                String color=sc.next();
                p3.get(0).setColor(color);
                System.out.print("Ingrese un color de pelo: ");
                String colorp=sc.next();
                p3.get(0).setPeloc(colorp);
                player.add(p3.get(0));
            }else{
                System.out.print("Ingrese el HP: ");
                int hp=sc.nextInt();
                p3.get(0).setHp(hp);
                System.out.print("Ingrese el AD: ");
                int ad=sc.nextInt();
                p3.get(0).setAd(ad);
                System.out.print("Ingrese la eficacia: ");
                int eficacia=sc.nextInt();
                while (eficacia>=100||eficacia<=1) {
                    System.out.print("Error, número mayor o igual que 100 o menor o igual que 1, ingrese la eficacia otra vez: ");
                    eficacia=sc.nextInt();
                }
                p3.get(0).setEficacia(eficacia);
                System.out.print("Ingrese la probabilidad de criticos: ");
                int critic=sc.nextInt();
                while (critic>=100||critic<=1) {
                    System.out.print("Error, número mayor o igual que 100 o menor o igual que 1, ingrese la probabilidad otra vez: ");
                    critic=sc.nextInt();
                }
                p3.get(0).setCritic(critic);
                System.out.print("Ingrese la suerte: ");
                int suerte=sc.nextInt();
                p3.get(0).setSuerte(suerte);
                System.out.print("Ingrese la velocidad: ");
                int velocidad=sc.nextInt();
                p3.get(0).setVelocidad(velocidad);
                System.out.print("Ingrese el grito de batalla: ");
                String scream=sc.nextLine();
                scream=sc.nextLine();
                p3.get(0).setGrito(scream);
                System.out.print("Ingrese la edad: ");
                int edad=sc.nextInt();
                p3.get(0).setEdad(edad);
                System.out.print("Ingrese el nombre: ");
                String name=sc.nextLine();
                name=sc.nextLine();
                p3.get(0).setNombre(name);
                System.out.print("Ingrese la estatura: ");
                int altura=sc.nextInt();
                p3.get(0).setEstatura(altura);
                System.out.print("Ingrese el peso: ");
                int peso=sc.nextInt();
                p3.get(0).setPeso(peso);
                System.out.print("Ingrese un color de piel: ");
                String color=sc.next();
                p3.get(0).setColor(color);
                System.out.print("Ingrese un color de pelo: ");
                String colorp=sc.next();
                p3.get(0).setPeloc(colorp);
                player.add(p3.get(0));
            }
        }
        if (op==4) {
            p4.add(new arquero());
            System.out.print("¿Desea crear con atributos por defecto?[S/N]: "); 
            r=sc.next().charAt(0);
            if (r=='s'||r=='S') {
                p4.get(0).setHp(150);
                p4.get(0).setAd(55);
                p4.get(0).setEficacia(85);
                p4.get(0).setCritic(60);
                p4.get(0).setSuerte(20);
                p4.get(0).setVelocidad(15);
                System.out.print("Ingrese el grito de batalla: ");
                String scream=sc.nextLine();
                scream=sc.nextLine();
                p4.get(0).setGrito(scream);
                System.out.print("Ingrese la edad: ");
                int edad=sc.nextInt();
                p4.get(0).setEdad(edad);
                System.out.print("Ingrese el nombre: ");
                String name=sc.nextLine();
                name=sc.nextLine();
                p4.get(0).setNombre(name);
                System.out.print("Ingrese la estatura: ");
                int altura=sc.nextInt();
                p4.get(0).setEstatura(altura);
                System.out.print("Ingrese el peso: ");
                int peso=sc.nextInt();
                p4.get(0).setPeso(peso);
                System.out.print("Ingrese un color de piel: ");
                String color=sc.next();
                p4.get(0).setColor(color);
                System.out.print("Ingrese un color de pelo: ");
                String colorp=sc.next();
                p4.get(0).setPeloc(colorp);
                player.add(p4.get(0));
            }else{
                System.out.print("Ingrese el HP: ");
                int hp=sc.nextInt();
                p4.get(0).setHp(hp);
                System.out.print("Ingrese el AD: ");
                int ad=sc.nextInt();
                p4.get(0).setAd(ad);
                System.out.print("Ingrese la eficacia: ");
                int eficacia=sc.nextInt();
                while (eficacia>=100||eficacia<=1) {
                    System.out.print("Error, número mayor o igual que 100 o menor o igual que 1, ingrese la eficacia otra vez: ");
                    eficacia=sc.nextInt();
                }
                p4.get(0).setEficacia(eficacia);
                System.out.print("Ingrese la probabilidad de criticos: ");
                int critic=sc.nextInt();
                while (critic>=100||critic<=1) {
                    System.out.print("Error, número mayor o igual que 100 o menor o igual que 1, ingrese la probabilidad otra vez: ");
                    critic=sc.nextInt();
                }
                p4.get(0).setCritic(critic);
                System.out.print("Ingrese la suerte: ");
                int suerte=sc.nextInt();
                p4.get(0).setSuerte(suerte);
                System.out.print("Ingrese la velocidad: ");
                int velocidad=sc.nextInt();
                p4.get(0).setVelocidad(velocidad);
                System.out.print("Ingrese el grito de batalla: ");
                String scream=sc.nextLine();
                scream=sc.nextLine();
                p4.get(0).setGrito(scream);
                System.out.print("Ingrese la edad: ");
                int edad=sc.nextInt();
                p4.get(0).setEdad(edad);
                System.out.print("Ingrese el nombre: ");
                String name=sc.nextLine();
                name=sc.nextLine();
                p4.get(0).setNombre(name);
                System.out.print("Ingrese la estatura: ");
                int altura=sc.nextInt();
                p4.get(0).setEstatura(altura);
                System.out.print("Ingrese el peso: ");
                int peso=sc.nextInt();
                p4.get(0).setPeso(peso);
                System.out.print("Ingrese un color de piel: ");
                String color=sc.next();
                p4.get(0).setColor(color);
                System.out.print("Ingrese un color de pelo: ");
                String colorp=sc.next();
                p4.get(0).setPeloc(colorp);
                player.add(p4.get(0));
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Sus atributos finales son: ");
        System.out.println(player);
        ArrayList<articulos> mochila=new ArrayList();
        mochila.add(new articulos("Frostmourne", 20, "raro"));
        mochila.add(new articulos("Talizman", 40, "usual"));
        mochila.add(new articulos("Corazon de ella", 30, "raro"));
        mochila.add(new articulos("Logo antiguo", 20, "inusual"));
        mochila.add(new articulos("Baston de merlín", 50, "raro"));
        mochila.add(new articulos("poción", 20, "usual"));
        mochila.add(new articulos("Agi stone", 20, "urual"));
        mochila.add(new articulos("Bufu stone", 20, "usual"));
        mochila.add(new articulos("Zio stone", 20, "usual"));
        mochila.add(new articulos("Megido stone", 20, "usual"));
        
        
    }
    
}
