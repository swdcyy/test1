package com.kuaishou.live.core.show.template.d;
import lf3.g;
import com.kuaishou.live.core.show.template.f;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveActivityPopup;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import java.lang.Integer;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import p91.m;
import z12.c;
import m91.b;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import ekd.j;
import ekd.k1;
import androidx.fragment.app.DialogFragment;
import z12.x;
import com.kuaishou.live.core.show.template.e;
import java.lang.Runnable;
import lf3.f;

public final class d implements g	// class@001181
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b;
       Integer integer;
       d tb = this.b;
       Objects.requireNonNull(tb);
       f uof = f.class;
       LiveLogTag lIVE_ACTIVIT = LiveLogTag.LIVE_ACTIVITY_TEMPLATE_IM_POPUP;
       b.c0(lIVE_ACTIVIT, "receive LiveConnectionMessage", "LiveActivityPopup", p0.toString());
       String obj = PatchProxy.applyOneRefs(p0, tb, uof, "2");
       b = false;
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = "show popup fail";
          if (y.d(tb.getActivity())) {
             b.c0(lIVE_ACTIVIT, obj, "isLandscape", Integer.valueOf(i));
          }else if(tb.p.A0().r2(AudienceBizRelation.VOICE_PARTY) || tb.p.A0().r2(AnchorBizRelation.VOICE_PARTY)){
             integer = 1;
          }else {
             integer = null;
          }
          if (integer) {
             b.c0(lIVE_ACTIVIT, obj, "isChatRoom", Integer.valueOf(i));
          }else if(c.a(tb.p.d())){
             b.c0(lIVE_ACTIVIT, obj, "isGRRoom", Integer.valueOf(i));
          }else {
             f r = tb.r;
             if (r != null && r.N().r2(AudienceBizRelation.GIFT_COMBO)) {
                b.c0(lIVE_ACTIVIT, obj, "isGiftSendCombo", Integer.valueOf(i));
             }else {
                r = tb.r;
                if (r != null && r.N().r2(AudienceBizRelation.GIFT_BOX)) {
                   b.c0(lIVE_ACTIVIT, obj, "isGiftBoxOpen", Integer.valueOf(i));
                }else if(tb.p.b() == null || !tb.p.b().isResumed()){
                   b.Z(lIVE_ACTIVIT, "show popup fail: fragment is null or not resume");
                }else {
                   b = true;
                }
             }
          }
       }
       if (b && (!PatchProxy.applyVoidOneRefs(p0, tb, uof, "4") && !j.h(p0.displayPict))) {
          k1.n(tb);
          if (x.s(tb.u)) {
             tb.P8();
          }
          k1.s(new e(tb, p0), tb, 300);
       }
    label_0100 :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
