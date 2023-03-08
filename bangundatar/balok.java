package bangundatar;
public class balok extends bangundatar {
    float panjang, lebar, tinggi;
    
    @Override
    float volume() {
      float volume = panjang*lebar*tinggi;
      System.out.println(panjang + " " + lebar + " " + tinggi);
        return volume;
    }
}
