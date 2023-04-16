package com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import o83.f;
import msd.a;
import or5.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController$c;
import com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController$recommendAnchorInfoContainer$2;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xc3.l;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import android.view.View;
import xc3.e;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController$b;
import z1.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class LiteRecommendAnchorInfoController extends ViewController	// class@001e2c
{
    public final LiteRecommendAnchorInfoController$c j;
    public final p k;
    public Rect l;
    public final LiveLiteRecommendSideBarService m;
    public final f n;
    public final a o;
    public final d p;

    public void LiteRecommendAnchorInfoController(LiveLiteRecommendSideBarService p0,f p1,a p2,d p3){
       a.p(p0, "recommendSideBarService");
       a.p(p3, "infoService");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.j = new LiteRecommendAnchorInfoController$c(this);
       this.k = s.c(new LiteRecommendAnchorInfoController$recommendAnchorInfoContainer$2(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiteRecommendAnchorInfoController.class, "2")) {
          return;
       }
       this.m.Q5(this.j);
       LiteRecommendAnchorInfoController tn = this.n;
       if (tn != null) {
          LiveData liveData = tn.d();
          if (liveData != null) {
             liveData.observe(this, new LiteRecommendAnchorInfoController$a(this));
          }
       }
       this.V2().setLayoutParams(new FrameLayout$LayoutParams(((n.z(a.b()) - a1.d(R.dimen.arg_RES_7f070591)) - a1.d(R.dimen.arg_RES_7f0702ab)), -2));
       this.V2().setTag(d.a, LayoutViewType.RecommendAnchorInfoBar.name());
       this.V2().setClickable(true);
       int i = 8;
       this.V2().setVisibility(i);
       this.R2(this.V2());
       if (this.m.C4()) {
          i = 0;
       }
       this.W2(i);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiteRecommendAnchorInfoController.class, "6")) {
          return;
       }
       this.m.j2(this.j);
       return;
    }
    public void L2(){
       if (PatchProxy.applyVoid(null, this, LiteRecommendAnchorInfoController.class, "3")) {
          return;
       }
       this.m.F5(new e(this.p.j0(), new LiteRecommendAnchorInfoController$b(this)));
       return;
    }
    public final ViewGroup V2(){
       Object obj = PatchProxy.apply(null, this, LiteRecommendAnchorInfoController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final void W2(int p0){
       LiteRecommendAnchorInfoController tn;
       LiteRecommendAnchorInfoController liteRecommen = LiteRecommendAnchorInfoController.class;
       if (PatchProxy.isSupport(liteRecommen) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liteRecommen, "4")) {
          return;
       }
       if (p0 == this.V2().getVisibility()) {
          return;
       }
       ViewGroup viewGroup = this.V2();
       if (!p0) {
          this.V2().removeAllViews();
          tn = this.n;
          if (tn != null) {
             tn.c(this.V2());
          }
          tn = 0;
       }else {
          this.V2().removeAllViews();
          p0 = 8;
       }
       viewGroup.setVisibility(tn);
       return;
    }
}
