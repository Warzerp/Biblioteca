public class DVD extends MaterialBibliografico implements Prestable{
    private int duracion;
    private String formato;

    public DVD(String codigo,String titulo,String autor, int duracion,String formato){

        super(codigo,titulo,autor);
        this.duracion = duracion;
        this.formato = formato;

    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    public int getDuracion(){
        return this.duracion;
    }
    public void setFormato(String formato){
        this.formato = formato;
    }
    public String getFormato(){
        return this.formato;
    }
   @Override
    public void mostrarInformacion(){
       System.out.println("---------Información del DVD-------------");
       System.out.println("Autor: "+getCodigo());
       System.out.println("Titulo: "+getTitulo());
       System.out.println("Autor: "+getAutor());
       System.out.println("duracion: "+this.duracion);
       System.out.println("Formato: "+this.formato);
   }
   @Override
    public void gestionarPrestamo(){

   }

   @Override
    public void prestar(){

   }

   @Override
    public void devolver(){

   }



}
