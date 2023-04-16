package com.kuaishou.live.common.core.component.gift.domain.recharge.LiveGiftRechargeManager;
import androidx.lifecycle.LifecycleOwner;
import xp5.i;
import or5.d;
import zg1.g;
import jm1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.recharge.LiveGiftRechargeManager$giftSendObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import rw1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rw1.i$a;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import xp5.g;
import java.util.Map;
import rw1.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.live.common.core.component.recharge.d;

public final class LiveGiftRechargeManager	// class@001259
{
    public final LiveGiftRechargeManager$giftSendObserver$1 a;
    public final i b;
    public final d c;
    public final g d;
    public final a e;
    public final k f;
    public final k g;

    public void LiveGiftRechargeManager(LifecycleOwner p0,i p1,d p2,g p3,a p4,LiveGiftSendModel p5,k p6,k p7){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "logPackageProvider");
       a.p(p2, "audienceInfoManager");
       a.p(p3, "fragmentServiceAdapter");
       a.p(p4, "giftBoxService");
       a.p(p5, "giftSendModel");
       a.p(p6, "paymentManager");
       a.p(p7, "bizLogParam");
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p6;
       this.g = p7;
       LiveGiftRechargeManager$giftSendObserver$1 ogiftSendObs = new LiveGiftRechargeManager$giftSendObserver$1(this);
       this.a = ogiftSendObs;
       p5.b(p0, ogiftSendObs);
    }
    public final void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftRechargeManager.class, "1")) {
          return;
       }
       a.p(p0, "rechargeSource");
       i$a uoa = new i$a();
       uoa.k(p0);
       uoa.i(null);
       uoa.j(this.c.getLiveStreamId());
       uoa.a(this.c.d());
       uoa.f(this.c.getExpTag());
       uoa.b(this.g.get());
       i oi = uoa.c();
       a.o(oi, "builder.build\(\)");
       d.j(this.d.a().getActivity(), oi, p1);
       return;
    }
}
