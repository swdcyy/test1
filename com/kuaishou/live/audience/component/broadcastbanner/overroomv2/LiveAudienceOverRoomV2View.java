package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import java.lang.Integer;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.text.TextPaint;
import android.graphics.Shader;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.Animatable;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View$a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class LiveAudienceOverRoomV2View extends SelectShapeRelativeLayout	// class@000a4c
{
    public final RelativeLayout c;
    public final KwaiImageView d;
    public final SelectShapeLinearLayout e;
    public final LiveMediumTextView f;
    public final RelativeLayout g;
    public final KwaiImageView h;
    public final TextView i;
    public final View j;
    public final KwaiImageView k;
    public final KwaiLottieAnimationView l;
    public final RelativeLayout m;
    public final LinearLayout n;
    public final KwaiImageView o;
    public final TextView p;
    public final ImageView q;
    public boolean r;
    public boolean s;
    public boolean t;
    public y u;
    public LiveAudienceOverRoomV2View$a v;
    public View$OnClickListener w;
    public HashMap x;

    public void LiveAudienceOverRoomV2View(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveAudienceOverRoomV2View(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LiveAudienceOverRoomV2View(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.r = true;
       this.s = true;
       a.d(this.getContext(), R.layout.arg_RES_7f0d0cef, this, true);
       View view = this.findViewById(R.id.live_broadcast_banner_new_style_pre_part);
       a.o(view, "findViewById\(R.id.live_b¡­anner_new_style_pre_part\)");
       this.c = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_pre_part_image);
       a.o(view, "findViewById\(R.id.live_b¡­new_style_pre_part_image\)");
       this.d = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_pre_part_text);
       a.o(view, "findViewById\(R.id.live_b¡­_new_style_pre_part_text\)");
       this.f = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_pre_part_text_container);
       a.o(view, "findViewById\(R.id.live_b¡­_pre_part_text_container\)");
       this.e = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_after_part);
       a.o(view, "findViewById\(R.id.live_b¡­ner_new_style_after_part\)");
       this.g = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_after_part_image);
       a.o(view, "findViewById\(R.id.live_b¡­w_style_after_part_image\)");
       this.h = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_after_part_username);
       a.o(view, "findViewById\(R.id.live_b¡­tyle_after_part_username\)");
       this.i = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_after_part_live_icon);
       a.o(view, "findViewById\(R.id.live_b¡­yle_after_part_live_icon\)");
       this.j = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_after_part_user_avatar);
       a.o(view, "findViewById\(R.id.live_b¡­e_after_part_user_avatar\)");
       this.k = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_after_part_user_avatar_ring_animation);
       a.o(view, "findViewById\(R.id.live_b¡­er_avatar_ring_animation\)");
       this.l = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_bottom_part);
       a.o(view, "findViewById\(R.id.live_b¡­er_new_style_bottom_part\)");
       this.m = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_bottom_part_text);
       a.o(view, "findViewById\(R.id.live_b¡­w_style_bottom_part_text\)");
       this.p = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_bottom_part_image);
       a.o(view, "findViewById\(R.id.live_b¡­_style_bottom_part_image\)");
       this.o = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_bottom_part_content);
       a.o(view, "findViewById\(R.id.live_b¡­tyle_bottom_part_content\)");
       this.n = view;
       view = this.findViewById(R.id.live_broadcast_banner_new_style_close_view);
       a.o(view, "findViewById\(R.id.live_b¡­ner_new_style_close_view\)");
       this.q = view;
       this.setClipChildren(true);
    }
    public final void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceOverRoomV2View.class, "17")) {
          return;
       }
       p0.animate().setListener(null);
       p0.animate().cancel();
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceOverRoomV2View.class, "4")) {
          return;
       }
       this.c(this);
       this.c(this.c);
       this.c(this.m);
       this.c(this.n);
       this.h(this.h);
       this.h(this.d);
       return;
    }
    public final void e(TextView p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveAudienceOverRoomV2View.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveAudienceOverRoomV2View.class, "14")) {
          return;
       }
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)p3, 0, p1, p2, Shader$TileMode.CLAMP);
       TextPaint paint = p0.getPaint();
       a.o(paint, "textView.paint");
       paint.setShader(v0);
       p0.invalidate();
       return;
    }
    public final void f(View p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveAudienceOverRoomV2View.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveAudienceOverRoomV2View.class, "15")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$LayoutParams layoutParams1 = layoutParams;
          layoutParams1.leftMargin = p1;
          layoutParams1.rightMargin = p2;
          layoutParams1.bottomMargin = p3;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void g(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceOverRoomV2View.class, "12")) {
          return;
       }
       a controller = p0.getController();
       if (controller != null) {
          Animatable animatable = controller.getAnimatable();
          if (animatable != null) {
             animatable.start();
          }
       }
       return;
    }
    public final String getClickAreaType(){
       String obj = PatchProxy.apply(null, this, LiveAudienceOverRoomV2View.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.r != null && !this.c.getTranslationY())? "IMG": "IMG_VIDEO";
       return obj;
    }
    public final View$OnClickListener getCloseClickListener(){
       return this.w;
    }
    public final LiveAudienceOverRoomV2View$a getOnDismissListener(){
       return this.v;
    }
    public final void h(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceOverRoomV2View.class, "13")) {
          return;
       }
       a controller = p0.getController();
       if (controller != null) {
          Animatable animatable = controller.getAnimatable();
          if (animatable != null && animatable.isRunning()) {
             animatable.stop();
          }
       }
       p0.setController(null);
       return;
    }
    public final void setCloseClickListener(View$OnClickListener p0){
       this.w = p0;
    }
    public final void setOnDismissListener(LiveAudienceOverRoomV2View$a p0){
       this.v = p0;
    }
}
