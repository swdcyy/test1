package oj.c;
import android.view.View$OnClickListener;
import com.gifshow.tuna.player.poi.f;
import android.app.Activity;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import android.net.Uri;
import ekd.w0;
import nj.a;
import nj.g;
import k2b.e0;
import nj.b;
import oj.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class c implements View$OnClickListener	// class@0027d3
{
    public final f b;
    public final Activity c;

    public void c(f p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       this.c.startActivity(new Intent("android.intent.action.VIEW", w0.f("kwai://profile/"+QCurrentUser.ME.getId()+"?tabId=6&subTabId=4")));
       e0 uoe0 = tb.a.a.c();
       if (PatchProxy.applyVoidOneRefs(uoe0, null, h.class, "3")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COLLECT_SUCCESS_DIALOG";
          i3 oi3 = i3.f();
          oi3.d("card_type", "1");
          uElementPack.params = oi3.e();
          u1.L("", uoe0, 1, uElementPack, null);
       }
       return;
    }
}
