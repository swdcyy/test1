package com.kwai.nearby.local.presenter.LocalDebugPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import ekd.m1;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import com.yxcorp.gifshow.util.rx.RxBus;
import qc7.b;
import brd.t;
import com.kwai.nearby.local.presenter.LocalDebugPresenter$doBindView$2;
import dd7.i0;
import msd.l;
import erd.g;
import crd.b;

public final class LocalDebugPresenter extends PresenterV2	// class@000fa7
{
    public View p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;

    public void LocalDebugPresenter(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalDebugPresenter.class, "1")) {
          return;
       }
       View view = null;
       ViewStub viewStub = (p0 != null)? p0.findViewById(R.id.local_loadmore_debug_view): view;
       if (viewStub != null) {
          view = viewStub.inflate();
       }
       this.p = view;
       if (view != null) {
          viewStub = m1.f(view, R.id.debug_text1);
          a.o(viewStub, "ViewBindUtils.bindWidget\(it, R.id.debug_text1\)");
          this.q = viewStub;
          viewStub = m1.f(view, R.id.debug_text2);
          a.o(viewStub, "ViewBindUtils.bindWidget\(it, R.id.debug_text2\)");
          this.r = viewStub;
          viewStub = m1.f(view, R.id.debug_text3);
          a.o(viewStub, "ViewBindUtils.bindWidget\(it, R.id.debug_text3\)");
          this.s = viewStub;
          viewStub = m1.f(view, R.id.debug_text4);
          a.o(viewStub, "ViewBindUtils.bindWidget\(it, R.id.debug_text4\)");
          this.t = viewStub;
          viewStub = m1.f(view, R.id.debug_text5);
          a.o(viewStub, "ViewBindUtils.bindWidget\(it, R.id.debug_text5\)");
          this.u = viewStub;
          viewStub = m1.f(view, R.id.debug_text6);
          a.o(viewStub, "ViewBindUtils.bindWidget\(it, R.id.debug_text6\)");
          this.v = viewStub;
       }
       this.X7(RxBus.f.f(b.class).subscribe(new i0(new LocalDebugPresenter$doBindView$2(this))));
       return;
    }
}
