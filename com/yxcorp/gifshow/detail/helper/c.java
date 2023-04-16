package com.yxcorp.gifshow.detail.helper.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.detail.helper.FollowView;
import com.yxcorp.gifshow.entity.QPreInfo;
import im8.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import e1a.j;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import n3d.a;
import n3d.d;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import com.google.common.base.Optional;
import jga.c;
import wca.b;
import jga.f$a;
import android.view.Window;
import android.view.View;
import java.lang.StringBuilder;
import jga.f;
import com.yxcorp.gifshow.detail.helper.c$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import oe6.e;
import l66.c;
import wca.r;
import m66.a;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.survey.ActionSurveyType;
import java.util.List;
import com.yxcorp.gifshow.detail.helper.a;
import java.util.Collection;
import ekd.q;
import lnc.a1;
import e1a.h;
import ok.o;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.detail.helper.b;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import zf6.l;

public final class c	// class@00156d
{
    public final FollowView a;
    public final GifshowActivity b;
    public final QPhoto c;
    public final User d;
    public final QPreInfo e;
    public f f;
    public boolean g;
    public boolean h;
    public int i;

    public void c(GifshowActivity p0,QPhoto p1,User p2,FollowView p3,QPreInfo p4,f p5,int p6){
       super();
       this.b = p0;
       this.d = p2;
       this.c = p1;
       this.a = p3;
       this.e = p4;
       this.f = p5;
       this.g = this.c(p2);
       this.b();
       this.i = p6;
    }
    public void a(){
       String str1;
       String str2;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "14")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).ne(this.b, this.c.getFullSource(), "photo_follow", 14, a.B.getString(R.string.arg_RES_7f103077), this.c.mEntity, null, null, new j(this)).h();
          return;
       }else if(this.d.isFollowingOrFollowRequesting()){
          return;
       }else {
          String str = j0.f(this.b.getIntent(), "arg_photo_exp_tag");
          c te = this.e;
          int i = 1;
          if (te != null) {
             Object[] objArray1 = new Object[]{Optional.fromNullable(te.mPreUserId).or(str1),Optional.fromNullable(this.e.mPrePhotoId).or(str1)};
             str1 = "_";
             str2 = String.format("%s/%s", objArray1);
          }else {
             str2 = "_/_";
          }
          this.c.getUser().mPage = "photo";
          c tb = this.b;
          f$a uoa = new f$a(this.d, tb.R2(tb.getWindow().getDecorView()));
          uoa.c(this.c.getFullSource());
          uoa.o(this.b.getUrl()+"#follow");
          uoa.g(str);
          uoa.f(this.c.getExpTag());
          uoa.n(str2);
          uoa.q(i);
          f$a uoa1 = uoa.h(this.d.mFollowActionReasonTextId);
          uoa1.i(b.c(this.c.mEntity));
          uoa1.m(this.c);
          FollowHelper.c(uoa1.b(), new c$a(this));
          e.f0(0);
          c.a().b(new r(this.c.getUser(), this.c.mEntity));
          f.m(this.d, User$FollowStatus.FOLLOWING);
          List obj = PatchProxy.apply(objArray, this, uoc, "8");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             obj = a.a(ActionSurveyType.FOLLOW);
             if (!q.f(obj)) {
                objArray = obj.get(0);
             }
          }
          a.b(this.c, ActionSurveyType.FOLLOW, objArray);
          return;
       }
    }
    public final void b(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       if (this.h == null) {
          this.h = true;
       }
       this.a.i();
       this.e();
       this.d();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          this.a.setText(a1.p(R.string.arg_RES_7f100f8f));
       }
       this.a.setFollowPredict(new h(this));
       this.a.setVisibility(0);
       this.a.setOnClickListener(new b(this));
       uoc = this.a;
       uoc.setProgress(uoc.getProgress());
       return;
    }
    public boolean c(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.ME.isLogined() && p0.isFollowingOrFollowRequesting())? true: false;
       return b;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.a.findViewById(R.id.follow_button_layout).setVisibility(8);
       return;
    }
    public final void e(){
       boolean b;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       l.n(R.drawable.arg_RES_7f080abc, 0x7f080abb);
       this.d();
       Object obj = PatchProxy.apply(objArray, this, uoc, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(QCurrentUser.ME.isLogined() && (this.c.getUser() != null && this.c.getUser().isFollowingOrFollowRequesting())){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          this.a.l();
       }else {
          this.a.k();
       }
       return;
    }
}
