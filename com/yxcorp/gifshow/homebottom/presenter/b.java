package com.yxcorp.gifshow.homebottom.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fsa.d;
import com.yxcorp.gifshow.homebottom.presenter.b$a;
import java.util.BitSet;
import xq6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zq6.b;
import com.kwai.kcube.decorator.IContainerDecorator;
import rn5.a;
import fsa.c;
import zq6.p;
import zq6.u;
import zq6.s;
import xq6.b;
import android.view.View;
import com.google.android.material.tabs.KCubeTabLayout;
import android.app.Activity;
import com.yxcorp.gifshow.HomeActivity;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import wq6.f;
import uv8.m1;
import com.google.android.material.tabs.KCubeTabLayout$e;
import com.yxcorp.gifshow.homebottom.presenter.a;
import com.google.android.material.tabs.KCubeTabLayout$f;
import wkd.b;
import hsa.g;
import hsa.b;
import zq6.r;
import fsa.b;
import esa.n;

public class b extends PresenterV2	// class@001693
{
    public final b p;
    public final KCubeTabLayout$e q;
    public KCubeTabLayout r;
    public View s;
    public View t;
    public n u;
    public final BitSet v;
    public final a w;

    public void b(){
       super();
       this.p = new d(this);
       this.q = new b$a(this);
       this.v = new BitSet();
       this.w = new a();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.w.a(this.u.a().b(a.a, new c(this)));
       this.r.Z(this.s);
       b uob = 1;
       if (this.getActivity() instanceof HomeActivity && a.o0(this.getActivity()).p0() == 4) {
          uob = null;
       }
       if (uob) {
          this.r.c0(this.t);
       }else {
          this.t.setVisibility(8);
       }
       this.r.b0(this.u.c(), this.q, m1.d());
       this.r.setNasaTabSelectInterceptor(new a(this));
       b.a(0x430040f9).c(this.p);
       this.u.c().e0().a(a.o, new b(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       if (!this.w.b()) {
          this.w.c();
       }
       this.r.G0();
       b.a(0x430040f9).a(this.p);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a3c8b);
       this.s = p0.findViewById(0x7f0a0472);
       this.t = p0.findViewById(0x7f0a393a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.u = this.q8(n.class);
       return;
    }
}
