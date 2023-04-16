package com.yxcorp.gifshow.ad.detail.presenter.ad.postback.SlideAdPostbackPresenter$mAdGapInfoListener$2$a;
import m09.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.postback.SlideAdPostbackPresenter$mAdGapInfoListener$2;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import org.json.JSONObject;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.postback.SlideAdPostbackPresenter;
import com.yxcorp.gifshow.entity.QPhoto;
import m09.c;
import java.util.concurrent.ConcurrentHashMap;
import m09.b;
import java.lang.System;
import java.util.List;
import java.lang.Integer;
import java.util.Map;

public final class SlideAdPostbackPresenter$mAdGapInfoListener$2$a implements a	// class@00160f
{
    public final SlideAdPostbackPresenter$mAdGapInfoListener$2 a;

    public void SlideAdPostbackPresenter$mAdGapInfoListener$2$a(SlideAdPostbackPresenter$mAdGapInfoListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(BaseFeed p0,JSONObject p1,c p2){
       String id;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SlideAdPostbackPresenter$mAdGapInfoListener$2$a.class, "1")) {
          return;
       }
       String str = "feed";
       a.p(p0, str);
       String str1 = "clientAdLog";
       a.p(p2, str1);
       SlideAdPostbackPresenter p = this.a.this$0.p;
       if (p == null) {
          a.S("mPhoto");
       }
       if (a.g(p0, p.getEntity()) && !PatchProxy.applyVoidThreeRefs(p2, p1, p0, null, c.class, "2")) {
          a.p(p2, str1);
          a.p(p0, str);
          p2 = p2.a;
          long l = (p2 == 160 && p1 != null)? p1.optLong("played_duration"): 0;
          ConcurrentHashMap b = c.b;
          b uob = b.get(p0.getId());
          if (uob == null) {
             uob = new b();
             uob.b = System.currentTimeMillis();
             uob.a().add(Integer.valueOf(p2));
             id = p0.getId();
             a.o(id, "feed.id");
             b.put(id, uob);
          }
          a.o(uob, "sAdLogBehaviorRecord[fee¡­d[feed.id] = this\n      }");
          if (p2 == 160) {
             if (!uob.c()) {
                uob.d = l;
             }
          }else if(!uob.a().contains(Integer.valueOf(p2))){
             uob.a().add(Integer.valueOf(p2));
          }
       }
    label_00b6 :
       return;
    }
}
