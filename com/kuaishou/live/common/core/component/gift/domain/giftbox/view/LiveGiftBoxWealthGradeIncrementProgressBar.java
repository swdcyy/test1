package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxWealthGradeIncrementProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.graphics.Path$Direction;
import java.lang.Integer;

public class LiveGiftBoxWealthGradeIncrementProgressBar extends AppCompatImageView	// class@001217
{
    public final Path d;
    public int e;
    public int f;
    public final RectF g;
    public float h;

    public void LiveGiftBoxWealthGradeIncrementProgressBar(Context p0){
       super(p0, null);
    }
    public void LiveGiftBoxWealthGradeIncrementProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftBoxWealthGradeIncrementProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new Path();
       this.e = 1;
       this.f = 0;
       this.g = new RectF();
       this.h = 0;
    }
    public final void a(){
       float f = (float)this.f / (float)this.e;
       this.h = f;
       if (f - 0x3f800000 > 0) {
          this.h = 0x3f800000;
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxWealthGradeIncrementProgressBar.class, "3")) {
          return;
       }
       this.g.set(0, 0, ((float)this.getWidth() * this.h), (float)this.getHeight());
       this.d.reset();
       this.d.addRoundRect(this.g, ((float)this.getHeight() * 0x3f000000), ((float)this.getHeight() * 0x3f000000), Path$Direction.CW);
       p0.clipPath(this.d);
       super.onDraw(p0);
       return;
    }
    public void setMax(int p0){
       if (PatchProxy.isSupport(LiveGiftBoxWealthGradeIncrementProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftBoxWealthGradeIncrementProgressBar.class, "1")) {
          return;
       }
       if (p0 != this.e && p0 > 0) {
          this.e = p0;
          this.a();
          this.invalidate();
       }
       return;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(LiveGiftBoxWealthGradeIncrementProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftBoxWealthGradeIncrementProgressBar.class, "2")) {
          return;
       }
       LiveGiftBoxWealthGradeIncrementProgressBar tf = this.f;
       if (p0 != tf && tf >= null) {
          this.f = p0;
          this.a();
          this.invalidate();
       }
       return;
    }
}
