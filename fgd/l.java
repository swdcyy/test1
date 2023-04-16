package fgd.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bgd.c;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextPaint;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import lnc.a1;
import android.widget.Button;
import android.content.Context;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatButton;
import fgd.l$a;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.c;
import android.view.ViewPropertyAnimator;
import crd.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import k2b.u1;
import android.view.View;
import ekd.m1;

public final class l extends PresenterV2	// class@000e2d
{
    public final String p;
    public c q;
    public TextView r;
    public TextView s;
    public TextView t;
    public SelectShapeButton u;
    public final AtomicBoolean v;
    public t w;
    public b x;

    public void l(){
       super();
       this.p = "ClearCacheItemNewUiPresenter";
       this.v = new AtomicBoolean(false);
    }
    public static final SelectShapeButton P8(l p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mClearCacheBtn");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       l tr = this.r;
       if (tr == null) {
          a.S("mCacheTypeView");
       }
       l tq = this.q;
       String str = "mClearCacheInfo";
       if (tq == null) {
          a.S(str);
       }
       tr.setText(tq.d());
       tr = this.s;
       String str1 = "mCacheSizeView";
       if (tr == null) {
          a.S(str1);
       }
       l tq1 = this.q;
       if (tq1 == null) {
          a.S(str);
       }
       tr.setText(tq1.c());
       tr = this.s;
       if (tr == null) {
          a.S(str1);
       }
       TextPaint paint = tr.getPaint();
       a.o(paint, "mCacheSizeView.paint");
       boolean b = true;
       paint.setFakeBoldText(b);
       tr = this.t;
       if (tr == null) {
          a.S("mCacheNoteView");
       }
       tq1 = this.q;
       if (tq1 == null) {
          a.S(str);
       }
       tr.setText(tq1.b());
       tr = this.q;
       if (tr == null) {
          a.S(str);
       }
       if (!tr.a()) {
          tr = this.u;
          if (tr == null) {
             a.S("mClearCacheBtn");
          }
          int i = (CheckDiskModule.y)? 0x7f101289: 0x7f10058a;
          tr.setText(a1.p(i));
          tr = this.u;
          if (tr == null) {
             a.S("mClearCacheBtn");
          }
          Context context = this.getContext();
          a.m(context);
          tr.setTextColor(ContextCompat.getColorStateList(context, R.color.arg_RES_7f060137));
          tr = this.u;
          if (tr == null) {
             a.S("mClearCacheBtn");
          }
          b uob = new b();
          b uob1 = new b();
          uob1.v(a1.a(R.color.arg_RES_7f061b2b));
          KwaiRadiusStyles r16 = KwaiRadiusStyles.R16;
          uob1.g(r16);
          uob.o(uob1.a());
          uob1 = new b();
          uob1.v(a1.a(R.color.arg_RES_7f061b2b));
          uob1.g(r16);
          uob.z(uob1.a());
          uob1 = new b();
          uob1.v(a1.a(R.color.arg_RES_7f061b29));
          uob1.g(r16);
          uob.A(uob1.a());
          tr.setBackgroundDrawable(uob.a());
          tr = this.q;
          if (tr == null) {
             a.S(str);
          }
          if (a.g(tr.c(), "0.00 MB") && !CheckDiskModule.y) {
             tr = this.u;
             if (tr == null) {
                a.S("mClearCacheBtn");
             }
             tr.setEnabled(false);
          }
       }else {
          tr = this.u;
          if (tr == null) {
             a.S("mClearCacheBtn");
          }
          tr.setText(a1.p(R.string.arg_RES_7f1031b3));
       }
       tr = this.u;
       if (tr == null) {
          a.S("mClearCacheBtn");
       }
       paint = tr.getPaint();
       a.o(paint, "mClearCacheBtn.paint");
       paint.setFakeBoldText(b);
       tr = this.u;
       if (tr == null) {
          a.S("mClearCacheBtn");
       }
       tr.setOnClickListener(new l$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       l tw = this.w;
       if (tw != null) {
          tw.o();
       }
       tw = this.u;
       if (tw == null) {
          a.S("mClearCacheBtn");
       }
       tw.animate().cancel();
       tw = this.x;
       if (tw != null) {
          tw.dispose();
       }
       return;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLEAN_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("name", p0);
       uElementPack.params = oi3.e();
       uElementPack.type = 13;
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       u1.B(new ClickMetaData().setLogPage(activity.N2()).setElementPackage(uElementPack));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.cache_type);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.cache_type\)");
       this.r = view;
       view = m1.f(p0, R.id.cache_size);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.cache_size\)");
       this.s = view;
       view = m1.f(p0, R.id.cache_note);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.cache_note\)");
       this.t = view;
       p0 = m1.f(p0, R.id.clear_cache);
       a.o(p0, "ViewBindUtils.bindWidget¡­otView, R.id.clear_cache\)");
       this.u = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       Object obj = this.q8(c.class);
       a.o(obj, "inject\(ClearCacheInfo::class.java\)");
       this.q = obj;
       return;
    }
}
