package com.horcrux.svg.SvgView;
import ze.s;
import ze.t;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import java.util.HashMap;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import ze.c;
import android.view.ViewGroup;
import android.view.View;
import com.horcrux.svg.VirtualView;
import com.horcrux.svg.Brush;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewParent;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.PropHelper;
import com.horcrux.svg.ViewBox;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Bitmap;
import java.lang.Float;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import java.lang.Runnable;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.SvgViewManager;
import java.lang.Integer;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import android.util.Base64;

public class SvgView extends ReactViewGroup implements s, t	// class@0005f6
{
    public String mAlign;
    public Bitmap mBitmap;
    public Canvas mCanvas;
    public final Map mDefinedBrushes;
    public final Map mDefinedClipPaths;
    public final Map mDefinedMarkers;
    public final Map mDefinedMasks;
    public final Map mDefinedTemplates;
    public final Matrix mInvViewBoxMatrix;
    public boolean mInvertible;
    public int mMeetOrSlice;
    public float mMinX;
    public float mMinY;
    public boolean mRendered;
    public boolean mResponsible;
    public final float mScale;
    public int mTintColor;
    public float mVbHeight;
    public float mVbWidth;
    public SVGLength mbbHeight;
    public SVGLength mbbWidth;
    public Runnable toDataUrlTask;

