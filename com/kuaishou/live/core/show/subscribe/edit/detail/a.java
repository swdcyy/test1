package com.kuaishou.live.core.show.subscribe.edit.detail.a;
import erd.g;
import com.kuaishou.live.core.show.subscribe.edit.detail.e;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribePreDeleteResponse$PreDeleteInfo;
import java.lang.String;
import com.kuaishou.live.core.show.subscribe.edit.detail.e$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.app.Activity;
import d61.g;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import wk2.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import u07.t$a;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import tk2.c;
import u07.u;
import tk2.b;
import com.kuaishou.live.core.show.subscribe.edit.detail.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class a implements g	// class@001105
{
    public final e b;
    public final LiveSubscribePreDeleteResponse$PreDeleteInfo c;
    public final String d;
    public final e$a e;
    public final int f;

    public void a(e p0,LiveSubscribePreDeleteResponse$PreDeleteInfo p1,String p2,e$a p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       e uoe;
       a uoa = this;
       a b = uoa.b;
       a c = uoa.c;
       a d = uoa.d;
       a e = uoa.e;
       a f = uoa.f;
       LiveSubscribePreDeleteResponse$PreDeleteInfo preDeleteInf = p0;
       Objects.requireNonNull(b);
       if (!preDeleteInf) {
       }else if(c != null && c.mStatus == preDeleteInf.mStatus){
          uoe = 1;
       }else {
          uoe = null;
       }
       if (uoe) {
          b.a(d, e);
       }else if(PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(d, e, Integer.valueOf(f), preDeleteInf, b, e.class, "4")){
          Activity uActivity = b.b();
          if (!g.h(uActivity)) {
             boolean b1 = preDeleteInf.willBeBannedAfterDelete();
             ClientContent$LiveStreamPackage liveStreamPa = b.d.get();
             ClientContent$LiveVoicePartyPackageV2 liveVoicePar = b.e.get();
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b1), liveStreamPa, liveVoicePar, null, a.class, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LIVE_APPOINTMENT_CONFIRM_DELETE_POP_CARD";
                JsonObject jsonObject = new JsonObject();
                jsonObject.a0("if_ban", Integer.valueOf(b1));
                uElementPack.params = jsonObject.toString();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                if (liveStreamPa != null) {
                   uContentPack.liveStreamPackage = liveStreamPa;
                }
                if (liveVoicePar != null) {
                   uContentPack.liveVoicePartyPackage = liveVoicePar;
                }
                u1.u0(9, uElementPack, uContentPack);
             }
             b.c0(LiveLogTag.LIVE_SUBSCRIBE, "showDeleteConfirmDialog ", "times", Integer.valueOf(f));
             t$a uoa1 = new t$a(uActivity);
             uoa1.X0(preDeleteInf.mTitle);
             uoa1.z0(preDeleteInf.mContent);
             uoa1.A(false);
             t$a uoa2 = f.e(uoa1);
             uoa2.S0(R.string.arg_RES_7f102cbe);
             c uoc = new c(b, preDeleteInf, f, d, e);
             uoa2.u0(v15);
             uoa2.Q0(R.string.cancel);
             uoa2.t0(new b(b, preDeleteInf));
             uoa2.z(false);
             uoa2.v(true);
             uoa2.Y(new d(b));
          }
       }
       return;
    }
}
