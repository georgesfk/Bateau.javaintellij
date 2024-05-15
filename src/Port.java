public class Port {
    private String nom_port;

    public Port (String nomport){
        this.nom_port = nomport;
    }
    public String getPort(){
        return this.nom_port;
    }

    public void acceuilVaisseau(Amarable v){
        System.out.println("Il faut "+ v.nbcordes()+ " cordes");


    }

}
