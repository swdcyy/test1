package com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$d;
import com.kuaishou.live.core.show.screenrecord.m$a;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.widget.LiveAudienceScreenRecordControllerView;
import crd.b;
import android.view.View;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ya1.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import ym5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rkd.b;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason;
import lnc.a1;
import qkd.c;
import java.lang.Long;
import java.lang.System;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordContainerFragment;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import ij2.n;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import ij2.v0;

public class LiveAudienceScreenRecordBottomBarPresenter$d implements m$a	// class@000fd3
{
    public final LiveAudienceScreenRecordBottomBarPresenter a;

    public void LiveAudienceScreenRecordBottomBarPresenter$d(LiveAudienceScreenRecordBottomBarPresenter p0){
       this.a = p0;
       super();
    }
    public void a(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceScreenRecordBottomBarPresenter$d.class, "1")) {
          return;
       }
       LiveAudienceScreenRecordBottomBarPresenter$d ta = this.a;
       ta.G = true;
       LiveAudienceScreenRecordBottomBarPresenter d = ta.D;
       Objects.requireNonNull(d);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, d, LiveAudienceScreenRecordControllerView.class, "10")) {
          d.o = 0;
          d.r = 0;
          LiveAudienceScreenRecordControllerView s = d.s;
          if (s != null) {
             s.dispose();
             d.s = objArray;
          }
          d.invalidate();
       }
       ta = this.a;
       LiveAudienceScreenRecordBottomBarPresenter d1 = ta.D;
       int i = (int)((float)ta.K / 1000.00f);
       Objects.requireNonNull(d1);
       if (!PatchProxy.isSupport(LiveAudienceScreenRecordControllerView.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), d1, LiveAudienceScreenRecordControllerView.class, "8") && i >= 1)) {
          d1.a();
          long l = (long)i;
          d1.j = l;
          l = (l * 10) + 6;
          d uod = new d(d1, l);
          d1.s = t.interval(0, 100, TimeUnit.MILLISECONDS).take(l).observeOn(d.a).subscribe(uod, Functions.d());
       }
       b.c0(LiveLogTag.LIVE_SCREEN_RECORD, "mLiveScreenRecordService.startRecord", "file:", p0);
       if (d.a(0x4c5dd1b8).f2()) {
          this.a.getActivity().setRequestedOrientation((b.e() ^ true));
       }
       return;
    }
    public void b(int p0){
       LiveAudienceScreenRecordBottomBarPresenter$d uod = LiveAudienceScreenRecordBottomBarPresenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "3")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SCREEN_RECORD, "mLiveScreenRecordService.onRecordFail", "result:", Integer.valueOf(p0));
       uod = this.a;
       if (uod.G != null) {
          if (p0 == 3) {
             uod.V8(LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_DELETE, a1.p(R.string.arg_RES_7f102b43));
          }else {
             uod.V8(LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_DELETE, "");
          }
       }else {
          uod.D.a();
       }
       return;
    }
    public void c(File p0){
       LiveAudienceScreenRecordContainerFragment liveAudience;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceScreenRecordBottomBarPresenter$d.class, "2")) {
          return;
       }
       LiveLogTag lIVE_SCREEN_ = LiveLogTag.LIVE_SCREEN_RECORD;
       String str = "mLiveScreenRecordService.stopRecord";
       b.c0(lIVE_SCREEN_, str, "screenRecordFile:", p0);
       if (p0 == null) {
          return;
       }
       long l = c.i(p0.getPath());
       b.c0(lIVE_SCREEN_, str, "fileSize", Long.valueOf(l));
       if (!l - null) {
          return;
       }
       LiveAudienceScreenRecordBottomBarPresenter h = this.a.H;
       if (h == LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_PUBLISH) {
          LiveAudienceScreenRecordBottomBarPresenter$d ta = this.a;
          long l1 = System.currentTimeMillis() - ta.I;
          LiveAudienceScreenRecordBottomBarPresenter p = ta.p;
          LiveAudienceScreenRecordBottomBarPresenter q = ta.q;
          if (PatchProxy.isSupport(LiveAudienceScreenRecordContainerFragment.class)) {
             liveAudience = PatchProxy.applyFourRefs(p0, Long.valueOf(l1), p, q, null, LiveAudienceScreenRecordContainerFragment.class, "1");
             if (liveAudience != PatchProxyResult.class) {
             label_0076 :
                ta.C = liveAudience;
                this.a.C.k0(new n(this));
                LiveAudienceScreenRecordBottomBarPresenter$d ta1 = this.a;
                ta1.C.Cb(ta1.q.b().getChildFragmentManager(), "AudienceRecordPublic");
             }
          }
          liveAudience = new LiveAudienceScreenRecordContainerFragment();
          liveAudience.Ah(0);
          liveAudience.A = p0;
          liveAudience.B = l1;
          liveAudience.D = p;
          liveAudience.E = q;
          goto label_0076 ;
       }else if(h == LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_DELETE){
          h.a();
       }
       if (d.a(0x4c5dd1b8).f2()) {
          this.a.getActivity().setRequestedOrientation(this.a.L);
       }
       return;
    }
}
