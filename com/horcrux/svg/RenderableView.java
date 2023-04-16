package com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualView;
import java.lang.String;
import java.util.regex.Pattern;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.SVGLength;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.Path$FillType;
import android.view.ViewGroup;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import android.graphics.Region;
import java.lang.Math;
import java.lang.Object;
import com.facebook.react.uimanager.PointerEvents;
import java.util.Collection;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.MaskView;
import android.graphics.Rect;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import com.horcrux.svg.GroupView;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import com.horcrux.svg.MarkerView;
import com.horcrux.svg.RNSVGMarkerPosition;
import java.util.Iterator;
import com.horcrux.svg.RenderableView$1;
import java.lang.Enum;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import java.lang.Integer;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.Double;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import android.view.View;
import com.horcrux.svg.RenderableViewManager;
import android.graphics.Paint$Style;
import com.horcrux.svg.Brush;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;

public abstract class RenderableView extends VirtualView	// class@0005be
{
    public ReadableArray fill;
    public float fillOpacity;
    public Path$FillType fillRule;
    public ArrayList mAttributeList;
    public ArrayList mLastMergedList;
    public ArrayList mOriginProperties;
    public ArrayList mPropList;
    public ReadableArray stroke;
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint$Cap strokeLinecap;
    public Paint$Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;
    public static RenderableView contextElement;
    public static final Pattern regex;

