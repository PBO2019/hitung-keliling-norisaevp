public class KBjurSangkar {

    public static void main(String[] args) {
        BujurSangkar Ketupat = new BujurSangkar();
        Ketupat.Hitung();
    }
}

class BujurSangkar {

    public int s = 2;
    public int KelilingBujurSangkar;




    public void Hitung (){
        KelilingBujurSangkar =  4 * s ;
        System.out.println(" Jadi Keliling Bujur Sangkar Adalah " + KelilingBujurSangkar + " cm");
    }
}
