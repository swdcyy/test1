package com.kuaishou.live.lite.recommendsidebar.panel.m$a;
import erd.o;
import com.kuaishou.live.lite.recommendsidebar.panel.m;
import java.lang.Object;
import com.kuaishou.live.lite.recommendsidebar.panel.model.LiveLiteRecommendPanelFeedResponseV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.lite.recommendsidebar.panel.model.LiveLiteRecommendPanelFeedResponseV2$LiveLiteFeedsTypeInfo;
import com.kuaishou.live.lite.recommendsidebar.panel.model.LiveLiteRecommendPanelFeedResponse;
import java.util.Collection;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendPanelItemType;
import java.lang.Integer;
import z1.a;

public class m$a implements o	// class@000b04
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, m$a.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          m$a uoa = null;
          ArrayList uArrayList1 = new ArrayList();
          this.b.w = p0.mCursor;
          LiveLiteRecommendPanelFeedResponseV2 mDataList = p0.mDataList;
          if (mDataList != null) {
             Iterator iterator = mDataList.iterator();
             while (iterator.hasNext()) {
                LiveLiteRecommendPanelFeedResponseV2$LiveLiteFeedsTypeInfo liveLiteFeed = iterator.next();
                LiveLiteRecommendPanelFeedResponse liveLiteReco = new LiveLiteRecommendPanelFeedResponse();
                LiveLiteRecommendPanelFeedResponseV2$LiveLiteFeedsTypeInfo mFeeds = liveLiteFeed.mFeeds;
                if (mFeeds == null || !mFeeds.size()) {
                   continue ;
                }else {
                   liveLiteReco.mFeeds = new ArrayList(liveLiteFeed.mFeeds);
                   liveLiteReco.mLlsid = p0.mLlsid;
                   liveLiteReco.mTitle = liveLiteFeed.mHeaderTitle;
                   liveLiteReco.mCursor = p0.mCursor;
                   if (liveLiteFeed.mType == LiveLiteRecommendPanelItemType.Followed.mType) {
                      m$a tb = this.b;
                      int i = tb.v + liveLiteFeed.mFeeds.size();
                      tb.v = i;
                   }
                   LiveLiteRecommendPanelItemType mType = LiveLiteRecommendPanelItemType.Recommend.mType;
                   if (liveLiteFeed.mType == mType) {
                      this.b.u = mType;
                      uoa = 1;
                   }
                   uArrayList1.add(liveLiteReco);
                }
             }
          }else {
             LiveLiteRecommendPanelFeedResponse liveLiteReco1 = new LiveLiteRecommendPanelFeedResponse();
             liveLiteReco1.mLlsid = p0.mLlsid;
             liveLiteReco1.mCursor = p0.mCursor;
             uArrayList1.add(liveLiteReco1);
          }
          if (uoa != null) {
             p0 = this.b;
             p0.t.accept(Integer.valueOf(p0.v));
          }
          uArrayList = uArrayList1;
       }
       return uArrayList;
    }
}
