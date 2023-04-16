package com.kuaishou.live.lite.recommendsidebar.panel.o;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import yc3.w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.view.View;
import android.widget.TextView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;

public class o extends c	// class@000b0a
{
    public j p;
    public LiveLiteRecommendPanelFragment q;
    public TextView r;

    public void o(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       this.p.c.observe(this.q, new w(this));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, o.class, "4");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a1809);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.p = this.q8(j.class);
       this.q = this.r8("FRAGMENT");
       return;
    }
}
