package cy1.f;
import n17.a;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.Objects;
import cy1.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.util.List;
import cy1.q;
import fy1.a;
import java.lang.Long;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import d61.h0;
import com.google.common.base.Optional;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class f implements a	// class@001eaf
{
    public final i a;

    public void f(i p0){
       this.a = p0;
    }
    public final void a(View p0,int p1,RecyclerView$ViewHolder p2){
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, null, s.class, "1")) {
       }else {
          s.a = System.currentTimeMillis();
       }
       ta.m9();
       ClientContent$LiveStreamPackage liveStreamPa = ta.t.a();
       List list = ta.V.d();
       long l = ta.V.c();
       if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidThreeRefs(liveStreamPa, list, Long.valueOf(l), null, a.class, "2") && !q.f(list))) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 1302;
          uElementPack.action2 = "CLICK_TO_ONLINE_USER_INFO_PANEL";
          int i = list.size();
          ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
          ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[i];
          for (int i1 = 0; i1 < i; i1 = i2) {
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             userPackage.identity = h0.a(list.get(i1));
             int i2 = i1 + 1;
             userPackage.index = i2;
             userPackageA[i1] = userPackage;
          }
          uBatchUserPa.userPackage = userPackageA;
          liveStreamPa.identity = Optional.fromNullable(liveStreamPa.liveStreamId).or("");
          liveStreamPa.name = String.valueOf(l);
          ClientContent$UserPackage userPackage1 = new ClientContent$UserPackage();
          userPackage1.identity = h0.a(liveStreamPa.anchorUserId);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.batchUserPackage = uBatchUserPa;
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.userPackage = userPackage1;
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
}
