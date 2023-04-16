package com.kuaishou.live.core.show.profilecard.widget.LiveInsetConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class LiveInsetConstraintLayout extends ConstraintLayout	// class@000dfd
{
    public final int B;
    public final Drawable C;

    public void LiveInsetConstraintLayout(Context p0){
       super(p0, null);
    }
    public void LiveInsetConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveInsetConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setWillNotDraw(false);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.F2);
       this.C = typedArray.getDrawable(false);
       this.B = typedArray.getDimensionPixelOffset(1, false);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveInsetConstraintLayout.class, "1")) {
          return;
       }
       super.onDraw(p0);
       LiveInsetConstraintLayout tC = this.C;
       if (tC != null) {
          tC.setBounds(0, this.B, this.getWidth(), this.getHeight());
          this.C.draw(p0);
       }
       return;
    }
}
