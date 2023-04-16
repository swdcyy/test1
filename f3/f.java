package f3.f;
import android.animation.TypeEvaluator;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Math;

public class f implements TypeEvaluator	// class@001fc3
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public static f a(){
       return f.a;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       int i = p1.intValue();
       float f = (float)((i >> 24) & 0x00ff) / 0x437f0000;
       int i1 = p2.intValue();
       float f1 = (float)Math.pow((double)((float)((i >> 16) & 0x00ff) / 0x437f0000), 2.20f);
       float f2 = (float)Math.pow((double)((float)((i >> 8) & 0x00ff) / 0x437f0000), 2.20f);
       float f3 = (float)Math.pow((double)((float)(i & 0x00ff) / 0x437f0000), 2.20f);
       return Integer.valueOf(((((Math.round(((float)Math.pow((double)(f1 + (((float)Math.pow((double)((float)((i1 >> 16) & 0x00ff) / 0x437f0000), 2.20f) - f1) * p0)), 0x3fdd1745d1745d17) * 0x437f0000)) << 16) | (Math.round(((f + ((((float)((i1 >> 24) & 0x00ff) / 0x437f0000) - f) * p0)) * 0x437f0000)) << 24)) | (Math.round(((float)Math.pow((double)(f2 + (((float)Math.pow((double)((float)((i1 >> 8) & 0x00ff) / 0x437f0000), 2.20f) - f2) * p0)), 0x3fdd1745d1745d17) * 0x437f0000)) << 8)) | Math.round(((float)Math.pow((double)(f3 + (p0 * ((float)Math.pow((double)((float)(i1 & 0x00ff) / 0x437f0000), 2.20f) - f3))), 0x3fdd1745d1745d17) * 0x437f0000))));
    }
}
