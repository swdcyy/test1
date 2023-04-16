package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter$3;
import com.yxcorp.gifshow.osbug.FixedLifecycleObserver;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class NasaAudioFocusPresenter$3 extends FixedLifecycleObserver	// class@00190f
{
    public final NasaAudioFocusPresenter f;

    public void NasaAudioFocusPresenter$3(NasaAudioFocusPresenter p0){
       this.f = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, NasaAudioFocusPresenter$3.class, "1")) {
          return;
       }
       NasaAudioFocusPresenter$3 tf = this.f;
       tf.s = false;
       tf.P8();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, NasaAudioFocusPresenter$3.class, "2")) {
          return;
       }
       NasaAudioFocusPresenter$3 tf = this.f;
       tf.s = true;
       tf.P8();
       return;
    }
}
