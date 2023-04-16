package com.yxcorp.gifshow.profile.util.o;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.util.Set;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import android.os.Build$VERSION;
import wkd.b;
import o3c.a;
import brd.t;
import rfc.a;
import cjd.e;
import erd.o;
import z5c.f1;
import sfc.a;
import android.content.Context;
import erd.g;
import z5c.g1;
import android.app.Activity;
import java.lang.Integer;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import mxb.j;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import nx5.c;
import com.kwai.performance.stability.crash.monitor.util.a;
import k2b.e0;
import u3c.d;
import z5c.b1;
import jga.f$a;
import fka.e;
import jga.c;
import fka.f;
import f3b.o;
import jga.f;
import z5c.r0;
import z5c.s0;
import z5c.z0;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import u3c.d$c;
import z5c.t0;
import z5c.v0;
import z5c.w0;
import java.lang.StringBuilder;
import android.widget.TextView;
import java.lang.Number;
import pkd.a;
import lnc.o5;
import com.kwai.framework.model.user.UserProfile;
import a3c.c;
import com.kwai.sdk.switchconfig.a;
import u3c.h;
import com.yxcorp.gifshow.profile.model.Hometown;
import com.yxcorp.gifshow.profile.model.UserProfileMeta;
import u3c.i;
import java.lang.Long;
import ekd.l;
import x2c.a;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import android.text.TextUtils$TruncateAt;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.text.method.KeyListener;
import z5c.y1;
import k2b.h;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import z5c.y0;
import z5c.h1;
import z5c.x0;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import z5c.a1;
import com.yxcorp.gifshow.profile.model.UserMiddleButton;
import z5c.z1;
import xh7.b;
import qh7.b;
import qh7.a;
import pu5.a;
import qu5.r;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.Exception;
import z5c.d3;
import mz6.b;
import mz6.b$d;
import z5c.u0;
import z5c.q0;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import io.reactivex.internal.functions.Functions;
import s3c.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import z5c.c1;
import z5c.d1;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import z5c.e1;

public class o	// class@0015e0
{

