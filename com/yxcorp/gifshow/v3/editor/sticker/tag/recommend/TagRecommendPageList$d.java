package com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$d;
import erd.o;
import java.lang.Object;
import retrofit2.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.topic.HotRecommendResponse;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.model.topic.RecommendItem;
import com.kuaishou.android.post.topic.model.TopicItem;
import com.yxcorp.gifshow.model.topic.RecommendItem$Tag;
import com.yxcorp.gifshow.model.topic.TopicItemType;

public final class TagRecommendPageList$d implements o	// class@0012ba
{
    public static final TagRecommendPageList$d b;

    static {
       TagRecommendPageList$d.b = new TagRecommendPageList$d();
    }
    public void TagRecommendPageList$d(){
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, TagRecommendPageList$d.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p0.a();
          if (p0 != null) {
             p0 = p0.getItems();
             if (p0 != null) {
                uArrayList = new ArrayList(u.Y(p0, 10));
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   RecommendItem recommendIte = p0.next();
                   a.o(recommendIte, "item");
                   RecommendItem$Tag tag = recommendIte.getTag();
                   a.o(tag, "item.tag");
                   String name = tag.getName();
                   a.o(name, "item.tag.name");
                   tag = recommendIte.getTag();
                   a.o(tag, "item.tag");
                   int id = tag.getId();
                   tag = recommendIte.getTag();
                   a.o(tag, "item.tag");
                   String specialId = tag.getSpecialId();
                   RecommendItem$Tag tag1 = recommendIte.getTag();
                   a.o(tag1, "item.tag");
                   int type = tag1.getType();
                   String str = name;
                   int i = id;
                   TopicItem topicItem = new TopicItem(str, i, TopicItemType.RECOMMEND, "", specialId, type);
                   uArrayList.add(v9);
                }
             }
          }
          uArrayList = null;
       }
       return uArrayList;
    }
}
