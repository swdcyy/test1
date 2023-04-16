package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$f0;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import brd.t;
import java.util.Collection;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.feed.f;

public final class KSDataManager$f0 implements o	// class@001a1a
{
    public final KSDataManager b;
    public final String c;
    public final boolean d;
    public final Ref$ObjectRef e;
    public final Ref$ObjectRef f;

    public void KSDataManager$f0(KSDataManager p0,String p1,boolean p2,Ref$ObjectRef p3,Ref$ObjectRef p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public Object apply(Object p0){
       KSDataManager$f0 tf;
       KSFeedTemplateDetailInfo mGroupId;
       t ot = PatchProxy.applyOneRefs(p0, this, KSDataManager$f0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "templates");
          int i = 1;
          int i1 = TextUtils.x(this.c) ^ i;
          if (p0.isEmpty() && !i1) {
             p0 = t.just(new KSDataManager$c(this.b, new KSTemplateFeedListResponse(), false));
          }else {
             String str = "templates[0].mGroupId";
             if (this.d != null) {
                if (p0.isEmpty() ^ i) {
                   this.e.element = p0.get(false);
                   tf = this.f;
                   KSDataManager$f0 tc = this.c;
                   if (tc == null || TextUtils.x(tc)) {
                      mGroupId = p0.get(false).mGroupId;
                      a.o(mGroupId, str);
                   }else {
                      mGroupId = this.c;
                   }
                   tf.element = mGroupId;
                }
                KSTemplateFeedListResponse kSTemplateFe = new KSTemplateFeedListResponse();
                kSTemplateFe.mTemplateList = p0;
                kSTemplateFe.mCursor = "no_more";
                p0 = t.just(new KSDataManager$c(this.b, kSTemplateFe, false));
             }else if(p0.isEmpty() ^ i){
                this.e.element = p0.get(false);
                tf = this.f;
                KSDataManager$f0 tc1 = this.c;
                if (tc1 == null || TextUtils.x(tc1)) {
                   p0 = p0.get(false).mGroupId;
                   a.o(p0, str);
                }else {
                   p0 = this.c;
                }
                tf.element = p0;
             }
             p0 = this.b.w0(this.f.element).switchIfEmpty(this.b.v(this.f.element, i).flatMap(new f(this)));
          }
          ot = p0;
       }
       return ot;
    }
}
