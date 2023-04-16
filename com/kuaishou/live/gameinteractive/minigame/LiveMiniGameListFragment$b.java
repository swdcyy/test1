package com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import g9c.a;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import u07.t$a;
import android.app.Activity;
import android.app.Application;
import o56.a;
import k43.k;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import k43.j;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import fq5.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import j43.a;

public class LiveMiniGameListFragment$b implements View$OnClickListener	// class@001bd3
{
    public final LiveMiniGameListFragment b;

    public void LiveMiniGameListFragment$b(LiveMiniGameListFragment p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniGameListFragment$b.class, "1")) {
          return;
       }
       if (p0.getTag() instanceof LiveMiniGameInfo) {
          LiveMiniGameInfo tag = p0.getTag();
          LiveMiniGameListFragment$b tb = this.b;
          Objects.requireNonNull(tb);
          Object[] objArray = null;
          LiveMiniGameInfo liveMiniGame = PatchProxy.apply(objArray, tb, LiveMiniGameListFragment.class, "5");
          if (liveMiniGame != PatchProxyResult.class) {
          }else {
             LiveMiniGameListFragment g = tb.G;
             if (g != null) {
                Iterator iterator = g.Q0().iterator();
                do {
                   if (iterator.hasNext()) {
                   }
                   liveMiniGame = iterator.next();
                } while (liveMiniGame.isOpen != null);
             }
             liveMiniGame = objArray;
          }
          int i = 1;
          String str = null;
          if (liveMiniGame == null) {
             this.b.Gh("open", tag);
          }else if(TextUtils.n(tag.gameId, liveMiniGame.gameId)){
             i = 2;
             this.b.Gh("close", tag);
          }else {
             LiveMiniGameListFragment$b tb1 = this.b;
             Objects.requireNonNull(tb1);
             if (!PatchProxy.applyVoid(objArray, tb1, LiveMiniGameListFragment.class, "2") && tb1.getActivity() != null) {
                t$a uoa = new t$a(tb1.getActivity());
                uoa.z0(a.b().getString(R.string.arg_RES_7f10279a));
                uoa.S0(R.string.arg_RES_7f100a73);
                uoa.u0(new k(tb1));
                uoa.z(str);
                uoa.A(str);
                uoa.v(i);
                t$a uoa1 = f.e(uoa);
                uoa1.Y(new j(tb1));
             }
             i = 0;
          }
          i3 oi3 = i3.f();
          oi3.d("interaction_game_id", tag.gameId);
          oi3.d("interaction_game_name", tag.gameName);
          oi3.c("action_type", Integer.valueOf(i));
          String str1 = oi3.e();
          a.a("AUTHOR_INTERACTION_GAME_CHOOSE_POP_BUTTON", this.b.H.b().a(), str1);
       }
       return;
    }
}
