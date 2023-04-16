package com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment$d;
import u07.u;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment;
import java.lang.String;
import com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u07.t$a;

public class LiveMiniGameListFragment$d implements u	// class@001bd5
{
    public final String b;
    public final LiveMiniGameInfo c;
    public final LiveMiniGameListFragment d;

    public void LiveMiniGameListFragment$d(LiveMiniGameListFragment p0,String p1,LiveMiniGameInfo p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMiniGameListFragment$d.class, "1")) {
          return;
       }
       p0.o();
       String str = (TextUtils.n(this.b, "open"))? "AUTHOR_INTERACTION_GAME_CONFIRM_POP_BUTTON": "AUTHOR_INTERACTION_GAME_CLOSE_REMIND_POP_BUTTON";
       LiveMiniGameListFragment$d tc = this.c;
       this.d.Eh(str, tc.gameId, tc.gameName, p0.b0().m0());
       return;
    }
}
