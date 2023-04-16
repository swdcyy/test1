package c01.a;
import android.view.View$OnClickListener;
import c01.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import ik1.a0;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import mk1.h;
import wk1.b;
import mk1.b;
import ez0.i0;
import zy1.a;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import c01.d;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$f;
import c01.c;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import c01.g;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import lnc.a1;
import com.yxcorp.utility.n;
import androidx.fragment.app.KwaiDialogFragment;
import c01.h;
import android.content.DialogInterface$OnDismissListener;
import gy2.i;
import gy2.e;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a implements View$OnClickListener	// class@00043b
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uoe, "4")) {
       }else {
          a0.h(tb.t.Z2.b(), tb.t.Z2.a(), tb.t.Z2.y());
          if (!PatchProxy.applyVoid(objArray, tb, uoe, "11")) {
             boolean b = false;
             if (a.t().u("SOURCE_LIVE").d("resetComboInSendToAll", b)) {
                tb.u.A.K4("[LiveAudienceGiftBoxReceiverContainerPresenter][updateGiftGridViewForReceiver]");
             }
             LiveGiftReceiverListDialog liveGiftRece = LiveGiftReceiverListDialog.Eh(tb.t.Z2.getLiveStreamId(), tb.w, a.b(), i0.a(tb.t, tb.v));
             liveGiftRece.Fh(new d(tb));
             liveGiftRece.F = new c(tb);
             LiveDialogContainerFragment liveDialogCo = new LiveDialogContainerFragment();
             tb.x = liveDialogCo;
             liveDialogCo.Dh(new g(tb, liveGiftRece));
             int i = (y.d(tb.getActivity()))? a1.d(R.dimen.arg_RES_7f070796): n.k(tb.getActivity());
             int i1 = (y.d(tb.getActivity()))? n.j(tb.getActivity()): a1.d(R.dimen.arg_RES_7f0705e5);
             tb.x.Bh(i, i1);
             tb.x.nh(true);
             tb.x.Ah(b);
             tb.x.k0(new h(tb));
             tb.x.xc(new i(b));
             tb.x.Cb(tb.t.Z2.b().getChildFragmentManager(), "select_guest_dialog");
             BaseFragment uBaseFragmen = tb.t.Z2.b();
             ClientContent$LiveStreamPackage liveStreamPa = tb.t.Z2.a();
             ClientContent$LiveVoicePartyPackageV2 liveVoicePar = tb.t.Z2.y();
             if (!PatchProxy.applyVoidThreeRefs(uBaseFragmen, liveStreamPa, liveVoicePar, null, a0.class, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SEND_GIFT_USER_PANEL";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveVoicePartyPackage = liveVoicePar;
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.C0("", uBaseFragmen, 9, uElementPack, uContentPack);
             }
          }
       }
       return;
    }
}
