package com.yxcorp.gifshow.postwork.z;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import lnc.s6;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.postwork.x;
import f0c.q0;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import lnc.y6;
import lnc.t;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import f0c.u0;
import java.util.Objects;
import io.reactivex.internal.functions.a;
import erd.o;
import java.lang.Throwable;
import drd.a;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import wh5.c;
import f0c.s0;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import f0c.t0;
import f0c.r0;
import com.yxcorp.gifshow.postwork.y;
import zca.b;

public class z	// class@0010dd
{
    public GifshowActivity a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public PublishSubject f;
    public NetworkUtilsCached$a g;

    public void z(GifshowActivity p0){
       super();
       boolean b = true;
       this.b = b;
       this.c = false;
       this.d = false;
       this.e = false;
       this.a = p0;
       if (!s6.r() - 2) {
       }else {
          b = false;
       }
       this.d = b;
       return;
    }
    public final void a(boolean p0){
       Object[] objArray1;
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("PostWorkRecoverHelper", "autoRetryUpload\(\) called with: isOnStart = ["+p0+"]", objArray);
       if (!s6.e()) {
          objArray1 = new Object[0];
          b.C().w("PostWorkRecoverHelper", "autoRetryUpload: ab off ,return", objArray1);
          return;
       }else if(this.e != null && p0){
          objArray1 = new Object[0];
          b.C().w("PostWorkRecoverHelper", "autoRetryUpload:has retried on app start,return", objArray1);
          return;
       }else {
          this.f = PublishSubject.g();
          this.c().observeOn(d.a).subscribe(new x(this, p0), new q0(this));
          return;
       }
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, z.class, "6")) {
          return;
       }
       z tf = this.f;
       if (tf != null) {
          tf.onNext(Boolean.TRUE);
          this.f.onComplete();
          this.f = null;
       }
       return;
    }
    public final t c(){
       y6 obj = PatchProxy.apply(null, this, z.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = y6.e;
       if (obj.j()) {
          Object[] objArray = new Object[0];
          b.C().w("PostWorkRecoverHelper", "doAfterPluginSilentInstalled: isInstalled", objArray);
          return t.just(Boolean.TRUE);
       }else {
          a uoa = obj.h(LoadPolicy.SILENT_IF_DOWNLOADED);
          u0 ou0 = new u0(this);
          Objects.requireNonNull(uoa);
          a.c(ou0, "converter is null");
          return ou0.apply(uoa);
       }
    }
    public final void d(){
       z c;
       t ot;
       if (PatchProxy.applyVoid(null, this, z.class, "4")) {
          return;
       }
       if (this.b != null && !c.b()) {
          z tf = this.f;
          if (tf == null) {
             ot = t.just(Boolean.TRUE);
          }
          c = d.c;
          ot = tf.flatMap(new s0(this)).compose(this.a.E2(ActivityEvent.PAUSE)).subscribeOn(c).observeOn(c);
          ot.flatMap(new t0(this)).subscribe(new r0(this), y.b);
       }
       return;
    }
    public void onChildLockDialogEvent(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "3")) {
          return;
       }
       if (p0.a == null && this.d == null) {
          Object[] objArray = new Object[0];
          b.C().s("PostWorkRecoverHelper", " DraftRecoverUtil recover post work in child lock dismiss", objArray);
          this.c = true;
          this.d();
       }
       return;
    }
}
