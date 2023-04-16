package com.kwai.framework.kxb.KxbInitModule;
import com.kwai.framework.init.a;
import com.kwai.framework.kxb.KxbInitModule$a;
import nsd.u;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.kxb.preload.PreloadSource;
import b76.a;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.kxb.KxbInitModule$d;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kwai.framework.kxb.KxbInitModule$e;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.b;
import brd.t;
import t45.d;
import brd.z;
import com.kwai.framework.kxb.KxbInitModule$b;
import com.kwai.framework.kxb.KxbInitModule$c;
import erd.g;
import crd.b;
import k96.a;
import java.util.Objects;
import e96.e;
import q87.c;
import com.kwai.chat.sdk.signal.f;
import j85.e;
import e96.b;
import gu6.k;
import com.kwai.kxb.KxbManager;
import ou6.c;
import com.kwai.kxb.PlatformType;

public final class KxbInitModule extends a	// class@001621
{
    public final AtomicBoolean q;
    public final AtomicLong r;
    public static final KxbInitModule$a s;

    static {
       KxbInitModule.s = new KxbInitModule$a(null);
    }
    public void KxbInitModule(){
       super();
       this.q = new AtomicBoolean(false);
       this.r = new AtomicLong(-1);
    }
    public int f0(){
       return 20;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, KxbInitModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{SwitchConfigInitModule.class};
       return CollectionsKt__CollectionsKt.P(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, KxbInitModule.class, "3")) {
          return;
       }
       if (this.q.get()) {
          this.o0(PreloadSource.BACKGROUND);
       }
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, KxbInitModule.class, "4")) {
          return;
       }
       if (this.q.get()) {
          this.o0(PreloadSource.FOREGROUND);
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbInitModule.class, "2")) {
          return;
       }
       if (SystemUtil.L(a.B)) {
          this.n0();
          this.l0();
       }
       e.g(new KxbInitModule$d(this), "KxbPreloadManager");
       e.g(KxbInitModule$e.b, "reportLocalBundleInfo");
       this.q.set(true);
       return;
    }
    public final void l0(){
       if (PatchProxy.applyVoid(null, this, KxbInitModule.class, "7")) {
          return;
       }
       RxBus.f.f(b.class).observeOn(d.c).subscribe(new KxbInitModule$b(this), KxbInitModule$c.b);
       return;
    }
    public void n(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, KxbInitModule.class, str)) {
          return;
       }
       if (!SystemUtil.L(a.B)) {
          this.n0();
          this.l0();
       }
       a b = a.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(objArray, b, a.class, str)) {
          objArray = new Object[0];
          e.c.w("KwaiKxbPushManager", "start listening klink push", objArray);
          String[] stringArray = new String[]{"Push.Webserver.client.krn"};
          f.e().o(a.a, stringArray);
       }
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, KxbInitModule.class, "6")) {
          return;
       }
       KxbManager.g.e(b.a.getConfig());
       return;
    }
    public final void o0(PreloadSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbInitModule.class, "8")) {
          return;
       }
       c.e.c(null, p0, false);
       return;
    }
}
