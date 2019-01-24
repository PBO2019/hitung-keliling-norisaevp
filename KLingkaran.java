public class KLingkaran {

        public static void main(String[] args) {
            Lingkaran Bulat = new Lingkaran ();
            Bulat.Hitung();
        }
    }

    class Lingkaran {

        public double phi = 3.14;
        public double jari = 2 ;
        public double KelilingLingkaran;




        public void Hitung (){
            KelilingLingkaran =  2 * phi * jari  ;
            System.out.println(" Jadi Keliling Lingkaran Adalah " + KelilingLingkaran + " cm");
        }
    }