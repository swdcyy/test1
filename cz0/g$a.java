package cz0.g$a;
import sfc.a;
import cz0.g;
import bz0.e;
import fq5.b;
import t02.a0;
import p91.m;
import lp3.e;
import rp5.a;
import java.lang.Class;
import lp3.c;
import xp5.i;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import z12.e;
import ht5.b;
import bz0.f;
import android.os.SystemClock;
import com.yxcorp.retrofit.model.KwaiException;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import com.yxcorp.gifshow.models.Gift;
import f92.b;
import lm1.i;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import lm1.c;
import w91.a;
import java.util.Map;
import lm1.g;
import zb6.a;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.google.gson.JsonElement;
import lm1.d;
import lm1.f;
import lm1.e;
import ik1.i0;
import oy1.a;
import cz0.b;

public class g$a extends a	// class@001ec7
{
    public final a0 c;
    public final a d;
    public final i e;
    public final e f;
    public final b g;
    public final String h;
    public final long i;
    public final g j;

    public void g$a(g p0,e p1,long p2){
       this.j = p0;
       super();
       this.f = p1;
       e b = p1.b;
       this.c = b;
       this.d = b.b().t5().a(a.class);
       this.e = b.b().t5().a(i.class);
       this.g = p1.a;
       this.h = p1.c;
       this.i = p2;
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       g$a f;
       Object obj = this;
       String obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, g$a.class, "1")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       e.b("LiveSendGiftHttpUtil", "send gift fail : "+p0.getMessage(), stringArray);
       if (!f.b(obj.g, obj1)) {
          super.b(p0);
       }
       obj.f.a();
       long l = SystemClock.elapsedRealtime() - obj.i;
       if (obj1 instanceof KwaiException) {
          i = obj1.mErrorCode;
          if (i == 803) {
             d.a(0x630bc993).d1().l();
          }
       }
       g$a g = obj.g;
       b uob = f.a(g.a, g.b, g.c, g.d, obj.c, false, true, g.e);
       i oi = obj.f.b();
       if (oi != null) {
          uob.b("key_send_gift_context", oi);
       }else {
          b.P(b.a, "[LiveInSendPacketGiftInterceptor][RequestErrorConsumer]context is null");
       }
       if (obj.g.g != null) {
          c uoc = new c(obj.h, l, null, obj.c.Z2.t5().a(a.class).d6(), obj.g.l);
          g og = new g(null, null, a.b(p0), a.i(p0), null);
          f uof = (oi != null)? oi.b(): f.a(obj.g);
          uob.c(new d(uof, v5, null, v6));
       }
       obj.c.V1.G4(uob);
       g = obj.j;
       f = obj.f;
       obj1 = "[LiveInSendNormalGiftInterceptor][accept]"+a.a(p0);
       if (i == null) {
          i = 0x18a25;
       }
       g.c(f, "CLIENT_SEND_REQUEST_RESULT", obj1, i);
       return;
    }
}
