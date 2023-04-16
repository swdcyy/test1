package com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$c;
import erd.c;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.post.topic.model.TopicCollectionsResponse;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.post.topic.model.TopicItem;
import java.lang.Boolean;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class TagRecommendPageList$c implements c	// class@0012b9
{
    public final TagRecommendPageList a;

    public void TagRecommendPageList$c(TagRecommendPageList p0){
       this.a = p0;
       super();
    }
    public Object a(Object p0,Object p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TagRecommendPageList$c obj = PatchProxy.applyTwoRefs(p0, p1, this, TagRecommendPageList$c.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "history");
          a.p(p1, "recommend");
          obj = this.a;
          Objects.requireNonNull(obj);
          TagRecommendPageList tagRecommend = TagRecommendPageList.class;
          TopicCollectionsResponse topicCollect = PatchProxy.applyTwoRefs(p0, p1, obj, tagRecommend, "5");
          if (topicCollect != patchProxyRe) {
          }else {
             topicCollect = new TopicCollectionsResponse();
             ArrayList uArrayList = new ArrayList();
             if (p0 != null) {
                uArrayList.addAll(p0);
             }
             if (p1 != null) {
                ArrayList uArrayList1 = new ArrayList();
                p1 = p1.iterator();
                while (p1.hasNext()) {
                   Object obj1 = p1.next();
                   Object obj2 = obj1;
                   Iterator obj3 = PatchProxy.applyTwoRefs(p0, obj2, obj, tagRecommend, "7");
                   if (obj3 != patchProxyRe) {
                      b = obj3.booleanValue();
                   }else if(p0 != null){
                      obj3 = p0.iterator();
                      while (true) {
                         if (obj3.hasNext()) {
                            if (a.g(obj3.next().getKeyWorld(), obj2.getKeyWorld())) {
                               b = false;
                            }
                         }
                      }
                   }
                   b = true;
                   if (b) {
                      uArrayList1.add(obj1);
                   }else {
                      continue ;
                   }
                }
                if (obj.h2() >= 0 && obj.h2() < uArrayList.size()) {
                   uArrayList.addAll(obj.h2(), uArrayList1);
                }else {
                   uArrayList.addAll(uArrayList1);
                }
             }
             p0 = new ArrayList();
             p1 = uArrayList.iterator();
             int i = 0;
             while (p1.hasNext()) {
                Object obj4 = p1.next();
                int i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                i = (i < 20)? 1: 0;
                if (i) {
                   p0.add(obj4);
                }
                i = i1;
             }
             topicCollect.setTopicItemList(uArrayList);
             if (obj.r == null) {
                obj.r = topicCollect;
             }
          }
          obj = topicCollect;
       }
       return obj;
    }
}
