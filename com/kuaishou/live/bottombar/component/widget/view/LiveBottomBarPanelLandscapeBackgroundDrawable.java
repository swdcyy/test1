package com.kuaishou.live.bottombar.component.widget.view.LiveBottomBarPanelLandscapeBackgroundDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import lnc.a1;
import android.graphics.Rect;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.ColorFilter;

public class LiveBottomBarPanelLandscapeBackgroundDrawable extends Drawable	// class@000d4c
{
    public Paint a;
    public int[] b;
    public float[] c;
    public boolean d;
    public int[] e;
    public float[] f;

    public void LiveBottomBarPanelLandscapeBackgroundDrawable(){
       super();
    }
    public void LiveBottomBarPanelLandscapeBackgroundDrawable(int[] p0,float[] p1){
       super();
       if (p0.length > 0 && p1.length == p0.length) {
          this.e = p0;
          this.f = p1;
       }
       return;
    }
    public void draw(Canvas p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBottomBarPanelLandscapeBackgroundDrawable.class, "1")) {
          return;
       }
       if (this.d == null) {
          boolean b = true;
          this.d = b;
          if (!PatchProxy.applyVoid(null, this, LiveBottomBarPanelLandscapeBackgroundDrawable.class, "2")) {
             this.a = new Paint();
             LiveBottomBarPanelLandscapeBackgroundDrawable te = this.e;
             if (te != null) {
                this.b = te;
                this.c = this.f;
             }else {
                i = 5;
                int[] ointArray = new int[i];
                ointArray[0] = a1.a(0x7f06020e);
                ointArray[b] = a1.a(0x7f060199);
                ointArray[2] = a1.a(0x7f06019d);
                ointArray[3] = a1.a(0x7f0601a3);
                ointArray[4] = a1.a(0x7f0601a9);
                this.b = ointArray;
                this.c = new float[i]{0,0x3da3d70a,0x3e2e147b,0x3e947ae1,0x3f800000};
             }
          }
       }
       Rect bounds = this.getBounds();
       i = bounds.width();
       float f = (float)i;
       LinearGradient linearGradie = new LinearGradient(0, 0, f, 0, this.b, this.c, Shader$TileMode.CLAMP);
       this.a.setShader(v11);
       p0.drawRect(0, 0, f, (float)bounds.height(), this.a);
       return;
    }
    public int getOpacity(){
       return 0;
    }
    public void setAlpha(int p0){
    }
    public void setColorFilter(ColorFilter p0){
    }
}
