package com.kwai.feature.api.live.base.model.LiveCommentsFoldMessageConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveCommentsFoldMessageConfig implements Serializable	// class@000f83
{
    public int mGiftItemNum;
    public int mLikeItemNum;
    public int mMaxRateChoice;
    public int mOtherItemNum;
    public int mShareItemNum;
    public static final long serialVersionUID = 0x3818cc9549c1b0f5;

    public void LiveCommentsFoldMessageConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCommentsFoldMessageConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCommentFoldMsgConfig{mGiftItemNum="+this.mGiftItemNum+", mShareItemNum="+this.mShareItemNum+", mLikeItemNum="+this.mLikeItemNum+", mOtherItemNum="+this.mOtherItemNum+", mMaxRateChoice="+this.mMaxRateChoice+'}';
    }
}
