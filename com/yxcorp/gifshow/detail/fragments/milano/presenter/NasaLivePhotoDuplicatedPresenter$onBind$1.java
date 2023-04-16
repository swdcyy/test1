package com.yxcorp.gifshow.detail.fragments.milano.presenter.NasaLivePhotoDuplicatedPresenter$onBind$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.NasaLivePhotoDuplicatedPresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import yw6.g;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import v7a.a;
import v7a.a$a;

public final class NasaLivePhotoDuplicatedPresenter$onBind$1 extends Lambda implements a	// class@001516
{
    public final NasaLivePhotoDuplicatedPresenter this$0;

    public void NasaLivePhotoDuplicatedPresenter$onBind$1(NasaLivePhotoDuplicatedPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaLivePhotoDuplicatedPresenter$onBind$1.class, "1")) {
          return;
       }
       NasaLivePhotoDuplicatedPresenter$onBind$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, NasaLivePhotoDuplicatedPresenter.class, "4")) {
          NasaLivePhotoDuplicatedPresenter s = tthis$0.s;
          if (s == null) {
             a.S("mSlidePlayViewModel");
          }
          g og = s.P0();
          if (og instanceof a) {
             objArray = og;
          }
          if (objArray != null) {
             objArray.Y0(tthis$0.q);
          }
       }
       return;
    }
}
