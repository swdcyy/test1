package com.yxcorp.gifshow.share.screenshot.z;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import e06.b;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.screenshot.a0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.content.Context;
import h4d.a;
import android.net.Uri;
import uic.g0;
import brd.t;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import vo7.c;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.share.screenshot.d0;
import erd.o;
import uic.e0;
import com.yxcorp.gifshow.share.screenshot.x;
import com.yxcorp.gifshow.share.screenshot.y;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog;
import java.lang.Integer;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n80.a;
import java.lang.System;
import android.content.SharedPreferences;
import com.kwai.framework.model.user.QCurrentUser;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public final class z implements Runnable	// class@001c6e
{
    public final GifshowActivity b;
    public final BaseFeed c;
    public final b d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;

    public void z(GifshowActivity p0,BaseFeed p1,b p2,String p3,int p4,String p5,String p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void run(){
       boolean b1;
       String str2;
       Bundle uBundle1;
       boolean b2;
       z oz = this;
       z b = oz.b;
       z c = oz.c;
       z d = oz.d;
       z e = oz.e;
       z f = oz.f;
       z g = oz.g;
       z h = oz.h;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       String str = "3";
       Object[] obj1 = PatchProxy.applyTwoRefs(b, c, obj, a0.class, str);
       String str1 = 1;
       boolean i = 0;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(!a.d(b) && (!a.b(b) && c != null)){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          if (!PatchProxy.applyVoidThreeRefs(c, d, b, null, a0.class, "2")) {
             Uri uri = d.b();
             t ot = PatchProxy.applyTwoRefs(c, uri, obj, g0.class, "6");
             if (ot != patchProxyRe) {
             }else if(c instanceof LiveStreamFeed){
                str2 = "LIVE_STREAM";
             }else {
                str2 = "PHOTO";
             }
             ot = c.b.a(str2, c.getId(), "wechat", null, "{}").subscribeOn(d.c).map(d0.b).map(new e0(c, uri));
             ot.subscribe(new x(b, c), y.b);
          }
       }else {
          int i1 = 2;
          if (PatchProxy.isSupport2(ScreenShotShareDialog.class, "2")) {
             obj1 = new Object[]{b,d,e,Integer.valueOf(f),g,h,c};
             if (!PatchProxy.applyVoid(obj1, obj, ScreenShotShareDialog.class, "2")) {
             }
          }else if(!ScreenShotShareDialog.E && (b != null && (d.b() == null || !b.b3()))){
             PatchProxy.onMethodExit(ScreenShotShareDialog.class, "2");
          }else if(ActivityContext.g().e().getResources().getConfiguration().orientation == i1){
             PatchProxy.onMethodExit(ScreenShotShareDialog.class, "2");
          }else {
             ScreenShotShareDialog screenShotSh = new ScreenShotShareDialog();
             Bundle uBundle = new Bundle();
             uBundle.putParcelable("SCREEN_SHOT_URL", d.b());
             uBundle.putInt("SCREEN_SHOT_CHANNEL", f);
             Object obj2 = PatchProxy.applyTwoRefs(e, b, obj, ScreenShotShareDialog.class, str);
             if (obj2 != patchProxyRe) {
                uBundle1 = uBundle;
                i = obj2.booleanValue();
             }else if(!TextUtils.x(e)){
                obj2 = PatchProxy.apply(obj, obj, ScreenShotShareDialog.class, "17");
                if (obj2 != patchProxyRe) {
                   b2 = obj2.booleanValue();
                   uBundle1 = uBundle;
                }else {
                   long l = (long)a.d();
                   uBundle1 = uBundle;
                   if (l) {
                      long l1 = System.currentTimeMillis() / 0x5265c00;
                      long l2 = a.a.getLong("screenShotCloseTimestamp", 0) / 0x5265c00;
                      if (l2 && (l1 - l2) - l < 0) {
                         b2 = true;
                      }
                   }
                   b2 = false;
                }
                if (!b2 && QCurrentUser.ME.isLogined()) {
                   i = false;
                }
             }else {
                uBundle1 = uBundle;
             }
             i = true;
             if (!i) {
                uBundle1.putString("SCREEN_SHOT_CONTENT_ID", TextUtils.k(e));
                uBundle1.putString("SCREEN_SHOT_AUTHOR_ID", g);
                uBundle1.putString("SCREEN_SHOT_EXP_TAG", h);
             }
             if (c != null) {
                SerializableHook.putSerializable(uBundle1, "SCREEN_SHOT_FEED", c);
             }
             screenShotSh.setArguments(uBundle1);
             screenShotSh.Cb(b.getSupportFragmentManager(), "ScreenSnapShotFragment");
             ScreenShotShareDialog.E = true;
             PatchProxy.onMethodExit(ScreenShotShareDialog.class, "2");
          }
       }
       return;
    }
}
