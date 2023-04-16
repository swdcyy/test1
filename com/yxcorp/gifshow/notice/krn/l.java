package com.yxcorp.gifshow.notice.krn.l;
import cv5.a;
import java.lang.Object;
import android.app.Activity;
import com.kwai.feature.api.social.bridge.beans.JsNoticeParams;
import f55.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import fg6.a;
import com.yxcorp.gifshow.notice.data.model.Notice;
import com.google.gson.Gson;
import java.lang.Exception;
import android.os.Bundle;
import android.net.Uri;
import ekd.x0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import oec.f;
import org.greenrobot.eventbus.a;
import px5.b;
import ztb.g;
import android.content.Context;
import xh7.b;
import xh7.a;
import qh7.b;
import qh7.a;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.d;
import brd.t;
import com.yxcorp.gifshow.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import qtb.h;
import qtb.i;
import erd.g;
import crd.b;
import com.kwai.feature.api.social.bridge.beans.JsAddressInfoResult;
import java.lang.Boolean;
import java.lang.Integer;
import mz6.b;
import lnc.a1;
import mz6.b$d;
import nfc.j;
import qtb.o;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.gifshow.notice.krn.k;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import com.kwai.framework.model.user.User;
import mz6.a;
import java.lang.CharSequence;
import qtb.n;
import com.yxcorp.gifshow.notice.krn.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import ttb.b;
import com.yxcorp.gifshow.notice.box.data.NoticeBox;
import com.yxcorp.gifshow.notice.krn.h;
import qtb.k;
import com.yxcorp.gifshow.notice.krn.g;
import java.lang.Runnable;
import wwb.f;
import tkd.b;
import tkd.d;
import wu5.a;
import android.content.Intent;
import qtb.d;
import n3d.a;
import com.kwai.framework.model.user.QCurrentUser;
import ou5.b;
import qtb.e;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.gifshow.reminder.data.model.ReminderContentInfo;
import com.yxcorp.gifshow.reminder.data.model.ReminderButtonModel;
import com.yxcorp.gifshow.notice.box.detail.NoticeBoxDetailActivity;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import px5.a$a;
import px5.a;
import com.kwai.feature.api.social.bridge.beans.JsSlideEntranceParams;
import zw5.b;
import qec.a;
import com.yxcorp.gifshow.reminder.data.model.ReminderLongPressActionModel;
import o56.a;
import com.yxcorp.gifshow.notice.krn.j;
import qtb.p;

public class l implements a	// class@0021ac
{

