class Hospital {
    String name;
    int age;
    String disease;
    int roomNo;
    double fee;

    public Hospital(String n, int a, String d, int r, double f){
        this.name = n;
        this.age = a;
        this.disease = d;
        this.roomNo = r;
        this.fee = f;
    }


    public void show_Info(){
        System.out.println("\n======Hospital Record======\n");
        System.out.println("Patient Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Disease : " + disease);
        System.out.println("Room No : " + roomNo);
        System.out.println("Fee : " + fee);
    }
    public void patient_Type(){
        if(age >= 20){
            System.out.println("Patient Type : Adult");
        }
        else if(age >= 13 && age <= 19 ){
            System.out.println("Patient Type : Teenager");
        }
        else{
            System.out.println("Patient Type : Child");
        }
    }
}
