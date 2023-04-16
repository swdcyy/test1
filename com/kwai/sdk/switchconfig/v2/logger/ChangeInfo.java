package com.kwai.sdk.switchconfig.v2.logger.ChangeInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import com.google.gson.Gson;

public class ChangeInfo implements Serializable	// class@001685
{
    public double mChangeAffectSampleRate;
    public List mChangeBlockReportKswitches;
    public double mChangeUpdateSampleRate;
    public double mChangeValidSampleRate;

    public void ChangeInfo(){
       super();
       this.mChangeBlockReportKswitches = new ArrayList();
       this.mChangeUpdateSampleRate = 0;
       this.mChangeValidSampleRate = 0;
       this.mChangeAffectSampleRate = 0;
    }
    public String toString(){
       return new Gson().q(this);
    }
}
