package com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$onCreate$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eq3.d;
import b93.d;
import mb3.d;
import z1.k;
import kotlin.jvm.internal.a;
import v51.a;
import hf3.a;
import xp5.i;
import qa3.b;
import e93.a;
import pg1.e;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import com.kuaishou.live.service.ServiceProvider;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteCommentPresenter$onCreate$3 extends Lambda implements a	// class@0007eb
{
    public final LiveLiteCommentPresenter this$0;

    public void LiveLiteCommentPresenter$onCreate$3(LiveLiteCommentPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteCommentPresenter$onCreate$3.class, "1")) {
          return;
       }
       d uod = this.this$0.P8();
       LiveLiteCommentPresenter obj = LiveLiteCommentPresenter.l9(this.this$0).get();
       a.o(obj, "longConnectionManager.get\(\)");
       a uoa = obj.u();
       a.o(uoa, "longConnectionManager.get\(\).liveLongConnection");
       obj = LiveLiteCommentPresenter.k9(this.this$0).get();
       a.o(obj, "liveLogPackageProvider.get\(\)");
       Object obj1 = obj;
       obj = LiveLiteCommentPresenter.d9(this.this$0).get();
       a.o(obj, "delayInfoManager.get\(\)");
       Object obj2 = obj;
       obj = LiveLiteCommentPresenter.c9(this.this$0).get();
       a.o(obj, "audienceInfoManager.get\(\)");
       Object obj3 = obj;
       obj = this.this$0.Q;
       if (obj == null) {
          a.S("followManager");
       }
       d obj4 = obj.get();
       a.o(obj4, "followManager.get\(\)");
       Object obj5 = obj4;
       obj4 = LiveLiteCommentPresenter.h9(this.this$0).get();
       a.o(obj4, "guidanceMessageQueueManager.get\(\)");
       Object obj6 = obj4;
       a uoa1 = this.this$0.y.a();
       a uoa2 = LiveLiteCommentPresenter.e9(this.this$0);
       a uoa3 = LiveLiteCommentPresenter.j9(this.this$0);
       LiveLiteCommentPresenter c1 = this.this$0.c1;
       if (c1 == null) {
          a.S("fansGroupJoinService");
       }
       LiveLiteCommentPresenter b1 = this.this$0.b1;
       if (b1 == null) {
          a.S("liteFansGroupService");
       }
       obj4 = new d(uoa, obj1, obj2, obj3, obj5, obj6, uoa1, uoa2, uoa3, c1, b1);
       uod.xg(v13);
       return;
    }
}
