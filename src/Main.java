public class Main {
    public static void main(String[] args) {

        Verdura [] verduras = new Verdura[5];

        verduras[0] = new Verdura(1,"Judía","Verde",0.75,"Si");
        verduras[1] = new Verdura(2,"Zanahoria","Naranja",1.60,"No");
        verduras[2] = new Verdura(3,"Pimiento","Rojo",0.50,"No");
        verduras[3] = new Verdura(4,"Patata","Amarillo",2.20,"Si");
        verduras[4] = new Verdura(5,"Brocoli","Verde",0.10,"Si");

        for (int i=0; i< verduras.length;i++){
            System.out.println("El nombre de la verdura es: "+verduras[i].getNombre()+" y sus calorias son: "+verduras[i].getCalorias());
        }

        //Cambiamos valores de dos verduras

        verduras[0].setNombre("Cebolla");
        verduras[0].setColor("Blanco");
        verduras[0].setCalorias(1.25);
        verduras[0].setDebeCocinarse("No");

        verduras[1].setNombre("Maíz");
        verduras[1].setColor("Amarillo");
        verduras[1].setCalorias(3.40);
        verduras[1].setDebeCocinarse("No");

        System.out.println("El listado con las veruras cambiadas es: ");

        for (int i=0; i< verduras.length;i++){
            System.out.println("El nombre de la verdura es: "+verduras[i].getNombre()+" y sus calorias son: "+verduras[i].getCalorias());
        }

        //Mostramos solo las verdes
        boolean noHay = false;
        System.out.println("Las verduras de color verde son: ");
        for (int i=0; i< verduras.length;i++){
            if(verduras[i].getColor().equals("Verde")){
                System.out.println("El nombre de la verdura es: "+verduras[i].getNombre()+" y sus calorias son: "+verduras[i].getCalorias());
                noHay=true;
            }
        }
        if(noHay==false){
            System.out.println("No hay verduras de color verde.");
        }
    }


}


