public class Biblioteca {
    private Libro[] libros;
    private int contL;
    private Revista[] revistas;
    private int contR;
    private DVD[] dvds;
    private int conD;
    private String nombre;


    public Biblioteca(String nombre){
        libros = new Libro[10];
        revistas = new Revista[10];
        dvds = new DVD[10];
        this.contL=0;
        this.contR=0;
        this.conD=0;
        this.nombre = nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void AgregarRevista(Revista rv){
        if(this.contR>=10){
            System.out.println("No hay espacio");
            return;
        }
        for(int i=0;i<contR;i++){
            if(this.revistas[i].getCodigo().equals(rv.getCodigo())){
                System.out.println("Ya existe");
                return;
            }
        }
        this.revistas[contR]=rv;
        this.contR++;
        System.out.println("Se agrego");

    }

    public void agregarLibro(Libro lb){
        if(this.contL>=10){
            System.out.println("No hay espacio");
            return;
        }
        for(int i=0;i<contL;i++){
            if(this.libros[i].getCodigo().equals(lb.getCodigo())){
                System.out.println("Ya existe");
                return;
            }
        }
    }
    public void agregarrevista(Revista rv){
        if(this.contR>=10){
            System.out.println("No hay espacio");
            return;
        }
        for(int i=0;i<contR;i++){
            if(this.revistas[i].getCodigo().equals(rv.getCodigo())){
                System.out.println("Ya existe");
                return;
            }
        }
        if(rv instanceof Revista){
            this.revistas[contR]=(Revista) rv;
            contR++;
            System.out.println("Se agrego la revista");

        }else{
            System.out.println("Esta Revista no existe");
        }

    }
    public void AgregarDVD(DVD dv){
        if(this.conD>=10){
            System.out.println("No hay espacio");
            return;
        }
        for(int i=0;i<contR;i++){
            if(this.dvds[i].getCodigo().equals(dv.getCodigo())){
            System.out.println("Ya existe");
            return;}
        }

    }

    //metodos para eliminar por categoria
    public void eliminarL(String el){
        if(contL==0){
            System.out.println("No hay nada que eliminar");
            return;
        }
        for(int i=0;i<contL;i++){
            if (this.libros[i].getCodigo().equals(el)){
                for(int j=i;j<contL;j++){
                    this.libros[j]=this.libros[j+1];
                }
                this.libros[contL-1]=null;
                this.contL--;
                System.out.println("Se elimino el Libro");
                return;
            }
        }
        System.out.println("No existe");
    }
    public void eliminarR(String er){
        if(contR==0){
            System.out.println("No hay nada que eliminar");
            return;
        }
        for(int i=0;i<contR;i++){
            if(this.revistas[i].getCodigo().equals(er)){
                for(int j=i;j<contL;j++){
                    this.revistas[j]=this.revistas[j+1];
                }
                this.revistas[contR-1]=null;
                this.contR--;
                System.out.println("Se elimino la revista");
                return;
            }
        }
        System.out.println("No existe");
    }
    public void eliminarD(String ed){
        if(conD==0){
            System.out.println("No hay nada que eliminar");
            return;
        }
        for(int i=0;i<conD;i++){
            if(this.dvds[i].getCodigo().equals(ed)){
                for(int j=i;j<conD;j++){
                    this.dvds[j]=this.dvds[j+1];
                }
                this.revistas[conD-1]=null;
                this.conD--;
                System.out.println("Se elimino el DVD");
                return;
            }
        }
        System.out.println("No existe");
    }
    //Metodos para Buscar por categoria
    public void buscarL(String cL){
        if(this.contL==0){
            System.out.println("No hay libros que buscar");

        }
        for(int i=0;i<contL;i++){
            if(libros[i].getCodigo().equals(cL)){
                this.libros[i].mostrarInformacion();
            }
        }

    }
    public void buscarR(String cR){
        if(this.contR==0) {
            System.out.println("No hay Revistas que buscar ");
        }
        for(int i=0;i<contR;i++){
            if(revistas[i].getCodigo().equals(cR)){
                this.revistas[i].mostrarInformacion();
            }
        }

    }
    public void buscarD(String cD){
        if(this.conD==0){
            System.out.println("No hay DVDs que buscar");
        }
        for(int i=0;i<conD;i++){
            if(dvds[i].getCodigo().equals(cD)){
                this.dvds[i].mostrarInformacion();
            }
        }
    }


    //Metodos para listar por categoria

    public void listarLibros(){
        if(this.contL==0){
            System.out.println("No hay nada");
            return;
        }
        System.out.println("Listado de libros:");
        for(int i=0;i<contL;i++){
            libros[i].mostrarInformacion();

        }
        System.out.println("No existe");
    }
    public void ListarRevistas(){
        if (this.contR == 0) {
            System.out.println("No hay nada");
            return;
        }
        System.out.println("Listado de libros:");
        for(int i=0;i<contR;i++){
            revistas[i].mostrarInformacion();
        }
        System.out.println("No existe");
    }
    public void listarDVDs(){
        if(this.contL==0){
            System.out.println("No hay nada");
            return;
        }
        System.out.println("Listado de DVDs");
        for(int i=0;i<conD;i++){
            dvds[i].mostrarInformacion();
        }
        System.out.println("No existe");

    }
    //Metodo para contar el total del material almacenado en la
    //biblioteca

    public void totalMateriales(){
        System.out.println("Total: "+(contL+contR+conD));
        System.out.println("Libros: "+contL);
        System.out.println("Revistas: "+contR);
        System.out.println("DVDs: "+contR);

    }

}
