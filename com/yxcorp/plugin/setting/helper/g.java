package com.yxcorp.plugin.setting.helper.g;
import java.util.concurrent.Callable;
import com.yxcorp.plugin.setting.helper.j;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import android.content.res.Resources;
import java.lang.String;
import java.lang.CharSequence;
import u07.t$a;
import pgd.o;
import u07.u;
import pgd.p;
import u07.t;
import u07.j;
import java.lang.Boolean;

public final class g implements Callable	// class@0008ba
{
    public final j b;
    public final SlipSwitchButton c;

    public void g(j p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       Boolean uBoolean;
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       ContactPermissionHolder e = j.e;
       if (!e.d()) {
          if (tb.i()) {
             if (!ContactPermissionHolder.f()) {
                d uod = new d(tb.b);
                uod.b1(KwaiDialogOption.d);
                uod.X0(tb.b.getResources().getString(R.string.arg_RES_7f103e24));
                uod.S0(R.string.arg_RES_7f103a83);
                uod.Q0(R.string.cancel);
                uod.t0(new o(tb, tc));
                uod.u0(new p(tb, tc));
                j.d(uod);
             }else {
                tb.b(tc, (tc.getSwitch() ^ 0x01));
                uBoolean = Boolean.valueOf(e.d());
             label_0074 :
                return uBoolean;
             }
          }else {
             tb.j(tc);
          }
       }
       uBoolean = Boolean.valueOf(e.d());
       goto label_0074 ;
    }
}
