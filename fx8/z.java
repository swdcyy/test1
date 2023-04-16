package fx8.z;
import fx8.b;
import fx8.t;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import fx8.n0;
import ml8.c;

public class z extends b	// class@00239b
{
    public t y;

    public void z(t p0){
       super();
       this.y = p0;
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oz, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.y};
       return j.a(obj);
    }
    public f s1(ViewGroup p0,int p1){
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oz, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d1500), new n0());
    }
}
