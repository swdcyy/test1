package com.kuaishou.sk2c.graphics.LPaint;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;

public class LPaint extends Paint	// class@000f33
{
    public boolean mHasShadow;

    public void LPaint(){
       super();
       this.mHasShadow = false;
    }
    public void clearShadowLayer(){
       if (PatchProxy.applyVoid(null, this, LPaint.class, "2")) {
          return;
       }
       super.clearShadowLayer();
       this.mHasShadow = false;
       return;
    }
    public boolean hasShadowLayerL(){
       return this.mHasShadow;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, LPaint.class, "3")) {
          return;
       }
       super.reset();
       this.mHasShadow = false;
       return;
    }
    public void setShadowLayer(float p0,float p1,float p2,int p3){
       if (PatchProxy.isSupport(LPaint.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Integer.valueOf(p3), this, LPaint.class, "1")) {
          return;
       }
       super.setShadowLayer(p0, p1, p2, p3);
       boolean b = (p0 > 0)? true: false;
       this.mHasShadow = b;
       return;
    }
}
