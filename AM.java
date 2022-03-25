public class AM extends A {

    /**
     * @param potenza
     * descrive la potenza in cv dell'aereo
     */
    private double potenza;

    public AM(){}

    public AM(String id_code, double potenza) {
        super(id_code);
        this.potenza = potenza;
    }

    //--------------------------------Getters & Setters
    /**
     *
     * @param potenza
     */
    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }
    /**
     *
     * @return
     */
    public double getPotenza() {
        return potenza;
    }

    //--------------------------------equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AM that = (AM) o;
        return Double.compare(that.potenza, potenza) == 0;
    }

    //--------------------------------toString
    @Override
    public String toString() {
        return "AereoMotore{" +
                super.toString() +
                "potenza=" + potenza +
                '}';
    }

    //--------------------------------Metodo interfaccia CMP - Override metodo implementato da A
    @Override
    public boolean superiore(CMP x){
        if (x.equals(null)) return false;
        if (this.getClass() != x.getClass()){
            System.out.println("Non sono lo stesso oggetto!");
            return false;
        }
        if (this.potenza > ((AM) x).getPotenza()) {
            System.out.println("L'aereomotore A è più potente di B");
            return false;
        } else {
            System.out.println("L'aereomotore A è meno potente di B");
        }
        return true;
    }
}
