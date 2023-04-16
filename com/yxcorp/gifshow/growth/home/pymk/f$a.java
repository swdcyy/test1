package com.yxcorp.gifshow.growth.home.pymk.f$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.home.pymk.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.d;
import java.util.Objects;
import vna.t;
import java.lang.Integer;
import y8c.g;
import g9c.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserWrapper;
import qvb.i;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import k6a.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class f$a extends m	// class@0013a1
{
    public final f c;

    public void f$a(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       this.c.J8();
       f$a tc = this.c;
       f c = tc.C;
       int i = tc.G.get();
       Objects.requireNonNull(c);
       t ot = t.class;
       if (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), c, ot, "8")) {
          c.n.remove(c.N0(i));
          c.S0(i);
          if (c.R0()) {
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(c.w.getParentFragment());
             if (slidePlayVie != null) {
                slidePlayVie.Y(true);
             }
          }
       }
       f m = this.c.M;
       if (!PatchProxy.applyVoidOneRefsWithListener(m, null, u.class, "23")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLOSE_RECOMMEND_PYMK_CARD";
          u1.M(null, m, 1, uElementPack, null, null);
          PatchProxy.onMethodExit(u.class, "23");
       }
       return;
    }
}
