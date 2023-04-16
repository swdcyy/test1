package com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import com.kwai.android.common.intercept.Interceptor;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor$a;
import nsd.u;
import java.lang.Object;
import androidx.core.app.NotificationCompat$Builder;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import com.kwai.android.common.bean.Channel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.PendingIntent;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Intent;
import com.yxcorp.gifshow.push.ClickPushButtonBroadcastReceiver;
import android.content.Context;
import java.lang.Enum;
import java.util.Objects;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.android.register.core.notification.NotificationChain;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Number;
import android.app.Notification$Builder;
import android.app.Notification;
import android.widget.RemoteViews;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.TextView;
import java.util.LinkedList;
import usd.q;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.bean.PushData;
import com.kwai.android.common.intercept.Chain;
import zsd.u;
import com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.android.common.ext.PushDataExtKt;
import com.android.library.image.interfaces.IConfig;
import w7.c;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import w7.d;
import android.net.Uri;
import kb.c;
import s6c.e;
import ya.i;
import kb.e;
import java.util.concurrent.Executor;
import s6c.d;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.text.TextUtils;
import s6c.f;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor$b;
import androidx.core.app.NotificationCompat$d;
import androidx.core.app.NotificationCompat$j;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor$c;
import com.kwai.android.dispatcher.KwaiPush;
import o6c.a;
import android.graphics.Color;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor$tryToShowDialog$1;
import com.kwai.lib.SpringActivity;
import com.kwai.lib.BaseSpringDialogFragment;
import msd.l;
import com.kwai.lib.Spring;
import com.kwai.android.common.utils.ContextProvider;
import android.os.Vibrator;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import android.os.VibrationEffect;
import com.yxcorp.gifshow.push.PushBells;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor$vibrateAndSound$2;
import msd.a;

public class KwaiPushTypeInterceptor implements Interceptor	// class@0012f4
{
    public int a;
    public static final KwaiPushTypeInterceptor$a b;

