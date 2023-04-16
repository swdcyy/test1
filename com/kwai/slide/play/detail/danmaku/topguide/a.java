package com.kwai.slide.play.detail.danmaku.topguide.a;
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
import oq7.j;
import oq7.g;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import oq7.f;
import oq7.e;
import oq7.d;
import lq7.a;
import oq7.a;
import kotlin.jvm.internal.a;
import oq7.b;
import oq7.c;
import qp7.t0;
import android.content.res.Resources;
import cw9.c;
import lq7.e;
import com.kwai.library.widget.deprecated.StrokeTextView;
import android.graphics.Typeface;
import android.widget.TextView;
import com.kwai.slide.play.detail.danmaku.topguide.a$a;
import android.view.View$OnClickListener;

public class a extends d	// class@0017a7
{
    public StrokeTextView l;
    public StrokeTextView m;
    public View n;
    public ObjectAnimator o;

    public void a(){
       super();
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(LayoutInflater.from(this.k()), 0x7f0d03a4, this.g, false);
    }
    public void q(x0 p0){
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
       }else {
          g og = new g(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(og, p0, oj, "4")) {
             p0.f.d(p0.c(), og);
          }
          f uof = new f(this);
          if (!PatchProxy.applyVoidOneRefs(uof, p0, oj, "6")) {
             p0.g.d(p0.c(), uof);
          }
          e uoe = new e(this);
          if (!PatchProxy.applyVoidOneRefs(uoe, p0, oj, "1")) {
             p0.e.d(p0.c(), uoe);
          }
          p0.g(new d(this));
          a uoa = new a(this);
          if (!PatchProxy.applyVoidOneRefs(uoa, p0, oj, "8")) {
             a.p(uoa, "observer");
             p0.h.d(p0.c(), uoa);
          }
          b uob = new b(this);
          if (!PatchProxy.applyVoidOneRefs(uob, p0, oj, "10")) {
             a.p(uob, "observer");
             p0.i.d(p0.c(), uob);
          }
          c uoc = new c(this);
          if (!PatchProxy.applyVoidOneRefs(uoc, p0, oj, "12")) {
             a.p(uoc, "observer");
             p0.j.d(p0.c(), uoc);
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       e.a(this.j(), this.p(), c.b(this.k().getResources(), R.dimen.arg_RES_7f07030d));
       this.n = this.p().findViewById(0x7f0a2ec4);
       this.m = this.p().findViewById(0x7f0a2ec8);
       this.l = this.p().findViewById(0x7f0a2ec2);
       this.m.setTypeface(Typeface.defaultFromStyle(1));
       this.l.setTypeface(Typeface.defaultFromStyle(1));
       this.l.setOnClickListener(new a$a(this));
       return;
    }
}
