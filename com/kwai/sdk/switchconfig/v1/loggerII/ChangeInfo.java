package com.kwai.sdk.switchconfig.v1.loggerII.ChangeInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import com.google.gson.Gson;

public class ChangeInfo implements Serializable	// class@000f35
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
    public void clearInfo(){
       this.mChangeBlockReportKswitches.clear();
       this.mChangeUpdateSampleRate = 0;
       this.mChangeAffectSampleRate = 0;
       this.mChangeValidSampleRate = 0;
    }
    public String toString(){
       return new Gson().q(this);
    }
    public void updateInfo(ChangeInfo p0){
       if (p0 == null) {
          return;
       }
       this.mChangeBlockReportKswitches = p0.mChangeBlockReportKswitches;
       this.mChangeUpdateSampleRate = p0.mChangeUpdateSampleRate;
       this.mChangeValidSampleRate = p0.mChangeValidSampleRate;
       this.mChangeAffectSampleRate = p0.mChangeAffectSampleRate;
       return;
    }
}
