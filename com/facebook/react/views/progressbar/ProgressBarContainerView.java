package com.facebook.react.views.progressbar.ProgressBarContainerView;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.ProgressBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.graphics.PorterDuff$Mode;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

public class ProgressBarContainerView extends FrameLayout	// class@0013da
{
    public Integer b;
    public boolean c;
    public boolean d;
    public double e;
    public ProgressBar f;

    public void ProgressBarContainerView(Context p0){
       super(p0);
       this.c = true;
       this.d = true;
    }
    public void setAnimating(boolean p0){
       this.d = p0;
    }
    public final void setColor(ProgressBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressBarContainerView.class, "3")) {
          return;
       }
       Drawable indeterminat = (p0.isIndeterminate())? p0.getIndeterminateDrawable(): p0.getProgressDrawable();
       if (indeterminat == null) {
          return;
       }else {
          ProgressBarContainerView tb = this.b;
          if (tb != null) {
             indeterminat.setColorFilter(tb.intValue(), PorterDuff$Mode.SRC_IN);
          }else {
             indeterminat.clearColorFilter();
          }
          return;
       }
    }
    public void setColor(Integer p0){
       this.b = p0;
    }
    public void setIndeterminate(boolean p0){
       this.c = p0;
    }
    public void setProgress(double p0){
       this.e = p0;
    }
    public void setStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressBarContainerView.class, "1")) {
          return;
       }
       ProgressBar progressBar = ReactProgressBarViewManager.createProgressBar(this.getContext(), ReactProgressBarViewManager.getStyleFromString(p0));
       this.f = progressBar;
       progressBar.setMax(1000);
       this.removeAllViews();
       this.addView(this.f, new ViewGroup$LayoutParams(-1, -1));
       return;
    }
}
