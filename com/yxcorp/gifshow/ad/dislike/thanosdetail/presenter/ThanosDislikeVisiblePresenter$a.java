package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter$a;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public final class ThanosDislikeVisiblePresenter$a implements Runnable	// class@001751
{
    public final View b;
    public final ThanosDislikeVisiblePresenter c;

    public void ThanosDislikeVisiblePresenter$a(View p0,ThanosDislikeVisiblePresenter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, ThanosDislikeVisiblePresenter$a.class, "1")) {
          return;
       }
       ThanosDislikeVisiblePresenter.P8(this.c).removeView(this.b);
       PatchProxy.onMethodExit(ThanosDislikeVisiblePresenter$a.class, "1");
       return;
    }
}