    static {
       KwaiPushTypeInterceptor.b = new KwaiPushTypeInterceptor$a(null);
    }
    public void KwaiPushTypeInterceptor(){
       super();
    }
    public final void a(NotificationCompat$Builder p0,KwaiPushMsgData p1,int p2,Channel p3){
       if (PatchProxy.isSupport(KwaiPushTypeInterceptor.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, KwaiPushTypeInterceptor.class, "15")) {
          return;
       }
       p0.addAction(R.drawable.arg_RES_7f081a3b, "", this.b(p1, 1, p2, p3));
       p0.addAction(R.drawable.arg_RES_7f081a3a, "", this.b(p1, 2, p2, p3));
       p0.setDeleteIntent(this.b(p1, 3, p2, p3));
       return;
    }
    public final PendingIntent b(KwaiPushMsgData p0,int p1,int p2,Channel p3){
       c obj;
       if (PatchProxy.isSupport(KwaiPushTypeInterceptor.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, KwaiPushTypeInterceptor.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       Application uApplication = obj.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       Intent intent = new Intent(uApplication, ClickPushButtonBroadcastReceiver.class);
       String str = p3.name();
       Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
       str = str.toLowerCase();
       a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
       intent.putExtra("push_channel_name", str);
       intent.putExtra("msgId", p2);
       if (!p0 instanceof Serializable) {
          p0 = null;
       }
       SerializableHook.putExtra(intent, "pushData", p0);
       intent.putExtra("pending_intent_type", p1);
       KwaiPushTypeInterceptor ta = this.a;
       this.a = ta + 1;
       return PendingIntent.getBroadcast(uApplication, ta, intent, 0x8000000);
    }
    public final void c(NotificationChain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPushTypeInterceptor.class, "11")) {
          return;
       }
       try{
          NotificationCompat$Builder notification = p0.getNotificationBuilder();
          if (notification != null) {
             notification.setLargeIcon(BitmapFactory.decodeResource(p0.getContext().getResources(), R.drawable.notification_icon_large));
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final int d(Context p0){
       int currentTextC;
       View childAt;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiPushTypeInterceptor kwaiPushType = KwaiPushTypeInterceptor.class;
       Notification obj = PatchProxy.applyOneRefs(p0, this, kwaiPushType, "8");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = new Notification$Builder(p0).build();
       a.o(obj, "builder.build\(\)");
       obj = obj.contentView;
       if (obj == null) {
          return -1;
       }
       View view = a.c(LayoutInflater.from(p0), obj.getLayoutId(), null, false);
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       int i = 0x7f0a3f2c;
       if (view.findViewById(i) != null) {
          view = view.findViewById(i);
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
          currentTextC = view.getCurrentTextColor();
       }else {
          LinkedList obj1 = PatchProxy.applyOneRefs(view, this, kwaiPushType, "9");
          if (obj1 != patchProxyRe) {
             currentTextC = obj1.intValue();
          }else {
             obj1 = new LinkedList();
             obj1.add(view);
             currentTextC = 0xff000000;
             while (obj1.size() > 0) {
                Object first = obj1.getFirst();
                a.o(first, "viewGroups.first");
                i = first.getChildCount();
                int i1 = 0;
                while (i1 < i) {
                   if (first.getChildAt(i1) instanceof ViewGroup) {
                      childAt = first.getChildAt(i1);
                      Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                      obj1.add(childAt);
                   }else if(first.getChildAt(i1) instanceof TextView){
                      childAt = first.getChildAt(i1);
                      Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                      if (childAt.getCurrentTextColor() != -1) {
                         view = first.getChildAt(i1);
                         Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
                         currentTextC = view.getCurrentTextColor();
                      }
                   }
                   i1 = i1 + 1;
                }
                obj1.remove(first);
             }
          }
       }
       return currentTextC;
    }
    public final Bitmap e(Bitmap p0){
       String obj = PatchProxy.applyOneRefs(p0, this, KwaiPushTypeInterceptor.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "bitmap";
       try{
          a.p(p0, obj);
          int i = q.u(p0.getWidth(), p0.getHeight());
          Bitmap uBitmap = Bitmap.createBitmap(p0, ((p0.getWidth() - i) / 2), ((p0.getHeight() - i) / 2), i, i);
          a.o(uBitmap, "Bitmap.createBitmap\(bitm¡­ - size\) / 2, size, size\)");
          p0 = uBitmap;
          return p0;
       }catch(java.lang.Exception e0){
       }
    }
    public void f(NotificationChain p0){
       PushData pushData1;
       KwaiPushMsgData bigPicUrl;
       KwaiPushTypeInterceptor kwaiPushType = KwaiPushTypeInterceptor.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, kwaiPushType, "1")) {
          return;
       }
       a.p(p0, "chain");
       PushLogcat.INSTANCE.i("KwaiPushSDK", "push process notification KwaiPushTypeInterceptor run...channel:"+p0.getChannel()+" id:"+p0.getPushData().pushId);
       PushData pushData = p0.getPushData();
       String str = "null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData";
       Objects.requireNonNull(pushData, str);
       this.j(p0);
       KwaiPushMsgData pushType = pushData.pushType;
       if (pushType != null) {
          int i = 1;
          if (pushType != i) {
             if (pushType != 2) {
                if (pushType != 6) {
                   if (pushType != 7) {
                      p0.proceed();
                   }else if(PatchProxy.applyVoidOneRefs(p0, this, kwaiPushType, "2")){
                      pushData1 = p0.getPushData();
                      Objects.requireNonNull(pushData1, str);
                      PushData pushData2 = pushData1;
                      pushData1 = pushData2.title;
                      pushData1 = (pushData1 == null || u.S1(pushData1))? 1: null;
                      if (!pushData1) {
                         pushData1 = pushData2.body;
                         pushData1 = (pushData1 == null || u.S1(pushData1))? 1: null;
                         if (!pushData1) {
                            pushData1 = pushData2.uri;
                            String str1 = (pushData1 == null || u.S1(pushData1))? 1: null;
                            if (!str1) {
                               PushFragmentDialog pushFragment = new PushFragmentDialog();
                               Bundle uBundle = new Bundle();
                               pushFragment.setArguments(uBundle);
                               uBundle.putString("data_json", PushDataExtKt.toJson(pushData2));
                               uBundle.putString("push_channel", p0.getChannel().name());
                               bigPicUrl = pushData2.bigPicUrl;
                               if (bigPicUrl != null && !u.S1(bigPicUrl)) {
                                  i = 0;
                               }
                               if (i) {
                                  this.k(p0, pushFragment, pushData2);
                               }else {
                                  IConfig iConfig = c.a(p0.getContext());
                                  iConfig.a(ImageRequest$CacheChoice.DEFAULT);
                                  e uoe = new e(this, uBundle, pushData2, p0, pushFragment);
                                  iConfig.l(Uri.parse(pushData2.bigPicUrl)).f(pushType, i.d());
                               }
                            }
                         }
                      }
                   label_0103 :
                      this.i(p0);
                   }
                }else if(PatchProxy.applyVoidOneRefs(p0, this, kwaiPushType, "6")){
                   pushData1 = p0.getPushData();
                   Objects.requireNonNull(pushData1, str);
                   PushData pushData3 = pushData1;
                   bigPicUrl = pushData3.pushLargeIcon;
                   if (bigPicUrl != null && !u.S1(bigPicUrl)) {
                      i = 0;
                   }
                   if (i) {
                      this.i(p0);
                   }else {
                      d uod = new d(this, new RemoteViews(p0.getContext().getPackageName(), 0x7f0d10c4), new RemoteViews(p0.getContext().getPackageName(), 0x7f0d10c4), new RemoteViews(p0.getContext().getPackageName(), 0x7f0d10c5), pushData3, p0);
                      a.e(pushData3.pushLargeIcon, pushType);
                   }
                }
             }else if(PatchProxy.applyVoidOneRefs(p0, this, kwaiPushType, "14")){
                pushData1 = p0.getPushData();
                Objects.requireNonNull(pushData1, str);
                if (!TextUtils.isEmpty(pushData1.bigPicUrl)) {
                   a.e(pushData1.bigPicUrl, new f(this, p0, pushData1));
                }else {
                   this.i(p0);
                }
             }
          }else {
             this.h(p0);
          }
       }else {
          this.i(p0);
       }
       return;
    }
    public final void g(RemoteViews p0,RemoteViews p1,RemoteViews p2,KwaiPushMsgData p3,Bitmap p4){
       KwaiPushTypeInterceptor kwaiPushType = KwaiPushTypeInterceptor.class;
       if (PatchProxy.isSupport(kwaiPushType)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, kwaiPushType, "7")) {
             return;
          }
       }
       p0.setTextViewText(R.id.notification_custom_title, p3.title);
       p0.setTextViewText(R.id.notification_custom_subtitle, p3.body);
       p0.setImageViewBitmap(R.id.notification_custom_image, p4);
       p1.setTextViewText(R.id.notification_custom_title, p3.title);
       p1.setTextViewText(R.id.notification_custom_subtitle, p3.body);
       p1.setImageViewBitmap(R.id.notification_custom_image, p4);
       p2.setTextViewText(R.id.notification_custom_title, p3.title);
       p2.setTextViewText(R.id.notification_custom_subtitle, p3.body);
       p2.setImageViewBitmap(R.id.notification_custom_image, p4);
       if (Build$VERSION.SDK_INT <= 24) {
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          int i = this.d(uApplication);
          if (i != -1) {
             p0.setTextColor(R.id.notification_custom_title, i);
             p1.setTextColor(R.id.notification_custom_title, i);
             p2.setTextColor(R.id.notification_custom_title, i);
             p0.setTextColor(R.id.notification_custom_subtitle, i);
             p1.setTextColor(R.id.notification_custom_subtitle, i);
             p2.setTextColor(R.id.notification_custom_subtitle, i);
          }
       }
       return;
    }
    public final void h(NotificationChain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPushTypeInterceptor.class, "12")) {
          return;
       }
       a.p(p0, "chain");
       PushData pushData = p0.getPushData();
       Objects.requireNonNull(pushData, "null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
       if (!TextUtils.isEmpty(pushData.bigPicUrl)) {
          a.e(pushData.bigPicUrl, new KwaiPushTypeInterceptor$b(this, p0, pushData));
       }else {
          this.i(p0);
       }
       return;
    }
    public final void i(NotificationChain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPushTypeInterceptor.class, "10")) {
          return;
       }
       a.p(p0, "chain");
       PushData pushData = p0.getPushData();
       Objects.requireNonNull(pushData, "null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
       NotificationCompat$d uod = new NotificationCompat$d();
       uod.z(pushData.title);
       uod.y(pushData.body);
       NotificationCompat$Builder notification = p0.getNotificationBuilder();
       if (notification != null) {
          notification.setStyle(uod);
       }
       if (!TextUtils.isEmpty(pushData.pushLargeIcon)) {
          a.e(pushData.pushLargeIcon, new KwaiPushTypeInterceptor$c(this, p0));
       }else {
          this.c(p0);
          p0.proceed();
       }
       return;
    }
    public void intercept(Chain p0){
       this.f(p0);
    }
    public final void j(NotificationChain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPushTypeInterceptor.class, "5")) {
          return;
       }
       a.p(p0, "chain");
       if (a.a(KwaiPush.INSTANCE)) {
          NotificationCompat$Builder notification = p0.getNotificationBuilder();
          if (notification != null) {
             notification.setColor(Color.parseColor("#FF4906"));
          }
       }
       return;
    }
    public void k(NotificationChain p0,PushFragmentDialog p1,KwaiPushMsgData p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiPushTypeInterceptor.class, "4")) {
          return;
       }
       a.p(p0, "chain");
       a.p(p1, "fragment");
       a.p(p2, "data");
       this.l();
       PushData pushId = p2.pushId;
       a.o(pushId, "data.pushId");
       Spring.c(p0.getContext(), p1, pushId, SpringActivity.class, new KwaiPushTypeInterceptor$tryToShowDialog$1(this, p0));
       return;
    }
    public final void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiPushTypeInterceptor.class, "3")) {
          return;
       }
       try{
          Object systemServic = ContextProvider.getContext().getSystemService("vibrator");
          if (systemServic instanceof Vibrator) {
             objArray = systemServic;
          }
          if (objArray != null && objArray.hasVibrator()) {
             int i = 4;
             long[] olongArray = new long[i];
             int i1 = 0;
             olongArray[i1] = 100;
             olongArray[1] = 300;
             olongArray[2] = 100;
             olongArray[3] = 800;
             if (Build$VERSION.SDK_INT >= 26) {
                objArray.vibrate(VibrationEffect.createWaveform(olongArray, i1), new AudioAttributes$Builder().setContentType(i).setUsage(5).build());
             }else {
                objArray.vibrate(olongArray, i1);
             }
          }
          Context context = ContextProvider.getContext();
          a.o(context, "ContextProvider.getContext\(\)");
          PushBells.b(PushBells.b, context, R.raw.arg_RES_7f0f0031, 0, new KwaiPushTypeInterceptor$vibrateAndSound$2(objArray), 4, null);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public int supportProcess(){
       return 3;
    }
}
