package com.yxcorp.gifshow.activity.share.topic.BaseShareTopicRecyclerFragment$ShareTopicPage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseShareTopicRecyclerFragment$ShareTopicPage extends Enum	// class@001463
{
    public final String mPageName;
    public static final BaseShareTopicRecyclerFragment$ShareTopicPage[] $VALUES;
    public static final BaseShareTopicRecyclerFragment$ShareTopicPage TOPIC_HISTORY;
    public static final BaseShareTopicRecyclerFragment$ShareTopicPage TOPIC_SEARCH;

    static {
       BaseShareTopicRecyclerFragment$ShareTopicPage shareTopicPa = new BaseShareTopicRecyclerFragment$ShareTopicPage("TOPIC_SEARCH", 0, "topicSearch");
       BaseShareTopicRecyclerFragment$ShareTopicPage.TOPIC_SEARCH = shareTopicPa;
       BaseShareTopicRecyclerFragment$ShareTopicPage shareTopicPa1 = new BaseShareTopicRecyclerFragment$ShareTopicPage("TOPIC_HISTORY", 1, "topicHistory");
       BaseShareTopicRecyclerFragment$ShareTopicPage.TOPIC_HISTORY = shareTopicPa1;
       BaseShareTopicRecyclerFragment$ShareTopicPage[] shareTopicPa2 = new BaseShareTopicRecyclerFragment$ShareTopicPage[]{shareTopicPa,shareTopicPa1};
       BaseShareTopicRecyclerFragment$ShareTopicPage.$VALUES = shareTopicPa2;
    }
    public void BaseShareTopicRecyclerFragment$ShareTopicPage(String p0,int p1,String p2){
       super(p0, p1);
       this.mPageName = p2;
    }
    public static BaseShareTopicRecyclerFragment$ShareTopicPage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BaseShareTopicRecyclerFragment$ShareTopicPage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BaseShareTopicRecyclerFragment$ShareTopicPage.class, p0);
    }
    public static BaseShareTopicRecyclerFragment$ShareTopicPage[] values(){
       Object obj = PatchProxy.apply(null, null, BaseShareTopicRecyclerFragment$ShareTopicPage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BaseShareTopicRecyclerFragment$ShareTopicPage.$VALUES.clone();
    }
}
