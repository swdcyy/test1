package com.kuaishou.live.preview.item.presenter.d0;
import android.view.View$OnClickListener;
import com.kuaishou.live.preview.item.presenter.g0;
import java.lang.Object;
import android.view.View;
import dl3.a1;
import tyc.q0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rl3.a;
import k2b.u1;

public final class d0 implements View$OnClickListener	// class@000e1a
{
    public final g0 b;

    public void d0(g0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d0 tb = this.b;
       tb.y.a(p0, new a1(tb));
       g0 p = tb.p;
       if (PatchProxy.applyVoidOneRefs(p, tb, g0.class, "7")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AUTHOR_NICKNAME_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("button_position", "COMMENT");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = a.a(p.mEntity, 1);
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
}
