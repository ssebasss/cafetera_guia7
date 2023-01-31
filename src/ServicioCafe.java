public class ServicioCafe {
    int capacidadMaxima;
    int cantidadActual;

    Cafetera cf= new Cafetera(1500,0);

    public void  llenarCafetera(){
    this.cantidadActual=this.capacidadMaxima;
}

public int servirTaza(int opcionServido) {
    if (opcionServido >= this.cantidadActual) {
       opcionServido=this.cantidadActual;
        System.out.println("se lleno con lo q habia!!!");
        //this.cantidadActual=0;
    }else {
        this.cantidadActual-=opcionServido;
        System.out.println("taza llena");
    }
    return opcionServido;
}

public void vaciarCafertera(){
    this.cantidadActual=0;
}




public void agregarCafe(int cafe){
    if (cafe+this.cantidadActual>=this.capacidadMaxima){
        this.cantidadActual=this.capacidadMaxima;
        System.out.println("la cafetera se lleno y sobro "+((cafe + this.cantidadActual) - this.capacidadMaxima));
    }else {
        this.cantidadActual+=cafe;
    }
}
















}
