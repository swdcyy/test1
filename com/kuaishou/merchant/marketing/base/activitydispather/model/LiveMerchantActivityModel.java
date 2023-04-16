package com.kuaishou.merchant.marketing.base.activitydispather.model.LiveMerchantActivityModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;

public class LiveMerchantActivityModel implements Serializable	// class@001aea
{
    public String activityDesc;
    public long activityEndTimeMills;
    public String activityId;
    public String activityName;
    public List activityPic;
    public long activityStartTimeMills;
    public int activityState;
    public int activityType;
    public Map extraMap;

    public void LiveMerchantActivityModel(){
       super();
    }
    public Map getExtraMap(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantActivityModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.extraMap == null) {
          this.extraMap = new HashMap();
       }
       return this.extraMap;
    }
}
