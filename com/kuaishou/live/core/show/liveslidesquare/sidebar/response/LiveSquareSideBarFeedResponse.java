package com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import tb2.b;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarRefreshData;
import com.kwai.robust.PatchProxyResult;
import tb2.c;
import java.lang.Boolean;
import la6.a;

public class LiveSquareSideBarFeedResponse implements CursorResponse, Serializable, a	// class@000ca5
{
    public String mCursor;
    public LiveSquareSideBarRefreshData mData;
    public List mFeeds;
    public String mFollowTabRecommendTitle;
    public String mLlsid;
    public List mSquareFeeds;
    public List mSquarePkFeeds;
    public static final long serialVersionUID = 0x7a0e6331d633dd53;

    public void LiveSquareSideBarFeedResponse(){
       super();
       this.mSquareFeeds = new ArrayList();
    }
    public void afterDeserialize(){
       Iterator iterator;
       QPhoto qPhoto;
       if (PatchProxy.applyVoid(null, this, LiveSquareSideBarFeedResponse.class, "5")) {
          return;
       }
       if (!q.f(this.mFeeds)) {
          iterator = this.mFeeds.iterator();
          while (iterator.hasNext()) {
             qPhoto = iterator.next();
             qPhoto.setListLoadSequenceID(this.mLlsid);
             this.mSquareFeeds.add(this.buildNormalFeed(qPhoto));
          }
       }
       LiveSquareSideBarFeedResponse tmData = this.mData;
       if (tmData != null && !q.f(tmData.mFeeds)) {
          iterator = this.mData.mFeeds.iterator();
          while (iterator.hasNext()) {
             qPhoto = iterator.next();
             qPhoto.setListLoadSequenceID(this.mLlsid);
             this.mData.mSquareFeeds.add(this.buildNormalFeed(qPhoto));
          }
       }
       return;
    }
    public final b buildNormalFeed(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSquareSideBarFeedResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(p0);
    }
    public String getCursor(){
       LiveSquareSideBarFeedResponse tmCursor;
       LiveSquareSideBarRefreshData obj = PatchProxy.apply(null, this, LiveSquareSideBarFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isDownPage())? this.mData.mCursor: this.mCursor;
       return obj;
    }
    public List getItems(){
       LiveSquareSideBarFeedResponse tmSquareFeed;
       LiveSquareSideBarRefreshData obj = PatchProxy.apply(null, this, LiveSquareSideBarFeedResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isDownPage())? this.mData.mSquareFeeds: this.mSquareFeeds;
       return obj;
    }
    public boolean hasMore(){
       LiveSquareSideBarFeedResponse tmCursor;
       LiveSquareSideBarRefreshData obj = PatchProxy.apply(null, this, LiveSquareSideBarFeedResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = (this.isDownPage())? this.mData.mCursor: this.mCursor;
       return a.a(obj);
    }
    public boolean isDownPage(){
       boolean b = (this.mData != null)? true: false;
       return b;
    }
}
