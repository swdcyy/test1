package df2.a0;
import erd.g;
import df2.m0;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.String;
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
import java.lang.Class;
import com.kwai.robust.PatchProxy;
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

public final class a0 implements g	// class@0024e4
{
    public final m0 b;

    public void a0(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int b;
       a0 tb = this.b;
       p.a(tb.x.getLiveStreamId());
       b.a(-1787676707).d(tb.x.getLiveStreamId());
       a.d().k(new i(true, tb.x.getLiveStreamId()));
       p0 = a.a().a().getResources();
       LiveBizParam obj = PatchProxy.apply(null, tb, m0.class, "44");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = LiveBizParam.getBizParamFromIntent(tb.getActivity().getIntent());
          b = (obj != null && obj.mShouldShowNewFeedbackInProfilePage != null)? true: false;
       }
       b = (b)? 0x7f100a68: 0x7f100a67;
       i.d(R.style.arg_RES_7f11066a, p0.getString(b));
       if (tb.x.getBaseFeed() != null) {
          b.a(0x6d2a4fdd).b(new i(tb.x.getBaseFeed(), "0"));
          p0 = RealAction$ExtParams.newInstance();
          p0.mNegativeType = 1;
          c.b(9, tb.x.getBaseFeed(), p0);
       }
       return;
    }
}
