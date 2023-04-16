package com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter$b;
import qvb.q;
import com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class RecycleItemRecoRealShowPresenter$b implements q	// class@000fcc
{
    public final RecycleItemRecoRealShowPresenter b;

    public void RecycleItemRecoRealShowPresenter$b(RecycleItemRecoRealShowPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(RecycleItemRecoRealShowPresenter$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecycleItemRecoRealShowPresenter$b.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       RecycleItemRecoRealShowPresenter$b uob = RecycleItemRecoRealShowPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "2")) {
          return;
       }
       RecycleItemRecoRealShowPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, RecycleItemRecoRealShowPresenter.class, "6")) {
          RecyclerView recyclerView = tb.p.h0();
          tb.x = recyclerView;
          recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(tb.z);
       }
       return;
    }
}
