import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        //creo las var a usar
        int option=1;
        int suma,resta,multi,num2,num,resante=0;
        double dividir=0;//en a var res antes voy a guardar el ultimo resultado

        while (option!=0) {
            System.out.println("Que quiere hacer?");
            System.out.println("1)Sumar");
            System.out.println("2)Restar");
            System.out.println("3)multiplicar");
            System.out.println("4)dividir");
            System.out.println("0)para salir");
            option= leer.nextInt();
                //segun la opcion del usuario suma, resta, multiplica, divide los numeros
                if (option == 1) {
                    if (resante==0) {
                        System.out.println("ingresar 2 numeros");
                        num= leer.nextInt();
                        num2= leer.nextInt();
                        suma = num + num2;
                        System.out.println("resultado: " + suma);
                        resante=suma;
                    }else{
                        System.out.println("ingresar un numero para sumar a "+resante);
                        num= leer.nextInt();
                        suma = num + resante;
                        System.out.println("resultado: " + suma);
                        resante=suma;
                    }
                } else if (option == 2) {
                    if (resante==0) {
                        System.out.println("ingresar 2 numeros");
                        num= leer.nextInt();
                        num2= leer.nextInt();
                        resta = num - num2;
                        resante=resta;
                        System.out.println("resultado: " + resta);
                    }else{
                        System.out.println("ingresar un numero para restar a "+resante);
                        num= leer.nextInt();
                        resta = resante-num;
                        System.out.println("resultado: " + resta);

                    }
                } else if (option == 3) {
                    if(resante==0){
                        System.out.println("ingresar 2 numeros");
                        num= leer.nextInt();
                        num2= leer.nextInt();
                        multi = num * num2;
                        System.out.println("resultado: " + multi);
                        resante=multi;
                    }else{
                        System.out.println("ingresar un numero para multiplicar a "+resante);
                        num= leer.nextInt();
                        multi = num * resante;
                        System.out.println("resultado: " + multi);
                        resante=multi;
                    }

                } else if (option == 4) {
                    if(resante==0){
                        System.out.println("ingresar 2 numeros");
                        num= leer.nextInt();
                        num2= leer.nextInt();
                        if (num==0 || num2==0) {
                            System.out.println("error no dividir por 0");
                        }else {dividir = num / num2;
                            System.out.println("resultado: " + dividir);
                            resante=num/num2;
                        }
                    }else{
                        System.out.println("ingresar un numero para dividir a "+resante);
                        num= leer.nextInt();
                        if (num==0 || resante ==0) {
                            System.out.println("error no dividir por 0");
                        }else {
                            dividir = num / resante;
                            System.out.println("resultado: " + dividir);
                            resante = num / resante;
                        }
                    }

                    }else {
                    System.out.println("Opcion Erronea");
                    }
                }

        }
        }



        }
