package com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams;
import java.io.Serializable;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams$b;
import java.lang.Object;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams$a;

public class LiveFlowDiversionRepostParams implements Serializable	// class@000f88
{
    public LiveFlowDiversionRepostParams$FlowDiversionSourceType mFlowDiversionSourceType;
    public String mFromAuthorId;
    public String mFromAuthorLsId;
    public String mSourceId;
    public long mTime;
    public String mToAuthorId;
    public String mToAuthorLsId;
    public static final long serialVersionUID = 0x11db4fdb2362367d;

    public void LiveFlowDiversionRepostParams(LiveFlowDiversionRepostParams$b p0){
       super();
       this.mFromAuthorId = p0.a;
       this.mTime = p0.f;
       this.mSourceId = p0.e;
       this.mFromAuthorLsId = p0.b;
       this.mToAuthorId = p0.c;
       this.mToAuthorLsId = p0.d;
       this.mFlowDiversionSourceType = p0.g;
    }
    public void LiveFlowDiversionRepostParams(LiveFlowDiversionRepostParams$b p0,LiveFlowDiversionRepostParams$a p1){
       super(p0);
    }
}
