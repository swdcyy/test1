package com.yxcorp.gifshow.profile.presenter.profile.header.operation.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.b$b;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import z5c.c0;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import z5c.l2;
import java.lang.reflect.Type;
import java.util.Map;
import s1c.o;
import ekd.q;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.lang.Long;
import z5c.y1;
import lnc.i3;
import k2b.h;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;

public class b$a extends m	// class@0014fc
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, str)) {
          return;
       }
       b$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, b.class, "6")) {
          RxBus f = RxBus.f;
          Object[] objArray = null;
          b$b uob = PatchProxy.apply(objArray, objArray, b$b.class, str);
          if (uob != PatchProxyResult.class) {
          }else {
             uob = new b$b();
          }
          f.b(uob);
          c.i(tc.getActivity(), KwaiWebViewActivity.N3(p0.getContext(), WebEntryUrls.F0).a());
          if (tc.t != null) {
             tc.s.setVisibility(8);
             c0 uoc0 = c0.class;
             if (!PatchProxy.isSupport(uoc0) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, objArray, uoc0, "3")) {
                g.e(KsLogProfileTag.CREATOR_CENTER.appendTag("ProfileCreatorCenterUtils"), "consume red dot");
                Map map = o.f(l2.M);
                if (!q.h(map)) {
                   map.put(Collections.max(map.keySet()), Boolean.TRUE);
                   o.z(map);
                }
             }
          }
          b x = tc.x;
          b w = tc.w;
          b t = tc.t;
          if (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidThreeRefs(x, w, Boolean.valueOf(t), null, y1.class, "87")) {
             i3 oi3 = i3.f();
             String str1 = (t != null)? "TRUE": "FALSE";
             oi3.d("has_redpoint", str1);
             h oh = h.k("AUTHOR_CENTER_BUTTON");
             oh.c(b0.a(w.getId()));
             oh.n(oi3.e());
             oh.a("PERSONAL_INFO_FUNC");
             oh.i(x);
          }
       }
       return;
    }
}
