package com.kwai.live.gzone.promotion.c;
import com.kwai.live.gzone.promotion.u$a;
import com.kwai.live.gzone.promotion.d;
import java.lang.Object;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f37.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.promotion.b;
import u07.u;
import s67.s;
import u07.f;
import s67.y;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class c implements u$a	// class@000dbb
{
    public final d a;

    public void c(d p0){
       this.a = p0;
    }
    public final void a(GameCenterDownloadParams$DownloadInfo p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, d.class, "13")) {
       }else {
          SharedPreferences a = a.a;
          String str = "user";
          if (!a.getBoolean(b.d(str)+"has_live_gzone_game_promotion_pause_popup_showed", false)) {
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean(b.d(str)+"has_live_gzone_game_promotion_pause_popup_showed", true);
             g.a(uEditor);
             t$a uoa = new t$a(ta.getActivity());
             uoa.y0(R.string.arg_RES_7f101145);
             uoa.S0(R.string.arg_RES_7f10117e);
             uoa.Q0(R.string.arg_RES_7f100a98);
             uoa.t0(b.b);
             uoa.u0(new s(ta, p0));
             t$a uoa1 = f.e(uoa);
             ta.L = uoa1.Y(new y(ta));
          }
       }
       return;
    }
}
