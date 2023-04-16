package com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import java.lang.Object;
import android.app.Activity;
import com.kuaishou.live.core.show.subscribe.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import pm8.a;
import d61.g;
import android.view.View$OnClickListener;
import d61.g0;
import tkd.b;
import tkd.d;
import ayb.i;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kuaishou.live.core.basic.utils.LivePreferenceObject;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.lang.Long;
import lnc.f0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import s7.b;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo$RepeatedReservationInfo;
import dyb.a$b;
import dyb.a;
import java.util.List;
import java.util.Collection;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import q2b.h$b;
import k2b.u1;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import ja6.a;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.live.core.show.subscribe.dosubscribe.g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.show.subscribe.dosubscribe.i;
import com.kuaishou.live.core.show.subscribe.dosubscribe.h;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.core.show.subscribe.helper.LiveSubscribeDialogContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import lnc.a1;
import lnc.i5;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j$a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import xk2.a;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.t;
import pk2.c;
import pk2.b;
import cjd.e;
import erd.o;
import rk2.r;
import erd.g;
import sfc.a;
import ps5.b;
import t45.d;
import brd.z;
import rk2.s;
import rk2.t;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.core.show.subscribe.dosubscribe.d;
import io.reactivex.internal.functions.Functions;
import crd.b;
import gr8.b;
import brd.x;
import rk2.q;
import com.kuaishou.live.core.show.subscribe.dosubscribe.e;
import com.kuaishou.live.core.show.subscribe.dosubscribe.f;

public class j	// class@0010e8
{

