package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;

public final class AdAutoPlayPresenter$b extends a	// class@00158b
{
    public final AdAutoPlayPresenter b;

    public void AdAutoPlayPresenter$b(AdAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, AdAutoPlayPresenter$b.class, "2")) {
          return;
       }
       AdAutoPlayPresenter$b tb = this.b;
       tb.t = false;
       tb.w.clear();
       this.b.V8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, AdAutoPlayPresenter$b.class, "1")) {
          return;
       }
       this.b.t = true;
       return;
    }
}
