package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$e;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xx9.a;
import com.yxcorp.gifshow.entity.QPhoto;
import m9a.y;
import rf5.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import java.lang.Long;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class SidebarProgressElement$e extends ViewPager$l	// class@0013c9
{
    public final SidebarProgressElement b;

    public void SidebarProgressElement$e(SidebarProgressElement p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       SidebarProgressElement$e uoe1;
       SidebarProgressElement$e uoe = SidebarProgressElement$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "1")) {
          return;
       }
       if (!p0) {
          SidebarProgressElement z = this.b.z;
          if (z == null) {
             a.S("mScreenCleanStatusCombination");
          }
          String str = "mPhoto";
          if (z.c()) {
             z = this.b.t;
             if (z == null) {
                a.S(str);
             }
             if (y.a(z) && SidebarProgressElement.s0(this.b).v()) {
                uoe1 = 1;
             label_0048 :
                SidebarProgressElement w = this.b.w;
                if (w == null) {
                   a.S("mDetailParam");
                }
                if (w.getBizType() == 4 && uoe1) {
                   uoe1 = this.b;
                   Objects.requireNonNull(uoe1);
                   if (!PatchProxy.applyVoid(null, uoe1, SidebarProgressElement.class, "18")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "PROGRESS_BUTTON";
                      i3 oi3 = i3.f();
                      oi3.d("progress_type", "VERTICAL_SCREE");
                      SidebarProgressElement u = uoe1.u;
                      if (u == null) {
                         a.S("mPlayModule");
                      }
                      e player = u.getPlayer();
                      a.o(player, "mPlayModule.player");
                      oi3.c("time_start", Long.valueOf(player.getCurrentPosition()));
                      uElementPack.params = oi3.e();
                      w = uoe1.t;
                      if (w == null) {
                         a.S(str);
                      }
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = w1.f(w.getEntity());
                      z = uoe1.x;
                      if (z == null) {
                         a.S("mFragment");
                      }
                      Objects.requireNonNull(z, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
                      u1.D0("", z, 0, uElementPack, uContentPack, null);
                   }
                }
             }
          }
       label_0047 :
          uoe1 = null;
          goto label_0048 ;
       }
    label_00d4 :
       return;
    }
}
