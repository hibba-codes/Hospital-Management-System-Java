class Emergency_Patient extends Hospital {
    boolean ambulanceRequired;

    public Emergency_Patient(String n, int a, String d, int r, double f,boolean ambulanceRequired){
        super(n,a,d,r,f);
        this.ambulanceRequired = ambulanceRequired;
    }
    public void checkEmergency(){
        if(ambulanceRequired){
            System.out.println("Emergency Service Required");
        }
        else{
            System.out.println("No Emergency Service");
        }
    }
}
