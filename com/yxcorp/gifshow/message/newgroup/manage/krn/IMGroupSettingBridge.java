package com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import java.lang.Boolean;
import com.kwai.imsdk.group.KwaiGroupJoinRequestResponse;
import com.kwai.feature.api.social.message.bridge.model.GroupManagerInfo;
import sv5.d;
import java.lang.Object;
import com.kwai.feature.api.social.message.bridge.model.JsSuccessResult;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.String;
import java.lang.Throwable;
import qdb.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.library.widget.popup.common.f;
import e17.i;
import com.yxcorp.gifshow.im.exception.KwaiIMException;
import tkd.b;
import tkd.d;
import hw5.e;
import vv5.l1;
import com.yxcorp.utility.TextUtils;
import sv5.e;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Arrays;
import java.util.Collections;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import hw5.c;
import brd.t;
import vv5.a0;
import bfb.c;
import bfb.a;
import erd.g;
import crd.b;
import t45.d;
import brd.z;
import bfb.g;
import bfb.h;
import java.lang.Integer;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import bfb.p;
import bfb.i;
import java.util.Collection;
import ekd.q;
import brd.a0;
import bfb.o;
import bfb.j;
import lnc.a1;
import lnc.o5;
import bfb.b;
import bfb.k;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge$a;
import qh7.c;
import bfb.e;
import bfb.l;
import com.facebook.react.bridge.ReactContext;
import lj0.c;
import lj0.d;
import bi5.a;
import bfb.d;
import bfb.m;
import bfb.f;
import bfb.n;

public class IMGroupSettingBridge extends KrnBridge	// class@001d7d
{

