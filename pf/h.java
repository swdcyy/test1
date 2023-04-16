package pf.h;
import xb.t$a;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.lang.Math;

public class h extends t$a	// class@002922
{
    public static final t$b l;

    static {
       h.l = new h();
    }
    public void h(){
       super();
    }
    public void b(Matrix p0,Rect p1,int p2,int p3,float p4,float p5,float p6,float p7){
       if (PatchProxy.isSupport(h.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6),Float.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, h.class, "1")) {
             return;
          }
       }
       p0.setScale(Math.min(Math.min(p6, p7), 0x3f800000), Math.min(Math.min(p6, p7), 0x3f800000));
       p0.postTranslate((float)(int)((float)p1.left + 0x3f000000), (float)(int)((float)p1.top + 0x3f000000));
       return;
    }
    public String toString(){
       return "start_inside";
    }
}
