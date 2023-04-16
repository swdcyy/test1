package com.kuaishou.tuna_core.widget.TunaRoundCornerLayout2;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import q05.a;
import android.view.ViewOutlineProvider;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View;

public class TunaRoundCornerLayout2 extends FrameLayout	// class@001136
{
    public Path b;
    public int c;

    public void TunaRoundCornerLayout2(Context p0){
       super(p0, null);
    }
    public void TunaRoundCornerLayout2(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TunaRoundCornerLayout2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaRoundCornerLayout2.class, "1")) {
       }else if(p1 == null){
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.R5);
          this.c = typedArray.getDimensionPixelSize(0, 0);
          typedArray.recycle();
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, TunaRoundCornerLayout2.class, "5")) {
          return;
       }
       a uoa = new a((float)this.c, 0, 0, this.getWidth(), (this.c + this.getHeight()));
       this.setOutlineProvider(v0);
       this.setClipToOutline(true);
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaRoundCornerLayout2.class, "3")) {
          return;
       }
       TunaRoundCornerLayout2 tb = this.b;
       if (tb != null) {
          p0.clipPath(tb);
       }
       super.dispatchDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TunaRoundCornerLayout2.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TunaRoundCornerLayout2.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.a();
       return;
    }
    public void setTopRadius(int p0){
       if (PatchProxy.isSupport(TunaRoundCornerLayout2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TunaRoundCornerLayout2.class, "4")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
}
