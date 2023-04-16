package com.yxcorp.gifshow.model.topic.TopicSearchResultItem;
import com.yxcorp.gifshow.model.topic.RecommendItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.model.topic.RecommendItem$Tag;
import com.yxcorp.gifshow.model.topic.TopicItemType;

public class TopicSearchResultItem extends RecommendItem	// class@001faa
{
    public static final long serialVersionUID = 0x522fcfb830a55157;

    public void TopicSearchResultItem(){
       super();
    }
    public int getItemType(){
       Object obj = PatchProxy.apply(null, this, TopicSearchResultItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int value = (this.getTag().getMarkedWorthless())? TopicItemType.SEARCH_RESULT_TIPS.getValue(): TopicItemType.SEARCH_RESULT.getValue();
       return value;
    }
}
