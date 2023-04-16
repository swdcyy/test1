package com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGiftInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PrivilegeGiftInfo implements Serializable	// class@001319
{
    public long mGiftActivityExpireTime;
    public int mGiftActivityStatus;
    public int mMinWealthGrade;
    public static final long serialVersionUID = 0xb1b00b3ad7932472;

    public void PrivilegeGiftInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PrivilegeGiftInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PrivilegeGiftInfo{mGiftActivityStatus="+this.mGiftActivityStatus+", mGiftActivityExpireTime="+this.mGiftActivityExpireTime+", mMinWealthGrade="+this.mMinWealthGrade+'}';
    }
}
