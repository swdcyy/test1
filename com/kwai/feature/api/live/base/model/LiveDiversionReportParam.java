package com.kwai.feature.api.live.base.model.LiveDiversionReportParam;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class LiveDiversionReportParam implements Serializable	// class@000f84
{
    public String mExtraInfo;
    public String mLiveStreamId;
    public static final long serialVersionUID = 0x1590771fd85d3e9f;

    public void LiveDiversionReportParam(String p0,String p1){
       super();
       this.mLiveStreamId = p0;
       this.mExtraInfo = p1;
    }
}
