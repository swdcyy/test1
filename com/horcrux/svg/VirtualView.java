package com.horcrux.svg.VirtualView;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import ze.c;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewParent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.VirtualView$1;
import java.lang.Enum;
import java.lang.Math;
import com.horcrux.svg.GroupView;
import com.horcrux.svg.SvgView;
import android.graphics.Rect;
import com.horcrux.svg.GlyphContext;
import android.graphics.RectF;
import java.lang.String;
import com.horcrux.svg.ClipPathView;
import android.graphics.Region$Op;
import java.lang.StringBuilder;
import cb.a;
import android.graphics.Path$FillType;
import java.lang.Class;
import java.lang.Object;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.SVGLength$UnitType;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import df.c;
import ze.o;
import df.b;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.PropHelper;
import com.facebook.react.uimanager.PointerEvents;

public abstract class VirtualView extends ReactViewGroup	// class@00061a
{
    public double canvasDiagonal;
    public float canvasHeight;
    public float canvasWidth;
    public ArrayList elements;
    public double fontSize;
    public GlyphContext glyphContext;
    public RectF mBox;
    public Matrix mCTM;
    public boolean mCTMInvertible;
    public Path mCachedClipPath;
    public RectF mClientRect;
    public RectF mClipBounds;
    public String mClipPath;
    public Region mClipRegion;
    public Path mClipRegionPath;
    public int mClipRule;
    public final ReactContext mContext;
    public String mDisplay;
    public RectF mFillBounds;
    public Path mFillPath;
    public Matrix mInvCTM;
    public Matrix mInvMatrix;
    public final Matrix mInvTransform;
    public boolean mInvertible;
    public RectF mMarkerBounds;
    public String mMarkerEnd;
    public String mMarkerMid;
    public Path mMarkerPath;
    public Region mMarkerRegion;
    public String mMarkerStart;
    public String mMask;
    public Matrix mMatrix;
    public String mName;
    public boolean mOnLayout;
    public float mOpacity;
    public Path mPath;
    public PointerEvents mPointerEvents;
    public Region mRegion;
    public boolean mResponsible;
    public final float mScale;
    public RectF mStrokeBounds;
    public Path mStrokePath;
    public Region mStrokeRegion;
    public GroupView mTextRoot;
    public Matrix mTransform;
    public boolean mTransformInvertible;
    public SvgView svgView;
    public static final float[] sRawMatrix;

