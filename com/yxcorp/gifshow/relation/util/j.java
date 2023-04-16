package com.yxcorp.gifshow.relation.util.j;
import mx5.b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import hcc.k0;
import android.content.Context;
import ou7.h$b;
import ou7.h;
import hcc.j0;
import mz6.b;
import com.kwai.robust.PatchProxyResult;
import mz6.a;
import mz6.b$d;
import com.kwai.component.misc.report.ReportInfo;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kwai.component.misc.report.ReportActivity;
import jga.f$a;
import jga.c;
import wca.b;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import com.yxcorp.gifshow.relation.util.i;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import pu5.a;
import qu5.r;
import hcc.m0;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.util.f;
import ekd.p0;
import e17.i;
import java.lang.StringBuilder;
import mac.j;
import hcc.l0;
import sfc.a;
import android.graphics.drawable.Drawable;
import zf6.j;
import lu7.f;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import java.lang.CharSequence;

public class j implements b	// class@001a5d
{

    public void j(){
       super();
    }
    public void a(GifshowActivity p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "12")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
       profilePacka.visitedUid = p1.getId();
       uContentPack.profilePackage = profilePacka;
       h.b(p0, p1, uContentPack, new k0(p1));
       return;
    }
    public void b(User p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "17")) {
          return;
       }
       j0.n(p0, p1);
       return;
    }
    public b c(Context p0,User p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "8");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       b uob = new b(p0);
       a uoa = a.b();
       uoa.o(R.color.arg_RES_7f061a4c);
       uoa.g(R.string.arg_RES_7f1003b8);
       uoa.e(R.string.arg_RES_7f1003b8);
       uob.a(uoa.a());
       uoa = a.b();
       uoa.i(0);
       uoa.o(R.color.arg_RES_7f060751);
       uoa.g(R.string.arg_RES_7f1003b9);
       uoa.e(R.string.arg_RES_7f1003b9);
       uob.a(uoa.a());
       return uob;
    }
    public void d(GifshowActivity p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "10")) {
          return;
       }
       ReportInfo reportInfo = new ReportInfo();
       reportInfo.mRefer = p0.getUrl();
       reportInfo.mPreRefer = p0.U2();
       reportInfo.mSourceType = "user";
       reportInfo.mReportedUserId = p1.getId();
       ReportActivity.P3(p0, WebEntryUrls.k, reportInfo);
       return;
    }
    public void e(GifshowActivity p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "14")) {
          return;
       }
       f$a uoa = new f$a(p1, p0.Q2());
       uoa.q(true);
       uoa.i(b.g(p1.mId));
       FollowHelper.k(uoa.b()).subscribe(Functions.d(), Functions.d());
       return;
    }
    public a f(Context p0,User p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a uoa = a.b();
       uoa.i(0);
       uoa.g(R.string.arg_RES_7f104f05);
       uoa.e(R.string.arg_RES_7f104f05);
       uoa.o(R.color.arg_RES_7f060751);
       return uoa;
    }
    public void g(GifshowActivity p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "11")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).ne(p0, j0.f(p0.getIntent(), "SOURCE"), "profile_message", 24, a.B.getString(R.string.arg_RES_7f10307c), null, p1, null, new i(this, p0, p1)).h();
          return;
       }else {
          d.a(-1497343380).MD(p0, p1);
          p0.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
          return;
       }
    }
    public a h(Context p0,User p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a uoa = a.b();
       uoa.i(0);
       int i = (p1.isBlocked())? 0x7f104ef9: 0x7f1003b7;
       uoa.e(i);
       uoa.o(R.color.arg_RES_7f060751);
       uoa.g(R.string.arg_RES_7f1003b7);
       return uoa;
    }
    public void i(GifshowActivity p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "9")) {
          return;
       }
       f.a(p0, new m0(p1), p1);
       return;
    }
    public void j(GifshowActivity p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "13")) {
          return;
       }
       if (!p0.C(p0)) {
          i.a(R.style.arg_RES_7f110669, 0x7f1038e7);
          return;
       }else if(p1.mIsBanned != null){
          i.a(R.style.arg_RES_7f110668, 0x7f104fc8);
          return;
       }else {
          f$a uoa = new f$a(p1, p0.Q2()+","+219+","+2);
          uoa.i(b.h(p1.getId(), 21));
          f$a uoa1 = uoa.h(p1.mFollowActionReasonTextId);
          uoa1.o(p0.getUrl());
          uoa1.q(true);
          FollowHelper.b(uoa1.b());
          return;
       }
    }
    public b k(Context p0,User p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b(p0);
       int i = (p1.isFemale())? 0x7f103fdc: 0x7f103fdd;
       a uoa = a.b();
       uoa.o(R.color.arg_RES_7f061a4c);
       uoa.g(i);
       uoa.e(i);
       obj.a(uoa.a());
       a uoa1 = a.b();
       uoa1.i(0);
       uoa1.o(R.color.arg_RES_7f060751);
       uoa1.g(R.string.arg_RES_7f104f05);
       uoa1.e(R.string.arg_RES_7f104f05);
       obj.a(uoa1.a());
       return obj;
    }
    public b l(GifshowActivity p0,User p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.b(p0, p1, false, false, "").subscribe(new l0(p1), new a());
    }
    public b m(GifshowActivity p0,User p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.a(p0, p1, false, false, "").subscribe(Functions.d(), new a());
    }
    public Drawable n(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Drawable uDrawable = j.n(p0, R.drawable.arg_RES_7f080e36, 0x7f060148);
       uDrawable.setBounds(0, 0, uDrawable.getMinimumWidth(), uDrawable.getMinimumHeight());
       return uDrawable;
    }
    public a o(Context p0,User p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       String str = TextUtils.I(f.c(p1));
       String str1 = (f.i(p1))? a1.p(0x7f103941)+"£º"+p1.mName: a1.p(R.string.arg_RES_7f103f5e);
       a uoa = a.b();
       uoa.h(str);
       uoa.c(R.drawable.arg_RES_7f081e27);
       uoa.i(1);
       uoa.j(str1);
       uoa.k(R.color.arg_RES_7f061da9);
       uoa.m(R.dimen.no);
       uoa.e(R.string.arg_RES_7f1046bb);
       return uoa;
    }
    public a p(Context p0,User p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       int i = (p1.mFavorited != null)? 0x7f100e57: 0x7f100e53;
       a uoa = a.b();
       uoa.g(i);
       uoa.e(i);
       return uoa;
    }
    public a q(Context p0,User p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a uoa = a.b();
       uoa.i(0);
       uoa.e(R.string.arg_RES_7f10428f);
       uoa.o(R.color.arg_RES_7f060751);
       uoa.g(R.string.arg_RES_7f10428f);
       return uoa;
    }
}
