package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class PopShowFragment$c implements Runnable	// class@001608
{
    public final PopShowFragment b;

    public void PopShowFragment$c(PopShowFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PopShowFragment$c.class, "1")) {
          return;
       }
       PopShowFragment$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, PopShowFragment.class, "1")) {
          tb.ch();
       }
       return;
    }
}
