package led.m;
import y8c.g;
import led.m$a;
import y8c.f$b;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import led.b;
import ml8.c;
import led.d;
import led.f;

public class m extends g	// class@001c29
{
    public m$a w;
    public boolean x;
    public boolean y;

    public void m(m$a p0,boolean p1,boolean p2){
       super();
       this.w = p0;
       this.x = p1;
       this.y = p2;
    }
    public f$b d1(f$b p0){
       return this.w;
    }
    public f h1(ViewGroup p0,int p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, om, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.y != null) {
          return new f(a.i(p0, 0x7f0d13d3), new b(this));
       }else if(this.x != null){
          return new f(a.i(p0, 0x7f0d13d2), new d(this));
       }else {
          return new f(a.i(p0, 0x7f0d145f), new f(this));
       }
    }
}
