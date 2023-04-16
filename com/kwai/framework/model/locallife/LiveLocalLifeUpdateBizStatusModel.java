package com.kwai.framework.model.locallife.LiveLocalLifeUpdateBizStatusModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class LiveLocalLifeUpdateBizStatusModel implements Serializable	// class@0016c5
{
    public int mAction;
    public TunaButtonModel mActionUrl;
    public JsonObject mBizConfig;
    public String mButtonText;
    public String mTipContent;
    public static final long serialVersionUID = 0xa466b6a33bf9beca;

    public void LiveLocalLifeUpdateBizStatusModel(){
       super();
    }
    public int getBizId(){
       JsonElement obj = PatchProxy.apply(null, this, LiveLocalLifeUpdateBizStatusModel.class, "1");
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