    public void o(){
       super();
    }
    public static b A(GifshowActivity p0,User p1,ProfileParam p2,Set p3,boolean p4){
       String obj1;
       o oo = o.class;
       String obj = null;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          obj1 = PatchProxy.apply(objArray, obj, oo, "12");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p1 != null && (p0 == null || p2.mUserProfile == null)) {
          return obj;
       }else {
          obj1 = QCurrentUser.ME.getId();
          String id = p1.getId();
          String url = p0.getUrl();
          obj = p0.U2();
          t ot = (Build$VERSION.SDK_INT == 23)? b.a(0x4a7616ea).b(obj1, id, url, obj): b.a(0x4a533fa).b(obj1, id, url, obj);
          return ot.map(new e()).subscribe(new f1(p2, p3, p4, p0), new a(p0));
       }
    }
    public static int a(ProfileParam p0){
       p0 = p0.mPrePageId;
       if (p0 == 7) {
          return 1;
       }
       if (p0 == 82 || p0 == 90) {
          return 2;
       }
       return 0;
    }
    public static b b(GifshowActivity p0,User p1,ProfileParam p2,Set p3){
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, o.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null && (p0 == null || p2.mUserProfile == null)) {
          return null;
       }
       obj = QCurrentUser.ME.getId();
       String id = p1.getId();
       String url = p0.getUrl();
       String str = p0.U2();
       t ot = (Build$VERSION.SDK_INT == 23)? b.a(0x4a7616ea).a(obj, id, url, str): b.a(0x4a533fa).a(obj, id, url, str);
       return ot.map(new e()).subscribe(new g1(p1, p0, p2, p3), new a(p0));
    }
    public static boolean c(Activity p0,int p1,User p2,String p3){
       int i1;
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, null, o.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == null) {
          return true;
       }else {
          int i = 0;
          if (!QCurrentUser.ME.isLogined()) {
             String str = (p3 == null)? "": p3;
             Object[] objArray = new Object[]{p2.getId(),str,"7"};
             String str1 = String.format("%1$s_%2$s_p%3$s", objArray);
             a.B.getString(p1);
             if (p1 == 0x7f103074) {
                i1 = 32;
             }else if(p1 == 0x7f10307e){
                i1 = 31;
             }else {
                i1 = 0;
             }
             d.a(-1712118428).ne(p0, j0.e(p0.getIntent(), "SOURCE"), str1, i1, "", null, p2, null, null).h();
             return true;
          }else {
             return i;
          }
       }
    }
    public static j d(ProfileParam p0,User p1){
       j obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i0.a().g(p0.mReferPhoto.mEntity);
       if (TextUtils.n(p0.mPhotoSceneType, "COCREATE")) {
          obj.l("co_creator_user_id", p1.getId());
       }
       return obj;
    }
    public static String e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Pattern.compile("^\\s+").matcher(p0).replaceAll("");
    }
    public static b f(GifshowActivity p0,User p1,ProfileParam p2,boolean p3,String p4){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, null, oo, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return o.g(p0, p1, p2, p3, false, p4, new a(p0));
    }
    public static b g(GifshowActivity p0,User p1,ProfileParam p2,boolean p3,boolean p4,String p5,g p6){
       Object obj = null;
       if (PatchProxy.isSupport2(o.class, "14")) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),p5,p6};
          Object obj1 = PatchProxy.apply(objArray, obj, o.class, "14");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p0 != null && (p1 == null || p2.mUserProfile == null)) {
          PatchProxy.onMethodExit(o.class, "14");
          return obj;
       }else {
          int i = 0x37332120;
          if (p3) {
             PatchProxy.onMethodExit(o.class, "14");
             return d.a(i).Uf(p0, p1, p4, true, p5).subscribe(a.b, p6);
          }else {
             PatchProxy.onMethodExit(o.class, "14");
             return d.a(i).tQ(p0, p1, p4, true, p5).subscribe(a.b);
          }
       }
    }
    public static void h(e0 p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, o.class, "3")) {
          return;
       }
       d a = p1.a;
       if (a != null) {
          d b = p1.b;
          if (b != null) {
             b.mPage = "profile";
             String str = j0.f(a.getIntent(), "SOURCE");
             if (!QCurrentUser.ME.isLogined()) {
                String str1 = a.B.getString(R.string.arg_RES_7f103077);
                int i = (!TextUtils.x(p1.a.U2()) && (p1.a.U2()).contains("liker"))? 21: 26;
                d.a(-1712118428).ne(p1.a, str, "profile_follow", i, str1, null, p1.b, null, new b1(p0, p1, str)).h();
             }else {
                o.i(p0, p1, str);
             }
          }
       }
       return;
    }
    public static void i(e0 p0,d p1,String p2){
       c uoc;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, o.class, "4")) {
          return;
       }
       if (p1.d != p1.b.isFollowingOrFollowRequesting()) {
          String str = (TextUtils.x(p1.i))? p1.a.Q2(): p1.i;
          f$a uoa = new f$a(p1.b, str);
          uoa.m = p1.j;
          uoa.c(p2);
          boolean b = true;
          uoa.A = b;
          uoa.t = 0x7f100221;
          uoa.o(p1.a.getUrl());
          uoa.f(p1.c.mPhotoExpTag);
          int i = 4;
          d b1 = p1.b;
          ProfileParam mBaseFeed = p1.c.mBaseFeed;
          if (PatchProxy.isSupport(e.class)) {
             uoc = PatchProxy.applyThreeRefs(Integer.valueOf(i), b1, mBaseFeed, null, e.class, "23");
             if (uoc != PatchProxyResult.class) {
             }else if(mBaseFeed == null && b1 != null){
                e c1 = e.a().c;
                while (e.g(c1)) {
                   c1 = c1.f;
                }
                if (c1 != null && (e.h(c1) && c1.a() != null)) {
                   uoc = c1.a();
                   uoc.f(o.i(i));
                   if (TextUtils.x(uoc.b)) {
                      uoc.a(b1.getId());
                   }
                }
             }
             uoc = null;
          }else {
             goto label_0077 ;
          }
          uoa.i(uoc);
          uoa.q(b);
          if (p1.d != null) {
             p0.mProfileFollow = b;
             FollowHelper.e(uoa.b(), new r0(p1), new s0(p1), new z0(p1));
          }else {
             d g = p1.g;
             if (g == null || !g.a(uoa.b())) {
                o.x(p0, p1, uoa.b());
             }
          }
       }
       if (p1.d != null) {
          ProfileParam mReferPhoto = p1.c.mReferPhoto;
          if (mReferPhoto != null && (mReferPhoto.mEntity != null && !mReferPhoto.isLiveStream())) {
             i0.a().p(121, o.d(p1.c, p1.b)).d(new t0(p1)).a();
          }else {
             d c = p1.c;
             ProfileParam mReferPhoto1 = c.mReferPhoto;
             if (mReferPhoto1 != null && mReferPhoto1.mEntity != null) {
                i0.a().e(300, p1.c.mReferPhoto.mEntity).d(new v0(p1)).a();
             }else if(c.mBaseFeed != null){
                i0.a().e(300, p1.c.mBaseFeed).d(new w0(p1)).a();
             }
          }
       }
       return;
    }
    public static String j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return p0;
       }
       String[] stringArray = p0.split("\n");
       StringBuilder str = "";
       int i = 0;
       while (i < stringArray.length) {
          object oobject = stringArray[i];
          if (TextUtils.n("\n", oobject)) {
             oobject = "";
          }
          if (oobject != null && !TextUtils.x(oobject.trim())) {
             str = str+o.e(oobject);
             int i1 = stringArray.length - 1;
             if (i < i1) {
                str = str+"\n";
             }
          }
          i = i + 1;
       }
       return str;
    }
    public static String k(String p0,int p1,TextView p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, o.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0)) {
          return p0;
       }else {
          String[] stringArray = p0.split("\n");
          StringBuilder str = "";
          int i = 0;
          String str1 = null;
          int i1 = 0;
          while (i < stringArray.length) {
             object oobject = stringArray[i];
             if (TextUtils.n("\n", oobject)) {
                oobject = "";
             }
             int i2 = 1;
             if (oobject != null && !TextUtils.x(oobject.trim())) {
                str = str+o.e(oobject);
                i1 = i1 + o.p(o.e(oobject), p2, p2.getWidth());
                int i3 = stringArray.length - i2;
                if (i < i3 && i1 < p1) {
                   str = str+"\n";
                }else {
                   i3 = stringArray.length - i2;
                   if (i < i3) {
                      str = str+" ";
                      str1 = 1;
                   }
                }
             }
             i = i + 1;
          }
          if (str1 != null) {
             str = str+"\n";
          }
          return str;
       }
    }
    public static long l(){
       String obj = PatchProxy.apply(null, null, o.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = a.e;
       if (obj == null) {
          return 0;
       }
       return o5.c(obj.replace(".", ""));
    }
    public static int m(User p0,UserProfile p1){
       boolean b1;
       String str1;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, c.class, "4");
       String str = "3";
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(!c.c(p0)){
          obj = PatchProxy.applyOneRefs(p0, null, c.class, str);
          b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): TextUtils.n("M", p0.getSex());
          if (!b1) {
             b1 = false;
          }
       }
       b1 = true;
       b1 = (b1)? 2: 0;
       if (a.t().d("enableNewEditProfilePage", b)) {
          if (c.a(p1)) {
             b1 = b1 + 1;
          }
          UserProfileMeta userProfileM = PatchProxy.applyOneRefs(p1, null, h.class, "28");
          if (userProfileM != PatchProxyResult.class) {
          }else if(p1 != null){
             userProfileM = i.c(p1);
             if (userProfileM != null) {
                userProfileM = userProfileM.mHometown;
             }
          }
          userProfileM = null;
          if (userProfileM != null && (!TextUtils.x(userProfileM.getCityName()) && !TextUtils.x(userProfileM.getCityCode()))) {
             b1 = b1 + 1;
          }
       }else if(c.a(p1)){
          b1 = b1 + 2;
       }
       UserProfile obj1 = PatchProxy.applyOneRefs(p1, null, c.class, "5");
       if (obj1 != PatchProxyResult.class) {
          boolean b2 = obj1.booleanValue();
       }else {
          obj1 = PatchProxy.applyOneRefs(p1, null, c.class, "6");
          if (obj1 != PatchProxyResult.class) {
          }else if(p1 == null || (!TextUtils.n(p1.mAgePrivacy, "1") && (!TextUtils.n(p1.mAgePrivacy, "2") && !TextUtils.n(p1.mAgePrivacy, str)))){
             if (!TextUtils.x(p1.mConstellation)) {
                str1 = p1.mConstellation;
             }else if(!TextUtils.x(p1.mBirthday)){
                try{
                   str1 = l.b(a.b(), (Long.valueOf(p1.mBirthday).longValue() * 100));
                }catch(java.lang.NumberFormatException e0){
                }
             }
          }
          str1 = "";
       }
       if (b2) {
          b1 = b1 + 2;
       }
       Object obj2 = PatchProxy.applyOneRefs(p0, null, c.class, "8");
       boolean b3 = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): TextUtils.x(p0.getText()) ^ 1;
       if (b3) {
          b1 = b1 + 2;
       }
       if (p1.mIsDefaultHead == null) {
          b1 = b1 + 1;
       }
       b3 = PatchProxy.applyOneRefs(p1, null, c.class, "9");
       b3 = (b3 != PatchProxyResult.class)? b3.booleanValue(): a.g(p1);
       if (!b3) {
          b1 = b1 + 1;
       }
       return (b1 * 10);
    }
    public static StaticLayout n(CharSequence p0,TextView p1,int p2){
       Object obj;
       if (PatchProxy.isSupport(o.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, o.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       StaticLayout staticLayout = new StaticLayout(p0, 0, p0.length(), p1.getPaint(), p2, Layout$Alignment.ALIGN_NORMAL, p1.getLineSpacingMultiplier(), p1.getLineSpacingExtra(), p1.getIncludeFontPadding(), p1.getEllipsize(), p2);
       return obj;
    }
    public static StaticLayout o(CharSequence p0,TextView p1,int p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, o.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       StaticLayout$Builder uBuilder = StaticLayout$Builder.obtain(p0, 0, p0.length(), p1.getPaint(), p2).setAlignment(Layout$Alignment.ALIGN_NORMAL).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setLineSpacing(p1.getLineSpacingExtra(), p1.getLineSpacingMultiplier()).setIncludePad(p1.getIncludeFontPadding()).setBreakStrategy(p1.getBreakStrategy()).setHyphenationFrequency(p1.getHyphenationFrequency());
       int i = (p1.getMaxLines() == -1)? Integer.MAX_VALUE: p1.getMaxLines();
       uBuilder = uBuilder.setMaxLines(i);
       if (Build$VERSION.SDK_INT >= 26) {
          uBuilder.setJustificationMode(p1.getJustificationMode());
       }
       if (p1.getEllipsize() != null && p1.getKeyListener() == null) {
          uBuilder.setEllipsize(p1.getEllipsize()).setEllipsizedWidth(p2);
       }
       return uBuilder.build();
    }
    public static int p(CharSequence p0,TextView p1,int p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, o.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p2 = (p2 - p1.getCompoundPaddingLeft()) - p1.getCompoundPaddingRight();
       StaticLayout staticLayout = (Build$VERSION.SDK_INT >= 23)? o.o(p0, p1, p2): o.n(p0, p1, p2);
       return staticLayout.getLineCount();
    }
    public static b q(GifshowActivity p0,User p1,ProfileParam p2,Set p3,String p4,String p5){
       Object obj1;
       Boolean tRUE;
       b uob;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       int i = 6;
       Object obj = null;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[i4] = oobject1;
          objArray[i3] = oobject2;
          objArray[i2] = oobject3;
          objArray[i1] = oobject4;
          obj1 = PatchProxy.apply(objArray, obj, oo, "8");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = 1;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray1 = new Object[]{p0,oobject,oobject1,oobject2,tRUE,tRUE,oobject3,oobject4};
          tRUE = Boolean.TRUE;
          uob = PatchProxy.apply(objArray1, obj, oo, "9");
          if (uob != patchProxyRe) {
          label_00cd :
             return uob;
          }
       }
       String id = p1.getId();
       if (!PatchProxy.applyVoidThreeRefs(id, p4, p5, null, y1.class, "11")) {
          h oh = h.j(1209);
          oh.e("click_vote");
          i3 oi3 = i3.f();
          oi3.d("loc", oobject3);
          oi3.d("is_click", oobject4);
          oh.n(oi3.e());
          oh.c(b0.a(id));
          oh.h();
       }
       ProfileParam mUserProfile = oobject1.mUserProfile;
       if (mUserProfile != null) {
          oobject.mMissUInfo = h.j(mUserProfile);
       }
       uob = d.a(0x37332120).eU(p0, p1, 0, obj1, 1).subscribe(new y0(oobject2), new h1(oobject, oobject2));
       goto label_00cd ;
    }
    public static void r(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, o.class, "22")) {
          return;
       }
       int i = (p0.isLiveStream())? 741: 125;
       j0 oj0 = i0.a().e(i, p0.mEntity);
       if (!TextUtils.x(p1)) {
          oj0.d(new x0(p1));
       }
       oj0.a();
       return;
    }
    public static void s(User p0,Activity p1,boolean p2,UserProfile p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, o.class, "29")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          LoginParams$a uoa = new LoginParams$a();
          uoa.d(a1.p(R.string.arg_RES_7f10307c));
          uoa.c(24);
          d.a(-1712118428).x00(p1, 24, uoa.a(), new a1(p0, p1, p2, p3));
          return;
       }else {
          UserMiddleButton userMiddleBu = z1.a(p3);
          if (userMiddleBu != null && !TextUtils.x(userMiddleBu.mLinkUrl)) {
             a.b(b.j(p1, userMiddleBu.mLinkUrl), null);
          }else if(p2){
             a.b(b.j(p1, "kwai://chat/session?sessionId="+p0.getId()+"&pageStyle="+1), null);
          }else {
             d.a(-1497343380).MD(p1, p0);
             p1.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
          }
          return;
       }
    }
    public static void t(List p0,int p1,String p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, o.class, "26")) {
          return;
       }
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             try{
                qPhoto.setSource(p1);
                qPhoto.setListLoadSequenceID(p2);
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
                goto label_0024 ;
             }
          }
       }
       return;
    }
    public static boolean u(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.isAd())? true: false;
       return b;
    }
    public static boolean v(UserProfile p0,User p1){
       UserProfileMissUInfo obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = h.j(p0);
       boolean b = (!(p1.getId()).equals(QCurrentUser.ME.getId()) && (!d3.d(p1, p0) && (obj != null && obj.mShowMissYouButton != null)))? true: false;
       return b;
    }
    public static boolean w(UserProfile p0,User p1){
       UserProfileMissUInfo obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = h.j(p0);
       boolean b = (!(p1.getId()).equals(QCurrentUser.ME.getId()) && (!d3.d(p1, p0) && (obj != null && (obj.mShowMissYouButton != null && obj.mShowMissYouButtonUnFollow != null))))? true: false;
       return b;
    }
    public static void x(e0 p0,d p1,f p2){
       b$d uod;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, o.class, "7")) {
          return;
       }
       b uob = new b(p1.a);
       if (!TextUtils.x(p1.f)) {
          uod = new b$d(p1.f, null, a1.a(0x7f0601b9));
          uod.h(R.dimen.arg_RES_7f070f70);
          uob.a(uod);
       }
       String id = p1.b.getId();
       d f = p1.f;
       String str = (f == null)? "": String.valueOf(f);
       y1.f0(id, str, p1.h, "BOTTOM");
       uod = new b$d(0x7f104f05, -1, 0x7f0604d9);
       uod.h(R.dimen.arg_RES_7f070f73);
       uob.a(uod);
       ProfileParam mReferPhoto = p1.c.mReferPhoto;
       if (mReferPhoto != null && (mReferPhoto.mEntity != null && !mReferPhoto.isLiveStream())) {
          i0.a().p(122, o.d(p1.c, p1.b)).d(new u0(p1)).a();
       }
    label_0091 :
       uob.l(new q0(p0, p1, p2));
       uob.q();
       return;
    }
    public static void y(e0 p0,User p1,ProfileParam p2,f p3,Set p4,CharSequence p5,boolean p6,String p7){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p7;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,p4,p5,Boolean.valueOf(p6),oobject4};
          if (PatchProxy.applyVoid(objArray, null, oo, "6")) {
             return;
          }
       }
       oobject2.mProfileFollow = true;
       FollowHelper.k(p3).subscribe(Functions.d(), Functions.d());
       if (p4 != null && !p4.isEmpty()) {
          Iterator iterator = p4.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       i3 oi3 = i3.f();
       String str = (p6)? "FRIENDS": "FOLLOWING";
       oi3.d("follow_relation", str);
       if (!TextUtils.x(p7)) {
          oi3.d("dialog_loc", oobject4);
       }
       String str1 = oi3.e();
       String id = p1.getId();
       String str2 = TextUtils.j(p5).toString();
       if (!PatchProxy.applyVoidFourRefs(p0, str1, id, str2, null, y1.class, "10")) {
          ClientContent$ContentPackage uContentPack = b0.b(id, 1);
          if (!TextUtils.x(str2) && str2.length() > 2) {
             uContentPack.userPackage.params = str2.substring(2);
          }
          h oh = h.j(32);
          oh.e("profile_unfollow");
          oh.n(str1);
          oh.e = 2;
          oh.c(uContentPack);
          oh.i(oobject);
       }
       ProfileParam mReferPhoto = oobject2.mReferPhoto;
       if (mReferPhoto != null && !mReferPhoto.isLiveStream()) {
          i0.a().p(123, o.d(oobject2, oobject1)).d(new c1(oobject2)).a();
       }else {
          int i = 304;
          if (oobject2.mReferPhoto != null) {
             i0.a().e(i, oobject2.mReferPhoto.mEntity).d(new d1(oobject2, oobject3)).a();
          }else {
             mReferPhoto = oobject2.mBaseFeed;
             if (mReferPhoto != null && mReferPhoto instanceof LiveStreamFeed) {
                i0.a().e(i, oobject2.mBaseFeed).d(new e1(oobject2, oobject3)).a();
             }
          }
       }
       return;
    }
    public static b z(GifshowActivity p0,User p1,ProfileParam p2,Set p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, o.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.A(p0, p1, p2, p3, false);
    }
}
