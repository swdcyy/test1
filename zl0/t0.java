package zl0.t0;
import zl0.s0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.social.r;
import zl0.t0$a;
import zl0.a1;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zl0.u0;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import zl0.r0;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.live.basic.model.QLiveMessage;
import n81.a;
import com.kwai.robust.PatchProxyResult;
import fq5.b;
import zl0.x0;
import java.util.Map;
import java.util.HashMap;
import ne1.h;
import hf3.a;

public abstract class t0 extends PresenterV2 implements s0, g	// class@004aa3
{
    public b p;
    public LiveSlidePlayService q;
    public h r;
    public DialogFragment s;
    public final r t;
    public final a u;

    public void t0(){
       super();
       this.t = new r(this, 0);
       this.u = new t0$a(this);
    }
    public abstract void C6(a1 p0,int p1);
    public abstract void D4(a1 p0,LiveAdConversionTaskDetail p1,int p2);
    public void E8(){
       t0 ot0 = t0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ot0, "5")) {
          return;
       }
       this.t.b(true);
       if (!PatchProxy.applyVoid(objArray, this, ot0, "7")) {
          ot0 = this.q;
          if (ot0 != null) {
             ot0.P4(new u0(this));
          }
       }
       return;
    }
    public boolean G2(){
       return r0.a(this);
    }
    public abstract void I0(a1 p0,int p1);
    public String I6(){
       return "";
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "6")) {
          return;
       }
       this.t.a(this.s);
       return;
    }
    public void K0(boolean p0){
    }
    public void R0(QLiveMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0.class, "2")) {
          return;
       }
       t0 tr = this.r;
       if (tr != null) {
          tr.R0(p0);
       }
       return;
    }
    public abstract void X3(a1 p0,String p1,int p2);
    public String d4(a1 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.d(p0);
    }
    public String d6(){
       return "";
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, t0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getLiveStreamId();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new x0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, t0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(t0.class, new x0());
       }else {
          obj.put(t0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.r = this.t8("LIVE_COMMENT_FEED_SERVICE");
       return;
    }
    public abstract String k2();
    public a u(){
       Object obj = PatchProxy.apply(null, this, t0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.u();
    }
}
