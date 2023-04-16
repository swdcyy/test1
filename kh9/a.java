package kh9.a;
import qvb.f;
import kh9.a$a;
import nsd.u;
import k90.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import i90.a;
import i90.b;
import lnc.g7;
import cjd.e;
import erd.o;
import kh9.a$c;
import qvb.n0;

public final class a extends f	// class@002c8d
{
    public String p;
    public a$b q;
    public final a r;
    public static final a$a s;

    static {
       a.s = new a$a(null);
    }
    public void a(a p0){
       a.p(p0, "templateSearchData");
       super();
       this.r = p0;
    }
    public t I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.x(this.p)) {
          return objArray;
       }
       obj = this.p;
       t ot = PatchProxy.applyOneRefs(obj, objArray, h1.class, "31");
       if (ot != patchProxyRe) {
       }else {
          ot = b.a().f(g7.j(), 17, obj).map(new e());
       }
       return ot.map(new a$c(this));
    }
    public final void h2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "keyword");
       this.p = p0;
       this.invalidate();
       return;
    }
}
