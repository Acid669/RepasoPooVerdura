public class Verdura {

    //Atributos
    private String id;
    private String nombre;
    private String color;
    private String calorias;
    private String debeCocinarse;


    //Constructores

    //Constructor Null
    public Verdura() {
    }


    //Constructor con atributos
    public Verdura(String id, String nombre, String color, String calorias, String debeCocinarse) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.debeCocinarse = debeCocinarse;
    }

    //Getters y Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    public String getDebeCocinarse() {
        return debeCocinarse;
    }

    public void setDebeCocinarse(String debeCocinarse) {
        this.debeCocinarse = debeCocinarse;
    }

    public String imprimir() {
        return
                "**********************************" + '\n'+
                "Verdura: " +
                "Nombre: " + nombre + '\n' +
                "Calorias: " + calorias + '\n' +
                "**********************************";
    }
}
