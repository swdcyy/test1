package com.yxcorp.gifshow.activity.share.presenter.f2$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.presenter.f2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class f2$a extends m	// class@0013e0
{
    public final f2 c;

    public void f2$a(f2 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f2$a.class, "1")) {
          return;
       }
       f2$a tc = this.c;
       tc.s = false;
       tc.p.setVisibility(8);
       if (!PatchProxy.applyVoid(null, null, a.class, "90")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TOP_NOSENSE_TOPIC_REMIND_CLOSE";
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
