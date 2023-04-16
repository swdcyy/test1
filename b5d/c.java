package b5d.c;
import com.yxcorp.plugin.music.player.controller.base.BasePlayerController;
import b5d.e;
import java.util.HashMap;
import e5d.c;
import e5d.f;
import e5d.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import brd.t;
import e5d.b;
import erd.g;
import crd.b;
import eoc.g;
import kotlin.jvm.internal.a;
import npb.a;
import npb.c;
import com.kwai.robust.PatchProxyResult;
import brd.z;
import io.reactivex.android.schedulers.a;
import e5d.d;
import e5d.e;
import android.app.Application;
import com.yxcorp.plugin.music.player.controller.plugin.MusicPageWhitelistPlugin$init$1;
import android.app.Application$ActivityLifecycleCallbacks;
import g5d.i;
import b5d.c$a;
import f5d.f;
import android.content.Context;
import o56.a;
import java.io.File;
import kqb.b0;
import i5d.p;
import java.util.concurrent.CountDownLatch;
import java.util.Map;
import com.kuaishou.android.model.music.Music;
import java.lang.Number;

public final class c extends BasePlayerController	// class@0003a7
{
    public static boolean k;
    public static Map l;
    public static final c m;
    public static final f n;
    public static final a o;
    public static final c p;

    static {
       e uoe = e.class;
       c uoc = new c();
       c.p = uoc;
       c.l = new HashMap();
       c uoc1 = new c();
       c.m = uoc1;
       f uof = new f();
       c.n = uof;
       a uoa = new a();
       c.o = uoa;
       Objects.requireNonNull(uoc1);
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, uoc1, c.class, str)) {
       }else {
          g.a(RxBus.f.f(uoe), new b(uoc1));
       }
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoidOneRefs(uoc, uof, f.class, str)) {
          a.p(uoc, "controller");
          uof.a = uoc.c();
          uof.b = uoc.isPlaying();
          t ot = PatchProxy.apply(objArray, uoc, BasePlayerController.class, "33");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = RxBus.f.f(uoe);
          }
          g.a(ot.observeOn(a.c()), new d(uof));
          g.a(uoc.j().observeOn(a.c()), new e(uof));
       }
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(uoc, uoa, a.class, "2")) {
          a.p(uoc, "controller");
          uoc.b().registerActivityLifecycleCallbacks(new MusicPageWhitelistPlugin$init$1(uoa, uoc));
       }
       i oi = uoc.o();
       c$a uoa1 = new c$a();
       Objects.requireNonNull(oi);
       if (!PatchProxy.applyVoidOneRefs(uoa1, oi, i.class, "12")) {
          a.p(uoa1, "listener");
          oi.K = uoa1;
       }
    }
    public void c(){
       super();
    }
    public f a(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(this.b());
    }
    public Application b(){
       Application obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b();
       a.o(obj, "AppEnv.getAppContext\(\)");
       return obj;
    }
    public void i(a p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "6")) {
       }else {
          a.p(p0, "model");
          String str = p0.b();
          a.o(str, "model.getCacheKey\(\)");
          if (!PatchProxy.applyVoidOneRefs(str, this, uoc, "3") && !p.a(b0.b(str))) {
             c.l.put(str, new CountDownLatch(1));
          }
          this.o().w(p0);
          if (c.k) {
             this.seekTo((long)p0.c().mChorus);
          }
       }
       return;
    }
    public int n(c p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "playModel");
       obj = this.c();
       String id = (obj != null)? obj.getId(): null;
       if (a.g(id, p0.getId())) {
          return this.e().b();
       }else {
          return 0;
       }
    }
    public final i o(){
       f obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.plugin.music.player.detail.music.SMusicPlayer");
       return obj;
    }
    public final boolean p(){
       return c.k;
    }
    public int x3(Object p0){
       return this.n(p0);
    }
}
