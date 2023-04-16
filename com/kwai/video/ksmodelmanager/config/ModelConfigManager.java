package com.kwai.video.ksmodelmanager.config.ModelConfigManager;
import java.lang.Object;
import com.kwai.video.ksmodelmanager.config.ModelConfigManager$1;
import com.kwai.video.ksmodelmanager.config.ModelConfigManager$Holder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import c97.d;
import com.kwai.middleware.azeroth.network.a$b;
import com.kwai.middleware.azeroth.network.a;
import com.kwai.video.ksmodelmanager.config.ModelConfigManager$2;
import java.util.Map;
import ca7.c;
import com.kwai.video.ksmodelmanager.config.ModelConfig;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksmodelmanager.config.ModelConfig$ModelInfo;
import h97.d;
import h97.j;
import java.lang.reflect.Type;

public class ModelConfigManager	// class@00091b
{
    public ModelConfig mConfig;
    public Object mLock;

    public void ModelConfigManager(){
       super();
       this.mLock = new Object();
       this.init();
    }
    public void ModelConfigManager(ModelConfigManager$1 p0){
       super();
    }
    public static ModelConfigManager getInstance(){
       return ModelConfigManager$Holder.sManager;
    }
    public static void request(){
       if (PatchProxy.applyVoid(null, null, ModelConfigManager.class, "5")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("version1", "1");
       hashMap.put("version2", "2");
       hashMap.put("version3", "3");
       d.a().k("appsupport").a().f("configs", "POST", new HashMap(), null, hashMap, HashMap.class, new ModelConfigManager$2());
       return;
    }
    public ModelConfig getConfig(){
       Object[] objArray = null;
       ModelConfigManager obj = PatchProxy.apply(objArray, this, ModelConfigManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ModelConfigManager tmConfig = this.mConfig;
       if (tmConfig == null) {
          this.updateConfig();
       }else {
          objArray = tmConfig;
       }
       _monitor_exit(obj);
       return objArray;
    }
    public ModelConfig$ModelInfo getModelConfig(String p0){
       ModelConfigManager obj = PatchProxy.applyOneRefs(p0, this, ModelConfigManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mConfig;
       if (obj == null) {
          return null;
       }
       ModelConfig$ModelInfo modelInfo = obj.config.get(p0);
       if (modelInfo.url == null) {
          return null;
       }
       return modelInfo;
    }
    public Map getModelConfig(){
       ModelConfigManager tmConfig = this.mConfig;
       if (tmConfig == null) {
          return null;
       }
       return tmConfig.config;
    }
    public final void init(){
       if (PatchProxy.applyVoid(null, this, ModelConfigManager.class, "1")) {
          return;
       }
       this.updateConfig();
       d.a().c().b("ksalgorithmmodelkit", new ModelConfigManager$1(this));
       return;
    }
    public void updateConfig(){
       if (PatchProxy.applyVoid(null, this, ModelConfigManager.class, "3")) {
          return;
       }
       try{
          ModelConfigManager tmLock = this.mLock;
          _monitor_enter(tmLock);
          this.mConfig = d.a().c().a("ksalgorithmmodelkit", ModelConfig.class);
          _monitor_exit(tmLock);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
