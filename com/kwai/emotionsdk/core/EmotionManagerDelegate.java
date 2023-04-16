package com.kwai.emotionsdk.core.EmotionManagerDelegate;
import ck5.q;
import com.kwai.emotionsdk.core.EmotionManagerDelegate$a;
import nsd.u;
import com.kwai.emotionsdk.core.EmotionManagerDelegate$Companion$retryCount$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.emotionsdk.core.EmotionManagerDelegate$emotionInitListeners$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import ck5.r;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.ref.WeakReference;
import crd.b;
import ok5.a;
import com.kwai.emotionsdk.core.EmotionResourceProcessor;
import ck5.m;
import com.kwai.robust.PatchProxyResult;
import com.kwai.emotionsdk.core.j;
import java.lang.Throwable;
import com.kwai.emotionsdk.core.exception.EmotionResourceException;
import java.io.File;
import jl5.h;
import jl5.j;
import il5.b;
import java.util.concurrent.atomic.AtomicInteger;
import ek5.a;
import dk5.d;
import java.util.Objects;
import android.os.SystemClock;
import brd.t;
import ck5.i;
import jl5.m;
import brd.z;
import com.kwai.emotionsdk.core.EmotionManagerDelegate$b;
import erd.o;
import com.kwai.emotionsdk.core.EmotionManagerDelegate$c;
import erd.g;
import java.util.concurrent.TimeUnit;
import com.kwai.emotionsdk.core.EmotionManagerDelegate$d;
import com.kwai.emotionsdk.core.EmotionManagerDelegate$e;
import hk5.a;
import dk5.b;
import java.util.Map;
import java.util.List;
import el5.l;
import java.util.LinkedHashMap;

public final class EmotionManagerDelegate implements q	// class@000d8b
{
    public final p a;
    public boolean b;
    public boolean c;
    public b d;
    public static final p e;
    public static long f;
    public static final EmotionManagerDelegate$a g;

    static {
       EmotionManagerDelegate.g = new EmotionManagerDelegate$a(null);
       EmotionManagerDelegate.e = s.c(EmotionManagerDelegate$Companion$retryCount$2.INSTANCE);
    }
    public void EmotionManagerDelegate(){
       super();
       this.a = s.c(EmotionManagerDelegate$emotionInitListeners$2.INSTANCE);
    }
    public void a(boolean p0){
       EmotionManagerDelegate uEmotionMana = EmotionManagerDelegate.class;
       if (PatchProxy.isSupport(uEmotionMana) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uEmotionMana, "2")) {
          return;
       }
       this.h(p0);
       return;
    }
    public void b(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionManagerDelegate.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.f().add(new WeakReference(p0));
       return;
    }
    public boolean c(){
       boolean b = (this.b == null && this.c != null)? true: false;
       return b;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, EmotionManagerDelegate.class, "5")) {
          return;
       }
       if (this.b == null) {
          EmotionManagerDelegate td = this.d;
          if (td != null && !td.isDisposed()) {
             a.a("EmotionManagerDelegate", "improveEmotionDownloadPriority");
             EmotionResourceProcessor.e();
          }
       }
       return;
    }
    public final m e(){
       Object obj = PatchProxy.apply(null, this, EmotionManagerDelegate.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.e().d(1);
    }
    public final CopyOnWriteArrayList f(){
       Object obj = PatchProxy.apply(null, this, EmotionManagerDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void g(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionManagerDelegate.class, "7")) {
          return;
       }
       String str = "EmotionManagerDelegate";
       if (p0 instanceof EmotionResourceException) {
          a.a(str, "handleDataLoadError delete file");
          j.a(new File(h.d()));
       }
       b.c("getEmotionCurVersion", -1);
       EmotionManagerDelegate$a g = EmotionManagerDelegate.g;
       if (g.b().getAndIncrement() < 2) {
          a.a(str, "handleDataLoadError retry");
          this.h(true);
       }else {
          a.b(false, g.b().getAndIncrement(), g.a(), p0.toString());
          d.a().d(p0);
       }
       return;
    }
    public synchronized final void h(boolean p0){
       EmotionManagerDelegate td;
       EmotionManagerDelegate uEmotionMana = EmotionManagerDelegate.class;
       if (PatchProxy.isSupport(uEmotionMana) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uEmotionMana, "6")) {
          return;
       }
       if (this.b != null && !p0) {
          a.a("EmotionManagerDelegate", "initEmotionDataInternal - 1");
          return;
       }else {
          this.c = true;
          if (!p0) {
             td = this.d;
             if (td != null && !td.isDisposed()) {
                EmotionResourceProcessor.e();
                a.a("EmotionManagerDelegate", "initEmotionDataInternal - 2");
                return;
             }
          }
          a.a("EmotionManagerDelegate", "initEmotionDataInternal - 3");
          EmotionManagerDelegate$a g = EmotionManagerDelegate.g;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoid(null, g, EmotionManagerDelegate$a.class, "3")) {
             EmotionManagerDelegate.f = SystemClock.elapsedRealtime();
          }
          td = this.d;
          if (td != null) {
             td.dispose();
          }
          z b = m.b;
          t ot = i.c().observeOn(b).flatMapSingle(EmotionManagerDelegate$b.b).observeOn(b).doOnNext(new EmotionManagerDelegate$c(this)).timeout(5, TimeUnit.MINUTES).observeOn(b);
          this.d = ot.subscribe(new EmotionManagerDelegate$d(this), new EmotionManagerDelegate$e(this));
          return;
       }
    }
    public boolean isAvailable(){
       return this.b;
    }
    public void logout(){
       if (PatchProxy.applyVoid(null, this, EmotionManagerDelegate.class, "3")) {
          return;
       }
       this.b = false;
       EmotionManagerDelegate td = this.d;
       if (td != null) {
          td.dispose();
       }
       j.e().i();
       a uoa = a.b();
       Objects.requireNonNull(uoa);
       _monitor_enter(a.class);
       uoa.a = null;
       _monitor_exit(a.class);
       b uob = b.e();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(null, uob, b.class, "14")) {
          uob.c.clear();
          uob.d.clear();
          uob.e.clear();
          uob.b = null;
       }
       l ol = l.b();
       Objects.requireNonNull(ol);
       if (!PatchProxy.applyVoid(null, ol, l.class, "6")) {
          ol = ol.e;
          if (ol != null) {
             ol.clear();
          }
       }
       return;
    }
}
