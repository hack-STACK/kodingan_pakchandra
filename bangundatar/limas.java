package bangundatar;

public class limas extends bangundatar {
    float luasalas1, luasalas2, tinggi;

    @Override
    float volume() {
        float volume = (float) 1/3* (luasalas1*luasalas2*tinggi);
        return volume;
    }
}
