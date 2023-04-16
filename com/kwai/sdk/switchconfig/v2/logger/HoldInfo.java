package com.kwai.sdk.switchconfig.v2.logger.HoldInfo;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import com.google.gson.Gson;

public class HoldInfo	// class@001688
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
