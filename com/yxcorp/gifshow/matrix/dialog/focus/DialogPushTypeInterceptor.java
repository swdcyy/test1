package com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$a;
import nsd.u;
import com.yxcorp.gifshow.util.rx.RxBus;
import o6b.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$1;
import p6b.b;
import msd.l;
import erd.g;
import crd.b;
import com.kwai.android.register.core.notification.NotificationChain;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.common.bean.PushData;
import java.util.Objects;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import com.kwai.android.common.intercept.Chain;
import java.lang.Integer;
import java.util.Collection;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.gifshow.matrix.dialog.live.LiveFragmentDialog;
import android.os.Bundle;
import com.kwai.android.common.ext.PushDataExtKt;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$setToLiveDialog$1;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import com.yxcorp.gifshow.matrix.dialog.pymk.PymkFragmentDialog;
import android.content.Context;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$setToPymkDialog$1;
import com.kwai.lib.BaseSpringDialogFragment;
import com.kwai.lib.Spring;
import com.yxcorp.gifshow.matrix.dialog.clean.CleanFragmentDialog;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$setToCleanDialog$1;
import com.yxcorp.gifshow.matrix.dialog.focus.FocusFragmentDialog;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$setToFocusAndCommon$1;
import android.app.NotificationManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import p6b.a;
import java.lang.Enum;
import com.kwai.sdk.switchconfig.a;
import android.app.Application;
import o56.a;
import com.kwai.android.common.ext.ContextExtKt;
import com.kwai.lib.SpringActivity;
import com.yxcorp.gifshow.focusdialog.FocusDialogActivity;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$b;
import android.content.IntentFilter;
import com.yxcorp.gifshow.matrix.dialog.ScreenReceiver;
import java.lang.Runnable;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import kkc.i;
import n6b.b;
import lnc.i3;
import java.lang.Number;
import n6b.a;

public final class DialogPushTypeInterceptor extends KwaiPushTypeInterceptor	// class@001219
{
    public final String c;
    public NotificationChain d;
    public static String e;
    public static final DialogPushTypeInterceptor$a f;

