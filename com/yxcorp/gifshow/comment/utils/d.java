package com.yxcorp.gifshow.comment.utils.d;
import nx9.c;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import com.kuaishou.android.model.mix.QSubComment;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import lnc.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.yxcorp.gifshow.entity.QPhoto;
import vca.i;
import com.kwai.framework.model.user.User;
import lu7.f;
import fya.f;
import android.widget.TextView;
import android.text.StaticLayout;
import java.lang.Integer;
import android.os.Build$VERSION;
import android.text.TextPaint;
import android.text.StaticLayout$Builder;
import android.text.Layout$Alignment;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils$TruncateAt;
import android.text.method.KeyListener;
import android.app.Activity;
import erd.g;
import java.util.HashMap;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import mu5.a;
import com.yxcorp.gifshow.activity.GifshowActivity$AnchorPoint;
import android.view.Window;
import android.view.View;
import vu5.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.detail.slideplay.c;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import java.lang.Boolean;
import la6.a;
import java.lang.Throwable;
import zb6.a;
import hl9.a0;
import java.lang.Runnable;
import com.yxcorp.gifshow.model.response.CommentResponse;
import java.util.Map;
import java.util.Iterator;
import java.lang.Math;

public final class d	// class@00110d
{
    public static final int a;
    public static final String b;

