package com.kwai.video.ksmodelmanager.ModelSDK;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksmodelmanager.ModelRepo;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import s00.b$b;
import s00.b;
import com.kwai.video.ksmodelmanager.ModelSDKConfig;

public class ModelSDK	// class@000911
{
    public static ModelSDKConfig config;
    public static boolean hasInitialized;

    public void ModelSDK(){
       super();
    }
    public static void clearAllCache(){
       if (PatchProxy.applyVoid(null, null, ModelSDK.class, "1")) {
          return;
       }
       ModelRepo.clearAllCache();
       return;
    }
    public static String decodeModelParams(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ModelSDK.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c().a((new JSONObject(p0).toString()).getBytes());
    }
    public static ModelSDKConfig getConfig(){
       Object obj = PatchProxy.apply(null, null, ModelSDK.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!ModelSDK.hasInitialized) {
          return null;
       }
       return ModelSDK.config;
    }
    public static void initSDK(ModelSDKConfig p0){
       if (ModelSDK.hasInitialized) {
          return;
       }
       ModelSDK.hasInitialized = true;
       ModelSDK.config = p0;
       return;
    }
}
