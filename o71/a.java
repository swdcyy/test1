package o71.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import o71.a$a;
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
import ps1.a;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import o71.b;
import lp3.c;
import vt1.a;
import vt1.c;
import java.lang.Integer;
import hd2.k0;
import o71.c;
import wd2.c;
import csd.b;
import dsd.e;
import lp3.e;

public final class a extends AbstractLiveJsCommand	// class@00349d
{
    public final int e;
    public final int f;
    public c g;

    public void a(){
       super();
       this.e = 1;
       this.f = -1;
    }
    public Class a(){
       return a$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof a$a) {
          return m.g.c("invalid params");
       }
       f.c("bridge", "acceptPKInvitation", p0.a());
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       a uoa = a.class;
       if (!PatchProxy.applyVoidTwoRefs(p0, oh, this, a.class, "2")) {
          if (a.g(p0.isMultiPk, Boolean.TRUE)) {
             this.m();
             b uob = new b(this, oh);
             this.g = uob;
             this.g(uoa).Va().d(uob);
             uoa = this.g(uoa).Va();
             a$a targetUserId = p0.targetUserId;
             if (targetUserId == null) {
                targetUserId = "";
             }
             a$a mediaType = p0.mediaType;
             int i = (mediaType != null)? mediaType.intValue(): 2;
             uoa.a(targetUserId, i, p0.a());
          }else {
             this.g(k0.class).jo(p0.pkId, new c(oh));
          }
       }
       p0 = oh.b();
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (!this.h().b()) {
          a tg = this.g;
          if (tg != null) {
             this.g(a.class).Va().b(tg);
          }
       }
       return;
    }
}
