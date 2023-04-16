package com.kuaishou.nearby_poi.poi.model.PoiOpenLiveFeedParams;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.model.LiveStreamModel;

public class PoiOpenLiveFeedParams implements Serializable	// class@000a33
{
    public boolean mDisableLoadMore;
    public boolean mDisablePullRefresh;
    public int mLiveSquareSource;
    public List mLiveStreamFeed;
    public String mLiveStreamId;
    public String mPath;
    public int mSourceType;
    public static final long serialVersionUID = 0xe9766d5a4c892e22;

    public void PoiOpenLiveFeedParams(){
       super();
    }
    public LiveStreamFeed getSelectedFeed(){
       Object obj = PatchProxy.apply(null, this, PoiOpenLiveFeedParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.mLiveStreamFeed.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return this.mLiveStreamFeed.get(0);
          }
          if ((this.mLiveStreamId).equals(this.mLiveStreamFeed.get(i1).mLiveStreamModel.mLiveStreamId)) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return this.mLiveStreamFeed.get(i1);
    }
}
