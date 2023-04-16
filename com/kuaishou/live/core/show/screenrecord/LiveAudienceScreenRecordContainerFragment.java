package com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.g;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import u07.t$a;
import ij2.q;
import u07.u;
import ij2.r;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordContainerFragment$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import android.os.Bundle;
import android.app.Dialog;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import d61.y;
import lnc.a1;
import androidx.fragment.app.KwaiDialogFragment;
import ij2.p;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordContainerFragment$a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordPreviewFragment;
import java.lang.Long;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class LiveAudienceScreenRecordContainerFragment extends LiveDialogContainerFragment	// class@000fd8
{
    public File A;
    public long B;
    public LiveAudienceScreenRecordPreviewFragment C;
    public a0 D;
    public m E;
    public c F;
    public static final int G;

    public void LiveAudienceScreenRecordContainerFragment(){
       super();
    }
    public boolean Eh(){
       FragmentActivity obj = PatchProxy.apply(null, this, LiveAudienceScreenRecordContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       if (g.h(obj)) {
          return false;
       }
       LiveAudienceScreenRecordContainerFragment tF = this.F;
       if (tF != null && tF.D()) {
          return true;
       }
       b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "showConfirmQuitDialog");
       t$a uoa = new t$a(obj);
       uoa.W0(R.string.arg_RES_7f1002ad);
       uoa.S0(R.string.arg_RES_7f1002ab);
       uoa.Q0(R.string.arg_RES_7f1002a7);
       uoa.w0(true);
       uoa.u0(new q(this));
       uoa.t0(new r(this));
       uoa.D(PopupInterface$Excluded.NOT_AGAINST);
       uoa.R("popup-type-no-against");
       t$a uoa1 = f.e(uoa);
       uoa1.v(true);
       this.F = uoa1.Y(new LiveAudienceScreenRecordContainerFragment$b(this));
       return true;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceScreenRecordContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103bf);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceScreenRecordContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0a47, p1, false);
       if (y.d(this.getActivity())) {
          this.Bh(a1.d(R.dimen.arg_RES_7f0705cd), -1);
       }else {
          this.Bh(-1, a1.d(R.dimen.arg_RES_7f0705cc));
       }
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       LiveAudienceScreenRecordPreviewFragment liveAudience;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceScreenRecordContainerFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p op = new p(this);
       this.Ch(new LiveAudienceScreenRecordContainerFragment$a(this));
       LiveAudienceScreenRecordContainerFragment tA = this.A;
       LiveAudienceScreenRecordContainerFragment tB = this.B;
       LiveAudienceScreenRecordContainerFragment tD = this.D;
       LiveAudienceScreenRecordContainerFragment tE = this.E;
       if (PatchProxy.isSupport(LiveAudienceScreenRecordPreviewFragment.class)) {
          Object[] objArray = new Object[]{tA,Long.valueOf(tB),op,tD,tE};
          liveAudience = PatchProxy.apply(objArray, null, LiveAudienceScreenRecordPreviewFragment.class, "1");
          if (liveAudience != PatchProxyResult.class) {
          label_0062 :
             this.C = liveAudience;
             e uoe = this.getChildFragmentManager().beginTransaction();
             uoe.v(R.id.live_bottom_dialog_container_root, this.C);
             uoe.o();
             return;
          }
       }
       liveAudience = new LiveAudienceScreenRecordPreviewFragment();
       liveAudience.k = tA;
       liveAudience.l = tB;
       liveAudience.m = op;
       liveAudience.n = tD;
       liveAudience.o = tE;
       goto label_0062 ;
    }
}
