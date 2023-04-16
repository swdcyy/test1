package com.kwai.live.gzone.accompanyplay.audience.x0;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.accompanyplay.audience.y0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import bjd.d;
import bb6.c;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import java.util.Map;
import java.util.Collections;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import o37.a;
import k37.a0;
import lnc.i3;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f37.o0;

public class x0 extends m	// class@000bc5
{
    public final y0 c;

    public void x0(y0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x0.class, "1")) {
          return;
       }
       String str = this.c.p.p();
       Uri$Builder uBuilder = x0.f(c.a().h(CdnHostGroupType.LIVE_API.getTypeName(), "sf/carnival/activity/play_appeal", Collections.emptyMap())).buildUpon();
       if (!TextUtils.isEmpty(str)) {
          uBuilder.appendQueryParameter("orderId", str);
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.c.p.a();
       a uoa = this.c.p.t();
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, uoa, null, a0.class, "29")) {
          a0.e("APPEAL_BUTTON", a0.a(uoa).e(), liveStreamPa, uoa);
       }
       o0.m(this.c.getActivity(), uBuilder.build().toString());
       return;
    }
}
