package c88.c;
import c88.c$a;
import android.content.Context;
import java.lang.Object;
import android.hardware.Camera;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.hardware.Camera$Parameters;
import java.util.List;
import java.util.Collection;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Exception;
import android.graphics.Point;
import java.lang.Integer;
import java.lang.Float;
import java.util.Iterator;
import java.lang.Math;
import java.lang.Number;
import android.hardware.Camera$CameraInfo;
import android.view.WindowManager;
import android.view.Display;

public final class c	// class@0003c2
{
    public final Context a;
    public Point b;
    public Point c;
    public static final Comparator d;

    static {
       c.d = new c$a();
    }
    public void c(Context p0){
       super();
       this.a = p0;
    }
    public static boolean a(Camera p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new String[]{"steadyphoto"};
       boolean b = (c.c(p0.getParameters().getSupportedSceneModes(), obj) != null)? true: false;
       return b;
    }
    public static String c(Collection p0,String[] p1){
       object oobject = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, oobject, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          int len = p1.length;
          int i = 0;
          while (i < len) {
             object oobject1 = p1[i];
             if (p0.contains(oobject1)) {
                oobject = oobject1;
                break ;
             }
             i = i + 1;
          }
       }
       return oobject;
    }
    public final void b(Camera p0,boolean p1){
       String str1;
       boolean b;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "13")) {
          return;
       }
       String str = "doSetTorch: "+p1;
       try{
          Log.d("KBar-CameraConfigurationManager", str);
          Camera$Parameters parameters = p0.getParameters();
          if (p1) {
             String[] stringArray = new String[]{"torch","on"};
             str1 = c.c(parameters.getSupportedFlashModes(), stringArray);
             if (str1 != null) {
                Object obj = PatchProxy.applyOneRefs(p0, null, uoc, "4");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   stringArray = new String[]{"auto"};
                   b = (c.c(p0.getParameters().getSupportedSceneModes(), stringArray) != null)? true: false;
                }
                if (b) {
                   parameters.setSceneMode("auto");
                }
             }
          }else {
             String[] stringArray1 = new String[]{"off"};
             str1 = c.c(parameters.getSupportedFlashModes(), stringArray1);
             if (str1 != null && c.a(p0)) {
                parameters.setSceneMode("steadyphoto");
             }
          }
          if (str1 != null) {
             parameters.setFlashMode(str1);
          }
          p0.setParameters(parameters);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          Log.d("KBar-CameraConfigurationManager", "doSetTorch to "+p1+"failed: "+e7.getMessage());
       }
       return;
    }
    public Point d(){
       return this.b;
    }
    public void e(Camera p0){
       int i1;
       Object[] objArray;
       int i2;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "9")) {
          return;
       }
       Camera$Parameters parameters = p0.getParameters();
       c tc = this.c;
       parameters.setPreviewSize(tc.x, tc.y);
       int i = 0;
       if (parameters.isZoomSupported()) {
          List zoomRatios = parameters.getZoomRatios();
          i1 = 0;
          while (i1 < zoomRatios.size() && zoomRatios.get(i1).intValue() <= 130) {
             i1 = i1 + 1;
          }
          if (zoomRatios.get(i1).intValue() > 150) {
             i1 = i1 - 1;
             if (i1 <= 0) {
                i1 = 0;
             }
          }
          parameters.setZoom(i1);
       }
       float f = 60.00f;
       if (PatchProxy.isSupport(uoc)) {
          objArray = PatchProxy.applyTwoRefs(p0, Float.valueOf(f), this, uoc, "10");
          if (objArray != patchProxyRe) {
          label_00a8 :
             if (objArray != null) {
                parameters.setPreviewFpsRange(objArray[i], objArray[1]);
             }
             Camera$CameraInfo obj = PatchProxy.apply(null, this, uoc, "14");
             if (obj != patchProxyRe) {
                i2 = obj.intValue();
             }else {
                obj = new Camera$CameraInfo();
                Camera.getCameraInfo(i, obj);
                WindowManager systemServic = this.a.getSystemService("window");
                if (systemServic == null) {
                   i2 = 0;
                }else {
                   i1 = systemServic.getDefaultDisplay().getRotation();
                   if (i1) {
                      if (i1 != 1) {
                         if (i1 != 2) {
                            if (i1 != 3) {
                            label_00f2 :
                               i1 = 0;
                            }else {
                               i1 = 270;
                            }
                         }else {
                            i1 = 180;
                         }
                      }else {
                         i1 = 90;
                      }
                   }else {
                      goto label_00f2 ;
                   }
                   if (obj.facing == 1) {
                      i2 = (((obj.orientation + i1) % 360) - 360) % 360;
                   }else {
                      i2 = ((obj.orientation - i1) + 360) % 360;
                   }
                }
             }
             p0.setDisplayOrientation(i2);
             if (c.a(p0)) {
                parameters.setSceneMode("steadyphoto");
             }
             String[] obj1 = PatchProxy.applyOneRefs(p0, null, uoc, "2");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                obj1 = new String[]{"auto"};
                if (c.c(p0.getParameters().getSupportedWhiteBalance(), obj1) != null) {
                   i = 1;
                }
                b = i;
             }
             if (b) {
                parameters.setWhiteBalance("auto");
             }
             p0.setParameters(parameters);
             return;
          }
       }
       i2 = (int)60000.00f;
       Iterator iterator = p0.getParameters().getSupportedPreviewFpsRange().iterator();
       Object[] objArray1 = null;
       int i3 = Integer.MAX_VALUE;
       while (iterator.hasNext()) {
          int[] ointArray = iterator.next();
          int i4 = i2 - ointArray[i];
          int i5 = i2 - ointArray[1];
          i4 = Math.abs(i4) + Math.abs(i5);
          if (i4 < i3) {
             objArray1 = ointArray;
             i3 = i4;
          }
       }
       objArray = objArray1;
       goto label_00a8 ;
    }
}
