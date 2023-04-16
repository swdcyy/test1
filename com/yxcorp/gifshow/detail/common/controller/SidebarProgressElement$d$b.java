package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d$b;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import com.kwai.component.photo.detail.core.helper.VideoPlayProgressHelper;
import usd.q;
import rx9.h;
import java.lang.Runnable;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Long;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import qp7.g;
import qp7.b;
import fq7.c;
import io.reactivex.subjects.PublishSubject;

public final class SidebarProgressElement$d$b implements g	// class@0013c6
{
    public final SidebarProgressElement$d b;

    public void SidebarProgressElement$d$b(SidebarProgressElement$d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       SidebarProgressElement u;
       e player;
       if (PatchProxy.applyVoidOneRefs(p0, this, SidebarProgressElement$d$b.class, "1")) {
       }else {
          SidebarProgressElement$d b = this.b.b;
          a.o(p0, "tracking");
          boolean b1 = p0.booleanValue();
          Objects.requireNonNull(b);
          SidebarProgressElement sidebarProgr = SidebarProgressElement.class;
          if (!PatchProxy.isSupport(sidebarProgr) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), b, sidebarProgr, "16")) {
             String str = "mPlayModule";
             boolean b3 = false;
             if (b1) {
                b.K = b3;
                b.I = true;
                u = b.u;
                if (u == null) {
                   a.S(str);
                }
                player = u.getPlayer();
                a.o(player, "mPlayModule.player");
                b.J = player.getCurrentPosition();
             }else {
                b.I = b3;
                u = b.A;
                String str1 = "mProgressHelper";
                if (u == null) {
                   a.S(str1);
                }
                long l = q.v(b.H, q.o(u.getDuration(), 0));
                u = b.A;
                if (u == null) {
                   a.S(str1);
                }
                u.seekAndRun(l, new h(b, l));
                if (!PatchProxy.applyVoid(null, b, sidebarProgr, "17")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "PROGRESS_BUTTON";
                   i3 oi3 = i3.f();
                   sidebarProgr = b.x;
                   str1 = "mFragment";
                   if (sidebarProgr == null) {
                      a.S(str1);
                   }
                   String str2 = "progress_type";
                   if (n.I(sidebarProgr.getActivity())) {
                      oi3.d(str2, "LANDSCAPE_SCREE");
                   }else {
                      oi3.d(str2, "VERTICAL_SCREE");
                   }
                   oi3.c("time_start", Long.valueOf(b.J));
                   sidebarProgr = b.u;
                   if (sidebarProgr == null) {
                      a.S(str);
                   }
                   e player1 = sidebarProgr.getPlayer();
                   a.o(player1, "mPlayModule.player");
                   oi3.c("time_end", Long.valueOf(player1.getCurrentPosition()));
                   uElementPack.params = oi3.e();
                   u = b.t;
                   if (u == null) {
                      a.S("mPhoto");
                   }
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.photoPackage = w1.f(u.getEntity());
                   SidebarProgressElement x = b.x;
                   if (x == null) {
                      a.S(str1);
                   }
                   Objects.requireNonNull(x, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
                   u1.M("", x, 0, uElementPack, uContentPack, null);
                }
             }
          }
          c uoc = this.b.b.D();
          boolean b2 = p0.booleanValue();
          Objects.requireNonNull(uoc);
          c uoc1 = c.class;
          if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b2), uoc, uoc1, "2")) {
             uoc.b.onNext(Boolean.valueOf(b2));
          }
       }
       return;
    }
}
