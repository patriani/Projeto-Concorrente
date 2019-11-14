public abstract class ArquivoConcorrente{
    
    private String origem;
    private String destino;

    protected ArquivoConcorrente(){} // construtor default

    protected ArquivoConcorrente(String or, String dest){ // construtor 
        setOr(or);
        setDest(dest);
    }

    protected ArquivoConcorrente(String or){ // construtor 
        setOr(or);
    }

    public void setOr(String or){
        this.origem = or;
    }

    public void setDest(String dest){
        this.destino = dest;
    }

    public String getOr(){
        return origem;
    }
    
    public String getDest(){
        return destino;
    }

}
