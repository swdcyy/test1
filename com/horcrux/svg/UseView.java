package com.horcrux.svg.UseView;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
import java.lang.String;
import java.lang.StringBuilder;
import cb.a;
import com.horcrux.svg.SVGLength;
import android.graphics.Matrix;
import com.horcrux.svg.SymbolView;
import android.graphics.RectF;
import android.graphics.Path;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;

public class UseView extends RenderableView	// class@000617
{
    public SVGLength mH;
    public String mHref;
    public SVGLength mW;
    public SVGLength mX;
    public SVGLength mY;

    public void UseView(ReactContext p0){
       super(p0);
    }
    public void draw(Canvas p0,Paint p1,float p2){
       VirtualView definedTempl = this.getSvgView().getDefinedTemplate(this.mHref);
       if (definedTempl == null) {
          a.x("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: "+this.mHref+" is not defined.");
          return;
       }else {
          definedTempl.clearCache();
          p0.translate((float)this.relativeOnWidth(this.mX), (float)this.relativeOnHeight(this.mY));
          if (v1 = definedTempl instanceof RenderableView) {
             definedTempl.mergeProperties(this);
          }
          int i = definedTempl.saveAndSetupCanvas(p0, this.mCTM);
          this.clip(p0, p1);
          if (definedTempl instanceof SymbolView) {
             definedTempl.drawSymbol(p0, p1, p2, (float)this.relativeOnWidth(this.mW), (float)this.relativeOnHeight(this.mH));
          }else {
             definedTempl.draw(p0, p1, (p2 * this.mOpacity));
          }
          this.setClientRect(definedTempl.getClientRect());
          definedTempl.restoreCanvas(p0, i);
          if (v1) {
             definedTempl.resetProperties();
          }
          return;
       }
    }
    public Path getPath(Canvas p0,Paint p1){
       VirtualView definedTempl = this.getSvgView().getDefinedTemplate(this.mHref);
       if (definedTempl == null) {
          a.x("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: "+this.mHref+" is not defined.");
          return null;
       }else {
          Path path = new Path();
          Matrix matrix = new Matrix();
          matrix.setTranslate((float)this.relativeOnWidth(this.mX), (float)this.relativeOnHeight(this.mY));
          definedTempl.getPath(p0, p1).transform(matrix, path);
          return path;
       }
    }
    public int hitTest(float[] p0){
       int i = -1;
       if (this.mInvertible != null && this.mTransformInvertible != null) {
          float[] uofloatArray = new float[2];
          this.mInvMatrix.mapPoints(uofloatArray, p0);
          this.mInvTransform.mapPoints(uofloatArray);
          VirtualView definedTempl = this.getSvgView().getDefinedTemplate(this.mHref);
          if (definedTempl == null) {
             a.x("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: "+this.mHref+" is not defined.");
             return i;
          }else {
             int i1 = definedTempl.hitTest(uofloatArray);
             if (i1 != i) {
                if (!definedTempl.isResponsible() && i1 == definedTempl.getId()) {
                   i1 = this.getId();
                }
                return i1;
             }
          }
       }
       return i;
    }
    public void setHeight(Dynamic p0){
       this.mH = SVGLength.from(p0);
       this.invalidate();
    }
    public void setHref(String p0){
       this.mHref = p0;
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