    static {
       DialogPushTypeInterceptor.f = new DialogPushTypeInterceptor$a(null);
       DialogPushTypeInterceptor.e = "";
    }
    public void DialogPushTypeInterceptor(){
       super();
       this.c = "DialogPushTypeInterceptor";
       RxBus.f.g(b.class, RxBus$ThreadMode.MAIN).subscribe(new b(new DialogPushTypeInterceptor$1(this)));
    }
    public void f(NotificationChain p0){
       PushData pushData1;
       PushData title;
       DialogPushTypeInterceptor uDialogPushT = DialogPushTypeInterceptor.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDialogPushT, "1")) {
          return;
       }
       a.p(p0, "chain");
       PushLogcat.INSTANCE.i("KwaiPushSDK", this.c+" run...channel:"+p0.getChannel()+" id:"+p0.getPushData().pushId);
       PushData pushData = p0.getPushData();
       String str = "null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData";
       Objects.requireNonNull(pushData, str);
       this.j(p0);
       this.d = p0;
       String str1 = "data.pushId";
       Bundle uBundle = 1;
       String str2 = null;
       switch (pushData.pushType){
           case 9:
             if (!PatchProxy.isSupport(uDialogPushT) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(9), this, uDialogPushT, "3")) {
                if (this.r(p0)) {
                   this.q(p0);
                }else {
                   pushData1 = p0.getPushData();
                   Objects.requireNonNull(pushData1, str);
                   this.m(p0);
                   title = pushData1.title;
                   title = (title == null || !title.length())? 1: null;
                   if (!title) {
                      title = pushData1.body;
                      title = (title == null || !title.length())? 1: null;
                      if (!title) {
                         title = pushData1.uri;
                         if (title != null && title.length()) {
                            uBundle = null;
                         }
                         if (!uBundle) {
                            FocusFragmentDialog uFocusFragme = new FocusFragmentDialog();
                            uFocusFragme.setArguments(this.p(new Bundle(), PushDataExtKt.toJson(pushData1), p0.getChannel(), 9));
                            pushData1 = pushData1.pushId;
                            a.o(pushData1, str1);
                            Spring.c(p0.getContext(), uFocusFragme, pushData1, this.o(), new DialogPushTypeInterceptor$setToFocusAndCommon$1(this, p0, 9));
                         }
                      }
                   }
                label_02d2 :
                   this.i(p0);
                   this.s(p0.getChannel(), 9);
                }
             }
             break;
           case 10:
             if (!PatchProxy.isSupport(uDialogPushT) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(10), this, uDialogPushT, "4")) {
                if (this.r(p0)) {
                   this.q(p0);
                }else {
                   pushData1 = p0.getPushData();
                   Objects.requireNonNull(pushData1, str);
                   this.m(p0);
                   title = pushData1.title;
                   title = (title == null || !title.length())? 1: null;
                   if (!title) {
                      title = pushData1.body;
                      title = (title == null || !title.length())? 1: null;
                      if (!title) {
                         title = pushData1.uri;
                         if (title != null && title.length()) {
                            uBundle = null;
                         }
                         if (uBundle == null) {
                            CleanFragmentDialog uCleanFragme = new CleanFragmentDialog();
                            uCleanFragme.setArguments(this.p(new Bundle(), PushDataExtKt.toJson(pushData1), p0.getChannel(), 10));
                            pushData1 = pushData1.pushId;
                            a.o(pushData1, str1);
                            Spring.c(p0.getContext(), uCleanFragme, pushData1, this.o(), new DialogPushTypeInterceptor$setToCleanDialog$1(this, p0, 10));
                         }
                      }
                   }
                label_023b :
                   this.i(p0);
                   this.s(p0.getChannel(), 10);
                }
             }
             break;
           case 11:
             if (!PatchProxy.isSupport(uDialogPushT) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(11), this, uDialogPushT, "5")) {
                if (this.r(p0)) {
                   this.q(p0);
                }else {
                   pushData1 = p0.getPushData();
                   Objects.requireNonNull(pushData1, str);
                   this.m(p0);
                   title = pushData1.title;
                   title = (title == null || !title.length())? 1: null;
                   if (!title) {
                      title = pushData1.body;
                      title = (title == null || !title.length())? 1: null;
                      if (!title) {
                         title = pushData1.uri;
                         if (title != null && title.length()) {
                            uBundle = null;
                         }
                         if (uBundle == null) {
                            PymkFragmentDialog pymkFragment = new PymkFragmentDialog();
                            pymkFragment.setArguments(this.p(new Bundle(), PushDataExtKt.toJson(pushData1), p0.getChannel(), 11));
                            pushData1 = pushData1.pushId;
                            a.o(pushData1, str1);
                            Spring.c(p0.getContext(), pymkFragment, pushData1, this.o(), new DialogPushTypeInterceptor$setToPymkDialog$1(this, p0, 11));
                         }
                      }
                   }
                label_01a3 :
                   this.i(p0);
                   this.s(p0.getChannel(), 11);
                }
             }
             break;
           case 12:
             int i = 12;
             if (!PatchProxy.isSupport(uDialogPushT) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i), this, uDialogPushT, "6")) {
                if (this.r(p0)) {
                   this.q(p0);
                }else {
                   pushData1 = p0.getPushData();
                   Objects.requireNonNull(pushData1, str);
                   PushData pushData2 = pushData1;
                   this.m(p0);
                   pushData1 = pushData2.title;
                   pushData1 = (pushData1 == null || !pushData1.length())? 1: null;
                   if (!pushData1) {
                      pushData1 = pushData2.body;
                      pushData1 = (pushData1 == null || !pushData1.length())? 1: null;
                      if (!pushData1) {
                         pushData1 = pushData2.uri;
                         KwaiPushMsgData kwaiPushMsgD = (pushData1 == null || !pushData1.length())? 1: null;
                         if (!kwaiPushMsgD) {
                            kwaiPushMsgD = pushData2.picArray;
                            if (kwaiPushMsgD == null || kwaiPushMsgD.isEmpty() != uBundle) {
                               CharSequence uCharSequenc = pushData2.picArray.get(str2);
                               if (uCharSequenc != null && uCharSequenc.length()) {
                                  uBundle = null;
                               }
                               if (uBundle == null) {
                                  LiveFragmentDialog liveFragment = new LiveFragmentDialog();
                                  Bundle uBundle1 = this.p(new Bundle(), PushDataExtKt.toJson(pushData2), p0.getChannel(), i);
                                  liveFragment.setArguments(uBundle1);
                                  String str3 = pushData2.picArray.get(str2);
                                  DialogPushTypeInterceptor$setToLiveDialog$1 osetToLiveDi = new DialogPushTypeInterceptor$setToLiveDialog$1(this, uBundle1, str3, p0, liveFragment, pushData2, 12);
                                  a.e(str3, i);
                               }
                            }
                         }
                      }
                   }
                label_010b :
                   this.i(p0);
                   this.s(p0.getChannel(), i);
                }
             }
             break;
           default:
             p0.proceed();
       }
    label_02dc :
       return;
    }
    public void intercept(Chain p0){
       this.f(p0);
    }
    public final void m(NotificationChain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogPushTypeInterceptor.class, "15")) {
          return;
       }
       PushData showId = p0.getPushData().showId;
       if (showId != null) {
          NotificationManager systemServic = p0.getContext().getSystemService("notification");
          if (systemServic != null) {
             systemServic.cancel(showId.hashCode());
          }
       }
       return;
    }
    public final boolean n(Channel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DialogPushTypeInterceptor.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = a.a[p0.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i != 2) {
             if (i != 3) {
                i = (i != 4)? a.t().d("otherDialogDownGrade", b): a.t().d("contactDialogDownGrade", false);
             }else {
                i = a.t().d("jpushDialogDownGrade", b);
             }
          }else {
             i = a.t().d("getuiDialogDownGrade", b);
          }
       }else {
          i = a.t().d("matrixDialogDownGrade", b);
       }
       return i;
    }
    public final Class o(){
       Application obj = PatchProxy.apply(null, this, DialogPushTypeInterceptor.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b();
       a.o(obj, "AppEnv.getAppContext\(\)");
       SpringActivity springActivi = (ContextExtKt.isMainProcess(obj))? SpringActivity.class: FocusDialogActivity.class;
       return springActivi;
    }
    public final void onEvent(b p0){
       PushData pushData;
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogPushTypeInterceptor.class, "2")) {
          return;
       }
       p0 = p0.a;
       DialogPushTypeInterceptor td = this.d;
       if (td != null) {
          pushData = td.getPushData();
          if (pushData != null) {
             pushData = pushData.pushId;
          label_001b :
             if (a.g(p0, pushData)) {
                DialogPushTypeInterceptor td1 = this.d;
                if (td1 != null) {
                   this.i(td1);
                }
             }
             return;
          }
       }
       pushData = null;
       goto label_001b ;
    }
    public final Bundle p(Bundle p0,String p1,Channel p2,int p3){
       if (PatchProxy.isSupport(DialogPushTypeInterceptor.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, DialogPushTypeInterceptor.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0.putString("data_json", p1);
       p0.putString("push_channel", p2.name());
       p0.putInt("push_style", p3);
       return p0;
    }
    public final void q(NotificationChain p0){
       DialogPushTypeInterceptor uDialogPushT = DialogPushTypeInterceptor.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDialogPushT, "13")) {
          return;
       }
       this.i(p0);
       PushData pushData = p0.getPushData();
       if (pushData != null) {
          pushData = pushData.pushId;
          if (pushData != null && !DialogPushTypeInterceptor.f.a(pushData)) {
             DialogPushTypeInterceptor.e = pushData;
             Context context = p0.getContext();
             DialogPushTypeInterceptor$b uob = new DialogPushTypeInterceptor$b(pushData, this, p0);
             if (!PatchProxy.applyVoidTwoRefs(context, uob, this, uDialogPushT, "14")) {
                UniversalReceiver.e(context, new ScreenReceiver(uob), new IntentFilter("android.intent.action.USER_PRESENT"));
             }
          }
       }
       return;
    }
    public final boolean r(NotificationChain p0){
       i obj = PatchProxy.applyOneRefs(p0, this, DialogPushTypeInterceptor.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PushData pushId = p0.getPushData().pushId;
       a.o(pushId, "chain.pushData.pushId");
       boolean b = DialogPushTypeInterceptor.f.a(pushId);
       boolean b1 = false;
       if (!b) {
          obj = i.d;
          if (!obj.d(p0.getContext()) || (obj.c(p0.getContext()) && a.t().d("screenLockPush", b1))) {
             b1 = true;
          }
       }
       return b1;
    }
    public final void s(Channel p0,int p1){
       b a;
       String str2;
       DialogPushTypeInterceptor uDialogPushT = DialogPushTypeInterceptor.class;
       if (PatchProxy.isSupport(uDialogPushT) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uDialogPushT, "8")) {
          return;
       }
       String str = "channel";
       a.p(p0, str);
       a = b.a;
       Objects.requireNonNull(a);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), p0, a, uob, "4")) {
          a.p(p0, str);
          i3 oi3 = i3.f();
          oi3.c("push_style", Integer.valueOf(p1));
          p1 = a.d[p0.ordinal()];
          if (p1 != 1) {
             if (p1 != 2) {
                if (p1 != 3) {
                   if (p1 != 4) {
                      String str1 = oi3.toString();
                      a.o(str1, "json.toString\(\)");
                      a.a(p0.name()+"_NORMAL", str1);
                   }else {
                      str2 = oi3.toString();
                      a.o(str2, "json.toString\(\)");
                      a.a("CONTACT_NORMAL", str2);
                   }
                }else {
                   str2 = oi3.toString();
                   a.o(str2, "json.toString\(\)");
                   a.a("JPUSH_NORMAL", str2);
                }
             }else {
                str2 = oi3.toString();
                a.o(str2, "json.toString\(\)");
                a.a("MATRIX_NORMAL", str2);
             }
          }else {
             str2 = oi3.toString();
             a.o(str2, "json.toString\(\)");
             a.a("GEPUSH_NORMAL", str2);
          }
       }
       return;
    }
    public int supportProcess(){
       return 3;
    }
    public final void t(Channel p0,int p1){
       b a;
       String str2;
       DialogPushTypeInterceptor uDialogPushT = DialogPushTypeInterceptor.class;
       if (PatchProxy.isSupport(uDialogPushT) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uDialogPushT, "9")) {
          return;
       }
       String str = "channel";
       a.p(p0, str);
       a = b.a;
       Objects.requireNonNull(a);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), p0, a, uob, "3")) {
          a.p(p0, str);
          i3 oi3 = i3.f();
          oi3.c("push_style", Integer.valueOf(p1));
          p1 = a.c[p0.ordinal()];
          if (p1 != 1) {
             if (p1 != 2) {
                if (p1 != 3) {
                   if (p1 != 4) {
                      String str1 = oi3.toString();
                      a.o(str1, "json.toString\(\)");
                      a.a(p0.name()+"_DIALOG_SHOW", str1);
                   }else {
                      str2 = oi3.toString();
                      a.o(str2, "json.toString\(\)");
                      a.a("CONTACT_DIALOG_SHOW", str2);
                   }
                }else {
                   str2 = oi3.toString();
                   a.o(str2, "json.toString\(\)");
                   a.a("JPUSH_DIALOG_SHOW", str2);
                }
             }else {
                str2 = oi3.toString();
                a.o(str2, "json.toString\(\)");
                a.a("MATRIX_DIALOG_SHOW", str2);
             }
          }else {
             str2 = oi3.toString();
             a.o(str2, "json.toString\(\)");
             a.a("GEPUSH_DIALOG_SHOW", str2);
          }
       }
       return;
    }
}
