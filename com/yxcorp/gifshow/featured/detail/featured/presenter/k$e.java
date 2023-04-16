package com.yxcorp.gifshow.featured.detail.featured.presenter.k$e;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.util.List;

public class k$e extends m	// class@000f7e
{
    public final k c;

    public void k$e(k p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$e.class, "1")) {
          return;
       }
       k v = this.c.v;
       if (v != null) {
          v.o();
       }
       k$e tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, k.class, "13")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TOAST_INFO_CARD";
          i3 oi3 = i3.f();
          oi3.d("click_type", "JUMP");
          oi3.d("toast_content", a1.p(R.string.arg_RES_7f104110));
          if (!TextUtils.x(tc.V8())) {
             oi3.d("page", tc.V8());
          }
          uElementPack.params = oi3.e();
          if (tc.q.getCurrentPhoto() != null) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tc.q.getCurrentPhoto().mEntity);
             u1.M("", tc.p, 0, uElementPack, uContentPack, null);
          }
       }
       tc = this.c;
       k q = tc.q;
       if (q != null) {
          q.m(0, tc.s, "NasaRefreshWayBackPresenter");
          this.c.q.u(true);
       }
       return;
    }
}
