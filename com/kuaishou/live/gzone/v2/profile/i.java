package com.kuaishou.live.gzone.v2.profile.i;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import yf5.p;
import wkd.b;
import le2.b;
import org.greenrobot.eventbus.a;
import cda.i;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.CharSequence;
import e17.i;
import com.kwai.framework.model.feed.BaseFeed;
import l66.a;
import dda.i;
import m66.a;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.action.c;

public class i implements g	// class@001cec
{
    public final e b;

    public void i(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       int b;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          p.a(this.b.r.getLiveStreamId());
          b.a(-1787676707).d(this.b.r.getLiveStreamId());
          a.d().k(new i(true, this.b.r.getLiveStreamId()));
          i = 0x7f11066a;
          Resources resources = a.a().a().getResources();
          i tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(null, tb, e.class, "62");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             LiveBizParam bizParamFrom = LiveBizParam.getBizParamFromIntent(tb.getActivity().getIntent());
             b = (bizParamFrom != null && bizParamFrom.mShouldShowNewFeedbackInProfilePage != null)? true: false;
          }
          b = (b)? 0x7f100a68: 0x7f100a67;
          i.d(i, resources.getString(b));
          if (this.b.r.getBaseFeed() != null) {
             b.a(0x6d2a4fdd).b(new i(this.b.r.getBaseFeed(), "0"));
             i = RealAction$ExtParams.newInstance();
             i.mNegativeType = 1;
             c.b(9, this.b.r.getBaseFeed(), i);
          }
       }
       return;
    }
}
