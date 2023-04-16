package b56.h0;
import sc6.e;
import b56.d;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.HashSet;
import b56.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Set;
import b56.a;
import java.lang.Integer;
import b56.g0;
import android.view.View;
import com.yxcorp.utility.n;
import java.util.Iterator;
import java.lang.Long;
import b56.z;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ProgressBar;
import com.yxcorp.utility.Log;
import android.view.ViewStub;
import android.view.ViewParent;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;

public class h0 implements e, d	// class@000404
{
    public long b;
    public boolean c;
    public ViewGroup d;
    public ViewGroup e;
    public ProgressBar f;
    public TextView g;
    public TextView h;
    public Set i;
    public g0 j;

    public void h0(ViewGroup p0){
       super();
       this.i = new HashSet();
       this.d = p0;
       this.j = new c();
    }
    public void a(boolean p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh0, "9")) {
          return;
       }
       this.c = p0;
       this.j(p0);
       return;
    }
    public Set b(){
       return this.i;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "8")) {
          return;
       }
       this.i.remove(p0);
       return;
    }
    public void d(int p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh0, "2")) {
          return;
       }
       this.k();
       h0 tj = this.j;
       if (tj != null && tj.a()) {
          this.j(this.c);
       }
       tj = this.e;
       if (tj == null) {
          return;
       }else {
          n.W(tj, 0, this.b);
          Iterator iterator = this.i.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(true);
          }
          return;
       }
    }
    public void e(long p0,long p1){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, oh0, "6")) {
          return;
       }
       if (this.e == null) {
          return;
       }
       this.g.setText(z.c(p0));
       this.h.setText(z.c(p1));
       oh0 = this.f;
       oh0.setProgress(z.a(p0, p1, oh0.getMax()));
       return;
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "7")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public void g(long p0){
       this.b = p0;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, h0.class, "5")) {
          return;
       }
       this.k();
       h0 te = this.e;
       if (te == null) {
          return;
       }
       n.W(te, 8, this.b);
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(false);
       }
       return;
    }
    public void i(g0 p0){
       this.j = p0;
    }
    public final void j(boolean p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh0, "11")) {
          return;
       }
       oh0 = this.j;
       if (oh0 != null) {
          h0 te = this.e;
          if (te != null) {
             oh0.b(te, p0);
          }
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, h0.class, "10")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       Log.g("XfCenterProgressViewMod", "init center view");
       ViewStub viewStub = this.d.findViewById(R.id.xf_center_progress_stub);
       if (viewStub != null && viewStub.getParent() != null) {
          this.e = viewStub.inflate();
       }
       if (this.e == null) {
          this.e = this.d.findViewById(0x7f0a45ce);
       }
       ProgressBar progressBar = this.d.findViewById(R.id.xf_center_bottom_progress);
       this.f = progressBar;
       progressBar.setMax(0x2710);
       this.g = this.d.findViewById(0x7f0a45c9);
       Typeface typeface = d0.a("alte-din.ttf", this.d.getContext());
       if (typeface != null) {
          this.g.setTypeface(typeface);
       }
       TextView textView = this.d.findViewById(R.id.xf_center_right_duration_text);
       this.h = textView;
       if (typeface != null) {
          textView.setTypeface(typeface);
       }
       this.j(this.c);
       this.e(0, 0);
       return;
    }
}
