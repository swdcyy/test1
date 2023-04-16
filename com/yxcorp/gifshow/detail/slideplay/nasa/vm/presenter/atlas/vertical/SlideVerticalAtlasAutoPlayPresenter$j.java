package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$j;
import ud5.c;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn5.n;
import hn5.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e7a.a;
import androidx.fragment.app.Fragment;
import wkd.b;
import gb5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;

public final class SlideVerticalAtlasAutoPlayPresenter$j implements c	// class@001807
{
    public final SlideVerticalAtlasAutoPlayPresenter a;

    public void SlideVerticalAtlasAutoPlayPresenter$j(SlideVerticalAtlasAutoPlayPresenter p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoidWithListener(null, this, SlideVerticalAtlasAutoPlayPresenter$j.class, "2")) {
          return;
       }
       if (m.a().FG(this.a.S8())) {
          b.a(0x8708467).n(this.a.S8(), false, this.a.R8());
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$j.class, "2");
       return;
    }
    public void onFailure(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlideVerticalAtlasAutoPlayPresenter$j.class, "1")) {
          return;
       }
       if (m.a().FG(this.a.S8())) {
          b.a(0x8708467).l(this.a.S8(), false, this.a.R8(), p0);
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter$j.class, "1");
       return;
    }
}
