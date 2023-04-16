package com.yxcorp.gifshow.model.IntimateResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.IntimateRelationInfo;

public class IntimateResponse implements Serializable	// class@001e38
{
    public String[] mBanner;
    public List mInfos;
    public IntimateResponse$UnFollowIntimateReminder mUnFollowIntimateReminder;
    public static final long serialVersionUID = 0x84f3ea8fd45292bd;

    public void IntimateResponse(){
       super();
    }
    public String getBanner(){
       Object obj = PatchProxy.apply(null, this, IntimateResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntimateRelationInfo.getResource(this.mBanner);
    }
}
