package com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantStatus;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RewardPendantStatus implements Serializable	// class@001175
{
    public long mActivityId;
    public boolean mShowWidget;
    public int mStatusType;
    public static final long serialVersionUID = 0x7f22d9115846022f;

    public void RewardPendantStatus(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RewardPendantStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Status{mStatusType="+this.mStatusType+'}';
    }
}