    public void l(){
       super();
    }
    public void C1(Activity p0,JsNoticeParams p1,g p2){
       Notice notice;
       b uob;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "3")) {
          return;
       }
       String str = "param error";
       int i = -1;
       if (p0 != null) {
          p1 = p1.noticeItem;
          if (p1 != null) {
             try{
                notice = a.a.c(p1.r().e0("data"), Notice.class);
             }catch(java.lang.Exception e8){
                e8.printStackTrace();
                notice = null;
             }
             if (notice == null) {
                p2.a(i, str, null);
                return;
             }else {
                Uri uri = x0.f(notice.getHeadScheme());
                if (uri != null && p0 instanceof GifshowActivity) {
                   Notice mId = notice.mId;
                   if (869 == notice.mType) {
                      if (f.h(uri)) {
                         a.d().k(new b(uri.toString(), "HALF_PYMK_USER_LIST", mId));
                      }else if(g.w(notice, uri)){
                         return;
                      }else {
                         uob = b.j(p0, "");
                         uob.i(uri);
                         uob.m("NOTICE_TYPE", notice.mType);
                         a.b(uob, null);
                      }
                   }else if(f.f(uri)){
                      if (f.d(uri)) {
                         a.b(b.j(p0, "kwai://users/missu?style=2"), null);
                      }else {
                         a.d().k(new b(uri.toString(), "HALF_AGGREGATE_LIST", mId));
                      }
                   }else if(g.w(notice, uri)){
                      return;
                   }else {
                      uob = b.j(p0, "");
                      uob.i(uri);
                      uob.m("NOTICE_TYPE", notice.mType);
                      a.b(uob, null);
                   }
                }
                return;
             }
          }
       }
       p2.a(i, str, null);
       return;
    }
    public void E0(Activity p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (new ContactPermissionHolder(null).d()) {
          b.f().map(new e()).observeOn(d.a).subscribe(new h(p1), new i(p1));
       }else {
          p1.onSuccess(new JsAddressInfoResult(1, false, false));
       }
       return;
    }
    public final void F(boolean p0,Activity p1,Notice p2,int p3,g p4){
       l ol = l.class;
       int i = 3;
       int i1 = 2;
       int i2 = 1;
       int i3 = 4;
       int i4 = 0;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, ol, "14")) {
             return;
          }
       }
       this.n(p2.mId, "logShowDisturbConfirmDialog", p0, i4);
       b uob = new b(p1);
       int i5 = (p0)? 0x7f10425f: 0x7f10425e;
       uob.n(i5);
       int[] ointArray = new int[i3];
       ointArray[i4] = a1.d(0x7f0702fe);
       i4 = 0x7f070271;
       ointArray[i2] = a1.d(i4);
       ointArray[i1] = a1.d(0x7f0702fe);
       ointArray[i] = a1.d(i4);
       uob.p(16.00f, a1.a(R.color.arg_RES_7f06211b), ointArray);
       i5 = 0x7f060c49;
       int i6 = (p0)? 0x7f101c21: 0x7f101c1c;
       uob.a(j.a(i5, i6));
       uob.k(new o(this, p4, p2, p0));
       k ok = new k(this, p2, p3, p4, p0);
       uob.l(new o(this, p4, p2, p0));
       uob.q();
       return;
    }
    public void M2(Activity p0,JsNoticeParams p1,g p2){
       Notice notice;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "9")) {
          return;
       }
       String str = "param error";
       int i = -1;
       Bundle uBundle = null;
       if (p0 != null) {
          p1 = p1.noticeItem;
          if (p1 != null) {
             try{
                notice = a.a.c(p1.r().e0("data"), Notice.class);
             }catch(java.lang.Exception e8){
                e8.printStackTrace();
                notice = uBundle;
             }
             if (notice == null) {
                p2.a(i, str, uBundle);
                return;
             }else {
                User user = g.g(notice);
                a uoa = a.b();
                uoa.o(R.color.arg_RES_7f060c49);
                uoa.g(R.string.arg_RES_7f104f05);
                b$d uod = uoa.a();
                str = (user != null && user.isFemale())? a1.p(R.string.arg_RES_7f103fdc): a1.p(R.string.arg_RES_7f103fdd);
                b uob = new b(p0);
                uob.o(str);
                uob.a(uod);
                uob.k(new n(this, p2, notice));
                uob.l(new d(this, notice, p0, p2));
                uob.q();
                return;
             }
          }
       }
       p2.a(i, str, uBundle);
       return;
    }
    public PresenterV2 NU(){
       Object obj = PatchProxy.applyWithListener(null, this, l.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(l.class, "10");
       return new b();
    }
    public void Q0(Activity p0,JsNoticeParams p1,g p2){
       NoticeBox noticeBox;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "5")) {
          return;
       }
       String str = "param error";
       int i = -1;
       Bundle uBundle = null;
       if (p0 != null) {
          p1 = p1.noticeItem;
          if (p1 != null) {
             try{
                noticeBox = a.a.c(p1.r().e0("data"), NoticeBox.class);
             }catch(java.lang.Exception e8){
                e8.printStackTrace();
                noticeBox = uBundle;
             }
             if (noticeBox == null) {
                p2.a(i, str, uBundle);
                return;
             }else {
                b uob = new b(p0);
                uob.n(R.string.arg_RES_7f1039d9);
                uob.a(j.a(R.color.arg_RES_7f060c49, 0x7f104270));
                uob.l(new h(this, noticeBox, p0, p2));
                uob.k(new k(this, p2, noticeBox));
                uob.q();
                return;
             }
          }
       }
       p2.a(i, str, uBundle);
       return;
    }
    public final void S(Activity p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "16")) {
          return;
       }
       ContactPermissionHolder uContactPerm = new ContactPermissionHolder(null);
       GifshowActivity gifshowActiv = p0;
       if (!uContactPerm.d()) {
          uContactPerm.h(gifshowActiv, new g(uContactPerm, p0, gifshowActiv, p1));
          return;
       }else {
          f.c(true);
          gifshowActiv.t1(d.a(0x6de3c81e).g4(p0, 100), 2049, new d(p1));
          return;
       }
    }
    public void T(Activity p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          d.a(-1712118428).x00(p0, 171, null, new e(this, p0, p1));
       }else {
          this.S(p0, p1);
       }
       return;
    }
    public void X3(Activity p0,JsNoticeParams p1,g p2){
       String str1;
       Notice notice;
       b uob;
       String str = "";
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "6")) {
          return;
       }
       int i = -1;
       if (p0 != null) {
          JsNoticeParams noticeItem = p1.noticeItem;
          if (noticeItem != null && p1.url != null) {
             try{
                JsonElement jsonElement = noticeItem.r().e0("data");
                int i1 = p1.noticeItem.r().e0("dataType").p();
                if (i1 == 1 || i1 == 2) {
                   notice = a.a.c(jsonElement, Notice.class);
                   if (notice != null) {
                      try{
                         i = notice.mType;
                         str1 = notice.mId;
                         try{
                            Notice mContentInfo = notice.mContentInfo;
                            if (mContentInfo != null) {
                               ReminderButtonModel ReminderContentInfo mContentInfo1 = mContentInfo.mButton;
                               if (mContentInfo1 != null) {
                                  mContentInfo1 = mContentInfo1.mBizDataId;
                               }
                            }
                         }catch(java.lang.Exception e4){
                         }
                      }catch(java.lang.Exception e4){
                         str1 = str;
                      }
                   }else {
                      str1 = str;
                   }
                }else {
                   str1 = str;
                   notice = null;
                }
             }catch(java.lang.Exception e4){
                str1 = str;
                notice = null;
             }
             Uri uri = x0.f(p1.url);
             if (uri != null) {
                if (869 == i) {
                   if (f.h(uri)) {
                      a.d().k(new b(uri.toString(), "HALF_PYMK_USER_LIST", str1));
                   }else if(g.w(notice, uri)){
                      return;
                   }else {
                      uob = b.j(p0, str);
                      uob.i(uri);
                      uob.m("NOTICE_TYPE", i);
                      a.b(uob, null);
                   }
                }else if(f.f(uri)){
                   if (f.d(uri)) {
                      a.b(b.j(p0, "kwai://users/missu?style=2"), null);
                   }else {
                      a.d().k(new b(uri.toString(), "HALF_AGGREGATE_LIST", str1));
                   }
                }else if(g.w(notice, uri)){
                   return;
                }else {
                   uob = b.j(p0, str);
                   uob.i(uri);
                   uob.m("NOTICE_TYPE", i);
                   a.b(uob, null);
                }
             }
             return;
          }
       }
       p2.a(i, "param error", null);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void m3(Activity p0,JsNoticeParams p1,g p2){
       NoticeBox noticeBox;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "4")) {
          return;
       }
       String str = "param error";
       if (p0 != null) {
          p1 = p1.noticeItem;
          if (p1 != null) {
             try{
                noticeBox = a.a.c(p1.r().e0("data"), NoticeBox.class);
             }catch(java.lang.Exception e8){
                e8.printStackTrace();
                noticeBox = null;
             }
             if (noticeBox == null) {
                p2.a(-1, str, null);
                return;
             }else {
                NoticeBoxDetailActivity.A3(p0, noticeBox.mId, noticeBox.mName);
                p2.onSuccess(new JsSuccessResult());
                return;
             }
          }
       }
       p2.a(-1, str, null);
       return;
    }
    public final void n(String p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, l.class, "18")) {
          return;
       }
       a$a uoa = new a$a();
       uoa.a = p2;
       uoa.b = p3;
       a.d().k(new a(p0, p1, uoa));
       return;
    }
    public void p0(Activity p0,JsSlideEntranceParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "8")) {
          return;
       }
       if (p0 != null && (p1 == null || p1.response == null)) {
          p2.a(-1, "param error", null);
          return;
       }else if(d.a(0x7948eb5d).y0(p0, p1.response, p1.rootTag)){
          p2.onSuccess(new JsSuccessResult());
          a.d().k(new a());
       }else {
          p2.a(-1, "param error", null);
       }
       return;
    }
    public void t1(Activity p0,JsNoticeParams p1,g p2){
       JsNoticeParams this;
       int notice1;
       Notice notice2;
       int i3;
       int i = p0;
       JsNoticeParams jsNoticePara = p1;
       g og = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "7")) {
          return;
       }
       String str = "param error";
       Bundle uBundle = null;
       int i1 = -1;
       if (i) {
          this = jsNoticePara.noticeItem;
          if (this != null) {
             boolean b = false;
             try{
                Notice notice = a.a.c(this.r().e0("data"), Notice.class);
                try{
                   notice2 = notice;
                   notice1 = jsNoticePara.noticeItem.r().e0("dataType").p();
                label_0053 :
                   if (notice2 == null) {
                      og.a(i1, str, uBundle);
                      return;
                   }else {
                      ReminderLongPressActionModel reminderLong = g.e(notice2);
                      if (reminderLong != null) {
                         i1 = reminderLong.mActionStatus;
                      }
                      jsNoticePara = 1;
                      boolean b1 = (reminderLong != null && i1 == null)? true: false;
                      b uob = new b(p0);
                      int i2 = 0x7f0619e8;
                      if (a.d()) {
                         uob.a(j.a(i2, R.string.arg_RES_7f10082b));
                      }
                      if (i1 == null || i1 == jsNoticePara) {
                         i3 = (b1)? 0x7f101c20: 0x7f101c1c;
                         uob.a(j.a(i2, i3));
                         this.n(notice2.mId, "logShowDisturbDialog", b1, b);
                      }else {
                         int i4 = this;
                      }
                      uob.a(j.a(R.color.arg_RES_7f060c49, 0x7f104270));
                      j oj = new j(this, notice2, notice1, p0, p2);
                      uob.l(i3);
                      p op = new p(this, p2, reminderLong, notice2, b1);
                      uob.k(v6);
                      uob.q();
                      return;
                   }
                }catch(java.lang.Exception e0){
                }
                e0.printStackTrace();
                notice2 = notice1;
                notice1 = 0;
                goto label_0053 ;
             }catch(java.lang.Exception e0){
                notice1 = uBundle;
                goto label_004e ;
             }
          }
       }
       og.a(i1, str, uBundle);
       return;
    }
}
