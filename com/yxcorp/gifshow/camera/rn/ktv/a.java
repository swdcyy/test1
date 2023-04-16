package com.yxcorp.gifshow.camera.rn.ktv.a;
import erd.g;
import com.yxcorp.gifshow.camera.rn.ktv.KtvSchemeDispatchActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import li9.a;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import u07.t$a;
import android.app.Activity;
import li9.b;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import li9.e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class a implements g	// class@000ff0
{
    public final KtvSchemeDispatchActivity b;

    public void a(KtvSchemeDispatchActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       a.C().e("ktv_log", "launchKtvRecordActivity error", p0);
       if (PatchProxy.applyVoid(null, tb, KtvSchemeDispatchActivity.class, "3")) {
       }else {
          p0 = tb.C;
          if (p0 != null) {
             p0.dismiss();
          }
          p0 = new t$a(tb);
          p0.y0(R.string.arg_RES_7f1042c6);
          p0.Q0(R.string.cancel);
          p0.S0(R.string.arg_RES_7f1042cc);
          p0.u0(new b(tb));
          p0.B(false);
          f.e(p0).Y(new e(tb));
       }
       return;
    }
}
