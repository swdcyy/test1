package bcc.e;
import y8c.g;
import android.content.Context;
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
import ecc.n;
import ml8.c;

public class e extends g	// class@000444
{
    public Context w;

    public void e(Context p0){
       super();
       this.w = p0;
    }
    public f h1(ViewGroup p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return new f(a.a(this.w, 0x7f0d091e), new n());
    }
}
