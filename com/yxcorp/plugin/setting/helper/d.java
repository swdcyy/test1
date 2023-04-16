package com.yxcorp.plugin.setting.helper.d;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.gifshow.ContactsEmptyException;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import pgd.q;
import u07.u;
import com.yxcorp.plugin.setting.helper.h;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public final class d implements g	// class@0008b7
{
    public final j b;
    public final SlipSwitchButton c;

    public void d(j p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 instanceof ContactsEmptyException && !ContactPermissionHolder.f()) {
          p0 = new d(tb.b);
          p0.b1(KwaiDialogOption.d);
          p0.W0(R.string.arg_RES_7f104233);
          int i = (tb.i())? 0x7f103e24: 0x7f104231;
          p0.y0(i);
          p0.S0(R.string.arg_RES_7f104232);
          p0.Q0(R.string.cancel);
          p0.t0(new q(tb, tc));
          p0.u0(new h(tb, tc));
          p0.z(false);
          j.d(p0);
       }
       return;
    }
}
