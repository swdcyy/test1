package hb2.k;
import android.view.View$OnClickListener;
import hb2.l;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yj2.a;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import kp3.e;
import cq5.a;

public final class k implements View$OnClickListener	// class@002d4c
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a0 l;
       k tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, l.class, "5")) {
       }else {
          l q = tb.q;
          LiveStreamFeedWrapper mEntity = q.c.mEntity;
          BaseFragment uBaseFragmen = q.Z2.b();
          ClientContent$LiveStreamPackage liveStreamPa = tb.q.Z2.a();
          l = tb.q.l;
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray1 = new Object[]{mEntity,uBaseFragmen,liveStreamPa,Integer.valueOf(7),Integer.valueOf(l),Boolean.FALSE};
             if (!PatchProxy.applyVoid(objArray1, objArray, uoa, "7")) {
             label_005b :
                if (mEntity != null) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "MORELIST_OPEN_CLICK";
                   i3 oi3 = i3.f();
                   oi3.d("operate_type", "click_open");
                   uElementPack.params = oi3.e();
                   u1.L("300369", uBaseFragmen, 1, uElementPack, a.b(mEntity, liveStreamPa, 7));
                }
             }
          }else {
             goto label_005b ;
          }
          if (!tb.p.s()) {
             l q1 = tb.q;
             a0 k1 = q1.K1;
             if (k1 != null) {
                k1.d();
             }else {
                a0 l1 = q1.L1;
                if (l1 != null) {
                   l1.d();
                }
             }
          }
       }
       return;
    }
}
