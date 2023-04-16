package nfd.j0;
import com.yxcorp.plugin.search.utils.i0;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.SearchSource;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import jl5.c;
import nfd.t0;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.plugin.search.SearchPage;
import udd.d;
import com.kwai.robust.PatchProxyResult;
import udd.e;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gbd.u;
import com.yxcorp.plugin.search.result.SubTabItem;
import android.view.ViewGroup;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import gbd.d;
import java.lang.CharSequence;
import e7d.a;
import sy5.a;
import k2b.e0;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import com.yxcorp.plugin.search.result.fragment.SearchResultAggregateAladdinFragment;
import kcd.n;
import kcd.h;
import com.yxcorp.plugin.search.module.a;
import i2b.a;
import android.widget.LinearLayout;
import zf6.j;

public class j0 extends i0	// class@001dbd
{
    public boolean A;
    public SearchResultFragment B;
    public String C;
    public SearchSceneSource D;
    public int t;
    public int u;
    public View v;
    public ViewGroup w;
    public LinearLayout x;
    public TextView y;
    public d z;

    public void j0(SearchResultFragment p0,SearchSource p1,String p2){
       super(p0);
       this.t = 0x7f0805fc;
       this.u = 0x7f104489;
       this.A = true;
       this.B = p0;
       this.C = p2;
    }
    public void C(boolean p0){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj0, "8")) {
          return;
       }
       oj0 = this.v;
       if (oj0 == null) {
          return;
       }
       View view = oj0.findViewById(R.id.kwai_empty_view);
       int i = -1;
       int i1 = (p0)? c.d(200.00f): -1;
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(i, i1);
       i1 = -2;
       if (this.E()) {
          layoutParams.height = i1;
          layoutParams.topMargin = t0.n0 + t0.c;
       }
       if (view != null) {
          view.setLayoutParams(layoutParams);
       }
       ImageView imageView = this.v.findViewById(R.id.empty_icon);
       float f = 72.00f;
       float f1 = 96.00f;
       int i2 = (p0)? c.d(f): c.d(f1);
       i = (p0)? c.d(f): c.d(f1);
       layoutParams = new LinearLayout$LayoutParams(i2, i);
       if (imageView != null) {
          imageView.setLayoutParams(layoutParams);
       }
       TextView textView = this.v.findViewById(R.id.empty_text);
       layoutParams = new LinearLayout$LayoutParams(i1, i1);
       f = (p0)? 12.00f: 20.00f;
       i = c.d(f);
       i1 = (this.E())? t0.P: 0;
       layoutParams.setMargins(0, i, 0, i1);
       if (textView != null) {
          float f2 = (p0)? 16.00f: 18.00f;
          textView.setTextSize(2, f2);
          textView.setLayoutParams(layoutParams);
       }
       return;
    }
    public d D(SearchPage p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = (p0 != SearchPage.AGGREGATE && (p0 != SearchPage.USER && (p0 == SearchPage.COMMODITY || p0 == SearchPage.LIVE)))? new d(this.C, p1, this.g): new e(this.C, p1, this.g);
       return uod;
    }
    public final boolean E(){
       Object obj = PatchProxy.apply(null, this, j0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.g.kc() == SearchPage.COMMODITY && this.g.Xh().a() != null)? true: false;
       return b;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, j0.class, "5")) {
          return;
       }
       j0 tw = this.w;
       if (tw != null) {
          tw.removeAllViews();
          this.w.setVisibility(8);
          this.C(false);
       }
       return;
    }
    public final void G(int p0){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj0, "12")) {
          return;
       }
       j0 tB = this.B;
       Object[] objArray = null;
       ClientEvent$ElementPackage uElementPack = PatchProxy.apply(objArray, this, oj0, "13");
       if (uElementPack != PatchProxyResult.class) {
       }else {
          d uod = d.r();
          uod.q(this.y.getText().toString());
          uod.t(1);
          uod.s();
          SearchResultFragment b1 = this.B.b1;
          String str = (b1 != null)? b1.e(): objArray;
          d uod1 = d.r();
          uod1.a("RESET_FILTER_BUTTON");
          uod1.h(uod.n("search_session_id", str).e().i());
          uElementPack = uod1.d();
       }
       t.l(p0, tB, uElementPack, t.a(this.B, "SEARCH_RESULT", objArray));
       return;
    }
    public final void H(int p0){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj0, "10")) {
          return;
       }
       f tg = this.g;
       if (tg instanceof SearchResultAggregateAladdinFragment) {
          SearchPage aGGREGATE = SearchPage.AGGREGATE;
          if (tg.kc() != aGGREGATE) {
             return;
          }else {
             h oh = n.a().c(aGGREGATE.mLogName, 0);
             if (oh != null) {
                oh.t(p0);
                n.a().f(aGGREGATE.mLogName, 0);
                n.a().g(aGGREGATE.mLogName, 0, 0);
             }
          }
       }
       return;
    }
    public void I(int p0){
       this.u = p0;
    }
    public void J(SearchPage p0,boolean p1,boolean p2,String p3,boolean p4){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oj0, "6")) {
             return;
          }
       }
       if (this.w == null) {
          return;
       }else if(p1){
          this.C(1);
          this.H(101);
          this.w.setVisibility(0);
          if (p2) {
             this.w.removeAllViews();
             d uod = this.D(p0, p3);
             this.z = uod;
             this.w.addView(uod.getView());
             this.z.q();
          }
       }else if(p4){
          this.H(102);
       }
       this.w.setVisibility(8);
       return;
    }
    public View J0(){
       View obj = PatchProxy.apply(null, this, j0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.v == null) {
          obj = a.i(this.a, R.layout.arg_RES_7f0d135d);
          this.v = obj;
          this.x = this.v.findViewById(0x7f0a35c0);
          this.y = this.v.findViewById(0x7f0a35c3);
          TextView textView = this.v.findViewById(R.id.empty_text);
          textView.setText(this.u);
          this.w = this.v.findViewById(0x7f0a115d);
          obj.findViewById(R.id.empty_icon).setBackgroundResource(this.t);
          textView.setTextColor(j.d(this.v, R.color.arg_RES_7f0607de));
       }
       return this.v;
    }
    public void K(boolean p0){
       this.A = p0;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       super.g();
       if (this.A == null) {
          i0 ts = this.s;
          if (ts != null) {
             ts.setVisibility(8);
          }
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, j0.class, "2")) {
          return;
       }
       super.p();
       j0 tA = this.A;
       if (tA != null) {
          i0 ts = this.s;
          if (ts != null) {
             ts.setVisibility(0);
          }else if(tA == null){
             i0 ts1 = this.s;
             if (ts1 != null) {
                ts1.setVisibility(8);
             }
          }
       }else {
          goto label_001c ;
       }
       return;
    }
}
