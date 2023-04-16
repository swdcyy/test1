package f61.b;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.List;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.basic.utils.foldscreen.LiveFoldDeviceData;
import java.lang.reflect.Type;
import java.util.Collection;
import ekd.q;
import android.os.Build;
import f61.a;
import java.lang.reflect.Method;
import lnc.d2;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b	// class@0022c3
{
    public static int a = 255;

    public void b(){
       super();
    }
    public static boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       LiveFoldDeviceData obj = PatchProxy.apply(objArray, objArray, uob, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean a = b.a;
       if (a == 1) {
          return true;
       }
       if (!a) {
          return false;
       }
       obj = PatchProxy.apply(objArray, objArray, uob, "6");
       if (obj != patchProxyRe) {
       }else {
          obj = a.t().u("SOURCE_LIVE").getValue("liveFoldDeviceModelList", LiveFoldDeviceData.class, objArray);
          obj = (obj != null)? obj.mFoldDeviceModelList: objArray;
       }
       if (!q.f(obj) && obj.contains(Build.MODEL)) {
          b.a = 1;
          return true;
       }else if(a.a.contains(Build.MODEL)){
          b.a = 1;
          return true;
       }else {
          try{
             Class obj1 = PatchProxy.apply(objArray, objArray, uob, "4");
             if (obj1 != patchProxyRe) {
                a = obj1.booleanValue();
             }else {
                obj1 = Class.forName("com.oplus.content.OplusFeatureConfigManager");
                Class[] uClassArray1 = new Class[false];
                Object[] objArray1 = new Object[false];
                Class[] uClassArray2 = new Class[true];
                uClassArray2[0] = String.class;
                objArray1 = new Object[true];
                objArray1[0] = "oplus.hardware.type.fold";
                Object[] obj3 = obj1.getDeclaredMethod("hasFeature", uClassArray2).invoke(obj1.getMethod("getInstance", uClassArray1).invoke(objArray, objArray1), objArray1);
                if (obj3 instanceof Boolean) {
                   a = obj3.booleanValue();
                }
             label_00a5 :
                a = false;
             }
          }catch(java.lang.ClassNotFoundException e0){
          }catch(java.lang.NoSuchMethodException e0){
          }catch(java.lang.reflect.InvocationTargetException e0){
          }catch(java.lang.IllegalAccessException e0){
          }
          if (!a) {
             Object obj2 = PatchProxy.apply(objArray, objArray, uob, "5");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
                try{
                   Class uClass = Class.forName("android.util.FtDeviceInfo");
                   Class[] uClassArray = new Class[false];
                   objArray = new Object[false];
                   b = ("foldable").equals(uClass.getMethod("getDeviceType", uClassArray).invoke(uClass, objArray));
                }catch(java.lang.Exception e0){
                   b = false;
                }
             }
          }
          b.a = 1;
          return true;
       }
    }
    public static boolean b(){
       boolean b;
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (b.a() && b.c())? true: false;
       return b;
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          d2.n();
          return d2.k();
       }catch(java.lang.Exception e0){
          b.B(LiveLogTag.Live_FOLD_SCREEN, "DeadSystemException");
          return false;
       }
    }
}
