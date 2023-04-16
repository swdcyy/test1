package com.yxcorp.gifshow.ad.widget.AdRoundCornerWebViewLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.gifshow.ad.widget.AdRoundCornerWebViewLayout$a;
import android.view.ViewOutlineProvider;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View;

public class AdRoundCornerWebViewLayout extends FrameLayout	// class@001919
{
    public Path b;
    public int c;

    public void AdRoundCornerWebViewLayout(Context p0){
       super(p0, null);
    }
    public void AdRoundCornerWebViewLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AdRoundCornerWebViewLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdRoundCornerWebViewLayout.class, "1")) {
       }else if(p1 == null){
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.i);
          this.c = typedArray.getDimensionPixelSize(0, 0);
          typedArray.recycle();
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, AdRoundCornerWebViewLayout.class, "5")) {
          return;
       }
       AdRoundCornerWebViewLayout$a uoa = new AdRoundCornerWebViewLayout$a((float)this.c, 0, 0, this.getWidth(), (this.c + this.getHeight()));
       this.setOutlineProvider(v0);
       this.setClipToOutline(true);
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdRoundCornerWebViewLayout.class, "3")) {
          return;
       }
       AdRoundCornerWebViewLayout tb = this.b;
       if (tb != null) {
          p0.clipPath(tb);
       }
       super.dispatchDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AdRoundCornerWebViewLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AdRoundCornerWebViewLayout.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.a();
       return;
    }
    public void setTopRadius(int p0){
       if (PatchProxy.isSupport(AdRoundCornerWebViewLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdRoundCornerWebViewLayout.class, "4")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
}
