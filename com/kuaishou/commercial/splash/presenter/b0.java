package com.kuaishou.commercial.splash.presenter.b0;
import com.kuaishou.commercial.splash.presenter.n0;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import gz.u2;
import java.lang.Runnable;
import android.view.View;
import im8.f;
import gz.s;
import android.view.ViewGroup;
import com.kuaishou.commercial.splash.presenter.a0;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.image.KwaiImageView;
import io.reactivex.subjects.PublishSubject;

public class b0 extends n0	// class@0015dd
{
    public KwaiImageView L;
    public View M;
    public f N;
    public PublishSubject O;

    public void b0(){
       super();
    }
    public int P8(Boolean p0){
       n0 obj = PatchProxy.applyOneRefs(p0, this, b0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.A;
       if (obj instanceof u2) {
          if (p0.booleanValue()) {
             u2 u = obj.U;
             if (u != null) {
                u.run();
                return 2;
             }
          }
          if (!p0.booleanValue()) {
             u2 v = obj.V;
             if (v != null) {
                v.run();
                return 2;
             }
          }
       }
    label_0038 :
       return 0;
    }
    public View R8(View p0){
       return this.L;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "3")) {
          return;
       }
       if (this.N.get() != null) {
          this.A = this.N.get();
       }
       return;
    }
    public void V8(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "4")) {
          return;
       }
       super.V8(p0);
       this.X7(this.O.subscribe(new a0(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.L = p0.findViewById(0x7f0a3af3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       super.j8();
       this.N = this.x8("SPLASH_IMAGE_TYPE_PARAM");
       this.O = this.r8("SPLASH_ACTION_BAR_SHOW_EVENT");
       return;
    }
}
