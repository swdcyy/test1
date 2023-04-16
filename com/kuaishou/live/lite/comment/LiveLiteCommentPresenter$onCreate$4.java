package com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$onCreate$4;
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
import vc3.g;
import z1.k;
import kotlin.jvm.internal.a;
import v51.a;
import hf3.a;
import td3.o;
import qa3.b;
import xp5.i;
import vq5.d;
import wa3.c;
import e93.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import com.kuaishou.live.service.ServiceProvider;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteCommentPresenter$onCreate$4 extends Lambda implements a	// class@0007ec
{
    public final LiveLiteCommentPresenter this$0;

    public void LiveLiteCommentPresenter$onCreate$4(LiveLiteCommentPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteCommentPresenter$onCreate$4.class, "1")) {
          return;
       }
       d uod = this.this$0.P8();
       LiveLiteCommentPresenter obj = LiveLiteCommentPresenter.l9(this.this$0).get();
       a.o(obj, "longConnectionManager.get\(\)");
       a uoa = obj.u();
       a.o(uoa, "longConnectionManager.get\(\).liveLongConnection");
       obj = LiveLiteCommentPresenter.m9(this.this$0).get();
       a.o(obj, "userStatusManager.get\(\)");
       Object obj1 = obj;
       obj = LiveLiteCommentPresenter.d9(this.this$0).get();
       a.o(obj, "delayInfoManager.get\(\)");
       Object obj2 = obj;
       obj = LiveLiteCommentPresenter.k9(this.this$0).get();
       a.o(obj, "liveLogPackageProvider.get\(\)");
       Object obj3 = obj;
       obj = this.this$0.N;
       if (obj == null) {
          a.S("routerManager");
       }
       g obj4 = obj.get();
       a.o(obj4, "routerManager.get\(\)");
       Object obj5 = obj4;
       obj = this.this$0.M;
       if (obj == null) {
          a.S("liteEventCenter");
       }
       obj4 = obj.get();
       a.o(obj4, "liteEventCenter.get\(\)");
       Object obj6 = obj4;
       obj4 = LiveLiteCommentPresenter.c9(this.this$0).get();
       a.o(obj4, "audienceInfoManager.get\(\)");
       Object obj7 = obj4;
       obj4 = LiveLiteCommentPresenter.h9(this.this$0).get();
       a.o(obj4, "guidanceMessageQueueManager.get\(\)");
       Object obj8 = obj4;
       obj4 = new g(uoa, obj1, obj2, obj3, obj5, obj6, obj7, obj8, this.this$0.y.a(), this.this$0.v.a(), LiveLiteCommentPresenter.j9(this.this$0), LiveLiteCommentPresenter.e9(this.this$0));
       uod.xg(v14);
       return;
    }
}
