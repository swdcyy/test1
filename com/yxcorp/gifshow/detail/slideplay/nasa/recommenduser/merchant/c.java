package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.b$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.user.User;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import tkd.b;
import tkd.d;
import vs3.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import m6a.w;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.google.gson.JsonObject;
import com.google.common.collect.ImmutableMap$b;
import zk.g;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public class c extends m	// class@001790
{
    public final b$a c;

    public void c(b$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       c c;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, obj, c.class, "1")) {
          return;
       }
       c = obj.c;
       Objects.requireNonNull(c);
       Object[] objArray = null;
       if (!PatchProxy.applyVoidWithListener(objArray, c, b$a.class, "11")) {
          if (c.p == null) {
             PatchProxy.onMethodExit(b$a.class, "11");
          }else {
             b$a s = c.s;
             FragmentActivity activity = (s != null)? s.getActivity(): objArray;
             if (activity == null) {
                PatchProxy.onMethodExit(b$a.class, "11");
             }else {
                b$a p = c.p;
                if (p.mIsLiving != null) {
                   activity.startActivity(b.a(0x66dce92a).a(activity, x0.f(p.mLiveStreamJumperUrl)));
                }else {
                   d.a(0x7074b578).rj(activity, p.mshopLink, objArray);
                }
                b$a p1 = c.p;
                if (!PatchProxy.applyVoidOneRefsWithListener(p1, objArray, w.class, "2")) {
                   if (p1 == null || ("empty").equals(p1.mId)) {
                      PatchProxy.onMethodExit(w.class, "2");
                   }else {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "USER_RECO_CARD";
                      i3 oi3 = i3.f();
                      oi3.d("live_id", p1.mLiveStreamId);
                      oi3.d("user_id", p1.mId);
                      uElementPack.params = oi3.e();
                      ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                      uClickEvent.direction = 0;
                      uClickEvent.type = 1;
                      uClickEvent.elementPackage = uElementPack;
                      JsonObject jsonObject = new JsonObject();
                      jsonObject.c0("live_id", p1.mLiveStreamId);
                      jsonObject.c0("user_id", p1.mId);
                      ImmutableMap$b uob = new ImmutableMap$b();
                      uob.c("element_action", new g("USER_RECO_CARD"));
                      uob.c("page_name", new g("FEATURED_PAGE"));
                      uob.c("params", jsonObject);
                      CommonParams uCommonParam = new CommonParams();
                      uCommonParam.mEntryTag = uob.a();
                      b.a(0x4b316083).Y("", uClickEvent, null, false, null, uCommonParam, null);
                      PatchProxy.onMethodExit(w.class, "2");
                   }
                }
                PatchProxy.onMethodExit(b$a.class, "11");
             }
          }
       }
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
