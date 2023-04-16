package com.horcrux.svg.RNSVGRenderableManager;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.RenderableViewManager;
import com.facebook.react.bridge.Arguments;
import java.lang.String;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.VirtualView;
import android.graphics.RectF;
import android.graphics.Matrix;
import com.horcrux.svg.SvgView;
import android.graphics.PathMeasure;
import java.lang.Math;
import com.facebook.react.bridge.Promise;
import android.content.res.Resources;
import android.content.ContextWrapper;
import java.io.InputStream;
import java.io.InputStreamReader;
import vd.g;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Throwable;
import android.graphics.Region;
import com.facebook.react.bridge.BaseJavaModule;

public class RNSVGRenderableManager extends ReactContextBaseJavaModule	// class@0005ba
{

    public void RNSVGRenderableManager(ReactApplicationContext p0){
       super(p0);
    }
    public WritableMap getBBox(int p0,ReadableMap p1){
       VirtualView mClipBounds;
       RenderableView renderableVi = RenderableViewManager.getRenderableViewByTag(p0);
       if (renderableVi == null) {
          return Arguments.createMap();
       }
       boolean booleanx = p1.getBoolean("fill");
       boolean booleanx1 = p1.getBoolean("stroke");
       boolean booleanx2 = p1.getBoolean("markers");
       boolean booleanx3 = p1.getBoolean("clipped");
       try{
          int i = 0;
          renderableVi.getPath(i, i);
          VirtualView mScale = renderableVi.mScale;
          renderableVi.initBounds();
          RectF rectF = new RectF();
          VirtualView mFillBounds = renderableVi.mFillBounds;
          VirtualView mStrokeBound = renderableVi.mStrokeBounds;
          VirtualView mMarkerBound = renderableVi.mMarkerBounds;
          mClipBounds = renderableVi.mClipBounds;
          if (booleanx && mFillBounds != null) {
             rectF.union(mFillBounds);
          }
          if (booleanx1 && mStrokeBound != null) {
             rectF.union(mStrokeBound);
          }
          if (booleanx2 && mMarkerBound != null) {
             rectF.union(mMarkerBound);
          }
          if (booleanx3 && mClipBounds != null) {
             rectF.intersect(mClipBounds);
          }
          WritableMap writableMap = Arguments.createMap();
          writableMap.putDouble("x", (double)(rectF.left / mScale));
          writableMap.putDouble("y", (double)(rectF.top / mScale));
          writableMap.putDouble("width", (double)(rectF.width() / mScale));
          writableMap.putDouble("height", (double)(rectF.height() / mScale));
          return writableMap;
       }catch(java.lang.NullPointerException e0){
          mClipBounds.invalidate();
          return Arguments.createMap();
       }
    }
    public WritableMap getCTM(int p0){
       RenderableView renderableVi = RenderableViewManager.getRenderableViewByTag(p0);
       if (renderableVi == null) {
          return Arguments.createMap();
       }
       VirtualView mScale = renderableVi.mScale;
       Matrix matrix = new Matrix(renderableVi.mCTM);
       matrix.preConcat(renderableVi.getSvgView().mInvViewBoxMatrix);
       float[] uofloatArray = new float[9];
       matrix.getValues(uofloatArray);
       WritableMap writableMap = Arguments.createMap();
       writableMap.putDouble("a", (double)uofloatArray[0]);
       writableMap.putDouble("b", (double)uofloatArray[3]);
       writableMap.putDouble("c", (double)uofloatArray[1]);
       writableMap.putDouble("d", (double)uofloatArray[4]);
       writableMap.putDouble("e", (double)(uofloatArray[2] / mScale));
       writableMap.putDouble("f", (double)(uofloatArray[5] / mScale));
       return writableMap;
    }
    public String getName(){
       return "RNSVGRenderableManager";
    }
    public WritableMap getPointAtLength(int p0,ReadableMap p1){
       VirtualView mScale;
       RenderableView renderableVi = RenderableViewManager.getRenderableViewByTag(p0);
       if (renderableVi == null) {
          return Arguments.createMap();
       }
       Canvas uCanvas = null;
       try{
          PathMeasure pathMeasure = new PathMeasure(renderableVi.getPath(uCanvas, uCanvas), false);
          mScale = renderableVi.mScale;
          float[] uofloatArray = new float[2];
          float[] uofloatArray1 = new float[2];
          pathMeasure.getPosTan(Math.max(0, Math.min((float)p1.getDouble("length"), pathMeasure.getLength())), uofloatArray, uofloatArray1);
          WritableMap writableMap = Arguments.createMap();
          writableMap.putDouble("x", (double)(uofloatArray[0] / mScale));
          writableMap.putDouble("y", (double)(uofloatArray[1] / mScale));
          writableMap.putDouble("angle", Math.atan2((double)uofloatArray1[1], (double)uofloatArray1[0]));
          return writableMap;
       }catch(java.lang.NullPointerException e0){
          mScale.invalidate();
          return Arguments.createMap();
       }
    }
    public void getRawResource(String p0,Promise p1){
       try{
          ReactApplicationContext reactApplica = this.getReactApplicationContext();
          Resources resources = reactApplica.getResources();
          InputStream inputStream = resources.openRawResource(resources.getIdentifier(p0, "raw", reactApplica.getPackageName()));
          InputStreamReader inputStreamR = new InputStreamReader(inputStream, g.a);
          char[] uocharArray = new char[4096];
          StringBuilder str = "";
          int i = inputStreamR.read(uocharArray, 0, 4096);
          while (i != -1) {
             str = str+uocharArray;
          }
          String str1 = str;
          try{
             p1.resolve(str1);
             inputStream.close();
          }catch(java.io.IOException e0){
          }catch(java.lang.Exception e8){
             e8.printStackTrace();
             p1.reject(e8);
          }
          return;
       }catch(java.lang.Exception e8){
       }
    }
    public WritableMap getScreenCTM(int p0){
       RenderableView renderableVi = RenderableViewManager.getRenderableViewByTag(p0);
       if (renderableVi == null) {
          return Arguments.createMap();
       }
       float[] uofloatArray = new float[9];
       renderableVi.mCTM.getValues(uofloatArray);
       VirtualView mScale = renderableVi.mScale;
       WritableMap writableMap = Arguments.createMap();
       writableMap.putDouble("a", (double)uofloatArray[0]);
       writableMap.putDouble("b", (double)uofloatArray[3]);
       writableMap.putDouble("c", (double)uofloatArray[1]);
       writableMap.putDouble("d", (double)uofloatArray[4]);
       writableMap.putDouble("e", (double)(uofloatArray[2] / mScale));
       writableMap.putDouble("f", (double)(uofloatArray[5] / mScale));
       return writableMap;
    }
    public float getTotalLength(int p0){
       RenderableView renderableVi = RenderableViewManager.getRenderableViewByTag(p0);
       if (renderableVi == null) {
          return 0;
       }
       Canvas uCanvas = null;
       try{
          return (new PathMeasure(renderableVi.getPath(uCanvas, uCanvas), false).getLength() / renderableVi.mScale);
       }catch(java.lang.NullPointerException e0){
          renderableVi.invalidate();
          return 0xbf800000;
       }
    }
    public boolean isPointInFill(int p0,ReadableMap p1){
       RenderableView renderableVi = RenderableViewManager.getRenderableViewByTag(p0);
       boolean b = false;
       if (renderableVi == null) {
          return b;
       }
       VirtualView mScale = renderableVi.mScale;
       float f = (float)p1.getDouble("x") * mScale;
       float f1 = (float)p1.getDouble("y") * mScale;
       float[] uofloatArray = new float[]{f,f1};
       if (renderableVi.hitTest(uofloatArray) != -1) {
          b = true;
       }
       return b;
    }
    public boolean isPointInStroke(int p0,ReadableMap p1){
       VirtualView mStrokeRegio;
       RenderableView renderableVi = RenderableViewManager.getRenderableViewByTag(p0);
       boolean b = false;
       if (renderableVi == null) {
          return b;
       }
       Canvas uCanvas = null;
       try{
          renderableVi.getPath(uCanvas, uCanvas);
          renderableVi.initBounds();
          double d = (double)renderableVi.mScale;
          int i = (int)(p1.getDouble("x") * d);
          int i1 = (int)(p1.getDouble("y") * d);
          mStrokeRegio = renderableVi.mStrokeRegion;
          if (mStrokeRegio != null && mStrokeRegio.contains(i, i1)) {
             b = true;
          }
          return b;
       }catch(java.lang.NullPointerException e0){
          mStrokeRegio.invalidate();
          return e0;
       }
    }
    public void onCatalystInstanceDestroy(){
       super.onCatalystInstanceDestroy();
       RenderableViewManager.onReactContextDestroy(this.getReactApplicationContext());
    }
}
