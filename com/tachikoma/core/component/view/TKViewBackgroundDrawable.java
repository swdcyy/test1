package com.tachikoma.core.component.view.TKViewBackgroundDrawable;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;
import java.lang.Math;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Canvas;
import android.graphics.Path;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable$b;
import android.graphics.Rect;
import kp8.b;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.Integer;
import iq8.p;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.graphics.Region$Op;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable$c;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.os.Build$VERSION;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable$BorderRadiusLocation;
import java.lang.Number;
import java.lang.Enum;
import iq8.v;
import android.graphics.Outline;
import java.util.Locale;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable$BorderStyle;
import iq8.t;
import android.graphics.ColorFilter;
import java.util.Arrays;
import android.graphics.Path$Direction;
import xb.t$b;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.PathEffect;

public class TKViewBackgroundDrawable extends Drawable	// class@000db7
{
    public int mAlpha;
    public Bitmap mBackgroundImageBitmap;
    public Drawable mBackgroundImageDrawable;
    public int mBackgroundImageOffsetX;
    public int mBackgroundImageOffsetY;
    public Path mBackgroundImagePath;
    public RectF mBackgroundImageRectF;
    public int mBorderBottomColor;
    public TKViewBackgroundDrawable$BorderStyle mBorderBottomStyle;
    public int mBorderColor;
    public float[] mBorderCornerRadii;
    public int mBorderLeftColor;
    public TKViewBackgroundDrawable$BorderStyle mBorderLeftStyle;
    public float mBorderRadius;
    public int mBorderRightColor;
    public TKViewBackgroundDrawable$BorderStyle mBorderRightStyle;
    public TKViewBackgroundDrawable$BorderStyle mBorderStyle;
    public int mBorderTopColor;
    public TKViewBackgroundDrawable$BorderStyle mBorderTopStyle;
    public v mBorderWidth;
    public Path mCenterDrawPath;
    public int mColor;
    public final Context mContext;
    public String mDebugText;
    public TKViewBackgroundDrawable$b mGradient;
    public Paint mGradientPaint;
    public PointF mInnerBottomLeftCorner;
    public PointF mInnerBottomRightCorner;
    public Path mInnerClipPathForBorderRadius;
    public RectF mInnerClipTempRectForBorderRadius;
    public PointF mInnerTopLeftCorner;
    public PointF mInnerTopRightCorner;
    public boolean mIsDestroy;
    public int mLayoutDirection;
    public boolean mNeedUpdatePathForBorderRadius;
    public Path mOuterClipPathForBorderRadius;
    public RectF mOuterClipTempRectForBorderRadius;
    public final Paint mPaint;
    public PathEffect mPathEffectForBorderStyle;
    public Path mPathForBorder;
    public Path mPathForBorderRadiusOutline;
    public t$b mScaleType;
    public TKViewBackgroundDrawable$c mShadow;
    public Paint mShadowPaint;
    public RectF mTempRectForBorderRadiusOutline;
    public RectF mTempRectForCenterDrawPath;
    public static final int ALL_BITS_SET = 255;
    public static final int ALL_BITS_UNSET = 0;
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final int PAINT_FLAGS = 3;
    public static float UNDEFINED = 1000000020040877300000.000000;

