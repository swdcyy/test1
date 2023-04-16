package com.kuaishou.growth.privacy.dialog.helper.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.growth.privacy.dialog.helper.e;
import android.app.Activity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import wf0.f;
import android.view.View$OnClickListener;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o07.o;

public class d implements PopupInterface$h	// class@000712
{
    public final Activity b;
    public final e c;

    public void d(e p0,Activity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       View view = p0.z();
       if (view == null) {
          return;
       }
       view.findViewById(R.id.positive).setOnClickListener(new f(this, this.b));
       d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, e.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "UNOFFICIAL_WARNING_DIALOG";
          u1.u0(4, uElementPack, null);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