    static {
       int i = (c.e())? 20: 10;
       d.a = i;
       d.b = "commentPermissionTextNumber"+QCurrentUser.ME.getId();
    }
    public void d(){
       super();
    }
    public static void a(QComment p0){
       int i1;
       d uod = d.class;
       QSubComment obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uod, "8")) {
          return;
       }
       p0.getEntity().mHasCollapseSub = true;
       int i = 0;
       if (p0.hasSub() && p0.mSubCommentVisible == null) {
          p0 = p0.mSubComment;
          if (!PatchProxy.applyVoidOneRefs(p0, obj, uod, "5") && !q.f(p0.mComments)) {
             for (; i < p0.mComments.size(); i = i + 1) {
                p0.mComments.get(i).getEntity().mIsHide = true;
             }
          }
       }else {
          p0 = p0.mSubComment;
          if (!PatchProxy.applyVoidOneRefs(p0, obj, uod, "1")) {
             QSubComment obj1 = PatchProxy.applyOneRefs(p0, obj, uod, "9");
             if (obj1 != PatchProxyResult.class) {
                i1 = obj1.intValue();
             }else {
                obj1 = p0.mComments;
                if (obj1 != null && obj1.size()) {
                   QComment mParent = p0.mComments.get(i).mParent;
                   if (mParent != null) {
                      i1 = mParent.getEntity().mShowChildCount;
                   }
                }
                i1 = 3;
             }
             obj = p0.mComments;
             if (obj != null && obj.size() > i1) {
                for (; i1 < p0.mComments.size(); i1 = i1 + 1) {
                   p0.mComments.get(i1).getEntity().mIsHide = true;
                }
             }
          }
       }
       return;
    }
    public static int b(CharSequence p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, d.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.x(p0)) {
          return d.a;
       }
       obj = new ArrayList();
       Matcher matcher = c0.a.matcher(p0);
       int i = 0;
       while (matcher.find()) {
          obj.add(matcher.group(i));
       }
       int i1 = d.a - obj.size();
       if (i1 >= 0) {
          i = i1;
       }
       return i;
    }
    public static int c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (!p0.isAd() && !i.d(p0))? 1: 0;
       return i;
    }
    public static String d(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.a(p0.getUser())+":  "+f.a(p0.mComment, p0);
    }
    public static String e(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.a(p0.mComment, p0);
    }
    public static int f(QSubComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null || p0.mComments == null) {
          return i;
       }
       int i1 = 0;
       while (i < p0.mComments.size()) {
          if (p0.mComments.get(i).getEntity().mIsHide == null) {
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       return i1;
    }
    public static StaticLayout g(TextView p0,CharSequence p1,int p2){
       StaticLayout obj;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, d.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 23) {
          StaticLayout$Builder uBuilder = StaticLayout$Builder.obtain(p1, 0, p1.length(), p0.getPaint(), p2).setAlignment(Layout$Alignment.ALIGN_NORMAL).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setLineSpacing(p0.getLineSpacingExtra(), p0.getLineSpacingMultiplier()).setIncludePad(p0.getIncludeFontPadding()).setBreakStrategy(p0.getBreakStrategy()).setHyphenationFrequency(p0.getHyphenationFrequency());
          if (sDK_INT >= 26) {
             uBuilder.setJustificationMode(p0.getJustificationMode());
          }
          if (p0.getEllipsize() != null && p0.getKeyListener() == null) {
             uBuilder.setEllipsize(p0.getEllipsize()).setEllipsizedWidth(p2);
          }
          return uBuilder.build();
       }else {
          obj = new StaticLayout(p1, 0, p1.length(), p0.getPaint(), p2, Layout$Alignment.ALIGN_NORMAL, p0.getLineSpacingMultiplier(), p0.getLineSpacingExtra(), p0.getIncludeFontPadding(), p0.getEllipsize(), p2);
          return v12;
       }
    }
    public static void h(Activity p0,QPhoto p1,QComment p2,User p3){
       object oobject;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "18")) {
          return;
       }
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,oobject,oobject};
          oobject = null;
          if (PatchProxy.applyVoid(objArray, oobject, uod, "16")) {
          label_0041 :
             return;
          }
       }
       d.i(p0, p1, p2, p3, null, null, null);
       goto label_0041 ;
    }
    public static void i(Activity p0,QPhoto p1,QComment p2,User p3,g p4,HashMap p5,String p6){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, uod, "17")) {
             return;
          }
       }
       if (p3 == null) {
          return;
       }else if(!p0 instanceof GifshowActivity){
          return;
       }else if(p1.isAd()){
          d.a(-764940503).tp(p0, p1, p2, p3, p4, p5);
          return;
       }else {
          d.j(p0, p1, p2, p3, p4, p5, p6);
          return;
       }
    }
    public static void j(GifshowActivity p0,QPhoto p1,QComment p2,User p3,g p4,HashMap p5,String p6){
       Object[] objArray;
       boolean i = 1;
       int i1 = 2;
       int i2 = 0;
       if (PatchProxy.isSupport2(d.class, "20")) {
          objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, d.class, "20")) {
             return;
          }
       }
       objArray = new Object[i1];
       objArray[i2] = p2.getId();
       objArray[i] = p3.getId();
       p0.m3(String.format("c_%s_%s_avatar", objArray));
       p0.n3(GifshowActivity$AnchorPoint.AT_USER_IN_COMMENT);
       View decorView = p0.getWindow().getDecorView();
       int b = TextUtils.n(QCurrentUser.ME.getId(), p1.getUserId());
       i = TextUtils.n(p3.getId(), p1.getUserId());
       if (!TextUtils.n(p0.U2(), "ks://message")) {
          if (!i) {
             i2 = (b)? 43: 44;
          }
       label_0081 :
          decorView.setTag(R.id.tag_view_refere, Integer.valueOf(i2));
       }else if(i){
          b = 33;
       }else {
          b = 34;
       }
       decorView.setTag(R.id.tag_view_refere, Integer.valueOf(b));
       ProfileStartParam profileStart = ProfileStartParam.l(p3);
       profileStart.x(p1.mEntity);
       profileStart.r(decorView);
       profileStart.q(c.e(p1));
       profileStart.p(p4);
       ProfileStartParam profileStart1 = profileStart.n(ProfileExtraKey.AD_CALLBACK_PARAM, p6);
       profileStart1.D(p5);
       d.a(-1718536792).Y7(p0, profileStart1);
       p0.m3(null);
       PatchProxy.onMethodExit(d.class, "20");
       return;
    }
    public static boolean k(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       QSubComment mCursor = (p0.hasSub())? p0.mSubComment.mCursor: "";
       return a.a(mCursor);
    }
    public static boolean l(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.b(p0) == 0x20f5d)? true: false;
       return b;
    }
    public static void m(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "30")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.post(new a0(p0));
       return;
    }
    public static boolean n(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.isSub()) {
          if (p0.mParent.created() && p0.created()) {
             b = true;
          }
          return b;
       }else if(p0.created()){
          b = true;
       }
       return b;
    }
    public static void o(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "3")) {
          return;
       }
       d.p(p0, 0);
       return;
    }
    public static void p(QComment p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uod, "4")) {
          return;
       }
       p0.getEntity().mHasCollapseSub = false;
       p0 = p0.mSubComment;
       if (!q.f(p0.mComments)) {
          int i = 0;
          while (i < p0.mComments.size()) {
             if (p0.mComments.get(i).getEntity().mIsHide != null) {
                p0.mComments.get(i).getEntity().mIsHide = false;
                if (p1 > 0) {
                   p1--;
                   if (p1) {
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public static void q(QComment p0,CommentResponse p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, uod, "10")) {
          return;
       }
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.FALSE, null, d.class, "12")) {
          QComment qComment = 3;
          CommentResponse mSubCommentM = p1.mSubCommentMap;
          if (mSubCommentM != null && mSubCommentM.get(p0.getId()) != null) {
             QSubComment qSubComment = p1.mSubCommentMap.get(p0.getId());
             p0.getEntity().mHasCollapseSub = p0.mSubCommentVisible ^ 1;
             QSubComment mComments = qSubComment.mComments;
             if (mComments != null && mComments.size() > 0) {
                if (p0.mSubCommentVisible == null) {
                   qComment = qSubComment.mComments.size();
                   Iterator iterator = qSubComment.mComments.iterator();
                   while (iterator.hasNext()) {
                      QComment qComment1 = iterator.next();
                      qComment1.mParent = p0;
                      qComment1.getEntity().mIsHide = true;
                   }
                }else {
                   qComment = Math.min(p0.mSubCommentVisibleLimit, qSubComment.mComments.size());
                   int b = false;
                   for (int i = 0; i < qComment; i = i + 1) {
                      qSubComment.mComments.get(i).mParent = p0;
                      qSubComment.mComments.get(i).getEntity().mIsHide = b;
                   }
                   for (b = qComment; b < qSubComment.mComments.size(); b = b + 1) {
                      qSubComment.mComments.get(b).mParent = p0;
                      qSubComment.mComments.get(b).getEntity().mIsHide = true;
                   }
                }
                p0.mSubComment = qSubComment;
             }
             if (a.a(qSubComment.mCursor)) {
                p0.mSubComment = qSubComment;
             }
          }
       label_00d2 :
          p0.mShowChildCount = qComment;
       }
       return;
    }
}
