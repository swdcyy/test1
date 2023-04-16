package com.horcrux.svg.Brush;
import com.horcrux.svg.Brush$BrushType;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.Brush$BrushUnits;
import java.lang.Object;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Math;
import android.graphics.RectF;
import android.graphics.Rect;
import com.horcrux.svg.SVGLength$UnitType;
import com.horcrux.svg.PropHelper;
import android.graphics.Matrix;
import com.horcrux.svg.PatternView;
import android.graphics.Paint;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.String;
import com.horcrux.svg.ViewBox;
import com.horcrux.svg.GroupView;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import cb.a;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;

public class Brush	// class@00059c
{
    public ReadableArray mColors;
    public Matrix mMatrix;
    public PatternView mPattern;
    public final SVGLength[] mPoints;
    public final Brush$BrushType mType;
    public boolean mUseContentObjectBoundingBoxUnits;
    public final boolean mUseObjectBoundingBox;
    public Rect mUserSpaceBoundingBox;

    public void Brush(Brush$BrushType p0,SVGLength[] p1,Brush$BrushUnits p2){
       super();
       this.mType = p0;
       this.mPoints = p1;
       boolean b = (p2 == Brush$BrushUnits.OBJECT_BOUNDING_BOX)? true: false;
       this.mUseObjectBoundingBox = b;
       return;
    }
    public static void parseGradientStops(ReadableArray p0,int p1,float[] p2,int[] p3,float p4){
       for (int i = 0; i < p1; i = i + 1) {
          int i1 = i * 2;
          p2[i] = (float)p0.getDouble(i1);
          i1 = i1 + 1;
          i1 = p0.getInt(i1);
          int i2 = i1 >> 24;
          float f = (float)i2 * p4;
          i2 = Math.round(f) << 24;
          i1 = i1 & 0xffffff;
          i1 = i1 | i2;
          p3[i] = i1;
       }
       return;
    }
    public final RectF getPaintRect(RectF p0){
       if (this.mUseObjectBoundingBox != null) {
       }else {
          p0 = new RectF(this.mUserSpaceBoundingBox);
       }
       float f = p0.width();
       float f1 = p0.height();
       RectF rectF = null;
       if (this.mUseObjectBoundingBox != null) {
          rectF = p0.left;
          p0 = p0.top;
       }else {
          float f2 = 0;
       }
       return new RectF(rectF, p0, (f + rectF), (f1 + p0));
    }
    public final double getVal(SVGLength p0,double p1,float p2,float p3){
       double d;
       if (this.mUseObjectBoundingBox != null) {
          if (p0.unit == SVGLength$UnitType.NUMBER) {
             d = p1;
          label_0012 :
             return PropHelper.fromRelative(p0, p1, 0, d, (double)p3);
          }
       }else {
          int i = p0;
       }
       d = (double)p2;
       goto label_0012 ;
    }
    public void setContentUnits(Brush$BrushUnits p0){
       boolean b = (p0 == Brush$BrushUnits.OBJECT_BOUNDING_BOX)? true: false;
       this.mUseContentObjectBoundingBoxUnits = b;
       return;
    }
    public void setGradientColors(ReadableArray p0){
       this.mColors = p0;
    }
    public void setGradientTransform(Matrix p0){
       this.mMatrix = p0;
    }
    public void setPattern(PatternView p0){
       this.mPattern = p0;
    }
    public void setUserSpaceBoundingBox(Rect p0){
       this.mUserSpaceBoundingBox = p0;
    }
    public void setupPaint(Paint p0,RectF p1,float p2,float p3){
       double d;
       double d1;
       double val;
       double d4;
       double this;
       Brush mPattern;
       Matrix mPattern1;
       Brush mMatrix;
       int[] ointArray2;
       float[] uofloatArray2;
       double d6;
       Brush uBrush = this;
       Paint paint = p0;
       int i = p3;
       RectF paintRect = uBrush.getPaintRect(p1);
       float f = paintRect.width();
       float f1 = paintRect.height();
       RectF left = paintRect.left;
       RectF top = paintRect.top;
       float textSize = p0.getTextSize();
       int i1 = 1;
       int i2 = 0;
       if (uBrush.mType == Brush$BrushType.PATTERN) {
          d = (double)f;
          d1 = (double)f1;
          double d2 = d1;
          double d3 = this.getVal(uBrush.mPoints[i2], d, p2, textSize);
          val = this.getVal(uBrush.mPoints[i1], d1, p2, textSize);
          d1 = d;
          d = val;
          val = this.getVal(uBrush.mPoints[2], d1, p2, textSize);
          d4 = val;
          this = this.getVal(uBrush.mPoints[3], d2, p2, textSize);
          i2 = 0x3ff0000000000000;
          if (d4 - i2 > 0 && this - i2 > 0) {
             Bitmap uBitmap = Bitmap.createBitmap((int)d4, (int)this, Bitmap$Config.ARGB_8888);
             Canvas uCanvas = new Canvas(uBitmap);
             RectF viewBox = uBrush.mPattern.getViewBox();
             if (viewBox != null && (viewBox.width() > 0 && viewBox.height() > 0)) {
                mPattern = uBrush.mPattern;
                uCanvas.concat(ViewBox.getTransform(viewBox, new RectF((float)d3, (float)d, (float)d4, (float)this), mPattern.mAlign, mPattern.mMeetOrSlice));
             }
          label_00ae :
             if (uBrush.mUseContentObjectBoundingBoxUnits != null) {
                uCanvas.scale((f / p2), (f1 / p2));
             }
             uBrush.mPattern.draw(uCanvas, new Paint(), p3);
             mPattern1 = new Matrix();
             mMatrix = uBrush.mMatrix;
             if (mMatrix != null) {
                mPattern1.preConcat(mMatrix);
             }
             BitmapShader uBitmapShade = new BitmapShader(uBitmap, Shader$TileMode.REPEAT, Shader$TileMode.REPEAT);
             uBitmapShade.setLocalMatrix(mPattern1);
             p0.setShader(uBitmapShade);
          }
          return;
       }else {
          float f2 = i;
          int i3 = 2;
          int i4 = uBrush.mColors.size();
          String str = "ReactNative";
          if (!i4) {
             a.x(str, "Gradient contains no stops");
             return;
          }else {
             i4 = i4 / i3;
             int[] ointArray = new int[i4];
             float[] uofloatArray = new float[i4];
             Brush.parseGradientStops(uBrush.mColors, i4, uofloatArray, ointArray, f2);
             if (i4 == i1) {
                int[] ointArray1 = new int[i3];
                ointArray1[i2] = ointArray[i2];
                ointArray1[i1] = ointArray[i2];
                float[] uofloatArray1 = new float[i3];
                uofloatArray1[i2] = uofloatArray[i2];
                uofloatArray1[i1] = uofloatArray[i2];
                a.x(str, "Gradient contains only one stop");
                ointArray2 = ointArray1;
                uofloatArray2 = uofloatArray1;
             }else {
                ointArray2 = ointArray;
                uofloatArray2 = uofloatArray;
             }
             mPattern = uBrush.mType;
             if (mPattern == Brush$BrushType.LINEAR_GRADIENT) {
                val = (double)f;
                d1 = val;
                double d5 = val;
                val = (double)left;
                d6 = (double)f1;
                double d7 = val;
                d = (double)top;
                d1 = d6;
                LinearGradient linearGradie = new LinearGradient((float)(this.getVal(uBrush.mPoints[i2], d1, p2, textSize) + val), (float)(this.getVal(uBrush.mPoints[i1], d6, p2, textSize) + d), (float)(this.getVal(uBrush.mPoints[i3], d5, p2, textSize) + d7), (float)(this.getVal(uBrush.mPoints[3], d1, p2, textSize) + d), ointArray2, uofloatArray2, Shader$TileMode.CLAMP);
                if (uBrush.mMatrix != null) {
                   mPattern1 = new Matrix();
                   mPattern1.preConcat(uBrush.mMatrix);
                   d1.setLocalMatrix(mPattern1);
                }
                paint.setShader(d1);
             }else if(mPattern == Brush$BrushType.RADIAL_GRADIENT){
                d4 = (double)f;
                d6 = (double)f1;
                double d8 = this.getVal(uBrush.mPoints[i3], d4, p2, textSize);
                d1 = d4;
                d4 = this.getVal(uBrush.mPoints[3], d6, p2, textSize) / d8;
                this = this.getVal(uBrush.mPoints[4], d1, p2, textSize);
                val = this + (double)left;
                d1 = d6 / d4;
                d6 = val;
                this = this.getVal(uBrush.mPoints[5], d1, p2, textSize);
                RadialGradient radialGradie = new RadialGradient((float)d6, (float)(this + ((double)top / d4)), (float)d8, ointArray2, uofloatArray2, Shader$TileMode.CLAMP);
                mPattern1 = new Matrix();
                mPattern1.preScale(0x3f800000, (float)d4);
                mMatrix = uBrush.mMatrix;
                if (mMatrix != null) {
                   mPattern1.preConcat(mMatrix);
                }
                d1.setLocalMatrix(mPattern1);
                p0.setShader(d1);
             }
             return;
          }
       }
    }
}
