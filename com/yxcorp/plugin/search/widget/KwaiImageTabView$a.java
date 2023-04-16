package com.yxcorp.plugin.search.widget.KwaiImageTabView$a;
import ub.a;
import com.yxcorp.plugin.search.widget.KwaiImageTabView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.FrameLayout;

public class KwaiImageTabView$a extends a	// class@0007c8
{
    public final KwaiImageTabView b;

    public void KwaiImageTabView$a(KwaiImageTabView p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiImageTabView$a.class, "1")) {
       }else {
          KwaiImageTabView$a tb = this.b;
          p1 = tb.f;
          KwaiImageTabView g = tb.g;
          if (!PatchProxy.isSupport(KwaiImageTabView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(g), tb, KwaiImageTabView.class, "1")) {
             tb.b.getLayoutParams().width = g;
             tb.b.getLayoutParams().height = p1;
             tb.c.getLayoutParams().width = g;
             g.height = p1;
             tb.requestLayout();
          }
       }
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
    }
    public void onIntermediateImageSet(String p0,Object p1){
    }
    public void onRelease(String p0){
    }
    public void onSubmit(String p0,Object p1){
    }
}
