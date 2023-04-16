package com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;

public class MagicEmojiEntrance implements Serializable, Cloneable	// class@001b8f
{
    public boolean mAutoApplyMagicFace;
    public long mBeginShowTimeMs;
    public boolean mCollected;
    public int mDirectlyUseMaxCount;
    public long mEndShowTimeMs;
    public String mEntranceIconId;
    public List mEntranceIconUrl;
    public String mEntranceShowTitle;
    public MagicTipColorConfig mEntranceTipColorConfig;
    public CDNUrl[] mEntranceTipIconUrls;
    public String mEntranceTipId;
    public String mEntranceTipMsg;
    public int mEntranceTipStrategyId;
    public MagicDownloadIndicatorConfig mIndicatorConfig;
    public int mMagicFaceId;
    public MagicEmoji$MagicFace mMagicFaceInfo;
    public int mMaxCount;
    public static final long serialVersionUID = 0x912a84ceebade818;

    public void MagicEmojiEntrance(){
       super();
    }
    public MagicEmojiEntrance clone(){
       MagicEmojiEntrance obj = PatchProxy.apply(null, this, MagicEmojiEntrance.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.clone();
       ArrayList uArrayList = new ArrayList();
       MagicEmojiEntrance tmEntranceIc = this.mEntranceIconUrl;
       if (tmEntranceIc != null) {
          uArrayList.addAll(tmEntranceIc);
       }
       obj.mEntranceIconUrl = uArrayList;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
}
