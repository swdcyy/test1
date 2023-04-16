package com.yxcorp.gifshow.notice.krn.ReminderMixBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.notice.krn.ReminderMixBridge$FormatRawRecoTextInfo;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import fg6.a;
import com.yxcorp.gifshow.notice.data.model.Notice;
import com.google.gson.Gson;
import ztb.g;
import java.lang.Exception;
import com.yxcorp.gifshow.notice.krn.ReminderMixBridge$SlideEntranceSubTitleInfo;
import tkd.b;
import tkd.d;
import zw5.b;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import eg.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import j9c.b;
import com.facebook.react.bridge.WritableMap;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.d;
import com.yxcorp.gifshow.notice.krn.ReminderMixBridge$AddressBookInfo;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.ReactContext;
import lj0.c;
import lj0.d;
import bi5.a;

public class ReminderMixBridge extends KrnBridge	// class@002199
{

    public void ReminderMixBridge(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "KRNSocialNotice";
    }
    public String getsynFormatRawRecoTextInfo(ReadableMap p0){
       String obj = PatchProxy.applyOneRefs(p0, this, ReminderMixBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       try{
          this.reportAndCheck(obj, "getsynFormatRawRecoTextInfo", reactApplica);
          ReminderMixBridge$FormatRawRecoTextInfo uFormatRawRe = this.parseParams(p0, ReminderMixBridge$FormatRawRecoTextInfo.class);
          if (uFormatRawRe != null) {
             uFormatRawRe = uFormatRawRe.noticeItem;
             if (uFormatRawRe != null) {
                Notice notice = a.a.c(uFormatRawRe.r().e0("data"), Notice.class);
                if (notice != null) {
                   return g.l(notice);
                }
             }
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return "";
    }
    public String getsynSlideEntranceSubTitle(ReadableMap p0){
       String str = "";
       String obj = PatchProxy.applyOneRefs(p0, this, ReminderMixBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str1 = "getsynSlideEntranceSubTitle";
       try{
          this.reportAndCheck(obj, str1, reactApplica);
          ReminderMixBridge$SlideEntranceSubTitleInfo slideEntranc = this.parseParams(p0, ReminderMixBridge$SlideEntranceSubTitleInfo.class);
          if (slideEntranc != null && slideEntranc.response != null) {
             if (slideEntranc.width - null <= 0) {
                return str;
             }else {
                String str2 = d.a(0x7948eb5d).m0(slideEntranc.response, a.c(slideEntranc.width, a.b().getResources()));
                if (!TextUtils.x(str2)) {
                   str = str2;
                }
             }
          }
          return str;
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          return str;
       }
    }
    public boolean isTabHasRedDot(){
       boolean b;
       Boolean obj = PatchProxy.apply(null, this, ReminderMixBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.reportAndCheck(this.getName(), "isTabHasRedDot", this.getReactApplicationContext());
       obj = b.c(-8, Boolean.class);
       b = (obj != null && obj.booleanValue())? true: false;
       return b;
    }
    public WritableMap noticeGetAddressBookInfo(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ReminderMixBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.reportAndCheck(this.getName(), "noticeGetAddressBookInfo", this.getReactApplicationContext());
       return this.convertObjToNativeMap(new ReminderMixBridge$AddressBookInfo(new ContactPermissionHolder(objArray).d(), -1));
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReminderMixBridge.class, "5")) {
          return;
       }
       c uoc = d.a(p2);
       String str = "";
       if (uoc != null) {
          str = uoc.b();
          str1 = uoc.f();
       }else {
          str1 = str;
       }
       a.a(p0, p1, str, str1);
       return;
    }
}
