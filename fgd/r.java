package fgd.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.library.widget.specific.misc.CleanUpView;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import bgd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextPaint;
import android.widget.Button;
import fgd.r$a;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.c;
import android.view.ViewPropertyAnimator;
import android.view.View;
import ekd.m1;

public final class r extends PresenterV2	// class@000e38
{
    public c p;
    public TextView q;
    public TextView r;
    public TextView s;
    public SelectShapeButton t;
    public CleanUpView u;
    public final AtomicBoolean v;
    public t w;

    public void r(){
       super();
       this.v = new AtomicBoolean(false);
    }
    public static final CleanUpView P8(r p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mCleanUpView");
       }
       return p0;
    }
    public static final SelectShapeButton R8(r p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mClearCacheBtn");
       }
       return p0;
    }
    public static final c S8(r p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mClearCacheInfo");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       r tq = this.q;
       if (tq == null) {
          a.S("mCacheTypeView");
       }
       String str = "";
       r tp = this.p;
       if (tp == null) {
          a.S("mClearCacheInfo");
       }
       tq.setText(str+tp.d()+":  ");
       tq = this.r;
       if (tq == null) {
          a.S("mCacheSizeView");
       }
       r tp1 = this.p;
       if (tp1 == null) {
          a.S("mClearCacheInfo");
       }
       tq.setText(tp1.c());
       tq = this.s;
       if (tq == null) {
          a.S("mCacheNoteView");
       }
       tp1 = this.p;
       if (tp1 == null) {
          a.S("mClearCacheInfo");
       }
       tq.setText(tp1.b());
       tq = this.t;
       str = "mClearCacheBtn";
       if (tq == null) {
          a.S(str);
       }
       TextPaint paint = tq.getPaint();
       a.o(paint, "mClearCacheBtn.paint");
       paint.setFakeBoldText(true);
       tq = this.t;
       if (tq == null) {
          a.S(str);
       }
       tq.setOnClickListener(new r$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       r tw = this.w;
       if (tw != null) {
          tw.o();
       }
       tw = this.t;
       if (tw == null) {
          a.S("mClearCacheBtn");
       }
       tw.animate().cancel();
       tw = this.u;
       if (tw == null) {
          a.S("mCleanUpView");
       }
       tw.c();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.cache_type);
       a.o(view, "bindWidget\(rootView, R.id.cache_type\)");
       this.q = view;
       view = m1.f(p0, R.id.cache_size);
       a.o(view, "bindWidget\(rootView, R.id.cache_size\)");
       this.r = view;
       view = m1.f(p0, R.id.cache_note);
       a.o(view, "bindWidget\(rootView, R.id.cache_note\)");
       this.s = view;
       view = m1.f(p0, R.id.clear_cache);
       a.o(view, "bindWidget\(rootView, R.id.clear_cache\)");
       this.t = view;
       p0 = m1.f(p0, R.id.clean_up);
       a.o(p0, "bindWidget\(rootView, R.id.clean_up\)");
       this.u = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       Object obj = this.q8(c.class);
       a.o(obj, "inject\(ClearCacheInfo::class.java\)");
       this.p = obj;
       return;
    }
}
