package lg.f;
import java.lang.Float;

public class f	// class@002555
{

    public static long a(float p0,float p1){
       return ((long)Float.floatToRawIntBits(p1) | ((long)Float.floatToRawIntBits(p0) << 32));
    }
    public static long b(int p0,int p1){
       return f.a((float)p0, (float)p1);
    }
}
