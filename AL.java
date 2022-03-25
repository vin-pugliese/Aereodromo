public class AL extends A {

    /**
     * @param aero_efficiency
     * Descrive l'efficienza aereodinamica dell'aliante
     */
    private int aero_efficiency;

    public AL(){}

    public AL(String id_code, int aero_efficiency) {
        super(id_code);
        this.aero_efficiency = aero_efficiency;
    }


    //--------------------------------Getters & Setters
    /**
     *
     * @param aero_efficiency
     */
    public void setAero_efficiency(int aero_efficiency) {
        this.aero_efficiency = aero_efficiency;
    }
    /**
     *
     * @return
     */
    public int getAero_efficiency() {
        return aero_efficiency;
    }

    //--------------------------------equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AL aliante = (AL) o;
        return aero_efficiency == aliante.aero_efficiency;
    }

    //--------------------------------toString


    @Override
    public String toString() {
        return "Aliante{" +
                super.toString() +
                "aero_efficiency=" + aero_efficiency +
                '}';
    }

    //--------------------------------Metodo interfaccia CMP - Override metodo implementato da A
    @Override
    public boolean superiore(CMP x){
        if (x.equals(null)) return false;
        if (this.getClass() != x.getClass()) {
            System.out.println("Non sono lo stesso oggetto!");
            return false;
        }
        if (this.aero_efficiency > ((AL) x).getAero_efficiency()) {
            System.out.println("L'aliante A è più potente di B");
            return false;
        } else {
            System.out.println("L'aliante A è meno potente di B");
        }
        return true;
    }
}
