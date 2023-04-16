package com.kuaishou.live.core.show.banned.i;
import lf3.g;
import com.kuaishou.live.core.show.banned.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import com.kuaishou.live.core.show.banned.d$c;
import k2b.u1;
import com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$AuditAudienceMask;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.yxcorp.gifshow.model.CDNUrl;
import d61.j;
import z12.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.basic.model.StreamType;
import android.widget.ImageView;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import o32.p;
import android.view.View$OnClickListener;
import o32.s;
import ekd.m1;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import com.kuaishou.live.core.show.floatingwindow.e$h;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import o32.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.util.rx.RxBus;
import rw2.c;
import lf3.f;

public final class i implements g	// class@0009ef
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b;
       i tb = this.b;
       Objects.requireNonNull(tb);
       LiveLogTag lIVE_WARNING = LiveLogTag.LIVE_WARNING_MASK;
       lIVE_WARNING.appendTag("LiveWarningMaskAudienceV2");
       b.P(lIVE_WARNING, "onReceive Audience WaringMask Msg");
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oj, "9")) {
       }else if(p0 != null){
          ClientEvent$ElementPackage obj = PatchProxy.apply(null, tb, oj, "8");
          b = (obj != PatchProxyResult.class)? obj.booleanValue(): tb.u.H1.a();
          if (!b) {
             if (p0.displayMask != null) {
                if (!PatchProxy.applyVoidOneRefs(p0, tb, oj, "10")) {
                   b.P(lIVE_WARNING.appendTag("LiveWarningMaskAudienceV2"), "showWaringMask");
                   LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience warningMask = p0.warningMask;
                   tb.s = u1.f();
                   if (warningMask != null) {
                      CDNUrl[] uCDNUrlArray = j.c(warningMask.iconCdnNodeView);
                      LiveAdminAuditMessages$AuditAudienceMask title = warningMask.title;
                      LiveAdminAuditMessages$AuditAudienceMask detail = warningMask.detail;
                      String str = "";
                      if (!PatchProxy.applyVoidThreeRefs(uCDNUrlArray, title, detail, tb, j.class, "4")) {
                         int i = 0;
                         String[] stringArray = new String[i];
                         e.c("LiveWarningMaskAudienceV2", "showLiveBannedView", stringArray);
                         if (tb.getActivity() != null && y.d(tb.getActivity())) {
                            tb.getActivity().setRequestedOrientation(1);
                         }
                         if (tb.u.e.mStreamType != StreamType.LINE_LIVE.toInt() && (tb.u.e.mStreamType == StreamType.GAME_LIVE.toInt() || tb.u.e.mStreamType == StreamType.VIDEO.toInt())) {
                            tb.q.setVisibility(i);
                         }
                         String str1 = a.t().u("SOURCE_LIVE").c("liveAudienceWarningMaskMoreLiveButtonLink", str);
                         int i1 = TextUtils.x(str1) ^ 1;
                         j t = tb.t;
                         if (t != null && t.getParent() != null) {
                            t = tb.t;
                            int i2 = (i1)? 0x7f0d09f1: 0x7f0d09f0;
                            t.setLayoutResource(i2);
                            tb.r = tb.t.inflate();
                         }
                         t = tb.r;
                         if (t != null) {
                            t.setVisibility(i);
                            tb.r.findViewById(R.id.live_audience_banned_image_view).U(uCDNUrlArray);
                            tb.r.findViewById(R.id.live_audience_banned_title_text_view).setText(title);
                            tb.r.findViewById(R.id.live_audience_banned_sub_title_text_view).setText(detail);
                            tb.r.findViewById(R.id.live_audience_banned_exit_text_view).setOnClickListener(new p(tb, i1));
                            if (i1) {
                               m1.a(tb.r, new s(tb, str1), R.id.live_audience_banned_more_live_view);
                            }
                            tb.v.a(LiveFloatingWindowCloseType.UNKNOWN);
                         }
                      }
                      BaseFragment uBaseFragmen = tb.u.Z2.b();
                      ClientContent$LiveStreamPackage liveStreamPa = tb.u.Z2.a();
                      if (!PatchProxy.applyVoidTwoRefs(uBaseFragmen, liveStreamPa, null, u.class, "4")) {
                         obj = new ClientEvent$ElementPackage();
                         obj.action2 = "LIVE_MASK_POPUP";
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.liveStreamPackage = liveStreamPa;
                         u1.C0(str, uBaseFragmen, 10, obj, uContentPack);
                      }
                   }
                   u.c(tb.s, 1, tb.u.Z2.a());
                   tb.u.E.stopPlay("WarningMask");
                   RxBus.f.b(new c(4));
                }
             }else if(PatchProxy.applyVoid(null, tb, oj, "11")){
                lIVE_WARNING.appendTag("LiveWarningMaskAudienceV2");
                b.P(lIVE_WARNING, "removeWaringMask");
                tb.R8();
                tb.P8();
                tb.u.E.startPlay("WarningMask");
                RxBus.f.b(new c(3));
             }
          }
       }
       b.Z(lIVE_WARNING, "audience onReceiveMsg but msg is null or isBanned");
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
