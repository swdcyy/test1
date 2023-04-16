package com.kuaishou.commercial.splash.presenter.h0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import gz.u2;
import gz.s;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.kuaishou.commercial.splash.presenter.c0;
import erd.g;
import crd.b;
import brd.t;
import android.widget.TextView;
import mrd.c;

public class h0 extends PresenterV2	// class@0015ee
{
    public f p;
    public TextView q;
    public View r;
    public u2 s;
    public c t;

    public void h0(){
       super();
    }
    public void E8(){
       h0 oh0 = h0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh0, "3")) {
          return;
       }
       u2 ou2 = this.p.get();
       this.s = ou2;
       if (ou2 == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh0, "4") && this.s.K != null) {
          oh0 = this.r;
          if (oh0 != null) {
             oh0.setBackground(objArray);
          }
       }
       this.X7(this.t.subscribe(new c0(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "2")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a3aff);
       this.r = p0.findViewById(0x7f0a3b06);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.p = this.x8("SPLASH_IMAGE_TYPE_PARAM");
       this.t = this.r8("SPLASH_VIEW_SHOW_EVENT");
       return;
    }
}
