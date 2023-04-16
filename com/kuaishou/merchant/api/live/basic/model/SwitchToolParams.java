package com.kuaishou.merchant.api.live.basic.model.SwitchToolParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class SwitchToolParams implements Serializable	// class@001567
{
    public GifshowActivity mActivity;
    public String mLiveStreamId;
    public int mRootTag;
    public static final long serialVersionUID = 0xb86c833b4ad7075;

    public void SwitchToolParams(){
       super();
    }
    public static SwitchToolParams newParams(){
       Object obj = PatchProxy.apply(null, null, SwitchToolParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SwitchToolParams();
    }
    public SwitchToolParams activity(GifshowActivity p0){
       this.mActivity = p0;
       return this;
    }
    public SwitchToolParams liveStreamId(String p0){
       this.mLiveStreamId = p0;
       return this;
    }
}
