package com.yxcorp.gifshow.prettify.beauty.s;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.prettify.beauty.t;
import com.yxcorp.gifshow.prettify.beauty.r$d;
import com.kwai.feature.post.api.componet.prettify.beauty.RecoBeautifyConfig;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.beauty.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n1c.l;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.beauty.r$c;
import android.widget.ProgressBar;
import java.util.List;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;
import crd.b;
import xyb.a;
import q87.c;
import com.kwai.feature.post.api.widget.PrettifyLoadingView;
import java.util.concurrent.TimeUnit;
import brd.a0;
import t45.d;
import brd.z;
import q0c.g1;
import erd.b;

public final class s implements View$OnClickListener	// class@00111d
{
    public final t b;
    public final r$d c;
    public final RecoBeautifyConfig d;

    public void s(t p0,r$d p1,RecoBeautifyConfig p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       s tb = this.b;
       s tc = this.c;
       s td = this.d;
       Objects.requireNonNull(tb);
       r or = r.class;
       if (PatchProxy.applyVoidTwoRefs(tc, td, tb, or, "16")) {
       }else if(tb.l.b()){
          tb.l.e();
       }else {
          int adapterPosit = tc.getAdapterPosition();
          if (adapterPosit != -1) {
             if (!td.getRecoSize()) {
                tb.m1(tc, td);
             }else if(tb.i != adapterPosit){
                tb.n1(adapterPosit, td, false, false);
             }else {
                r$c c = tc.c;
                if (c == null || c.getVisibility()) {
                   if (!tb.i1().isEmpty()) {
                      tb.j = true;
                      tb.o1(td);
                      tb.l0(adapterPosit);
                   }else if(td.isLastConfig()){
                      tb.m1(tc, td);
                   }else if(PatchProxy.isSupport(or) && PatchProxy.applyVoidThreeRefs(tc, Integer.valueOf(adapterPosit), td, tb, r.class, "18")){
                      or = tb.o;
                      if (or == null || or.isDisposed()) {
                         Object[] objArray = new Object[false];
                         a.D().w("BeautyCategoryAdapter", "mockDownloadRecoFilter start", objArray);
                         tc.h.c();
                         tb.p = adapterPosit;
                         tb.o = a0.Y(400, TimeUnit.MILLISECONDS).G(d.a).P(new g1(tb, adapterPosit, td));
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
