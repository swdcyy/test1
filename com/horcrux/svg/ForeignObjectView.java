package com.horcrux.svg.ForeignObjectView;
import com.horcrux.svg.GroupView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.facebook.react.views.view.ReactViewGroup;
import android.graphics.Paint;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.VirtualView;
import android.view.View;
import android.view.ViewGroup;
import com.horcrux.svg.SvgView;
import android.graphics.RectF;
import com.horcrux.svg.MaskView;
import java.lang.Object;
import java.lang.String;
import com.horcrux.svg.RenderableView;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;

public class ForeignObjectView extends GroupView	// class@0005a5
{
    public Canvas fake;
    public Bitmap fakeBitmap;
    public SVGLength mH;
    public SVGLength mW;
    public SVGLength mX;
    public SVGLength mY;

    public void ForeignObjectView(ReactContext p0){
       super(p0);
       this.fakeBitmap = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
       this.fake = new Canvas(this.fakeBitmap);
    }
    public void dispatchDraw(Canvas p0){
       super.dispatchDraw(this.fake);
    }
    public void draw(Canvas p0,Paint p1,float p2){
       p0.translate((float)this.relativeOnWidth(this.mX), (float)this.relativeOnHeight(this.mY));
       p0.clipRect(0, 0, (float)this.relativeOnWidth(this.mW), (float)this.relativeOnHeight(this.mH));
       super.draw(p0, p1, p2);
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       return super.drawChild(this.fake, p1, p2);
    }
    public void drawGroup(Canvas p0,Paint p1,float p2){
       this.pushGlyphContext();
       SvgView svgView = this.getSvgView();
       RectF rectF = new RectF();
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (!childAt instanceof MaskView) {
             if (childAt instanceof VirtualView) {
                if (!("none").equals(childAt.mDisplay)) {
                   if (v4 = childAt instanceof RenderableView) {
                      childAt.mergeProperties(this);
                   }
                   int i1 = childAt.saveAndSetupCanvas(p0, this.mCTM);
                   float f = this.mOpacity * p2;
                   childAt.render(p0, p1, f);
                   RectF clientRect = childAt.getClientRect();
                   if (clientRect != null) {
                      rectF.union(clientRect);
                   }
                   childAt.restoreCanvas(p0, i1);
                   if (v4) {
                      childAt.resetProperties();
                   }
                   if (childAt.isResponsible()) {
                      svgView.enableTouchEvents();
                   }
                }
             }else if(childAt instanceof SvgView){
                childAt.drawChildren(p0);
                if (childAt.isResponsible()) {
                   svgView.enableTouchEvents();
                }
             }else {
                childAt.draw(p0);
             }
          }
          i = i + 1;
       }
       this.setClientRect(rectF);
       this.popGlyphContext();
       return;
    }
    public void onDescendantInvalidated(View p0,View p1){
       super.onDescendantInvalidated(p0, p1);
       this.invalidate();
    }
    public void setHeight(Dynamic p0){
       this.mH = SVGLength.from(p0);
       this.invalidate();
    }
    public void setWidth(Dynamic p0){
       this.mW = SVGLength.from(p0);
       this.invalidate();
    }
    public void setX(Dynamic p0){
       this.mX = SVGLength.from(p0);
       this.invalidate();
    }
    public void setY(Dynamic p0){
       this.mY = SVGLength.from(p0);
       this.invalidate();
    }
}
