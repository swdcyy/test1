package com.kwai.moved.impls.widget.KsAlbumPlayerLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$MeasureSpec;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;
import java.lang.Float;

public class KsAlbumPlayerLayout extends RelativeLayout	// class@000f6a
{
    public float b;

    public void KsAlbumPlayerLayout(Context p0){
       super(p0);
       this.b = 0x3f100000;
    }
    public void KsAlbumPlayerLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0x3f100000;
    }
    public void KsAlbumPlayerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f100000;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(KsAlbumPlayerLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KsAlbumPlayerLayout.class, "2")) {
          return;
       }
       int mode = View$MeasureSpec.getMode(p1);
       int mode1 = View$MeasureSpec.getMode(p0);
       p1 = RelativeLayout.getDefaultSize(this.getSuggestedMinimumHeight(), p1);
       p0 = RelativeLayout.getDefaultSize(this.getSuggestedMinimumWidth(), p0);
       KsAlbumPlayerLayout tb = this.b;
       if (tb > 0) {
          if (mode == 0x40000000 && mode1 == 0x40000000) {
             Log.b("PlayerLayout", "onMeasure\(\) called with: widthMeasureSpec = [No-op]");
          }else if(mode == 0x40000000){
             p0 = (int)((tb * (float)p1) + 0x3f000000);
             Log.b("PlayerLayout", "onMeasure\(\) called with: widthMeasureSpec = [heightMode == MeasureSpec.EXACTLY]");
          }else if(mode1 == 0x40000000){
             p1 = (int)(((float)p0 / tb) + 0x3f000000);
             Log.b("PlayerLayout", "onMeasure\(\) called with: widthMeasureSpec = [widthMode == MeasureSpec.EXACTLY]");
          }else {
             float f = (float)p0;
             float f1 = (float)p1;
             if (f - (f1 * tb) > 0) {
                p0 = (int)((tb * f1) + 0x3f000000);
                Log.b("PlayerLayout", "onMeasure\(\) called with: widthMeasureSpec = [width > height * RATIO]");
             }else {
                Log.b("PlayerLayout", "onMeasure\(\) called with: widthMeasureSpec = [width < height * RATIO]");
                p1 = (int)((f / this.b) + 0x3f000000);
             }
          }
       }
       Log.b("PlayerLayout", "onMeasure\(\) called with: width = ["+p0+"], height = ["+p1+"]");
       super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec(p1, 0x40000000));
       return;
    }
    public void setRatio(float p0){
       if (PatchProxy.isSupport(KsAlbumPlayerLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, KsAlbumPlayerLayout.class, "1")) {
          return;
       }
       this.b = p0;
       this.requestLayout();
       return;
    }
}
