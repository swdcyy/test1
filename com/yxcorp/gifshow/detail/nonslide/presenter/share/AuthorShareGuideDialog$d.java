package com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$d;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yhc.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import qrd.l1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public final class AuthorShareGuideDialog$d implements View$OnClickListener	// class@0015d4
{
    public final c b;

    public void AuthorShareGuideDialog$d(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthorShareGuideDialog$d.class, "1")) {
          return;
       }
       a a = a.a;
       a.d();
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(null, a, a.class, "5")) {
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
          uAreaPackage.name = "MASTER_SHARE_TIP_POPUP";
          uClickEvent.areaPackage = uAreaPackage;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLOSE_POPUP";
          uClickEvent.elementPackage = uElementPack;
          u1.a0(uClickEvent);
       }
       this.b.q(4);
       return;
    }
}
