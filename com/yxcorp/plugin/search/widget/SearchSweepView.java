package com.yxcorp.plugin.search.widget.SearchSweepView;
import com.yxcorp.gifshow.widget.RectSweepingButtonView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;
import nfd.t0;
import android.widget.ImageView;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import com.yxcorp.gifshow.widget.HaloSweepingImageView;
import kotlin.jvm.internal.a;

public class SearchSweepView extends RectSweepingButtonView	// class@0007ec
{

    public void SearchSweepView(Context p0){
       super(p0, null);
    }
    public void SearchSweepView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SearchSweepView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, SearchSweepView.class, "1")) {
       }else {
          this.setMBandRatio(0.40f);
       }
       return;
    }
    public int getLightBandDrawableId(){
       return 0x7f081f1e;
    }
    public void q0(RectF p0,RectF p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchSweepView.class, "2")) {
          return;
       }
       int g = t0.g;
       float f = (float)g;
       float f1 = (float)g;
       p0.set(f, f1, (float)(this.getWidth() - g), (float)(this.getHeight() - g));
       p1.set(p0);
       return;
    }
    public Bitmap r0(){
       Drawable obj = PatchProxy.apply(null, this, SearchSweepView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getDrawable();
       Rect bounds = obj.getBounds();
       RectF rectF = new RectF((float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom);
       Bitmap uBitmap = this.p0(obj, rectF);
       if (!PatchProxy.applyVoidTwoRefs(uBitmap, rectF, this, RectSweepingButtonView.class, "5")) {
          a.p(rectF, "maskRect");
          this.Q = uBitmap;
          this.getMaskRect().set(rectF);
       }
       return this.getMMaskBitmap();
    }
}
