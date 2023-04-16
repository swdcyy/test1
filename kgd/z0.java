package kgd.z0;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.d0$a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.plugin.setting.entries.holder.d0;
import k2b.e0;
import nc5.i;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class z0 implements g	// class@0017cb
{
    public final d0$a b;

    public void z0(d0$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          if (!PatchProxy.applyVoid(null, tb, d0$a.class, "12")) {
             p0 = new ClientEvent$ElementPackage();
             p0.type = 15;
             p0.action = 0x7578;
             p0.name = "show_download_management";
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.elementPackage = p0;
             b.a(0x4b316083).h(showEvent);
          }
          tb.R8();
       }else {
          i.b(1022, tb.u.c);
          tb.m8().setVisibility(8);
       }
       return;
    }
}
