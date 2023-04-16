package com.kuaishou.merchant.interpretation.presenter.b$d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.interpretation.presenter.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h04.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b$d extends m	// class@001856
{
    public final b c;

    public void b$d(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
          return;
       }
       b p = this.c.p;
       if (!PatchProxy.applyVoidOneRefs(p, null, a.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLOSE_BUTTON";
          u1.L("", p, 1, uElementPack, null);
       }
       b$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, b.class, "8")) {
          tc.getActivity().finish();
       }
       return;
    }
}
