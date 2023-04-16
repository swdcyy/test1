package com.kuaishou.android.model.ads.NeoParamsVideoInfo;
import com.kuaishou.android.model.ads.NeoParamsBaseInfo;
import com.kuaishou.android.model.ads.AdNeoInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class NeoParamsVideoInfo extends NeoParamsBaseInfo	// class@000880
{
    public NeoParamsVideoInfo$CustomData mCustomData;
    public String mDrainageType;
    public static final long serialVersionUID = 0xe939c5e5e875a10f;

    public void NeoParamsVideoInfo(){
       super();
    }
    public boolean checkIsValid(){
       boolean b = (this.mPageId > 0 && (this.mSubPageId > 0 && this.mBusinessId > 0))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NeoParamsVideoInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StartVideoInfo{mPageId="+this.mPageId+", mSubPageId="+this.mSubPageId+", mBusinessId="+this.mBusinessId+", mExtParams=\'"+this.mExtParams+'''+", mCustomData="+this.mCustomData+'}';
    }
}
