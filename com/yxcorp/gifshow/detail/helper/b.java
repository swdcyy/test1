package com.yxcorp.gifshow.detail.helper.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.helper.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import p1a.a;
import p1a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import e1a.i;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
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
import java.lang.StringBuilder;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import oe6.e;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;

public final class b implements View$OnClickListener	// class@00156b
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a$a uoa;
       String str1;
       String str2;
       b tb = this.b;
       c uoc = c.class;
       Object[] objArray = null;
       if (tb.g == null) {
          if (!PatchProxy.applyVoid(objArray, tb, uoc, "13")) {
             uoc = tb.f;
             if (uoc != null) {
                uoa = a$a.a(31, "user_follow");
                uoa.q(tb.a);
                uoc.get().a(uoa);
             }
          }
          tb.a();
       }else if(PatchProxy.applyVoid(objArray, tb, uoc, "12") || tb.b == null){
          if (!QCurrentUser.ME.isLogined()) {
             d.a(-1712118428).ne(tb.b, tb.c.getFullSource(), "photo_unfollow", 14, a.B.getString(R.string.arg_RES_7f103077), tb.c.mEntity, null, null, new i(tb)).h();
          }else {
             String str = j0.f(tb.b.getIntent(), "arg_photo_exp_tag");
             c e = tb.e;
             int i = 0;
             int i1 = 1;
             if (e != null) {
                Object[] objArray1 = new Object[]{Optional.fromNullable(e.mPreUserId).or(str1),Optional.fromNullable(tb.e.mPrePhotoId).or(str1)};
                str1 = "_";
                str2 = String.format("%s/%s", objArray1);
             }else {
                str2 = "_/_";
             }
             tb.c.getUser().mPage = "photo";
             c b = tb.b;
             f$a uoa1 = new f$a(tb.d, b.R2(b.getWindow().getDecorView()));
             uoa1.c(tb.c.getFullSource());
             uoa1.o(tb.b.getUrl()+"#unfollow");
             uoa1.g(str);
             uoa1.f(tb.c.getExpTag());
             uoa1.n(str2);
             uoa1.q(i1);
             f$a uoa2 = uoa1.h(tb.d.mFollowActionReasonTextId);
             uoa2.i(b.c(tb.c.mEntity));
             FollowHelper.k(uoa2.b()).subscribe(Functions.d(), Functions.d());
             e.f0(i);
             f.m(tb.d, User$FollowStatus.UNFOLLOW);
             uoc = tb.f;
             if (uoc != null) {
                uoa = a$a.a(32, "NEAE_HEAD_PORTRAIT");
                uoa.q(tb.a);
                uoc.get().a(uoa);
             }
          }
       }
       return;
    }
}
