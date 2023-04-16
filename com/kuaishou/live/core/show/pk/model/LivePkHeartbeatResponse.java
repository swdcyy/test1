package com.kuaishou.live.core.show.pk.model.LivePkHeartbeatResponse;
import java.io.Serializable;
import java.lang.Object;

public class LivePkHeartbeatResponse implements Serializable	// class@000d9a
{
    public long mHeartbeatReportInterval;
    public long mResult;
    public static final long serialVersionUID = 0xef57542bb5126cc3;

    public void LivePkHeartbeatResponse(){
       super();
       this.mHeartbeatReportInterval = 2000;
    }
}
