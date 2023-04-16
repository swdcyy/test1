package com.yxcorp.plugin.setting.presenter.j$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.presenter.j;
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
import tgd.p;
import u07.u;
import u07.b;
import tgd.r;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import k2b.e0;
import sgd.b;

public class j$a implements View$OnClickListener	// class@0008e0
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       j$a tb = this.b;
       Objects.requireNonNull(tb);
       int i = 1;
       if (!PatchProxy.applyVoid(null, tb, j.class, "4")) {
          d uod = new d(tb.p);
          uod.b1(KwaiDialogOption.d);
          uod.V0(i);
          uod.W0(R.string.arg_RES_7f103e55);
          uod.y0(R.string.arg_RES_7f103e5a);
          uod.s0(new p(tb));
          uod.B0(R.drawable.arg_RES_7f081cc5);
          uod = b.c(uod);
          uod.L(new r(tb, R.layout.arg_RES_7f0d11ad));
          uod.X();
       }
       b.a(this.b.p, "ALBUM_TABS", Boolean.valueOf((QCurrentUser.ME.isDisableSmartAlbumTabs() ^ i)));
       return;
    }
}
