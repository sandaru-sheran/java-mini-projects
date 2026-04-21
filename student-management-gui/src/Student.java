


    public class Student {
        private String id;
        private String name;
        private int prf;
        private int dbms;
        
        
    public Student (){
        
    }
    
    public Student (String id,String name, int prf, int dbms){
        this.id = id;
        this.name = name;
        this.prf = prf;
        this.dbms = dbms;
    };

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the prf
     */
    public int getPrf() {
        return prf;
    }

    /**
     * @param prf the prf to set
     */
    public void setPrf(int prf) {
        this.prf = prf;
    }

    /**
     * @return the dbms
     */
    public int getDbms() {
        return dbms;
    }

    /**
     * @param dbms the dbms to set
     */
    public void setDbms(int dbms) {
        this.dbms = dbms;
    }
    
}