    static {
       RenderableView.regex = Pattern.compile("[0-9.-]+");
    }
    public void RenderableView(ReactContext p0){
       super(p0);
       this.vectorEffect = 0;
       this.strokeWidth = new SVGLength(0x3ff0000000000000);
       this.strokeOpacity = 0x3f800000;
       this.strokeMiterlimit = 4.00f;
       this.strokeDashoffset = 0;
       this.strokeLinecap = Paint$Cap.BUTT;
       this.strokeLinejoin = Paint$Join.MITER;
       this.fillOpacity = 0x3f800000;
       this.fillRule = Path$FillType.WINDING;
       this.setPivotX(0);
       this.setPivotY(0);
    }
    public static double saturate(double p0){
       int i = 0;
       if (p0 - i <= 0) {
          p0 = i;
       }else if(p0 - 0x3ff0000000000000 >= 0){
          p0 = 0x3ff0000000000000;
       }
       return p0;
    }
    public void draw(Canvas p0,Paint p1,float p2){
       RectF rectF;
       p2 = p2 * this.mOpacity;
       VirtualView virtualView = null;
       boolean b = true;
       Path path = (this.mPath == null)? 1: null;
       if (path) {
          Path path1 = this.getPath(p0, p1);
          this.mPath = path1;
          path1.setFillType(this.fillRule);
       }
       if (this.vectorEffect == b) {
          virtualView = 1;
       }
       VirtualView tmPath = this.mPath;
       if (virtualView) {
          tmPath = new Path();
          this.mPath.transform(this.mCTM, tmPath);
          p0.setMatrix(null);
       }
       if (path || tmPath != this.mPath) {
          rectF = new RectF();
          this.mBox = rectF;
          tmPath.computeBounds(rectF, b);
       }
       rectF = new RectF(this.mBox);
       this.mCTM.mapRect(rectF);
       this.setClientRect(rectF);
       this.clip(p0, p1);
       if (this.setupFillPaint(p1, (this.fillOpacity * p2))) {
          if (path) {
             Path path2 = new Path();
             this.mFillPath = path2;
             p1.getFillPath(tmPath, path2);
          }
          p0.drawPath(tmPath, p1);
       }
       if (this.setupStrokePaint(p1, (this.strokeOpacity * p2))) {
          if (path) {
             path = new Path();
             this.mStrokePath = path;
             p1.getFillPath(tmPath, path);
          }
          p0.drawPath(tmPath, p1);
       }
       this.renderMarkers(p0, p1, p2);
       return;
    }
    public final ArrayList getAttributeList(){
       return this.mAttributeList;
    }
    public abstract Path getPath(Canvas p0,Paint p1);
    public Region getRegion(Path p0,RectF p1){
       Region region = new Region();
       region.setPath(p0, new Region((int)Math.floor((double)p1.left), (int)Math.floor((double)p1.top), (int)Math.ceil((double)p1.right), (int)Math.ceil((double)p1.bottom)));
       return region;
    }
    public final boolean hasOwnProperty(String p0){
       RenderableView tmAttributeL = this.mAttributeList;
       boolean b = (tmAttributeL != null && tmAttributeL.contains(p0))? true: false;
       return b;
    }
    public int hitTest(float[] p0){
       if (this.mPath == null || (this.mInvertible != null && this.mTransformInvertible != null)) {
          if (this.mPointerEvents == PointerEvents.NONE) {
             return -1;
          }else {
             float[] uofloatArray = new float[2];
             this.mInvMatrix.mapPoints(uofloatArray, p0);
             this.mInvTransform.mapPoints(uofloatArray);
             int i = Math.round(uofloatArray[0]);
             int i1 = Math.round(uofloatArray[1]);
             this.initBounds();
             VirtualView tmRegion = this.mRegion;
             if (tmRegion == null || !tmRegion.contains(i, i1)) {
                tmRegion = this.mStrokeRegion;
                if (tmRegion != null) {
                   if (!tmRegion.contains(i, i1)) {
                      tmRegion = this.mMarkerRegion;
                      if (tmRegion != null && tmRegion.contains(i, i1)) {
                      }
                   }else if(this.getClipPath() != null && !this.mClipRegion.contains(i, i1)){
                      return -1;
                   }else {
                      return this.getId();
                   }
                }
             }else {
                goto label_0052 ;
             }
          }
       }
    label_0066 :
       return -1;
    }
    public void initBounds(){
       RectF rectF;
       boolean b = true;
       if (this.mRegion == null && this.mFillPath != null) {
          rectF = new RectF();
          this.mFillBounds = rectF;
          this.mFillPath.computeBounds(rectF, b);
          this.mRegion = this.getRegion(this.mFillPath, this.mFillBounds);
       }
       if (this.mRegion == null && this.mPath != null) {
          rectF = new RectF();
          this.mFillBounds = rectF;
          this.mPath.computeBounds(rectF, b);
          this.mRegion = this.getRegion(this.mPath, this.mFillBounds);
       }
       if (this.mStrokeRegion == null && this.mStrokePath != null) {
          rectF = new RectF();
          this.mStrokeBounds = rectF;
          this.mStrokePath.computeBounds(rectF, b);
          this.mStrokeRegion = this.getRegion(this.mStrokePath, this.mStrokeBounds);
       }
       if (this.mMarkerRegion == null && this.mMarkerPath != null) {
          rectF = new RectF();
          this.mMarkerBounds = rectF;
          this.mMarkerPath.computeBounds(rectF, b);
          this.mMarkerRegion = this.getRegion(this.mMarkerPath, this.mMarkerBounds);
       }
       Path clipPath = this.getClipPath();
       if (clipPath != null && this.mClipRegionPath != clipPath) {
          this.mClipRegionPath = clipPath;
          RectF rectF1 = new RectF();
          this.mClipBounds = rectF1;
          clipPath.computeBounds(rectF1, b);
          this.mClipRegion = this.getRegion(clipPath, this.mClipBounds);
       }
       return;
    }
    public void mergeProperties(RenderableView p0){
       ArrayList attributeLis = p0.getAttributeList();
       if (attributeLis != null && attributeLis.size()) {
          this.mOriginProperties = new ArrayList();
          ArrayList uArrayList = (this.mPropList == null)? new ArrayList(): new ArrayList(this.mPropList);
          this.mAttributeList = uArrayList;
          int i = 0;
          int i1 = attributeLis.size();
          while (i < i1) {
             try{
                String str = attributeLis.get(i);
                Field field = this.getClass().getField(str);
                Object obj = field.get(p0);
                this.mOriginProperties.add(field.get(this));
                if (!this.hasOwnProperty(str)) {
                   this.mAttributeList.add(str);
                   field.set(this, obj);
                }
                i = i + 1;
             }catch(java.lang.Exception e9){
                throw new IllegalStateException(e9);
             }
          }
          this.mLastMergedList = attributeLis;
       }
       return;
    }
    public void render(Canvas p0,Paint p1,float p2){
       VirtualView virtualView = this;
       Paint paint = p1;
       MaskView definedMask = (virtualView.mMask != null)? this.getSvgView().getDefinedMask(virtualView.mMask): null;
       if (definedMask != null) {
          Rect clipBounds = p0.getClipBounds();
          int i = clipBounds.height();
          int i1 = clipBounds.width();
          Bitmap uBitmap = Bitmap.createBitmap(i1, i, Bitmap$Config.ARGB_8888);
          Bitmap uBitmap1 = Bitmap.createBitmap(i1, i, Bitmap$Config.ARGB_8888);
          Bitmap uBitmap2 = Bitmap.createBitmap(i1, i, Bitmap$Config.ARGB_8888);
          Canvas uCanvas = new Canvas(uBitmap);
          int i2 = i1;
          uCanvas.clipRect((float)virtualView.relativeOnWidth(definedMask.mX), (float)virtualView.relativeOnHeight(definedMask.mY), (float)virtualView.relativeOnWidth(definedMask.mW), (float)virtualView.relativeOnHeight(definedMask.mH));
          Paint paint1 = new Paint(1);
          definedMask.draw(uCanvas, paint1, 0x3f800000);
          i1 = i2 * i;
          int[] ointArray = new int[i1];
          Canvas uCanvas1 = new Canvas(uBitmap2);
          Canvas uCanvas2 = new Canvas(uBitmap1);
          Bitmap uBitmap3 = uBitmap2;
          uBitmap.getPixels(ointArray, 0, i2, 0, null, i2, i);
          int i3 = 0;
          while (i3 < i1) {
             int i4 = ointArray[i3];
             int i5 = i4 >> 16;
             i5 = i5 & 0x00ff;
             int i6 = i4 >> 8;
             i6 = i6 & 0x00ff;
             int i7 = i4 & 0x00ff;
             i4 = i4 >> 24;
             double d = (double)i5 * 0x3fd322d0e5604189;
             double d1 = (double)i6 * 0x3fe2c8b439581062;
             d = d + d1;
             double d2 = (double)i7 * 0x3fc26e978d4fdf3b;
             d = d + d2;
             d = d / 0x406fe00000000000;
             double d3 = (double)i4 * RenderableView.saturate(d);
             int i8 = (int)d3 << 24;
             ointArray[i3] = i8;
             i3 = i3 + 1;
             i1 = i1;
             paint1 = paint1;
          }
          uBitmap.setPixels(ointArray, 0, i2, 0, 0, i2, i);
          virtualView.draw(uCanvas2, paint, p2);
          paint1 = paint1;
          paint1.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
          Canvas uCanvas3 = uCanvas1;
          uCanvas3.drawBitmap(uBitmap1, 0, 0, null);
          uCanvas3.drawBitmap(uBitmap, 0, 0, paint1);
          p0.drawBitmap(uBitmap3, 0, 0, paint);
       }else {
          this.draw(p0, p1, p2);
       }
       return;
    }
    public void renderMarkers(Canvas p0,Paint p1,float p2){
       MarkerView markerView;
       MarkerView definedMarke = this.getSvgView().getDefinedMarker(this.mMarkerStart);
       MarkerView definedMarke1 = this.getSvgView().getDefinedMarker(this.mMarkerMid);
       MarkerView definedMarke2 = this.getSvgView().getDefinedMarker(this.mMarkerEnd);
       VirtualView telements = this.elements;
       if (telements != null && (definedMarke == null && (definedMarke1 != null || definedMarke2 != null))) {
          RenderableView.contextElement = this;
          ArrayList uArrayList = RNSVGMarkerPosition.fromPath(telements);
          RenderableView tstrokeWidth = this.strokeWidth;
          double d = (tstrokeWidth != null)? this.relativeOnOther(tstrokeWidth): 0x3ff0000000000000;
          float f = (float)d;
          this.mMarkerPath = new Path();
          Iterator iterator = uArrayList.iterator();
          RenderableView renderableVi = null;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i = RenderableView$1.$SwitchMap$com$horcrux$svg$RNSVGMarkerType[obj.type.ordinal()];
             if (i != 1) {
                if (i != 2) {
                   markerView = (i != 3)? renderableVi: definedMarke2;
                }else {
                   markerView = definedMarke1;
                }
             }else {
                markerView = definedMarke;
             }
             if (markerView == null) {
                continue ;
             }
             markerView.renderMarker(p0, p1, p2, obj, f);
             this.mMarkerPath.addPath(markerView.getPath(p0, p1), markerView.markerTransform);
          }
          RenderableView.contextElement = renderableVi;
       }
       return;
    }
    public void resetProperties(){
       RenderableView tmLastMerged = this.mLastMergedList;
       if (tmLastMerged != null && this.mOriginProperties != null) {
          try{
             for (int i = tmLastMerged.size() - 1; i >= 0; i = i - 1) {
                this.getClass().getField(this.mLastMergedList.get(i)).set(this, this.mOriginProperties.get(i));
             }
             this.mLastMergedList = null;
             this.mOriginProperties = null;
             this.mAttributeList = this.mPropList;
          }catch(java.lang.Exception e0){
             throw new IllegalStateException(e0);
          }
       }
       return;
    }
    public void setFill(Dynamic p0){
       if (p0 == null || p0.isNull()) {
          this.fill = null;
          this.invalidate();
          return;
       }else {
          ReadableType type = p0.getType();
          int i = 0;
          if (type.equals(ReadableType.Number)) {
             Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(p0.asInt())};
             this.fill = JavaOnlyArray.of(objArray);
          }else if(type.equals(ReadableType.Array)){
             this.fill = p0.asArray();
          }else {
             JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
             javaOnlyArra.pushInt(i);
             Matcher matcher = RenderableView.regex.matcher(p0.asString());
             while (matcher.find()) {
                double d = Double.parseDouble(matcher.group());
                int i1 = i + 1;
                if (i < 3) {
                   d = d / 0x406fe00000000000;
                }
                javaOnlyArra.pushDouble(d);
                i = i1;
             }
             this.fill = javaOnlyArra;
          }
          this.invalidate();
          return;
       }
    }
    public void setFillOpacity(float p0){
       this.fillOpacity = p0;
       this.invalidate();
    }
    public void setFillRule(int p0){
       if (p0) {
          if (p0 != 1) {
             throw new JSApplicationIllegalArgumentException("fillRule "+p0+" unrecognized");
          }
       }else {
          this.fillRule = Path$FillType.EVEN_ODD;
       }
       this.invalidate();
       return;
    }
    public void setId(int p0){
       super.setId(p0);
       RenderableViewManager.setRenderableView(p0, this);
    }
    public void setPropList(ReadableArray p0){
       if (p0 != null) {
          ArrayList uArrayList = new ArrayList();
          this.mAttributeList = uArrayList;
          this.mPropList = uArrayList;
          for (int i = 0; i < p0.size(); i = i + 1) {
             this.mPropList.add(p0.getString(i));
          }
       }
       this.invalidate();
       return;
    }
    public void setStroke(Dynamic p0){
       if (p0 == null || p0.isNull()) {
          this.stroke = null;
          this.invalidate();
          return;
       }else {
          ReadableType type = p0.getType();
          int i = 0;
          if (type.equals(ReadableType.Number)) {
             Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(p0.asInt())};
             this.stroke = JavaOnlyArray.of(objArray);
          }else if(type.equals(ReadableType.Array)){
             this.stroke = p0.asArray();
          }else {
             JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
             javaOnlyArra.pushInt(i);
             Matcher matcher = RenderableView.regex.matcher(p0.asString());
             while (matcher.find()) {
                double d = Double.parseDouble(matcher.group());
                int i1 = i + 1;
                if (i < 3) {
                   d = d / 0x406fe00000000000;
                }
                javaOnlyArra.pushDouble(d);
                i = i1;
             }
             this.stroke = javaOnlyArra;
          }
          this.invalidate();
          return;
       }
    }
    public void setStrokeDasharray(ReadableArray p0){
       if (p0 != null) {
          int i = p0.size();
          SVGLength[] sVGLengthArr = new SVGLength[i];
          this.strokeDasharray = sVGLengthArr;
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             this.strokeDasharray[i1] = SVGLength.from(p0.getDynamic(i1));
          }
       }else {
          this.strokeDasharray = null;
       }
       this.invalidate();
       return;
    }
    public void setStrokeDashoffset(float p0){
       this.strokeDashoffset = p0 * this.mScale;
       this.invalidate();
    }
    public void setStrokeLinecap(int p0){
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                this.strokeLinecap = Paint$Cap.SQUARE;
             }else {
                throw new JSApplicationIllegalArgumentException("strokeLinecap "+p0+" unrecognized");
             }
          }else {
             this.strokeLinecap = Paint$Cap.ROUND;
          }
       }else {
          this.strokeLinecap = Paint$Cap.BUTT;
       }
       this.invalidate();
       return;
    }
    public void setStrokeLinejoin(int p0){
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                this.strokeLinejoin = Paint$Join.BEVEL;
             }else {
                throw new JSApplicationIllegalArgumentException("strokeLinejoin "+p0+" unrecognized");
             }
          }else {
             this.strokeLinejoin = Paint$Join.ROUND;
          }
       }else {
          this.strokeLinejoin = Paint$Join.MITER;
       }
       this.invalidate();
       return;
    }
    public void setStrokeMiterlimit(float p0){
       this.strokeMiterlimit = p0;
       this.invalidate();
    }
    public void setStrokeOpacity(float p0){
       this.strokeOpacity = p0;
       this.invalidate();
    }
    public void setStrokeWidth(Dynamic p0){
       this.strokeWidth = SVGLength.from(p0);
       this.invalidate();
    }
    public void setVectorEffect(int p0){
       this.vectorEffect = p0;
       this.invalidate();
    }
    public boolean setupFillPaint(Paint p0,float p1){
       RenderableView tfill = this.fill;
       if (tfill == null || tfill.size() <= 0) {
          return false;
       }
       p0.reset();
       p0.setFlags(385);
       p0.setStyle(Paint$Style.FILL);
       this.setupPaint(p0, p1, this.fill);
       return true;
    }
    public final void setupPaint(Paint p0,float p1,ReadableArray p2){
       RenderableView contextEleme;
       double d;
       int intx = p2.getInt(0);
       VirtualView virtualView = 3;
       int i = 4;
       int i1 = 2;
       if (intx) {
          if (intx != 1) {
             if (intx != i1) {
                if (intx != virtualView) {
                   if (intx == i) {
                      contextEleme = RenderableView.contextElement;
                      if (contextEleme != null) {
                         contextEleme = contextEleme.stroke;
                         if (contextEleme != null) {
                            this.setupPaint(p0, p1, contextEleme);
                         }
                      }
                   }
                }else {
                   contextEleme = RenderableView.contextElement;
                   if (contextEleme != null) {
                      contextEleme = contextEleme.fill;
                      if (contextEleme != null) {
                         this.setupPaint(p0, p1, contextEleme);
                      }
                   }
                }
             }else {
                p0.setColor(this.getSvgView().mTintColor);
             }
          }else {
             Brush definedBrush = this.getSvgView().getDefinedBrush(p2.getString(1));
             if (definedBrush != null) {
                definedBrush.setupPaint(p0, this.mBox, this.mScale, p1);
             }
          }
       }else if(p2.size() == i1){
          int intx1 = p2.getInt(1);
          p0.setColor(((Math.round(((float)(intx1 >> 24) * p1)) << 24) | (intx1 & 0xffffff)));
       }else if(p2.size() > i){
          d = (p2.getDouble(i) * (double)p1) * 0x406fe00000000000;
       }else {
          d = (double)(p1 * 0x437f0000);
       }
       p0.setARGB((int)d, (int)(p2.getDouble(1) * 0x406fe00000000000), (int)(p2.getDouble(i1) * 0x406fe00000000000), (int)(p2.getDouble(virtualView) * 0x406fe00000000000));
    label_009f :
       return;
    }
    public boolean setupStrokePaint(Paint p0,float p1){
       p0.reset();
       double d = this.relativeOnOther(this.strokeWidth);
       boolean b = false;
       if (d - null) {
          RenderableView tstroke = this.stroke;
          if (tstroke != null && tstroke.size()) {
             p0.setFlags(385);
             p0.setStyle(Paint$Style.STROKE);
             p0.setStrokeCap(this.strokeLinecap);
             p0.setStrokeJoin(this.strokeLinejoin);
             p0.setStrokeMiter((this.strokeMiterlimit * this.mScale));
             p0.setStrokeWidth((float)d);
             this.setupPaint(p0, p1, this.stroke);
             RenderableView tstrokeDasha = this.strokeDasharray;
             if (tstrokeDasha != null) {
                int len = tstrokeDasha.length;
                float[] uofloatArray = new float[len];
                for (; b < len; b = b + 1) {
                   uofloatArray[b] = (float)this.relativeOnOther(this.strokeDasharray[b]);
                }
                p0.setPathEffect(new DashPathEffect(uofloatArray, this.strokeDashoffset));
             }
             return true;
          }
       }
       return b;
    }
}
