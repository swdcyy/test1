package com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$a;
import android.view.View$OnClickListener;
import android.animation.ObjectAnimator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$c;
import android.animation.Animator$AnimatorListener;
import qrd.l1;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$d;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$b;

public final class NearbyMigrateGuideView extends FrameLayout	// class@000f96
{
    public KwaiImageView b;
    public SelectShapeTextView c;
    public SelectShapeTextView d;
    public LottieAnimationView e;
    public SelectShapeConstraintLayout f;
    public ObjectAnimator g;
    public ObjectAnimator h;
    public NearbyMigrateGuideView$b i;
    public String j;
    public boolean k;

    public void NearbyMigrateGuideView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void NearbyMigrateGuideView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void NearbyMigrateGuideView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.j = "";
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0f5f, this);
       View view = this.findViewById(R.id.iv_migrate_icon);
       a.o(view, "findViewById\(R.id.iv_migrate_icon\)");
       this.b = view;
       view = this.findViewById(R.id.tv_migrate_title);
       a.o(view, "findViewById\(R.id.tv_migrate_title\)");
       this.c = view;
       view = this.findViewById(R.id.tv_migrate_sub_title);
       a.o(view, "findViewById\(R.id.tv_migrate_sub_title\)");
       this.d = view;
       view = this.findViewById(R.id.lottie_migrate);
       a.o(view, "findViewById\(R.id.lottie_migrate\)");
       this.e = view;
       view = this.findViewById(R.id.top_guide_container);
       a.o(view, "findViewById\(R.id.top_guide_container\)");
       this.f = view;
       view.setOnClickListener(new NearbyMigrateGuideView$a(this));
    }
    public void NearbyMigrateGuideView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final ObjectAnimator getHideAnimator(){
       ObjectAnimator obj = PatchProxy.apply(null, this, NearbyMigrateGuideView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          obj = ObjectAnimator.ofFloat(this, "alpha", new float[2]{0x3f800000,0});
          obj.setDuration(250);
          obj.addListener(new NearbyMigrateGuideView$c(this));
          this.h = obj;
       }
       return this.h;
    }
    public final ObjectAnimator getShowAnimator(){
       ObjectAnimator obj = PatchProxy.apply(null, this, NearbyMigrateGuideView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          obj = ObjectAnimator.ofFloat(this.f, "alpha", new float[2]{0,0x3f800000});
          obj.setDuration(250);
          obj.addListener(new NearbyMigrateGuideView$d(this));
          obj.addUpdateListener(new NearbyMigrateGuideView$e(this));
          this.g = obj;
       }
       return this.g;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, NearbyMigrateGuideView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       NearbyMigrateGuideView tg = this.g;
       if (tg != null) {
          tg.cancel();
       }
       tg = this.h;
       if (tg != null) {
          tg.cancel();
       }
       this.e.f();
       return;
    }
    public final void setGuideShow(boolean p0){
       this.k = p0;
    }
    public final void setOnVisibleChangeListener(NearbyMigrateGuideView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyMigrateGuideView.class, "9")) {
          return;
       }
       a.p(p0, "onVisibleChangeListener");
       this.i = p0;
       return;
    }
}
