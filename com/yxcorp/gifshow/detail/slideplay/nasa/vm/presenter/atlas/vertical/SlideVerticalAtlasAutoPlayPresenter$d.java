package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$d;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Enum;

public final class SlideVerticalAtlasAutoPlayPresenter$d implements g	// class@001800
{
    public final SlideVerticalAtlasAutoPlayPresenter b;

    public void SlideVerticalAtlasAutoPlayPresenter$d(SlideVerticalAtlasAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlideVerticalAtlasAutoPlayPresenter$d.class, "1")) {
       }else if(p0.equals(FragmentEvent.PAUSE)){
          p0 = this.b;
          if (p0.G != null) {
             p0.d9(13);
          }else if(p0.X8()){
             this.b.d9(2);
          }
       }else if(p0.equals(FragmentEvent.RESUME)){
          p0 = this.b;
          if (p0.G != null) {
             p0.a9(13);
             p0.G = false;
          }else if(p0.X8()){
             this.b.a9(2);
          }
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$d.class, "1");
       return;
    }
}
