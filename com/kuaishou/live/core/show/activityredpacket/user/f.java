package com.kuaishou.live.core.show.activityredpacket.user.f;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.activityredpacket.user.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import x22.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import o22.i;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import lnc.e0;
import com.kuaishou.live.core.show.activityredpacket.user.f$b;
import com.yxcorp.gifshow.image.KwaiImageView;
import y22.d$c;
import y22.d;
import x22.g;
import java.util.Map;
import java.util.HashMap;
import p91.m;
import h22.a;
import t02.a0;
import t02.r1;

public class f extends c implements g	// class@0009a7
{
    public d p;
    public m q;
    public a r;
    public f$c s;
    public LiveActivityRedPacketBaseUserInfoView t;
    public i u;
    public static String sLivePresenterClassName = "LiveActivityRedPacketUserInfoPresenter";

    public void f(){
       super();
       this.s = new f$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new b(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, f.class, "3");
    }
    public final boolean P8(n p0){
       f obj = PatchProxy.applyOneRefs(p0, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = (obj != null && (obj.c() != null && TextUtils.equals(p0.b, this.u.c().mId)))? true: false;
       return b;
    }
    public void R8(boolean p0){
       CDNUrl[] uCDNUrlArray;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "5")) {
          return;
       }
       uof = this.t;
       if (uof != null && uof.c != null) {
          uof = this.u;
          if (uof != null) {
             if (p0) {
                uCDNUrlArray = (j.h(uof.b()))? e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_PREPARE_FOLLOWED_BUTTON.getResourcePath())): this.u.b();
             }else if(j.h(uof.a())){
                uCDNUrlArray = e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_PRAPARE_FOLLOW_BUTTON.getResourcePath()));
             }else {
                uCDNUrlArray = this.u.a();
             }
             this.t.b(p0);
             d.b(this.t.c, uCDNUrlArray, new f$b(this, p0));
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new g());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       a uoa = this.q8(a.class);
       this.r = uoa;
       a b = uoa.b;
       if (b != null) {
          this.p = b.p2;
       }
       uoa = uoa.a;
       if (uoa != null) {
          this.p = uoa.q1;
       }
       return;
    }
}
