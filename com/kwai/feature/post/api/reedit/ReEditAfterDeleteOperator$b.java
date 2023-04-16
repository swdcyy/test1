package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$b;
import u07.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import q87.c;
import l46.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;

public final class ReEditAfterDeleteOperator$b implements u	// class@00142d
{
    public final GifshowActivity b;
    public final String c;
    public final QPhoto d;

    public void ReEditAfterDeleteOperator$b(GifshowActivity p0,String p1,QPhoto p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReEditAfterDeleteOperator$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("ReEditAfterDeleteOperator", "positive click", objArray);
       ReEditAfterDeleteOperator$b tb = this.b;
       ReEditAfterDeleteOperator$b tc = this.c;
       if (!PatchProxy.applyVoidTwoRefs(tb, tc, null, b.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "REEDIT_DELETE_TIPS";
          i3 oi3 = i3.f();
          oi3.d("task_id", tc);
          uElementPack.params = oi3.e();
          u1.L("", tb, 1, uElementPack, null);
       }
       ReEditAfterDeleteOperator.d.q(this.d);
       return;
    }
}
