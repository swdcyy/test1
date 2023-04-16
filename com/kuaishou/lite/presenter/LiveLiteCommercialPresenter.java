package com.kuaishou.lite.presenter.LiveLiteCommercialPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eq3.d;
import kl0.a;
import kotlin.jvm.internal.a;
import e93.a;
import e93.c;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import com.kuaishou.live.lite.sidebar.e;
import v51.a;
import c93.b;
import d93.a;

public final class LiveLiteCommercialPresenter extends d	// class@000940
{
    public a v;
    public c w;
    public e x;
    public LiveLiteBottomBarService y;
    public a z;

    public void LiveLiteCommercialPresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteCommercialPresenter.class, "3")) {
          return;
       }
       super.F8();
       d uod = this.P8();
       LiveLiteCommercialPresenter tv = this.v;
       if (tv == null) {
          a.S("mAudienceInfoService");
       }
       LiveLiteCommercialPresenter tw = this.w;
       if (tw == null) {
          a.S("mLiveLiteFragmentService");
       }
       uod.xg(new a(tv, tw));
       LiveLiteCommercialPresenter tv1 = this.v;
       if (tv1 == null) {
          a.S("mAudienceInfoService");
       }
       LiveLiteCommercialPresenter tw1 = this.w;
       if (tw1 == null) {
          a.S("mLiveLiteFragmentService");
       }
       LiveLiteCommercialPresenter ty = this.y;
       if (ty == null) {
          a.S("mLiteBottomBarService");
       }
       LiveLiteCommercialPresenter tx = this.x;
       if (tx == null) {
          a.S("mLiteSideBarService");
       }
       LiveLiteCommercialPresenter tz = this.z;
       if (tz == null) {
          a.S("mLiveLiteLongConnectManager");
       }
       LiveLiteConversionTaskController liveLiteConv = new LiveLiteConversionTaskController(tv1, tw1, ty, tx, tz);
       uod.xg(v1);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommercialPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.z = p0.a(a.class);
       this.v = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommercialPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(c.class);
       this.x = p0.a(e.class);
       this.y = p0.a(LiveLiteBottomBarService.class);
       return;
    }
}
