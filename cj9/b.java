package cj9.b;
import java.lang.Object;
import com.kwai.camerasdk.models.Page;
import com.yxcorp.gifshow.media.model.CameraConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.reflect.Type;
import rq.a;
import n65.k;
import b65.c;
import qi9.v1;
import com.kwai.camerasdk.config.CameraConfig;
import b65.u;
import qi9.g1;
import com.kwai.camerasdk.config.CaptureConfig;
import com.kwai.camerasdk.config.ExtendConfig;
import com.kwai.camerasdk.config.RecorderConfig;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import o56.a;
import com.yxcorp.utility.Log;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.camerasdk.util.BlackListData;
import java.util.Set;
import xf6.g;
import xf6.l;
import qi9.h1;
import android.content.SharedPreferences;
import km8.b;
import com.kwai.feature.post.api.encode.compatibility.EncodeSchemeHelper;

public class b	// class@000600
{
    public static EncodeConfig a;

    public void b(){
       super();
    }
    public static CameraConfig a(Page p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CameraUnitConfig obj = null;
       StringBuilder obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = "getCameraConfig "+p0;
       CameraConfig uCameraConfi = a.b(CameraConfig.class);
       b = true;
       if (uCameraConfi == null) {
          uCameraConfi = new CameraConfig(c.a().d(), c.a().c());
          uCameraConfi.mIsDefaultValue = b;
       }
       if (uCameraConfi.a) {
          return uCameraConfi;
       }else if(p0 != Page.kLivePushPage && (p0 != Page.kLivePreviewPage && p0 != Page.kDefaultPage)){
          CameraConfig uCameraConfi1 = u.b(p0);
          g1 og1 = g1.class;
          if (!PatchProxy.applyVoidTwoRefs(uCameraConfi, uCameraConfi1, obj, og1, "15") && uCameraConfi1 != null) {
             uCameraConfi.mABEnable = b;
             uCameraConfi.mCameraApiVersion = uCameraConfi1.mCaptureConfig.mCameraApiVersion;
             CameraConfig mExtendConfi = uCameraConfi1.mExtendConfig;
             int eNABLE = CameraConfig.ENABLE;
             boolean b1 = (mExtendConfi.mEnableCameraKit == eNABLE)? true: false;
             uCameraConfi.mEnableCameraKit = b1;
             b1 = (mExtendConfi.mEnableCameraVivoApi == eNABLE)? true: false;
             uCameraConfi.mEnableCameraVivoApi = b1;
             b1 = (mExtendConfi.mEnableUltraWideCamera == eNABLE)? true: false;
             uCameraConfi.mEnableUltraWideCamera = b1;
             b1 = (mExtendConfi.mEnableTakePicture == eNABLE)? true: false;
             uCameraConfi.mEnableTakePicture = b1;
             uCameraConfi.mPictureWidth = uCameraConfi1.mPictureWidth;
             uCameraConfi.mPictureHeight = uCameraConfi1.mPictureHeight;
             b1 = (mExtendConfi.mEnableStannis == eNABLE)? true: false;
             uCameraConfi.mEnableStannis = b1;
             uCameraConfi.mHardwareRecordFpsForHighFrameRate = uCameraConfi1.mRecorderConfig.mHardwareRecordFpsForHighFrameRate;
             uCameraConfi.mStartRecordDelayAfterStartPlayMusic = 250;
             boolean b2 = (mExtendConfi.mEnableDenoise == eNABLE)? true: false;
             uCameraConfi.mEnableDenoise = b2;
             obj = PatchProxy.applyOneRefs(uCameraConfi1, obj, og1, "19");
             if (obj != patchProxyRe) {
             }else {
                obj = new CameraUnitConfig();
                uCameraConfi1 = uCameraConfi1.mExtendConfig;
                int eNABLE1 = CameraConfig.ENABLE;
                boolean b3 = (uCameraConfi1.mEnableCameraUnit == eNABLE1)? true: false;
                obj.mEnable = b3;
                b3 = (uCameraConfi1.mSupportSuperEis == eNABLE1)? true: false;
                obj.mSupportSuperEis = b3;
                b3 = (uCameraConfi1.mSupportSuperEisPro == eNABLE1)? true: false;
                obj.mSupportSuperEisPro = b3;
                b3 = (uCameraConfi1.mAllowEisWhenEffectOn == eNABLE1)? true: false;
                obj.mAllowEisWhenEffectOn = b3;
                b3 = (uCameraConfi1.mEnableLowLightBoost == eNABLE1)? true: false;
                obj.mEnableLowLightBoost = b3;
                b3 = (uCameraConfi1.mEnableSATCamera == eNABLE1)? true: false;
                obj.mEnableSATCamera = b3;
                if (uCameraConfi1.mEnableBacklightDetection != eNABLE1) {
                   b = false;
                }
                obj.mEnableBacklightDetection = b;
             }
             uCameraConfi.mCameraUnitConfig = obj;
             uCameraConfi.mRecordPageConfig = g1.c(u.b(Page.kRecordPage));
             uCameraConfi.mPhotoPageConfig = g1.c(u.b(Page.kPhotoPage));
             uCameraConfi.mStoryPageConfig = g1.c(u.b(Page.kStoryPage));
          }
       }
    label_012f :
       return uCameraConfi;
    }
    public static EncodeConfig b(){
       EncodeConfig obj = PatchProxy.apply(null, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EncodeConfig();
       String j = a.j;
       if (j == null) {
          j = "";
       }
       Log.b("EncodeConfigUtils", "getDefaultEncodeConfig: phone="+j);
       if (Build$VERSION.SDK_INT >= 25 && !BlackListData.a.contains(j)) {
          obj.setWidth(720);
          obj.setHeight(1280);
          Log.b("EncodeConfigUtils", "getDefaultEncodeConfig: using 720p");
       }
       if (!BlackListData.b.contains(j)) {
          obj.setUseHardwareEncode(true);
          Log.b("EncodeConfigUtils", "getDefaultEncodeConfig: using hardware encode");
       }
       obj.setForceDisableOpenglSync(c.b());
       return obj;
    }
    public static EncodeConfig c(){
       boolean b;
       boolean b3;
       Object[] objArray = null;
       EncodeConfig obj = PatchProxy.apply(objArray, objArray, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a;
       if (obj != null) {
          return obj;
       }
       b = true;
       boolean b1 = false;
       int b2 = (g.o1() && l.c("debug_record_switch", b1))? true: false;
       EncodeConfig uEncodeConfi = EncodeConfig.class;
       String str = h1.a.getString("encode_config", "");
       if (str != null && str != "") {
          objArray = b.a(str, uEncodeConfi);
       }
       b.a = objArray;
       if (objArray == null) {
          objArray = b.b();
       }else if(b2 || !objArray.isUseHardwareEncode()){
          b3 = true;
       }else {
          b3 = false;
       }
       objArray.setEncodeTypeModifiable(b3);
       EncodeSchemeHelper.a(objArray);
       if (b2) {
          if (!g.o1() || !l.c("use_hardware_encode", b1)) {
             b = false;
          }
          objArray.setUseHardwareEncode(b);
          b2 = (g.o1())? l.e("debug_record_width", 720): 0;
          objArray.setWidth(b2);
          if (g.o1()) {
             b1 = l.e("debug_record_height", 1280);
          }
          objArray.setHeight(b1);
       }
       return objArray;
    }
    public static void d(){
       b.a = null;
    }
}
