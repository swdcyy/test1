package com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig implements Serializable	// class@0009b2
{
    public String mDisplayText;
    public long mDurationMS;
    public static final long serialVersionUID = 0x5e278f3b96c0f57e;

    public void LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAdminForbidCommentConfig{mDuration="+this.mDurationMS+", mDisplayText=\'"+this.mDisplayText+'''+'}';
    }
}
