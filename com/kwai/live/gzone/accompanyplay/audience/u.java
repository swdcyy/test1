package com.kwai.live.gzone.accompanyplay.audience.u;
import im8.g;
import f37.b0;
import com.kwai.live.gzone.accompanyplay.audience.u$c;
import k37.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mq5.h;
import mq5.b;
import java.lang.Integer;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.f;
import com.kwai.live.gzone.accompanyplay.audience.u$a;
import u07.u;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.audience.x;
import java.util.Map;
import java.util.HashMap;
import fq5.b;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import hq5.a;
import lp3.e;
import kg1.g;
import lp3.c;

public class u extends b0 implements g	// class@000bbb
{
    public b q;
    public b r;
    public a s;
    public k0$g t;
    public g u;
    public u$b v;
    public h w;

    public void u(){
       super();
       this.v = new u$c(this);
       this.w = new m(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "2")) {
          return;
       }
       this.r.Km(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "11")) {
          return;
       }
       super.J8();
       this.r.le(this.w);
       return;
    }
    public void S8(int p0,int p1){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ou, "5")) {
          return;
       }
       t$a uoa = new t$a(this.getActivity());
       uoa.W0(p0);
       uoa.S0(p1);
       t$a uoa1 = f.e(uoa);
       uoa1.Q0(R.string.cancel);
       uoa1.u0(new u$a(this));
       this.P8(uoa1.Y(PopupInterface.a));
       return;
    }
    public void V8(int p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ou, "7")) {
          return;
       }
       this.W8(a1.p(p0));
       return;
    }
    public void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "8")) {
          return;
       }
       t$a uoa = new t$a(this.getActivity());
       uoa.X0(p0);
       uoa.S0(R.string.arg_RES_7f103a83);
       t$a uoa1 = f.e(uoa);
       this.P8(uoa1.Y(PopupInterface.a));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new x();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, u.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(u.class, new x());
       }else {
          obj.put(u.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.t = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       this.s = this.q8(a.class);
       this.u = this.r8("LIVE_SERVICE_MANAGER").a(g.class);
       return;
    }
}
