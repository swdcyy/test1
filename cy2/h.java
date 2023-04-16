package cy2.h;
import cy2.b;
import cy2.h$a;
import nsd.u;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import com.kuaishou.live.core.voiceparty.a;
import ee1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import u71.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import q00.b;
import kotlin.Pair;
import com.kuaishou.live.basic.model.CheckResolutionResponse;
import u71.c;
import tkd.b;
import tkd.d;
import h02.b;
import cy2.i;
import v71.b;
import com.kuaishou.live.basic.model.CheckResolutionResponse$VideoConfig;
import u71.d;
import cy2.j;
import x71.c;
import x71.a;

public final class h implements b	// class@002405
{
    public a a;
    public LiveCameraView b;
    public final a c;
    public final a d;
    public boolean e;
    public static final h$a f;

    static {
       h.f = new h$a(null);
    }
    public void h(LiveCameraView p0,a p1,a p2,boolean p3){
       a.p(p0, "cameraView");
       a.p(p1, "aryaProvider");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public a a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, oh, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.e;
       if (PatchProxy.isSupport(oh)) {
          h obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(obj), this, oh, "1");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
          label_0028 :
             obj1 = this.a;
             if (obj1 != null) {
                objArray = obj1;
             }else {
                b uob = PatchProxy.apply(objArray, this, oh, "6");
                if (uob != patchProxyRe) {
                }else {
                   uob = this.c.k();
                }
                if (uob != null) {
                   Pair pair = h.f.b(obj);
                   CheckResolutionResponse uCheckResolu = pair.component1();
                   a uoa = d.a(-204054297).Yj(pair.component2(), this.b);
                   uoa.u(new i(this, uoa, uob));
                   CheckResolutionResponse mVideoConfig = uCheckResolu.mVideoConfig;
                   a.o(mVideoConfig, "checkResolution.mVideoConfig");
                   d uod = d.a(mVideoConfig.getPushResolution());
                   a.o(uod, "LiveResolution.getResolu¡­deoConfig.pushResolution\)");
                   uoa.o(uCheckResolu.mFps, uod.a, uod.b, new j(this, uCheckResolu.mVideoConfig.mUseTexture));
                   uoa.g();
                   this.a = uoa;
                   objArray = uoa;
                }
             }
          }
       }else {
          goto label_0028 ;
       }
       return objArray;
    }
    public a b(){
       return this.a;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       h ta = this.a;
       if (ta != null) {
          this.e = ta.I();
          ta.l2();
          this.a = null;
       }
       return;
    }
}
