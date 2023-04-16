package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendInfoEditPresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendInfoEditPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import z5c.y1;
import java.util.Objects;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class PymkRecommendInfoEditPresenter$c extends m	// class@001521
{
    public final PymkRecommendInfoEditPresenter c;

    public void PymkRecommendInfoEditPresenter$c(PymkRecommendInfoEditPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkRecommendInfoEditPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "v");
       y1.c0(this.c.B, "close");
       PymkRecommendInfoEditPresenter$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, PymkRecommendInfoEditPresenter.class, "12")) {
          PymkRecommendInfoEditPresenter w = tc.w;
          if (w != null) {
             PymkRecommendInfoEditPresenter u = tc.u;
             if (u == null) {
                a.S("mRecoUser");
             }
             int i = w.P0(u);
             if (i != -1) {
                w.S0(i);
                w.k0();
             }
          }
       }
       return;
    }
}
