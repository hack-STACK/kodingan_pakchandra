package bangundatar;

public class bola extends bangundatar{
    float r;
    @Override
    float volume() {
        float volume = (float) (4/3*Math.PI*r*r*r);
        return volume;
    }
}
