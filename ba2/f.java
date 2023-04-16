package ba2.f;
import y8c.g;
import p91.m;
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
import ba2.f$a;
import ml8.c;

public class f extends g	// class@000390
{
    public int A;
    public String B;
    public m w;
    public int x;
    public int y;
    public String z;

    public void f(m p0){
       super();
       this.w = p0;
    }
    public f h1(ViewGroup p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.k(p0, 0x7f0d0afb, false), new f$a(this));
    }
}
