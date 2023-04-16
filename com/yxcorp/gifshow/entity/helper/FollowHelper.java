package com.yxcorp.gifshow.entity.helper.FollowHelper;
import java.lang.Object;
import jga.c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import org.json.JSONObject;
import org.json.JSONException;
import lnc.i3;
import lnc.o5;
import java.lang.Integer;
import java.lang.Number;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.k;
import brd.t;
import wca.h;
import wca.g;
import erd.g;
import crd.b;
import wca.c;
import fka.e;
import fka.e$a;
import fka.b;
import com.kuaishou.weapon.i.WeaponHI;
import jga.d;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import jga.e;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.google.gson.JsonObject;
import fka.f;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Math;
import wkd.b;
import mu7.e;
import lu7.f;
import zc5.b;
import com.yxcorp.gifshow.retrofit.tools.NonNullValueMap;
import fka.a;
import lnc.s5;
import txc.j;
import com.yxcorp.gifshow.log.g;
import up.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.actionreport.PhotoActionReportParams;
import com.google.gson.Gson;
import com.yxcorp.gifshow.entity.helper.FollowHelper$StidParam;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.k2;
import k2b.u1;
import com.yxcorp.gifshow.log.h;
import java.util.Map;
import fg6.a;
import com.google.gson.JsonElement;
import java.util.HashMap;
import jga.a;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.entity.helper.a;
import wca.d;
import java.util.UUID;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.framework.network.exception.AntispamException;
import com.yxcorp.retrofit.model.RetrofitException;
import com.google.common.base.b;
import java.io.IOException;
import e17.i;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import wca.n;
import tkd.b;
import tkd.d;
import jyb.a;
import java.lang.System;
import com.kwai.library.widget.popup.common.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import wca.e;
import wca.f;
import wca.i;
import io.reactivex.internal.functions.Functions;

public final class FollowHelper	// class@000dd3
{

