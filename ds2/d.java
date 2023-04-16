package ds2.d;
import yh3.a;
import qu2.a;
import co2.f2;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import androidx.lifecycle.LiveData;
import zh3.d;
import zh3.b;
import yx2.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.concurrent.TimeUnit;
import java.lang.Boolean;
import mrd.a;
import ds2.d$b;
import brd.t;
import ds2.d$c;
import erd.g;
import crd.b;
import androidx.lifecycle.ViewModel;
import ds2.d$a;
import ds2.d$a$a;

public abstract class d extends a	// class@00258d
{
    public final LiveData a;
    public final b b;
    public long c;
    public final a d;
    public final Runnable e;
    public final b f;
    public final a g;
    public final f2 h;

    public void d(a p0,f2 p1){
       long l;
       a.p(p0, "liveContextWrapper");
       a.p(p1, "voicePartyContext");
       super();
       this.g = p0;
       this.h = p1;
       MutableLiveData mutableLiveD = new MutableLiveData(Integer.valueOf(0));
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       d uod = new d();
       this.q0(uod);
       this.b = uod;
       uod = PatchProxy.apply(null, null, l.class, "6");
       if (uod != PatchProxyResult.class) {
          l = uod.longValue();
       }else {
          LiveVoicePartyCommonConfig liveVoicePar = a.M(LiveVoicePartyCommonConfig.class);
          l = (liveVoicePar == null)? TimeUnit.MILLISECONDS.toMillis(10): liveVoicePar.mApplyCountQueryIntervalMs;
       }
       this.c = l;
       l = a.h(Boolean.FALSE);
       a.o(l, "BehaviorSubject.createDefault\(false\)");
       this.d = l;
       this.e = new d$b(this);
       this.f = l.distinctUntilChanged().subscribe(new d$c(this));
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       super.onCleared();
       this.y0();
       this.f.dispose();
       return;
    }
    public final LiveData u0(){
       return this.a;
    }
    public void v0(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (a.g(p0, d$a$a.a) && !PatchProxy.applyVoid(null, this, d.class, "6")) {
          this.w0();
          this.t0(this.b).q();
       }
       return;
    }
    public abstract void w0();
    public final void x0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "5")) {
          return;
       }
       if (p0 == 2) {
          if (!PatchProxy.applyVoid(null, this, uod, "2")) {
             this.d.onNext(Boolean.TRUE);
          }
       }else {
          this.y0();
       }
       return;
    }
    public final void y0(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.d.onNext(Boolean.FALSE);
       this.r0(this.a).setValue(Integer.valueOf(0));
       return;
    }
}
