package com.kuaishou.live.lite.adapter.component.fansgroup.http.LiveLiteFansGroupJoinResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveLiteFansGroupJoinResponse implements Serializable	// class@001d9c
{
    public JsonElement mCsLogCorrelateInfo;
    public LiveFansGroupIntimacyInfo mIntimacyInfo;
    public int mJoinTicketGiftId;
    public static final long serialVersionUID = 0x7546d104eb4639db;

    public void LiveLiteFansGroupJoinResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFansGroupJoinResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLiteFansGroupJoinResponse{mIntimacyInfo="+this.mIntimacyInfo+'}';
    }
}
