package com.kuaishou.house.model.LiveHouseUpdateBizStatusModel;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.locallife.LiveLocalLifeUpdateBizStatusModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class LiveHouseUpdateBizStatusModel implements Serializable	// class@000798
{
    public int mAction;
    public TunaButtonModel mActionUrl;
    public JsonObject mBizConfig;
    public String mButtonText;
    public String mTipContent;
    public static final long serialVersionUID = 0xfabbd679e6b7641a;

    public void LiveHouseUpdateBizStatusModel(){
       super();
    }
    public static LiveLocalLifeUpdateBizStatusModel convertHouseModelToLocalLifeModule(LiveHouseUpdateBizStatusModel p0){
       LiveLocalLifeUpdateBizStatusModel obj = PatchProxy.applyOneRefs(p0, null, LiveHouseUpdateBizStatusModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveLocalLifeUpdateBizStatusModel();
       obj.mButtonText = p0.mButtonText;
       obj.mBizConfig = p0.mBizConfig;
       obj.mAction = p0.mAction;
       obj.mActionUrl = p0.mActionUrl;
       obj.mTipContent = p0.mTipContent;
       return obj;
    }
    public int getBizId(){
       JsonElement obj = PatchProxy.apply(null, this, LiveHouseUpdateBizStatusModel.class, "1");
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
