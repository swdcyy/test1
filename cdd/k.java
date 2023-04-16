package cdd.k;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.yxcorp.plugin.search.result.fragment.SearchTabHostFragment;
import android.content.Context;
import androidx.fragment.app.c;
import java.util.ArrayList;
import lnc.a1;
import zf6.j;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;
import java.util.List;
import com.kwai.library.widget.viewpager.tabstrip.b;
import android.os.Bundle;
import com.yxcorp.plugin.search.SearchPage;
import java.lang.Enum;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import x6d.x;
import java.util.Iterator;
import java.lang.CharSequence;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.plugin.search.result.hashtag.fragment.SearchTagDetailBaseFragment;
import java.lang.Math;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import com.kwai.library.widget.viewpager.tabstrip.SearchPagerSlidingTabStrip;
import y9d.a;
import android.content.res.ColorStateList;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import android.view.View;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabBaseFragment;
import cdd.j;
import android.view.View$OnClickListener;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup;

public class k extends a	// class@000538
{
    public List m;
    public List n;
    public Context o;
    public SearchTabHostFragment p;
    public a q;
    public List r;
    public ColorStateList s;
    public ColorStateList t;
    public int u;
    public int v;
    public float w;

    public void k(SearchTabHostFragment p0,Context p1,c p2){
       super(p1, p2);
       this.m = new ArrayList();
       this.n = new ArrayList();
       this.w = 6.50f;
       this.o = p1;
       this.p = p0;
       this.u = a1.a(0x7f061e52);
       this.v = j.b(this.o, 0x7f061641);
    }
    public Fragment B(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ok = this.r;
       if (ok != null) {
          k tp = this.p;
          if (tp instanceof SearchResultTabFragment && (tp.q1 != null && (ok.get(p0).a() != null && (SearchPage.AGGREGATE.name()).equals(this.r.get(p0).a().get("page"))))) {
             k tp1 = this.p;
             tp1.q1 = null;
             return tp1.q1;
          }
       }
    label_0060 :
       return super.B(p0);
    }
    public void D(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "14")) {
          return;
       }
       this.r = p0;
       super.D(p0);
       return;
    }
    public List E(){
       Object obj = PatchProxy.apply(null, this, k.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.n.clear();
       if (q.f(this.m)) {
          return this.n;
       }
       int i = 0;
       while (i < this.j()) {
          if (this.a(i) != null) {
             this.n.add(this.a(i));
          }
          i = i + 1;
       }
       return this.n;
    }
    public SearchResultFragment F(int p0){
       Iterator obj;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = this.m.size();
       if (p0 >= 0 && p0 < i) {
          x ox = this.m.get(p0);
          obj = this.E().iterator();
          while (obj.hasNext()) {
             Fragment uFragment = obj.next();
             if (uFragment instanceof SearchResultFragment && uFragment.kc() == ox.c()) {
                return uFragment;
             }
          }
       }
       return null;
    }
    public final PagerSlidingTabStrip$d G(int p0,CharSequence p1){
       IconifyRadioButtonNew obj;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ok, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.w = (this.p instanceof SearchTagDetailBaseFragment)? (float)this.j(): Math.min(this.w, (float)this.j());
       obj = SearchPagerSlidingTabStrip.G(this.o, this.w, this.j());
       k tq = this.q;
       if (tq != null && tq.a == 3) {
          if (this.s == null) {
             this.s = j.g(this.o, 0x7f061e80);
          }
          obj.setTextColor(this.s);
          obj.setTriangleColor(this.u);
       }else if(this.t == null){
          this.t = j.g(this.o, 0x7f061e86);
       }
       obj.setTextColor(this.t);
       obj.setTriangleColor(this.v);
       PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(Integer.toString(p0), obj);
       obj.setText(p1);
       k tp = this.p;
       if (tp instanceof SearchTagDetailBaseFragment && tp.V0 != null) {
          obj.setTextColor(j.g(this.o, R.color.arg_RES_7f061e77));
       }
       uod.i(new j(this, p0));
       obj.setSelected(false);
       return uod;
    }
    public void H(List p0){
       this.m = p0;
    }
    public PagerSlidingTabStrip$d b(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.G(p0, this.l(p0));
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       while (true) {
          if (i >= this.j()) {
             return -1;
          }
          if (TextUtils.n(p0, this.b(i).c())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public String d(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PagerSlidingTabStrip$d uod = this.b(p0);
       String str = (uod != null)? uod.c(): "";
       return str;
    }
    public PagerSlidingTabStrip$d e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.c(p0);
       return this.G(i, this.l(i));
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, k.class, "16")) {
          return;
       }
       if (p2 instanceof SearchResultFragment) {
          p2.ci();
       }
       super.h(p0, p1, p2);
       return;
    }
    public int k(Object p0){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, ok, "4");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = -2;
       if (p0 == null) {
          return i;
       }
       if (q.f(this.m)) {
          return i;
       }
       SearchResultFragment p = p0.P;
       p0 = p0.kc();
       Object obj1 = PatchProxy.applyOneRefs(p0, this, ok, "12");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          int i2 = 0;
          while (true) {
             if (i2 < this.m.size()) {
                if (this.m.get(i2).c() == p0) {
                   i1 = i2;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                i1 = -1;
             }
          }
       }
       if (i1 != -1 && i1 == p) {
          i = i1;
       }
       return i;
    }
    public CharSequence l(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.m.get(p0).a();
    }
    public Fragment t(){
       Object obj = PatchProxy.apply(null, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.F(this.getCurrentIndex());
    }
}
