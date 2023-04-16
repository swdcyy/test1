package com.kwai.social.startup.follow.model.ProfileLastSeenConfig;
import java.io.Serializable;
import com.kwai.social.startup.follow.model.FeedLoadConfig;
import com.kwai.social.startup.follow.model.SearchLoadConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfileLastSeenConfig implements Serializable	// class@0018a4
{
    public boolean mEnableLoadingOptimize;
    public FeedLoadConfig mFeedLoadConfig;
    public SearchLoadConfig mSearchLoadConfig;

    public void ProfileLastSeenConfig(boolean p0,FeedLoadConfig p1,SearchLoadConfig p2){
       a.p(p1, "mFeedLoadConfig");
       a.p(p2, "mSearchLoadConfig");
       super();
       this.mEnableLoadingOptimize = p0;
       this.mFeedLoadConfig = p1;
       this.mSearchLoadConfig = p2;
    }
    public static ProfileLastSeenConfig copy$default(ProfileLastSeenConfig p0,boolean p1,FeedLoadConfig p2,SearchLoadConfig p3,int p4,Object p5){
       ProfileLastSeenConfig mEnableLoadi;
       ProfileLastSeenConfig mFeedLoadCon;
       ProfileLastSeenConfig mSearchLoadC;
       if (p4 & 0x01) {
          mEnableLoadi = p0.mEnableLoadingOptimize;
       }
       if (p4 & 0x02) {
          mFeedLoadCon = p0.mFeedLoadConfig;
       }
       if (p4 & 0x04) {
          mSearchLoadC = p0.mSearchLoadConfig;
       }
       return p0.copy(mEnableLoadi, mFeedLoadCon, mSearchLoadC);
    }
    public final boolean component1(){
       return this.mEnableLoadingOptimize;
    }
    public final FeedLoadConfig component2(){
       return this.mFeedLoadConfig;
    }
    public final SearchLoadConfig component3(){
       return this.mSearchLoadConfig;
    }
    public final ProfileLastSeenConfig copy(boolean p0,FeedLoadConfig p1,SearchLoadConfig p2){
       if (PatchProxy.isSupport(ProfileLastSeenConfig.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, ProfileLastSeenConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "mFeedLoadConfig");
       a.p(p2, "mSearchLoadConfig");
       return new ProfileLastSeenConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileLastSeenConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfileLastSeenConfig && (this.mEnableLoadingOptimize == p0.mEnableLoadingOptimize && (a.g(this.mFeedLoadConfig, p0.mFeedLoadConfig) && a.g(this.mSearchLoadConfig, p0.mSearchLoadConfig))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       ProfileLastSeenConfig obj = PatchProxy.apply(null, this, ProfileLastSeenConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mEnableLoadingOptimize;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       ProfileLastSeenConfig tmFeedLoadCo = this.mFeedLoadConfig;
       int i1 = 0;
       int i2 = (tmFeedLoadCo != null)? tmFeedLoadCo.hashCode(): 0;
       i = (i + i2) * 31;
       tmFeedLoadCo = this.mSearchLoadConfig;
       if (tmFeedLoadCo != null) {
          i1 = tmFeedLoadCo.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileLastSeenConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfileLastSeenConfig\(mEnableLoadingOptimize="+this.mEnableLoadingOptimize+", mFeedLoadConfig="+this.mFeedLoadConfig+", mSearchLoadConfig="+this.mSearchLoadConfig+"\)";
    }
}
