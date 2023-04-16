package com.kwai.live.gzone.promotion.s;
import rq5.a;
import androidx.fragment.app.FragmentActivity;
import android.view.View;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.widget.TextView;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq5.b;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import s67.i1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.CharSequence;
import android.app.Activity;
import com.yxcorp.utility.n;
import kq3.a;
import androidx.fragment.app.c;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import tkd.b;
import tkd.d;
import os5.h;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Application;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.util.Objects;
import java.lang.StringBuilder;

public class s extends a	// class@000dd8
{
    public final FragmentActivity h;
    public final View i;
    public View j;
    public TextView k;
    public TextView l;
    public TextView m;
    public ProgressBar n;
    public TextView o;
    public TextView p;
    public TextView q;
    public View r;
    public KwaiImageView s;
    public LiveGzonePromotionGame t;
    public b u;
    public final List v;

    public void s(FragmentActivity p0,View p1){
       super();
       LivePendantRelation[] livePendantR = new LivePendantRelation[]{LivePendantRelation.SCREEN_LANDSCAPE,LivePendantRelation.CHAT};
       this.v = Arrays.asList(livePendantR);
       this.h = p0;
       this.i = p1;
       p1.setLayoutParams(new ViewGroup$LayoutParams(a1.e(104.00f), a1.e(96.00f)));
       this.k = p1.findViewById(0x7f0a1f0b);
       this.l = p1.findViewById(0x7f0a1f0a);
       this.m = p1.findViewById(0x7f0a1f10);
       this.n = p1.findViewById(0x7f0a1f0e);
       this.o = p1.findViewById(0x7f0a1f0f);
       this.p = p1.findViewById(0x7f0a1f0c);
       this.q = p1.findViewById(0x7f0a1f0d);
       this.r = p1.findViewById(0x7f0a1f09);
       this.j = p1.findViewById(0x7f0a1f07);
       this.s = p1.findViewById(0x7f0a1f14);
    }
    public View H(){
       return this.i;
    }
    public List c(){
       return this.v;
    }
    public LivePendantPriority f(){
       return LivePendantPriority.GZONE_GAME_PROMOTION;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.GZONE_GAME_PROMOTION;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       if (this.t != null) {
          s tu = this.u;
          if (tu != null) {
             String liveStreamId = tu.getLiveStreamId();
             LiveGzonePromotionGame mGameId = this.t.mGameId;
             ClientContent$LiveStreamPackage liveStreamPa = this.u.a();
             if (!PatchProxy.applyVoidThreeRefs(liveStreamId, mGameId, liveStreamPa, null, i1.class, "17")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LGP_CARD";
                i3 oi3 = i3.f();
                oi3.d("room_id", liveStreamId);
                oi3.d("imei_or_idfa", TextUtils.k(SystemUtil.m(a.B)));
                oi3.d("sceneId", "127");
                oi3.d("game_id", mGameId);
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.u0(6, uElementPack, uContentPack);
             }
          }
       }
       return;
    }
    public final void x(String p0){
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, str)) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       a uoa = a.b(this.h);
       uoa.c = this.h.getSupportFragmentManager();
       uoa.g("live-game-promotion-detail-dialog");
       uoa.f("live-game-promotion-detail-fragment");
       uoa.b.setPortraitHeightPixel((int)((float)n.j(this.h) * 0x3f19999a)).setLayoutType(str).setInOutAnimation(0).setDimAmount(0);
       d.a(0x2cb5d4a8).pu(p0, uoa);
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, s.class, "5")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       this.n.setProgress(100);
       s to = this.o;
       String str = (SystemUtil.M(a.b(), this.t.mIdentifier))? a1.p(R.string.arg_RES_7f103c08): a1.p(R.string.arg_RES_7f100aad);
       to.setText(str);
       return;
    }
    public void z(GameCenterDownloadParams$DownloadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "4")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       if (p0 == null) {
          this.y();
       }else {
          GameCenterDownloadParams$DownloadInfo mStage = p0.mStage;
          Objects.requireNonNull(mStage);
          int i = -1;
          switch (mStage.hashCode()){
              case 0xae7a2e7a:
                if (mStage.equals("cancel")) {
                   i = 0;
                }
                break;
              case 0xc454c22d:
                if (mStage.equals("progress")) {
                   i = 1;
                }
                break;
              case 0xc84dc82d:
                if (mStage.equals("resume")) {
                   i = 2;
                }
                break;
              case 0xdc453139:
                if (mStage.equals("complete")) {
                   i = 3;
                }
                break;
              case 0x379175:
                if (mStage.equals("wait")) {
                   i = 4;
                }
                break;
              case 0x5c4d208:
                if (mStage.equals("error")) {
                   i = 5;
                }
                break;
              case 0x65825f6:
                if (mStage.equals("pause")) {
                   i = 6;
                }
                break;
              case 0x68ac462:
                if (mStage.equals("start")) {
                   i = 7;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.y();
                break;
              case 1:
              case 7:
              case 2:
                this.n.setProgress(p0.getPercent());
                this.o.setText(p0.getPercent()+"%");
                break;
              case 3:
                this.n.setProgress(100);
                s to = this.o;
                String str = (SystemUtil.M(a.b(), this.t.mIdentifier))? a1.p(R.string.arg_RES_7f103c08): a1.p(R.string.arg_RES_7f101174);
                to.setText(str);
                break;
              case 4:
              case 6:
              case 5:
                this.n.setProgress(p0.getPercent());
                this.o.setText(a1.p(R.string.arg_RES_7f100aac));
                break;
              default:
          }
       }
       return;
    }
}
