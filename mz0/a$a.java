package mz0.a$a;
import android.view.View$OnClickListener;
import mz0.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import java.util.Objects;
import z12.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tz0.a;
import bl1.a;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import java.util.Map;
import rw1.b;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import d61.h0;
import k2b.e0;
import k2b.u1;
import rw1.i$a;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.show.exchangegoldcoin.a;
import w91.a;
import rw1.i;
import com.kuaishou.live.common.core.component.recharge.d;

public class a$a implements View$OnClickListener	// class@003253
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       int i;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, a$a.class, "1")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          y.a(obj.b.getContext(), obj.b.getActivity().getUrl(), "live_gift_recharge", 43, a.a().a().getString(R.string.arg_RES_7f10307a), obj.b.p.c.mEntity, null, null, null);
          return;
       }else {
          a$a b = obj.b;
          Objects.requireNonNull(b);
          a uoa = a.class;
          Object[] objArray = null;
          String str = "4";
          if (!PatchProxy.applyVoid(objArray, b, uoa, str)) {
             String[] stringArray = new String[]{b.getActivity().getUrl()};
             e.c(a.y, "recharge", stringArray);
             BaseFragment uBaseFragmen = b.p.Z2.b();
             ClientContent$LiveVoicePartyPackageV2 liveVoicePar = b.p.Z2.y();
             ClientContent$LiveStreamPackage liveStreamPa = b.p.Z2.a();
             i$a obj1 = PatchProxy.apply(objArray, b, uoa, "6");
             if (obj1 != PatchProxyResult.class) {
                i = obj1.intValue();
             }else {
                uoa = b.q;
                if (uoa != null) {
                   i = uoa.getPageIndex();
                }else {
                   uoa = b.r;
                   i = (uoa != null)? uoa.getPageIndex(): -1;
                }
             }
             i = i + 1;
             a u = b.u;
             boolean b1 = b.p.N().r2(AudienceBizRelation.ALIPAY_RECHARGE_ACTIVITY);
             Map map = b.P8();
             if (PatchProxy.isSupport(b.class)) {
                Object[] objArray1 = new Object[]{uBaseFragmen,liveVoicePar,liveStreamPa,Integer.valueOf(i),u,Boolean.valueOf(b1),map};
                if (PatchProxy.applyVoid(objArray1, objArray, b.class, str)) {
                label_0123 :
                   obj1 = new i$a();
                   obj1.k(b.u);
                   obj1.i(b.p.p);
                   obj1.j(b.p.Z2.getLiveStreamId());
                   obj1.a(b.p.Z2.d());
                   obj1.f(b.p.c.getExpTag());
                   obj1.g(a.c(b.getActivity(), b.p, "gift_box_bottom_entry", 0));
                   obj1.e(a.e(b.p));
                   obj1.d(a.a(b.p));
                   obj1.b(b.w.d6());
                   d.i(b.getActivity(), obj1.c());
                }
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PAY_DEPOSIT_BUTTON";
             uElementPack.params = b.a(b1, map);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
             moreInfoPack.index = String.valueOf((i + 1));
             moreInfoPack.type = h0.a(u);
             uContentPack.moreInfoPackage = moreInfoPack;
             uContentPack.liveVoicePartyPackage = liveVoicePar;
             u1.L("", uBaseFragmen, 1, uElementPack, uContentPack);
             goto label_0123 ;
          }
          return;
       }
    }
}
