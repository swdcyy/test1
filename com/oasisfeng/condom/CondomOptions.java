package com.oasisfeng.condom.CondomOptions;
import java.lang.Object;
import com.oasisfeng.condom.CondomKit;
import java.util.ArrayList;
import java.util.List;
import com.oasisfeng.condom.OutboundJudge;

public class CondomOptions	// class@000a7f
{
    public boolean mDryRun;
    public boolean mExcludeBackgroundReceivers;
    public boolean mExcludeBackgroundServices;
    public List mKits;
    public OutboundJudge mOutboundJudge;

    public void CondomOptions(){
       super();
       this.mExcludeBackgroundReceivers = true;
       this.mExcludeBackgroundServices = true;
    }
    public CondomOptions addKit(CondomKit p0){
       if (this.mKits == null) {
          this.mKits = new ArrayList();
       }
       this.mKits.add(p0);
       return this;
    }
    public CondomOptions preventBroadcastToBackgroundPackages(boolean p0){
       this.mExcludeBackgroundReceivers = p0;
       return this;
    }
    public CondomOptions preventServiceInBackgroundPackages(boolean p0){
       this.mExcludeBackgroundServices = p0;
       return this;
    }
    public CondomOptions setDryRun(boolean p0){
       this.mDryRun = p0;
       return this;
    }
    public CondomOptions setOutboundJudge(OutboundJudge p0){
       this.mOutboundJudge = p0;
       return this;
    }
}
