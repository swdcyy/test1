package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$frequencyRestrictSubject$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$Request;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import mrd.c;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$b;
import bp6.a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$c;
import erd.g;
import erd.a;
import crd.b;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$Request$Params;
import com.yxcorp.gifshow.util.rx.RxBus;
import lj1.f;
import brd.y;

public final class LiveJsCmdNotifySendGiftSuccess extends AbstractLiveJsCommand	// class@000e1b
{
    public long e;
    public final p f;
    public b g;
    public static final LiveJsCmdNotifySendGiftSuccess$a h;

    static {
       LiveJsCmdNotifySendGiftSuccess.h = new LiveJsCmdNotifySendGiftSuccess$a(null);
    }
    public void LiveJsCmdNotifySendGiftSuccess(){
       super();
       this.f = s.b(LazyThreadSafetyMode.NONE, LiveJsCmdNotifySendGiftSuccess$frequencyRestrictSubject$2.INSTANCE);
    }
    public Class a(){
       return LiveJsCmdNotifySendGiftSuccess$Request.class;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, LiveJsCmdNotifySendGiftSuccess.class, "2")) {
          return;
       }
       this.e = a.t().u("SOURCE_LIVE").b("timeIntervalForRefreshWalletAfterH5SendGift", (long)5);
       this.g = this.m().throttleFirst(this.e, TimeUnit.SECONDS).observeOn(d.a).subscribe(new LiveJsCmdNotifySendGiftSuccess$b(this), new a(), LiveJsCmdNotifySendGiftSuccess$c.b);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveJsCmdNotifySendGiftSuccess.class, "3")) {
          return;
       }
       LiveJsCmdNotifySendGiftSuccess tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       this.g = null;
       return;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdNotifySendGiftSuccess.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof LiveJsCmdNotifySendGiftSuccess$Request) {
          p0 = null;
       }
       if (p0 != null) {
          if (this.e <= 0) {
             return m.g.c("refreshIntervalSecond is invalid");
          }else {
             WalletResponse walletRespon = new WalletResponse();
             p0 = p0.params;
             p0 = (p0 != null)? p0.giftSentInfo: null;
             walletRespon.mGiftSentInfo = p0;
             RxBus.f.b(new f(walletRespon));
             this.m().onNext(new Object());
             return m$a.g(m.g, null, false, 3, null);
          }
       }else {
          return m.g.c("invalid params");
       }
    }
    public final c m(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdNotifySendGiftSuccess.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
}