    static {
       VirtualView.sRawMatrix = new float[9]{0x3f800000,0,0,0,0x3f800000,0,0,0,0x3f800000};
    }
    public void VirtualView(ReactContext p0){
       super(p0);
       this.mOpacity = 0x3f800000;
       this.mCTM = new Matrix();
       this.mMatrix = new Matrix();
       this.mTransform = new Matrix();
       this.mInvCTM = new Matrix();
       this.mInvMatrix = new Matrix();
       this.mInvTransform = new Matrix();
       this.mInvertible = true;
       this.mCTMInvertible = true;
       this.mTransformInvertible = true;
       this.fontSize = 0xbff0000000000000;
       this.canvasDiagonal = 0xbff0000000000000;
       this.canvasHeight = 0xbf800000;
       this.canvasWidth = 0xbf800000;
       this.mContext = p0;
       this.mScale = c.d().density;
    }
    public void clearCache(){
       this.canvasDiagonal = 0xbff0000000000000;
       this.canvasHeight = 0xbf800000;
       this.canvasWidth = 0xbf800000;
       this.fontSize = 0xbff0000000000000;
       this.mStrokeRegion = null;
       this.mMarkerRegion = null;
       this.mRegion = null;
       this.mPath = null;
    }
    public void clearChildCache(){
       this.clearCache();
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (childAt instanceof VirtualView) {
             childAt.clearChildCache();
          }
          i = i + 1;
       }
       return;
    }
    public final void clearParentCache(){
       ViewGroup viewGroup = this;
       while (true) {
          ViewParent parent = viewGroup.getParent();
          if (!parent instanceof VirtualView) {
             return;
          }
          if (parent.mPath == null) {
             break ;
          }else {
             parent.clearCache();
          }
       }
       return;
    }
    public void clip(Canvas p0,Paint p1){
       Path clipPath = this.getClipPath(p0, p1);
       if (clipPath != null) {
          p0.clipPath(clipPath);
       }
       return;
    }
    public abstract void draw(Canvas p0,Paint p1,float p2);
    public final double fromRelativeFast(SVGLength p0){
       double fontSizeFrom;
       switch (VirtualView$1.$SwitchMap$com$horcrux$svg$SVGLength$UnitType[p0.unit.ordinal()]){
           case 1:
             fontSizeFrom = this.getFontSizeFromContext();
             break;
           case 2:
             fontSizeFrom = this.getFontSizeFromContext() / 2.00f;
             break;
           case 3:
             fontSizeFrom = 35.43f;
             break;
           case 4:
             fontSizeFrom = 3.54f;
             break;
           case 5:
             fontSizeFrom = 90.00f;
             break;
           case 6:
             fontSizeFrom = 0x3ff4000000000000;
             break;
           case 7:
             fontSizeFrom = 15.00f;
             break;
           default:
             fontSizeFrom = 0x3ff0000000000000;
       }
       return ((p0.value * fontSizeFrom) * (double)this.mScale);
    }
    public final double getCanvasDiagonal(){
       VirtualView tcanvasDiago = this.canvasDiagonal;
       if (tcanvasDiago - 0xbff0000000000000) {
          return tcanvasDiago;
       }
       double d = Math.sqrt((Math.pow((double)this.getCanvasWidth(), 2.00f) + Math.pow((double)this.getCanvasHeight(), 2.00f))) * 0x3fe6a09e667f3bcd;
       this.canvasDiagonal = d;
       return d;
    }
    public final float getCanvasHeight(){
       VirtualView tcanvasHeigh = this.canvasHeight;
       if (tcanvasHeigh - 0xbf800000) {
          return tcanvasHeigh;
       }
       GroupView textRoot = this.getTextRoot();
       this.canvasHeight = (textRoot == null)? (float)this.getSvgView().getCanvasBounds().height(): textRoot.getGlyphContext().getHeight();
       return this.canvasHeight;
    }
    public final float getCanvasWidth(){
       VirtualView tcanvasWidth = this.canvasWidth;
       if (tcanvasWidth - 0xbf800000) {
          return tcanvasWidth;
       }
       GroupView textRoot = this.getTextRoot();
       this.canvasWidth = (textRoot == null)? (float)this.getSvgView().getCanvasBounds().width(): textRoot.getGlyphContext().getWidth();
       return this.canvasWidth;
    }
    public RectF getClientRect(){
       return this.mClientRect;
    }
    public Path getClipPath(){
       return this.mCachedClipPath;
    }
    public Path getClipPath(Canvas p0,Paint p1){
       if (this.mClipPath != null) {
          ClipPathView definedClipP = this.getSvgView().getDefinedClipPath(this.mClipPath);
          if (definedClipP != null) {
             Path path = (definedClipP.mClipRule == null)? definedClipP.getPath(p0, p1): definedClipP.getPath(p0, p1, Region$Op.UNION);
             path.transform(definedClipP.mMatrix);
             path.transform(definedClipP.mTransform);
             VirtualView mClipRule = definedClipP.mClipRule;
             if (mClipRule != null) {
                if (mClipRule != 1) {
                   a.x("ReactNative", "RNSVG: clipRule: "+this.mClipRule+" unrecognized");
                }
             }else {
                path.setFillType(Path$FillType.EVEN_ODD);
             }
             this.mCachedClipPath = path;
          }else {
             a.x("ReactNative", "RNSVG: Undefined clipPath: "+this.mClipPath);
          }
       }
       return this.getClipPath();
    }
    public final double getFontSizeFromContext(){
       VirtualView tfontSize = this.fontSize;
       if (tfontSize - 0xbff0000000000000) {
          return tfontSize;
       }
       GroupView textRoot = this.getTextRoot();
       if (textRoot == null) {
          return 12.00f;
       }
       if (this.glyphContext == null) {
          this.glyphContext = textRoot.getGlyphContext();
       }
       double fontSize = this.glyphContext.getFontSize();
       this.fontSize = fontSize;
       return fontSize;
    }
    public GroupView getParentTextRoot(){
       ViewParent parent = this.getParent();
       if (!parent instanceof VirtualView) {
          return null;
       }
       return parent.getTextRoot();
    }
    public abstract Path getPath(Canvas p0,Paint p1);
    public SvgView getSvgView(){
       VirtualView tsvgView = this.svgView;
       if (tsvgView != null) {
          return tsvgView;
       }
       ViewParent parent = this.getParent();
       if (parent == null) {
          return null;
       }
       if (parent instanceof SvgView) {
          this.svgView = parent;
       }else if(parent instanceof VirtualView){
          this.svgView = parent.getSvgView();
       }else {
          a.g("ReactNative", "RNSVG: "+this.getClass().getName()+" should be descendant of a SvgView.");
       }
       return this.svgView;
    }
    public GroupView getTextRoot(){
       if (this.mTextRoot == null) {
          ViewGroup viewGroup = this;
          while (viewGroup != null) {
             if (viewGroup instanceof GroupView) {
                GroupView groupView = viewGroup;
                if (groupView.getGlyphContext() != null) {
                   this.mTextRoot = groupView;
                   break ;
                }
             }
             viewGroup = viewGroup.getParent();
             if (!viewGroup instanceof VirtualView) {
                viewGroup = null;
             }else {
             }
          }
       }
       return this.mTextRoot;
    }
    public abstract int hitTest(float[] p0);
    public void invalidate(){
       if (this instanceof RenderableView && this.mPath == null) {
          return;
       }
       this.clearCache();
       this.clearParentCache();
       super.invalidate();
       return;
    }
    public boolean isResponsible(){
       return this.mResponsible;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       VirtualView tmClientRect = this.mClientRect;
       if (tmClientRect == null) {
          return;
       }
       if (!this instanceof GroupView) {
          this.setLeft((int)Math.floor((double)tmClientRect.left));
          this.setTop((int)Math.floor((double)this.mClientRect.top));
          this.setRight((int)Math.ceil((double)this.mClientRect.right));
          this.setBottom((int)Math.ceil((double)this.mClientRect.bottom));
       }
       this.setMeasuredDimension((int)Math.ceil((double)this.mClientRect.width()), (int)Math.ceil((double)this.mClientRect.height()));
       return;
    }
    public void onMeasure(int p0,int p1){
       VirtualView tmClientRect = this.mClientRect;
       p0 = (tmClientRect != null)? (int)Math.ceil((double)tmClientRect.width()): ViewGroup.getDefaultSize(this.getSuggestedMinimumWidth(), p0);
       tmClientRect = this.mClientRect;
       p1 = (tmClientRect != null)? (int)Math.ceil((double)tmClientRect.height()): ViewGroup.getDefaultSize(this.getSuggestedMinimumHeight(), p1);
       this.setMeasuredDimension(p0, p1);
       return;
    }
    public double relativeOnHeight(SVGLength p0){
       VirtualView tmScale;
       SVGLength unit = p0.unit;
       if (unit == SVGLength$UnitType.NUMBER) {
          unit = p0.value;
          tmScale = this.mScale;
       }else if(unit == SVGLength$UnitType.PERCENTAGE){
          double d = p0.value / 100.00f;
          tmScale = this.getCanvasHeight();
       }else {
          return this.fromRelativeFast(p0);
       }
       return (unit * (double)tmScale);
    }
    public double relativeOnOther(SVGLength p0){
       double d;
       SVGLength unit = p0.unit;
       if (unit == SVGLength$UnitType.NUMBER) {
          unit = p0.value;
          d = (double)this.mScale;
       }else if(unit == SVGLength$UnitType.PERCENTAGE){
          double d1 = p0.value / 100.00f;
          d = this.getCanvasDiagonal();
       }else {
          return this.fromRelativeFast(p0);
       }
       return (unit * d);
    }
    public double relativeOnWidth(SVGLength p0){
       VirtualView tmScale;
       SVGLength unit = p0.unit;
       if (unit == SVGLength$UnitType.NUMBER) {
          unit = p0.value;
          tmScale = this.mScale;
       }else if(unit == SVGLength$UnitType.PERCENTAGE){
          double d = p0.value / 100.00f;
          tmScale = this.getCanvasWidth();
       }else {
          return this.fromRelativeFast(p0);
       }
       return (unit * (double)tmScale);
    }
    public void render(Canvas p0,Paint p1,float p2){
       this.draw(p0, p1, p2);
    }
    public void restoreCanvas(Canvas p0,int p1){
       p0.restoreToCount(p1);
    }
    public int saveAndSetupCanvas(Canvas p0,Matrix p1){
       this.mCTM.setConcat(this.mMatrix, this.mTransform);
       p0.concat(this.mCTM);
       this.mCTM.preConcat(p1);
       this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
       return p0.save();
    }
    public void saveDefinition(){
       if (this.mName != null) {
          this.getSvgView().defineTemplate(this, this.mName);
       }
       return;
    }
    public void setClientRect(RectF p0){
       VirtualView tmClientRect = this.mClientRect;
       if (tmClientRect != null && tmClientRect.equals(p0)) {
          return;
       }
       this.mClientRect = p0;
       if (p0 == null) {
          return;
       }
       int i = (int)Math.ceil((double)p0.width());
       int i1 = (int)Math.ceil((double)this.mClientRect.height());
       int i2 = (int)Math.floor((double)this.mClientRect.left);
       int i3 = (int)Math.floor((double)this.mClientRect.top);
       int i4 = (int)Math.ceil((double)this.mClientRect.right);
       int i5 = (int)Math.ceil((double)this.mClientRect.bottom);
       this.setMeasuredDimension(i, i1);
       if (!this instanceof GroupView) {
          this.setLeft(i2);
          this.setTop(i3);
          this.setRight(i4);
          this.setBottom(i5);
       }
       if (this.mOnLayout == null) {
          return;
       }else {
          this.mContext.getNativeModule(UIManagerModule.class).getEventDispatcher().c(o.k(this.getId(), i2, i3, i, i1));
          return;
       }
    }
    public void setClipPath(String p0){
       this.mCachedClipPath = null;
       this.mClipPath = p0;
       this.invalidate();
    }
    public void setClipRule(int p0){
       this.mClipRule = p0;
       this.invalidate();
    }
    public void setDisplay(String p0){
       this.mDisplay = p0;
       this.invalidate();
    }
    public void setMarkerEnd(String p0){
       this.mMarkerEnd = p0;
       this.invalidate();
    }
    public void setMarkerMid(String p0){
       this.mMarkerMid = p0;
       this.invalidate();
    }
    public void setMarkerStart(String p0){
       this.mMarkerStart = p0;
       this.invalidate();
    }
    public void setMask(String p0){
       this.mMask = p0;
       this.invalidate();
    }
    public void setMatrix(Dynamic p0){
       ReadableType type = p0.getType();
       if (!p0.isNull() && type.equals(ReadableType.Array)) {
          float[] sRawMatrix = VirtualView.sRawMatrix;
          int i = PropHelper.toMatrixData(p0.asArray(), sRawMatrix, this.mScale);
          if (i == 6) {
             if (this.mMatrix == null) {
                this.mMatrix = new Matrix();
                this.mInvMatrix = new Matrix();
             }
             this.mMatrix.setValues(sRawMatrix);
             this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
          }else if(i != -1){
             a.x("ReactNative", "RNSVG: Transform matrices must be of size 6");
          }
       }else {
          this.mMatrix.reset();
          this.mInvMatrix.reset();
          this.mInvertible = true;
       }
       super.invalidate();
       this.clearParentCache();
       return;
    }
    public void setName(String p0){
       this.mName = p0;
       this.invalidate();
    }
    public void setOnLayout(boolean p0){
       this.mOnLayout = p0;
       this.invalidate();
    }
    public void setOpacity(float p0){
       this.mOpacity = p0;
       this.invalidate();
    }
    public void setPointerEvents(PointerEvents p0){
       this.mPointerEvents = p0;
    }
    public void setResponsible(boolean p0){
       this.mResponsible = p0;
       this.invalidate();
    }
}
