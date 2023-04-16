package com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import qp7.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import qp7.x0;
import hy9.m;
import android.widget.Button;
import com.yxcorp.gifshow.detail.common.information.interestadjust.c;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import android.widget.TextView;
import m01.a;
import android.view.View$OnClickListener;
import hy9.i;
import hy9.e;
import com.yxcorp.gifshow.detail.common.information.interestadjust.b;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d$a;

public class d extends d	// class@001429
{
    public TextView l;
    public Button m;
    public Button n;
    public View o;
    public Animator p;

    public void d(){
       super();
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(LayoutInflater.from(this.h), 0x7f0d03a8, this.g, false);
    }
    public void q(x0 p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
       }else {
          this.m = this.p().findViewById(0x7f0a318b);
          this.n = this.p().findViewById(0x7f0a2d8a);
          c uoc = new c(this, p0);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoc, p0, om, "12")) {
             p0.j.d(p0.a, uoc);
          }
          this.l = this.p().findViewById(0x7f0a141b);
          View view = this.p().findViewById(R.id.interest_adjust_view);
          this.o = view;
          view.setOnClickListener(a.b);
          i oi = new i(this);
          if (!PatchProxy.applyVoidOneRefs(oi, p0, om, "1")) {
             p0.e.d(p0.c(), oi);
          }
          e uoe = new e(this);
          if (!PatchProxy.applyVoidOneRefs(uoe, p0, om, "10")) {
             p0.i.d(p0.c(), uoe);
          }
          b uob = new b(this);
          if (!PatchProxy.applyVoidOneRefs(uob, p0, om, "8")) {
             p0.h.d(p0.c(), uob);
          }
       }
       return;
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.n.setOnClickListener(new d$a(this));
       return;
    }
}
