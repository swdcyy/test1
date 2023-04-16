package fu2.a;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class a	// class@0029e3
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Rect a(int p0,int p1,float p2){
       Rect obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Rect();
       float f = (float)p0;
       float f1 = (float)p1;
       if (p2 - (f / f1) > 0) {
          obj.left = 0;
          obj.right = p0;
          f = f / p2;
          p0 = (int)((f1 - f) / (float)2);
          obj.top = p0;
          obj.bottom = (int)((float)p0 + f);
       }else {
          obj.top = 0;
          obj.bottom = p1;
          f1 = f1 * p2;
          p0 = (int)((f - f1) / (float)2);
          obj.left = p0;
          obj.right = (int)((float)p0 + f1);
       }
       return obj;
    }
    public final int b(int p0,int p1,float p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.a(p0, p1, p2).width();
    }
}
