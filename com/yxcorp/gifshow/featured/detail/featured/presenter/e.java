package com.yxcorp.gifshow.featured.detail.featured.presenter.e;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Objects;
import e8a.j;
import com.yxcorp.gifshow.util.t0;
import java.lang.Runnable;
import t45.c;
import e8a.i;

public class e extends NasaAudioFocusPresenter	// class@000f72
{

    public void e(){
       super();
    }
    public void P8(){
       NasaAudioFocusPresenter tu;
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       if (this.p.K0() && (this.s != null && (this.t != null && this.r == null))) {
          this.r = true;
          tu = this.u;
          Objects.requireNonNull(tu);
          c.a(new j(tu));
       }else if(this.p.K0() && (this.s == null || (this.t == null && this.r != null))){
          this.r = false;
          tu = this.u;
          Objects.requireNonNull(tu);
          c.a(new i(tu));
       }
       return;
    }
}
