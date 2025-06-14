public abstract class MaterialBibliografico {
    private String codigo;
    private String titulo;
    private String autor;

    public MaterialBibliografico(String codigo,String titulo,String autor){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setCodigo(String  codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }

    public abstract void mostrarInformacion();
    public abstract void gestionarPrestamo();
    //public abstract void agregarMaterial();
    //public abstract void eliminarMaterial();

}
