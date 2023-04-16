package com.kwai.sdk.kbar.core.CameraPreview;
import android.view.SurfaceHolder$Callback;
import android.view.SurfaceView;
import android.content.Context;
import android.view.SurfaceHolder;
import android.hardware.Camera;
import android.hardware.Camera$Parameters;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.lang.Exception;
import java.lang.StringBuilder;
import android.graphics.Point;
import do7.b;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.view.View;
import do7.a;
import android.hardware.Camera$Size;
import android.graphics.Rect;
import android.hardware.Camera$Area;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import do7.c;
import android.hardware.Camera$AutoFocusCallback;
import java.util.Comparator;
import java.util.Iterator;
import java.lang.Math;
import com.kwai.sdk.kbar.core.CameraPreview$a;
import android.view.Surface;
import android.hardware.Camera$PreviewCallback;

public class CameraPreview extends SurfaceView implements SurfaceHolder$Callback	// class@00160a
{
    public Camera b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f;
    public b g;
    public CameraPreview$a h;
    public boolean i;

    public void CameraPreview(Context p0){
       super(p0);
       this.c = false;
       this.d = false;
       this.e = false;
       this.f = 0x3f800000;
       this.i = false;
       this.getHolder().addCallback(this);
    }
    public static void a(boolean p0,Camera p1){
       String str = "KBAR_CameraPreview";
       try{
          Camera$Parameters parameters = p1.getParameters();
          if (parameters.isZoomSupported()) {
             int zoom = parameters.getZoom();
             if (p0 && zoom < parameters.getMaxZoom()) {
                Log.g(str, "放大");
                zoom = zoom + 1;
             }else if(!p0 && zoom > 0){
                Log.g(str, "缩小");
                zoom = zoom - 1;
             }else {
                Log.g(str, "既不放大也不缩小");
             }
             parameters.setZoom(zoom);
             p1.setParameters(parameters);
          }else {
             Log.g(str, "不支持缩放");
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          Log.d(str, "handleZoom failed"+e4.getMessage());
       }
       return;
    }
    public boolean b(){
       boolean b = (this.b != null && (this.c != null && this.d != null))? true: false;
       return b;
    }
    public void c(){
       this.e = false;
       CameraPreview tb = this.b;
       if (tb == null) {
          return;
       }
       try{
          Camera$Parameters parameters = tb.getParameters();
          parameters.setFocusMode("continuous-picture");
          this.b.setParameters(parameters);
          this.b.cancelAutoFocus();
       }catch(java.lang.Exception e0){
          Log.d("KBAR_CameraPreview", "连续对焦失败:"+e0.getMessage());
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       String str = "KBAR_CameraPreview";
       String str1 = "onMeasure:";
       Log.d(str, str1);
       p0 = SurfaceView.getDefaultSize(this.getSuggestedMinimumWidth(), p0);
       p1 = SurfaceView.getDefaultSize(this.getSuggestedMinimumHeight(), p1);
       CameraPreview tg = this.g;
       if (tg != null) {
          tg.b();
          Point point = this.g.b();
          Point x = point.x;
          point = point.y;
          Log.d(str, str1+x+" "+point+" "+p0+" "+p1+"degree:");
          float f = (float)p0;
          float f1 = (float)p1;
          float f2 = (float)x;
          float f3 = (float)point;
          float f4 = (f2 * 0x3f800000) / f3;
          if (((f * 0x3f800000) / f1) - f4 < 0) {
             p0 = (int)((f1 / ((f3 * 0x3f800000) / f2)) + 0x3f000000);
          }else {
             p1 = (int)((f / f4) + 0x3f000000);
          }
       }
       super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec(p1, 0x40000000));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       CameraPreview uCameraPrevi1;
       int i1;
       boolean b2;
       String str1;
       CameraPreview uCameraPrevi = this;
       if (!this.b()) {
          return super.onTouchEvent(p0);
       }
       boolean b = false;
       int b1 = true;
       if (p0.getPointerCount() == b1 && (p0.getAction() & 0x00ff) == b1) {
          if (uCameraPrevi.e != null) {
             return b1;
          }else {
             uCameraPrevi.e = b1;
             String str = "KBAR_CameraPreview";
             Log.g(str, "手指触摸触发对焦测光");
             float x = p0.getX();
             float y = p0.getY();
             if (a.g(this.getContext())) {
                y = x;
                x = y;
             }
             int i = a.e(this.getContext(), 0x42f00000);
             try{
                if (uCameraPrevi.i == null) {
                   uCameraPrevi.i = b1;
                   Camera$Parameters parameters = uCameraPrevi.b.getParameters();
                   Camera$Size previewSize = parameters.getPreviewSize();
                   if (parameters.getMaxNumFocusAreas() > 0) {
                      Log.g(str, "支持设置对焦区域");
                      b1 = 1000;
                      Rect rect = a.c(0x3f800000, x, y, i, i, previewSize.width, previewSize.height);
                      Log.g(str, "对焦区域"+a.i(rect));
                      parameters.setFocusAreas(Collections.singletonList(new Camera$Area(rect, b1)));
                      parameters.setFocusMode("auto");
                      str1 = 1;
                   }else {
                      b1 = 1000;
                      Log.g(str, "不支持设置对焦区域");
                      str1 = null;
                   }
                   if (parameters.getMaxNumMeteringAreas() > 0) {
                      Log.g(str, "支持设置测光区域");
                      Rect rect1 = a.c(0x3fc00000, x, y, i, i, previewSize.width, previewSize.height);
                      Log.g(str, "测光区域:"+a.i(rect1));
                      parameters.setMeteringAreas(Collections.singletonList(new Camera$Area(rect1, b1)));
                      str1 = 1;
                   }else {
                      Log.g(str, "不支持设置测光区域");
                   }
                   if (str1 != null) {
                      uCameraPrevi.b.cancelAutoFocus();
                      uCameraPrevi.b.setParameters(parameters);
                      uCameraPrevi.b.autoFocus(new c(uCameraPrevi));
                   }else {
                      uCameraPrevi.i = b;
                      uCameraPrevi.e = b;
                   }
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
                Log.d(str, "对焦测光失败："+e0.getMessage());
                uCameraPrevi.i = b;
                this.c();
             }
          }
       }
    }
    public void setCamera(Camera p0){
       Point point2;
       this.b = p0;
       if (p0 != null) {
          b uob = new b(this.getContext());
          this.g = uob;
          CameraPreview tb = this.b;
          Point point = a.f(uob.a);
          Point point1 = new Point();
          point1.x = point.x;
          point1.y = point.y;
          Log.b("KBar-CameraConfigurationManager", "csq screenResolutionForCamera.x 111"+point1.x+" screenResolutionForCamera.y"+point1.y);
          if (a.g(uob.a)) {
             point1.x = point.y;
             point1.y = point.x;
          }
          List supportedPre = tb.getParameters().getSupportedPreviewSizes();
          if (supportedPre == null || !supportedPre.size()) {
             point2 = null;
          }else if(point1.y > point1.x){
             point = new Point(point1.y, point1.x);
          }else {
             point = point1;
          }
          float f = (float)point.x / (float)point.y;
          Collections.sort(supportedPre, b.f);
          Camera$Size size = supportedPre.get(0);
          int i = Float.POSITIVE_INFINITY;
          Iterator iterator = supportedPre.iterator();
          while (iterator.hasNext()) {
             Camera$Size size1 = iterator.next();
             Camera$Size width = size1.width;
             Camera$Size height = size1.height;
             int i1 = (width < height)? 1: 0;
             Camera$Size size2 = (i1)? height: width;
             if (!i1) {
                width = height;
             }
             if (size2 == point.x && width == point.y) {
                size = size1;
                break ;
             }else {
                float f1 = (float)size2 / (float)width;
                f1 = f1 - f;
                float f2 = Math.abs(f1);
                if (f2 - i < 0) {
                   size = size1;
                   i = f2;
                }
             }
          }
          point2 = new Point(size.width, size.height);
          if (point2 == null) {
             point2 = new Point(((point1.x >> 3) << 3), ((point1.y >> 3) << 3));
          }
          uob.b = point2;
          Log.b("KBar-CameraConfigurationManager", "csq screenResolutionForCamera.x "+point1.x+" screenResolutionForCamera.y"+point1.y);
          Log.b("KBar-CameraConfigurationManager", "csq mPreviewResolution.x "+uob.b.x+" mPreviewResolution.y"+uob.b.y);
          this.requestLayout();
       }
       return;
    }
    public void setDelegate(CameraPreview$a p0){
       this.h = p0;
    }
    public void surfaceChanged(SurfaceHolder p0,int p1,int p2,int p3){
       Log.d("KBAR_CameraPreview", "surfaceChanged"+p2+" "+p3);
       if (p0.getSurface() == null) {
          return;
       }
       CameraPreview tg = this.g;
       tg.e = p2;
       tg.d = p3;
       Log.d("KBAR_CameraPreview", "showCameraPreview");
       if (this.b != null) {
          boolean b = true;
          try{
             this.c = b;
             SurfaceHolder holder = this.getHolder();
             holder.setKeepScreenOn(b);
             this.b.setPreviewDisplay(holder);
             this.g.d(this.b);
             this.b.startPreview();
             tg = this.h;
             if (tg != null) {
                tg.onStartPreview();
             }
             this.c();
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
             Log.d("KBAR_CameraPreview", "showCameraPreview failed: "+e2.getMessage());
          }
       }
    }
    public void surfaceCreated(SurfaceHolder p0){
       Log.d("KBAR_CameraPreview", "surfaceCreated");
       this.d = true;
    }
    public void surfaceDestroyed(SurfaceHolder p0){
       Log.d("KBAR_CameraPreview", "surfaceDestroyed");
       boolean b = false;
       this.d = b;
       Log.d("KBAR_CameraPreview", "stopCameraPreview");
       CameraPreview tb = this.b;
       if (tb != null) {
          try{
             this.c = b;
             tb.cancelAutoFocus();
             this.b.setOneShotPreviewCallback(null);
             this.b.stopPreview();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             Log.d("KBAR_CameraPreview", "stopCameraPreview failed"+e0.getMessage());
          }
       }
    }
}
