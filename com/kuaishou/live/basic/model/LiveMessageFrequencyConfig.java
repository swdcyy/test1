package com.kuaishou.live.basic.model.LiveMessageFrequencyConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FreezeConfig;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;

public class LiveMessageFrequencyConfig implements Serializable	// class@000cdd
{
    public Map mFreezeConfigMap;
    public List mFreezeConfigs;
    public Map mFrequencyConfigMap;
    public List mFrequencyConfigs;
    public static final long serialVersionUID = 0xb3433ee3f22b24af;

    public void LiveMessageFrequencyConfig(){
       super();
       this.mFrequencyConfigMap = null;
       this.mFreezeConfigMap = null;
    }
    public Map getFreezeConfigMap(){
       LiveMessageFrequencyConfig obj = PatchProxy.apply(null, this, LiveMessageFrequencyConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mFreezeConfigMap == null) {
          this.mFreezeConfigMap = new ArrayMap();
       }
       if (!this.mFreezeConfigMap.size()) {
          obj = this.mFreezeConfigs;
          if (obj != null) {
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                LiveMessageFrequencyConfig$FreezeConfig uFreezeConfi = iterator.next();
                if (uFreezeConfi != null && uFreezeConfi.isValid()) {
                   this.mFreezeConfigMap.put(uFreezeConfi.mConfigBizId, uFreezeConfi);
                }
             }
          }
       }
       return this.mFreezeConfigMap;
    }
    public Map getFrequencyConfigMap(){
       LiveMessageFrequencyConfig obj = PatchProxy.apply(null, this, LiveMessageFrequencyConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mFrequencyConfigMap == null) {
          this.mFrequencyConfigMap = new ArrayMap();
       }
       if (!this.mFrequencyConfigMap.size()) {
          obj = this.mFrequencyConfigs;
          if (obj != null) {
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo = iterator.next();
                if (uFrequencyCo != null && uFrequencyCo.isValid()) {
                   this.mFrequencyConfigMap.put(uFrequencyCo.mConfigBizId, uFrequencyCo);
                }
             }
          }
       }
       return this.mFrequencyConfigMap;
    }
}
