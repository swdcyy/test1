package com.kuaishou.live.gameinteractive.web.h;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a$h;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gameinteractive.model.GameInteractiveSendGiftResponse;
import pp.a;
import q87.c;
import v43.c;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.live.gameinteractive.web.a;
import t02.a0;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.e;
import w91.a;
import lp3.c;
import java.util.Map;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;

public class h implements g	// class@001c13
{
    public final a$h b;

    public void h(a$h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else if(p0 != null && p0.a() != null){
          p0 = p0.a();
          if (p0.isSuccess()) {
             Object[] objArray = new Object[0];
             a.C().s("GameInteractiveCommonBridgeImpl", "sendKCoinGift request server success!", objArray);
             this.b.d.onSuccess();
          }else if(p0.isLackOfKCoin()){
             i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f104257));
             a p = this.b.e.p;
             d.g(this.b.e.p.Z2.getLiveStreamId(), this.b.e.p.Z2.d(), this.b.e.p.Z2.i(), this.b.e.getActivity(), "LIVE_ROOM_SEND_GIFT", p.p, p.Z2.t5().a(a.class).d6());
             this.b.d.onError(p0.orderStatus, p0.orderMsg);
          }else {
             this.b.d.onError(p0.orderStatus, p0.orderMsg);
          }
       }
       return;
    }
}
