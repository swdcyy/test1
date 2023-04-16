package com.kuaishou.live.lite.recommendsidebar.panel.model.LiveLiteRecommendPanelFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LiveLiteRecommendPanelFeedResponse implements CursorResponse, Serializable, a	// class@000b06
{
    public String mCursor;
    public ArrayList mFeeds;
    public String mLlsid;
    public String mTitle;
    public static final long serialVersionUID = 0x21077000a668e1cb;

    public void LiveLiteRecommendPanelFeedResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecommendPanelFeedResponse.class, "2")) {
          return;
       }
       if (!q.f(this.mFeeds)) {
          Iterator iterator = this.mFeeds.iterator();
          while (iterator.hasNext()) {
             iterator.next().setListLoadSequenceID(this.mLlsid);
          }
       }
       return;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mFeeds;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecommendPanelFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
