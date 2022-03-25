import java.util.Objects;

public abstract class A implements CMP{

    private String id_code;

    public A(){}

    public A(String id_code){
        this.id_code = id_code;
    }

   //--------------------------------Getters & Setters
    /**
     *
     * @param id_code
     */
    public void setId_code(String id_code) {
        this.id_code = id_code;
    }
    /**
     *
     * @return
     */
    public String getId_code() {
        return id_code;
    }

    //--------------------------------Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A that = (A) o;
        return Objects.equals(id_code, that.id_code);
    }

    //--------------------------------toString
    @Override
    public String toString() {
        return "Aeromobile{" +
                "id_code='" + id_code + '\'' +
                '}';
    }

    //--------------------------------Metodo interfaccia CMP
    @Override
    public boolean superiore(CMP x) {
        if (x.equals(null)) return false;
        if (this.getClass() != x.getClass()) return false;
        if (!(this.id_code== ((A) x).getId_code())) return false;
        return true;
    }
}
