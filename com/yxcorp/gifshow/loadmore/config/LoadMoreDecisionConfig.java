package com.yxcorp.gifshow.loadmore.config.LoadMoreDecisionConfig;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.loadmore.config.LoadMorePolicy;
import java.lang.Boolean;
import r1b.d;
import com.yxcorp.gifshow.loadmore.config.VideoCostCalculationConfig;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.loadmore.config.LoadMorePolicy$Interval;

public class LoadMoreDecisionConfig	// class@001aa1
{
    public d a;
    public LoadMorePolicy b;
    public LoadMorePolicy c;
    public List d;
    public boolean e;
    public ApiCostCalculationConfig mApiCostCalculationConfig;
    public float mDisCount;
    public List mLoadMorePolicies;
    public RecoVideoCostCalculationConfig mRecoVideoCostCalculationConfig;
    public VideoCostCalculationConfig mVideoCostCalculationConfig;

    public void LoadMoreDecisionConfig(){
       super();
    }
    public List a(){
       Object obj = PatchProxy.apply(null, this, LoadMoreDecisionConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.h();
       return this.d;
    }
    public LoadMorePolicy b(){
       Object obj = PatchProxy.apply(null, this, LoadMoreDecisionConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.h();
       return this.b;
    }
    public boolean c(){
       LoadMoreDecisionConfig obj = PatchProxy.apply(null, this, LoadMoreDecisionConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLoadMorePolicies;
       boolean b = (obj != null && !obj.isEmpty())? true: false;
       return b;
    }
    public boolean d(){
       boolean b = (this.mApiCostCalculationConfig != null)? true: false;
       return b;
    }
    public boolean e(LoadMorePolicy p0){
       LoadMoreDecisionConfig obj = PatchProxy.applyOneRefs(p0, this, LoadMoreDecisionConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.h();
       obj = this.b;
       boolean b = (obj != null && obj == p0)? true: false;
       return b;
    }
    public boolean f(boolean p0){
       LoadMoreDecisionConfig ta = this.a;
       p0 = (ta != null && (ta.mEnable != null && p0))? true: false;
       return p0;
    }
    public boolean g(){
       LoadMoreDecisionConfig tmVideoCostC = this.mVideoCostCalculationConfig;
       boolean b = (tmVideoCostC != null && tmVideoCostC.mEnable != null)? true: false;
       return b;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, LoadMoreDecisionConfig.class, "3")) {
          return;
       }
       if (this.e == null) {
          this.e = true;
          if (this.mLoadMorePolicies == null) {
             return;
          }else {
             this.d = new ArrayList();
             Iterator iterator = this.mLoadMorePolicies.iterator();
             while (iterator.hasNext()) {
                LoadMorePolicy loadMorePoli = iterator.next();
                LoadMorePolicy mInterval = loadMorePoli.mInterval;
                if (mInterval == null) {
                   continue ;
                }else if(!mInterval.mStart && !mInterval.mEnd){
                   this.b = loadMorePoli;
                }else {
                   this.d.add(loadMorePoli);
                }
             }
          }
       }
       return;
    }
}
