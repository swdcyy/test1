package b65.u;
import com.kwai.camerasdk.config.CameraServerParameter;
import java.util.HashMap;
import c97.d;
import h97.d;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import com.kwai.camerasdk.log.Log;
import com.kwai.camerasdk.config.CameraServerParameter$Config;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.camerasdk.config.CameraConfig;
import com.kwai.camerasdk.models.Page;
import java.util.Map;
import com.kwai.camerasdk.config.Pages;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Enum;
import com.kwai.camerasdk.models.CameraStreamType;
import com.kwai.camerasdk.models.DaenerysCaptureStabilizationMode;

public class u	// class@00035a
{
    public static CameraServerParameter a;
    public static Map b;
    public static boolean c;
    public static boolean d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;

    static {
       u.a = new CameraServerParameter();
       u.b = new HashMap();
       boolean b = false;
       u.c = b;
       u.d = b;
       int i = 1;
       u.e = i;
       u.f = b;
       u.g = -1;
       u.h = -2;
       u.i = -3;
       CameraServerParameter uCameraServe = d.a().c().a("daenerys", CameraServerParameter.class);
       String str = "DaenerysParameterUtils";
       Log.e(str, d.a().c().c("daenerys"));
       if (uCameraServe != null) {
          CameraServerParameter$Config serverParam = uCameraServe.mConfig.serverParam;
          if (serverParam != null && serverParam.size() > 0) {
             u.a = uCameraServe;
             Log.e(str, uCameraServe.toString());
          label_0063 :
             u.c = u.a.mConfig.abEnable;
             if (!PatchProxy.applyVoid(null, null, u.class, "1")) {
                u.a.mConfig.serverParam.get(b).mergeDefaultConfig(CameraConfig.getDefaultConfig());
                u.b.put(Page.kDefaultPage, u.a.mConfig.serverParam.get(b));
                u.b.put(Page.kCommonPage, u.a(u.a.mConfig.serverParam.get(i), b));
                u.b.put(Page.kPhotoPage, u.a(u.a.mConfig.serverParam.get(i).mPages.mPhotoPageConfig, i));
                u.b.put(Page.kRecordPage, u.a(u.a.mConfig.serverParam.get(i).mPages.mRecordPageConfig, i));
                u.b.put(Page.kStoryPage, u.a(u.a.mConfig.serverParam.get(i).mPages.mStoryPageConfig, i));
             }
          }
       }
       u.d = i;
       Log.e(str, "can\'t get zaerothparam!!!");
       goto label_0063 ;
    }
    public void u(){
       super();
    }
    public static CameraConfig a(CameraConfig p0,int p1){
       CameraConfig obj;
       CameraConfig uCameraConfi;
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ou, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          p0 = new CameraConfig();
       }
       obj = p0.mExtBusiness;
       if (obj == -1) {
          while (true) {
             if (uCameraConfi >= u.a.mConfig.serverParam.size() || u.a.mConfig.serverParam.get(uCameraConfi) == null) {
                obj = u.a.mConfig.serverParam.get(0);
             label_005b :
                p0.mergeDefaultConfig(obj);
                if (uCameraConfi <= null) {
                   break ;
                }else {
                   obj = obj.mExtBusiness;
                   if (uCameraConfi == obj) {
                      uCameraConfi = null;
                   }
                }
             }else {
                obj = u.a.mConfig.serverParam.get(uCameraConfi);
                goto label_005b ;
             }
          }
          return p0;
       }
       uCameraConfi = obj;
    }
    public static CameraConfig b(Page p0){
       CameraConfig uCameraConfi;
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.i("DaenerysParameterUtils", "getCameraSDKConfig from page "+p0.toString());
       if (!u.c) {
          Log.w("DaenerysParameterUtils", "do not get azeroth param or abenable is false");
          return null;
       }else if(u.b.get(p0) != null){
          uCameraConfi = u.b.get(p0);
       }else {
          uCameraConfi = u.a.mConfig.serverParam.get(0);
       }
       return uCameraConfi;
    }
    public static CameraStreamType c(int p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, ou, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       CameraStreamType uCameraStrea = CameraStreamType.forNumber(p0);
       if (uCameraStrea == null) {
          uCameraStrea = CameraStreamType.kCameraPreviewStream;
       }
       return uCameraStrea;
    }
    public static DaenerysCaptureStabilizationMode d(int p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, ou, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DaenerysCaptureStabilizationMode uDaenerysCap = DaenerysCaptureStabilizationMode.forNumber(p0);
       if (uDaenerysCap == null) {
          uDaenerysCap = DaenerysCaptureStabilizationMode.kStabilizationModeOff;
       }
       return uDaenerysCap;
    }
    public static int e(int p0,int p1){
       if (p0 >= 0) {
       }else {
          p0 = p1;
       }
       return p0;
    }
}