    public void TKViewBackgroundDrawable(Context p0){
       super();
       this.mBorderColor = 0xff000000;
       this.mBorderLeftColor = 0xff000000;
       this.mBorderTopColor = 0xff000000;
       this.mBorderRightColor = 0xff000000;
       this.mBorderBottomColor = 0xff000000;
       this.mNeedUpdatePathForBorderRadius = false;
       this.mBorderRadius = TKViewBackgroundDrawable.UNDEFINED;
       this.mPaint = new Paint();
       this.mColor = 0;
       this.mAlpha = 255;
       this.mDebugText = null;
       this.mContext = p0;
    }
    public static int colorFromAlphaAndRGBComponents(float p0,float p1){
       return ((((int)p0 << 24) & 0xff000000) | ((int)p1 & 0xffffff));
    }
    public static int fastBorderCompatibleColorOrZero(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7){
       int i = -1;
       int i1 = (p0 > 0)? p4: -1;
       int i2 = (p1 > 0)? p5: -1;
       i1 = i1 & i2;
       i2 = (p2 > 0)? p6: -1;
       i1 = i1 & i2;
       if (p3 > 0) {
          i = p7;
       }
       i = i & i1;
       if (p0 <= 0) {
          p4 = 0;
       }
       if (p1 <= 0) {
          p5 = 0;
       }
       p0 = p4 | p5;
       if (p2 <= 0) {
          p6 = 0;
       }
       p0 = p0 | p6;
       if (p3 <= 0) {
          p7 = 0;
       }
       if (i != (p0 | p7)) {
          i = 0;
       }
       return i;
    }
    public static void getEllipseIntersectionWithLine(double p0,double p1,double p2,double p3,double p4,double p5,double p6,double p7,PointF p8){
       object oobject = p8;
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = Double.valueOf(p0);
          objArray[1] = Double.valueOf(p1);
          objArray[2] = Double.valueOf(p2);
          objArray[3] = Double.valueOf(p3);
          objArray[4] = Double.valueOf(p4);
          objArray[5] = Double.valueOf(p5);
          objArray[6] = Double.valueOf(p6);
          objArray[7] = Double.valueOf(p7);
          objArray[8] = oobject;
          if (PatchProxy.applyVoid(objArray, null, TKViewBackgroundDrawable.class, "24")) {
             return;
          }
       }
       double d = (p0 + p2) / 2.00f;
       double d1 = (p1 + p3) / 2.00f;
       double d2 = p4 - d;
       double d3 = p5 - d1;
       double d4 = Math.abs((p2 - p0)) / 2.00f;
       double d5 = ((p7 - d1) - d3) / ((p6 - d) - d2);
       d3 = d3 - (d2 * d5);
       double d6 = (Math.abs((p3 - p1)) / 2.00f) * (Math.abs((p3 - p1)) / 2.00f);
       d2 = d4 * d4;
       double d7 = d6 + ((d2 * d5) * d5);
       double d8 = (((d4 * 2.00f) * d4) * d3) * d5;
       d2 = (- (d2 * ((d3 * d3) - d6))) / d7;
       d6 = d1;
       d7 = d7 * 2.00f;
       double d9 = ((- d8) / d7) - Math.sqrt((d2 + Math.pow((d8 / d7), 2.00f)));
       d9 = d9 + d;
       d5 = ((d5 * d9) + d3) + d6;
       if (!Double.isNaN(d9) && !Double.isNaN(d5)) {
          int i = p8;
          i.x = (float)d9;
          i.y = (float)d5;
       }
       return;
    }
    public static boolean isUndefined(float p0){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, TKViewBackgroundDrawable.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (!Float.compare(p0, TKViewBackgroundDrawable.UNDEFINED))? true: false;
       return b;
    }
    public static void preLoad(){
    }
    public void destroy(){
       this.mIsDestroy = true;
       this.mBackgroundImageBitmap = null;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewBackgroundDrawable.class, "3")) {
          return;
       }
       if (this.mIsDestroy != null) {
          return;
       }
       p0.save();
       this.resetAllPaint();
       this.drawShadowIfNeed(p0);
       if (!this.hasRoundedBorders()) {
          this.drawRectangularBackgroundWithBorders(p0);
       }else {
          this.drawRoundedBackgroundWithBorders(p0);
       }
       p0.restore();
       this.drawBackgroundImage(p0);
       return;
    }
    public final void drawBackgroundImage(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewBackgroundDrawable.class, "37")) {
          return;
       }
       if (this.mBackgroundImageDrawable == null) {
          return;
       }
       TKViewBackgroundDrawable tmBackground = this.mBackgroundImagePath;
       if (tmBackground != null) {
          p0.clipPath(tmBackground);
       }
       tmBackground = this.mBackgroundImageOffsetX;
       if (tmBackground != null || this.mBackgroundImageOffsetY != null) {
          p0.translate((float)tmBackground, (float)this.mBackgroundImageOffsetY);
       }
       this.mBackgroundImageDrawable.draw(p0);
       return;
    }
    public final void drawGradient(Canvas p0,TKViewBackgroundDrawable$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKViewBackgroundDrawable.class, "29")) {
          return;
       }
       float[] uofloatArray = b.a(p1.a, this.getBoundsExcludeShadow());
       LinearGradient linearGradie = new LinearGradient(uofloatArray[0], uofloatArray[1], uofloatArray[2], uofloatArray[3], p1.b, p1.c, Shader$TileMode.CLAMP);
       if (this.mGradientPaint == null) {
          this.mGradientPaint = new Paint();
       }
       this.mGradientPaint.setShader(v9);
       if (!this.hasRoundedBorders()) {
          p0.drawRect(this.getBoundsExcludeShadow(), this.mGradientPaint);
       }else {
          p0.drawPath(this.mInnerClipPathForBorderRadius, this.mGradientPaint);
       }
       return;
    }
    public final void drawQuadrilateral(Canvas p0,int p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8,float p9){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Float.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Float.valueOf(p5);
          objArray[6] = Float.valueOf(p6);
          objArray[7] = Float.valueOf(p7);
          objArray[8] = Float.valueOf(p8);
          objArray[9] = Float.valueOf(p9);
          if (PatchProxy.applyVoid(objArray, this, TKViewBackgroundDrawable.class, "33")) {
             return;
          }
       }
       if (!p1) {
          return;
       }else if(this.mPathForBorder == null){
          this.mPathForBorder = new Path();
       }
       this.mPaint.setColor(p1);
       this.mPathForBorder.reset();
       this.mPathForBorder.moveTo(p2, p3);
       this.mPathForBorder.lineTo(p4, p5);
       this.mPathForBorder.lineTo(p6, p7);
       this.mPathForBorder.lineTo(p8, p9);
       this.mPathForBorder.lineTo(p2, p3);
       p0.drawPath(this.mPathForBorder, this.mPaint);
       return;
    }
    public final void drawRectangularBackgroundWithBorders(Canvas p0){
       Rect rect;
       float f;
       int i8;
       float f5;
       float f6;
       TKViewBackgroundDrawable tKViewBackgr;
       int i9;
       Rect rect1;
       int i10;
       float f7;
       float f8;
       Rect obj = this;
       Rect obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, TKViewBackgroundDrawable.class, "28")) {
          return;
       }
       int i = p.a(obj.mColor, obj.mAlpha);
       TKViewBackgroundDrawable mGradient = obj.mGradient;
       if (mGradient != null) {
          obj.drawGradient(obj1, mGradient);
       }else if(Color.alpha(i)){
          obj.mPaint.setColor(i);
          obj.mPaint.setStyle(Paint$Style.FILL);
          obj1.drawRect(this.getBoundsExcludeShadow(), obj.mPaint);
       }
       RectF directionAwa = this.getDirectionAwareBorderInsets();
       int i1 = Math.round(directionAwa.left);
       int i2 = Math.round(directionAwa.top);
       int i3 = Math.round(directionAwa.right);
       int i4 = Math.round(directionAwa.bottom);
       if (i1 <= 0 && (i3 <= 0 && (i2 > 0 || i4 > 0))) {
          Rect boundsExclud = this.getBoundsExcludeShadow();
          Rect left = boundsExclud.left;
          Rect top = boundsExclud.top;
          int i5 = TKViewBackgroundDrawable.fastBorderCompatibleColorOrZero(i1, i2, i3, i4, obj.mBorderLeftColor, obj.mBorderTopColor, obj.mBorderRightColor, obj.mBorderBottomColor);
          if (i5) {
             if (Color.alpha(i5)) {
                Rect right = boundsExclud.right;
                Rect bottom = boundsExclud.bottom;
                obj.mPaint.setColor(i5);
                if (i1 > 0) {
                   rect = top;
                   p0.drawRect((float)left, (float)top, (float)(left + i1), (float)(bottom - i4), obj.mPaint);
                }else {
                   rect = top;
                }
                if (i2 > 0) {
                   p0.drawRect((float)(i1 + left), (float)rect, (float)right, (float)(rect + i2), obj.mPaint);
                }
                if (i3 > 0) {
                   p0.drawRect((float)(right - i3), (float)(rect + i2), (float)right, (float)bottom, obj.mPaint);
                }
                if (i4 > 0) {
                   p0.drawRect((float)left, (float)(bottom - i4), (float)(right - i3), (float)bottom, obj.mPaint);
                }
             }
          }else {
             rect = top;
             obj.mPaint.setAntiAlias(false);
             int i6 = boundsExclud.width();
             int i7 = boundsExclud.height();
             if (i1 > 0) {
                f = (float)left;
                float f1 = (float)(left + i1);
                i8 = rect + i7;
                float f2 = (float)i8;
                float f3 = f2;
                f2 = f;
                float f4 = f;
                obj1 = rect;
                obj = left;
                this.drawQuadrilateral(p0, obj.mBorderLeftColor, f2, (float)rect, f1, (float)(rect + i2), f1, (float)(i8 - i4), f4, f3);
             }else {
                obj1 = rect;
                obj = left;
             }
             if (i2 > 0) {
                f5 = (float)obj1;
                f = (float)(obj1 + i2);
                i = obj + i6;
                f6 = (float)i;
                tKViewBackgr = this;
                i9 = i1;
                rect1 = obj;
                this.drawQuadrilateral(p0, tKViewBackgr.mBorderTopColor, (float)obj, f5, (float)(obj + i1), f, (float)(i - i3), f, f6, f5);
             }else {
                i9 = i1;
                rect1 = obj;
                tKViewBackgr = this;
             }
             if (i3 > 0) {
                i10 = rect1 + i6;
                f7 = (float)i10;
                i8 = obj1 + i7;
                f8 = (float)i8;
                f6 = (float)(i10 - i3);
                this.drawQuadrilateral(p0, tKViewBackgr.mBorderRightColor, f7, (float)obj1, f7, f8, f6, (float)(i8 - i4), f6, (float)(obj1 + i2));
             }
             if (i4 > 0) {
                i8 = obj1 + i7;
                f8 = (float)i8;
                i10 = rect1 + i6;
                f7 = (float)i10;
                f5 = (float)(i8 - i4);
                this.drawQuadrilateral(p0, tKViewBackgr.mBorderBottomColor, (float)rect1, f8, f7, f8, (float)(i10 - i3), f5, (float)(rect1 + i9), f5);
             }
             tKViewBackgr.mPaint.setAntiAlias(true);
          }
       }
       return;
    }
    public final void drawRoundedBackgroundWithBorders(Canvas p0){
       RectF rectF;
       RectF rectF1;
       RectF rectF2;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, TKViewBackgroundDrawable.class, "22")) {
          return;
       }
       this.updatePath();
       p0.save();
       TKViewBackgroundDrawable mGradient = obj.mGradient;
       if (mGradient != null) {
          obj.drawGradient(obj1, mGradient);
       }else {
          int i = p.a(obj.mColor, obj.mAlpha);
          if (Color.alpha(i)) {
             obj.mPaint.setColor(i);
             obj.mPaint.setStyle(Paint$Style.FILL);
             obj1.drawPath(obj.mInnerClipPathForBorderRadius, obj.mPaint);
          }
       }
       RectF directionAwa = this.getDirectionAwareBorderInsets();
       if (directionAwa.top <= 0 && (directionAwa.bottom <= 0 && (directionAwa.left > 0 || directionAwa.right > 0))) {
          float fullBorderWi = this.getFullBorderWidth();
          if (!directionAwa.top - fullBorderWi && (!directionAwa.bottom - fullBorderWi && (!directionAwa.left - fullBorderWi && !directionAwa.right - fullBorderWi))) {
             if (fullBorderWi > 0) {
                try{
                   obj.mPaint.setColor(obj.mBorderColor);
                   obj.mPaint.setStyle(Paint$Style.STROKE);
                   obj.mPaint.setStrokeWidth(e0);
                   obj1.drawPath(obj.mCenterDrawPath, obj.mPaint);
                }catch(java.lang.Exception e0){
                }
             }
          }else {
             obj.mPaint.setStyle(Paint$Style.FILL);
             obj1.clipPath(obj.mOuterClipPathForBorderRadius, Region$Op.INTERSECT);
             obj1.clipPath(obj.mInnerClipPathForBorderRadius, Region$Op.DIFFERENCE);
             mGradient = obj.mOuterClipTempRectForBorderRadius;
             RectF left = mGradient.left;
             RectF right = mGradient.right;
             RectF top = mGradient.top;
             RectF bottom = mGradient.bottom;
             if (directionAwa.left > 0) {
                mGradient = obj.mInnerTopLeftCorner;
                mGradient = obj.mInnerBottomLeftCorner;
                rectF = bottom;
                rectF1 = top;
                rectF2 = right;
                this.drawQuadrilateral(p0, obj.mBorderLeftColor, left, top, mGradient.x, mGradient.y, mGradient.x, mGradient.y, left, rectF);
             }else {
                rectF = bottom;
                rectF1 = top;
                rectF2 = right;
             }
             if (directionAwa.top > 0) {
                mGradient = obj.mInnerTopLeftCorner;
                mGradient = obj.mInnerTopRightCorner;
                this.drawQuadrilateral(p0, obj.mBorderTopColor, left, rectF1, mGradient.x, mGradient.y, mGradient.x, mGradient.y, rectF2, rectF1);
             }
             if (directionAwa.right > 0) {
                mGradient = obj.mInnerTopRightCorner;
                mGradient = obj.mInnerBottomRightCorner;
                this.drawQuadrilateral(p0, obj.mBorderRightColor, rectF2, rectF1, mGradient.x, mGradient.y, mGradient.x, mGradient.y, rectF2, rectF);
             }
             if (directionAwa.bottom > 0) {
                mGradient = obj.mInnerBottomLeftCorner;
                mGradient = obj.mInnerBottomRightCorner;
                this.drawQuadrilateral(p0, obj.mBorderBottomColor, left, rectF, mGradient.x, mGradient.y, mGradient.x, mGradient.y, rectF2, rectF);
             }
          }
       }
    }
    public final void drawShadow(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewBackgroundDrawable.class, "31")) {
          return;
       }
       if (this.mShadowPaint == null) {
          this.mShadowPaint = new Paint();
       }
       this.mShadowPaint.setColor(0);
       this.mShadowPaint.setStyle(Paint$Style.FILL);
       TKViewBackgroundDrawable tmShadow = this.mShadow;
       this.mShadowPaint.setShadowLayer(tmShadow.a, tmShadow.b, tmShadow.c, this.transparentColor(tmShadow.d));
       if (this.hasRoundedBorders()) {
          p0.drawPath(this.mOuterClipPathForBorderRadius, this.mShadowPaint);
       }else {
          p0.drawRect(this.getBoundsExcludeShadow(), this.mShadowPaint);
       }
       return;
    }
    public final void drawShadowBelow_9_0(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewBackgroundDrawable.class, "32")) {
          return;
       }
       int i = (int)(this.mShadow.a * 2.40f);
       Bitmap uBitmap = Bitmap.createBitmap((this.getBounds().width() + i), (this.getBounds().height() + i), Bitmap$Config.ARGB_4444);
       Canvas uCanvas = new Canvas(uBitmap);
       uCanvas.translate((float)i, (float)i);
       if (this.mShadowPaint == null) {
          this.mShadowPaint = new Paint();
       }
       this.mShadowPaint.setColor(0);
       this.mShadowPaint.setStyle(Paint$Style.FILL);
       TKViewBackgroundDrawable tmShadow = this.mShadow;
       this.mShadowPaint.setShadowLayer(tmShadow.a, tmShadow.b, tmShadow.c, this.transparentColor(tmShadow.d));
       if (this.hasRoundedBorders()) {
          uCanvas.drawPath(this.mOuterClipPathForBorderRadius, this.mShadowPaint);
       }else {
          uCanvas.drawRect(this.getBoundsExcludeShadow(), this.mShadowPaint);
       }
       p0.drawBitmap(uBitmap, (float)(- i), (float)(- i), null);
       if (!uBitmap.isRecycled()) {
          uBitmap.recycle();
       }
       return;
    }
    public final void drawShadowIfNeed(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewBackgroundDrawable.class, "30")) {
          return;
       }
       if (this.mShadow == null) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 28) {
          this.drawShadow(p0);
       }else {
          this.drawShadowBelow_9_0(p0);
       }
       return;
    }
    public int getAlpha(){
       return this.mAlpha;
    }
    public float getBorderRadius(TKViewBackgroundDrawable$BorderRadiusLocation p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKViewBackgroundDrawable.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getBorderRadiusOrDefaultTo(TKViewBackgroundDrawable.UNDEFINED, p0);
    }
    public float getBorderRadiusOrDefaultTo(float p0,TKViewBackgroundDrawable$BorderRadiusLocation p1){
       TKViewBackgroundDrawable obj;
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), p1, this, TKViewBackgroundDrawable.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.mBorderCornerRadii;
       if (obj == null) {
          return p0;
       }else {
          int i = obj[p1.ordinal()];
          if (TKViewBackgroundDrawable.isUndefined(i)) {
             return p0;
          }else {
             return i;
          }
       }
    }
    public final int getBorderWidth(int p0){
       TKViewBackgroundDrawable obj;
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TKViewBackgroundDrawable.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.mBorderWidth;
       if (obj == null) {
          return 0;
       }else {
          float f = obj.a(p0);
          f = (TKViewBackgroundDrawable.isUndefined(f))? -1: Math.round(f);
          return f;
       }
    }
    public float getBorderWidthOrDefaultTo(float p0,int p1){
       TKViewBackgroundDrawable obj;
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, TKViewBackgroundDrawable.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.mBorderWidth;
       if (obj == null) {
          return p0;
       }else {
          float f = obj.b(p1);
          if (TKViewBackgroundDrawable.isUndefined(f)) {
             return p0;
          }else {
             return f;
          }
       }
    }
    public final Rect getBoundsExcludeShadow(){
       return this.getBounds();
    }
    public int getColor(){
       return this.mColor;
    }
    public RectF getDirectionAwareBorderInsets(){
       Object obj = PatchProxy.apply(null, this, TKViewBackgroundDrawable.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float borderWidthO = this.getBorderWidthOrDefaultTo(0, 8);
       int i = 1;
       float borderWidthO1 = this.getBorderWidthOrDefaultTo(borderWidthO, i);
       float borderWidthO2 = this.getBorderWidthOrDefaultTo(borderWidthO, 3);
       float borderWidthO3 = this.getBorderWidthOrDefaultTo(borderWidthO, 0);
       borderWidthO = this.getBorderWidthOrDefaultTo(borderWidthO, 2);
       if (this.mBorderWidth != null) {
          if (this.getResolvedLayoutDirection() != i) {
             i = 0;
          }
          float f = this.mBorderWidth.b(4);
          float f1 = this.mBorderWidth.b(5);
          float f2 = (i)? f1: f;
          if (!i) {
             f = f1;
          }
          if (!TKViewBackgroundDrawable.isUndefined(f2)) {
             borderWidthO3 = f2;
          }
          if (!TKViewBackgroundDrawable.isUndefined(f)) {
             borderWidthO = f;
          }
       }
       return new RectF(borderWidthO3, borderWidthO1, borderWidthO, borderWidthO2);
    }
    public float getFullBorderRadius(){
       Object obj = PatchProxy.apply(null, this, TKViewBackgroundDrawable.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = (TKViewBackgroundDrawable.isUndefined(this.mBorderRadius))? 0: this.mBorderRadius;
       return f;
    }
    public float getFullBorderWidth(){
       TKViewBackgroundDrawable obj = PatchProxy.apply(null, this, TKViewBackgroundDrawable.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.mBorderWidth;
       float f = (obj != null && !TKViewBackgroundDrawable.isUndefined(obj.b(8)))? this.mBorderWidth.b(8): 0;
       return f;
    }
    public int getOpacity(){
       Object obj = PatchProxy.apply(null, this, TKViewBackgroundDrawable.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = p.a(this.mColor, this.mAlpha) >> 24;
       if (i == 255) {
          i = -1;
       }else if(!i){
          i = -2;
       }else {
          i = -3;
       }
       return i;
    }
    public void getOutline(Outline p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewBackgroundDrawable.class, "9")) {
          return;
       }
       if (TKViewBackgroundDrawable.isUndefined(this.mBorderRadius) || (this.mBorderRadius > 0 || this.mBorderCornerRadii != null)) {
          this.updatePath();
          p0.setConvexPath(this.mPathForBorderRadiusOutline);
       }else {
          p0.setRect(this.getBounds());
       }
       return;
    }
    public int getResolvedLayoutDirection(){
       return this.mLayoutDirection;
    }
    public boolean hasRoundedBorders(){
       TKViewBackgroundDrawable obj = PatchProxy.apply(null, this, TKViewBackgroundDrawable.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TKViewBackgroundDrawable.isUndefined(this.mBorderRadius) && this.mBorderRadius > 0) {
          return true;
       }
       obj = this.mBorderCornerRadii;
       if (obj != null) {
          int len = obj.length;
          int i = 0;
          while (i < len) {
             int i1 = obj[i];
             if (!TKViewBackgroundDrawable.isUndefined(i1) && i1 > 0) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public TKViewBackgroundDrawable newDrawable(){
       TKViewBackgroundDrawable obj = PatchProxy.apply(null, this, TKViewBackgroundDrawable.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TKViewBackgroundDrawable(this.mContext);
       obj.mBorderWidth = this.mBorderWidth;
       obj.mBorderColor = this.mBorderColor;
       obj.mBorderLeftColor = this.mBorderLeftColor;
       obj.mBorderTopColor = this.mBorderTopColor;
       obj.mBorderRightColor = this.mBorderRightColor;
       obj.mBorderBottomColor = this.mBorderBottomColor;
       obj.mBorderStyle = this.mBorderStyle;
       obj.mBorderLeftStyle = this.mBorderLeftStyle;
       obj.mBorderTopStyle = this.mBorderTopStyle;
       obj.mBorderRightStyle = this.mBorderRightStyle;
       obj.mBorderBottomStyle = this.mBorderBottomStyle;
       obj.mColor = this.mColor;
       obj.mGradient = this.mGradient;
       obj.mAlpha = this.mAlpha;
       obj.mBorderCornerRadii = this.mBorderCornerRadii;
       obj.mLayoutDirection = this.mLayoutDirection;
       obj.mBorderRadius = this.mBorderRadius;
       obj.mShadow = this.mShadow;
       obj.mNeedUpdatePathForBorderRadius = true;
       obj.mDebugText = this.mDebugText;
       return obj;
    }
    public void onBoundsChange(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewBackgroundDrawable.class, "6")) {
          return;
       }
       super.onBoundsChange(p0);
       this.mNeedUpdatePathForBorderRadius = true;
       this.updateBackgroundImage();
       this.invalidateSelf();
       return;
    }
    public void removeGradient(){
       if (PatchProxy.applyVoid(null, this, TKViewBackgroundDrawable.class, "21")) {
          return;
       }
       this.mGradient = null;
       this.invalidateSelf();
       return;
    }
    public final void resetAllPaint(){
       if (PatchProxy.applyVoid(null, this, TKViewBackgroundDrawable.class, "4")) {
          return;
       }
       this.mPaint.reset();
       this.mPaint.setFlags(3);
       TKViewBackgroundDrawable tmGradientPa = this.mGradientPaint;
       if (tmGradientPa != null) {
          tmGradientPa.reset();
          this.mGradientPaint.setFlags(3);
       }
       tmGradientPa = this.mShadowPaint;
       if (tmGradientPa != null) {
          tmGradientPa.reset();
          this.mShadowPaint.setFlags(3);
       }
       return;
    }
    public void setAlpha(int p0){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKViewBackgroundDrawable.class, "7")) {
          return;
       }
       if (p0 != this.mAlpha) {
          this.mAlpha = p0;
          this.invalidateSelf();
       }
       return;
    }
    public void setBackgroundGradientColor(int p0,int[] p1,float[] p2){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TKViewBackgroundDrawable.class, "15")) {
          return;
       }
       TKViewBackgroundDrawable$b uob = new TKViewBackgroundDrawable$b();
       this.mGradient = uob;
       uob.a = p0;
       uob.b = p1;
       uob.c = p2;
       this.updateBackgroundImage();
       this.invalidateSelf();
       return;
    }
    public void setBorderColor(int p0,int p1){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKViewBackgroundDrawable.class, "11")) {
          return;
       }
       int i = 0;
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 == 8 && this.mBorderColor != p1) {
                      this.mBorderBottomColor = p1;
                      this.mBorderRightColor = p1;
                      this.mBorderTopColor = p1;
                      this.mBorderLeftColor = p1;
                      this.mBorderColor = p1;
                   label_0056 :
                      i = 1;
                   }
                }else if(this.mBorderBottomColor != p1){
                   this.mBorderBottomColor = p1;
                   goto label_0056 ;
                }
             }else if(this.mBorderRightColor != p1){
                this.mBorderRightColor = p1;
                goto label_0056 ;
             }
          }else if(this.mBorderTopColor != p1){
             this.mBorderTopColor = p1;
             goto label_0056 ;
          }
       }else if(this.mBorderLeftColor != p1){
          this.mBorderLeftColor = p1;
          goto label_0056 ;
       }
       if (i) {
          this.invalidateSelf();
       }
       return;
    }
    public void setBorderStyle(int p0,String p1){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, TKViewBackgroundDrawable.class, "12")) {
          return;
       }
       TKViewBackgroundDrawable$BorderStyle uBorderStyle = (p1 == null)? null: TKViewBackgroundDrawable$BorderStyle.valueOf(p1.toUpperCase(Locale.US));
       int i = 0;
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 == 8 && this.mBorderStyle != uBorderStyle) {
                      this.mBorderBottomStyle = uBorderStyle;
                      this.mBorderRightStyle = uBorderStyle;
                      this.mBorderTopStyle = uBorderStyle;
                      this.mBorderLeftStyle = uBorderStyle;
                      this.mBorderStyle = uBorderStyle;
                   label_0060 :
                      i = 1;
                   }
                }else if(this.mBorderBottomStyle != uBorderStyle){
                   this.mBorderBottomStyle = uBorderStyle;
                   goto label_0060 ;
                }
             }else if(this.mBorderRightStyle != uBorderStyle){
                this.mBorderRightStyle = uBorderStyle;
                goto label_0060 ;
             }
          }else if(this.mBorderTopStyle != uBorderStyle){
             this.mBorderTopStyle = uBorderStyle;
             goto label_0060 ;
          }
       }else if(this.mBorderLeftStyle != uBorderStyle){
          this.mBorderLeftStyle = uBorderStyle;
          goto label_0060 ;
       }
       if (i) {
          this.mNeedUpdatePathForBorderRadius = true;
          this.updateBackgroundImage();
          this.invalidateSelf();
       }
       return;
    }
    public void setBorderWidth(int p0,float p1){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, TKViewBackgroundDrawable.class, "10")) {
          return;
       }
       if (this.mBorderWidth == null) {
          this.mBorderWidth = new v(0);
       }
       if (!t.a(this.mBorderWidth.b(p0), p1)) {
          this.mBorderWidth.c(p0, p1);
          if (p0 == 8) {
             this.mBorderWidth.c(0, p1);
             this.mBorderWidth.c(1, p1);
             this.mBorderWidth.c(2, p1);
             this.mBorderWidth.c(3, p1);
          }
          if (!p0 || (p0 == 1 || (p0 == 2 || (p0 == 3 || (p0 == 4 || (p0 == 5 || p0 == 8)))))) {
             this.mNeedUpdatePathForBorderRadius = true;
          }
          this.updateBackgroundImage();
          this.invalidateSelf();
       }
       return;
    }
    public void setColor(int p0){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKViewBackgroundDrawable.class, "20")) {
          return;
       }
       this.mColor = p0;
       this.mGradient = null;
       this.invalidateSelf();
       return;
    }
    public void setColorFilter(ColorFilter p0){
    }
    public void setRadius(float p0){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TKViewBackgroundDrawable.class, "13")) {
          return;
       }
       if (!t.a(this.mBorderRadius, p0)) {
          this.mBorderRadius = p0;
          TKViewBackgroundDrawable tmBorderCorn = this.mBorderCornerRadii;
          if (tmBorderCorn != null) {
             Arrays.fill(tmBorderCorn, p0);
          }
          this.mNeedUpdatePathForBorderRadius = true;
          this.updateBackgroundImage();
          this.invalidateSelf();
       }
       return;
    }
    public void setRadius(float p0,int p1){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, TKViewBackgroundDrawable.class, "14")) {
          return;
       }
       if (this.mBorderCornerRadii == null) {
          float[] uofloatArray = new float[8];
          this.mBorderCornerRadii = uofloatArray;
          Arrays.fill(uofloatArray, TKViewBackgroundDrawable.UNDEFINED);
       }
       if (!t.a(this.mBorderCornerRadii[p1], p0)) {
          this.mBorderCornerRadii[p1] = p0;
          this.mNeedUpdatePathForBorderRadius = true;
          this.updateBackgroundImage();
          this.invalidateSelf();
       }
       return;
    }
    public void setShadow(float p0,float p1,float p2,int p3){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Integer.valueOf(p3), this, TKViewBackgroundDrawable.class, "16")) {
          return;
       }
       this.mShadow = new TKViewBackgroundDrawable$c(p0, p1, p2, p3);
       this.mNeedUpdatePathForBorderRadius = true;
       this.updateBackgroundImage();
       this.invalidateSelf();
       return;
    }
    public final int transparentColor(int p0){
       int i = 0xff000000;
       if ((p0 & i) == i) {
          p0 = p0 & -16777217;
       }
       return p0;
    }
    public final void updateBackgroundImage(){
       int height;
       int i;
       int i1;
       Path path = this;
       if (PatchProxy.applyVoid(null, path, TKViewBackgroundDrawable.class, "39")) {
          return;
       }
       if (path.mBackgroundImageBitmap == null) {
          return;
       }
       Rect bounds = this.getBounds();
       if (bounds.isEmpty()) {
          return;
       }
       double d = -0.00f;
       TKViewBackgroundDrawable tKViewBackgr = 1;
       if (this.hasRoundedBorders()) {
          if (path.mInnerClipPathForBorderRadius == null) {
             this.updatePath();
          }
          path.mBackgroundImagePath = path.mInnerClipPathForBorderRadius;
       }else {
          TKViewBackgroundDrawable mBackgroundI = path.mBackgroundImageRectF;
          height = 3;
          if (mBackgroundI == null) {
             path.mBackgroundImageRectF = new RectF((float)path.getBorderWidth(0), (float)path.getBorderWidth(tKViewBackgr), (float)(bounds.right - path.getBorderWidth(d)), (float)(bounds.bottom - path.getBorderWidth(height)));
          }else {
             mBackgroundI.left = (float)path.getBorderWidth(0);
             path.mBackgroundImageRectF.top = (float)path.getBorderWidth(tKViewBackgr);
             path.mBackgroundImageRectF.right = (float)(bounds.right - path.getBorderWidth(d));
             path.mBackgroundImageRectF.bottom = (float)(bounds.bottom - path.getBorderWidth(height));
          }
          mBackgroundI = path.mBackgroundImagePath;
          if (mBackgroundI == null) {
             path.mBackgroundImagePath = new Path();
          }else {
             mBackgroundI.reset();
          }
          path.mBackgroundImagePath.addRect(path.mBackgroundImageRectF, Path$Direction.CW);
       }
       int width = path.mBackgroundImageBitmap.getWidth();
       height = path.mBackgroundImageBitmap.getHeight();
       if (width != bounds.width() || height != bounds.height()) {
          TKViewBackgroundDrawable mScaleType = path.mScaleType;
          double d1 = 0x3ff0000000000000;
          if (t$b.e == mScaleType) {
             double d2 = (double)width;
             double d3 = (double)height;
             if (((d2 * d1) / d3) - (((double)bounds.width() * d1) / (double)bounds.height()) >= 0) {
                width = bounds.width();
                i = (int)(((double)(bounds.width() * height) * 0x3ff0000000000000) / d2);
             }else {
                i = bounds.height();
                width = (int)(((double)(bounds.height() * width) * 0x3ff0000000000000) / d3);
             }
             path.mBackgroundImageBitmap = Bitmap.createScaledBitmap(path.mBackgroundImageBitmap, width, i, true);
          }else if(t$b.i == mScaleType){
             d = (double)width;
             double d4 = (double)height;
             if (((d * d1) / d4) - (((double)bounds.width() * d1) / (double)bounds.height()) <= 0) {
                i1 = bounds.width();
                i = (int)(((double)(bounds.width() * height) * 0x3ff0000000000000) / d);
             }else {
                i = bounds.height();
                i1 = (int)(((double)(bounds.height() * width) * 0x3ff0000000000000) / d4);
             }
             if (i1 != width || i != height) {
                path.mBackgroundImageBitmap = Bitmap.createScaledBitmap(path.mBackgroundImageBitmap, i1, i, true);
             }
          }
       }
       BitmapDrawable uBitmapDrawa = new BitmapDrawable(path.mContext.getResources(), path.mBackgroundImageBitmap);
       path.mBackgroundImageDrawable = uBitmapDrawa;
       uBitmapDrawa.setBounds(0, 0, uBitmapDrawa.getIntrinsicWidth(), path.mBackgroundImageDrawable.getIntrinsicHeight());
       path.mBackgroundImageOffsetX = (bounds.width() - path.mBackgroundImageDrawable.getIntrinsicWidth()) / 2;
       path.mBackgroundImageOffsetY = (bounds.height() - path.mBackgroundImageDrawable.getIntrinsicHeight()) / 2;
       return;
    }
    public void updateBackgroundImage(Bitmap p0,t$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKViewBackgroundDrawable.class, "38")) {
          return;
       }
       this.mBackgroundImageBitmap = p0;
       this.mScaleType = p1;
       this.updateBackgroundImage();
       this.invalidateSelf();
       return;
    }
    public final void updatePaintOnBorderStyle(TKViewBackgroundDrawable$BorderStyle p0,float p1){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, TKViewBackgroundDrawable.class, "36")) {
          return;
       }
       if (p0 != null) {
          this.updatePathEffect(p0, p1);
          this.mPaint.setStyle(Paint$Style.STROKE);
          this.mPaint.setStrokeWidth((p1 * 2.00f));
       }else {
          this.updatePathEffect(null, 0);
          this.mPaint.setStyle(Paint$Style.FILL);
       }
       return;
    }
    public final void updatePath(){
       boolean b = this;
       if (PatchProxy.applyVoid(null, b, TKViewBackgroundDrawable.class, "23")) {
          return;
       }
       if (b.mNeedUpdatePathForBorderRadius == null) {
          return;
       }
       boolean b1 = false;
       b.mNeedUpdatePathForBorderRadius = b1;
       if (b.mInnerClipPathForBorderRadius == null) {
          b.mInnerClipPathForBorderRadius = new Path();
       }
       if (b.mOuterClipPathForBorderRadius == null) {
          b.mOuterClipPathForBorderRadius = new Path();
       }
       if (b.mPathForBorderRadiusOutline == null) {
          b.mPathForBorderRadiusOutline = new Path();
       }
       if (b.mCenterDrawPath == null) {
          b.mCenterDrawPath = new Path();
       }
       if (b.mInnerClipTempRectForBorderRadius == null) {
          b.mInnerClipTempRectForBorderRadius = new RectF();
       }
       if (b.mOuterClipTempRectForBorderRadius == null) {
          b.mOuterClipTempRectForBorderRadius = new RectF();
       }
       if (b.mTempRectForBorderRadiusOutline == null) {
          b.mTempRectForBorderRadiusOutline = new RectF();
       }
       if (b.mTempRectForCenterDrawPath == null) {
          b.mTempRectForCenterDrawPath = new RectF();
       }
       b.mInnerClipPathForBorderRadius.reset();
       b.mOuterClipPathForBorderRadius.reset();
       b.mPathForBorderRadiusOutline.reset();
       b.mCenterDrawPath.reset();
       Rect rect = new Rect(this.getBoundsExcludeShadow());
       b.mInnerClipTempRectForBorderRadius.set(rect);
       b.mOuterClipTempRectForBorderRadius.set(rect);
       b.mTempRectForBorderRadiusOutline.set(rect);
       b.mTempRectForCenterDrawPath.set(rect);
       float fullBorderWi = this.getFullBorderWidth();
       float f = 0;
       if (fullBorderWi - f > 0) {
          b.mTempRectForCenterDrawPath.inset((fullBorderWi * 0x3f000000), (fullBorderWi * 0x3f000000));
       }
       RectF directionAwa = this.getDirectionAwareBorderInsets();
       TKViewBackgroundDrawable mInnerClipTe = b.mInnerClipTempRectForBorderRadius;
       mInnerClipTe.top = mInnerClipTe.top + directionAwa.top;
       mInnerClipTe.bottom = mInnerClipTe.bottom - directionAwa.bottom;
       mInnerClipTe.left = mInnerClipTe.left + directionAwa.left;
       mInnerClipTe.right = mInnerClipTe.right - directionAwa.right;
       float fullBorderRa = this.getFullBorderRadius();
       float borderRadius = b.getBorderRadiusOrDefaultTo(fullBorderRa, TKViewBackgroundDrawable$BorderRadiusLocation.TOP_LEFT);
       float borderRadius1 = b.getBorderRadiusOrDefaultTo(fullBorderRa, TKViewBackgroundDrawable$BorderRadiusLocation.TOP_RIGHT);
       float borderRadius2 = b.getBorderRadiusOrDefaultTo(fullBorderRa, TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_LEFT);
       fullBorderRa = b.getBorderRadiusOrDefaultTo(fullBorderRa, TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_RIGHT);
       boolean b2 = (this.getResolvedLayoutDirection() == 1)? true: false;
       float borderRadius3 = b.getBorderRadius(TKViewBackgroundDrawable$BorderRadiusLocation.TOP_START);
       float borderRadius4 = b.getBorderRadius(TKViewBackgroundDrawable$BorderRadiusLocation.TOP_END);
       float borderRadius5 = b.getBorderRadius(TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_START);
       float borderRadius6 = b.getBorderRadius(TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_END);
       float f1 = (b2)? borderRadius4: borderRadius3;
       if (!b2) {
          borderRadius3 = borderRadius4;
       }
       borderRadius4 = (b2)? borderRadius6: borderRadius5;
       if (!b2) {
          borderRadius5 = borderRadius6;
       }
       if (!TKViewBackgroundDrawable.isUndefined(f1)) {
          borderRadius = f1;
       }
       if (!TKViewBackgroundDrawable.isUndefined(borderRadius3)) {
          borderRadius1 = borderRadius3;
       }
       if (!TKViewBackgroundDrawable.isUndefined(borderRadius4)) {
          borderRadius2 = borderRadius4;
       }
       if (!TKViewBackgroundDrawable.isUndefined(borderRadius5)) {
          fullBorderRa = borderRadius5;
       }
       float f2 = Math.max((borderRadius - directionAwa.left), f);
       borderRadius3 = Math.max((borderRadius - directionAwa.top), f);
       borderRadius4 = Math.max((borderRadius1 - directionAwa.right), f);
       borderRadius5 = Math.max((borderRadius1 - directionAwa.top), f);
       borderRadius6 = Math.max((fullBorderRa - directionAwa.right), f);
       f1 = Math.max((fullBorderRa - directionAwa.bottom), f);
       float f3 = Math.max((borderRadius2 - directionAwa.left), f);
       fullBorderWi = Math.max((borderRadius2 - directionAwa.bottom), f);
       float f4 = borderRadius2;
       int i = 8;
       float f5 = fullBorderRa;
       float[] uofloatArray = new float[i];
       uofloatArray[b1] = f2;
       uofloatArray[1] = borderRadius3;
       int i1 = 2;
       uofloatArray[i1] = borderRadius4;
       int i2 = 3;
       uofloatArray[i2] = borderRadius5;
       int i3 = 4;
       uofloatArray[i3] = borderRadius6;
       int i4 = 5;
       uofloatArray[i4] = f1;
       int i5 = 6;
       uofloatArray[i5] = f3;
       int i6 = 7;
       uofloatArray[i6] = fullBorderWi;
       b.mInnerClipPathForBorderRadius.addRoundRect(b.mInnerClipTempRectForBorderRadius, uofloatArray, Path$Direction.CW);
       uofloatArray = new float[i];
       uofloatArray[0] = borderRadius;
       uofloatArray[1] = borderRadius;
       uofloatArray[i1] = borderRadius1;
       uofloatArray[i2] = borderRadius1;
       uofloatArray[i3] = f5;
       uofloatArray[i4] = f5;
       uofloatArray[i5] = f4;
       uofloatArray[i6] = f4;
       b.mOuterClipPathForBorderRadius.addRoundRect(b.mOuterClipTempRectForBorderRadius, uofloatArray, Path$Direction.CW);
       TKViewBackgroundDrawable mBorderWidth = b.mBorderWidth;
       f = 2.00f;
       float f6 = (mBorderWidth != null)? mBorderWidth.a(i) / f: 0;
       float[] uofloatArray1 = new float[i];
       borderRadius = borderRadius + f6;
       uofloatArray1[0] = borderRadius;
       uofloatArray1[1] = borderRadius;
       borderRadius1 = borderRadius1 + f6;
       uofloatArray1[i1] = borderRadius1;
       uofloatArray1[i2] = borderRadius1;
       borderRadius = f5 + f6;
       uofloatArray1[i3] = borderRadius;
       uofloatArray1[i4] = borderRadius;
       borderRadius = f4 + f6;
       uofloatArray1[i5] = borderRadius;
       uofloatArray1[i6] = borderRadius;
       b.mPathForBorderRadiusOutline.addRoundRect(b.mTempRectForBorderRadiusOutline, uofloatArray1, Path$Direction.CW);
       float[] uofloatArray2 = new float[i];
       uofloatArray2[0] = f2 + f6;
       uofloatArray2[1] = borderRadius3 + f6;
       uofloatArray2[i1] = borderRadius4 + f6;
       uofloatArray2[i2] = borderRadius5 + f6;
       uofloatArray2[i3] = borderRadius6 + f6;
       uofloatArray2[i4] = f1 + f6;
       uofloatArray2[i5] = f3 + f6;
       uofloatArray2[i6] = fullBorderWi + f6;
       b.mCenterDrawPath.addRoundRect(b.mTempRectForCenterDrawPath, uofloatArray2, Path$Direction.CW);
       if (b.mInnerTopLeftCorner == null) {
          b.mInnerTopLeftCorner = new PointF();
       }
       mBorderWidth = b.mInnerTopLeftCorner;
       TKViewBackgroundDrawable tKViewBackgr = mBorderWidth;
       mInnerClipTe = b.mInnerClipTempRectForBorderRadius;
       RectF left = mInnerClipTe.left;
       mBorderWidth.x = left;
       RectF top = mInnerClipTe.top;
       mBorderWidth.y = top;
       mBorderWidth = b.mOuterClipTempRectForBorderRadius;
       TKViewBackgroundDrawable.getEllipseIntersectionWithLine((double)left, (double)top, (double)((f2 * f) + left), (double)((borderRadius3 * f) + top), (double)mBorderWidth.left, (double)mBorderWidth.top, (double)left, (double)top, tKViewBackgr);
       if (b.mInnerBottomLeftCorner == null) {
          b.mInnerBottomLeftCorner = new PointF();
       }
       mBorderWidth = b.mInnerBottomLeftCorner;
       tKViewBackgr = mBorderWidth;
       mInnerClipTe = b.mInnerClipTempRectForBorderRadius;
       left = mInnerClipTe.left;
       mBorderWidth.x = left;
       top = mInnerClipTe.bottom;
       mBorderWidth.y = top;
       mBorderWidth = b.mOuterClipTempRectForBorderRadius;
       TKViewBackgroundDrawable.getEllipseIntersectionWithLine((double)left, (double)(top - (fullBorderWi * f)), (double)((f3 * f) + left), (double)top, (double)mBorderWidth.left, (double)mBorderWidth.bottom, (double)left, (double)top, tKViewBackgr);
       if (b.mInnerTopRightCorner == null) {
          b.mInnerTopRightCorner = new PointF();
       }
       mBorderWidth = b.mInnerTopRightCorner;
       TKViewBackgroundDrawable tKViewBackgr1 = mBorderWidth;
       TKViewBackgroundDrawable mInnerClipTe1 = b.mInnerClipTempRectForBorderRadius;
       top = mInnerClipTe1.right;
       mBorderWidth.x = top;
       directionAwa = mInnerClipTe1.top;
       mBorderWidth.y = directionAwa;
       mBorderWidth = b.mOuterClipTempRectForBorderRadius;
       TKViewBackgroundDrawable.getEllipseIntersectionWithLine((double)(top - (borderRadius4 * f)), (double)directionAwa, (double)top, (double)((borderRadius5 * f) + directionAwa), (double)mBorderWidth.right, (double)mBorderWidth.top, (double)top, (double)directionAwa, tKViewBackgr1);
       if (b.mInnerBottomRightCorner == null) {
          b.mInnerBottomRightCorner = new PointF();
       }
       mBorderWidth = b.mInnerBottomRightCorner;
       tKViewBackgr1 = mBorderWidth;
       mInnerClipTe1 = b.mInnerClipTempRectForBorderRadius;
       top = mInnerClipTe1.right;
       mBorderWidth.x = top;
       directionAwa = mInnerClipTe1.bottom;
       mBorderWidth.y = directionAwa;
       mBorderWidth = b.mOuterClipTempRectForBorderRadius;
       TKViewBackgroundDrawable.getEllipseIntersectionWithLine((double)(top - (borderRadius6 * f)), (double)(directionAwa - (f1 * f)), (double)top, (double)directionAwa, (double)mBorderWidth.right, (double)mBorderWidth.bottom, (double)top, (double)directionAwa, tKViewBackgr1);
       return;
    }
    public final void updatePathEffect(TKViewBackgroundDrawable$BorderStyle p0,float p1){
       if (PatchProxy.isSupport(TKViewBackgroundDrawable.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, TKViewBackgroundDrawable.class, "26")) {
          return;
       }
       PathEffect pathEffect = (p0 != null)? TKViewBackgroundDrawable$BorderStyle.getPathEffect(p0, p1): null;
       this.mPathEffectForBorderStyle = pathEffect;
       this.mPaint.setPathEffect(pathEffect);
       return;
    }
}
