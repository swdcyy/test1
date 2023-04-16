package dz9.a0;
import lf5.d;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.content.Context;
import h4d.a;
import xx9.a;
import mf5.w0;

public final class a0 extends d	// class@002006
{
    public final m0 H;

    public void a0(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super();
       this.H = p0;
       a = p0.a;
       this.D = a;
       this.C = p0.c.mPhoto;
       this.F = a.d(a);
       this.G = a.b(this.D);
       p0 = p0.r;
       boolean b = true;
       if (p0 == null || p0.c() != b) {
          b = false;
       }
       this.E = b;
       int i = (this.F != null)? 0x7f080b27: 0x7f080b1a;
       this.L(i);
       i = (this.F != null)? 0x7f1047be: 0x7f1047bb;
       this.T(i);
       return;
    }
}
