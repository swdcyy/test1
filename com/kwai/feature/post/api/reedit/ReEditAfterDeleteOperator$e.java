package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import l46.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o07.o;

public final class ReEditAfterDeleteOperator$e implements PopupInterface$h	// class@001430
{
    public final GifshowActivity b;
    public final String c;

    public void ReEditAfterDeleteOperator$e(GifshowActivity p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditAfterDeleteOperator$e.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       ReEditAfterDeleteOperator$e tb = this.b;
       ReEditAfterDeleteOperator$e tc = this.c;
       if (!PatchProxy.applyVoidTwoRefs(tb, tc, null, b.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "REEDIT_DELETE_TIPS";
          i3 oi3 = i3.f();
          oi3.d("task_id", tc);
          uElementPack.params = oi3.e();
          u1.C0("", tb, 3, uElementPack, null);
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
