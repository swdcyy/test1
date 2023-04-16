package led.f;
import ucd.n;
import y8c.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.SubTabItem;
import java.lang.CharSequence;
import android.widget.TextView;
import e7d.a;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import e7d.h;
import com.yxcorp.plugin.search.result.b;
import com.yxcorp.plugin.search.result.fragment.SearchResultAggregateAladdinFragment;
import com.yxcorp.plugin.search.result.SearchKeywordContext$b;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.SearchSource;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView;
import gbd.u;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.graphics.Typeface;
import zf6.j;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import nfd.t0;
import ekd.m1;
import led.e;
import android.view.View$OnClickListener;
import e7d.f;

public class f extends n	// class@001c1e
{
    public TextView p;
    public SubTabItem q;
    public RecyclerView r;
    public g s;
    public f t;
    public h u;
    public SearchResultFragment v;
    public List w;

    public void f(g p0){
       super();
       this.s = p0;
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       this.p.setText(this.q.mKeyword);
       this.X8();
       if (!PatchProxy.applyVoid(objArray, this, uof, "5")) {
          f tq = this.q;
          if (tq.mIsShowed == null) {
             tq.mIsShowed = true;
             f tu = this.u;
             b.p(0, tq, this.v, tu, tu.i(), this.v.Uh());
          }
       }
       this.Z8();
       return;
    }
    public void V8(SubTabItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "7")) {
          return;
       }
       f tv = this.v;
       if (tv instanceof SearchResultAggregateAladdinFragment) {
          tv.v1 = true;
       }
       SearchKeywordContext$b uob = new SearchKeywordContext$b();
       uob.b(this.u.f().mMajorKeyword);
       if (p0 != null) {
          uob.c = p0;
       }
       uob.d = this.u.g().mDisableCorrection;
       if (this.v.kc() != SearchPage.COMMODITY) {
          this.v.di(uob.a(), SearchSource.SEARCH_RELATED_TAB, p0.mRequestId);
       }
       f tu = this.u;
       b.p(1, p0, this.v, tu, tu.i(), this.v.Uh());
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.v.Ac().setRefreshing(false);
       this.r.smoothScrollBy((- (((this.r.getMeasuredWidth() / 2) - this.m8().getLeft()) - (this.m8().getMeasuredWidth() / 2))), false);
       this.v.b1.F().c(this.q);
       this.s.k0();
       this.V8(this.q);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       u ou = this.u.F();
       if (this.q != null && ou.a() == this.q) {
          this.Y8();
          this.p.setEnabled(false);
       }else {
          this.a9();
          this.p.setEnabled(true);
       }
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       this.p.setTypeface(Typeface.DEFAULT_BOLD);
       f tp = this.p;
       tp.setTextColor(j.d(tp, R.color.arg_RES_7f06161f));
       tp = this.p;
       tp.setBackground(j.m(tp, R.drawable.arg_RES_7f081ede));
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
       layoutParams.height = t0.C;
       f tp = this.p;
       tp.setPadding(t0.m, tp.getPaddingTop(), t0.m, this.p.getPaddingBottom());
       this.p.setLayoutParams(layoutParams);
       this.p.setTextSize(2, 14.00f);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       this.p.setTypeface(Typeface.DEFAULT);
       f tp = this.p;
       tp.setTextColor(j.d(tp, R.color.arg_RES_7f0607cf));
       tp = this.p;
       tp.setBackground(j.m(tp, R.drawable.arg_RES_7f081edf));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.tab);
       this.p = textView;
       this.P8(textView, new e(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.q8(SubTabItem.class);
       this.t = this.r8("SEARCH_RESULT_DELEGATE");
       this.u = this.r8("SEARCH_FRAGMENT_DELEGATE");
       this.v = this.r8("FRAGMENT");
       this.r = this.r8("SEARCH_SLIDE_RECYCLERVIEW");
       return;
    }
}
