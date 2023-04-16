package com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$UnSupportReason;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;

public class KSFeedTemplateDetailInfo$UnSupportReason implements Serializable	// class@0019fe
{
    public int mCode;
    public String mReason;
    public static final long serialVersionUID = 0xba599f3ce56e125f;

    public void KSFeedTemplateDetailInfo$UnSupportReason(){
       super();
    }
    public String getReasonContent(){
       String obj = PatchProxy.apply(null, this, KSFeedTemplateDetailInfo$UnSupportReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(this.mReason)) {
          return this.mReason;
       }
       obj = (this.mCode == 1)? a1.p(R.string.arg_RES_7f101bbc): a1.p(R.string.arg_RES_7f101bbb);
       return obj;
    }
    public boolean isOffline(){
       boolean b = (this.mCode == null)? true: false;
       return b;
    }
}
