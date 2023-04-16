package com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarLiveCircleView;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import lnc.a1;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.lang.Float;
import java.lang.Integer;

public class AvatarLiveCircleView extends CircleWithStrokeView	// class@00184b
{
    public float g;
    public float h;
    public int i;
    public Paint j;
    public static final float k;
    public static final float l;

    static {
       AvatarLiveCircleView.k = (float)a1.e(0x3f800000);
       AvatarLiveCircleView.l = (float)a1.e(15.00f);
    }
    public void AvatarLiveCircleView(Context p0){
       super(p0);
       if (PatchProxy.applyVoid(null, this, AvatarLiveCircleView.class, "1")) {
       }else {
          this.g = AvatarLiveCircleView.k;
          this.h = AvatarLiveCircleView.l;
          this.i = this.getContext().getResources().getColor(0x7f060751);
          Paint paint = new Paint(1);
          this.j = paint;
          paint.setColor(this.i);
          this.j.setStyle(Paint$Style.STROKE);
       }
       return;
    }
    public float getRadius(){
       return this.h;
    }
    public int getStrokeColor(){
       return this.i;
    }
    public float getStrokeWidth(){
       return this.g;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarLiveCircleView.class, "5")) {
          return;
       }
       this.j.setColor(this.i);
       this.j.setStrokeWidth(this.g);
       p0.drawCircle(((float)this.getWidth() / 2.00f), ((float)this.getHeight() / 2.00f), this.h, this.j);
       return;
    }
    public void setRadius(float p0){
       if (PatchProxy.isSupport(AvatarLiveCircleView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AvatarLiveCircleView.class, "2")) {
          return;
       }
       this.h = p0;
       this.invalidate();
       return;
    }
    public void setStrokeColor(int p0){
       if (PatchProxy.isSupport(AvatarLiveCircleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AvatarLiveCircleView.class, "4")) {
          return;
       }
       this.i = p0;
       this.invalidate();
       return;
    }
    public void setStrokeWidth(float p0){
       if (PatchProxy.isSupport(AvatarLiveCircleView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AvatarLiveCircleView.class, "3")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
}
