package bangundatar;

public class kubus extends bangundatar {
    float sisi;

    @Override
    float volume() {
        float volume = sisi * sisi *sisi;
        return volume;
    }
}
