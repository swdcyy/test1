package com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$onCreate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vb3.n;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController;
import z1.k;
import kotlin.jvm.internal.a;
import v51.a;
import hf3.a;
import td3.o;
import x83.a;
import hx1.a;
import e93.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import ip3.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteCommentPresenter$onCreate$1 extends Lambda implements a	// class@0007e9
{
    public final LiveLiteCommentPresenter this$0;

    public void LiveLiteCommentPresenter$onCreate$1(LiveLiteCommentPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteCommentPresenter$onCreate$1.class, "1")) {
          return;
       }
       n on = LiveLiteCommentPresenter.n9(this.this$0);
       LayoutViewType enterRoomMes = LayoutViewType.EnterRoomMessage;
       LiveLiteCommentPresenter obj = LiveLiteCommentPresenter.l9(this.this$0).get();
       a.o(obj, "longConnectionManager.get\(\)");
       a uoa = obj.u();
       a.o(uoa, "longConnectionManager.get\(\).liveLongConnection");
       obj = LiveLiteCommentPresenter.m9(this.this$0).get();
       a.o(obj, "userStatusManager.get\(\)");
       Object obj1 = obj;
       obj = this.this$0.J;
       if (obj == null) {
          a.S("anonymityManager");
       }
       LiveLiteInteractiveMessageViewController obj2 = obj.get();
       a.o(obj2, "anonymityManager.get\(\)");
       Object obj3 = obj2;
       obj = this.this$0.K;
       if (obj == null) {
          a.S("roleInfoManager");
       }
       obj2 = obj.get();
       a.o(obj2, "roleInfoManager.get\(\)");
       Object obj4 = obj2;
       obj2 = LiveLiteCommentPresenter.c9(this.this$0).get();
       a.o(obj2, "audienceInfoManager.get\(\)");
       LiveStreamFeed liveStreamFe = obj2.j0();
       LiveLiteCommentPresenter w = this.this$0.W;
       if (w == null) {
          a.S("gestureService");
       }
       LiveLiteCommentPresenter u0 = this.this$0.U0;
       if (u0 == null) {
          a.S("profileCardService");
       }
       obj2 = new LiveLiteInteractiveMessageViewController(uoa, obj1, obj3, obj4, liveStreamFe, w, u0, LiveLiteCommentPresenter.e9(this.this$0));
       on.c(enterRoomMes, v11);
       return;
    }
}
