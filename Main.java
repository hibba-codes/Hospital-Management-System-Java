public class Information{
    public static void main(String[] args){
        double totalEarnings = 0;

        Emergency_Patient[] Patients = new Emergency_Patient[5];
        Patients[0] = new Emergency_Patient("Hibba Iqbal" , 19 , "Fever" , 10 , 700, false);
        Patients[1] = new Emergency_Patient("Arooba Arshad" , 19, "Common Cold" ,10 , 300 ,false);
        Patients[2] = new Emergency_Patient("Umima Afsha" ,20 , "Hand Sprain" , 17, 1200,true);
        Patients[3] = new Emergency_Patient("Kashaf Kamboh" , 20 , "Influenza" , 12, 500,false);
        Patients[4] = new Emergency_Patient("Fiza" , 21 ,"Gastroenteritis" , 12, 1000,true);

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
