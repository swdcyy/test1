package com.kuaishou.live.lite.like.f$a;
import com.kuaishou.live.lite.like.f;
import android.view.ViewGroup;
import com.google.gson.JsonObject;
import java.lang.Object;
import wb3.h;
import android.view.View$OnClickListener;
import fg6.a;
import com.kuaishou.live.lite.like.LiveLiteLikeSideBarConfig;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.google.gson.Gson;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;
import com.kuaishou.live.lite.like.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.like.count.i;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.lite.like.f$a$a;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$Request;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper;
import e93.f;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler;
import com.kuaishou.live.lite.like.e;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$a;
import msd.l;
import android.widget.ImageView;
import com.kuaishou.live.lite.like.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Boolean;
import ekd.j;

public class f$a	// class@0009f3
{
    public final ViewGroup a;
    public final KwaiImageView b;
    public final KwaiImageView c;
    public final LiveLottieAnimationView d;
    public final TextView e;
    public long f;
    public LiveLiteLikeSideBarConfig g;
    public final f h;

    public void f$a(f p0,ViewGroup p1,JsonObject p2){
       f a;
       this.h = p0;
       super();
       this.f = 1;
       this.a = p1;
       p1.setOnClickListener(new h(this));
       if (p2 != null) {
          this.g = a.a.c(p2, LiveLiteLikeSideBarConfig.class);
       }
       TextView textView = p1.findViewById(R.id.live_sidebar_like_count_item_text);
       this.e = textView;
       a = p0.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(textView, a, c.class, "3")) {
          a.d.a(textView);
       }
       this.b = p1.findViewById(0x7f0a2582);
       this.c = p1.findViewById(0x7f0a2580);
       this.d();
       LiveLottieAnimationView liveLottieAn = p1.findViewById(R.id.live_sidebar_like_item_lottie_view);
       this.d = liveLottieAn;
       f$a tg = this.g;
       if (tg != null) {
          liveLottieAn.setAnimationFromUrl(tg.mLottieAnimationUrl);
       }
       liveLottieAn.setProgress(0x3f800000);
       liveLottieAn.a(new f$a$a(this, p0));
       return;
    }
    public final void a(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "6")) {
          return;
       }
       LiveLiteSideBarIconHelper.a(new LiveLiteSideBarIconHelper$Request(2, this.b, this.c, p0));
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "1")) {
          return;
       }
       f a = this.h.a;
       f$a te = this.e;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(te, a, c.class, "4")) {
          a.d.e(te);
       }
       f.g(f.class);
       if (this.h.g != null) {
          this.a.setOnClickListener(objArray);
          this.b.i0();
          this.d.t();
          this.d.j(true);
          LiveLiteViewRecycler.d.d(this.h.g, e.b);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "4")) {
          return;
       }
       this.b.setVisibility(4);
       this.d.setVisibility(0);
       if (this.d.p()) {
          this.d.f();
       }
       this.d.s();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "5")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       if (k0.a(this.h.a.i, d.a).or(Boolean.FALSE).booleanValue() && !j.h(this.g.mSelectedIconUrl)) {
          this.a(this.g.mSelectedIconUrl);
       }else if(!j.h(this.g.mIconUrl)){
          this.a(this.g.mIconUrl);
       }
       return;
    }
}
