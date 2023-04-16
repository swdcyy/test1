package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter$b;
import r3a.q;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class NasaAudioFocusPresenter$b extends q	// class@001911
{
    public final NasaAudioFocusPresenter a;

    public void NasaAudioFocusPresenter$b(NasaAudioFocusPresenter p0){
       this.a = p0;
       super();
    }
    public QPhoto c(){
       Object obj = PatchProxy.apply(null, this, NasaAudioFocusPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.q.getCurrentPhoto();
    }
}
