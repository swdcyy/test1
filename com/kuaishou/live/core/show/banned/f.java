package com.kuaishou.live.core.show.banned.f;
import im8.g;
import ub1.h;
import com.kuaishou.live.core.show.banned.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z12.e;
import android.view.View;
import t02.a0;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.banned.d$c;
import com.yxcorp.gifshow.model.CDNUrl;
import android.view.ViewParent;
import android.view.ViewStub;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.banned.LiveBannedView;
import ekd.m1;
import com.kuaishou.live.core.show.banned.h;
import java.util.Map;
import java.util.HashMap;

public class f extends h implements g	// class@0009ec
{
    public a0 s;
    public ViewStub t;
    public LiveBannedView u;
    public View v;
    public f$b w;
    public static String sLivePresenterClassName = "LiveWarningMaskAudiencePresenter";

    public void f(){
       super();
       this.w = new f$a(this);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       super.J8();
       this.W8();
       this.u = null;
       this.v = null;
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveWarningMaskAudience", "hideWarningMask", stringArray);
       f tv = this.v;
       if (tv != null) {
          tv.setVisibility(8);
       }
       this.s.E.startPlay("WarningMask");
       return;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.H1.a();
    }
    public void V8(CDNUrl[] p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "3")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       e.c("LiveWarningMaskAudience", "showWarningMask", stringArray);
       if (this.t.getParent() != null) {
          this.v = this.t.inflate();
          this.u = this.m8().findViewById(0x7f0a27fd);
       }
       f tv = this.v;
       if (tv == null) {
          return;
       }else {
          tv.setVisibility(i);
          this.u.setLiveBannedImageUrls(p0);
          this.u.setLiveBannedWarningContentString(p1);
          this.u.setLiveBannedTopContent(p2);
          this.u.setLiveBannedBottomContent(p3);
          this.s.E.stopPlay("WarningMask");
          return;
       }
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       if (this.v != null) {
          this.S8();
          this.v.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a27fc);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new h());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public String getTag(){
       return "LiveWarningMaskAudience";
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.s = this.q8(a0.class);
       return;
    }
}
