package com.yxcorp.plugin.setting.presenter.h$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.presenter.h;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import tgd.m;
import u07.u;
import u07.b;
import tgd.o;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class h$a implements View$OnClickListener	// class@0008dd
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       h$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, h.class, "4")) {
          d uod = new d(tb.p);
          uod.b1(KwaiDialogOption.d);
          uod.V0(true);
          uod.W0(R.string.arg_RES_7f10018c);
          uod.y0(R.string.arg_RES_7f103e5c);
          uod.s0(new m(tb));
          uod.B0(R.drawable.arg_RES_7f082289);
          uod = b.c(uod);
          uod.L(new o(tb, R.layout.arg_RES_7f0d11ad));
          uod.X();
       }
       b.a(this.b.p, "TIME_ALBUM", Boolean.valueOf(QCurrentUser.ME.isEnableLocalIntelligenceAlbum()));
       return;
    }
}
