package com.kwai.sdk.switchconfig.v1.loggerII.HoldInfo;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import com.google.gson.Gson;

public class HoldInfo	// class@000f38
{
    public int mHoldInterval;
    public List mHoldReportKswitches;
    public double mHoldSampleRate;

    public void HoldInfo(){
       super();
       this.mHoldReportKswitches = new ArrayList();
       this.mHoldInterval = 0;
       this.mHoldSampleRate = 0;
    }
    public String toString(){
       return new Gson().q(this);
    }
}
