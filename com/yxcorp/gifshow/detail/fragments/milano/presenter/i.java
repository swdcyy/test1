package com.yxcorp.gifshow.detail.fragments.milano.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import v0a.v0;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;

public class i extends PresenterV2	// class@00152c
{
    public MilanoContainerEventBus p;
    public View q;
    public View r;
    public View s;

    public void i(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.X7(this.p.j.subscribe(new v0(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a3fe8);
       this.r = p0.findViewById(0x7f0a3f6a);
       this.s = p0.findViewById(0x7f0a375f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.p = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
