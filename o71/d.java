package o71.d;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import o71.d$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import hd2.f;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ps1.a;
import lp3.c;
import vt1.a;
import kotlin.Result;
import hd2.k0;
import o71.e;
import wd2.r;
import csd.b;
import dsd.e;

public final class d extends AbstractLiveJsCommand	// class@0034a1
{

    public void d(){
       super();
    }
    public Class a(){
       return d$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof d$a) {
          return m.g.c("invalid params");
       }
       f.c("bridge", "rejectPKInvitation", p0.a());
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       if (!PatchProxy.applyVoidTwoRefs(p0, oh, this, d.class, "2")) {
          if (a.g(p0.isMultiPk, Boolean.TRUE)) {
             a uoa = this.g(a.class).Va();
             d$a targetUserId = p0.targetUserId;
             if (targetUserId == null) {
                targetUserId = "";
             }
             uoa.reject(targetUserId, p0.a());
             oh.resumeWith(Result.constructor-impl(m$a.g(m.g, null, false, 3, null)));
          }else {
             this.g(k0.class).Ab(p0.pkId, new e(oh));
          }
       }
       p0 = oh.b();
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
}
