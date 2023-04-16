package com.yxcorp.gifshow.model.topic.TopicItemType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TopicItemType extends Enum	// class@001fa8
{
    public final int mValue;
    public static final TopicItemType[] $VALUES;
    public static final TopicItemType HISTORY;
    public static final TopicItemType RECOMMEND;
    public static final TopicItemType RECOMMEND_TITLE;
    public static final TopicItemType SEARCH_RESULT;
    public static final TopicItemType SEARCH_RESULT_PLACE_HOLDER;
    public static final TopicItemType SEARCH_RESULT_TIPS;
    public static final TopicItemType TAG_STICKER;

    static {
       TopicItemType topicItemTyp = new TopicItemType("HISTORY", 0, 0);
       TopicItemType.HISTORY = topicItemTyp;
       TopicItemType topicItemTyp1 = new TopicItemType("RECOMMEND_TITLE", 1, 1);
       TopicItemType.RECOMMEND_TITLE = topicItemTyp1;
       TopicItemType topicItemTyp2 = new TopicItemType("RECOMMEND", 2, 2);
       TopicItemType.RECOMMEND = topicItemTyp2;
       TopicItemType topicItemTyp3 = new TopicItemType("SEARCH_RESULT", 3, 3);
       TopicItemType.SEARCH_RESULT = topicItemTyp3;
       TopicItemType topicItemTyp4 = new TopicItemType("SEARCH_RESULT_PLACE_HOLDER", 4, 4);
       TopicItemType.SEARCH_RESULT_PLACE_HOLDER = topicItemTyp4;
       TopicItemType topicItemTyp5 = new TopicItemType("SEARCH_RESULT_TIPS", 5, 5);
       TopicItemType.SEARCH_RESULT_TIPS = topicItemTyp5;
       TopicItemType topicItemTyp6 = new TopicItemType("TAG_STICKER", 6, 6);
       TopicItemType.TAG_STICKER = topicItemTyp6;
       TopicItemType[] topicItemTyp7 = new TopicItemType[]{topicItemTyp,topicItemTyp1,topicItemTyp2,topicItemTyp3,topicItemTyp4,topicItemTyp5,topicItemTyp6};
       TopicItemType.$VALUES = topicItemTyp7;
    }
    public void TopicItemType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static TopicItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TopicItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TopicItemType.class, p0);
    }
    public static TopicItemType[] values(){
       Object obj = PatchProxy.apply(null, null, TopicItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TopicItemType.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
}
