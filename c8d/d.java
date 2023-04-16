package c8d.d;
import ucd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import nfd.a1;
import e7d.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zf6.j;
import android.widget.TextView;
import android.text.SpannableStringBuilder;
import lnc.a1;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.yxcorp.plugin.search.entity.SearchFilter;
import android.text.style.StyleSpan;
import c8d.c;
import com.yxcorp.plugin.search.utils.i0;
import c8d.b;
import android.view.View;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import sy5.a;
import e7d.a;
import com.google.gson.JsonObject;
import gbd.d;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.SearchMultiFilter;
import java.lang.Boolean;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.yxcorp.plugin.search.SearchSource;
import ekd.m1;

public class d extends n	// class@0004f9
{
    public SearchResultFragment p;
    public SearchItem q;
    public SearchFilter r;
    public a1 s;
    public View t;
    public TextView u;

    public void d(){
       super();
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       d tq = this.q;
       if (tq != null) {
          SearchItem mResultExtPa = tq.mResultExtParams;
          if (mResultExtPa != null) {
             SearchResultExtParams mExposedFilt = mResultExtPa.mExposedFilter;
             if (mExposedFilt != null) {
                this.r = mExposedFilt;
                this.s = this.p.b1.B();
                if (!PatchProxy.applyVoid(objArray, this, uod, "4") && !this.q.isShowed()) {
                   t.l(0, this.p, this.V8(), t.a(this.p, "SEARCH_RESULT", objArray));
                   this.q.setShowed(true);
                }
                if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
                   this.u.setTextColor(j.b(this.getContext(), R.color.arg_RES_7f0607cf));
                   SpannableStringBuilder spannableStr = new SpannableStringBuilder();
                   spannableStr.append(a1.p(R.string.arg_RES_7f100a6c));
                   SpannableStringBuilder spannableStr1 = new SpannableStringBuilder("¡¸"+this.r.mName+"¡¹");
                   spannableStr1.setSpan(new StyleSpan(true), 0, spannableStr1.length(), 33);
                   spannableStr1.setSpan(new c(this, j.b(this.getContext(), R.color.arg_RES_7f0607c1)), 0, spannableStr1.length(), 33);
                   spannableStr.append(spannableStr1);
                   spannableStr.append(a1.p(R.string.arg_RES_7f100a6d));
                   this.u.setText(spannableStr);
                }
                if (this.p.Wh() != null) {
                   this.p.Wh().B(true);
                }
                this.P8(this.u, new b(this));
             }
          }
       }
       return;
    }
    public final ClientEvent$ElementPackage V8(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.k();
       SearchResultFragment b1 = this.p.b1;
       if (b1 != null) {
          objArray = b1.e();
       }
       d uod = d.r();
       uod.a("EXPOSED_FILTER_BUTTON");
       uod.k(this.r.mFilterType);
       uod.q(this.r.mName);
       uod.s();
       uod.l(obj.e("search_session_id", objArray).j());
       return uod.d();
    }
    public void W8(){
       SearchMultiFilter searchMultiF;
       Iterator iterator1;
       SearchFilter searchFilter;
       Object obj;
       boolean b;
       SearchMultiFilter mCurrentSele;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "6")) {
          return;
       }
       t.l(1, this.p, this.V8(), t.a(this.p, "SEARCH_RESULT", objArray));
       if (!PatchProxy.applyVoid(objArray, this, uod, "7")) {
          d ts = this.s;
          if (ts != null && !q.f(ts.g())) {
             Iterator iterator = this.s.g().iterator();
          }
       }
       uod = this.p;
       uod.di(uod.b1.f(), SearchSource.FILTER, this.p.Uh());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0e67);
       this.u = m1.f(p0, 0x7f0a0e77);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.s8(SearchItem.class);
       return;
    }
}
