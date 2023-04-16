package i71.a$f;
import java.lang.Runnable;
import asd.c;
import i71.a;
import i71.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i71.a$e;
import pz2.c;
import eg1.e;
import lp3.c;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import o63.m;
import java.lang.StringBuilder;
import java.lang.Exception;
import o63.m$a;
import kotlin.Result;

public final class a$f implements Runnable	// class@002849
{
    public final c b;
    public final a c;
    public final a$c d;
    public final Object e;

    public void a$f(c p0,a p1,a$c p2,Object p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       a$f uof;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, a$f.class, "1")) {
          return;
       }
       boolean b = false;
       try{
          this.c.g(e.class).o1(this.d.a(this.e));
          uof = 1;
       }catch(java.lang.Exception e3){
          b.I(LiveLogTag.LIVE_EFFECT, "LiveJsCmdMockEffectInfo: parse error", e3);
          this.b.resumeWith(Result.constructor-impl(m.g.c("parse error "+e3.getMessage())));
          uof = null;
       }
       if (uof) {
          this.b.resumeWith(Result.constructor-impl(m$a.g(m.g, objArray, b, 3, objArray)));
       }
       PatchProxy.onMethodExit(a$f.class, "1");
       return;
    }
}
