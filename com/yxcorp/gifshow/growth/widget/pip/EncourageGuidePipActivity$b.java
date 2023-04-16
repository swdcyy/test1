package com.yxcorp.gifshow.growth.widget.pip.EncourageGuidePipActivity$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import com.yxcorp.gifshow.growth.widget.pip.EncourageGuidePipActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup$LayoutParams;
import android.app.Activity;

public final class EncourageGuidePipActivity$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0015f5
{
    public final View b;
    public final int c;
    public final EncourageGuidePipActivity d;

    public void EncourageGuidePipActivity$b(View p0,int p1,EncourageGuidePipActivity p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoidWithListener(null, this, EncourageGuidePipActivity$b.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (this.c != this.b.getLayoutParams().height) {
          this.b.getLayoutParams().height = this.c;
          this.b.getLayoutParams().width = (this.b.getHeight() * 16) / 9;
          this.b.requestLayout();
       }
       View view = this.d.findViewById(R.id.pip_close_img);
       if (view != null) {
          view.setVisibility(0);
       }
       PatchProxy.onMethodExit(EncourageGuidePipActivity$b.class, "1");
       return;
    }
}
