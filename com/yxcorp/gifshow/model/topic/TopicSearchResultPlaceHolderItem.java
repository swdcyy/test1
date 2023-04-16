package com.yxcorp.gifshow.model.topic.TopicSearchResultPlaceHolderItem;
import com.yxcorp.gifshow.model.topic.TopicSearchResultItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.model.topic.TopicItemType;

public class TopicSearchResultPlaceHolderItem extends TopicSearchResultItem	// class@001fab
{
    public static final long serialVersionUID = 0xc461cef1df730773;

    public void TopicSearchResultPlaceHolderItem(){
       super();
    }
    public int getItemType(){
       Object obj = PatchProxy.apply(null, this, TopicSearchResultPlaceHolderItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TopicItemType.SEARCH_RESULT_PLACE_HOLDER.getValue();
    }
}
