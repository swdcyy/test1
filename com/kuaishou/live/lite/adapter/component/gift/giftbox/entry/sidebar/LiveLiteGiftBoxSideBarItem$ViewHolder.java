package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder;
import android.view.View;
import android.view.View$OnClickListener;
import q73.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeView;
import wh5.c;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$Request;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder$1;
import msd.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import r73.a;
import com.kwai.robust.PatchProxyResult;
import ok.x;
import java.lang.Boolean;
import com.yxcorp.image.request.a;
import s0d.e;
import kb.c;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.a;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder$a;
import android.animation.Animator$AnimatorListener;
import android.graphics.Bitmap;

public final class LiveLiteGiftBoxSideBarItem$ViewHolder	// class@001dcc
{
    public final View a;
    public LiveLottieAnimationView b;
    public KwaiImageView c;
    public SelectShapeView d;
    public KwaiImageView e;
    public TextView f;
    public Bitmap g;
    public c h;
    public b i;
    public boolean j;

    public void LiveLiteGiftBoxSideBarItem$ViewHolder(View p0,View$OnClickListener p1,b p2,boolean p3){
       LiveLiteGiftBoxSideBarItem$ViewHolder ti;
       b lockBottomIc;
       LiveLiteSideBarIconHelper$Request request;
       LiveLiteGiftBoxSideBarItem$ViewHolder ti1;
       a.p(p0, "sideBarGiftContainer");
       a.p(p1, "listener");
       super();
       this.i = p2;
       this.j = p3;
       this.a = p0;
       p0.setOnClickListener(p1);
       View view = p0.findViewById(R.id.live_gift_sidebar_icon);
       a.o(view, "rootView.findViewById\(R.id.live_gift_sidebar_icon\)");
       this.c = view;
       view = p0.findViewById(R.id.live_gift_sidebar_default_icon);
       a.o(view, "rootView.findViewById\(R.¡­ift_sidebar_default_icon\)");
       this.e = view;
       this.d = p0.findViewById(0x7f0a1d08);
       p2 = null;
       if (c.b()) {
          if (this.j != null) {
             ti = this.i;
             if (ti != null) {
                lockBottomIc = ti.lockBottomIconUrl;
             }else {
             label_005a :
                lockBottomIc = p2;
             }
          }else {
             ti = this.i;
             if (ti != null) {
                lockBottomIc = ti.lockIconUrl;
             }else {
                goto label_005a ;
             }
          }
          request = 0x7f0814bd;
       }else if(this.j != null){
          ti = this.i;
          if (ti != null) {
             lockBottomIc = ti.a();
          }else {
          label_0075 :
             lockBottomIc = p2;
          }
       }else {
          ti = this.i;
          if (ti != null) {
             lockBottomIc = ti.b();
          }else {
             goto label_0075 ;
          }
       }
       request = 0x7f0814be;
       if (lockBottomIc != null) {
          request = new LiveLiteSideBarIconHelper$Request(3, this.c, this.e, lockBottomIc);
          request.f(new LiveLiteGiftBoxSideBarItem$ViewHolder$1(this));
          LiveLiteSideBarIconHelper.a(request);
          object oobject = lockBottomIc[0];
          if (!PatchProxy.applyVoidOneRefs(oobject, this, LiveLiteGiftBoxSideBarItem$ViewHolder.class, "9")) {
             Boolean uBoolean = PatchProxy.apply(p2, p2, a.class, "1");
             if (uBoolean == PatchProxyResult.class) {
                uBoolean = a.a.get();
             }
             if (!uBoolean.booleanValue() && (this.g == null && oobject != null)) {
                e uoe = a.r(oobject).q();
                ti1 = this.h;
                if (ti1 != null) {
                   ti1.close();
                }
                c uoc = Fresco.getImagePipeline().fetchDecodedImage(uoe, p2);
                this.h = uoc;
                if (uoc != null) {
                   uoc.f(new a(this), AsyncTask.THREAD_POOL_EXECUTOR);
                }
             }
          }
       }else {
          this.c.setActualImageResource(request);
       }
    label_00ef :
       TextView textView = p0.findViewById(R.id.live_sidebar_item_text);
       a.o(textView, "text");
       this.f = textView;
       ti1 = this.i;
       b itemText = (ti1 != null)? ti1.itemText: p2;
       textView.setText(itemText);
       p0 = p0.findViewById(R.id.live_gift_enhance_animation);
       a.o(p0, "rootView.findViewById\(R.¡­e_gift_enhance_animation\)");
       this.b = p0;
       if (this.j != null) {
          ti = this.i;
          if (ti != null) {
             p2 = ti.lottieAnimationBottomUrl;
          }
       }else {
          ti = this.i;
          if (ti != null) {
             p2 = ti.lottieAnimationUrl;
          }
       }
       p0.setAnimationFromUrl(p2);
       this.b.a(new LiveLiteGiftBoxSideBarItem$ViewHolder$a(this));
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarItem$ViewHolder.class, "7")) {
          return;
       }
       this.b.f();
       return;
    }
    public final LiveLottieAnimationView b(){
       return this.b;
    }
    public final SelectShapeView c(){
       return this.d;
    }
    public final KwaiImageView d(){
       return this.c;
    }
    public final b e(){
       return this.i;
    }
    public final boolean f(){
       return this.j;
    }
    public final void g(Bitmap p0){
       this.g = p0;
    }
}
