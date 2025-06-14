public class Libro extends MaterialBibliografico implements Prestable  {
    private int nHojas;
    private String editorial;

    public Libro(String codigo,String titulo,String autor,int nHojas,String editorial){
        super(codigo,titulo,autor);
    }

   @Override
   public void mostrarInformacion(){
       System.out.println("--------Información del Libro----------");
       System.out.println("Libro: "+this.getTitulo());
       System.out.println("Codigo : "+this.getCodigo());
       System.out.println("Autor: "+this.getAutor());
       System.out.println("N° de hojas: "+this.nHojas);
       System.out.println("Editorial: "+this.editorial);
   }

    @Override
    public void gestionarPrestamo() {

    }

    @Override
    public void prestar(){

    }
    @Override
    public void devolver(){

    }


}
