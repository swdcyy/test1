package com.kuaishou.live.playback.playmodule.log.LivePlaybackSlidePlayLogger;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;
import tkd.b;
import tkd.d;
import os5.l;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.Integer;

public abstract class LivePlaybackSlidePlayLogger implements Serializable	// class@000d40
{
    public String mClientExpTag;
    public int mLiveSourceType;
    public QPhoto mPhoto;
    public long mPhotoId;
    public LivePlaybackParam mPhotoParam;
    public ClientEvent$UrlPackage mReferUrlPackage;
    public static final long serialVersionUID = 0x422ff5adc88e0f3c;

    public void LivePlaybackSlidePlayLogger(){
       super();
       this.mLiveSourceType = 0;
       this.mClientExpTag = String.valueOf(1);
    }
    public abstract void buildUrlPackage(BaseFragment p0);
    public LivePlaybackSlidePlayLogger setBaseFeed(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackSlidePlayLogger.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mPhoto = new QPhoto(p0);
       if (p0 != null) {
          this.setPhotoId(p0.getId());
       }
       return this;
    }
    public abstract void setLeaveAction(int p0);
    public LivePlaybackSlidePlayLogger setPhoto(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackSlidePlayLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mPhoto = p0;
       if (p0 != null) {
          this.setPhotoId(p0.getPhotoId());
       }
       return this;
    }
    public LivePlaybackSlidePlayLogger setPhotoId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackSlidePlayLogger.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          this.mPhotoId = Long.valueOf(p0).longValue();
          return this;
       }catch(java.lang.Exception e0){
       }
    }
    public LivePlaybackSlidePlayLogger setPlaybackPhotoParam(LivePlaybackParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackSlidePlayLogger.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.mLiveSourceType = d.a(-1492894991).KL(p0.mSource);
          this.mPhotoParam = p0;
       }
       return this;
    }
    public LivePlaybackSlidePlayLogger setReferUrlPackage(ClientEvent$UrlPackage p0){
       this.mReferUrlPackage = p0;
       return this;
    }
    public LivePlaybackSlidePlayLogger setShowType(int p0){
       if (PatchProxy.isSupport(LivePlaybackSlidePlayLogger.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LivePlaybackSlidePlayLogger.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mClientExpTag = String.valueOf(p0);
       return this;
    }
}
