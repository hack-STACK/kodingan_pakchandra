package bangundatar;

public class tabung extends bangundatar{
    float r, tinggi;

    @Override
    float volume() {
        float volume = (float) (Math.PI * r * tinggi);
        return volume;
    }
}
