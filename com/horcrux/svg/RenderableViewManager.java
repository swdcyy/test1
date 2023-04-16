package com.horcrux.svg.RenderableViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.horcrux.svg.RenderableViewManager$MatrixDecompositionContext;
import android.util.SparseArray;
import java.lang.Object;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import java.lang.String;
import java.lang.Enum;
import com.horcrux.svg.RenderableViewManager$1;
import java.lang.Class;
import java.lang.reflect.Array;
import com.facebook.react.uimanager.b;
import java.lang.System;
import java.lang.Math;
import com.horcrux.svg.RenderableView;
import java.lang.Double;
import com.facebook.react.bridge.ReactApplicationContext;
import yd.e;
import android.content.Context;
import android.view.ViewGroup;
import ze.n0;
import android.view.View;
import java.lang.Runnable;
import com.facebook.react.bridge.ReadableArray;
import ze.p0;
import ze.p;
import android.util.DisplayMetrics;
import ze.c;
import com.horcrux.svg.VirtualView;
import com.facebook.react.uimanager.ViewManager;
import android.view.ViewGroup$OnHierarchyChangeListener;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.RenderableViewManager$RenderableShadowNode;
import ze.x;
import android.content.ContextWrapper;
import android.app.Application;
import com.horcrux.svg.RenderableViewManager$2;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.ref.WeakReference;
import com.horcrux.svg.RenderableViewManager$3;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.horcrux.svg.ForeignObjectView;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.MarkerView;
import com.horcrux.svg.MaskView;
import com.horcrux.svg.PatternView;
import com.horcrux.svg.RadialGradientView;
import com.horcrux.svg.LinearGradientView;
import com.horcrux.svg.SymbolView;
import com.horcrux.svg.UseView;
import com.horcrux.svg.DefsView;
import com.horcrux.svg.ClipPathView;
import com.horcrux.svg.ImageView;
import com.horcrux.svg.TextPathView;
import com.horcrux.svg.TSpanView;
import com.horcrux.svg.TextView;
import com.horcrux.svg.RectView;
import com.horcrux.svg.LineView;
import com.horcrux.svg.EllipseView;
import com.horcrux.svg.CircleView;
import com.horcrux.svg.PathView;
import com.horcrux.svg.GroupView;
import com.horcrux.svg.SvgView;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.PointerEvents;
import java.util.Locale;
import java.lang.CharSequence;
import com.facebook.react.bridge.ReadableType;
import android.graphics.Matrix;

public class RenderableViewManager extends ViewGroupManager	// class@0005ef
{
    public Application$ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    public WeakReference mApplication;
    public final String mClassName;
    public final RenderableViewManager$SVGClass svgClass;
    public static final Object mLock;
    public static final SparseArray mTagToRenderableView;
    public static final SparseArray mTagToRunnable;
    public static final Object mViewLock;
    public static final RenderableViewManager$MatrixDecompositionContext sMatrixDecompositionContext;
    public static final double[] sTransformDecompositionArray;

