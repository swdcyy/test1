package com.yxcorp.gifshow.relation.util.c;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;
import java.lang.Boolean;
import com.kwai.social.startup.relation.model.SocialRelationConfig;
import java.lang.reflect.Type;
import mw4.a;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import hcc.j0;
import com.kwai.framework.model.user.QCurrentUser;
import lt7.b;
import o56.c;
import o56.a;
import xf6.i;
import v6d.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import ekd.k1;
import android.app.Activity;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Intent;
import ekd.j0;
import hcc.s;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import pu5.a;
import qu5.r;
import java.lang.Runnable;
import mz6.b;
import mz6.a;
import mz6.b$d;
import hcc.p;
import android.content.DialogInterface$OnClickListener;
import hcc.n;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y8c.g;
import hcc.r;
import hcc.o;
import androidx.fragment.app.Fragment;
import erd.g;
import hcc.q;
import hcc.m;
import qa6.a;
import jga.f$a;
import jga.c;
import wca.b;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import crd.b;

public final class c	// class@001a54
{
    public static String a = "0";
    public static String b = "follow_list_sort_type";
    public static String c = "follow_list_sort_tip_count";
    public static String d = "follow_list_enable_sort";
    public static String e = "minBundleVersion";
    public static String f = "follow_list_page_index";
    public static String g = "guest_follow_list_tip";
    public static String h = "fans_list_red_dot";
    public static String i = "follow_list_holdout";
    public static String j = "fans_list_alias";
    public static String k = "online_value";
    public static String l = "enable_remove_pymk";
    public static String m = "title";
    public static String n = "userId";
    public static String o = "pageIndex";
    public static String p = "recoTextInfo";
    public static String q = "pymkStyle";

    public void c(){
       super();
    }
    public static User a(){
       Object obj = PatchProxy.apply(null, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       User user = new User(c.a, "", "U", null, null);
       return obj;
    }
    public static void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "5")) {
          return;
       }
       int i = 0;
       int i1 = 0;
       while (i < p0.size()) {
          User user = p0.get(i);
          if (c.d(user)) {
             i1 = i1 + 1;
          }else {
             int i2 = i - i1;
             user.mPosition = i2;
          }
          i = i + 1;
       }
       return;
    }
    public static boolean c(){
       SocialRelationConfig obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.x(SocialRelationConfig.class);
       boolean b = true;
       if (HoldoutConfigUtilKt.a() || (obj == null || (obj.getAliasAbGroup() != b && obj.getAliasAbGroup() != 2))) {
          b = false;
       }
       return b;
    }
    public static boolean d(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (TextUtils.x(p0.getId()) || TextUtils.n(c.a, p0.getId())))? true: false;
       return b;
    }
    public static boolean e(User p0){
       p0 = p0.mMissUInfo;
       boolean b = (p0 != null && (p0.mShowMissYouButton != null && p0.mShowAlreadyMissUStatus != null))? true: false;
       return b;
    }
    public static void f(boolean p0,User p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uoc, "10")) {
          return;
       }
       j0.p(p1, p0, "");
       return;
    }
    public static boolean g(){
       long l;
       Object obj = PatchProxy.apply(null, null, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (QCurrentUser.ME.getFollowListVisibilityOption() == 2) {
          return b;
       }
       if (b.a() && !a.e()) {
          int i = (a.a().c())? i.g("fanFollowDialogLimit"): 0;
          if (i == 1) {
             l = 0x7530;
          }else if(i == 2){
             l = 0x1d4c0;
          }else {
             l = 0xf731400;
          }
          long l1 = 0;
          long longx = a.a.getLong(b.d("user")+"follow_fans_float_guide_show_time", l1);
          if (!longx - l1 || (longx + l) - k1.i() < 0) {
             b = true;
          }
       }
    label_007a :
       return b;
    }
    public static void h(User p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "6")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).ne(p1, j0.f(p1.getIntent(), "SOURCE"), "profile_message", 24, a.B.getString(R.string.arg_RES_7f10307c), null, p0, null, new s(p0, p1)).h();
          return;
       }else {
          d.a(-1497343380).MD(p1, p0);
          p1.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
          return;
       }
    }
    public static void i(User p0,Activity p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "9")) {
          return;
       }
       b uob = new b(p1);
       int i = 0x7f1003b8;
       int i1 = (p0.mIntimateRelationType > null)? 0x7f101705: 0x7f1003b8;
       a uoa = a.b();
       uoa.o(R.color.arg_RES_7f061a4c);
       uoa.g(i1);
       uoa.e(i);
       uob.a(uoa.a());
       a uoa1 = a.b();
       uoa1.i(0);
       uoa1.o(R.color.arg_RES_7f060751);
       uoa1.g(R.string.arg_RES_7f1003b9);
       uoa1.e(R.string.arg_RES_7f1003b9);
       uob.a(uoa1.a());
       uob.l(new p(p1, p2, p0));
       uob.k(new n(p0));
       uob.q();
       return;
    }
    public static void j(GifshowActivity p0,User p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "12")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       b uob = new b(p0);
       int i = (p1.mIntimateRelationType > null)? 0x7f10178c: 0x7f104278;
       if (p1.mVisitorBeFollowed != null) {
          a uoa = a.b();
          uoa.o(R.color.arg_RES_7f061a4c);
          uoa.g(i);
          uoa.e(i);
          uob.a(uoa.a());
       }
       a uoa1 = a.b();
       uoa1.i(0);
       uoa1.o(R.color.arg_RES_7f060751);
       uoa1.g(R.string.arg_RES_7f104279);
       uoa1.e(R.string.arg_RES_7f104279);
       uob.a(uoa1.a());
       uob.l(new r(p1, p0, p2));
       uob.k(new o(p1));
       uob.q();
       return;
    }
    public static void k(User p0,Activity p1,Fragment p2,g p3){
       int i;
       if (PatchProxy.applyVoidFourRefs(p0, p1, null, p3, null, c.class, "7")) {
          return;
       }
       b uob = new b(p1);
       if (p0.mIntimateRelationType > null) {
          i = 0x7f101703;
       }else if(p0.isFriend() || p0.mVisitorBeFollowed != null){
          i = (p0.isFemale())? 0x7f103fdc: 0x7f103fdd;
       }else {
          i = 0x7f104f07;
       }
       a uoa = a.b();
       uoa.o(R.color.arg_RES_7f061a4c);
       uoa.g(i);
       uoa.e(i);
       uob.a(uoa.a());
       a uoa1 = a.b();
       uoa1.i(0);
       uoa1.o(R.color.arg_RES_7f060751);
       uoa1.g(R.string.arg_RES_7f104f05);
       uoa1.e(R.string.arg_RES_7f104f05);
       uob.a(uoa1.a());
       uob.l(new q(p0, p1, p3));
       uob.k(new m(p0));
       uob.q();
       return;
    }
    public static boolean l(User p0){
       boolean b;
       User obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!a.b(p0)) {
          obj = p0.mMissUInfo;
          if (obj != null && (obj.mShowMissYouButton != null && (!p0.isBanned() && !p0.isBlocked()))) {
             b = true;
          label_0031 :
             return b;
          }
       }
    label_0030 :
       b = false;
       goto label_0031 ;
    }
    public static void m(User p0,Activity p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "8")) {
          return;
       }
       f$a uoa = new f$a(p0, p1.Q2());
       uoa.q(true);
       uoa.i(b.g(p0.mId));
       FollowHelper.k(uoa.b()).subscribe(p2);
       return;
    }
}
