package com.kuaishou.live.audience.component.push.f;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;
import e17.i;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import lp3.c;
import lp3.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import uf2.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import lnc.y6;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import lnc.t;
import java.lang.Boolean;
import brd.t;
import brd.w;
import r16.d;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.kuaishou.live.audience.component.push.g;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import ke2.k;

public final class f implements View$OnClickListener	// class@000bd1
{
    public final LiveAudienceBottomBarPushPresenter b;

    public void f(LiveAudienceBottomBarPushPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, LiveAudienceBottomBarPushPresenter.class, "3")) {
       }else {
          int i = 0x7f110668;
          if (tb.q.Y0.r2(AudienceBizRelation.CHAT)) {
             i.a(i, R.string.arg_RES_7f101e45);
          }else if(tb.q.Y0.r2(AudienceBizRelation.VOICE_PARTY_GUEST)){
             i.a(i, R.string.arg_RES_7f101e46);
          }else {
             LiveAudienceBottomBarPushPresenter r = tb.r;
             if (r != null && LiveAudienceApplyChatService$State.APPLYING == r.a(LiveAudienceApplyChatService.class).jh()) {
                i.a(i, R.string.arg_RES_7f102874);
             }else {
                ClientContent$LiveStreamPackage liveStreamPa = tb.q.Z2.a();
                if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, b.class, "6")) {
                   ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uClickEvent.elementPackage = uElementPack;
                   uElementPack.action2 = "MORE_START_LIVE_BUTTON";
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uClickEvent.contentPackage = uContentPack;
                   uContentPack.liveStreamPackage = liveStreamPa;
                   u1.a0(uClickEvent);
                }
                Activity activity = tb.getActivity();
                if (activity instanceof FragmentActivity) {
                   tb.y = k.b(activity, y6.e.h(LoadPolicy.SILENT_IMMEDIATE).d(t.just(Boolean.TRUE)), d.class, RecordPostPlugin.class, new g(tb), Functions.d());
                }
             }
          }
       }
       return;
    }
}