    static {
       RenderableViewManager.sMatrixDecompositionContext = new RenderableViewManager$MatrixDecompositionContext();
       double[] uodoubleArra = new double[16];
       RenderableViewManager.sTransformDecompositionArray = uodoubleArra;
       RenderableViewManager.mTagToRenderableView = new SparseArray();
       RenderableViewManager.mTagToRunnable = new SparseArray();
       RenderableViewManager.mLock = new Object();
       RenderableViewManager.mViewLock = new Object();
    }
    public void RenderableViewManager(RenderableViewManager$SVGClass p0){
       super();
       this.svgClass = p0;
       this.mClassName = p0.toString();
    }
    public void RenderableViewManager(RenderableViewManager$SVGClass p0,RenderableViewManager$1 p1){
       super(p0);
    }
    public static void decomposeMatrix(){
       double d = double.class;
       RenderableViewManager$MatrixDecompositionContext sMatrixDecom = RenderableViewManager.sMatrixDecompositionContext;
       RenderableViewManager$MatrixDecompositionContext perspective = sMatrixDecom.perspective;
       RenderableViewManager$MatrixDecompositionContext scale = sMatrixDecom.scale;
       RenderableViewManager$MatrixDecompositionContext skew = sMatrixDecom.skew;
       RenderableViewManager$MatrixDecompositionContext translation = sMatrixDecom.translation;
       sMatrixDecom = sMatrixDecom.rotationDegrees;
       int i = 15;
       if (RenderableViewManager.isZero(RenderableViewManager.sTransformDecompositionArray[i])) {
          return;
       }
       double[][] uodoubleArra = Array.newInstance(d, new int[2]{4,4});
       double[] uodoubleArra1 = new double[16];
       int i1 = 0;
       int i2 = 4;
       while (i1 < i2) {
          for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
             double[] sTransformDe = RenderableViewManager.sTransformDecompositionArray;
             int i4 = i1 * 4;
             i4 = i4 + i3;
             double d1 = sTransformDe[i4] / sTransformDe[i];
             uodoubleArra[i1][i3] = d1;
             if (i3 == 3) {
                d1 = 0;
             }
             uodoubleArra1[i4] = d1;
          }
          i1 = i1 + 1;
       }
       long l = 0x3ff0000000000000;
       uodoubleArra1[i] = l;
       if (RenderableViewManager.isZero(b.l(uodoubleArra1))) {
          return;
       }
       if (RenderableViewManager.isZero(uodoubleArra[0][3]) && (!RenderableViewManager.isZero(uodoubleArra[1][3]) || !RenderableViewManager.isZero(uodoubleArra[2][3]))) {
          double[] uodoubleArra2 = new double[i2];
          uodoubleArra2[0] = uodoubleArra[0][3];
          uodoubleArra2[1] = uodoubleArra[1][3];
          uodoubleArra2[2] = uodoubleArra[2][3];
          uodoubleArra2[3] = uodoubleArra[3][3];
          b.p(uodoubleArra2, b.s(b.m(uodoubleArra1)), perspective);
       }else {
          perspective[2] = 0;
          perspective[1] = 0;
          perspective[0] = 0;
          perspective[3] = l;
       }
       System.arraycopy(uodoubleArra[3], 0, translation, 0, 3);
       double[][] uodoubleArra3 = Array.newInstance(d, new int[2]{3,3});
       for (int i5 = 0; i5 < 3; i5 = i5 + 1) {
          uodoubleArra3[i5][0] = uodoubleArra[i5][0];
          uodoubleArra3[i5][1] = uodoubleArra[i5][1];
          uodoubleArra3[i5][2] = uodoubleArra[i5][2];
       }
       scale[0] = b.w(uodoubleArra3[0]);
       uodoubleArra3[0] = b.x(uodoubleArra3[0], scale[0]);
       skew[0] = b.v(uodoubleArra3[0], uodoubleArra3[1]);
       uodoubleArra3[1] = b.t(uodoubleArra3[1], uodoubleArra3[0], 0x3ff0000000000000, (- skew[0]));
       skew[0] = b.v(uodoubleArra3[0], uodoubleArra3[1]);
       uodoubleArra3[1] = b.t(uodoubleArra3[1], uodoubleArra3[0], 0x3ff0000000000000, (- skew[0]));
       scale[1] = b.w(uodoubleArra3[1]);
       uodoubleArra3[1] = b.x(uodoubleArra3[1], scale[1]);
       skew[0] = skew[0] / scale[1];
       skew[1] = b.v(uodoubleArra3[0], uodoubleArra3[2]);
       uodoubleArra3[2] = b.t(uodoubleArra3[2], uodoubleArra3[0], 0x3ff0000000000000, (- skew[1]));
       skew[2] = b.v(uodoubleArra3[1], uodoubleArra3[2]);
       uodoubleArra3[2] = b.t(uodoubleArra3[2], uodoubleArra3[1], 0x3ff0000000000000, (- skew[2]));
       scale[2] = b.w(uodoubleArra3[2]);
       uodoubleArra3[2] = b.x(uodoubleArra3[2], scale[2]);
       skew[1] = skew[1] / scale[2];
       skew[2] = skew[2] / scale[2];
       if (b.v(uodoubleArra3[0], b.u(uodoubleArra3[1], uodoubleArra3[2])) < 0) {
          for (i5 = 0; i5 < 3; i5 = i5 + 1) {
             double d2 = 0xbff0000000000000;
             double d3 = scale[i5] * d2;
             scale[i5] = d3;
             object oobject = uodoubleArra3[i5];
             double d4 = oobject[0] * d2;
             oobject[0] = d4;
             oobject = uodoubleArra3[i5];
             d4 = oobject[1] * d2;
             oobject[1] = d4;
             oobject = uodoubleArra3[i5];
             d4 = oobject[2] * d2;
             oobject[2] = d4;
          }
       }
       sMatrixDecom[0] = b.r(((- Math.atan2(uodoubleArra3[2][1], uodoubleArra3[2][2])) * 0x404ca5dc1a63c1f8));
       sMatrixDecom[1] = b.r(((- Math.atan2((- uodoubleArra3[2][0]), Math.sqrt(((uodoubleArra3[2][1] * uodoubleArra3[2][1]) + (uodoubleArra3[2][2] * uodoubleArra3[2][2]))))) * 0x404ca5dc1a63c1f8));
       sMatrixDecom[2] = b.r(((- Math.atan2(uodoubleArra3[1][0], uodoubleArra3[0][0])) * 0x404ca5dc1a63c1f8));
       return;
    }
    public static void dropView(int p0){
       Object mViewLock = RenderableViewManager.mViewLock;
       _monitor_enter(mViewLock);
       RenderableViewManager.mTagToRenderableView.remove(p0);
       _monitor_exit(mViewLock);
    }
    public static RenderableView getRenderableViewByTag(int p0){
       Object mViewLock = RenderableViewManager.mViewLock;
       _monitor_enter(mViewLock);
       _monitor_exit(mViewLock);
       return RenderableViewManager.mTagToRenderableView.get(p0);
    }
    public static boolean isZero(double p0){
       boolean b = (!Double.isNaN(p0) && Math.abs(p0) - 0x3ee4f8b588e368f1 < 0)? true: false;
       return b;
    }
    public static void onReactContextDestroy(ReactApplicationContext p0){
       if (e.j) {
          Object mViewLock = RenderableViewManager.mViewLock;
          _monitor_enter(mViewLock);
          int i = RenderableViewManager.mTagToRenderableView.size() - 1;
          while (i >= 0) {
             SparseArray mTagToRender = RenderableViewManager.mTagToRenderableView;
             RenderableView renderableVi = mTagToRender.get(mTagToRender.keyAt(i));
             if (renderableVi != null && (renderableVi.getContext() instanceof n0 && p0 == renderableVi.getContext().b())) {
                mTagToRender.removeAt(i);
             }
          label_0036 :
             i = i - 1;
          }
          _monitor_exit(mViewLock);
       }
       return;
    }
    public static void resetTransformProperty(View p0){
       p0.setTranslationX(0);
       p0.setTranslationY(0);
       p0.setRotation(0);
       p0.setRotationX(0);
       p0.setRotationY(0);
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       p0.setCameraDistance(0);
    }
    public static void runWhenViewIsAvailable(int p0,Runnable p1){
       Object mLock = RenderableViewManager.mLock;
       _monitor_enter(mLock);
       RenderableViewManager.mTagToRunnable.put(p0, p1);
       _monitor_exit(mLock);
    }
    public static void setRenderableView(int p0,RenderableView p1){
       SparseArray mViewLock = RenderableViewManager.mViewLock;
       _monitor_enter(mViewLock);
       RenderableViewManager.mTagToRenderableView.put(p0, p1);
       _monitor_exit(mViewLock);
       p1 = RenderableViewManager.mLock;
       _monitor_enter(p1);
       mViewLock = RenderableViewManager.mTagToRunnable;
       Runnable runnable = mViewLock.get(p0);
       if (runnable != null) {
          runnable.run();
          mViewLock.delete(p0);
       }
       _monitor_exit(p1);
       return;
    }
    public static void setTransformProperty(View p0,ReadableArray p1){
       p0.c(p1, RenderableViewManager.sTransformDecompositionArray);
       RenderableViewManager.decomposeMatrix();
       RenderableViewManager$MatrixDecompositionContext sMatrixDecom = RenderableViewManager.sMatrixDecompositionContext;
       p0.setTranslationX(p.c((float)sMatrixDecom.translation[0]));
       p0.setTranslationY(p.c((float)sMatrixDecom.translation[1]));
       p0.setRotation((float)sMatrixDecom.rotationDegrees[2]);
       p0.setRotationX((float)sMatrixDecom.rotationDegrees[0]);
       p0.setRotationY((float)sMatrixDecom.rotationDegrees[1]);
       p0.setScaleX((float)sMatrixDecom.scale[0]);
       p0.setScaleY((float)sMatrixDecom.scale[1]);
       sMatrixDecom = sMatrixDecom.perspective;
       if (sMatrixDecom.length > 2) {
          float f = (float)sMatrixDecom[2];
          if (!f) {
             f = 0.00f;
          }
          p0.setCameraDistance((((c.d().density * c.d().density) * (0xbf800000 / f)) * 5.00f));
       }
       return;
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,VirtualView p1){
       super.addEventEmitters(p0, p1);
       p1.setOnHierarchyChangeListener(new RenderableViewManager$1(this));
    }
    public LayoutShadowNode createShadowNodeInstance(){
       return new RenderableViewManager$RenderableShadowNode(this);
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public VirtualView createViewInstance(n0 p0){
       if (this.mActivityLifecycleCallbacks == null) {
          Context applicationC = p0.getApplicationContext();
          if (applicationC instanceof Application) {
             RenderableViewManager$2 u2 = new RenderableViewManager$2(this);
             this.mActivityLifecycleCallbacks = u2;
             applicationC.registerActivityLifecycleCallbacks(u2);
             this.mApplication = new WeakReference(applicationC);
          }
       }
       switch (RenderableViewManager$3.$SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[this.svgClass.ordinal()]){
           case 1:
             return new GroupView(p0);
           case 2:
             return new PathView(p0);
           case 3:
             return new CircleView(p0);
           case 4:
             return new EllipseView(p0);
           case 5:
             return new LineView(p0);
           case 6:
             return new RectView(p0);
           case 7:
             return new TextView(p0);
           case 8:
             return new TSpanView(p0);
           case 9:
             return new TextPathView(p0);
           case 10:
             return new ImageView(p0);
           case 11:
             return new ClipPathView(p0);
           case 12:
             return new DefsView(p0);
           case 13:
             return new UseView(p0);
           case 14:
             return new SymbolView(p0);
           case 15:
             return new LinearGradientView(p0);
           case 16:
             return new RadialGradientView(p0);
           case 17:
             return new PatternView(p0);
           case 18:
             return new MaskView(p0);
           case 19:
             return new MarkerView(p0);
           case 20:
             return new ForeignObjectView(p0);
           default:
             throw new IllegalStateException("Unexpected type "+this.svgClass.toString());
       }
    }
    public String getName(){
       return this.mClassName;
    }
    public Class getShadowNodeClass(){
       return RenderableViewManager$RenderableShadowNode.class;
    }
    public void invalidateSvgView(VirtualView p0){
       SvgView svgView = p0.getSvgView();
       if (svgView != null) {
          svgView.invalidate();
       }
       if (p0 instanceof TextView) {
          p0.getTextContainer().clearChildCache();
       }
       return;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(VirtualView p0){
       super.onAfterUpdateTransaction(p0);
       this.invalidateSvgView(p0);
    }
    public void onCatalystInstanceDestroy(){
       super.onCatalystInstanceDestroy();
       RenderableViewManager tmApplicatio = this.mApplication;
       if (tmApplicatio != null && tmApplicatio.get() != null) {
          this.mApplication.get().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
       }
       return;
    }
    public void onDropViewInstance(View p0){
       this.onDropViewInstance(p0);
    }
    public void onDropViewInstance(VirtualView p0){
       super.onDropViewInstance(p0);
       Object mViewLock = RenderableViewManager.mViewLock;
       _monitor_enter(mViewLock);
       RenderableViewManager.mTagToRenderableView.remove(p0.getId());
       _monitor_exit(mViewLock);
    }
    public void setClipPath(VirtualView p0,String p1){
       p0.setClipPath(p1);
    }
    public void setClipRule(VirtualView p0,int p1){
       p0.setClipRule(p1);
    }
    public void setDisplay(VirtualView p0,String p1){
       p0.setDisplay(p1);
    }
    public void setFill(RenderableView p0,Dynamic p1){
       p0.setFill(p1);
    }
    public void setFillOpacity(RenderableView p0,float p1){
       p0.setFillOpacity(p1);
    }
    public void setFillRule(RenderableView p0,int p1){
       p0.setFillRule(p1);
    }
    public void setMarkerEnd(VirtualView p0,String p1){
       p0.setMarkerEnd(p1);
    }
    public void setMarkerMid(VirtualView p0,String p1){
       p0.setMarkerMid(p1);
    }
    public void setMarkerStart(VirtualView p0,String p1){
       p0.setMarkerStart(p1);
    }
    public void setMask(VirtualView p0,String p1){
       p0.setMask(p1);
    }
    public void setMatrix(VirtualView p0,Dynamic p1){
       p0.setMatrix(p1);
    }
    public void setName(VirtualView p0,String p1){
       p0.setName(p1);
    }
    public void setOnLayout(VirtualView p0,boolean p1){
       p0.setOnLayout(p1);
    }
    public void setOpacity(View p0,float p1){
       this.setOpacity(p0, p1);
    }
    public void setOpacity(VirtualView p0,float p1){
       p0.setOpacity(p1);
    }
    public void setPointerEvents(VirtualView p0,String p1){
       if (p1 == null) {
          p0.setPointerEvents(PointerEvents.AUTO);
       }else {
          p0.setPointerEvents(PointerEvents.valueOf((p1.toUpperCase(Locale.US)).replace("-", "_")));
       }
       return;
    }
    public void setPropList(RenderableView p0,ReadableArray p1){
       p0.setPropList(p1);
    }
    public void setResponsible(VirtualView p0,boolean p1){
       p0.setResponsible(p1);
    }
    public void setStroke(RenderableView p0,Dynamic p1){
       p0.setStroke(p1);
    }
    public void setStrokeDasharray(RenderableView p0,ReadableArray p1){
       p0.setStrokeDasharray(p1);
    }
    public void setStrokeDashoffset(RenderableView p0,float p1){
       p0.setStrokeDashoffset(p1);
    }
    public void setStrokeLinecap(RenderableView p0,int p1){
       p0.setStrokeLinecap(p1);
    }
    public void setStrokeLinejoin(RenderableView p0,int p1){
       p0.setStrokeLinejoin(p1);
    }
    public void setStrokeMiterlimit(RenderableView p0,float p1){
       p0.setStrokeMiterlimit(p1);
    }
    public void setStrokeOpacity(RenderableView p0,float p1){
       p0.setStrokeOpacity(p1);
    }
    public void setStrokeWidth(RenderableView p0,Dynamic p1){
       p0.setStrokeWidth(p1);
    }
    public void setTransform(VirtualView p0,Dynamic p1){
       if (p1.getType() != ReadableType.Array) {
          return;
       }
       ReadableArray readableArra = p1.asArray();
       if (readableArra == null) {
          RenderableViewManager.resetTransformProperty(p0);
       }else {
          RenderableViewManager.setTransformProperty(p0, readableArra);
       }
       Matrix matrix = p0.getMatrix();
       p0.mTransform = matrix;
       p0.mTransformInvertible = matrix.invert(p0.mInvTransform);
       return;
    }
    public void setVectorEffect(RenderableView p0,int p1){
       p0.setVectorEffect(p1);
    }
}
