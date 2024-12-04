import java.util.Scanner;

public class calculadora {
//Método para preguntar la operación al usuario
    public int operask(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("¿Que operación desea realizar?\n1-Suma\n2-Resta\n3-Multiplicación\n4-División\n");
        int oper = sc.nextInt();
        return oper;
    }

    public float suma(float n1, float n2){
        float result = n1+n2;
        return result;
    }

    public float multi(float n1, float n2){
        float result = n1*n2;
        return result;
    }

    public float rest(float n1, float n2){
        float result = n1-n2;
        return result;
    }

    public float div(float n1, float n2){
        float result=0; 
        if(n2==0)
            return 0;
        else
            result = n1/n2;
        
        return result;
    } 
     
    public void calc(){
        Scanner sc = new Scanner(System.in);
        boolean fin=false;
        int rep=0;
        float num1=0;
        float num2=0;
        do {
            int oper= operask();
            System.out.println("Introduce el primer número: ");
            num1=sc.nextFloat();
            System.out.println("Introduce el segundo número: ");
            num2=sc.nextFloat();
            if (oper==1) {
                System.out.println("El resultado es: "+suma(num1, num2));
            }else if (oper==2) {
                System.out.println("El resultado es: "+rest(num1, num2));
            }else if (oper==3) {
                System.out.println("El resultado es: "+multi(num1, num2));
            }else if (oper==4) {
                System.out.println("El resultado es: "+div(num1, num2));
            }else{
                System.out.println("Hubo un error en la selección de la operación");
            }    
            sc.nextLine();
            System.out.println("Pulse ENTER para continuar...");
            sc.nextLine();
            System.out.printf("1-Realizar otro cálculo\n2-Salir de la calculadora\n");
            rep=sc.nextInt();
            if (rep==2) {
                fin=true;
            }
            
        } while (fin==false);
        
    }
    
}
