package com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class RecycleItemRecoRealShowPresenter$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@000fcd
{
    public final RecycleItemRecoRealShowPresenter b;

    public void RecycleItemRecoRealShowPresenter$c(RecycleItemRecoRealShowPresenter p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, RecycleItemRecoRealShowPresenter$c.class, "1")) {
          return;
       }
       RecycleItemRecoRealShowPresenter x = this.b.x;
       if (x == null) {
          return;
       }
       x.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       RecycleItemRecoRealShowPresenter$c tb = this.b;
       tb.u = -1;
       tb.S8();
       return;
    }
}
