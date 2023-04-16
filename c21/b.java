package c21.b;
import op1.b;
import ge3.g;
import c21.b$a;
import nsd.u;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.util.List;
import pp.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.b;
import xo1.c;
import u71.c;
import je3.b;
import ge3.i;
import u71.a;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import h02.b;
import java.lang.Boolean;
import rd1.e0;
import je3.d;
import nv2.a;
import dp1.d;
import com.kuaishou.live.common.core.component.livestage.a;

public final class b implements b, g	// class@00045a
{
    public final List b;
    public i c;
    public d d;
    public a e;
    public final a f;
    public final a g;
    public static final b$a h;

    static {
       b.h = new b$a(null);
    }
    public void b(a p0,a p1){
       a.p(p0, "isFrontCamera");
       super();
       this.f = p0;
       this.g = p1;
       this.b = LiveCommonLogTag.NEW_MULTI_CHAT.appendTag("LiveMultiChatCameraControllerV2");
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b.P(this.b, "openLocalCamera");
       b tc = this.c;
       if (tc != null) {
          tc.a(new c(this.e()));
       }
       tc = this.c;
       if (tc != null) {
          tc.d();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b.P(this.b, "closeLocalCamera");
       b tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       b.P(this.b, "onCameraClose");
       this.d = null;
       this.i();
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       i oi = new i("LiveMultiChatCameraControllerV2", false, 2, null);
       this.c = oi;
       a.m(oi);
       oi.c(this);
       return;
    }
    public c e(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-204054297);
       b = obj.Sq();
       c uoc = e0.b(true, this.f.invoke().booleanValue(), b, obj.tZ());
       a.o(uoc, "LiveMultiChatUtils.build¡­LiveMakeupEnabled\(\)\n    \)");
       return uoc;
    }
    public void f(d p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "10")) {
          return;
       }
       a.p(p0, "camera");
       b.P(this.b, "onCameraOpen");
       this.d = p0;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          b.P(this.b, "startCameraPrettify");
          uob = this.d;
          if (uob != null && this.e == null) {
             b tg = this.g;
             if (tg != null) {
                objArray = tg.invoke();
             }
             a uoa = new a(objArray);
             this.e = uoa;
             a.m(uoa);
             uoa.a(uob.g());
          }
       }
       return;
    }
    public void g(boolean p0){
       if (PatchProxy.isSupport(b.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "11");
       }
       return;
    }
    public i h(){
       return this.c;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b.P(this.b, "stopCameraPrettify");
       b te = this.e;
       if (te != null) {
          te.b();
       }
       this.e = null;
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b.P(this.b, "release");
       this.d = null;
       b tc = this.c;
       if (tc != null) {
          tc.e(this);
       }
       this.c = null;
       this.i();
       return;
    }
    public void switchCamera(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b = this.f.invoke().booleanValue();
       b.S(this.b, "switchCamera", "useFrontCamera", Boolean.valueOf(b));
       b td = this.d;
       if (td != null) {
          td.i(b);
       }
       b tc = this.c;
       if (tc != null) {
          tc.a(new c(this.e()));
       }
       return;
    }
}
