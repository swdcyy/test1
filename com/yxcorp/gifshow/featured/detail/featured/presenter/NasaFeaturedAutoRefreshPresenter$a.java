package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$a;
import com.kwai.component.uiconfig.visitor.VisitorModeManager$a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class NasaFeaturedAutoRefreshPresenter$a implements VisitorModeManager$a	// class@000f55
{
    public final NasaFeaturedAutoRefreshPresenter a;

    public void NasaFeaturedAutoRefreshPresenter$a(NasaFeaturedAutoRefreshPresenter p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NasaFeaturedAutoRefreshPresenter$a.class, "1")) {
          return;
       }
       if (("VISITOR").equals(p0)) {
          p0.L = true;
       }
       return;
    }
}
