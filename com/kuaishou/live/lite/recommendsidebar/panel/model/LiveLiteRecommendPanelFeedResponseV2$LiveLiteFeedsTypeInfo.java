package com.kuaishou.live.lite.recommendsidebar.panel.model.LiveLiteRecommendPanelFeedResponseV2$LiveLiteFeedsTypeInfo;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class LiveLiteRecommendPanelFeedResponseV2$LiveLiteFeedsTypeInfo implements CursorResponse, Serializable, a	// class@000b07
{
    public ArrayList mFeeds;
    public String mHeaderTitle;
    public int mType;
    public static final long serialVersionUID = 0x9dd2ef47632c60c0;

    public void LiveLiteRecommendPanelFeedResponseV2$LiveLiteFeedsTypeInfo(){
       super();
    }
    public void afterDeserialize(){
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       return this.mFeeds;
    }
    public boolean hasMore(){
       return false;
    }
}
