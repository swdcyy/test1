package com.kuaishou.live.multiinteract.rtc.model.LiveInteractLeaveResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class LiveInteractLeaveResponse implements Serializable	// class@000d03
{
    public Object mLeaveExtraInfo;
    public String mLeaveInfo;
    public static final long serialVersionUID = 0xf9cb1aed5a5ec541;

    public void LiveInteractLeaveResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveInteractLeaveResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveInteractLeaveResponse{leaveInfo is empty=\'"+TextUtils.isEmpty(this.mLeaveInfo)+'''+"extraInfo=\'"+this.mLeaveExtraInfo+'''+'}';
    }
}
