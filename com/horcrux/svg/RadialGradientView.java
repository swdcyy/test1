package com.horcrux.svg.RadialGradientView;
import com.horcrux.svg.DefinitionView;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.VirtualView;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.Brush;
import com.horcrux.svg.Brush$BrushType;
import com.horcrux.svg.Brush$BrushUnits;
import com.facebook.react.bridge.ReadableArray;
import android.graphics.Matrix;
import com.horcrux.svg.SvgView;
import android.graphics.Rect;
import java.lang.String;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.PropHelper;
import cb.a;

public class RadialGradientView extends DefinitionView	// class@0005bb
{
    public SVGLength mCx;
    public SVGLength mCy;
    public SVGLength mFx;
    public SVGLength mFy;
    public ReadableArray mGradient;
    public Brush$BrushUnits mGradientUnits;
    public Matrix mMatrix;
    public SVGLength mRx;
    public SVGLength mRy;
    public static final float[] sRawMatrix;

    static {
       RadialGradientView.sRawMatrix = new float[9]{0x3f800000,0,0,0,0x3f800000,0,0,0,0x3f800000};
    }
    public void RadialGradientView(ReactContext p0){
       super(p0);
       this.mMatrix = null;
    }
    public void saveDefinition(){
       if (this.mName != null) {
          SVGLength[] sVGLengthArr = new SVGLength[]{this.mFx,this.mFy,this.mRx,this.mRy,this.mCx,this.mCy};
          Brush uBrush = new Brush(Brush$BrushType.RADIAL_GRADIENT, sVGLengthArr, this.mGradientUnits);
          uBrush.setGradientColors(this.mGradient);
          RadialGradientView tmMatrix = this.mMatrix;
          if (tmMatrix != null) {
             uBrush.setGradientTransform(tmMatrix);
          }
          SvgView svgView = this.getSvgView();
          if (this.mGradientUnits == Brush$BrushUnits.USER_SPACE_ON_USE) {
             uBrush.setUserSpaceBoundingBox(svgView.getCanvasBounds());
          }
          svgView.defineBrush(uBrush, this.mName);
       }
       return;
    }
    public void setCx(Dynamic p0){
       this.mCx = SVGLength.from(p0);
       this.invalidate();
    }
    public void setCy(Dynamic p0){
       this.mCy = SVGLength.from(p0);
       this.invalidate();
    }
    public void setFx(Dynamic p0){
       this.mFx = SVGLength.from(p0);
       this.invalidate();
    }
    public void setFy(Dynamic p0){
       this.mFy = SVGLength.from(p0);
       this.invalidate();
    }
    public void setGradient(ReadableArray p0){
       this.mGradient = p0;
       this.invalidate();
    }
    public void setGradientTransform(ReadableArray p0){
       if (p0 != null) {
          float[] sRawMatrix = RadialGradientView.sRawMatrix;
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
    public void setGradientUnits(int p0){
       if (p0) {
          if (p0 == 1) {
             this.mGradientUnits = Brush$BrushUnits.USER_SPACE_ON_USE;
          }
       }else {
          this.mGradientUnits = Brush$BrushUnits.OBJECT_BOUNDING_BOX;
       }
       this.invalidate();
       return;
    }
    public void setRx(Dynamic p0){
       this.mRx = SVGLength.from(p0);
       this.invalidate();
    }
    public void setRy(Dynamic p0){
       this.mRy = SVGLength.from(p0);
       this.invalidate();
    }
}
