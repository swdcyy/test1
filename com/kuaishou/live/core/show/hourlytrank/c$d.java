package com.kuaishou.live.core.show.hourlytrank.c$d;
import ky1.c;
import com.kuaishou.live.core.show.hourlytrank.c;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import hy1.e;
import java.lang.Boolean;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import my1.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ba2.h;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV3;
import ba2.k;
import java.lang.Runnable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import iy1.l;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ly1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.u1;
import android.widget.FrameLayout;
import android.view.ViewParent;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class c$d extends c	// class@000bff
{
    public LiveFancyRankResultViewV2 b;
    public final c c;

    public void c$d(c p0){
       this.c = p0;
       super();
    }
    public ViewGroup c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.findViewById(0x7f0a2690);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c$d.class, "6")) {
          return;
       }
       super.e();
       c$d tb = this.b;
       if (tb != null) {
          this.j(tb);
       }
       return;
    }
    public boolean g(){
       return false;
    }
    public boolean h(e p0){
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       JsonObject jsonObject;
       c$d uod = c$d.class;
       Context obj = PatchProxy.applyOneRefs(p0, this, uod, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.getContext();
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (!p0.d instanceof b) {
          return b;
       }
       b.Z(LiveLogTag.LIVE_ENHANCE_MESSAGE, "onShow hourly rank fancy message");
       b d = p0.d.d;
       ViewGroup viewGroup = this.c(this.c.m8());
       if (viewGroup == null) {
          return b;
       }
       int i = 5;
       LiveFancyRankResultViewV2 liveFancyRan = (!this.c.B.c() || d.noticeType == i)? new LiveFancyRankResultViewV2(obj): new LiveFancyRankResultViewV3(obj);
       this.b = liveFancyRan;
       viewGroup.addView(liveFancyRan);
       boolean b1 = this.c.V8(d, liveFancyRan, p0.b);
       if (b1) {
          this.d(p0, new k(this, liveFancyRan));
       }
       if (!PatchProxy.applyVoidOneRefs(d, this, uod, "2")) {
          String str = (!this.c.B.c() || TextUtils.x(d.extraInfo))? "": d.extraInfo;
          l b2 = l.b;
          ClientContent$LiveStreamPackage liveStreamPa = this.c.r.a();
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[i];
             objArray[b] = b2;
             objArray[1] = liveStreamPa;
             objArray[2] = "1";
             objArray[3] = "0";
             objArray[4] = str;
             if (!PatchProxy.applyVoid(objArray, null, uoa, "3")) {
             }
          }else {
          }
       }
    label_00f8 :
       return b1;
    }
    public final void j(LiveFancyRankResultViewV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ENHANCE_MESSAGE, "hideFancyView hourlyRankFancy");
       p0.setVisibility(8);
       p0.release();
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(p0);
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveTempEnhanceHourlyRankFancyHandler@"+Integer.toHexString(System.identityHashCode(this));
    }
}
