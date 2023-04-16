package com.yxcorp.gifshow.relation.black.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.black.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.BlockUser;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y8c.r;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import com.yxcorp.gifshow.relation.black.b;
import u07.u;
import com.yxcorp.gifshow.relation.black.c;
import u07.a;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import wkd.b;
import rfc.a;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import cjd.e;
import erd.o;
import x9c.c;
import com.yxcorp.gifshow.relation.black.d;
import android.content.Context;
import erd.g;
import crd.b;

public final class a implements View$OnClickListener	// class@0017df
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uof, "6")) {
       }else {
          Object[] objArray = null;
          if (tb.n.mBlockedUser.mBlacked == null) {
             if (!PatchProxy.applyVoid(objArray, tb, uof, "9")) {
                GifshowActivity gifshowActiv = tb.C();
                if (gifshowActiv != null) {
                   d uod = new d(gifshowActiv);
                   uod.b1(KwaiDialogOption.d);
                   uod.B0(R.drawable.arg_RES_7f0805d4);
                   uod.W0(R.string.arg_RES_7f104b5c);
                   uod.y0(R.string.arg_RES_7f1003bd);
                   uod.S0(R.string.arg_RES_7f1003b9);
                   uod.Q0(R.string.arg_RES_7f104caf);
                   uod.u0(new b(tb, gifshowActiv));
                   uod.t0(c.b);
                   t$a uoa = a.c(uod);
                   uoa.V0(true);
                   uoa.L(new b(R.layout.arg_RES_7f0d0106));
                   uoa.A(false);
                   uoa.X();
                }
             }
          }else if(PatchProxy.applyVoid(objArray, tb, uof, "8")){
             b.a(0x4a533fa).b(QCurrentUser.ME.getId(), tb.n.mBlockedUser.getId(), objArray, objArray).map(new e()).subscribe(new c(tb), new d(tb, tb.C()));
          }
       }
       return;
    }
}
