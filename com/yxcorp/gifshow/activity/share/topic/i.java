package com.yxcorp.gifshow.activity.share.topic.i;
import qvb.f;
import fx8.a0;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import fx8.g0;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.activity.share.topic.g;
import erd.o;
import fx8.f0;
import java.lang.Boolean;
import fx8.e0;
import lq.i;
import lq.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import fx8.y;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Objects;
import lnc.i3;
import java.lang.CharSequence;
import android.text.TextUtils;
import zsd.u;
import com.yxcorp.gifshow.model.config.FrameUpload;
import java.lang.reflect.Type;
import oa0.a;
import flb.f;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;
import com.kuaishou.edit.draft.Workspace$Source;
import q2b.h$b;
import k2b.u1;
import com.yxcorp.gifshow.activity.share.topic.f;
import com.yxcorp.gifshow.model.topic.HotRecommendResponse;
import okhttp3.Response$Builder;
import okhttp3.Protocol;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.p;
import wkd.b;
import fx8.h;
import cq.a;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.activity.share.topic.b;
import io.reactivex.g;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.activity.share.topic.d;
import erd.g;
import fx8.d;
import erd.a;
import com.kwai.component.fansgroup.chat.a;
import fx8.e;
import java.util.Map;
import java.util.Collections;
import frd.a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.i;
import ird.a;
import com.yxcorp.gifshow.activity.share.topic.c;
import fx8.d0;
import com.yxcorp.gifshow.activity.share.topic.h;
import fx8.c0;
import brd.w;
import erd.c;
import java.util.List;
import com.kuaishou.android.post.topic.model.TopicCollectionsResponse;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.android.model.mix.TagItem;
import com.yxcorp.gifshow.model.topic.RecommendItem;
import com.yxcorp.gifshow.model.topic.RecommendItem$Tag;
import com.kuaishou.android.post.topic.model.TopicItem;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import java.lang.Math;
import com.yxcorp.gifshow.model.topic.TopicIcon;
import fx8.s;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.TagStickerParam;
import fx8.h0;
import fx8.b0;
import im8.f;
import ekd.q$b;

public class i extends f	// class@001480
{
    public final a0 p;
    public c q;
    public static final int r;

