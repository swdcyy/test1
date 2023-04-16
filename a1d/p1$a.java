package a1d.p1$a;
import y8c.g;
import a1d.p1;
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
import a1d.h0;
import w0d.g;
import mrd.c;
import ml8.c;

public class p1$a extends g	// class@000047
{
    public final p1 w;

    public void p1$a(p1 p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       p1$a uoa = p1$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p1$a tw = this.w;
       return new f(a.i(p0, 0x7f0d00e1), new h0(this, tw.s, tw.t));
    }
}
