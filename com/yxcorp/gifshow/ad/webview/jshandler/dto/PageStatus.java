package com.yxcorp.gifshow.ad.webview.jshandler.dto.PageStatus;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class PageStatus implements Serializable	// class@001904
{
    public String mReason;
    public int mStatus;

    public void PageStatus(){
       super();
       this.mStatus = -1;
       this.mReason = "";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PageStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PageStatus{mStatus="+this.mStatus+", mReason=\'"+this.mReason+'''+'}';
    }
}