    public void j(){
       super();
    }
    public static void a(Activity p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j.class, "13")) {
          return;
       }
       long l = System.currentTimeMillis();
       if ((l - a.f0()) - 0xa4cb800 < 0) {
          return;
       }
       if (g.h(p0)) {
          return;
       }
       boolean b = j.f(p0);
       boolean b1 = j.e(p0);
       if (!b && !b1) {
          j.j(p0, null);
          a.E1(l);
       }else if(!b1){
          j.k(p0, p1, null);
          a.E1(l);
       }else if(!b){
          j.l(p0, null);
          a.E1(l);
       }
       return;
    }
    public static void b(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       g0.b(R.string.arg_RES_7f104dd2);
       d.a(0x4f878389).VY(p0, p1);
       return;
    }
    public static void c(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j.class, "12")) {
          return;
       }
       if (PermissionUtils.a(p0, "android.permission.WRITE_CALENDAR") && PermissionUtils.a(p0, "android.permission.READ_CALENDAR")) {
          HashMap hashMap = a.g0(LivePreferenceObject.M);
          if (hashMap == null) {
             return;
          }else {
             Long longx = hashMap.get(p1);
             if (longx == null) {
                return;
             }else {
                f0.b(p0, longx.longValue());
                hashMap.remove(p1);
                a.F1(hashMap);
             }
          }
       }
       return;
    }
    public static boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(d.a(0x4f878389).Wk(p0)) ^ 0x01);
    }
    public static boolean e(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (PermissionUtils.a(p0, "android.permission.WRITE_CALENDAR") && PermissionUtils.a(p0, "android.permission.READ_CALENDAR"))? true: false;
       return b;
    }
    public static boolean f(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(p0);
    }
    public static boolean g(Activity p0,String p1,LiveSubscribedCalendarInfo p2){
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveSubscribedCalendarInfo obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, j.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p2.mReservationType == 2) {
          obj = p2.mRepeatedReservationInfo;
          if (obj != null) {
             a$b uob = a.a(p1, p2.mTitle, obj.mStartTime);
             uob.d = true;
             LiveSubscribedCalendarInfo$RepeatedReservationInfo mDayOfWeek = p2.mRepeatedReservationInfo.mDayOfWeek;
             Object obj1 = PatchProxy.applyOneRefs(mDayOfWeek, uob, a$b.class, "1");
             if (obj1 != patchProxyRe) {
                uob = obj1;
             }else {
                uob.f.clear();
                uob.f.addAll(mDayOfWeek);
             }
             uob.e = true;
             uoa = uob.a();
          label_005a :
             return d.a(0x4f878389).XG(p0, uoa);
          }
       }
       uoa = a.a(p1, p2.mTitle, p2.mStartTime).a();
       goto label_005a ;
    }
    public static void h(Activity p0,String p1,LiveSubscribedCalendarInfo p2){
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, j.class, "9")) {
          return;
       }
       if (PermissionUtils.a(p0, "android.permission.WRITE_CALENDAR") && PermissionUtils.a(p0, "android.permission.READ_CALENDAR")) {
          if (p2 == null) {
             return;
          }else if(p2.mReservationType == 2 && p2.mRepeatedReservationInfo != null){
             LiveSubscribedCalendarInfo mRepeatedRes = p2.mRepeatedReservationInfo;
             str = f0.d(p0, p2.mTitle, p2.mUrl+p2.mRemark, mRepeatedRes.mStartTime, mRepeatedRes.mEndTime, mRepeatedRes.mDuration, mRepeatedRes.mDayOfWeek, (((int)p2.mRemindAdvanceMs / 1000) / 60), true);
          }else {
             str = f0.d(p0, p2.mTitle, p2.mUrl+p2.mRemark, p2.mStartTime, p2.mEndTime, 0, null, (((int)p2.mRemindAdvanceMs / 1000) / 60), false);
          }
          if (TextUtils.x(str)) {
             return;
          }else {
             ClientEvent$TaskEvent taskEvent = new ClientEvent$TaskEvent();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             i3 oi3 = i3.f();
             oi3.d("author_id", p2.mAnchorId);
             oi3.d("reserve_id", p1);
             oi3.d("extra_info", "{\"biz_id\":\"AUTHOR_LIVE\"}");
             uElementPack.params = oi3.e();
             h$b uob = h$b.e(10, "LIVE_RESERVATION_CALENDAR_BOOK_SUCC");
             uob.k(uElementPack);
             uob.h(new ClientContent$ContentPackage());
             u1.r0(uob);
             HashMap hashMap = a.g0(LivePreferenceObject.M);
             if (hashMap == null) {
                hashMap = new HashMap();
             }
             hashMap.put(p1, Long.valueOf(str));
             a.F1(hashMap);
          }
       }
       return;
    }
    public static void i(String p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oj, "20")) {
          return;
       }
       RxBus.f.b(new a(p0, p1));
       return;
    }
    public static void j(Activity p0,View$OnClickListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j.class, "4")) {
          return;
       }
       d uod = new d(p0);
       uod.Z0(13);
       uod.b1(KwaiDialogOption.e);
       uod.A(false);
       uod.L(new g(p1, p0));
       uod.v(true);
       uod.Y(PopupInterface.a);
       return;
    }
    public static void k(Activity p0,b$a p1,View$OnClickListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, j.class, "5")) {
          return;
       }
       d uod = new d(p0);
       uod.Z0(13);
       uod.b1(KwaiDialogOption.e);
       uod.A(false);
       uod.L(new i(p2, p0, p1));
       uod.v(true);
       uod.Y(PopupInterface.a);
       return;
    }
    public static void l(Activity p0,View$OnClickListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j.class, "6")) {
          return;
       }
       d uod = new d(p0);
       uod.Z0(13);
       uod.b1(KwaiDialogOption.e);
       uod.A(false);
       uod.L(new h(p1, p0));
       uod.v(true);
       uod.Y(PopupInterface.a);
       return;
    }
    public static void m(Activity p0,String p1,QPhoto p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, j.class, "1")) {
          return;
       }
       if (!g.h(p0) && !TextUtils.x(p1)) {
          LiveSubscribeDialogContainerFragment liveSubscrib = new LiveSubscribeDialogContainerFragment();
          liveSubscrib.Ah(0);
          liveSubscrib.Bh(-1, (a1.e(0x439f0000) + i5.a(p0)));
          liveSubscrib.Dh(new j$a(p1, p2, p3, liveSubscrib));
          liveSubscrib.Cb(p0.getSupportFragmentManager(), "LiveSubscribeFragment");
       }
       return;
    }
    public static t n(a p0,RxFragmentActivity p1,boolean p2){
       if (PatchProxy.isSupport(j.class)) {
          p1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, j.class, "14");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       return b.b().b(p0.mSubscribeId, p0.mSource).map(new e()).doOnNext(new r(p0, p2)).doOnError(new a());
    }
    public static void o(a p0,RxFragmentActivity p1,b p2,boolean p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, j.class, "16")) {
          return;
       }
       if (p0 == null || TextUtils.x(p0.mSubscribeId)) {
          if (p2 != null) {
             p2.accept(Boolean.FALSE);
          }
          return;
       }else {
          z a = d.a;
          j.n(p0, p1, p3).observeOn(a).doOnNext(new s(p2)).doOnError(new t(p2)).observeOn(d.c).delay(1000, TimeUnit.MILLISECONDS).observeOn(a).subscribe(new d(p1, p0), Functions.d());
          return;
       }
    }
    public static t p(a p0,RxFragmentActivity p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.q(p0, p1, true);
    }
    public static t q(a p0,RxFragmentActivity p1,boolean p2){
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, j.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = b.b().y0(p0.mSubscribeId).map(new e()).compose(p1.ge()).observeOn(d.a).doOnNext(new q(p0, p1, p2));
       a uoa = (p2)? new a(): Functions.d();
       return ot.doOnError(uoa).flatMap(e.b).onErrorResumeNext(f.b);
    }
}
