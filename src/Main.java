import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        persona persona1=new persona();
        persona persona2=new persona();

        persona1.setNombre("juan");
        persona1.setEdad(44);
        persona1.setTelefono(32132133);

        persona2.setNombre("Antonio");
        persona2.setEdad(33);
        persona2.setTelefono(43243243);

        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Telefono: "+persona1.getTelefono());

        System.out.println("Nombre: "+persona2.getNombre());
        System.out.println("Edad: "+persona2.getEdad());
        System.out.println("Telefono: "+persona2.getTelefono());


    }
}
class persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

}
