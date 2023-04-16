package com.kwai.slide.play.detail.information.reco.a;
import qp7.d;
import lnc.a1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fs7.a;
import android.view.ViewGroup;
import xf7.a;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import qp7.x0;
import com.kwai.slide.play.detail.information.reco.b;
import qr7.e;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import qr7.g;
import qr7.h;
import qr7.i;
import qr7.j;
import qr7.k;
import qr7.l;
import qr7.m;
import qr7.f;
import qr7.o;
import qr7.b;
import qr7.c;
import qr7.d;
import qr7.n;
import qp7.t0;
import android.graphics.Paint;
import com.kwai.slide.play.detail.information.reco.RecoReasonElementLayout;
import com.yxcorp.gifshow.hypertag.KwaiHyperTagView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import android.text.TextPaint;
import android.graphics.drawable.Drawable;
import zf6.j;
import qr7.a;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import android.view.ViewGroup$LayoutParams;

public class a extends d	// class@001800
{
    public float l;
    public KwaiImageView m;
    public TextView n;
    public KwaiHyperTagView o;
    public ImageView p;
    public TextView q;
    public RecoReasonElementLayout r;
    public AnimatorSet s;
    public AnimatorSet t;

    public void a(){
       super();
       this.l = (float)(a1.h() - a1.e(99.00f));
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a) {
          return a.c(0x7f0d03b7, this.g);
       }
       return a.c(LayoutInflater.from(this.h), 0x7f0d03b7, this.g, false);
    }
    public void q(x0 p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
       }else {
          e uoe = new e(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoe, p0, uob, "4")) {
             p0.e.d(p0.a, uoe);
          }
          g og = new g(this);
          if (!PatchProxy.applyVoidOneRefs(og, p0, uob, "1")) {
             p0.f.d(p0.a, og);
          }
          h oh = new h(this);
          if (!PatchProxy.applyVoidOneRefs(oh, p0, uob, "6")) {
             p0.r.d(p0.a, oh);
          }
          i oi = new i(this);
          if (!PatchProxy.applyVoidOneRefs(oi, p0, uob, "19")) {
             p0.i.d(p0.a, oi);
          }
          j oj = new j(this);
          if (!PatchProxy.applyVoidOneRefs(oj, p0, uob, "23")) {
             p0.k.d(p0.a, oj);
          }
          k ok = new k(this);
          if (!PatchProxy.applyVoidOneRefs(ok, p0, uob, "11")) {
             p0.m.d(p0.a, ok);
          }
          l ol = new l(this);
          if (!PatchProxy.applyVoidOneRefs(ol, p0, uob, "21")) {
             p0.j.d(p0.a, ol);
          }
          m om = new m(this);
          if (!PatchProxy.applyVoidOneRefs(om, p0, uob, "27")) {
             p0.n.d(p0.a, om);
          }
          f uof = new f(this);
          if (!PatchProxy.applyVoidOneRefs(uof, p0, uob, "9")) {
             p0.q.d(p0.a, uof);
          }
          o oo = new o(this);
          if (!PatchProxy.applyVoidOneRefs(oo, p0, uob, "13")) {
             p0.g.d(p0.a, oo);
          }
          b uob1 = new b(this);
          if (!PatchProxy.applyVoidOneRefs(uob1, p0, uob, "17")) {
             p0.h.d(p0.a, uob1);
          }
          c uoc = new c(this);
          if (!PatchProxy.applyVoidOneRefs(uoc, p0, uob, "25")) {
             p0.l.d(p0.a, uoc);
          }
          d uod = new d(this);
          if (!PatchProxy.applyVoidOneRefs(uod, p0, uob, "31")) {
             p0.o.d(p0.a, uod);
          }
          n on = new n(this);
          if (!PatchProxy.applyVoidOneRefs(on, p0, uob, "29")) {
             p0.p.d(p0.a, on);
          }
       }
       return;
    }
    public void r(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (this.b.f()) {
          this.f.setLayerType(2, objArray);
       }
       this.r = this.f.findViewById(0x7f0a1308);
       this.o = this.f.findViewById(0x7f0a3455);
       this.m = this.f.findViewById(0x7f0a345e);
       this.n = this.f.findViewById(0x7f0a345c);
       this.p = this.f.findViewById(0x7f0a3456);
       TextView textView = this.f.findViewById(R.id.relationship_tag);
       this.q = textView;
       boolean b = true;
       textView.getPaint().setFakeBoldText(b);
       this.p.setImageDrawable(j.j(R.drawable.arg_RES_7f080a6b, b));
       this.o.setOnClickListener(new a(this));
       this.o.setPadding(a1.d(R.dimen.arg_RES_7f070334), this.o.getPaddingTop(), a1.d(R.dimen.arg_RES_7f070334), this.o.getPaddingBottom());
       if (!PatchProxy.applyVoid(objArray, this, uoa, "3") && NasaSlidePlayExperimentUtil.i()) {
          int i = a1.e(28.00f);
          this.q.getLayoutParams().height = i;
          this.o.getLayoutParams().height = i;
          Drawable uDrawable = j.j(R.drawable.arg_RES_7f08017f, b);
          this.q.setBackground(uDrawable);
          this.o.setBackground(uDrawable);
          this.q.setTextColor(a1.a(R.color.arg_RES_7f0606da));
          this.o.setDefTextColorRes(R.color.arg_RES_7f0606da);
          i = a1.e(13.00f);
          this.q.setTextSize(0, (float)i);
          this.o.setTextSize(i);
          this.o.setMoreArrowDrawableRes(R.drawable.arg_RES_7f080a6c);
          this.o.setDividerColor(a1.a(R.color.arg_RES_7f061bec));
       }
       return;
    }
}
