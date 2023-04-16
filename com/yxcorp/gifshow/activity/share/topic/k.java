package com.yxcorp.gifshow.activity.share.topic.k;
import qvb.f;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import qvb.n0;
import com.yxcorp.gifshow.activity.share.topic.TopicHistoryV2Response;
import java.lang.Integer;
import wkd.b;
import fx8.h;
import java.util.Objects;
import java.util.Map;
import com.yxcorp.gifshow.retrofit.service.KwaiShareTopicApiService;
import fx8.o0;
import erd.o;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public class k extends f	// class@001483
{
    public String p;
    public ShareTopicExtra q;
    public boolean r;

    public void k(ShareTopicExtra p0){
       super();
       this.r = a.t().d("disableTagSearchOptimization", true);
       this.q = p0;
    }
    public t I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       Object[] objArray = null;
       String str = "3";
       String obj = PatchProxy.apply(objArray, this, ok, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.x(this.p)) {
          return objArray;
       }
       t ot = PatchProxy.apply(objArray, this, ok, "4");
       if (ot != patchProxyRe) {
       }else {
          HashMap hashMap = new HashMap();
          int i = (!this.K() && this.L0() != null)? Integer.valueOf(this.L0().getCursor()).intValue(): 0;
          hashMap.put("page", Integer.valueOf(i));
          hashMap.put("keyword", this.p);
          obj = "";
          String sessionId = (!this.K() && this.L0() != null)? this.L0().getSessionId(): obj;
          hashMap.put("ussid", sessionId);
          k tq = this.q;
          if (tq != null && tq.getExtraParams() != null) {
             obj = this.q.getExtraParams();
          }
          hashMap.put("extParams", obj);
          h oh = b.a(-1055211774);
          Objects.requireNonNull(oh);
          t ot1 = PatchProxy.applyOneRefs(hashMap, oh, h.class, str);
          if (ot1 != patchProxyRe) {
          }else {
             ot1 = oh.a.searchTopic(hashMap);
          }
          ot = ot1.flatMap(new o0(this));
       }
       return ot;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("TopicSearchPageList", "refresh: enableOptimization="+this.r, objArray);
       if (this.r != null) {
          super.a();
          return;
       }else if(this.isLoading()){
          this.p0();
       }
       this.invalidate();
       this.load();
       return;
    }
}
