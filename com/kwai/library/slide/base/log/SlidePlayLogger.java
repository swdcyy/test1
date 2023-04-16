package com.kwai.library.slide.base.log.SlidePlayLogger;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yy6.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.google.common.collect.ImmutableList;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.log.model.CommonParams;
import java.lang.Integer;

public abstract class SlidePlayLogger implements Serializable	// class@0008e7
{
    public BaseFeed b;
    public ImmutableList c;
    public String mClientExpTag;
    public ClientEvent$UrlPackage mReferUrlPackage;
    public static final long serialVersionUID = 0x422ff5adc88e0f3c;

    public void SlidePlayLogger(){
       super();
       this.mClientExpTag = String.valueOf(1);
    }
    public static SlidePlayLogger getLogger(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SlidePlayLogger.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof a) {
          return p0.d1();
       }
       return null;
    }
    public BaseFeed getBaseFeed(){
       return this.b;
    }
    public ImmutableList getCustomKsOrderList(){
       return this.c;
    }
    public ClientEvent$UrlPackage getReferUrlPackage(){
       return this.mReferUrlPackage;
    }
    public boolean isLiveStream(){
       return false;
    }
    public abstract void onButtonClicked(BaseFeed p0,String p1,int p2,int p3,int p4,int p5,String p6,CommonParams p7);
    public SlidePlayLogger setBaseFeed(BaseFeed p0){
       this.b = p0;
       return this;
    }
    public SlidePlayLogger setCustomKsOrderList(ImmutableList p0){
       this.c = p0;
       return this;
    }
    public void setFingerLeaveDuration(long p0){
    }
    public void setFingerLeaveToStartDuration(long p0){
    }
    public void setIsRefreshFirstPhoto(boolean p0){
    }
    public abstract void setLeaveAction(int p0);
    public void setPlayerMiddlewareDuration(long p0){
    }
    public void setPlayerPrepareDuration(long p0){
    }
    public void setPlayerSdkDuration(long p0){
    }
    public SlidePlayLogger setReferUrlPackage(ClientEvent$UrlPackage p0){
       this.mReferUrlPackage = p0;
       return this;
    }
    public SlidePlayLogger setShowType(int p0){
       if (PatchProxy.isSupport(SlidePlayLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SlidePlayLogger.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mClientExpTag = String.valueOf(p0);
       return this;
    }
}
