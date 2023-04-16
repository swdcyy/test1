package com.kuaishou.live.common.core.basic.widget.LiveKwaiGravityEffectImageView;
import v17.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import qz6.a;
import qz6.b;
import android.view.View;
import w17.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import android.graphics.Canvas;
import java.util.Objects;
import java.lang.Exception;
import java.lang.Integer;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Path$Direction;

public class LiveKwaiGravityEffectImageView extends KwaiImageView implements b	// class@000f19
{
    public boolean x;
    public final b y;

    public void LiveKwaiGravityEffectImageView(Context p0){
       super(p0, null);
    }
    public void LiveKwaiGravityEffectImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0x1010084);
    }
    public void LiveKwaiGravityEffectImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = true;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Q1, p2, 0);
       int color = typedArray.getColor(2, p0.getResources().getColor(R.color.arg_RES_7f06212b));
       int color1 = typedArray.getColor(0, p0.getResources().getColor(R.color.arg_RES_7f06212a));
       typedArray.recycle();
       b uob = new b(this, color, color1, typedArray.getColor(3, a.d(color, 0x3f000000)), typedArray.getColor(true, a.d(color1, 0x3f000000)));
       this.y = a.d(color1, 0x3f000000);
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKwaiGravityEffectImageView.class, "3")) {
          return;
       }
       LiveKwaiGravityEffectImageView ty = this.y;
       float f = ((- p0.a()) / 9.80f) * 90.00f;
       if ((double)Math.abs((Math.abs(ty.l) - Math.abs(f))) - 0x3fd999999999999a > 0) {
          ty.l = f;
          ty.g.postInvalidate();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKwaiGravityEffectImageView.class, "2")) {
          return;
       }
       if (this.x != null) {
          LiveKwaiGravityEffectImageView ty = this.y;
          Objects.requireNonNull(ty);
          try{
             p0.save();
             ty.a(p0);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          p0.restore();
       }
       super.onDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveKwaiGravityEffectImageView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveKwaiGravityEffectImageView.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       LiveKwaiGravityEffectImageView ty = this.y;
       float f = (float)p1;
       ty.e.set(0, 0, (float)p0, f);
       ty.f.reset();
       ty.f.addRoundRect(ty.e, (f / 2.00f), (f / 2.00f), Path$Direction.CW);
       return;
    }
    public void setEnableGravityEffect(boolean p0){
       this.x = p0;
    }
}
