package com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import o56.a;
import android.content.Context;
import ekd.p1;
import com.yxcorp.utility.n;
import java.lang.NullPointerException;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$c;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class ForwardPicSectionFragment$e implements ViewTreeObserver$OnPreDrawListener	// class@001cf1
{
    public int b;
    public final ForwardPicSectionFragment c;

    public void ForwardPicSectionFragment$e(ForwardPicSectionFragment p0){
       this.c = p0;
       super();
       this.b = -1;
    }
    public final void a(){
       if (PatchProxy.applyVoidWithListener(null, this, ForwardPicSectionFragment$e.class, "3")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = ForwardPicSectionFragment.hi(this.c).getLayoutParams();
       if (layoutParams != null) {
          layoutParams.setMargins(0, (n.c(a.B, 48.00f) - p1.f(a.B)), 0, n.c(a.B, 24.00f));
          ForwardPicSectionFragment.hi(this.c).setLayoutParams(layoutParams);
          PatchProxy.onMethodExit(ForwardPicSectionFragment$e.class, "3");
          return;
       }else {
          PatchProxy.onMethodExit(ForwardPicSectionFragment$e.class, "3");
          throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
       }
    }
    public final void b(){
       if (PatchProxy.applyVoidWithListener(null, this, ForwardPicSectionFragment$e.class, "2")) {
          return;
       }
       Bitmap bitmap = ForwardPicSectionFragment.ji(this.c).getBitmap();
       if (bitmap != null) {
          ForwardPicSectionFragment.ii(this.c).setImageBitmap(bitmap);
          ViewGroup$LayoutParams layoutParams = ForwardPicSectionFragment.hi(this.c).getLayoutParams();
          layoutParams.width = (ForwardPicSectionFragment.hi(this.c).getHeight() * bitmap.getWidth()) / bitmap.getHeight();
          ForwardPicSectionFragment.hi(this.c).setLayoutParams(layoutParams);
       }
       PatchProxy.onMethodExit(ForwardPicSectionFragment$e.class, "2");
       return;
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.applyWithListener(null, this, ForwardPicSectionFragment$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b == -1) {
          try{
             this.a();
          }catch(java.lang.Exception e0){
          }
       }
    }
}
