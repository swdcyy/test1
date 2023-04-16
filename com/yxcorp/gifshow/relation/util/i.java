package com.yxcorp.gifshow.relation.util.i;
import n3d.a;
import com.yxcorp.gifshow.relation.util.j;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import ekd.j0;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.d;
import pu5.a;
import qu5.r;

public final class i implements a	// class@001a5c
{
    public final j b;
    public final GifshowActivity c;
    public final User d;

    public void i(j p0,GifshowActivity p1,User p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined() && !PatchProxy.applyVoidTwoRefs(tc, td, tb, j.class, "11")) {
          if (!QCurrentUser.ME.isLogined()) {
             d.a(-1712118428).ne(tc, j0.f(tc.getIntent(), "SOURCE"), "profile_message", 24, a.B.getString(R.string.arg_RES_7f10307c), null, td, null, new i(tb, tc, td)).h();
          }else {
             d.a(-1497343380).MD(tc, td);
             tc.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
          }
       }
       return;
    }
}
