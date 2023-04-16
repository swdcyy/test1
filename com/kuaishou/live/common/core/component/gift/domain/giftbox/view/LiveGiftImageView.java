package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import rm1.h;
import android.view.ViewTreeObserver;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import a2.i0;
import java.lang.ref.WeakReference;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.facebook.drawee.view.DraweeView;
import java.util.Collection;
import ekd.q;
import android.graphics.Bitmap;
import cm1.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import dm1.i;
import java.lang.Boolean;
import em1.b;

public class LiveGiftImageView extends KwaiImageView	// class@00121e
{
    public WeakReference x;

    public void LiveGiftImageView(Context p0){
       super(p0);
    }
    public void LiveGiftImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveGiftImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void L(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftImageView.class, "1")) {
          return;
       }
       this.p0(h.a(p0));
       return;
    }
    public void P(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftImageView.class, "2")) {
          return;
       }
       this.p0(p0);
       return;
    }
    public ViewTreeObserver getViewTreeObserver(){
       LiveGiftImageView obj = PatchProxy.apply(null, this, LiveGiftImageView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i0.X(this)) {
          return super.getViewTreeObserver();
       }
       obj = this.x;
       if (obj == null) {
          return super.getViewTreeObserver();
       }
       ViewTreeObserver viewTreeObse = obj.get();
       if (viewTreeObse != null) {
          return viewTreeObse;
       }
       b.Z(LiveLogTag.GIFT, "LiveGiftImageView get ViewTreeObserver from weakRef failed");
       return super.getViewTreeObserver();
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGiftImageView.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       this.x = new WeakReference(this.getViewTreeObserver());
       return;
    }
    public final void p0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftImageView.class, "3")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Bitmap uBitmap = a.c(p0);
       if (uBitmap != null) {
          this.setImageBitmap(uBitmap);
       }else {
          super.P(p0);
          if (!i.c() && (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.TRUE, "otherDownload", null, a.class, "2"))) {
             a.a.m(p0, true, "otherDownload");
          }
       }
       return;
    }
}
