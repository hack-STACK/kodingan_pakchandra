package bangundatar;

public class kerucut extends bangundatar{
    float r, tinggi;

    @Override
    float volume() {
        float volume = (float) (1/3*Math.PI*r*r*tinggi);
        return volume;
    }
}
