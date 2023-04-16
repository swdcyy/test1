package com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import java.io.Serializable;
import java.lang.Object;

public class SignalPendant implements Serializable	// class@0011df
{
    public int action;
    public String areaCode;
    public String callbackApi;
    public String eventData;
    public boolean needBusinessHandle;
    public boolean needRandomCall;
    public boolean needServerProcess;
    public String pendantCode;
    public long pendantResourceId;
    public long randomRangeMillis;
    public Map throughInfo;
    public static final long serialVersionUID = 0x2e568d290bc87147;

    public void SignalPendant(){
       super();
    }
}
