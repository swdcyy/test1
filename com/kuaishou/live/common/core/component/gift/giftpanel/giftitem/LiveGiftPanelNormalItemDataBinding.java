package com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemDataBinding;
import com.kuaishou.live.common.core.component.gift.base.LifecycleDataBinding;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBackgroundView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveSurroundShimmerView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTagView;
import com.kwai.robust.PatchProxyResult;
import vl1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vl1.b;
import java.util.Objects;
import java.lang.Integer;
import vl1.c;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.a;
import android.animation.ValueAnimator;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIMarkLabel;
import java.lang.Boolean;
import java.lang.Number;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIDynamicTextLabel;
import androidx.collection.SimpleArrayMap;
import java.lang.Long;
import d61.v;
import android.animation.Animator;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.a$b;
import android.animation.AnimatorSet;
import vl1.v;
import android.animation.Animator$AnimatorListener;
import java.util.List;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.google.common.collect.ImmutableList;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import android.widget.ImageView;
import rm1.f;
import com.kuaishou.live.common.core.basic.tools.l;

public final class LiveGiftPanelNormalItemDataBinding extends LifecycleDataBinding	// class@0012d0
{
    public final LiveGiftBackgroundView c;
    public final LiveSurroundShimmerView d;
    public final KwaiSizeAdjustableTextView e;
    public final LiveGiftImageView f;
    public final KwaiImageView g;
    public final TextView h;
    public final LiveGiftTagView i;
    public b j;
    public a k;
    public ValueAnimator l;
    public LiveGiftPanelNormalItemVM m;
    public final View n;

