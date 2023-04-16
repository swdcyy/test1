package aq7.e;
import qp7.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import qp7.x0;
import aq7.g;
import aq7.b;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import aq7.c;
import aq7.d;
import android.widget.TextView;
import qp7.t0;
import android.text.TextPaint;
import android.graphics.Typeface;
import ekd.d0;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import aq7.e$a;
import android.view.View$OnTouchListener;
import aq7.e$b;
import android.view.View$OnClickListener;
import lnc.a1;

public final class e extends d	// class@000343
{
    public TextView l;
    public KwaiImageView m;
    public View n;
    public View o;
    public HashMap p;

    public void e(){
       super();
    }
    public static final KwaiImageView v(e p0){
       p0 = p0.m;
       if (p0 == null) {
          a.S("mIconView");
       }
       return p0;
    }
    public View i(){
       View obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(LayoutInflater.from(this.k()), R.layout.element_layout_trending_operation, this.m(), false);
       a.o(obj, "LayoutInflater.from\(cont¡­\n      parentView, false\)");
       return obj;
    }
    public void q(x0 p0){
       g og = g.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, str)) {
       }else {
          a.p(p0, "viewModel");
          b uob = new b(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uob, p0, og, str)) {
             a.p(uob, "observer");
             p0.d.d(p0.c(), uob);
          }
          c uoc = new c(this);
          if (!PatchProxy.applyVoidOneRefs(uoc, p0, og, "4")) {
             a.p(uoc, "observer");
             p0.e.d(p0.c(), uoc);
          }
          d uod = new d(this);
          if (!PatchProxy.applyVoidOneRefs(uod, p0, og, "6")) {
             a.p(uod, "observer");
             p0.f.d(p0.c(), uod);
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       View view = this.p().findViewById(R.id.element_trending_layout);
       a.o(view, "view.findViewById<View>\(¡­.element_trending_layout\)");
       this.n = view;
       view = this.p().findViewById(R.id.nasa_detail_operation_bottom_icon);
       a.o(view, "view.findViewById\(R.id.n¡­il_operation_bottom_icon\)");
       this.m = view;
       view = this.p().findViewById(R.id.nasa_detail_operation_bottom_desc);
       a.o(view, "view.findViewById\(R.id.n¡­il_operation_bottom_desc\)");
       this.l = view;
       view = this.p().findViewById(R.id.nasa_detail_operation_bottom_go_icon);
       a.o(view, "view.findViewById\(R.id.n¡­operation_bottom_go_icon\)");
       this.o = view;
       e tl = this.l;
       String str = "mTextView";
       if (tl == null) {
          a.S(str);
       }
       tl.setTextColor(this.j().l);
       tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       TextPaint paint = tl.getPaint();
       a.o(paint, "mTextView.paint");
       paint.setFakeBoldText(true);
       tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       e tl1 = this.l;
       if (tl1 == null) {
          a.S(str);
       }
       tl.setTypeface(d0.a("alte-din.ttf", tl1.getContext()));
       if (NasaSlidePlayExperimentUtil.b()) {
          tl = this.o;
          if (tl == null) {
             a.S("mArrowView");
          }
          tl.setBackgroundResource(R.drawable.arg_RES_7f080a6d);
       }
       this.p().setOnTouchListener(e$a.b);
       this.p().setOnClickListener(new e$b(this));
       if (this.j().c()) {
          tl = this.n;
          if (tl == null) {
             a.S("mLayout");
          }
          tl.setBackgroundColor(this.j().c());
       }
       if (NasaSlidePlayExperimentUtil.c()) {
          this.p().setBackgroundColor(a1.a(R.color.arg_RES_7f061c03));
       }
       return;
    }
}
