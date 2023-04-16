package com.kuaishou.live.core.show.redpacket.activity.h$d;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager$a;
import com.kuaishou.live.core.show.redpacket.activity.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import t02.a0;
import t02.r1;
import kq3.a;
import c22.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import og2.s;
import android.content.DialogInterface$OnDismissListener;
import java.lang.Long;
import cm1.a;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams$b;
import com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams;
import eg1.e;
import lp3.c;
import lp3.i;
import dg1.a;
import pg2.a;
import g03.a;
import sz2.c;
import pz2.c;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Integer;
import ekd.j;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.redpacket.activity.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kuaishou.live.core.show.template.LiveActivityPopupDialog;
import com.kwai.robust.PatchProxyResult;
import og2.t;

public class h$d implements LiveRedPacketActivityManager$a	// class@000e5f
{
    public final h a;

    public void h$d(h p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "1")) {
          return;
       }
       h$d ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, h.class, "5") || (TextUtils.x(p0) || (g.h(ta.getActivity()) || (ta.R8() != null && ta.R8().getFragmentManager() != null)))) {
          x.E(ta.v);
          a uoa = a.d(ta.getActivity(), ta.p.b().getChildFragmentManager(), ta.q, ta.r);
          uoa.g("red_packet_activity");
          uoa.f("LiveRedPacketActivityWebViewDialog");
          uoa.b.setPortraitHeightPixel(-1).setLayoutType("3").setInOutAnimation(-1).setDimAmount(0x3f000000);
          a uoa1 = a.c();
          uoa1.f(new s(ta));
          ta.v = uoa1.h(p0, uoa);
       }
    label_0089 :
       return;
    }
    public void b(String p0,long p1){
       h$d uod = h$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uod, "3")) {
          return;
       }
       uod = this.a;
       Objects.requireNonNull(uod);
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), uod, oh, "7")) {
          long l = a.d((int)p1);
          if (e.b().he().g(String.valueOf(l)) == null) {
             b.d0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "playMagicEffect error cause magicFace not found", "magicFaceId", Long.valueOf(l), "giftId", Long.valueOf(p1));
          }else {
             LiveRedPacketActivityEffectParams$b uob = new LiveRedPacketActivityEffectParams$b(p0, l, 0x7ffffb81);
             uob.b(true);
             LiveRedPacketActivityEffectParams liveRedPacke = uob.a();
             uod.s.a(e.class).o1(new a(liveRedPacke, uod.s.a(a.class).Bl()));
          }
       }
       return;
    }
    public void c(UserInfos$PicUrl[] p0,int p1){
       h$d uod = h$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "2")) {
          return;
       }
       uod = this.a;
       Objects.requireNonNull(uod);
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), uod, oh, "6") && !j.h(p0))) {
          ClientContent$LiveStreamPackage liveStreamPa = uod.p.a();
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Integer.valueOf(p1), null, uoa, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "UNFOLLOW_OPEN_CHEST_CARD";
             uElementPack.params = a.a(p1);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u0(4, uElementPack, uContentPack);
          }
          x.E(uod.w);
          CDNUrl[] uCDNUrlArray = e0.i(p0);
          LiveActivityPopupDialog liveActivity = PatchProxy.applyOneRefs(uCDNUrlArray, null, LiveActivityPopupDialog.class, "1");
          if (liveActivity != PatchProxyResult.class) {
          }else {
             liveActivity = new LiveActivityPopupDialog();
             liveActivity.w = uCDNUrlArray;
          }
          uod.w = liveActivity;
          liveActivity.k0(new t(uod, p1));
          Fragment uFragment = uod.R8();
          x.F(uod.w, uFragment, "LiveRedPacketActivityFollowAnchorTipsDialog");
       }
       return;
    }
}
