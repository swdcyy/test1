package dx2.p;
import z41.f;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import java.lang.Throwable;
import z41.g;
import z41.h;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTubeContainerFragment;
import java.lang.ref.WeakReference;
import java.lang.IllegalStateException;
import qu2.a;
import op2.f;
import co2.f2;
import java.lang.Boolean;

public class p implements f	// class@0025dc
{
    public a a;
    public f2 b;
    public WeakReference c;
    public final AtomicBoolean d;
    public static boolean e = true;

    public void p(){
       super();
       this.c = null;
       this.d = new AtomicBoolean(false);
       if (p.e) {
          b.Z(LiveLogTag.LIVE_VOICE_PARTY, "Construct new VoicePartyTheaterTubeContext "+this);
       }
       return;
    }
    public static p c(Fragment p0){
       p op = p.class;
       p obj = PatchProxy.applyOneRefs(p0, null, op, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getFragmentManager() == null && p.e) {
          b.I(LiveLogTag.LIVE_VOICE_PARTY, "Access VoicePartyTheaterTubeContext with destroyed fragment "+p0, new Throwable());
       }
       obj = h.a(p0).c(op, VoicePartyTubeContainerFragment.class);
       String str = (obj.c != null)? 1: null;
       if (!str && !PatchProxy.applyVoidOneRefs(p0, obj, op, "9")) {
          obj.c = new WeakReference(p0);
       }
       return obj;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, p.class, "8")) {
          return;
       }
       if (this.d.get()) {
          return;
       }
       throw new IllegalStateException("This context "+this+" has NOT been initialized!");
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p.class, "6")) {
          return;
       }
       if (p.e) {
          p tc = this.c;
          if (tc != null) {
             objArray = tc.get();
          }
          String str = "This VoicePartyTheaterTubeContext ";
          if (objArray != null && objArray.isAdded()) {
             b.I(LiveLogTag.LIVE_VOICE_PARTY, str+this+" is cleared too early with host "+objArray, new Throwable());
          }else {
             b.Z(LiveLogTag.LIVE_VOICE_PARTY, str+this+" is cleared with host "+objArray);
          }
       }
       return;
    }
    public a d(){
       Object obj = PatchProxy.apply(null, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       return this.a;
    }
    public String e(){
       f obj = PatchProxy.apply(null, this, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = this.b.k();
       if (obj != null) {
          return obj.e();
       }
       return null;
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       return this.b.t();
    }
    public f2 g(){
       Object obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       return this.b;
    }
    public void h(a p0,f2 p1){
       p op = p.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, op, "1")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, op, "7");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): this.d.getAndSet(true) ^ true;
       if (b) {
          this.a = p0;
          this.b = p1;
          if (p.e) {
             b.Z(LiveLogTag.LIVE_VOICE_PARTY, "Initialize VoicePartyTheaterTubeContext "+this);
          }
       }
       return;
    }
}
