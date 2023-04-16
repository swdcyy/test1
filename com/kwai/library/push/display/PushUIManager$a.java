package com.kwai.library.push.display.PushUIManager$a;
import jy6.b;
import java.lang.Object;
import com.kwai.library.push.display.Push;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.push.model.InAppNotification;
import ny6.a;
import com.kwai.library.push.utils.InPushSettingExt;
import java.util.Objects;
import java.util.Map;
import com.kwai.library.push.http.InPushApiExt;
import ky6.a;
import brd.t;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import ky6.g;
import crd.b;
import java.lang.StringBuilder;
import com.kwai.library.push.display.PushUIManager;
import jy6.a;
import com.kwai.library.push.model.InAppEvent$Event;
import jy6.a$b;
import java.lang.CharSequence;
import java.util.PriorityQueue;
import iy6.h;
import java.lang.Runnable;
import ekd.k1;

public final class PushUIManager$a implements b	// class@0008be
{

    public void PushUIManager$a(){
       super();
    }
    public void a(Push p0,String p1){
       a.p(p0, "push");
       a.p(p1, "clickType");
       InAppNotification inAppNotific = p0.f();
       a.p(inAppNotific, "notification");
       a.p(p1, "clickType");
       if (inAppNotific.getIsFromKlink()) {
          String msgId = inAppNotific.getMsgId();
          a.o(msgId, "it.msgId");
          String back = inAppNotific.getBack();
          a.o(back, "it.back");
          Objects.requireNonNull(a.b);
          Map map = InPushApiExt.b();
          map.put("msg_id", msgId);
          map.put("back", back);
          map.put("view", InPushSettingExt.e());
          map.put("code", p1);
          a.p(map, "params");
          InPushApiExt b = InPushApiExt.b;
          a uoa = b.a();
          t ot = uoa.d(b.c(), map);
          ot.subscribeOn(AzerothSchedulers.b.d()).subscribe(Functions.d(), g.b);
       }
       a.b("onClick: clickType "+p1);
       return;
    }
    public void b(Push p0){
       a.p(p0, "push");
       a.p(p0, "push");
       PushUIManager.e.b();
    }
    public void c(Push p0){
       a.p(p0, "push");
       a.p(p0, "push");
       a$b.b(a.b, InAppEvent$Event.ON_ENTER, p0.f(), null, 4, null);
    }
    public void d(Push p0){
       a.p(p0, "push");
       a.b("onScrollUp event: msg ----------->>>>>"+p0.f().getTitle());
       a$b.b(a.b, InAppEvent$Event.PULLUP_NOTICE, p0.f(), null, 4, null);
    }
    public void e(Push p0){
       Push push;
       a.p(p0, "push");
       a.b("onShow event: msg ------------ >"+p0.f().getTitle());
       InAppNotification inAppNotific = p0.f();
       a.p(inAppNotific, "notification");
       if (inAppNotific.getIsFromKlink()) {
          String msgId = inAppNotific.getMsgId();
          a.o(msgId, "it.msgId");
          String back = inAppNotific.getBack();
          a.o(back, "it.back");
          InPushApiExt.d(a.b.a(msgId, back, "0", InPushSettingExt.e()));
       }
       a$b.b(a.b, InAppEvent$Event.SHOW_NOTICE, p0.f(), null, 4, null);
       PushUIManager e = PushUIManager.e;
       e.b();
       push = e.f().peek();
       if (push != null) {
          if (e.a(push)) {
             a.b("observePushEvent: 1");
             Objects.requireNonNull(e);
             h b = h.b;
             PushUIManager.c = b;
             k1.r(b, 1000);
          }else if(e.h(push) && e.i()){
             a.b("observePushEvent: 3");
             push = PushUIManager.b;
             if (push != null) {
                Push.e(push, "1", null, false, 6, null);
             }
          }
       }
       return;
    }
    public void f(Push p0,String p1){
       a.p(p0, "push");
       a.p(p1, "exitType");
       a.d(p0.f(), p1);
       a.b("onDismiss event: msg ---"+p0.f().getTitle()+" exitType "+p1);
       a.b.a(InAppEvent$Event.END_NOTICE, p0.f(), p1);
       PushUIManager e = PushUIManager.e;
       Objects.requireNonNull(e);
       Push b = PushUIManager.b;
       if (b != null) {
          b.k(null);
       }
       PushUIManager.b = null;
       e.j();
       return;
    }
    public void g(Push p0,Push p1){
       a.p(p0, "push");
       a.p(p1, "oldPush");
       a.b("onUpdate event: msg ------------ >"+p0.f().getTitle());
       a.d(p1.f(), "5");
       a$b.b(a.b, InAppEvent$Event.UPDATE_NOTICE, p0.f(), null, 4, null);
    }
    public void h(Push p0,String p1){
       a.p(p0, "push");
       a.p(p1, "clickType");
       if (a.g("2", p1)) {
          a.b("onHandleClick: clickType 1 "+p1);
          a$b.b(a.b, InAppEvent$Event.CLICK_BTN, p0.f(), null, 4, null);
       }else if(a.g("1", p1)){
          a.b("onHandleClick: clickType 2 "+p1);
          a$b.b(a.b, InAppEvent$Event.CLICK_NOTICE, p0.f(), null, 4, null);
       }
       return;
    }
}
