package com.kuaishou.live.core.show.closepage.audience.feed.recommand.a$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.closepage.audience.feed.recommand.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import h52.j;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import im8.f;
import java.lang.Integer;
import j52.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import yp.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;

public class a$b extends m	// class@000a49
{
    public final a c;

    public void a$b(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a$b tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, a.class, "6")) {
          a w = tc.w;
          LiveStreamFeed entity = tc.z.f.getEntity();
          int i = tc.x.get().intValue();
          a z = tc.z;
          j b = z.b;
          int i1 = 0;
          boolean b1 = (z.e != null)? true: false;
          if (PatchProxy.isSupport(a.class)) {
             Object[] objArray1 = new Object[]{w,entity,Integer.valueOf(i),b,Boolean.valueOf(b1)};
             if (PatchProxy.applyVoid(objArray1, objArray, a.class, "5")) {
             label_00c9 :
                tc.R8(tc.z.f);
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_CARD_CLICK";
          i3 oi3 = i3.f();
          oi3.c("is_auto_play", Integer.valueOf(b1));
          oi3.d("lv_params", x.g(entity));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = x.e(entity, 2);
          ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
          new ClientContentWrapper$ContentWrapper().moreInfoPackage = moreInfoPack;
          moreInfoPack.type = b;
          u1.B(new ClickMetaData().setLogPage(w).setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(r1.O0(entity)));
          goto label_00c9 ;
       }
       return;
    }
}
