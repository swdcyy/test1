package com.kuaishou.commercial.splash.presenter.k0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gz.x3;
import com.kuaishou.commercial.splash.presenter.i0;
import erd.g;
import crd.b;
import brd.t;
import gz.w3;
import com.kuaishou.commercial.splash.presenter.j0;
import android.view.View;
import io.reactivex.subjects.PublishSubject;
import im8.f;

public class k0 extends PresenterV2	// class@0015f5
{
    public PublishSubject p;
    public PublishSubject q;
    public f r;
    public t s;
    public View t;
    public BaseFragment u;
    public boolean v;

    public void k0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "2")) {
          return;
       }
       this.X7(this.p.subscribe(new x3(this), i0.b));
       this.X7(this.s.subscribe(new w3(this), j0.b));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "3")) {
          return;
       }
       this.t = p0.findViewById(0x7f0a3aec);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "1")) {
          return;
       }
       this.p = this.r8("SPLASH_SURPRISED_SHOW_EVENT");
       this.q = this.r8("SPLASH_ENHANCE_DISPLAY_EVENT");
       this.r = this.x8("SPLASH_VIDEO_PLAYER");
       this.s = this.r8("SPLASH_HOLDER_VISIBLE_STATE_CHANGED");
       return;
    }
}
