package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.d;
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
import mk1.b;
import ez0.i0;
import zy1.a;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import pz0.g;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$f;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.dialog.base.LiveRecyclerDialogFragment;

public final class b implements View$OnClickListener	// class@000b39
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uod, "4")) {
       }else {
          a0.h(tb.p.Z2.b(), tb.p.Z2.a(), tb.p.Z2.y());
          if (!PatchProxy.applyVoid(objArray, tb, uod, "7")) {
             LiveGiftReceiverListDialog liveGiftRece = LiveGiftReceiverListDialog.Eh(tb.p.Z2.getLiveStreamId(), tb.x, a.b(), i0.a(tb.p, tb.r));
             liveGiftRece.Fh(new g(tb, liveGiftRece));
             liveGiftRece.show(tb.p.Z2.b().getFragmentManager(), "select_guest_dialog");
          }
       }
       return;
    }
}
