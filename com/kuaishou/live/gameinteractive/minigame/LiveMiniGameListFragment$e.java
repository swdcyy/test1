package com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment$e;
import u07.u;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment;
import com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;
import java.lang.String;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fq5.b;
import t02.a0;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import crd.b;
import lnc.b9;
import e43.b;
import e43.a;
import brd.t;
import k43.i;
import com.kuaishou.live.gameinteractive.minigame.b;
import erd.g;
import com.kwai.library.widget.popup.common.c;
import u07.t$a;

public class LiveMiniGameListFragment$e implements u	// class@001bd6
{
    public final LiveMiniGameInfo b;
    public final String c;
    public final LiveMiniGameListFragment d;

    public void LiveMiniGameListFragment$e(LiveMiniGameListFragment p0,LiveMiniGameInfo p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMiniGameListFragment$e.class, "1")) {
          return;
       }
       LiveMiniGameListFragment$e td = this.d;
       LiveMiniGameInfo gameId = this.b.gameId;
       String liveStreamId = td.H.b().getLiveStreamId();
       LiveMiniGameListFragment$e tc = this.c;
       Objects.requireNonNull(td);
       if (PatchProxy.applyVoidThreeRefs(gameId, liveStreamId, tc, td, LiveMiniGameListFragment.class, "3") || (!TextUtils.x(gameId) && !TextUtils.x(liveStreamId))) {
          b9.a(td.B);
          td.B = a.a().d(gameId, liveStreamId, tc).subscribe(new i(td, gameId, tc), b.b);
       }
    label_0056 :
       p0.o();
       String str = (TextUtils.n(this.c, "open"))? "AUTHOR_INTERACTION_GAME_CONFIRM_POP_BUTTON": "AUTHOR_INTERACTION_GAME_CLOSE_REMIND_POP_BUTTON";
       LiveMiniGameListFragment$e tb = this.b;
       this.d.Eh(str, tb.gameId, tb.gameName, p0.b0().o0());
       return;
    }
}
