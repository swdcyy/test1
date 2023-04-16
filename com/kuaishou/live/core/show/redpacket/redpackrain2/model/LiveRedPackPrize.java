package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackPrize;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveRedPackPrize implements Serializable	// class@000efe
{
    public int mCount;
    public int mDisplayType;
    public String mExtInfo;
    public String mId;
    public String mLinkUrl;
    public String mName;
    public List mPicUrl;
    public int mPrizeType;
    public static final long serialVersionUID = 0xe38cf378b2ed5968;

    public void LiveRedPackPrize(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackPrize.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRedPackPrize{mId="+this.mId+", mPrizeType=\'"+this.mPrizeType+'''+", mName=\'"+this.mName+'''+", mLinkUrl=\'"+this.mLinkUrl+'''+", extInfo=\'"+this.mExtInfo+'''+", displayOnTop=\'"+this.mDisplayType+'}';
    }
}
