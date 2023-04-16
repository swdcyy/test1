package com.yxcorp.plugin.setting.presenter.e$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.presenter.e;
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
import tgd.h;
import u07.u;
import u07.b;
import tgd.j;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class e$a implements View$OnClickListener	// class@0008d9
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       e$a tb = this.b;
       Objects.requireNonNull(tb);
       int i = 1;
       if (!PatchProxy.applyVoid(null, tb, e.class, "4")) {
          d uod = new d(tb.p);
          uod.b1(KwaiDialogOption.d);
          uod.V0(i);
          uod.W0(R.string.arg_RES_7f101c8a);
          uod.y0(R.string.arg_RES_7f103e5b);
          uod.s0(new h(tb));
          uod.B0(R.drawable.arg_RES_7f081cc5);
          uod = b.c(uod);
          uod.L(new j(tb, R.layout.arg_RES_7f0d11ad));
          uod.X();
       }
       b.a(this.b.p, "LATEST_ALBUM", Boolean.valueOf((QCurrentUser.ME.isDisableLatestAlbumAsset() ^ i)));
       return;
    }
}
