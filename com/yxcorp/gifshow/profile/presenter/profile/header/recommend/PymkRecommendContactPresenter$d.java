package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter;
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

public final class PymkRecommendContactPresenter$d extends m	// class@00151c
{
    public final PymkRecommendContactPresenter c;

    public void PymkRecommendContactPresenter$d(PymkRecommendContactPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       PymkRecommendContactPresenter v;
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkRecommendContactPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "v");
       y1.a0(this.c.B, "close");
       PymkRecommendContactPresenter$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, PymkRecommendContactPresenter.class, "10")) {
          PymkRecommendContactPresenter x = tc.x;
          if (x != null) {
             v = tc.v;
             if (v == null) {
                a.S("mRecoUser");
             }
             int i = x.P0(v);
             if (i != -1) {
                x.S0(i);
                x.k0();
             }
          }
       }
       return;
    }
}
