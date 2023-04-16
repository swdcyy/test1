package com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$g;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.utility.m$a;
import com.kuaishou.android.post.topic.model.TopicItem;
import com.yxcorp.gifshow.model.topic.TopicItemType;

public final class TagRecommendPageList$g implements o	// class@0012bd
{
    public static final TagRecommendPageList$g b;

    static {
       TagRecommendPageList$g.b = new TagRecommendPageList$g();
    }
    public void TagRecommendPageList$g(){
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, TagRecommendPageList$g.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uArrayList = new ArrayList(u.Y(p0, 10));
          p0 = p0.iterator();
          while (p0.hasNext()) {
             m$a uoa = p0.next();
             a.o(uoa, "item");
             String str = uoa.b();
             a.o(str, "item.value");
             TopicItem topicItem = new TopicItem(str, uoa.a(), TopicItemType.HISTORY, "", "", 0);
             uArrayList.add(v9);
          }
       }
       return uArrayList;
    }
}
