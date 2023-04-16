package com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$b;
import erd.o;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList;
import java.lang.Object;
import retrofit2.p;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.post.topic.model.TopicCollectionsResponse;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.topic.TopicSearchResponse;
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.model.topic.RecommendItem;
import com.kuaishou.android.post.topic.model.TopicItem;
import com.yxcorp.gifshow.model.topic.RecommendItem$Tag;
import com.yxcorp.gifshow.model.topic.TopicItemType;

public final class TagRecommendPageList$b implements o	// class@0012b8
{
    public final TagRecommendPageList b;

    public void TagRecommendPageList$b(TagRecommendPageList p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TagRecommendPageList$b obj = PatchProxy.applyOneRefs(p0, this, TagRecommendPageList$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          obj = this.b;
          p0 = p0.a();
          p0 = (p0 != null)? p0.getItems(): null;
          Objects.requireNonNull(obj);
          obj = PatchProxy.applyOneRefs(p0, obj, TagRecommendPageList.class, "6");
          if (obj != patchProxyRe) {
          }else {
             TopicCollectionsResponse topicCollect = new TopicCollectionsResponse();
             TopicCollectionsResponse topicCollect1 = (p0 == null || p0.isEmpty())? 1: null;
             if (!topicCollect1) {
                ArrayList uArrayList = new ArrayList();
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   RecommendItem recommendIte = p0.next();
                   RecommendItem$Tag tag = recommendIte.getTag();
                   a.o(tag, "it.tag");
                   String name = tag.getName();
                   a.o(name, "it.tag.name");
                   tag = recommendIte.getTag();
                   a.o(tag, "it.tag");
                   int id = tag.getId();
                   tag = recommendIte.getTag();
                   a.o(tag, "it.tag");
                   String specialId = tag.getSpecialId();
                   RecommendItem$Tag tag1 = recommendIte.getTag();
                   a.o(tag1, "it.tag");
                   int type = tag1.getType();
                   String str = name;
                   int i = id;
                   TopicItem topicItem = new TopicItem(str, i, TopicItemType.SEARCH_RESULT, "", specialId, type);
                   uArrayList.add(v10);
                }
                topicCollect.setTopicItemList(uArrayList);
             }
             topicCollect1 = topicCollect;
          }
       }
       return obj;
    }
}
