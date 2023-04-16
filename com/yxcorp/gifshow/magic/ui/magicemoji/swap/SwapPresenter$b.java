package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.magic.ui.widget.FadeEdgeShaderRecyclerView;

public class SwapPresenter$b extends RecyclerView$r	// class@001c2a
{
    public final SwapPresenter a;

    public void SwapPresenter$b(SwapPresenter p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       SwapPresenter$b ta;
       SwapPresenter$b uob = SwapPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (!p1) {
          ta = this.a;
          if (ta.J == 2) {
             ta.c9(false);
             this.a.b9(false);
          }
       }
       ta.J = p1;
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       SwapPresenter$b ta;
       if (PatchProxy.isSupport(SwapPresenter$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SwapPresenter$b.class, "2")) {
          return;
       }
       p1 = 0;
       if (this.a.z.getChildAt(p1) == null) {
          return;
       }
       SwapPresenter g = this.a.G;
       if (g == null) {
          return;
       }
       int i = g.i0();
       if (this.a.z.getChildAt(p1).getX() - (float)n.c(this.a.getContext(), 0) >= 0 && !i) {
          ta = this.a;
          ta.z.setCustomFadingEdgeLeftLength(n.c(ta.getContext(), 0));
       }else {
          ta = this.a;
          ta.z.setCustomFadingEdgeLeftLength(n.c(ta.getContext(), 25.00f));
       }
       return;
    }
}
