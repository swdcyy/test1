package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$c;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditor$a;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tpc.e0;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.widget.RelativeLayout;
import android.graphics.RectF;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import android.animation.AnimatorListenerAdapter;
import ppc.d;

public final class VideoCoverProportionViewBinder$c implements CoverEditor$a	// class@000ea1
{
    public final VideoCoverProportionViewBinder b;

    public void VideoCoverProportionViewBinder$c(VideoCoverProportionViewBinder p0){
       this.b = p0;
       super();
    }
    public void R6(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoCoverProportionViewBinder$c.class, "1")) {
          return;
       }
       if (this.b.G().o0()) {
          this.b.M().c();
          EditDecorationContainerView uEditDecorat = this.b.H();
          int i = -1;
          if (uEditDecorat != null) {
             uEditDecorat.setLayoutParams(new RelativeLayout$LayoutParams(i, i));
          }
          uEditDecorat = this.b.H();
          float f = 0;
          if (uEditDecorat != null) {
             uEditDecorat.setTranslationY(f);
          }
          this.b.N().setLayoutParams(new RelativeLayout$LayoutParams(i, i));
          this.b.N().setTranslationX(f);
          this.b.N().setTranslationY(f);
          this.b.N().setScaleX(0x3f800000);
          this.b.N().setScaleY(0x3f800000);
          VideoCoverProportionViewBinder$c tb = this.b;
          tb.f.setOriginLayoutRect(tb.t);
          BaseEditorPreviewContainerLayout.e(this.b.f, true, false, 2, objArray);
          tb = this.b;
          tb.f.a(tb.u, false, null, true, 0);
       }
       return;
    }
    public boolean onBackPressed(){
       return d.a(this);
    }
}