    public void FollowHelper(){
       super();
    }
    public static String a(c p0,String p1,String p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, FollowHelper.class, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 == null) {
          p0 = new c();
       }
       p0.g = p1;
       if (!TextUtils.x(p2)) {
          c h = p0.h;
          if (h != null) {
             Object obj1 = PatchProxy.applyOneRefs(h, null, FollowHelper.class, "16");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(new JSONObject(h).optInt("USER_RECO_PORTAL", 0) > 0){
                b = true;
             }
             if (b) {
             label_0067 :
                return p0.h();
             }
          }
          i3 oi3 = i3.f();
          oi3.c("USER_RECO_PORTAL", Integer.valueOf(o5.b(p2, 0)));
          p0.h = oi3.e();
          goto label_0067 ;
       }else {
          goto label_0067 ;
       }
    }
    public static void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FollowHelper.class, "1")) {
          return;
       }
       FollowHelper.c(p0, null);
       return;
    }
    public static void c(f p0,FollowHelper$a p1){
       k obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, FollowHelper.class, "2")) {
          return;
       }
       String str = FollowHelper.g(p0.a.mId);
       RxBus f = RxBus.f;
       f a = p0.a;
       obj = PatchProxy.applyOneRefs(a, obj, k.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = new k(a, true);
       }
       f.b(obj);
       FollowHelper.f(true, p0, str).subscribe(new h(p0, p1), new g(p0, p1));
       return;
    }
    public static void d(f p0,g p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, FollowHelper.class, "5")) {
          return;
       }
       FollowHelper.e(p0, p1, p2, null);
       return;
    }
    public static void e(f p0,g p1,g p2,FollowHelper$a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, FollowHelper.class, "6")) {
          return;
       }
       FollowHelper.c(p0, new c(p3, p1, p0, p2));
       return;
    }
    public static t f(boolean p0,f p1,String p2){
       f obj;
       f obj2;
       f a;
       UserOwnerCount mFan;
       User mFollowStatu;
       User$FollowStatus fOLLOW_REQUE;
       NonNullValueMap nonNullValue;
       String str2;
       f s;
       String str3;
       c f;
       t ot;
       t ot1;
       k2 d;
       JSONObject jSONObject;
       boolean b = p0;
       f uof = p1;
       e uoe = e.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowHelper uFollowHelpe = FollowHelper.class;
       if (PatchProxy.isSupport(uFollowHelpe)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, null, FollowHelper.class, "9");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = uof.b;
       f u = uof.u;
       Object obj1 = null;
       if (!PatchProxy.applyVoidTwoRefs(obj, u, obj1, uFollowHelpe, "17")) {
          if (TextUtils.x(u)) {
             e$a uoa1 = e.a().d();
             if (uoa1 != null) {
                b.b(obj, uoa1.a, uoa1.b);
             }
          }else {
             b.b(obj, u, "");
          }
       }
       int i = 0;
       WeaponHI.setP(9, b, i);
       String str = "1";
       if (uof.w == null) {
          d uod = d.class;
          obj2 = PatchProxy.apply(obj1, obj1, uod, str);
          if (obj2 != patchProxyRe) {
          }else {
             Activity uActivity = ActivityContext.g().e();
             c uoc = PatchProxy.applyOneRefs(uActivity, obj1, uod, "2");
             if (uoc != patchProxyRe) {
             }else if(uActivity instanceof e){
                uoc = uActivity.G9();
                if (uoc == null) {
                   uoc = new c();
                }
             }else if(uActivity instanceof FragmentActivity){
                List fragments = uActivity.getSupportFragmentManager().getFragments();
                if (!q.f(fragments)) {
                   Iterator iterator = fragments.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         Fragment uFragment = iterator.next();
                         if (uFragment != null && uFragment.isVisible()) {
                            obj2 = d.a(uFragment);
                            if (obj2 == null) {
                               continue ;
                            }
                         }
                      }
                   }
                   a uoa = new a(p0, a, mFollowStatu, p1, nonNullValue, p2);
                   ot1 = ot.map(new e()).doOnNext(uFollowHelpe);
                   uod = new d(a, mFollowStatu, mFan, nonNullValue, p1, p0, p2);
                   return ot1.doOnError(uFollowHelpe);
                }
             }
             uoc = new c();
             obj2 = uoc;
          }
          uof.w = obj2;
       }
       e uoe1 = e.a();
       Objects.requireNonNull(uoe1);
       obj2 = PatchProxy.apply(obj1, uoe1, uoe, "9");
       if (obj2 != patchProxyRe) {
       }else {
          uoe1 = uoe1.c;
          while (true) {
             if (uoe1 != null) {
                if (e.h(uoe1)) {
                   obj2 = uoe1.d;
                   if (obj2 == null) {
                   }
                }else {
                }
             }else {
                obj2 = obj1;
             }
          }
       }
       a = uof.a;
       mFan = a.mOwnerCount.mFan;
       mFollowStatu = a.mFollowStatus;
       if (b) {
          fOLLOW_REQUE = (a.mPrivate != null)? User$FollowStatus.FOLLOW_REQUESTING: User$FollowStatus.FOLLOWING;
       }else {
          fOLLOW_REQUE = User$FollowStatus.UNFOLLOW;
       }
       int i1 = 1;
       if (!PatchProxy.isSupport(uFollowHelpe) || (!PatchProxy.applyVoidTwoRefs(a, Boolean.valueOf(p0), obj1, uFollowHelpe, "24") && (a.mPrivate == null || !b))) {
          int i4 = Math.max(i, a.mOwnerCount.mFan);
          i4 = (b)? i4 + i1: Math.max(i, (i4 - 1));
          a.mOwnerCount.mFan = i4;
       }
       if (uof.i != null) {
          b.a(-1878684066).i(uof.a.getId(), uof.i);
       }
       f.m(a, fOLLOW_REQUE);
       int i2 = -869999145;
       if (b) {
          b.a(i2).b(a.mId);
       }else {
          b.a(i2).a(a.mId);
       }
       nonNullValue = new NonNullValueMap();
       obj = uof.q;
       String str1 = "11";
       if (TextUtils.x(obj)) {
          uoe1 = e.a();
          Objects.requireNonNull(uoe1);
          str2 = PatchProxy.apply(obj1, uoe1, uoe, str1);
          if (str2 != patchProxyRe) {
          }else {
             uoe = uoe1.b;
             while (true) {
                if (uoe != null) {
                   if (e.g(uoe)) {
                      s5 os5 = uoe.e();
                      if (os5 instanceof j) {
                         str2 = os5.y();
                      }
                   }
                   s = uoe.g;
                }else {
                   obj = obj1;
                }
             }
          }
          obj = str2;
       }
       nonNullValue.put("touid", a.mId);
       if (!b) {
          i1 = 2;
       }
       nonNullValue.put("ftype", String.valueOf(i1));
       nonNullValue.put("act_ref", uof.c);
       nonNullValue.put("page_ref", uof.b);
       nonNullValue.put("referer", uof.d);
       nonNullValue.put("exp_tag0", uof.f);
       nonNullValue.put("exp_tag", uof.e);
       nonNullValue.put("expTagList", b.a(0xe0ff4fb).d());
       nonNullValue.put("photoinfo", uof.h);
       nonNullValue.put("followSource", String.valueOf(uof.j));
       nonNullValue.put("followPlatform", uof.n);
       nonNullValue.put("h5_page_url", uof.o);
       nonNullValue.put("activity_id", obj);
       nonNullValue.put("RNBundleId", uof.p);
       nonNullValue.put("h5_bridge_name", uof.r);
       if (b && uof.A != null) {
          nonNullValue.put("block", str);
       }
       s = uof.s;
       PhotoActionReportParams photoActionR = (s != null && s.getActionReportFetcher() != null)? uof.s.getActionReportFetcher().a(): obj1;
       nonNullValue.put("ActionReportParams", new Gson().q(photoActionR));
       str2 = FollowHelper.h(obj2, "PYMK_PORTAL");
       obj = uof.x;
       if (TextUtils.x(obj)) {
          str3 = FollowHelper.h(obj2, "FOLLOW_TEXT");
       }
       nonNullValue.put("followActionReasonTextId", str3);
       nonNullValue.put("followContent", FollowHelper.a(uof.w, p2, str2));
       if (!PatchProxy.applyVoidOneRefs(uof, obj1, uFollowHelpe, str1)) {
          FollowHelper$StidParam stidParam = new FollowHelper$StidParam();
          f = uof.w.f;
          if (f != null) {
             stidParam.mInterStid = f.stidContainer;
          }
          d = (u1.j() != null)? u1.j().d: obj1;
          stidParam.mCommonStid = b.a(0x4b316083).i(d, obj1);
          if (!stidParam.isEmpty()) {
             String str4 = "bizCustomParams";
             str2 = uof.y.get(str4);
             String str5 = "stidParams";
             if (TextUtils.x(str2)) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0(str5, a.a.q(stidParam));
                uof.y.put(str4, jsonObject.toString());
             }else if(!str2.contains(str5)){
                try{
                   try{
                      jSONObject = new JSONObject(str2);
                      jSONObject.put(str5, a.a.q(stidParam));
                   label_0313 :
                      if (jSONObject) {
                         uof.y.put(str4, jSONObject.toString());
                      }
                   }catch(org.json.JSONException e0){
                      int i3 = jSONObject;
                   }
                   try{
                      e0.printStackTrace();
                      try{
                         jSONObject = new JSONObject();
                         jSONObject.put(str5, a.a.q(stidParam));
                         goto label_0313 ;
                      }catch(org.json.JSONException e0){
                      }
                      e0.printStackTrace();
                      goto label_0313 ;
                   }catch(org.json.JSONException e0){
                      jSONObject = obj1;
                      goto label_0310 ;
                   }
                }catch(org.json.JSONException e0){
                   goto label_02fa ;
                }
             }
          }
       }
    label_031e :
       f = uof.w.f;
       if (f != null) {
          nonNullValue.put("inner_log_ctx", f.toJsonString());
       }
       if (uof.y.size() > 0) {
          nonNullValue.putAll(uof.y);
       }
       s = uof.A;
       if (PatchProxy.isSupport(uFollowHelpe)) {
          ot = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(s), nonNullValue, null, FollowHelper.class, "10");
          if (ot != patchProxyRe) {
             goto label_0378 ;
          }
       }
       i2 = 0x1d5ac2c4;
       ot1 = (b && s != null)? b.a(i2).b(nonNullValue): b.a(i2).a(nonNullValue);
       ot = ot1;
       goto label_0378 ;
    }
    public static String g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FollowHelper.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UUID.randomUUID().toString()+"-"+p0;
    }
    public static String h(JsonObject p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FollowHelper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          JsonElement jsonElement = p0.e0(p1);
          if (jsonElement != null) {
             return jsonElement.w();
          }
       }
       return "";
    }
    public static void i(f p0,Throwable p1,boolean p2){
       f a;
       n on;
       FollowHelper uFollowHelpe = FollowHelper.class;
       if (PatchProxy.isSupport(uFollowHelpe) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, FollowHelper.class, "20")) {
          return;
       }
       try{
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, uFollowHelpe, "21") && (!p1 instanceof AntispamException && p0.l == null)) {
             if (p1 instanceof RetrofitException) {
                Throwable throwable = b.c(p1);
                if (throwable instanceof IOException && (throwable.getMessage() != null && (throwable.getMessage()).contains("connect"))) {
                   i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
                }
             }
             ExceptionHandler.handleException(a.b(), p1);
          }
       }catch(java.lang.IllegalArgumentException e0){
       }
       a = p0.a;
       if (PatchProxy.isSupport(n.class)) {
          on = PatchProxy.applyThreeRefs(a, Boolean.valueOf(p2), p1, null, n.class, "3");
          if (on != PatchProxyResult.class) {
          label_0089 :
             on.h = p0.r;
             RxBus.f.b(on);
             return;
          }
       }
       on = new n(a);
       on.d = true;
       on.g = p2;
       on.e = p1;
       goto label_0089 ;
    }
    public static void j(User p0,boolean p1,f p2){
       Object[] objArray;
       FollowHelper uFollowHelpe = FollowHelper.class;
       if (PatchProxy.isSupport(uFollowHelpe) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, FollowHelper.class, "18")) {
          return;
       }
       int i = 0;
       int i1 = 0x7f11066a;
       if (p1) {
          int i2 = -1079301847;
          if (p2.v == null) {
             d.a(i2).pK(ActivityContext.g().e(), System.currentTimeMillis(), 1);
          }
          if (!d.a(i2).Tp() && p2.l == null) {
             if (p0.isPrivate()) {
                objArray = new Object[i];
                i.g(i1, f.m(R.string.arg_RES_7f100218, objArray), 1, 1);
             }else if(p2.k == null){
                if (TextUtils.x(p2.m)) {
                   Object[] objArray1 = new Object[]{Boolean.TRUE};
                   i.g(R.style.arg_RES_7f110669, f.m(R.string.arg_RES_7f101021, objArray1), 1, 1);
                }else {
                   i.g(i1, p2.m, 1, 1);
                }
             }
          }
       }else if(p2.l == null && p2.k == null){
          objArray = new Object[i];
          i.g(i1, f.m(R.string.arg_RES_7f104f06, objArray), 1, 1);
       }
    label_009a :
       User mId = p2.a.mId;
       i1 = (p1)? 1: 2;
       f b = p2.b;
       if (!PatchProxy.isSupport(uFollowHelpe) || !PatchProxy.applyVoidThreeRefs(mId, Integer.valueOf(i1), b, null, FollowHelper.class, "22")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x7764;
          uElementPack.name = "n/relation/follow";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.kwaiId = TextUtils.I(mId);
          userPackage.index = i1;
          userPackage.params = TextUtils.I(b);
          uContentPack.userPackage = userPackage;
          u1.u(1, uElementPack, uContentPack);
       }
       n on = n.b(p0, p1, p2.b);
       on.h = p2.r;
       RxBus.f.b(on);
       return;
    }
    public static t k(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FollowHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowHelper.f(false, p0, FollowHelper.g(p0.a.mId)).doOnNext(new e(p0)).doOnError(new f(p0)).map(new i(p0));
    }
    public static void l(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FollowHelper.class, "7")) {
          return;
       }
       FollowHelper.k(p0).subscribe(Functions.d(), Functions.d());
       return;
    }
}
