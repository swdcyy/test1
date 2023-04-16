package com.kuaishou.live.audience.component.push.h;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.push.LiveAudiencePushFragment;
import java.lang.Object;
import android.view.View;
import t02.a0;
import co2.f2;
import co2.i0;
import yx2.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import uf2.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.i3;
import k2b.u1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.audience.component.push.k;
import uf2.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import erd.g;
import crd.b;

public final class h implements View$OnClickListener	// class@000bd3
{
    public final LiveAudiencePushFragment b;

    public void h(LiveAudiencePushFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i3 obj1;
       String str;
       h tb = this.b;
       a0 a1 = tb.i.a1;
       String[] obj = null;
       if (a1 != null) {
          f2 uof2 = a1.r0();
          obj1 = PatchProxy.applyOneRefs(uof2, obj, n.class, "23");
          if (obj1 != PatchProxyResult.class) {
          }else if(uof2 == null){
             obj1 = obj;
          }else {
             obj1 = new ClientContent$LiveVoicePartyPackageV2();
             obj1.voicePartyId = TextUtils.k(uof2.y());
             obj1.theaterId = n.m(uof2);
             obj1.ktvId = TextUtils.k(uof2.o());
             obj1.teamPkRoomId = n.n(uof2);
          }
          str = a1.r0().l();
       }else {
          str = obj;
          obj1 = str;
       }
       ClientContent$LiveStreamPackage liveStreamPa = tb.i.Z2.a();
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj1, str, null, b.class, "9")) {
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uClickEvent.elementPackage = uElementPack;
          uElementPack.action2 = "LIVE_TITLE_START_LIVE_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uClickEvent.contentPackage = uContentPack;
          if (obj1 != null) {
             uContentPack.liveVoicePartyPackage = obj1;
             if (!TextUtils.isEmpty(str)) {
                obj1 = i3.f();
                obj1.d("voice_nine_room_id", str);
                uElementPack.params = obj1.toString();
             }
          }
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.a0(uClickEvent);
       }
       FragmentActivity activity = tb.getActivity();
       k ok = new k(tb, p0);
       if (!PatchProxy.applyVoidTwoRefs(activity, ok, obj, c.class, "4") && activity instanceof GifshowActivity) {
          obj = new String[]{"android.permission.CAMERA","android.permission.RECORD_AUDIO"};
          a.f(activity, R.string.arg_RES_7f101efb, 0x7f101efa, obj).subscribe(ok);
       }
       return;
    }
}
