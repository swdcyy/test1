package com.yxcorp.gifshow.map.container.MapActionBarPresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class MapActionBarPresenter$b implements View$OnClickListener	// class@001c67
{
    public final MapActionBarPresenter b;

    public void MapActionBarPresenter$b(MapActionBarPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapActionBarPresenter$b.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
}
