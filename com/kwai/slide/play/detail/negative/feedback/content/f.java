package com.kwai.slide.play.detail.negative.feedback.content.f;
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
import com.kwai.slide.play.detail.negative.feedback.content.g;
import es7.y;
import android.view.View$OnClickListener;
import es7.n;
import android.view.View$OnTouchListener;
import com.kwai.slide.play.detail.negative.feedback.content.l;
import com.kwai.slide.play.detail.negative.feedback.content.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import qp7.t0;
import android.graphics.Paint;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import es7.z;
import lnc.i3;
import java.lang.Number;
import io.reactivex.subjects.PublishSubject;
import com.kwai.slide.play.detail.negative.feedback.content.g$a;

public class f extends d	// class@001834
{
    public l l;
    public View m;

    public void f(){
       super();
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(LayoutInflater.from(this.h), 0x7f0d03b0, this.g, false);
    }
    public void q(x0 p0){
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, str)) {
       }else {
          this.f.setOnClickListener(new y(this));
          this.m.setOnTouchListener(new n(this));
          this.l = new l(this.f);
          a uoa = new a(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoa, p0, g.class, str)) {
             a.p(uoa, "observer");
             p0.d.d(p0.c(), uoa);
          }
       }
       return;
    }
    public void r(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "2")) {
          return;
       }
       if (this.b.f()) {
          this.f.setLayerType(2, objArray);
       }
       this.m = this.f.findViewById(0x7f0a2c16);
       return;
    }
    public final void v(String p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "11")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          d ti = this.i;
          i3 oi3 = i3.f();
          oi3.d("button_name", p0);
          oi3.c("index", Integer.valueOf(p1));
          p0 = oi3.toString();
          Objects.requireNonNull(ti);
          if (!PatchProxy.applyVoidOneRefs(p0, ti, z.class, "25")) {
             a.p(p0, "params");
             ti.m.onNext(p0);
          }
       }
       return;
    }
    public final void w(String p0,int p1,g$a p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, f.class, "10")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          d ti = this.i;
          i3 oi3 = i3.f();
          oi3.d("button_name", p0);
          oi3.c("index", Integer.valueOf(p1));
          p0 = (p2.n())? "ON": "OFF";
          oi3.d("status", p0);
          p0 = (p2.u != null)? "TRUE": "FALSE";
          oi3.d("is_through_bottom", p0);
          p0 = oi3.toString();
          Objects.requireNonNull(ti);
          if (!PatchProxy.applyVoidOneRefs(p0, ti, z.class, "23")) {
             a.p(p0, "params");
             ti.l.onNext(p0);
          }
       }
       return;
    }
}
