package com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarShootView;
import com.yxcorp.gifshow.widget.CustomLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.ImageSwitchView;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.CustomLayout$a;
import com.kwai.component.uiconfig.burnin.BurnInOptUtils;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarShootView$bannerView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarShootView$specialIconView$2;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.CameraIconImageSwitcher;
import java.lang.Boolean;
import java.lang.Integer;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import androidx.core.view.ViewGroupKt$b;
import hn5.b0;
import qsd.d;

public final class BottomBarShootView extends CustomLayout	// class@000f3d
{
    public final KwaiImageView e;
    public final KwaiImageView f;
    public final ImageSwitchView g;
    public final FrameLayout h;
    public final p i;
    public final p j;

    public void BottomBarShootView(Context p0){
       a.p(p0, "context");
       super(p0, null, 0);
       KwaiImageView kwaiImageVie = new KwaiImageView(p0);
       kwaiImageVie.setId(R.id.btn_shoot_white);
       kwaiImageVie.setLayoutParams(new FrameLayout$LayoutParams(this.getWRAP_CONTENT(), this.getWRAP_CONTENT(), 17));
       this.e = kwaiImageVie;
       KwaiImageView kwaiImageVie1 = new KwaiImageView(p0);
       kwaiImageVie1.setId(R.id.btn_shoot_black);
       kwaiImageVie1.setLayoutParams(new FrameLayout$LayoutParams(this.getWRAP_CONTENT(), this.getWRAP_CONTENT(), 17));
       this.f = kwaiImageVie1;
       ImageSwitchView imageSwitchV = new ImageSwitchView(p0);
       imageSwitchV.setId(R.id.btn_shoot_skin);
       imageSwitchV.setLayoutParams(new FrameLayout$LayoutParams(this.getWRAP_CONTENT(), this.getWRAP_CONTENT(), 17));
       imageSwitchV.setVisibility(8);
       this.g = imageSwitchV;
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.default_btn_shoot_container);
       uFrameLayout.setLayoutParams(new CustomLayout$a(this.getWRAP_CONTENT(), this.getWRAP_CONTENT()));
       uFrameLayout.addView(kwaiImageVie);
       uFrameLayout.addView(kwaiImageVie1);
       BurnInOptUtils.c(uFrameLayout);
       this.h = uFrameLayout;
       this.i = s.c(new BottomBarShootView$bannerView$2(p0));
       this.j = s.c(new BottomBarShootView$specialIconView$2(this, p0));
       this.setId(R.id.shoot_container);
       this.b(uFrameLayout);
    }
    public final KwaiImageView getBannerView(){
       Object obj = PatchProxy.apply(null, this, BottomBarShootView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final KwaiImageView getBlackShootView(){
       return this.f;
    }
    public final CameraIconImageSwitcher getSpecialIconView(){
       Object obj = PatchProxy.apply(null, this, BottomBarShootView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final KwaiImageView getWhiteShootView(){
       return this.e;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, BottomBarShootView.class, "6")) {
          return;
       }
       this.a(this.getSpecialIconView());
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(BottomBarShootView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, BottomBarShootView.class, "4")) {
             return;
          }
       }
       if (!PatchProxy.applyVoid(null, this, CustomLayout.class, "8")) {
          Iterator iterator = ViewGroupKt.b(this).iterator();
          Iterator iterator1 = iterator;
          while (iterator1.hasNext()) {
             Object obj = iterator1.next();
             if (PatchProxy.applyVoidOneRefs(obj, this, CustomLayout.class, "20")) {
                continue ;
             }
             a.p(obj, "$this$layoutCenter");
             CustomLayout.i(this, obj, this.k(obj), this.j(obj), false, 4, null);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(BottomBarShootView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BottomBarShootView.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (!PatchProxy.applyVoid(null, this, CustomLayout.class, "7")) {
          Iterator iterator = ViewGroupKt.b(this).iterator();
          Iterator iterator1 = iterator;
          while (iterator1.hasNext()) {
             this.c(iterator1.next());
          }
       }
       this.setMeasuredDimension(d.H0((b0.a.a() * (float)this.f(75))), this.f(49));
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(BottomBarShootView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomBarShootView.class, "5")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0.40f: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