    public void SvgView(ReactContext p0){
       super(p0);
       this.toDataUrlTask = null;
       this.mResponsible = false;
       this.mDefinedClipPaths = new HashMap();
       this.mDefinedTemplates = new HashMap();
       this.mDefinedMarkers = new HashMap();
       this.mDefinedMasks = new HashMap();
       this.mDefinedBrushes = new HashMap();
       this.mInvViewBoxMatrix = new Matrix();
       this.mInvertible = true;
       this.mRendered = false;
       this.mTintColor = 0;
       this.mScale = c.d().density;
    }
    public final void clearChildCache(){
       if (this.mRendered == null) {
          return;
       }
       boolean b = false;
       this.mRendered = b;
       while (b < this.getChildCount()) {
          View childAt = this.getChildAt(b);
          if (childAt instanceof VirtualView) {
             childAt.clearChildCache();
          }
          b = b + 1;
       }
       return;
    }
    public void defineBrush(Brush p0,String p1){
       this.mDefinedBrushes.put(p1, p0);
    }
    public void defineClipPath(VirtualView p0,String p1){
       this.mDefinedClipPaths.put(p1, p0);
    }
    public void defineMarker(VirtualView p0,String p1){
       this.mDefinedMarkers.put(p1, p0);
    }
    public void defineMask(VirtualView p0,String p1){
       this.mDefinedMasks.put(p1, p0);
    }
    public void defineTemplate(VirtualView p0,String p1){
       this.mDefinedTemplates.put(p1, p0);
    }
    public synchronized void drawChildren(Canvas p0){
       this.mRendered = true;
       this.mCanvas = p0;
       Matrix matrix = new Matrix();
       if (this.mAlign != null) {
          RectF viewBox = this.getViewBox();
          float f = (float)p0.getWidth();
          float f1 = (float)p0.getHeight();
          if (v4 = this.getParent() instanceof VirtualView) {
             f = (float)PropHelper.fromRelative(this.mbbWidth, (double)f, 0, (double)this.mScale, 12.00f);
             f1 = (float)PropHelper.fromRelative(this.mbbHeight, (double)f1, 0, (double)this.mScale, 12.00f);
          }
          RectF rectF = new RectF(0, 0, f, f1);
          if (v4) {
             p0.clipRect(rectF);
          }
          matrix = ViewBox.getTransform(viewBox, rectF, this.mAlign, this.mMeetOrSlice);
          this.mInvertible = matrix.invert(this.mInvViewBoxMatrix);
          p0.concat(matrix);
       }
       Paint paint = new Paint();
       paint.setFlags(385);
       paint.setTypeface(Typeface.DEFAULT);
       int i = 0;
       int i1 = 0;
       while (i1 < this.getChildCount()) {
          View childAt = this.getChildAt(i1);
          if (childAt instanceof VirtualView) {
             childAt.saveDefinition();
          }
          i1 = i1 + 1;
       }
       while (i < this.getChildCount()) {
          View childAt1 = this.getChildAt(i);
          if (childAt1 instanceof VirtualView) {
             childAt1.render(p0, paint, 0x3f800000);
             childAt1.restoreCanvas(p0, childAt1.saveAndSetupCanvas(p0, matrix));
             if (childAt1.isResponsible() && this.mResponsible == null) {
                this.mResponsible = true;
             }
          }
          i = i + 1;
       }
       return;
    }
    public final Bitmap drawOutput(){
       boolean b = true;
       this.mRendered = b;
       float f = (float)this.getWidth();
       float f1 = (float)this.getHeight();
       if (!Float.isNaN(f) && !Float.isNaN(f1)) {
          int i = 0x3f800000;
          if (f - i < 0 || (f1 - i >= 0 && (Math.log10((double)f) + Math.log10((double)f1)) - 0x4045000000000000 <= 0)) {
             b = false;
          }
       }
    label_0036 :
       if (b) {
          return null;
       }else {
          Bitmap uBitmap = Bitmap.createBitmap((int)f, (int)f1, Bitmap$Config.ARGB_8888);
          this.drawChildren(new Canvas(uBitmap));
          return uBitmap;
       }
    }
    public void enableTouchEvents(){
       if (this.mResponsible == null) {
          this.mResponsible = true;
       }
       return;
    }
    public Rect getCanvasBounds(){
       return this.mCanvas.getClipBounds();
    }
    public Brush getDefinedBrush(String p0){
       return this.mDefinedBrushes.get(p0);
    }
    public VirtualView getDefinedClipPath(String p0){
       return this.mDefinedClipPaths.get(p0);
    }
    public VirtualView getDefinedMarker(String p0){
       return this.mDefinedMarkers.get(p0);
    }
    public VirtualView getDefinedMask(String p0){
       return this.mDefinedMasks.get(p0);
    }
    public VirtualView getDefinedTemplate(String p0){
       return this.mDefinedTemplates.get(p0);
    }
    public final RectF getViewBox(){
       SvgView tmMinX = this.mMinX;
       SvgView tmScale = this.mScale;
       float f = tmMinX * tmScale;
       SvgView tmMinY = this.mMinY;
       float f1 = tmMinY * tmScale;
       return new RectF(f, f1, ((tmMinX + this.mVbWidth) * tmScale), ((tmMinY + this.mVbHeight) * tmScale));
    }
    public final int hitTest(float p0,float p1){
       if (this.mResponsible == null || this.mInvertible == null) {
          return this.getId();
       }
       float[] uofloatArray = new float[]{p0,p1};
       this.mInvViewBoxMatrix.mapPoints(uofloatArray);
       int i = this.getChildCount() - 1;
       int i1 = -1;
       while (i >= 0) {
          View childAt = this.getChildAt(i);
          if (childAt instanceof VirtualView) {
             i1 = childAt.hitTest(uofloatArray);
          }else if(childAt instanceof SvgView){
             i1 = childAt.hitTest(p0, p1);
          }
          if (i1 != -1) {
             break ;
          }
          i = i - 1;
       }
       if (i1 == -1) {
          i1 = this.getId();
       }
       return i1;
    }
    public boolean interceptsTouchEvent(float p0,float p1){
       return true;
    }
    public void invalidate(){
       super.invalidate();
       ViewParent parent = this.getParent();
       if (parent instanceof VirtualView) {
          if (this.mRendered == null) {
             return;
          }else {
             this.mRendered = false;
             parent.getSvgView().invalidate();
             return;
          }
       }else {
          SvgView tmBitmap = this.mBitmap;
          if (tmBitmap != null) {
             tmBitmap.recycle();
          }
          this.mBitmap = null;
          return;
       }
    }
    public boolean isResponsible(){
       return this.mResponsible;
    }
    public boolean notRendered(){
       return (this.mRendered ^ 0x01);
    }
    public void onDraw(Canvas p0){
       if (this.getParent() instanceof VirtualView) {
          return;
       }
       super.onDraw(p0);
       if (this.mBitmap == null) {
          this.mBitmap = this.drawOutput();
       }
       SvgView tmBitmap = this.mBitmap;
       if (tmBitmap != null) {
          p0.drawBitmap(tmBitmap, 0, 0, null);
          SvgView ttoDataUrlTa = this.toDataUrlTask;
          if (ttoDataUrlTa != null) {
             ttoDataUrlTa.run();
             this.toDataUrlTask = null;
          }
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.invalidate();
    }
    public int reactTagForTouch(float p0,float p1){
       return this.hitTest(p0, p1);
    }
    public void setAlign(String p0){
       this.mAlign = p0;
       this.invalidate();
       this.clearChildCache();
    }
    public void setBbHeight(Dynamic p0){
       this.mbbHeight = SVGLength.from(p0);
       this.invalidate();
       this.clearChildCache();
    }
    public void setBbWidth(Dynamic p0){
       this.mbbWidth = SVGLength.from(p0);
       this.invalidate();
       this.clearChildCache();
    }
    public void setId(int p0){
       super.setId(p0);
       SvgViewManager.setSvgView(p0, this);
    }
    public void setMeetOrSlice(int p0){
       this.mMeetOrSlice = p0;
       this.invalidate();
       this.clearChildCache();
    }
    public void setMinX(float p0){
       this.mMinX = p0;
       this.invalidate();
       this.clearChildCache();
    }
    public void setMinY(float p0){
       this.mMinY = p0;
       this.invalidate();
       this.clearChildCache();
    }
    public void setTintColor(Integer p0){
       this.mTintColor = (p0 == null)? 0: p0.intValue();
       this.invalidate();
       this.clearChildCache();
       return;
    }
    public void setToDataUrlTask(Runnable p0){
       this.toDataUrlTask = p0;
    }
    public void setVbHeight(float p0){
       this.mVbHeight = p0;
       this.invalidate();
       this.clearChildCache();
    }
    public void setVbWidth(float p0){
       this.mVbWidth = p0;
       this.invalidate();
       this.clearChildCache();
    }
    public String toDataURL(){
       Bitmap uBitmap = Bitmap.createBitmap(this.getWidth(), this.getHeight(), Bitmap$Config.ARGB_8888);
       this.clearChildCache();
       this.drawChildren(new Canvas(uBitmap));
       this.clearChildCache();
       this.invalidate();
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       uBitmap.compress(Bitmap$CompressFormat.PNG, 100, uByteArrayOu);
       uBitmap.recycle();
       byte[] uobyteArray = uByteArrayOu.toByteArray();
       return Base64.encodeToString(uobyteArray, 0);
    }
    public String toDataURL(int p0,int p1){
       Bitmap uBitmap = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
       this.clearChildCache();
       this.drawChildren(new Canvas(uBitmap));
       this.clearChildCache();
       this.invalidate();
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       uBitmap.compress(Bitmap$CompressFormat.PNG, 100, uByteArrayOu);
       uBitmap.recycle();
       byte[] uobyteArray = uByteArrayOu.toByteArray();
       return Base64.encodeToString(uobyteArray, 0);
    }
}
