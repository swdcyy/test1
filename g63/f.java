package g63.f;
import xb.t$a;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;

public class f extends t$a	// class@002a81
{
    public static final t$b l;

    static {
       f.l = new f();
    }
    public void f(){
       super();
    }
    public void b(Matrix p0,Rect p1,int p2,int p3,float p4,float p5,float p6,float p7){
       float f;
       if (PatchProxy.isSupport(f.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6),Float.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
             return;
          }
       }
       f = (float)p1.top;
       if (p7 - p6 > 0) {
          p5 = (float)p1.left + (((float)p1.width() - ((float)p2 * p7)) * 0x3f000000);
          p6 = p7;
       }else {
          p5 = (float)p1.left;
       }
       p0.setScale(p6, p6);
       p0.postTranslate((float)(int)(p5 + 0x3f000000), (float)(int)(f + 0x3f000000));
       return;
    }
}
