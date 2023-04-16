package com.kuaishou.live.gameinteractive.minigame.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.gameinteractive.minigame.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import android.content.Context;
import n3d.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import fq5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import j43.a;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameAudienceOpenGameDialog;
import com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;
import k43.n;
import p91.m;

public final class c implements View$OnClickListener	// class@001be7
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       f uof = f.class;
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).x00(tb.getActivity(), 0, new LoginParams$a().a(), null);
       }else if(tb.V8()){
          if (!PatchProxy.applyVoid(null, tb, uof, "9") && tb.Z8()) {
             uof = tb.q;
             LiveMiniGameListFragment liveMiniGame = PatchProxy.applyOneRefs(uof, null, LiveMiniGameListFragment.class, "13");
             if (liveMiniGame != PatchProxyResult.class) {
             }else {
                liveMiniGame = new LiveMiniGameListFragment();
                liveMiniGame.H = uof;
             }
             liveMiniGame.show(tb.q.R().getChildFragmentManager(), "LiveMiniGameListFragment");
             a.b("AUTHOR_INTERACTION_GAME_CHOOSE_POP", tb.q.b().a(), null);
          }
       }else if(PatchProxy.applyVoid(null, tb, uof, "10") || tb.getActivity() == null){
          if (tb.v == null) {
             tb.P8();
          }else if(!tb.Z8()){
             LiveMiniGameAudienceOpenGameDialog liveMiniGame1 = new LiveMiniGameAudienceOpenGameDialog(tb.q, tb.v);
             liveMiniGame1.y = new n(tb, liveMiniGame1);
             liveMiniGame1.show(tb.q.R().getChildFragmentManager(), LiveMiniGameAudienceOpenGameDialog.class.getName());
             a.b("USER_INTERACTION_GAME_POP", tb.q.b().a(), null);
          }
       }
       a.a("LIVE_BOTTOM_PANEL_ENTRANCE_BUTTON", tb.q.Z2.a(), tb.S8());
       return;
    }
}
