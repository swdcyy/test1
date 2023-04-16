package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c0;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import java.util.Objects;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$UnSupportReason;
import java.lang.CharSequence;
import e17.i;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.utility.TextUtils;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.HashMap;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupInfo;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;
import java.util.Map;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;

public final class KSDataManager$c0 implements o	// class@001a14
{
    public final KSDataManager b;
    public final Ref$ObjectRef c;
    public final String d;
    public final Ref$ObjectRef e;

    public void KSDataManager$c0(KSDataManager p0,Ref$ObjectRef p1,String p2,Ref$ObjectRef p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       KSTemplateFeedListResponse mCursor;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSDataManager$c0 obj = PatchProxy.applyOneRefs(p0, this, KSDataManager$c0.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "feedResponseWrapper");
          obj = this.b;
          Ref$ObjectRef element = this.c.element;
          KSTemplateFeedListResponse kSTemplateFe = p0.a();
          Objects.requireNonNull(obj);
          KSDataManager$d obj1 = PatchProxy.applyTwoRefs(element, kSTemplateFe, obj, KSDataManager.class, "13");
          int i = 0;
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             KSDataManager$b uob = new KSDataManager$b(obj);
             uob.b(kSTemplateFe);
             if (element != null && kSTemplateFe != null) {
                KSFeedTemplateDetailInfo mUnSupportRe = element.mUnSupportReason;
                boolean b = true;
                if (mUnSupportRe != null && mUnSupportRe.isOffline() == b) {
                   KSFeedTemplateDetailInfo mUnSupportRe1 = element.mUnSupportReason;
                   a.o(mUnSupportRe1, "target.mUnSupportReason");
                   i.d(R.style.arg_RES_7f11066a, mUnSupportRe1.getReasonContent());
                   uob.b = b;
                }else {
                   Iterator iterator1 = kSTemplateFe.mTemplateList.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         KSFeedTemplateDetailInfo kSFeedTempla1 = iterator1.next();
                         if (TextUtils.n(kSFeedTempla1.mId, element.mId)) {
                            kSFeedTempla1.mUnSupportReason = element.mUnSupportReason;
                            i1 = 1;
                         }
                      }else {
                         i1 = 0;
                      }
                      if (!i1) {
                         kSTemplateFe.mTemplateList.add(i, element);
                      }
                      uob.a = i1 ^ b;
                      uob.b(kSTemplateFe);
                   }
                }
             }
             obj = uob;
          }
          KSTemplateFeedListResponse kSTemplateFe1 = obj.a();
          if (kSTemplateFe1 != null) {
             Iterator iterator = kSTemplateFe1.mTemplateList.iterator();
          label_009e :
             if (iterator.hasNext()) {
                KSFeedTemplateDetailInfo kSFeedTempla = iterator.next();
                if (!TextUtils.n(kSFeedTempla.mGroupId, this.e.element)) {
                   Object[] objArray = new Object[i];
                   e.D().w("KSDataManager", "template "+kSFeedTempla.mId+" group id updated from "+kSFeedTempla.mGroupId+" to "+this.e.element, objArray);
                   kSFeedTempla.mGroupId = this.e.element;
                   goto label_009e ;
                }else {
                   goto label_009e ;
                }
             }else if(!p0.b()){
                if (!this.b.h.containsKey(this.e.element)) {
                   if (!TextUtils.x(this.e.element) && !TextUtils.x(kSTemplateFe1.mCursor)) {
                      p0 = new KSFeedGroupInfo();
                      p0.mId = this.e.element;
                      obj1 = new KSDataManager$d(this.b, p0);
                      p0 = kSTemplateFe1.mCursor;
                      a.o(p0, "response.mCursor");
                      kSTemplateFe1 = kSTemplateFe1.mTemplateList;
                      a.o(kSTemplateFe1, "response.mTemplateList");
                      obj1.j(p0, kSTemplateFe1);
                      this.b.h.put(this.e.element, obj1);
                   }
                }else {
                   p0 = this.b.h.get(this.e.element);
                   if (p0 != null) {
                      mCursor = kSTemplateFe1.mCursor;
                      a.o(mCursor, "response.mCursor");
                      kSTemplateFe1 = kSTemplateFe1.mTemplateList;
                      a.o(kSTemplateFe1, "response.mTemplateList");
                      p0.j(mCursor, kSTemplateFe1);
                   }
                }
             }
          }else {
             throw new KSException(-12, "response is "+"null, no result for template: "+this.d);
          }
       }
       return obj;
    }
}