    public void LiveGiftPanelNormalItemDataBinding(LifecycleOwner p0,View p1){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "itemView");
       super(p0);
       this.n = p1;
       this.c = p1.findViewById(0x7f0a43af);
       this.d = p1.findViewById(0x7f0a43bb);
       this.e = p1.findViewById(0x7f0a41bc);
       LiveGiftImageView liveGiftImag = p1.findViewById(R.id.iv_icon_panel_item_layout);
       this.f = liveGiftImag;
       this.g = p1.findViewById(0x7f0a1538);
       this.h = p1.findViewById(0x7f0a41bd);
       LiveGiftTagView liveGiftTagV = p1.findViewById(R.id.v_tag_panel_item_layout);
       this.i = liveGiftTagV;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       d obj = PatchProxy.apply(null, null, uod, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = d.a;
          Objects.requireNonNull(obj);
          if (PatchProxy.isSupport(uod)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(-1), obj, uod, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }
          }
          obj = new c(-1);
       }
       this.j = obj;
       this.k = new a(liveGiftTagV, liveGiftImag);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveGiftPanelNormalItemDataBinding.class, "10")) {
          return;
       }
       this.j.b();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveGiftPanelNormalItemDataBinding.class, "12")) {
          return;
       }
       LiveGiftPanelNormalItemDataBinding tl = this.l;
       if (tl != null) {
          tl.cancel();
       }
       tl = this.d;
       a.o(tl, "shimmerView");
       tl.setVisibility(8);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveGiftPanelNormalItemDataBinding.class, "8")) {
          return;
       }
       this.k.a();
       return;
    }
    public final void e(LiveGiftPanelNormalItemVM p0){
       boolean b;
       a uoa3;
       long l;
       Object obj = this;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, LiveGiftPanelNormalItemDataBinding.class, "7")) {
          return;
       }
       this.g(p0);
       UIMarkLabel value = p0.u0().getValue();
       String str = String.valueOf(p0.v0().getValue());
       LiveGiftPanelNormalItemDataBinding k = obj.k;
       Objects.requireNonNull(k);
       UIMarkLabel obj1 = PatchProxy.applyTwoRefs(str, value, k, uoa, "4");
       String str1 = "3";
       Object[] objArray = null;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(value != null && value.g()){
          obj1 = PatchProxy.apply(objArray, value, UIMarkLabel.class, str1);
          if (obj1 != patchProxyRe) {
             l = obj1.longValue();
          }else {
             obj1 = value.dynamicTextLabel;
             l = (obj1 != null)? obj1.expireTimeMS: 0;
          }
          if (l - k.c() > 0 && (k.c() - v.i(a.f.get(str)) > 0 && k.a == null)) {
             b = true;
          }
       }
    label_0088 :
       b = false;
       if (b) {
          k = obj.k;
          Objects.requireNonNull(k);
          obj1 = PatchProxy.apply(objArray, k, uoa, str1);
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             uoa3 = k.c;
             b = (uoa3 != null && uoa3.isRunning())? true: false;
          }
          if (!b) {
             LiveGiftPanelNormalItemDataBinding k1 = obj.k;
             Objects.requireNonNull(k1);
             if (!PatchProxy.applyVoidTwoRefs(str, value, k1, uoa, "2")) {
                a d = k1.d;
                k1.b = new a$b(d, value);
                a e = k1.e;
                a uoa1 = e;
                a uoa2 = e;
                if (!PatchProxy.applyVoidFourRefs(str, value, d, uoa1, k1, a.class, "11")) {
                   k1.b(str, value, false);
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   v ov = v9;
                   v ov1 = v9;
                   ov = new v(k1, uoa2, str, value, d);
                   uAnimatorSet.addListener(ov1);
                   uAnimatorSet.setStartDelay(2000);
                   uoa3 = uoa2;
                   ImmutableList immutableLis = PatchProxy.applyOneRefs(uoa3, k1, uoa, "12");
                   if (immutableLis != patchProxyRe) {
                   }else {
                      PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3fa66666}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3fa66666})};
                      propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3fa66666,0x3f6e147b}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3fa66666,0x3f6e147b})};
                      propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f6e147b,0x3f91eb85}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f6e147b,0x3f91eb85})};
                      propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f91eb85,0x3f666666}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f91eb85,0x3f666666})};
                      propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f666666,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f666666,0x3f800000})};
                      propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f99999a}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f99999a})};
                      propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f99999a,0x3f6e147b}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f99999a,0x3f6e147b})};
                      propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f6e147b,0x3f91eb85}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f6e147b,0x3f91eb85})};
                      propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f91eb85,0x3f666666}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f91eb85,0x3f666666})};
                      propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f666666,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f666666,0x3f800000})};
                      immutableLis = ImmutableList.of(ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(240), ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(200), ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(160), ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(160), ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(160), ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(200), ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(200), ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(160), ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(160), ObjectAnimator.ofPropertyValuesHolder(uoa3, propertyValu).setDuration(160));
                   }
                   uAnimatorSet.playSequentially(immutableLis);
                   uAnimatorSet.start();
                   k1.c = uAnimatorSet;
                }
             }
          }
       }else {
          obj.k.a();
       }
    label_0287 :
       return;
    }
    public final void f(UIImage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalItemDataBinding.class, "14")) {
          return;
       }
       LiveGiftPanelNormalItemDataBinding tf = this.f;
       a.o(tf, "iconView");
       tf.setVisibility(0);
       tf = this.g;
       a.o(tf, "dynamicIconView");
       tf.setVisibility(4);
       f.a(this.f, p0.a());
       tf = this.f;
       a.o(tf, "iconView");
       tf.setScaleX(p0.b());
       tf = this.f;
       a.o(tf, "iconView");
       tf.setScaleY(p0.b());
       return;
    }
    public final void g(LiveGiftPanelNormalItemVM p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalItemDataBinding.class, "6")) {
          return;
       }
       this.i.setDynamicData(p0.u0().getValue());
       this.i.setImageData(p0.w0().getValue());
       this.i.b();
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalItemDataBinding.class, "5")) {
          return;
       }
       a.p(p0, "owner");
       if (!PatchProxy.applyVoid(null, this, LiveGiftPanelNormalItemDataBinding.class, "2")) {
          this.b();
          l.j(this.g);
          this.d();
          this.c();
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalItemDataBinding.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       LiveGiftPanelNormalItemDataBinding tm = this.m;
       if (tm != null) {
          this.e(tm);
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalItemDataBinding.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       this.d();
       return;
    }
}
