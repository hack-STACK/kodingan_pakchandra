package alatmusikpoly;

public class main {
    public class Alatmusik{
        public void Mainkan(){

        }
    }
    public class Piano extends Alatmusik{
        public void Mainkan(){
            System.out.println("mainkan piano");
        }
    }
    public class Biola extends Alatmusik{
        public void Mainkan(){
            System.out.println("mainkan biola");
        }
    }
    public class Gitar extends Alatmusik{
        public void Mainkan(){
            System.out.println("mainkan gitar");
        }
    }
    public class Drum extends Alatmusik{
        public void mainkan(){
            System.out.println("mainkan drum");
        }
    }
    public class Saxophone extends Alatmusik{
        public void Mainkan(){
            System.out.println("mainkan saxophone");
        }
    }
    public class Trumpet extends Alatmusik{
        public void Mainkan(){
            System.out.println("mainkan trumpet");
        }
    }



    public static void main(String[] args) {
        main objMain = new main();
        Alatmusik daftar_alat_musik [] = {objMain.new Piano(),objMain. new Biola(),objMain.new Drum(), objMain.new Gitar(), objMain.new Piano(),objMain.new Saxophone(), objMain.new Trumpet()};
        for(Alatmusik alat_musik : daftar_alat_musik){
            alat_musik.Mainkan();
        }
    }

}
