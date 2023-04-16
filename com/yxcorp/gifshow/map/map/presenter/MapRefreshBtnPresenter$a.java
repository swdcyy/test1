package com.yxcorp.gifshow.map.map.presenter.MapRefreshBtnPresenter$a;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;
import com.yxcorp.gifshow.map.map.presenter.MapRefreshBtnPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.Button;

public final class MapRefreshBtnPresenter$a implements NetworkState$a	// class@001ca3
{
    public final MapRefreshBtnPresenter a;

    public void MapRefreshBtnPresenter$a(MapRefreshBtnPresenter p0){
       this.a = p0;
       super();
    }
    public final void b(int p0){
       MapRefreshBtnPresenter$a uoa = MapRefreshBtnPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0 == 2 || p0 == 1) {
          MapRefreshBtnPresenter.P8(this.a).setVisibility(0);
       }
       return;
    }
}
