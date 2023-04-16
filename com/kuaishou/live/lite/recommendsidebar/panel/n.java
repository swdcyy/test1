package com.kuaishou.live.lite.recommendsidebar.panel.n;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import yc3.u;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;

public class n extends c	// class@000b09
{
    public j p;
    public LiveLiteRecommendPanelFragment q;

    public void n(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.p.a.observe(this.q, new u(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.p = this.q8(j.class);
       this.q = this.r8("FRAGMENT");
       return;
    }
}
