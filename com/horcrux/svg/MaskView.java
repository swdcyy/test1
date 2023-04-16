package com.horcrux.svg.MaskView;
import com.horcrux.svg.GroupView;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.VirtualView;
import com.horcrux.svg.SvgView;
import java.lang.String;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.Brush$BrushUnits;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.PropHelper;
import android.graphics.Matrix;
import cb.a;

public class MaskView extends GroupView	// class@0005ae
{
    public SVGLength mH;
    public Brush$BrushUnits mMaskContentUnits;
    public Brush$BrushUnits mMaskUnits;
    public Matrix mMatrix;
    public SVGLength mW;
    public SVGLength mX;
    public SVGLength mY;
    public static final float[] sRawMatrix;

    static {
       MaskView.sRawMatrix = new float[9]{0x3f800000,0,0,0,0x3f800000,0,0,0,0x3f800000};
    }
    public void MaskView(ReactContext p0){
       super(p0);
       this.mMatrix = null;
    }
    public void saveDefinition(){
       if (this.mName != null) {
          this.getSvgView().defineMask(this, this.mName);
       }
       return;
    }
    public void setHeight(Dynamic p0){
       this.mH = SVGLength.from(p0);
       this.invalidate();
    }
    public void setMaskContentUnits(int p0){
       if (p0) {
          if (p0 == 1) {
             this.mMaskContentUnits = Brush$BrushUnits.USER_SPACE_ON_USE;
          }
       }else {
          this.mMaskContentUnits = Brush$BrushUnits.OBJECT_BOUNDING_BOX;
       }
       this.invalidate();
       return;
    }
    public void setMaskTransform(ReadableArray p0){
       if (p0 != null) {
          float[] sRawMatrix = MaskView.sRawMatrix;
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
    public void setMaskUnits(int p0){
       if (p0) {
          if (p0 == 1) {
             this.mMaskUnits = Brush$BrushUnits.USER_SPACE_ON_USE;
          }
       }else {
          this.mMaskUnits = Brush$BrushUnits.OBJECT_BOUNDING_BOX;
       }
       this.invalidate();
       return;
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
