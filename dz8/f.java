package dz8.f;
import y8c.g;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dz8.a;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.view.View;
import i2b.a;
import dz8.g;
import ml8.c;

public final class f extends g	// class@00210a
{
    public int w;
    public int x;

    public void f(){
       super(0, 0);
    }
    public void f(int p0,int p1){
       super();
       this.w = p0;
       this.x = p1;
    }
    public f$b d1(f$b p0){
       p0 = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a uoa = new a();
       uoa.h = this.w;
       uoa.i = this.x;
       return uoa;
    }
    public f h1(ViewGroup p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d05a4), new g());
    }
}
