package com.yxcorp.gifshow.ad.detail.fanstop.vm.AdActionBarElementView;
import qp7.d;
import com.yxcorp.gifshow.ad.detail.fanstop.vm.AdActionBarElementView$a;
import nsd.u;
import com.yxcorp.gifshow.ad.detail.fanstop.vm.AdActionBarElementView$mEasyTk$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import qp7.x0;
import zy8.i;
import android.view.ViewGroup$LayoutParams;
import zy8.b;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import zy8.d;
import com.yxcorp.gifshow.ad.detail.fanstop.vm.AdActionBarElementView$onBindData$3;
import zy8.h;
import x49.n;

public final class AdActionBarElementView extends d	// class@001552
{
    public final p l;
    public ViewGroup m;
    public boolean n;
    public int o;
    public long p;
    public boolean q;
    public static final AdActionBarElementView$a r;

    static {
       AdActionBarElementView.r = new AdActionBarElementView$a(null);
    }
    public void AdActionBarElementView(){
       super();
       this.l = s.c(AdActionBarElementView$mEasyTk$2.INSTANCE);
    }
    public static final ViewGroup v(AdActionBarElementView p0){
       p0 = p0.m;
       if (p0 == null) {
          a.S("mActionBar");
       }
       return p0;
    }
    public View i(){
       View obj = PatchProxy.apply(null, this, AdActionBarElementView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.i(this.m(), R.layout.arg_RES_7f0d037e);
       a.o(obj, "KwaiLayoutInflater.infla¡­ut.element_ad_action_bar\)");
       return obj;
    }
    public void q(x0 p0){
       int i;
       AdActionBarElementView uAdActionBar = AdActionBarElementView.class;
       i oi = i.class;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, uAdActionBar, str)) {
       }else {
          a.p(p0, "viewModel");
          View view = this.p().findViewById(R.id.element_caption_ad_action_bar);
          a.o(view, "view.findViewById\(R.id.e¡­nt_caption_ad_action_bar\)");
          this.m = view;
          if (!PatchProxy.applyVoid(null, this, uAdActionBar, "4")) {
             uAdActionBar = this.m;
             String str1 = "mActionBar";
             if (uAdActionBar == null) {
                a.S(str1);
             }
             ViewGroup$LayoutParams layoutParams = uAdActionBar.getLayoutParams();
             i = 0;
             if (layoutParams != null) {
                layoutParams.height = i;
             }
             uAdActionBar = this.m;
             if (uAdActionBar == null) {
                a.S(str1);
             }
             uAdActionBar.removeAllViews();
             this.o = i;
             this.p = 2000;
          }
          b uob = new b(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uob, p0, oi, "1")) {
             a.p(uob, "observer");
             p0.d.d(p0.c(), uob);
          }
          d uod = new d(this);
          if (!PatchProxy.applyVoidOneRefs(uod, p0, oi, str)) {
             a.p(uod, "observer");
             p0.e.d(p0.c(), uod);
          }
          AdActionBarElementView$onBindData$3 oonBindData$ = new AdActionBarElementView$onBindData$3(this);
          if (!PatchProxy.applyVoidOneRefs(oonBindData$, p0, oi, "5")) {
             a.p(oonBindData$, "onDestroy");
             p0.f.d(p0.c(), new h(oonBindData$));
          }
       }
       return;
    }
    public final n w(){
       Object obj = PatchProxy.apply(null, this, AdActionBarElementView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
}
