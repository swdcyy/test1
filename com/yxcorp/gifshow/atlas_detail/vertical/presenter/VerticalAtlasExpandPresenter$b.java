package com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.ViewGroup;
import java.lang.Boolean;

public final class VerticalAtlasExpandPresenter$b extends RecyclerView$r	// class@001bcf
{
    public final VerticalAtlasExpandPresenter a;

    public void VerticalAtlasExpandPresenter$b(VerticalAtlasExpandPresenter p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       VerticalAtlasExpandPresenter$b ta;
       if (PatchProxy.isSupport(VerticalAtlasExpandPresenter$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VerticalAtlasExpandPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p2) {
          ta = this.a;
          ta.S = ta.S + p2;
       }else {
          int i = p0.computeVerticalScrollOffset();
          VerticalAtlasExpandPresenter$b ta1 = this.a;
          if (ta1.S == i) {
             return;
          }else {
             ta1.S = i;
          }
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, VerticalAtlasExpandPresenter.class, "30")) {
          VerticalAtlasExpandPresenter h = ta.H;
          if (h != null) {
             objArray = Boolean.valueOf(h.canScrollVertically(1));
          }
          if (objArray != null && !objArray.booleanValue()) {
             ta.U = ta.S;
          }
       }
    label_0063 :
       ta = this.a;
       if (ta.X != null) {
          ta.h9(p2);
       }
       return;
    }
}