    public void IMGroupSettingBridge(ReactApplicationContext p0){
       super(p0);
    }
    public static void a(IMGroupSettingBridge p0,Promise p1,Boolean p2){
       p0.lambda$addGroupManagers$6(p1, p2);
    }
    public static void b(IMGroupSettingBridge p0,Promise p1,KwaiGroupJoinRequestResponse p2){
       p0.lambda$getJoinRequestInGroup$14(p1, p2);
    }
    public static void c(IMGroupSettingBridge p0,Promise p1,GroupManagerInfo p2){
       p0.lambda$getGroupMemberInfoByCount$2(p1, p2);
    }
    public static void d(IMGroupSettingBridge p0,Promise p1,Boolean p2){
       p0.lambda$setGroupInviteType$8(p1, p2);
    }
    public static void e(IMGroupSettingBridge p0,Promise p1,d p2){
       p0.lambda$getInactiveMemberInfos$12(p1, p2);
    }
    public static void f(IMGroupSettingBridge p0,Promise p1,Object p2){
       p0.lambda$setGroupMuteAll$10(p1, p2);
    }
    public static void g(IMGroupSettingBridge p0,Promise p1,Boolean p2){
       p0.lambda$removeGroupManagers$4(p1, p2);
    }
    private void lambda$addGroupManagers$6(Promise p0,Boolean p1){
       if (p0 != null) {
          if (p1.booleanValue()) {
             p0.resolve(this.convertObjToNativeMap(new JsSuccessResult(null)));
          }else {
             p0.reject("-1", "add managers error");
          }
       }
       return;
    }
    public static void lambda$addGroupManagers$7(Promise p0,Throwable p1){
       a.a(p1, p0);
    }
    public static void lambda$commitGroupNotice$0(String p0,Promise p1,Boolean p2){
       Object[] objArray;
       int i = 0;
       if (TextUtils.isEmpty(p0)) {
          objArray = new Object[i];
          i.d(R.style.arg_RES_7f110669, f.m(R.string.arg_RES_7f1034b8, objArray));
       }else {
          objArray = new Object[i];
          i.d(R.style.arg_RES_7f110669, f.m(R.string.arg_RES_7f1034b5, objArray));
       }
       if (p1 != null) {
          p1.resolve(null);
       }
       return;
    }
    public static void lambda$commitGroupNotice$1(Promise p0,Throwable p1){
       if (p1 != null) {
          int errorCode = (p1 instanceof KwaiIMException)? p1.getErrorCode(): 0;
          String str = d.a(-854594802).Sg(errorCode, p1.getMessage());
          if (!TextUtils.x(str)) {
             i.d(R.style.arg_RES_7f110668, str);
          }
          a.a(p1, p0);
       }
       return;
    }
    private void lambda$getGroupMemberInfoByCount$2(Promise p0,GroupManagerInfo p1){
       if (p0 != null) {
          p0.resolve(this.convertObjToNativeMap(new JsSuccessResult(p1)));
       }
       return;
    }
    public static void lambda$getGroupMemberInfoByCount$3(Promise p0,Throwable p1){
       a.a(p1, p0);
    }
    private void lambda$getInactiveMemberInfos$12(Promise p0,d p1){
       if (p0 != null) {
          p0.resolve(this.convertObjToNativeMap(new JsSuccessResult(p1)));
       }
       return;
    }
    public static void lambda$getInactiveMemberInfos$13(Promise p0,Throwable p1){
       a.a(p1, p0);
    }
    private void lambda$getJoinRequestInGroup$14(Promise p0,KwaiGroupJoinRequestResponse p1){
       if (p0 != null) {
          e uoe = new e(p1.getGroupId(), p1.getInviterUserId(), p1.getInviteeUserList(), p1.getDescContent(), p1.getFindType(), p1.getStatus());
          p0.resolve(this.convertObjToNativeMap(new JsSuccessResult(v7)));
       }
       return;
    }
    public static void lambda$getJoinRequestInGroup$15(Promise p0,Throwable p1){
       a.a(p1, p0);
    }
    private void lambda$removeGroupManagers$4(Promise p0,Boolean p1){
       if (p0 != null) {
          if (p1.booleanValue()) {
             p0.resolve(this.convertObjToNativeMap(new JsSuccessResult(null)));
          }else {
             p0.reject("-1", "remove managers error");
          }
       }
       return;
    }
    public static void lambda$removeGroupManagers$5(Promise p0,Throwable p1){
       a.a(p1, p0);
    }
    private void lambda$setGroupInviteType$8(Promise p0,Boolean p1){
       if (p0 != null) {
          p0.resolve(this.convertObjToNativeMap(new JsSuccessResult(null)));
       }
       return;
    }
    public static void lambda$setGroupInviteType$9(Promise p0,Throwable p1){
       a.a(p1, p0);
    }
    private void lambda$setGroupMuteAll$10(Promise p0,Object p1){
       if (p0 != null) {
          p0.resolve(this.convertObjToNativeMap(new JsSuccessResult(null)));
       }
       return;
    }
    public static void lambda$setGroupMuteAll$11(Promise p0,Throwable p1){
       a.a(p1, p0);
    }
    public static List splitUserIds(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IMGroupSettingBridge.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = p0.split(",");
       if (stringArray.length > 0) {
          return Arrays.asList(stringArray);
       }
       return Collections.emptyList();
    }
    public void addGroupManagers(String p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMGroupSettingBridge.class, "6")) {
          return;
       }
       this.reportAndCheck(this.getName(), "addGroupManagers", this.getReactApplicationContext());
       d.a(0x16b5eb97).Is(p0, 1, IMGroupSettingBridge.splitUserIds(p1)).subscribe(new c(this, p2), new a(p2));
       return;
    }
    public void commitGroupNotice(String p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMGroupSettingBridge.class, "2")) {
          return;
       }
       this.reportAndCheck(this.getName(), "commitGroupNotice", this.getReactApplicationContext());
       d.a(0x16b5eb97).VU(p0, p1, true, true).observeOn(d.a).subscribe(new g(p1, p2), new h(p2));
       return;
    }
    public void getGroupMemberInfo(String p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMGroupSettingBridge.class, "3")) {
          return;
       }
       this.reportAndCheck(this.getName(), "getGroupMemberInfo", this.getReactApplicationContext());
       this.getGroupMemberInfoByCount(p0, p1, Integer.valueOf(Integer.MAX_VALUE), p2);
       return;
    }
    public void getGroupMemberInfoByCount(String p0,String p1,Integer p2,Promise p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, IMGroupSettingBridge.class, "4")) {
          return;
       }
       this.reportAndCheck(this.getName(), "getGroupMemberInfoByCount", this.getReactApplicationContext());
       ArrayList uArrayList = Lists.b();
       if (TextUtils.x(p1)) {
          uArrayList.add(Integer.valueOf(2));
          uArrayList.add(Integer.valueOf(3));
          uArrayList.add(Integer.valueOf(1));
       }else {
          String[] stringArray = p1.split(",");
          int len = stringArray.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList.add(Integer.valueOf(Integer.parseInt(stringArray[i])));
          }
       }
       d.a(0x16b5eb97).Hf(p0, uArrayList, p2.intValue()).subscribe(new p(this, p3), new i(p3));
       return;
    }
    public void getInactiveMemberInfos(String p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMGroupSettingBridge.class, "10")) {
          return;
       }
       this.reportAndCheck(this.getName(), "getInactiveMemberInfos", this.getReactApplicationContext());
       if (TextUtils.x(p0)) {
          p2.reject("-1", "groupId is empty");
          return;
       }else if(!TextUtils.x(p1)){
          ArrayList uArrayList = Lists.e(p1.split(","));
          if (!q.f(uArrayList)) {
             d.a(0x16b5eb97).Dk(p0, uArrayList).R(new o(this, p2), new j(p2));
             return;
          }
       }
       p2.reject("-1", a1.p(R.string.arg_RES_7f1015ec));
       return;
    }
    public void getJoinRequestInGroup(String p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMGroupSettingBridge.class, "11")) {
          return;
       }
       this.reportAndCheck(this.getName(), "getJoinRequestInGroup", this.getReactApplicationContext());
       long l = o5.d(p1, -1);
       if (l <= 0) {
          p2.reject("-1", "param invalid");
          return;
       }else {
          d.a(0x16b5eb97).mn(p0, l).subscribe(new b(this, p2), new k(p2));
          return;
       }
    }
    public String getName(){
       return "IMGroupSettingBridge";
    }
    public void openUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMGroupSettingBridge.class, "1")) {
          return;
       }
       this.reportAndCheck(this.getName(), "openUrl", this.getReactApplicationContext());
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null) {
          return;
       }
       d.a(-854594802).Eh(b.j(currentActiv, p0), new IMGroupSettingBridge$a(this));
       return;
    }
    public void removeGroupManagers(String p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMGroupSettingBridge.class, "5")) {
          return;
       }
       this.reportAndCheck(this.getName(), "removeGroupManagers", this.getReactApplicationContext());
       d.a(0x16b5eb97).Is(p0, 2, IMGroupSettingBridge.splitUserIds(p1)).subscribe(new e(this, p2), new l(p2));
       return;
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMGroupSettingBridge.class, "12")) {
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
    public void setGroupInviteType(String p0,boolean p1,Promise p2){
       if (PatchProxy.isSupport(IMGroupSettingBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, IMGroupSettingBridge.class, "8")) {
          return;
       }
       this.reportAndCheck(this.getName(), "setGroupInviteType", this.getReactApplicationContext());
       d.a(0x16b5eb97).Bf(p0, p1).subscribe(new d(this, p2), new m(p2));
       return;
    }
    public void setGroupMuteAll(String p0,boolean p1,Promise p2){
       if (PatchProxy.isSupport(IMGroupSettingBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, IMGroupSettingBridge.class, "9")) {
          return;
       }
       this.reportAndCheck(this.getName(), "setGroupMuteAll", this.getReactApplicationContext());
       d.a(0x16b5eb97).l70(p0, p1).subscribe(new f(this, p2), new n(p2));
       return;
    }
}
