package b58.w;
import b58.q;
import b58.l;
import b58.m;
import brd.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b58.r;
import io.reactivex.i;
import b58.u;
import erd.o;
import brd.f0;
import b58.s;

public class w extends q	// class@000313
{
    public l a;

    public void w(l p0){
       super();
       this.a = p0;
    }
    public a0 a(m p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       w ow = w.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, ow, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a0 uoa0 = PatchProxy.applyOneRefs(p0, this, ow, "3");
       if (uoa0 != patchProxyRe) {
       }else {
          uoa0 = a0.k(new r(this, p0));
       }
       return uoa0.u(new u(this));
    }
    public f0 b(m p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new s(p0);
    }
}
