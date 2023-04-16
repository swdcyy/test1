package fka.a;
import fka.f;
import lnc.s5;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.ref.WeakReference;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class a extends f	// class@00295d
{
    public WeakReference h;
    public final int i;

    public void a(s5 p0,int p1){
       super(0, 0, p0.getClass().getSimpleName());
       this.h = new WeakReference(p0);
       this.i = p1;
    }
    public int b(){
       s5 obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h.get();
       int i = 0;
       if (obj != null) {
          int i1 = obj.Ab();
          if (i1 > 0) {
             i = i1;
          }else {
             int i2 = obj.f();
             if (i2 > 0) {
                i = i2;
             }
          }
       }
       return i;
    }
    public s5 e(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.get();
    }
}
