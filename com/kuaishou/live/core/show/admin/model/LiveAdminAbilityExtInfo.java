package com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveAdminAbilityExtInfo implements Serializable	// class@0009b3
{
    public List mForbidTimeConfig;
    public List mTargetLiveStreamTypes;
    public List mTargetUserTypes;
    public static final long serialVersionUID = 0x5e278f3b96c0f977;

    public void LiveAdminAbilityExtInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAdminAbilityExtInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAdminAbilityExtInfo{mTargetUserTypes="+this.mTargetUserTypes+", mTargetLiveStreamTypes="+this.mTargetLiveStreamTypes+", forbidTime="+this.mForbidTimeConfig+'}';
    }
}