    public void i(a0 p0){
       super();
       this.q = null;
       this.p = p0;
    }
    public t I1(){
       boolean i;
       boolean b;
       Object[] objArray2;
       a0 a;
       i q1;
       Object obj2;
       t ot2;
       boolean i2;
       c uoc = this;
       i oi = i.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, uoc, oi, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       i = 0;
       Object[] objArray1 = new Object[i];
       a.b().w("TopicGuidePageList", "onCreateRequest editSession: "+uoc.p.a()+"maxNum: "+uoc.p.c()+"recommend index: "+uoc.p.d(), objArray1);
       obj = t.fromCallable(new g0(uoc)).flatMap(g.b).map(new f0(uoc));
       String str = "3";
       String obj1 = PatchProxy.apply(objArray, uoc, oi, str);
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(uoc.p.d() <= uoc.p.c()){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          objArray2 = new Object[i];
          a.b().w("TopicGuidePageList", "not need request recommend tag", objArray2);
          return obj.map(new e0(uoc));
       }else if(i.h()){
          uoc.q = i.m().p().l();
       }
       obj1 = uoc.p.a();
       i q = uoc.q;
       a0 f = uoc.p.f;
       i oi1 = q;
       a0 uoa0 = f;
       a0 uoa01 = f;
       i oi2 = q;
       if (!PatchProxy.applyVoidThreeRefs(obj1, oi1, uoa0, null, y.class, "1")) {
          a.p(uoa01, "sharePageFrom");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "EXTRACT_FRAME_FAIL";
          y a1 = y.a;
          Objects.requireNonNull(a1);
          y oy = y.class;
          y oy1 = a1;
          ClientEvent$ElementPackage uElementPack1 = uElementPack;
          String str2 = "EXTRACT_FRAME_FAIL";
          String str3 = PatchProxy.applyThreeRefs(obj1, oi2, uoa01, oy1, y.class, "2");
          if (str3 != patchProxyRe) {
          }else {
             i3 oi3 = i3.f();
             oi3.d("editSessionId", obj1);
             if (!TextUtils.isEmpty(obj1)) {
                q1 = oi2;
                i2 = 0;
             }else {
                a1 = oy1;
                obj2 = PatchProxy.applyOneRefs(uoa01, a1, oy, "6");
                i = (obj2 != patchProxyRe)? obj2.booleanValue(): u.I1("FEED_PAGE", uoa01, 1);
                if (i) {
                   q1 = oi2;
                   i2 = 5;
                }else {
                   FrameUpload obj3 = PatchProxy.apply(null, a1, oy, "5");
                   if (obj3 != patchProxyRe) {
                      i = obj3.booleanValue();
                   }else {
                      obj3 = a.D(FrameUpload.class);
                      i = (obj3 != null && (obj3.mBatchSize > null && (obj3.mInterval <= null || obj3.mMaxFrameCount <= null)))? true: false;
                   }
                   if (i) {
                      i2 = 2;
                      q1 = oi2;
                   }else {
                      q1 = oi2;
                      obj2 = (q1 == null)? 1: null;
                      if (obj2) {
                         i2 = 4;
                      }else {
                         a.m(q1);
                         Object obj4 = PatchProxy.applyOneRefs(q1, a1, oy, str);
                         i2 = (obj4 != patchProxyRe)? obj4.booleanValue(): DraftFileManager.E().H(q1).exists();
                         if (i2) {
                            i2 = 3;
                         }else {
                            i2 = 6;
                         }
                      }
                   }
                }
             }
             oi3.c("errorCode", Integer.valueOf(i2));
             if (q1 != null) {
                Workspace$Type type = q1.a1();
                if (type == null) {
                   type = Workspace$Type.UNKNOWN;
                }
                oi3.c("type", Integer.valueOf(type.ordinal()));
                Workspace$Source source = q1.T0();
                if (source == null) {
                   source = Workspace$Source.UNRECOGNIZED;
                }
                oi3.c("source", Integer.valueOf(source.ordinal()));
             }
             str3 = oi3.e();
             a.o(str3, "jsonObject.build\(\)");
          }
          ClientEvent$ElementPackage uElementPack2 = uElementPack1;
          uElementPack2.params = str3;
          h$b uob = h$b.e(10, str2);
          uob.k(uElementPack2);
          u1.r0(uob);
       }
       t ot = obj.map(f.b);
       t ot1 = PatchProxy.apply(null, uoc, oi, "2");
       if (ot1 != patchProxyRe) {
       }else if(uoc.p.b() != null){
          objArray2 = new Object[0];
          a.b().w("TopicGuidePageList", "getRecommendResponse:  use cache", objArray2);
          ot1 = t.just(p.h(uoc.p.b(), new Response$Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request$Builder().url("http://localhost/").build()).build()));
       }else {
          h oh = b.a(-1055211774);
          String str1 = uoc.p.a();
          a = uoc.p.a;
          q1 = uoc.q;
          Objects.requireNonNull(oh);
          obj2 = PatchProxy.applyThreeRefs(str1, a, q1, oh, h.class, "1");
          if (obj2 != patchProxyRe) {
             ot1 = obj2;
          }else if(oh.b != null){
             Object[] objArray3 = new Object[0];
             a.D().w("ShareTopicApi", "hit hotRecommendObservable cache", objArray3);
             oh = oh.b;
          }else if(TextUtils.x(str1) && q1 != null){
             int i1 = a.t().a("frameCollectTimeoutInPublish", 5);
             if (i1 <= 0) {
                i1 = Integer.MAX_VALUE;
             }
             ot2 = t.create(new b(q1)).timeout((long)i1, TimeUnit.SECONDS).doOnError(d.b).doFinally(new d(q1)).onErrorReturn(a.b).flatMap(new e(oh, a, q1));
          }else if(a == null){
             a = Collections.emptyMap();
          }
          ot2 = oh.a(str1, a, q1);
          a uoa = ot2.replay();
          Objects.requireNonNull(uoa);
          ot2 = a.h(new i(uoa, 1, Functions.d())).doFinally(new c(oh));
          oh.b = ot2;
          ot1 = ot2;
       }
       return t.zip(ot, ot1.map(new d0(uoc)).onErrorReturn(h.b), new c0(uoc));
    }
    public final TopicCollectionsResponse h2(List p0,List p1){
       Object[] objArray;
       int b;
       int i;
       String str1;
       Object obj = this;
       TopicCollectionsResponse obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       ArrayList obj2 = PatchProxy.applyTwoRefs(p0, obj1, obj, oi, "4");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = new ArrayList();
       if (!q.f(p0)) {
          objArray = new Object[0];
          a.b().w("TopicGuidePageList", "transformTopicData topicHistoryResponse size: "+p0.size(), objArray);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             TagItem tagItem = iterator.next();
             TagItem mName = tagItem.mName;
             TopicItem obj3 = PatchProxy.applyTwoRefs(obj1, mName, obj, oi, "5");
             if (obj3 != patchProxyRe) {
                b = obj3.booleanValue();
             }else if(q.f(p1)){
                Iterator iterator1 = p1.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if (mName.equals(iterator1.next().getTag().getName())) {
                         Object[] objArray1 = new Object[0];
                         a.b().w("TopicGuidePageList", mName+" is ths same with recommend", objArray1);
                         b = true;
                         break ;
                      }
                   }
                }
             }
             b = false;
             if (!b) {
                obj3 = new TopicItem(tagItem.mName, 0, TopicItemType.HISTORY, tagItem.mKsOrderId, "", 0);
                obj2.add(b);
             }
          }
       }
       if (!q.f(p1)) {
          Object[] objArray2 = new Object[0];
          a.b().w("TopicGuidePageList", "transformTopicData hotRecommendResponse size: "+p1.size(), objArray2);
          for (i = 0; i < p1.size(); i = i + 1) {
             if (obj2.size() >= obj.p.c()) {
                int i1 = obj2.size() - 1;
                obj2.remove(i1);
             }
             RecommendItem recommendIte = obj1.get(i);
             b = obj.p.d() + i;
             b = b - 1;
             b = Math.max(Math.min(b, obj2.size()), 0);
             Object[] objArray3 = new Object[0];
             a.b().w("TopicGuidePageList", "add recommend index: "+b, objArray3);
             TopicItem topicItem = new TopicItem(recommendIte.getTag().getName(), recommendIte.getTag().getId(), TopicItemType.RECOMMEND, recommendIte.getTag().getKsOrderId(), recommendIte.getTag().getSpecialId(), recommendIte.getTag().getType());
             objArray.setTopicIcon(recommendIte.getTopicIcon());
             objArray.setLeftIcon(recommendIte.getLeftIcon());
             objArray.setViewCount(recommendIte.getViewCount());
             obj2.add(b, objArray);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj2, obj, oi, "6") && i.h()) {
          String str = PatchProxy.apply(null, null, s.class, "10");
          if (str != patchProxyRe) {
          }else {
             c uoc = i.m().p().l();
             if (uoc != null && uoc.U0() != null) {
                Iterator iterator2 = uoc.U0().z().iterator();
                while (true) {
                   if (iterator2.hasNext()) {
                      String text = iterator2.next().getTagStickerParam().getText();
                      if (!text.isEmpty()) {
                         str1 = text;
                         break ;
                      }
                   }
                }
                if (!str1.isEmpty()) {
                   h0 oh0 = new h0(obj);
                   q.c(obj2, new b0(str1, oh0));
                   if (oh0.get() != null) {
                      obj2.add(0, oh0.get());
                   }else {
                      TopicItem topicItem1 = new TopicItem(str1, 0, TopicItemType.TAG_STICKER, "", "", 0);
                      obj2.add(0, oh0);
                   }
                }
             }
             str = "";
          }
          str1 = str;
          goto label_01db ;
       }
    label_0210 :
       Object[] objArray4 = new Object[0];
       a.b().w("TopicGuidePageList", "transformTopicData all topic size: "+obj2.size(), objArray4);
       obj1 = new TopicCollectionsResponse();
       obj1.setTopicItemList(obj2);
       return obj1;
    }
}
