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
public class Information{
    public static void main(String[] args){
        double totalEarnings = 0;

        Emergency_Patient[] Patients = new Emergency_Patient[5];
        Patients[0] = new Emergency_Patient("Hibba Iqbal" , 19 , "Fever" , 10 , 700, false);
        Patients[1] = new Emergency_Patient("Arooba Arshad" , 19, "Common Cold" , 10 , 300 , false);
        Patients[2] = new Emergency_Patient("Umima Afsha" ,20 , "Hand Sprain" , 17 , 1200 , true);
        Patients[3] = new Emergency_Patient("Kashaf Kamboh" , 20 , "Influenza" , 12 , 500 , false);
        Patients[4] = new Emergency_Patient("Fiza" , 21 ,"Gastroenteritis" , 12 , 1000 , true);

        for(int i = 0; i < 5 ; i++) {

            Patients[i].show_Info();
            Patients[i].patient_Type();

            if(Patients[i].fee > 500){
                System.out.println("Expensive Treatment");
            }
            else{
                System.out.println("Reasonable Treatment");
            }
            Patients[i].checkEmergency();

            totalEarnings += Patients[i].fee;

            System.out.println("\n============================\n");


        }
        System.out.println("Total Hospital Earnings : " + totalEarnings);
    }
}
