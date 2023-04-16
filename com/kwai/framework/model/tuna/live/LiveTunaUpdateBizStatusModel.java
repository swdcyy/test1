package com.kwai.framework.model.tuna.live.LiveTunaUpdateBizStatusModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class LiveTunaUpdateBizStatusModel implements Serializable	// class@0016d0
{
    public int mAction;
    public TunaButtonModel mActionUrl;
    public JsonObject mBizConfig;
    public String mButtonText;
    public String mTipContent;
    public static final long serialVersionUID = 0xeddbb13f157295f7;

    public void LiveTunaUpdateBizStatusModel(){
       super();
    }
    public int getBizId(){
       JsonElement obj = PatchProxy.apply(null, this, LiveTunaUpdateBizStatusModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mBizConfig.e0("bizId");
       if (obj != null) {
          return obj.p();
       }
       return 0;
    }
}
