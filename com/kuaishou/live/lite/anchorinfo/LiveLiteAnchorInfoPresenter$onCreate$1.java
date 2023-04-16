package com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoPresenter$onCreate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoPresenter;
import eq3.d;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.anchorinfo.bottombar.b;
import com.kuaishou.live.lite.sidebar.e;
import pg1.e;
import or5.d;
import xp5.i;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import xa3.a;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteAnchorInfoPresenter$onCreate$1 extends Lambda implements a	// class@001e41
{
    public final d $viewControllerManager;
    public final LiveLiteAnchorInfoPresenter this$0;

    public void LiveLiteAnchorInfoPresenter$onCreate$1(LiveLiteAnchorInfoPresenter p0,d p1){
       this.this$0 = p0;
       this.$viewControllerManager = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAnchorInfoPresenter$onCreate$1.class, "1")) {
          return;
       }
       LiveLiteAnchorInfoPresenter$onCreate$1 tthis$0 = this.this$0;
       LiveLiteAnchorInfoPresenter$onCreate$1 t$viewContro = this.$viewControllerManager;
       a.o(t$viewContro, "viewControllerManager");
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(t$viewContro, tthis$0, LiveLiteAnchorInfoPresenter.class, "9")) {
          LiveLiteAnchorInfoPresenter v = tthis$0.v;
          if (v == null) {
             a.S("sideBarService");
          }
          LiveLiteAnchorInfoPresenter w = tthis$0.w;
          if (w == null) {
             a.S("followManager");
          }
          LiveLiteAnchorInfoPresenter x = tthis$0.x;
          if (x == null) {
             a.S("infoService");
          }
          LiveLiteAnchorInfoPresenter z = tthis$0.z;
          if (z == null) {
             a.S("logPackageProvider");
          }
          LiveLiteAnchorInfoPresenter d = tthis$0.D;
          if (d == null) {
             a.S("bottomBarService");
          }
          LiveLiteAnchorInfoPresenter e = tthis$0.E;
          if (e == null) {
             a.S("fansGroupService");
          }
          b uob = new b(v, w, x, z, d, e);
          t$viewContro.xg(v2);
       }
       return;
    }
}
