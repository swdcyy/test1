package ekd.r$a;
import android.animation.TypeEvaluator;
import java.lang.Object;
import java.lang.Integer;

public class r$a implements TypeEvaluator	// class@000d72
{
    public static final r$a a;

    static {
       r$a.a = new r$a();
    }
    public void r$a(){
       super();
    }
    public static r$a a(){
       return r$a.a;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       int i = p1.intValue();
       int i1 = (i >> 24) & 0x00ff;
       int i2 = (i >> 16) & 0x00ff;
       int i3 = (i >> 8) & 0x00ff;
       i = i & 0x00ff;
       int i4 = p2.intValue();
       return Integer.valueOf((((((i1 + (int)((float)(((i4 >> 24) & 0x00ff) - i1) * p0)) << 24) | ((i2 + (int)((float)(((i4 >> 16) & 0x00ff) - i2) * p0)) << 16)) | ((i3 + (int)((float)(((i4 >> 8) & 0x00ff) - i3) * p0)) << 8)) | (i + (int)(p0 * (float)((i4 & 0x00ff) - i)))));
    }
}
