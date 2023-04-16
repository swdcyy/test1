package com.horcrux.svg.MarkerView;
import com.horcrux.svg.GroupView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.horcrux.svg.RNSVGMarkerPosition;
import com.horcrux.svg.VirtualView;
import com.horcrux.svg.Point;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;
import com.horcrux.svg.SVGLength;
import android.graphics.RectF;
import com.horcrux.svg.ViewBox;
import com.horcrux.svg.SvgView;
import android.view.ViewGroup;
import android.view.View;
import com.facebook.react.bridge.Dynamic;

public class MarkerView extends GroupView	// class@0005ad
{
    public String mAlign;
    public SVGLength mMarkerHeight;
    public String mMarkerUnits;
    public SVGLength mMarkerWidth;
    public int mMeetOrSlice;
    public float mMinX;
    public float mMinY;
    public String mOrient;
    public SVGLength mRefX;
    public SVGLength mRefY;
    public float mVbHeight;
    public float mVbWidth;
    public Matrix markerTransform;

    public void MarkerView(ReactContext p0){
       super(p0);
       this.markerTransform = new Matrix();
    }
    public void renderMarker(Canvas p0,Paint p1,float p2,RNSVGMarkerPosition p3,float p4){
       int i = this.saveAndSetupCanvas(p0, this.mCTM);
       this.markerTransform.reset();
       RNSVGMarkerPosition origin = p3.origin;
       VirtualView tmScale = this.mScale;
       this.markerTransform.setTranslate(((float)origin.x * tmScale), ((float)origin.y * tmScale));
       float f = 0xbff0000000000000;
       double d = (("auto").equals(this.mOrient))? f: Double.parseDouble(this.mOrient);
       float f1 = 180.00f;
       if (!d - f) {
          d = p3.angle;
       }
       this.markerTransform.preRotate(((float)d + f1));
       if (("strokeWidth").equals(this.mMarkerUnits)) {
          this.markerTransform.preScale(p4, p4);
       }
       RectF rectF = new RectF(0, 0, (float)(this.relativeOnWidth(this.mMarkerWidth) / (double)this.mScale), (float)(this.relativeOnHeight(this.mMarkerHeight) / (double)this.mScale));
       if (this.mAlign != null) {
          MarkerView tmMinX = this.mMinX;
          VirtualView tmScale1 = this.mScale;
          f = tmMinX * tmScale1;
          MarkerView tmMinY = this.mMinY;
          float f2 = tmMinY * tmScale1;
          float[] uofloatArray = new float[9];
          ViewBox.getTransform(new RectF(f, f2, ((tmMinX + this.mVbWidth) * tmScale1), ((tmMinY + this.mVbHeight) * tmScale1)), rectF, this.mAlign, this.mMeetOrSlice).getValues(uofloatArray);
          this.markerTransform.preScale(uofloatArray[0], uofloatArray[4]);
       }
       this.markerTransform.preTranslate((float)(- this.relativeOnWidth(this.mRefX)), (float)(- this.relativeOnHeight(this.mRefY)));
       p0.concat(this.markerTransform);
       this.drawGroup(p0, p1, p2);
       this.restoreCanvas(p0, i);
       return;
    }
    public void saveDefinition(){
       if (this.mName != null) {
          this.getSvgView().defineMarker(this, this.mName);
          int i = 0;
          while (i < this.getChildCount()) {
             View childAt = this.getChildAt(i);
             if (childAt instanceof VirtualView) {
                childAt.saveDefinition();
             }
             i = i + 1;
          }
       }
       return;
    }
    public void setAlign(String p0){
       this.mAlign = p0;
       this.invalidate();
    }
    public void setMarkerHeight(Dynamic p0){
       this.mMarkerHeight = SVGLength.from(p0);
       this.invalidate();
    }
    public void setMarkerUnits(String p0){
       this.mMarkerUnits = p0;
       this.invalidate();
    }
    public void setMarkerWidth(Dynamic p0){
       this.mMarkerWidth = SVGLength.from(p0);
       this.invalidate();
    }
    public void setMeetOrSlice(int p0){
       this.mMeetOrSlice = p0;
       this.invalidate();
    }
    public void setMinX(float p0){
       this.mMinX = p0;
       this.invalidate();
    }
    public void setMinY(float p0){
       this.mMinY = p0;
       this.invalidate();
    }
    public void setOrient(String p0){
       this.mOrient = p0;
       this.invalidate();
    }
    public void setRefX(Dynamic p0){
       this.mRefX = SVGLength.from(p0);
       this.invalidate();
    }
    public void setRefY(Dynamic p0){
       this.mRefY = SVGLength.from(p0);
       this.invalidate();
    }
    public void setVbHeight(float p0){
       this.mVbHeight = p0;
       this.invalidate();
    }
    public void setVbWidth(float p0){
       this.mVbWidth = p0;
       this.invalidate();
    }
}
