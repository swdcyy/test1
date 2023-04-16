package com.yxcorp.gifshow.corona.common.plugin.presenter.CoronaLoadPluginPresenter$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.corona.common.plugin.presenter.CoronaLoadPluginPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class CoronaLoadPluginPresenter$c implements View$OnClickListener	// class@001265
{
    public final CoronaLoadPluginPresenter b;

    public void CoronaLoadPluginPresenter$c(CoronaLoadPluginPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaLoadPluginPresenter$c.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
}
