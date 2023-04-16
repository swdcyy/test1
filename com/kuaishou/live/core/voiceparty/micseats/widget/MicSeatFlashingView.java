package com.kuaishou.live.core.voiceparty.micseats.widget.MicSeatFlashingView;
import android.view.View;
import android.content.Context;
import java.lang.String;
import android.graphics.Color;
import com.kuaishou.live.core.voiceparty.micseats.widget.MicSeatFlashingView$gradientDrawable$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.GradientDrawable;
import ll8.c$b;
import android.content.res.TypedArray;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class MicSeatFlashingView extends View	// class@00177f
{
    public final String b;
    public final int c;
    public final int d;
    public int e;
    public final int f;
    public final int g;
    public final int h;
    public int i;
    public final p j;
    public AnimatorSet k;
    public HashMap l;

    public void MicSeatFlashingView(Context p0){
       super(p0);
       this.b = "MicSeatFlashingView";
       int i = Color.parseColor("#66ffffff");
       this.d = i;
       this.e = i;
       this.g = 1;
       this.h = 2;
       this.i = this.f;
       this.j = s.c(new MicSeatFlashingView$gradientDrawable$2(this));
       this.a(null);
    }
    public void MicSeatFlashingView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = "MicSeatFlashingView";
       int i = Color.parseColor("#66ffffff");
       this.d = i;
       this.e = i;
       this.g = 1;
       this.h = 2;
       this.i = this.f;
       this.j = s.c(new MicSeatFlashingView$gradientDrawable$2(this));
       this.a(p1);
    }
    public void MicSeatFlashingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = "MicSeatFlashingView";
       int i = Color.parseColor("#66ffffff");
       this.d = i;
       this.e = i;
       this.g = 1;
       this.h = 2;
       this.i = this.f;
       this.j = s.c(new MicSeatFlashingView$gradientDrawable$2(this));
       this.a(p1);
    }
    public final void a(AttributeSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatFlashingView.class, "3")) {
          return;
       }
       if (p0 == null) {
          this.getGradientDrawable().setShape(1);
       }else {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.u3);
          a.o(typedArray, "context.obtainStyledAttr¡­able.MicSeatFlashingView\)");
          this.i = typedArray.getInt(1, this.f);
          this.e = typedArray.getColor(0, this.d);
          if (this.i == this.f) {
             this.getGradientDrawable().setShape(1);
          }else {
             this.getGradientDrawable().setShape(0);
          }
       }
       this.setBackground(this.getGradientDrawable());
       return;
    }
    public final GradientDrawable getGradientDrawable(){
       Object obj = PatchProxy.apply(null, this, MicSeatFlashingView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(MicSeatFlashingView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, MicSeatFlashingView.class, "6")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && p1 > 0) {
          this.getGradientDrawable().setSize(p0, p1);
          if (this.i == this.h) {
             this.getGradientDrawable().setGradientRadius((float)(p1 / 2));
          }else {
             this.getGradientDrawable().setGradientRadius((float)(p0 / 2));
          }
       }
       return;
    }
}
