package com.kuaishou.live.lite.adapter.component.fansgroup.http.LiveLiteFansGroupInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveLiteFansGroupInfoResponse implements Serializable	// class@001d9b
{
    public LiveFansGroupRelationInfoResponse mFansGroupInfoData;
    public static final long serialVersionUID = 0x878135a2bd16247;

    public void LiveLiteFansGroupInfoResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFansGroupInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLiteFansGroupInfoResponse{mFansGroupInfoData="+this.mFansGroupInfoData+'}';
    }
}
