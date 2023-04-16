package com.kuaishou.live.core.show.subscribe.edit.detail.h;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import java.lang.Object;
import android.view.View;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import wk2.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import e17.i;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import tk2.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tk2.g;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import u07.t$a;
import u07.f;
import tk2.j;
import u07.u;
import com.kuaishou.live.core.show.subscribe.edit.detail.f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class h implements View$OnClickListener	// class@00110d
{
    public final LiveSubscribeDetailFragment b;

    public void h(LiveSubscribeDetailFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       LiveSubscribeDetailFragment s;
       h tb = this.b;
       ClientContent$LiveStreamPackage liveStreamPa = tb.m.get();
       String str = 1;
       if (PatchProxy.applyVoidOneRefs(liveStreamPa, null, s.class, "44")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_APPOINTMENT_PHOTO_CONFIRM_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (liveStreamPa != null) {
             uContentPack.liveStreamPackage = liveStreamPa;
          }
          u1.u(str, uElementPack, uContentPack);
       }
       s = tb.s;
       if (s == null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f102cdc);
       }else {
          SubscribeDialogParams d = tb.j.d;
          if (tb.fh()) {
             tb.l.b(s);
             s.x("SELECT_PREVIEW", s, tb.m.get(), tb.j.b);
          }else if(!TextUtils.x(d) && !TextUtils.n(s.mSubscribeId, d)){
             g og = new g(tb, s);
             if (!PatchProxy.applyVoidOneRefs(og, tb, LiveSubscribeDetailFragment.class, "28")) {
                FragmentActivity activity = tb.getActivity();
                if (!g.h(activity)) {
                   s.o(str, tb.m.get(), tb.n.get());
                   t$a uoa = f.e(new t$a(activity));
                   uoa.W0(R.string.arg_RES_7f102cbd);
                   uoa.y0(R.string.arg_RES_7f102cbc);
                   uoa.S0(R.string.arg_RES_7f102cb9);
                   uoa.Q0(R.string.cancel);
                   uoa.u0(new j(og));
                   uoa.t0(f.b);
                   uoa.v(str);
                   uoa.Y(PopupInterface.a);
                }
             }
          }else {
             tb.l.j(s);
          }
       }
       return;
    }
}
