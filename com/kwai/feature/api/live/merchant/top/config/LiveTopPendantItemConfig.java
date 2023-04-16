package com.kwai.feature.api.live.merchant.top.config.LiveTopPendantItemConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveTopPendantItemConfig implements Serializable	// class@000fe4
{
    public int mBizId;
    public boolean mIsAlignLeft;
    public String mMergeId;
    public int mOrder;
    public int mPriority;
    public static final long serialVersionUID = 0xb23c20b202dbb195;

    public void LiveTopPendantItemConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveTopPendantItemConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveTopPendantItemConfig{mBizId="+this.mBizId+", mPriority="+this.mPriority+", mOrder="+this.mOrder+", mMergeId=\'"+this.mMergeId+'''+'}';
    }
}
