package com.kuaishou.live.gzone.treasurebox.presenter.v;
import io.reactivex.g;
import com.kuaishou.live.gzone.treasurebox.presenter.w;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import pm8.a;
import java.lang.String;
import android.content.SharedPreferences;
import brd.g;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p53.c2;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class v implements g	// class@001c9e
{
    public final w b;

    public void v(w p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       SharedPreferences a = a.a;
       if (!a.getBoolean("firstClickTreasureBoxPendant", true)) {
          p0.onNext(new Object());
       }else {
          t$a uoa = new t$a(tb.getActivity());
          uoa.W0(R.string.arg_RES_7f100f71);
          uoa.S0(R.string.arg_RES_7f101812);
          uoa.u0(new c2(p0));
          uoa.z(false);
          j.d(uoa);
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putBoolean("firstClickTreasureBoxPendant", false);
          g.a(uEditor);
       }
       return;
    }
}
