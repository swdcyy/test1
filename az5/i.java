package az5.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import az5.a;
import erd.g;
import crd.b;
import eda.n;
import az5.b;
import androidx.collection.LruCache;
import az5.g;
import java.lang.Runnable;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collections;
import az5.e;
import erd.o;
import java.util.concurrent.FutureTask;
import az5.h;
import java.util.concurrent.Future;
import az5.d;
import java.util.concurrent.RunnableFuture;
import t45.d;
import brd.z;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import az5.c;

public abstract class i	// class@0003d6
{
    public t a;
    public LruCache b;
    public Handler c;
    public Map d;

    public void i(){
       i oi = i.class;
       super();
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "1")) {
       }else {
          HandlerThread handlerThrea = new HandlerThread(this.getClass().getName(), 10);
          handlerThrea.start();
          this.c = new Handler(handlerThrea.getLooper());
       }
       this.g();
       if (!PatchProxy.applyVoid(objArray, this, oi, "4")) {
          RxBus f = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          f.g(l.class, mAIN).subscribe(new a(this));
          f.g(n.class, mAIN).subscribe(new b(this));
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       i tb = this.b;
       if (tb == null) {
          return;
       }
       tb.evictAll();
       this.c.post(new g(this));
       return;
    }
    public abstract LruCache b();
    public Map c(){
       Object obj = PatchProxy.apply(null, this, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(true);
    }
    public Map d(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oi, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       oi = this.b;
       if (oi == null || (!p0 && this.d == null)) {
          return Collections.emptyMap();
       }else if(p0){
          this.d = oi.snapshot();
       }
       return this.d;
    }
    public t e(){
       i obj = PatchProxy.apply(null, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          return t.just(this.c());
       }
       return obj.map(new e(this));
    }
    public abstract int f();
    public final void g(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       FutureTask uFutureTask = new FutureTask(new h(this), Boolean.TRUE);
       this.a = t.fromFuture(uFutureTask).doOnSubscribe(new d(uFutureTask)).subscribeOn(d.c).observeOn(d.a);
       return;
    }
    public void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
          return;
       }
       if (this.a != null && !TextUtils.x(p0)) {
          this.a.subscribe(new c(this, p0));
       }
       return;
    }
    public abstract void i(LruCache p0);
}
