package jgd.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.view.View;
import sgd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import vo5.c;
import android.app.Activity;

public final class c implements View$OnClickListener	// class@0016df
{
    public final GifshowActivity b;

    public void c(GifshowActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       if (PatchProxy.applyVoid(null, null, c.class, "3")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.params = i3.f().e();
          uElementPack.action2 = "BLOCK_SETTING_BUTTON";
          u1.u(1, uElementPack, null);
       }
       d.a(0x17cdea8).PG(tb);
       return;
    }
}
