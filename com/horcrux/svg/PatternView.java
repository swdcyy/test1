package com.horcrux.svg.PatternView;
import com.horcrux.svg.GroupView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.RectF;
import com.horcrux.svg.VirtualView;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.Brush;
import com.horcrux.svg.Brush$BrushType;
import com.horcrux.svg.Brush$BrushUnits;
import android.graphics.Matrix;
import com.horcrux.svg.SvgView;
import android.graphics.Rect;
import java.lang.String;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.PropHelper;
import cb.a;

public class PatternView extends GroupView	// class@0005b2
{
    public String mAlign;
    public SVGLength mH;
    public Matrix mMatrix;
    public int mMeetOrSlice;
    public float mMinX;
    public float mMinY;
    public Brush$BrushUnits mPatternContentUnits;
    public Brush$BrushUnits mPatternUnits;
    public float mVbHeight;
    public float mVbWidth;
    public SVGLength mW;
    public SVGLength mX;
    public SVGLength mY;
    public static final float[] sRawMatrix;

    static {
       PatternView.sRawMatrix = new float[9]{0x3f800000,0,0,0,0x3f800000,0,0,0,0x3f800000};
    }
    public void PatternView(ReactContext p0){
       super(p0);
       this.mMatrix = null;
    }
    public RectF getViewBox(){
       PatternView tmMinX = this.mMinX;
       VirtualView tmScale = this.mScale;
       float f = tmMinX * tmScale;
       PatternView tmMinY = this.mMinY;
       float f1 = tmMinY * tmScale;
       return new RectF(f, f1, ((tmMinX + this.mVbWidth) * tmScale), ((tmMinY + this.mVbHeight) * tmScale));
    }
    public void saveDefinition(){
       if (this.mName != null) {
          SVGLength[] sVGLengthArr = new SVGLength[]{this.mX,this.mY,this.mW,this.mH};
          Brush uBrush = new Brush(Brush$BrushType.PATTERN, sVGLengthArr, this.mPatternUnits);
          uBrush.setContentUnits(this.mPatternContentUnits);
          uBrush.setPattern(this);
          PatternView tmMatrix = this.mMatrix;
          if (tmMatrix != null) {
             uBrush.setGradientTransform(tmMatrix);
          }
          SvgView svgView = this.getSvgView();
          Brush$BrushUnits uSER_SPACE_O = Brush$BrushUnits.USER_SPACE_ON_USE;
          if (this.mPatternUnits == uSER_SPACE_O || this.mPatternContentUnits == uSER_SPACE_O) {
             uBrush.setUserSpaceBoundingBox(svgView.getCanvasBounds());
          }
          svgView.defineBrush(uBrush, this.mName);
       }
       return;
    }
    public void setAlign(String p0){
       this.mAlign = p0;
       this.invalidate();
    }
    public void setHeight(Dynamic p0){
       this.mH = SVGLength.from(p0);
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
    public void setPatternContentUnits(int p0){
       if (p0) {
          if (p0 == 1) {
             this.mPatternContentUnits = Brush$BrushUnits.USER_SPACE_ON_USE;
          }
       }else {
          this.mPatternContentUnits = Brush$BrushUnits.OBJECT_BOUNDING_BOX;
       }
       this.invalidate();
       return;
    }
    public void setPatternTransform(ReadableArray p0){
       if (p0 != null) {
          float[] sRawMatrix = PatternView.sRawMatrix;
          int i = PropHelper.toMatrixData(p0, sRawMatrix, this.mScale);
          if (i == 6) {
             if (this.mMatrix == null) {
                this.mMatrix = new Matrix();
             }
             this.mMatrix.setValues(sRawMatrix);
          }else if(i != -1){
             a.x("ReactNative", "RNSVG: Transform matrices must be of size 6");
          }
       }else {
          this.mMatrix = null;
       }
       this.invalidate();
       return;
    }
    public void setPatternUnits(int p0){
       if (p0) {
          if (p0 == 1) {
             this.mPatternUnits = Brush$BrushUnits.USER_SPACE_ON_USE;
          }
       }else {
          this.mPatternUnits = Brush$BrushUnits.OBJECT_BOUNDING_BOX;
       }
       this.invalidate();
       return;
    }
    public void setVbHeight(float p0){
       this.mVbHeight = p0;
       this.invalidate();
    }
    public void setVbWidth(float p0){
       this.mVbWidth = p0;
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
