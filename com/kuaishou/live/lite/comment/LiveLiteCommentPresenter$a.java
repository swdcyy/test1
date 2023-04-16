package com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$a;
import f93.c;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter;
import java.lang.Object;
import f93.e;
import java.lang.String;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.a;
import ip3.a;
import com.kuaishou.live.service.ServiceProvider;
import f93.a;

public final class LiveLiteCommentPresenter$a implements c	// class@0007e5
{
    public final LiveLiteCommentPresenter a;

    public void LiveLiteCommentPresenter$a(LiveLiteCommentPresenter p0){
       this.a = p0;
       super();
    }
    public void a(e p0,String p1,String p2,long p3,long p4,long p5,l p6,String p7){
       LiveLiteCommentPresenter$a uoa = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p6;
       LiveLiteCommentPresenter$a uoa1 = LiveLiteCommentPresenter$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Long.valueOf(p3),Long.valueOf(p4),Long.valueOf(p5),oobject3,p7};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "2")) {
             return;
          }
       }
       a.p(p0, "areaData");
       a.p(p1, "messageId");
       a.p(oobject2, "commonGuideSubBizType");
       a.p(oobject3, "subBizFrequencyConsumer");
       c uoc = uoa.a.C.a().get();
       if (uoc != null) {
          uoc.a(p0, p1, p2, p3, p4, p5, p6, p7);
       }
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommentPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "creator");
       c uoc = this.a.C.a().get();
       if (uoc != null) {
          uoc.b(p0);
       }
       return;
    }
}
