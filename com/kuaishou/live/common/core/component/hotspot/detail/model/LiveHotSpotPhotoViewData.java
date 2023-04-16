package com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import java.io.Serializable;
import ln1.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;

public class LiveHotSpotPhotoViewData implements Serializable, b	// class@0013d0
{
    public String mDisplayTitle;
    public boolean mHasReportShowEvent;
    public QPhoto mPhotoFeedView;
    public String mPhotoLabel;
    public String mPlayCount;
    public String mPublishTime;

    public void LiveHotSpotPhotoViewData(){
       super();
    }
    public String getAuthorId(){
       LiveHotSpotPhotoViewData obj = PatchProxy.apply(null, this, LiveHotSpotPhotoViewData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPhotoFeedView;
       if (obj != null) {
          return obj.getUserId();
       }
       return null;
    }
    public BaseFeed getBaseFeed(){
       LiveHotSpotPhotoViewData tmPhotoFeedV = this.mPhotoFeedView;
       if (tmPhotoFeedV != null) {
          return tmPhotoFeedV.mEntity;
       }
       return null;
    }
    public boolean getHasReportShowEvent(){
       return this.mHasReportShowEvent;
    }
    public String getRelatedId(){
       LiveHotSpotPhotoViewData obj = PatchProxy.apply(null, this, LiveHotSpotPhotoViewData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPhotoFeedView;
       if (obj != null) {
          return obj.getPhotoId();
       }
       return null;
    }
    public String getServerExpTag(){
       LiveHotSpotPhotoViewData obj = PatchProxy.apply(null, this, LiveHotSpotPhotoViewData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPhotoFeedView;
       if (obj != null) {
          return obj.getServerExpTag();
       }
       return null;
    }
    public void setHasReportShowEvent(boolean p0){
       this.mHasReportShowEvent = p0;
    }
}
