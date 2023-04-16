package com.kwai.framework.krn.bridges.viewmanager.KrnReactModalHostManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import ze.n0;
import android.view.View;
import com.facebook.react.views.modal.ReactModalHostView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.krn.bridges.viewmanager.KrnReactModalHostView;
import android.content.Context;

public class KrnReactModalHostManager extends ReactModalHostManager	// class@0015dc
{

    public void KrnReactModalHostManager(){
       super();
    }
    public boolean canOverrideExistingModule(){
       return true;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactModalHostView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnReactModalHostManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KrnReactModalHostView(p0);
    }
}
