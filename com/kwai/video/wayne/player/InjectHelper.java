package com.kwai.video.wayne.player.InjectHelper;
import java.lang.Object;
import com.kwai.video.wayne.player.decision.IDecisionFilter;
import com.kwai.video.wayne.player.prefetcher.IPrefetchReporterInfo;

public class InjectHelper	// class@000c9f
{
    public IDecisionFilter mIDecisionFilter;
    public long mPlayerLoadThreadhold;
    public IPrefetchReporterInfo mPrefetchReporterInfo;
    public static final InjectHelper injectInitor;

    static {
       InjectHelper.injectInitor = new InjectHelper();
    }
    public void InjectHelper(){
       super();
       this.mPlayerLoadThreadhold = 0x96000;
    }
    public static InjectHelper getInstance(){
       return InjectHelper.injectInitor;
    }
    public IDecisionFilter getDecisionFilter(){
       return this.mIDecisionFilter;
    }
    public long getPlayerLoadThreadhold(){
       return this.mPlayerLoadThreadhold;
    }
    public IPrefetchReporterInfo getPrefetchInfoImpl(){
       return this.mPrefetchReporterInfo;
    }
    public void injectDecisionFilter(IDecisionFilter p0){
       this.mIDecisionFilter = p0;
    }
    public void injectPlayerLoadThreadhold(long p0){
       this.mPlayerLoadThreadhold = p0;
    }
    public void injectPrefetchInfoImpl(IPrefetchReporterInfo p0){
       this.mPrefetchReporterInfo = p0;
    }
}
