package com.horcrux.svg.LinearGradientView;
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
import com.horcrux.svg.PropHelper;
import cb.a;
import com.facebook.react.bridge.Dynamic;

public class LinearGradientView extends DefinitionView	// class@0005ac
{
    public ReadableArray mGradient;
    public Brush$BrushUnits mGradientUnits;
    public Matrix mMatrix;
    public SVGLength mX1;
    public SVGLength mX2;
    public SVGLength mY1;
    public SVGLength mY2;
    public static final float[] sRawMatrix;

    static {
       LinearGradientView.sRawMatrix = new float[9]{0x3f800000,0,0,0,0x3f800000,0,0,0,0x3f800000};
    }
    public void LinearGradientView(ReactContext p0){
       super(p0);
       this.mMatrix = null;
    }
    public void saveDefinition(){
       if (this.mName != null) {
          SVGLength[] sVGLengthArr = new SVGLength[]{this.mX1,this.mY1,this.mX2,this.mY2};
          Brush uBrush = new Brush(Brush$BrushType.LINEAR_GRADIENT, sVGLengthArr, this.mGradientUnits);
          uBrush.setGradientColors(this.mGradient);
          LinearGradientView tmMatrix = this.mMatrix;
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
    public void setGradient(ReadableArray p0){
       this.mGradient = p0;
       this.invalidate();
    }
    public void setGradientTransform(ReadableArray p0){
       if (p0 != null) {
          float[] sRawMatrix = LinearGradientView.sRawMatrix;
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
    public void setX1(Dynamic p0){
       this.mX1 = SVGLength.from(p0);
       this.invalidate();
    }
    public void setX2(Dynamic p0){
       this.mX2 = SVGLength.from(p0);
       this.invalidate();
    }
    public void setY1(Dynamic p0){
       this.mY1 = SVGLength.from(p0);
       this.invalidate();
    }
    public void setY2(Dynamic p0){
       this.mY2 = SVGLength.from(p0);
       this.invalidate();
    }
}
