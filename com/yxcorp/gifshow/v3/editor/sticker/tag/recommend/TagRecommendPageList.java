package com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList;
import qvb.f;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$a;
import nsd.u;
import java.lang.String;
import z1.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$recommendIndex$2;
import msd.a;
import qrd.p;
import qrd.s;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.util.HashMap;
import wkd.b;
import utc.b;
import java.util.Map;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$b;
import erd.o;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$e;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$f;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$g;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$d;
import com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$c;
import brd.w;
import erd.c;
import qvb.n0$a;
import qvb.n0;
import com.kuaishou.android.post.topic.model.TopicCollectionsResponse;
import java.lang.Number;

public final class TagRecommendPageList extends f	// class@0012bf
{
    public final p p;
    public String q;
    public TopicCollectionsResponse r;
    public final String s;
    public final a t;
    public static final TagRecommendPageList$a u;

    static {
       TagRecommendPageList.u = new TagRecommendPageList$a(null);
    }
    public void TagRecommendPageList(String p0,a p1){
       a.p(p0, "editSessionId");
       a.p(p1, "dataConsumer");
       super();
       this.s = p0;
       this.t = p1;
       this.p = s.c(TagRecommendPageList$recommendIndex$2.INSTANCE);
       this.q = "";
    }
    public t I1(){
       HashMap obj = PatchProxy.apply(null, this, TagRecommendPageList.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.q.length() > 0)? 1: null;
       int i = -1403118682;
       if (obj) {
          obj = new HashMap();
          obj.put("keyword", this.q);
          return b.a(i).searchTopic(obj).subscribeOn(d.b).observeOn(d.a).map(new TagRecommendPageList$b(this));
       }else {
          return t.zip(t.fromCallable(TagRecommendPageList$e.b).flatMap(TagRecommendPageList$f.b).map(TagRecommendPageList$g.b), b.a(i).a(this.s).subscribeOn(d.b).observeOn(d.a).map(TagRecommendPageList$d.b), new TagRecommendPageList$c(this));
       }
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TagRecommendPageList.class, "3")) {
          return;
       }
       super.K1(p0);
       if (p0 != null) {
          TopicCollectionsResponse topicCollect = p0.a();
          if (topicCollect != null) {
             this.t.accept(topicCollect);
          }
       }
       return;
    }
    public final int h2(){
       Object obj = PatchProxy.apply(null, this, TagRecommendPageList.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.p.getValue();
       }
       return obj.intValue();
    }
}
