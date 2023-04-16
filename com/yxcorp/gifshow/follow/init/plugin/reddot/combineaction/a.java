package com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.a;
import qha.c;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.a$a;
import nsd.u;
import com.yxcorp.gifshow.model.FollowTabNotify;
import pr6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import ro5.c0;
import wa5.e;
import co5.i$b;
import co5.i;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import gha.p;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;
import com.yxcorp.gifshow.util.rx.RxBus;
import lha.a;
import tkd.b;
import tkd.d;
import mv5.b;
import co5.m$b;
import co5.m;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import fg6.a;
import com.google.gson.Gson;
import zf6.k;
import lnc.a1;
import com.yxcorp.gifshow.model.FollowTabNotify$TagRenderInfo;
import com.yxcorp.utility.n;
import gha.m;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import gha.n;
import gha.e;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import gha.l;
import erd.r;
import gha.j;
import erd.o;
import gha.f;
import gha.p$a;
import gha.h;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.follow.model.FilterOption;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.HashMap;
import kotlin.Pair;

public final class a implements c	// class@0010f2
{
    public final FollowTabNotify a;
    public final d b;
    public static final a$a c;

    static {
       a.c = new a$a(null);
    }
    public void a(FollowTabNotify p0,d p1){
       a.p(p1, "tabHostFragment");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(Bitmap p0){
       a a;
       int i;
       int b;
       String str2;
       boolean b1;
       KsLogFollowTag fOLLOW_NOTIF;
       KsLogFollowTag ksLogFollowT;
       m$b uob;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, a.class, "1")) {
          return;
       }
       TabIdentifier c = b.c;
       c0.v(obj.b, c);
       c0.u(obj.b, c);
       c0.t(obj.b, c);
       a = obj.a;
       String str = "";
       if (a != null && (a.isCustomHeadUrl() || (obj.a.isFollowTabMultiDynamic() && e.b()))) {
          c0.m(obj.b, c, str);
          c0.I(obj.b, c, i.a());
          c.i(KsLogFollowTag.FOLLOW_NOTIFY.appendTag("NotifyNormalAction"), "set text empty showImageSrcNotify");
       }else {
          c0.D(obj.b, c);
          c0.w(obj.b, c);
          c.i(KsLogFollowTag.FOLLOW_NOTIFY.appendTag("NotifyNormalAction"), "set text hideImageSrcNotify");
       }
       a = obj.b;
       a a1 = obj.a;
       i = 1;
       b = (a1 != null && a1.isCustomHeadUrl() == i)? true: false;
       String str1 = "updateFollowTabItem";
       if (PatchProxy.isSupport(p.class)) {
          str2 = str1;
          if (!PatchProxy.applyVoidThreeRefs(a, a1, Boolean.valueOf(b), null, p.class, "1")) {
          label_009e :
             FilterOption uFilterOptio = null;
             if (!PatchProxy.applyVoidOneRefs(a1, uFilterOptio, p.class, "15")) {
                p.h("Update new "+a1);
             }
             String str3 = "FollowTabNotify";
             if (a1 == null || !a1.valid()) {
                if (FollowFilterHelper.a()) {
                   String[] obj1 = PatchProxy.apply(uFilterOptio, uFilterOptio, FollowFilterHelper.class, "10");
                   if (obj1 != PatchProxyResult.class) {
                      b1 = obj1.booleanValue();
                   }else {
                      obj1 = new String[]{"default","time"};
                      List list = CollectionsKt__CollectionsKt.L(obj1);
                      FilterOption uFilterOptio1 = FollowFilterHelper.f();
                      if (uFilterOptio1 != null) {
                         uFilterOptio = uFilterOptio1.mName;
                      }
                      b1 = CollectionsKt___CollectionsKt.H1(list, uFilterOptio);
                   }
                   if (!b1) {
                      HashMap hashMap = new HashMap();
                      hashMap.put("getLastSelectorId", FollowFilterHelper.a.toString());
                      str = "empty";
                      String str4 = (FollowFilterHelper.d() == null)? str: FollowFilterHelper.d().toString();
                      hashMap.put("getFilterBox", str4);
                      if (FollowFilterHelper.f() != null) {
                         str = FollowFilterHelper.f().toString();
                      }
                      hashMap.put("getLastSelectedOption", str);
                      c.k(KsLogFollowTag.FOLLOW_NOTIFY.appendTag(str3), "cant hide notify", hashMap);
                   }
                }
                c0.v(a, c);
                c0.u(a, c);
                c0.t(a, c);
                c0.w(a, c);
                RxBus.f.b(a.c);
                c.j(KsLogFollowTag.FOLLOW_NOTIFY.appendTag(str3), str2, "clear", str);
             }else {
                str = "type";
                if (b || a1.mType != i) {
                   a uoa = 3;
                   if (a1.mType == uoa && FollowFilterHelper.j()) {
                   label_00db :
                      RxBus.f.b(a.b);
                      c0.G(a, c);
                      c0.u(a, c);
                      c0.t(a, c);
                      fOLLOW_NOTIF = KsLogFollowTag.FOLLOW_NOTIFY;
                      fOLLOW_NOTIF.appendTag(str3);
                      ksLogFollowT = fOLLOW_NOTIF;
                      c.j(ksLogFollowT, str2, str, "red dot");
                   }else if(!b && a1.mType == 2){
                      if (e.b()) {
                         c0.v(a, c);
                         FollowTabNotify mUnreadCount = a1.mUnreadCount;
                         if (d.a(0x3ee97dc2).Eg()) {
                            uob = m.b().c(mUnreadCount);
                            uob.d(uoa);
                            int i1 = 0;
                            uob.b(i1);
                            uob.e(i1);
                            uob.f(d0.a("alte-din.ttf", a.i()));
                            c0.F(a, c, uob, a.a.q(a1));
                         }else {
                            m$b uob1 = m.b();
                            b = (k.d())? 0x7f080c70: 0x7f080c6f;
                            uob1.c = b;
                            uob1.d = (float)a1.e(12.00f);
                            b = (mUnreadCount <= 9)? true: false;
                            uob1.e = b;
                            uob1.f = a1.e(4.00f);
                            uob1.g = a1.e(0x3fa00000);
                            uob = uob1.c(mUnreadCount);
                            uob.b(a1.e(6.00f));
                            uob.e(a1.e(0x3f800000));
                            uob.f(d0.a("alte-din.ttf", a.i()));
                            c0.F(a, c, uob, a.a.q(a1));
                         }
                         c0.t(a, c);
                         RxBus.f.b(a.b);
                         fOLLOW_NOTIF = KsLogFollowTag.FOLLOW_NOTIFY;
                         fOLLOW_NOTIF.appendTag(str3);
                         ksLogFollowT = fOLLOW_NOTIF;
                         c.j(ksLogFollowT, str2, str, "number");
                      }
                   }else if(a1.mTagRenderInfo != null){
                      c0.v(a, c);
                      c0.u(a, c);
                      a.e(a1.mTagRenderInfo.mUrl, new m(a, a1, n.c(a.i(), (float)a1.mTagRenderInfo.mWidth), n.c(a.i(), (float)a1.mTagRenderInfo.mHeight)));
                      RxBus.f.b(a.b);
                      fOLLOW_NOTIF = KsLogFollowTag.FOLLOW_NOTIFY;
                      fOLLOW_NOTIF.appendTag(str3);
                      ksLogFollowT = fOLLOW_NOTIF;
                      c.j(ksLogFollowT, str2, str, "image");
                   }
                }else {
                   goto label_00db ;
                }
                if (!PatchProxy.applyVoidTwoRefs(a, a1, uFilterOptio, p.class, "2")) {
                   if (!a1.isCustomHeadUrl() && (!a1.isFollowTabMultiDynamic() || !e.b())) {
                      i = 0;
                   }
                   if (i) {
                      n on = new n(a1, a);
                      if (!PatchProxy.applyVoidOneRefs(on, uFilterOptio, p.class, "3")) {
                         t.create(e.b).observeOn(d.c).filter(l.b).map(j.b).filter(l.b).observeOn(d.a).subscribe(new f(on), new h(on));
                      }
                   }else {
                      c0.w(a, c);
                   }
                }
             }
          }
       }else {
          str2 = str1;
          goto label_009e ;
       }
       c.i(KsLogFollowTag.FOLLOW_NOTIFY.appendTag("NotifyNormalAction"), str2);
       return;
    }
    public void b(){
    }
}
