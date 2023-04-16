package c21.a;
import op1.b;
import v71.b;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.util.List;
import pp.c;
import java.lang.Exception;
import v71.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.b;
import u71.a;
import nv2.a;
import u71.c;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import h02.b;
import java.lang.Boolean;
import rd1.e0;
import ge3.i;
import op1.a;
import dp1.d;

public final class a implements b, b	// class@000458
{
    public final List b;
    public a c;
    public a d;
    public final a e;
    public final a f;

    public void a(a p0,a p1){
       a.p(p0, "isFrontCamera");
       super();
       this.e = p0;
       this.f = p1;
       this.b = LiveCommonLogTag.NEW_MULTI_CHAT.appendTag("LiveMultiChatCameraController");
    }
    public void B3(int p0,Exception p1){
       a.d(this, p0, p1);
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       b.P(this.b, "onCameraClosed");
       a.a(this);
       this.c();
       return;
    }
    public void N(long p0,long p1){
       a.e(this, p0, p1);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       b.P(this.b, "openLocalCamera");
       a tc = this.c;
       if (tc != null) {
          tc.f();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       b.P(this.b, "closeLocalCamera");
       a tc = this.c;
       if (tc != null) {
          tc.g();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       b.P(this.b, "stopPrettify");
       a td = this.d;
       if (td != null) {
          td.b();
       }
       this.d = null;
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       b.S(this.b, "init", "camera", p0);
       this.c = p0;
       if (p0 != null) {
          p0.X(this);
       }
       return;
    }
    public c e(){
       b obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-204054297);
       boolean b = obj.Sq();
       c uoc = e0.b(true, this.e.invoke().booleanValue(), b, obj.tZ());
       a.o(uoc, "LiveMultiChatUtils.build¡­LiveMakeupEnabled\(\)\n    \)");
       return uoc;
    }
    public i h(){
       return a.a(this);
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       b.P(this.b, "release");
       a tc = this.c;
       if (tc != null) {
          tc.A(this);
       }
       this.c = null;
       this.c();
       return;
    }
    public void switchCamera(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       b.P(this.b, "init");
       a tc = this.c;
       if (tc != null) {
          tc.switchCamera();
       }
       return;
    }
    public void t1(){
       a.c(this);
    }
    public void w(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          return;
       }
       a.b(this);
       b.P(this.b, "onCameraOpened");
       a tc = this.c;
       if (tc != null) {
          if (tc.I() != this.e.invoke().booleanValue()) {
             tc.switchCamera();
          }
          if (!PatchProxy.applyVoidOneRefs(tc, this, uoa, "9")) {
             b.P(this.b, "startPrettify");
             if (this.d == null) {
                a tf = this.f;
                if (tf != null) {
                   objArray = tf.invoke();
                }
                uoa = new a(objArray);
                this.d = uoa;
                a.m(uoa);
                uoa.a(tc);
             }
          }
       }
    label_005a :
       return;
    }
}
