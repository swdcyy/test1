package com.yxcorp.gifshow.camerasdk.videosourcelayout.c;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.a;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory$Type;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;
import java.lang.Math;
import com.kwai.camerasdk.models.DisplayLayout;

public class c extends a	// class@001056
{

    public void c(VideoSourceLayoutFactory$Type p0,int p1,int p2,int p3,int p4,int p5){
       super(p0, p1, p2, p3, p4, p5);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.i = new RectF(0, 0, 0x3f800000, 0x3f800000);
       this.h = new RectF(0, 0, 0x3f800000, 0x3f800000);
       float f = (float)Math.sqrt((double)(((float)(this.b * this.c) / 9.00f) / (float)(this.d * this.e)));
       float f1 = (float)this.d * f;
       float f2 = (float)this.e * f;
       this.g = (!(this.f % 180))? new RectF(0, 0, (f1 / (float)this.b), (f2 / (float)this.c)): new RectF(0, 0, (f2 / (float)this.b), (f1 / (float)this.c));
       return;
    }
    public DisplayLayout b(){
       return DisplayLayout.FIX_WIDTH_HEIGHT;
    }
}
