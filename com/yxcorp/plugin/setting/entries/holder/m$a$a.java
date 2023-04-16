package com.yxcorp.plugin.setting.entries.holder.m$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.m$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.entries.holder.m;
import kgd.b0;
import kgd.c0;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import ki5.b;
import java.lang.CharSequence;
import kgd.y;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import u07.b;
import kgd.z;
import erd.g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;

public class m$a$a implements View$OnClickListener	// class@000872
{
    public final m$a b;

    public void m$a$a(m$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a$a.class, "1")) {
          return;
       }
       m a = this.b.r.a;
       b0 uob0 = new b0(this);
       c0 uoc0 = new c0(this);
       if (!PatchProxy.applyVoidThreeRefsWithListener(a, uob0, uoc0, null, m.class, "4")) {
          d uod = new d(a);
          uod.b1(KwaiDialogOption.d);
          uod.V0(true);
          uod.W0(R.string.arg_RES_7f101715);
          uod.z0(b.b().c(R.string.arg_RES_7f1046cd));
          uod.B0(R.drawable.arg_RES_7f08228f);
          uod.M(new y(a));
          uod = b.c(uod);
          uod.L(new z(R.layout.arg_RES_7f0d11ad, a, uob0, uoc0));
          uod.X();
          PatchProxy.onMethodExit(m.class, "4");
       }
       return;
    }
}
