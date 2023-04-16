package com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class RecycleItemRecoRealShowPresenter$a extends RecyclerView$r	// class@000fcb
{
    public final RecycleItemRecoRealShowPresenter a;

    public void RecycleItemRecoRealShowPresenter$a(RecycleItemRecoRealShowPresenter p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(RecycleItemRecoRealShowPresenter$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, RecycleItemRecoRealShowPresenter$a.class, "1")) {
          return;
       }
       if (!p1) {
          this.a.R8();
       }
       return;
    }
}
