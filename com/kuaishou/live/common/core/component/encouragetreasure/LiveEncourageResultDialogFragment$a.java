package com.kuaishou.live.common.core.component.encouragetreasure.LiveEncourageResultDialogFragment$a;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.live.common.core.component.encouragetreasure.LiveEncourageResultDialogFragment;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gg1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import kotlin.jvm.internal.a;
import k2b.e0;
import k71.f$a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;

public final class LiveEncourageResultDialogFragment$a implements DialogInterface$OnShowListener	// class@0010f1
{
    public final LiveEncourageResultDialogFragment b;

    public void LiveEncourageResultDialogFragment$a(LiveEncourageResultDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEncourageResultDialogFragment$a.class, "1")) {
          return;
       }
       a a = a.a;
       ClientContent$LiveStreamPackage liveStreamPa = this.b.s.a();
       a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
       e0 page = this.b.s.getPage();
       a.o(page, "liveLogPackageProvider.page");
       String str = this.b.t.b();
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, page, str, a, a.class, "3")) {
          a.p(liveStreamPa, "liveStreamPackage");
          a.p(page, "logPage");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_GROWTH_COIN_BOX_GET_POPUP";
          i3 oi3 = (str == null || !str.length())? 1: null;
          if (!oi3) {
             oi3 = i3.f();
             oi3.d("source", str);
             uElementPack.params = oi3.e();
          }
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.B0(new ShowMetaData().setType(9).setLogPage(page).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       return;
    }
}
