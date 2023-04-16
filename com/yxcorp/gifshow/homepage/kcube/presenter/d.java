package com.yxcorp.gifshow.homepage.kcube.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.kcube.presenter.c;
import ok.x;
import com.google.common.base.Suppliers;
import wq6.f;
import com.yxcorp.gifshow.homepage.kcube.presenter.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.h;
import wq6.g;
import fr6.i;
import brd.t;
import pr6.d;
import dta.i0;
import erd.g;
import crd.b;
import java.lang.Boolean;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper$getHideStatusBar$1;
import msd.l;
import android.app.Activity;
import android.view.Window;

public class d extends PresenterV2	// class@001756
{
    public final f p;
    public d q;
    public final i r;
    public static final x s;

    static {
       d.s = Suppliers.a(c.b);
    }
    public void d(f p0){
       super();
       this.r = new d$a(this);
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.P8(this.p.j());
       this.p.W(this.r);
       this.X7(this.q.Z0().subscribe(new i0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.p.b(this.r);
       return;
    }
    public final void P8(h p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       if (d.s.get().booleanValue()) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, null, HomeActionBarSkinHelper.class, "22");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "tab");
          b = HomeActionBarSkinHelper.a.a(p0, Boolean.FALSE, HomeActionBarSkinHelper$getHideStatusBar$1.INSTANCE).booleanValue();
       }
       if (b) {
          if (this.q.K0()) {
             this.getActivity().getWindow().clearFlags(2048);
             this.getActivity().getWindow().addFlags(1024);
          }else {
             this.getActivity().getWindow().clearFlags(1024);
             this.getActivity().getWindow().addFlags(2048);
          }
       }else {
          this.getActivity().getWindow().clearFlags(1024);
          this.getActivity().getWindow().addFlags(2048);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(d.class);
       return;
    }
}
