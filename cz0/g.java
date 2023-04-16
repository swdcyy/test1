package cz0.g;
import cz0.b;
import java.lang.Object;
import bz0.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import mm1.c;
import ht5.b;
import t02.a0;
import brd.t;
import cz0.d;
import cz0.g$a;
import erd.g;
import crd.b;
import cz0.a;
import kj1.c;
import kj1.b;
import com.yxcorp.gifshow.models.Gift;
import p91.m;
import fg6.a;
import com.google.gson.Gson;
import i12.a;
import cz0.e;
import cjd.e;
import erd.o;
import cz0.f;

public class g implements b	// class@001ec8
{

    public void g(){
       super();
    }
    public boolean a(e p0){
       g og = g.class;
       LiveSendGiftTraceInfo obj = PatchProxy.applyOneRefs(p0, this, og, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, og, "2")) {
          e b = p0.b;
          e a = p0.a;
          long l = SystemClock.elapsedRealtime();
          String str = null;
          obj = p0.c();
          if (obj != null) {
             str = obj.f();
          }
          d uod = new d(this, a, b, p0, l);
          this.d(str, a, b, p0.d).subscribe(v10, new g$a(this, p0, l));
       }
       return true;
    }
    public b b(int p0){
       return a.b(this, p0);
    }
    public void c(e p0,String p1,String p2,int p3){
       a.a(this, p0, p1, p2, p3);
    }
    public final t d(String p0,b p1,a0 p2,boolean p3){
       b uob = p1;
       a0 uoa0 = p2;
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, g.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p3) {
          return b.a().b(p0, uob.a.mId, uoa0.Z2.getLiveStreamId(), String.valueOf(uob.d), uob.b, a.a.q(uob.f), uob.j, uob.k, a.a(p2), uob.q).doOnNext(e.b).map(new e());
       }else {
          return b.a().a(p0, uob.a.mId, uoa0.Z2.getLiveStreamId(), String.valueOf(uob.d), uob.b, a.a.q(uob.f), uob.j, uob.k, a.a(p2), uob.q).doOnNext(f.b).map(new e());
       }
    }
}
