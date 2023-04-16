package com.kwai.component.photo.detail.slide.widget.MMUMaskView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xf6.d;
import xf6.l;
import java.lang.Integer;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class MMUMaskView extends FrameLayout	// class@000ab6
{
    public int b;

    public void MMUMaskView(Context p0){
       super(p0, null);
    }
    public void MMUMaskView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MMUMaskView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0xff000000;
       if (PatchProxy.applyVoid(null, this, MMUMaskView.class, "1")) {
       }else if(l.c("KEY_TEXTURE_BLACK_THREE_SECTION_DEBUG", false)){
          this.b = 0xffff0000;
       }
       return;
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(MMUMaskView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MMUMaskView.class, "4")) {
          return;
       }
       int i = -1;
       int i1 = 0;
       if (p0 != 48 && p0 != 80) {
          i = 0;
          i1 = -1;
       }
       View view = new View(this.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i, i1);
       layoutParams.gravity = p0;
       view.setBackgroundColor(this.b);
       this.addView(view, layoutParams);
       return;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(MMUMaskView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, MMUMaskView.class, "3")) {
          return;
       }
       super.onVisibilityChanged(p0, p1);
       if (!p1 && (!PatchProxy.applyVoid(null, this, MMUMaskView.class, "2") && this.getChildCount() <= 0)) {
          this.removeAllViews();
          this.a(48);
          this.a(80);
          this.a(3);
          this.a(5);
       }
    label_0044 :
       return;
    }
}
