public class Revista extends MaterialBibliografico implements Prestable {
   private int nEdicion;
   private String editorial;

   public Revista(String codigo, String titulo,String autor,int nEdicion,String editorial){

       super(codigo,titulo,autor);
       this.nEdicion = nEdicion;
       this.editorial = editorial;

   }
   public void setnEdicion(int nEdicion){
       this.nEdicion = nEdicion;
       this.editorial = editorial;
   }
   public int getnEdicion(){
       return this.nEdicion;
   }
   public void setEditorial (String editorial){
       this.editorial = editorial;
   }
   public String getEditorial(){
       return this.editorial;
   }

    @Override
    public void mostrarInformacion() {
        System.out.println("------Información de Revista-----------");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Autor: "+getAutor());
        System.out.println("N° de edición: "+this.nEdicion);
        System.out.println("Editorial:"+this.editorial);

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
