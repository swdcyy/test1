package com.kuaishou.live.core.show.profilecard.statistics.f;
import a51.c;
import java.util.ArrayList;
import com.kuaishou.live.core.show.profilecard.statistics.b;
import com.kuaishou.live.core.show.profilecard.statistics.c;
import com.kuaishou.live.core.show.profilecard.statistics.d;
import com.kuaishou.live.core.show.profilecard.statistics.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wj2.r;
import t02.r1;
import java.util.List;
import android.view.ViewStub;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.f0;
import sf2.h;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.profilecard.http.LiveStatisticsInfo;
import ne2.k;
import android.app.Activity;
import vq5.d;
import wj2.l0;

public class f extends c	// class@000dfb
{
    public l0 A;
    public View B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public ImageView K;
    public final List L;
    public final a M;
    public final a N;
    public final a O;
    public final a P;
    public r v;
    public ViewStub w;
    public View x;
    public d y;
    public k z;
    public static String sLivePresenterClassName = "LiveProfileAnchorStatisticsInfoV2Presenter";

    public void f(){
       super();
       this.L = new ArrayList();
       this.M = new b(this);
       this.N = new c(this);
       this.O = new d(this);
       this.P = new e(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       super.E8();
       r x = this.v.x;
       if (x != null) {
          this.y = x.q1;
       }
       this.L.add(this.M);
       this.L.add(this.N);
       this.L.add(this.O);
       this.L.add(this.P);
       this.A = this.v.j;
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          this.w.setLayoutResource(R.layout.arg_RES_7f0d0d47);
          View view = this.w.inflate();
          if (!PatchProxy.applyVoidOneRefs(view, this, uof, "5")) {
             this.x = view;
             ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
             layoutParams.height = a1.e(109.00f);
             view.setLayoutParams(layoutParams);
             this.B = m1.f(view, 0x7f0a23b5);
             this.C = m1.f(view, 0x7f0a23bf);
             this.G = m1.f(view, 0x7f0a23c0);
             this.D = m1.f(view, 0x7f0a23c2);
             this.H = m1.f(view, 0x7f0a23c3);
             this.E = m1.f(view, 0x7f0a23c5);
             this.I = m1.f(view, 0x7f0a23c6);
             this.F = m1.f(view, 0x7f0a23b9);
             this.J = m1.f(view, 0x7f0a23bc);
             this.K = m1.f(view, 0x7f0a23bb);
             f0.i(this.G, this.getContext());
             f0.i(this.H, this.getContext());
             f0.i(this.I, this.getContext());
             f0.i(this.J, this.getContext());
          }
       }
       uof = this.v;
       uof.o.observe(uof.e, new h(this));
       return;
    }
    public final void S8(LiveStatisticsInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "17")) {
          return;
       }
       if (this.y != null) {
          this.z.f(p0.mStatisticReportType);
          this.y.r4(p0.mClickKwaiLink, this.getActivity());
       }
       f tA = this.A;
       if (tA != null) {
          tA.a();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a2355);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.v = this.q8(r.class);
       this.z = this.q8(k.class);
       return;
    }
}
