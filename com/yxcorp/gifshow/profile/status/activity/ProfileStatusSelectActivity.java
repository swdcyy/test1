package com.yxcorp.gifshow.profile.status.activity.ProfileStatusSelectActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.profile.status.activity.ProfileStatusSelectActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import w5c.c;
import java.util.HashMap;
import android.content.Intent;
import java.lang.CharSequence;
import java.util.Map;
import q3c.d;
import com.kwai.framework.model.user.QCurrentUser;
import fg6.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.Gson;
import z5c.k0;
import java.lang.Long;
import android.content.Context;
import java.util.Objects;
import com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag;
import java.util.List;
import v2c.e;
import v2c.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import u36.d;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import w5c.e;
import erd.g;
import crd.b;
import u36.f;
import w5c.f;
import u36.g;
import w5c.g;
import u36.e;
import w5c.h;
import eda.n;
import w5c.d;
import ca9.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import lnc.t;
import k5c.a;
import k5c.b;
import erd.a;

public final class ProfileStatusSelectActivity extends GifshowActivity	// class@0015af
{
    public HashMap y;
    public static final ProfileStatusSelectActivity$a z;

    static {
       ProfileStatusSelectActivity.z = new ProfileStatusSelectActivity$a(null);
    }
    public void ProfileStatusSelectActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ProfileStatusSelectActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       c uoc = c.class;
       ProfileStatusSelectActivity profileStatu = ProfileStatusSelectActivity.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, profileStatu, str)) {
          return;
       }
       super.onCreate(p0);
       HashMap hashMap = new HashMap();
       Intent intent = this.getIntent();
       String str1 = "profileStatusSelectTips";
       String stringExtra = (intent != null)? intent.getStringExtra(str1): null;
       boolean b = true;
       e uoe = (stringExtra == null || !stringExtra.length())? 1: null;
       if (!uoe) {
          hashMap.put(str1, stringExtra);
       }
       if (!PatchProxy.applyVoidTwoRefs(this, hashMap, null, d.class, "2")) {
          hashMap.put("pushOrientation", "vertical");
          hashMap.put("headurl", QCurrentUser.me().getAvatar());
          hashMap.put("headurls", a.a.q(QCurrentUser.me().getAvatars()));
          if (!k0.d()) {
             str = "0";
          }
          hashMap.put("enableProfileStatusV2", str);
          hashMap.put("statusValidDuration", Long.toString(k0.m()));
          d.a(this, "SocialProfileStatus", "ProfileStateSelect", hashMap);
       }
       c h = c.h;
       Objects.requireNonNull(h);
       if (!PatchProxy.applyVoid(null, h, uoc, "4")) {
          stringExtra = "ProfileStatusPublishUtils";
          if (c.f) {
             g.e(KsLogProfileStatusTag.STATUS_PUBLISH.appendTag(stringExtra), "has already registered");
          }else {
             g.e(KsLogProfileStatusTag.STATUS_PUBLISH.appendTag(stringExtra), "registerStatusUploadEvent");
             c.f = b;
             RxBus f = RxBus.f;
             RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
             c.a = f.g(d.class, mAIN).subscribe(e.b);
             c.b = f.g(f.class, mAIN).subscribe(f.b);
             c.c = f.g(g.class, mAIN).subscribe(g.b);
             c.d = f.g(e.class, mAIN).subscribe(h.b);
          }
       }
       Objects.requireNonNull(h);
       if (!PatchProxy.applyVoid(null, h, uoc, "9")) {
          c.e = RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(d.b);
       }
       if (!PatchProxy.applyVoid(null, this, profileStatu, "2")) {
          b.e.h(LoadPolicy.SILENT_IMMEDIATE).u(a.b, b.b);
       }
       this.finish();
       return;
    }
}
