package com.kuaishou.merchant.live.marketing.truthordare.model.TruthOrDareInfo$PendantInfo;
import java.io.Serializable;
import com.kuaishou.merchant.live.marketing.truthordare.model.TruthOrDareInfo$PendantInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.merchant.live.marketing.truthordare.model.TruthOrDareInfo$BubbleInfo;

public final class TruthOrDareInfo$PendantInfo implements Serializable	// class@001aa2
{
    public String mActionUrl;
    public CDNUrl[] mBackgroundImageUrls;
    public CDNUrl[] mBottomImageUrls;
    public TruthOrDareInfo$BubbleInfo mBubbleInfo;
    public CDNUrl[] mLPDBgImageUrl;
    public String mTaskId;
    public static final TruthOrDareInfo$PendantInfo$a Companion;
    public static final long serialVersionUID;

    static {
       TruthOrDareInfo$PendantInfo.Companion = new TruthOrDareInfo$PendantInfo$a(null);
    }
    public void TruthOrDareInfo$PendantInfo(){
       super();
       this.mTaskId = "";
       this.mActionUrl = "";
    }
    public final String getMActionUrl(){
       return this.mActionUrl;
    }
    public final CDNUrl[] getMBackgroundImageUrls(){
       return this.mBackgroundImageUrls;
    }
    public final CDNUrl[] getMBottomImageUrls(){
       return this.mBottomImageUrls;
    }
    public final TruthOrDareInfo$BubbleInfo getMBubbleInfo(){
       return this.mBubbleInfo;
    }
    public final CDNUrl[] getMLPDBgImageUrl(){
       return this.mLPDBgImageUrl;
    }
    public final String getMTaskId(){
       return this.mTaskId;
    }
    public final void setMActionUrl(String p0){
       this.mActionUrl = p0;
    }
    public final void setMBackgroundImageUrls(CDNUrl[] p0){
       this.mBackgroundImageUrls = p0;
    }
    public final void setMBottomImageUrls(CDNUrl[] p0){
       this.mBottomImageUrls = p0;
    }
    public final void setMBubbleInfo(TruthOrDareInfo$BubbleInfo p0){
       this.mBubbleInfo = p0;
    }
    public final void setMLPDBgImageUrl(CDNUrl[] p0){
       this.mLPDBgImageUrl = p0;
    }
    public final void setMTaskId(String p0){
       this.mTaskId = p0;
    }
}
