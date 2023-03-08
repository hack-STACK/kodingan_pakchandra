package bangundatar;

public class prisma extends bangundatar{
    float alas, tinggi;

    @Override
    float volume() {
        float volume = 1/3 * ( alas * tinggi);
        return volume;
    }
}
