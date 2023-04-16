package com.kuaishou.live.common.core.component.multiline.model.MultiLineRequestResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class MultiLineRequestResponse implements Serializable	// class@0014f0
{
    public String mAryaConfig;
    public List mCalledUserIdList;
    public String mChatId;
    public LiveLineExtraInfo mExtraInfo;
    public String mSessionId;
    public long mTimeoutMillis;
    public static final long serialVersionUID = 0xbac131aafaa4e705;

    public void MultiLineRequestResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MultiLineRequestResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CallResponse{chatId=\'"+this.mChatId+'''+"sessionId=\'"+this.mSessionId+'''+", calledUserIdList="+this.mCalledUserIdList+", aryaConfig is empty="+TextUtils.isEmpty(this.mAryaConfig)+", timeoutMillis="+this.mTimeoutMillis+", extraInfo ="+this.mExtraInfo+'}';
    }
}
