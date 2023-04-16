package nfd.a1;
import java.lang.Object;
import java.util.HashSet;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.entity.SearchFilter;
import com.search.common.entity.SearchBaseItem;
import java.util.Map;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.feature.api.platform.bridge.beans.JsSelectCityResult$SelectCityData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.plugin.search.entity.SearchMultiFilter;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Set;
import java.util.Map$Entry;
import nfd.a1$a;

public class a1	// class@001d87
{
    public List a;
    public List b;
    public List c;
    public Map d;
    public boolean e;
    public JsSelectCityResult$SelectCityData f;
    public boolean g;
    public HashSet h;
    public Map i;
    public Map j;
    public Map k;
    public SearchFilter l;
    public boolean m;

    public void a1(){
       super();
       this.h = new HashSet();
       this.i = new HashMap();
       this.j = new HashMap();
       this.k = new HashMap();
    }
    public void A(boolean p0){
       this.g = p0;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, a1.class, "30")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          List list = iterator.next();
          if (!q.f(list)) {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().mIsShow = false;
             }
          }
       }
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a1.class, "12")) {
          return;
       }
       if (!this.m()) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          List list = iterator.next();
          this.j.put(list, this.i.get(list));
       }
       return;
    }
    public void D(SearchFilter p0,boolean p1){
       a1 uoa1 = a1.class;
       if (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa1, "6")) {
          return;
       }
       uoa1 = this.d;
       if (uoa1 != null) {
          if (p1) {
             uoa1.remove(p0.mFilterType);
          }else {
             uoa1.put(p0.mFilterType, p0);
          }
       }
       return;
    }
    public final void a(StringBuilder p0,SearchFilter p1,boolean p2){
       if (PatchProxy.isSupport(a1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a1.class, "18")) {
          return;
       }
       if (p1.mIsSingleSelect == null || (p1.mSingleFilterSelected == null || (!p2 && p1.mExtraType == 1))) {
          return;
       }
       if (p1.mIsSelect != null) {
          if (p0.length()) {
             p0 = p0+",";
          }
          if (!q.f(p1.mOrderFilterTypes)) {
             SearchFilter mSortFilterI = p1.mSortFilterIndex;
             if (mSortFilterI > -1) {
                p0+p1.mOrderFilterTypes.get(mSortFilterI);
             }
          }
          p0+p1.mFilterType;
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a1.class, "11")) {
          return;
       }
       a1 tc = this.c;
       if (tc != null) {
          this.e = false;
          tc.clear();
       }
       tc = this.d;
       if (tc != null) {
          tc.clear();
       }
       this.w(null);
       this.y(null);
       this.v(null);
       return;
    }
    public void c(){
       this.e = true;
    }
    public List d(){
       return this.b;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, a1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (q.f(this.b))? 0: this.b.size();
       return i;
    }
    public List f(){
       return this.a;
    }
    public List g(){
       return this.c;
    }
    public JsSelectCityResult$SelectCityData h(){
       return this.f;
    }
    public String i(){
       a1 tf = this.f;
       if (tf == null) {
          return "";
       }
       return tf.mCityName;
    }
    public SearchFilter j(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a1.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i.containsKey(p0)) {
          return this.i.get(p0);
       }
       return null;
    }
    public String k(boolean p0){
       StringBuilder obj;
       Iterator iterator;
       a1 uoa1 = a1.class;
       if (PatchProxy.isSupport(uoa1)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa1, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       if (!q.f(this.c)) {
          if (this.e == null) {
             return "";
          }else {
             iterator = this.c.iterator();
             while (iterator.hasNext()) {
                this.a(obj, iterator.next().mCurrentSelectFilter, p0);
             }
             if (!TextUtils.x(this.i())) {
                obj = obj+","+this.i();
             }
             return obj;
          }
       }else {
          iterator = this.i.values().iterator();
          while (iterator.hasNext()) {
             this.a(obj, iterator.next(), p0);
          }
          if (this.l() != null && (!TextUtils.x(this.l().mName) && !p0)) {
             obj = obj+","+this.l().mName;
          }
          return obj;
       }
    }
    public SearchFilter l(){
       return this.l;
    }
    public boolean m(){
       Object obj = PatchProxy.apply(null, this, a1.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!q.f(this.a) || !q.f(this.c))? true: false;
       return b;
    }
    public boolean n(SearchFilter p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a1.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return ("700").equals(p0.mFilterType);
    }
    public boolean o(){
       Object obj = PatchProxy.apply(null, this, a1.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.u("700") || this.u("900"))? true: false;
       return b;
    }
    public boolean p(){
       a1 obj = PatchProxy.apply(null, this, a1.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       boolean b = (obj != null && !TextUtils.x(obj.mCityName))? true: false;
       return b;
    }
    public boolean q(){
       Object obj = PatchProxy.apply(null, this, a1.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.u("702");
    }
    public boolean r(){
       Object obj = PatchProxy.apply(null, this, a1.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.u("701");
    }
    public boolean s(){
       Iterator obj = PatchProxy.apply(null, this, a1.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          Map$Entry uEntry = obj.next();
          if (!this.i.get(uEntry.getKey()).equals(this.j.get(uEntry.getKey()))) {
             break ;
          }
       }
       return false;
    }
    public boolean t(){
       a1 obj = PatchProxy.apply(null, this, a1.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!q.f(this.c)) {
          int i = 0;
          while (true) {
             if (i >= this.c.size()) {
                return 0;
             }
             if (this.c.get(i) != null && (q.f(this.c.get(i).mFilters) || (this.c.get(i).mFilters.get(0) != null && this.c.get(i).mFilters.get(0).mIsSelect == null))) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return true;
       }else {
          obj = this.i;
          if (obj == null || !obj.size()) {
             return 0;
          }
          return (this.o() ^ true);
       }
    }
    public final boolean u(String p0){
       a1 obj = PatchProxy.applyOneRefs(p0, this, a1.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = false;
       if (obj != null && !obj.isEmpty()) {
          if (!p0.equals("700")) {
             return this.d.containsKey(p0);
          }
          if (this.d.size() == 1 && this.d.containsKey(p0)) {
             b = true;
          }
          return b;
       }else {
          Iterator iterator = this.i.entrySet().iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return b;
             }
             Map$Entry uEntry = iterator.next();
             if (this.i.get(uEntry.getKey()) != null && p0.equals(this.i.get(uEntry.getKey()).mFilterType)) {
                break ;
             }
          }
          return true;
       }
    }
    public void v(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a1.class, "10")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       this.b = p0;
       this.f = null;
       return;
    }
    public void w(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a1.class, "4")) {
          return;
       }
       this.a = p0;
       this.i.clear();
       this.j.clear();
       this.l = null;
       if (q.f(this.a)) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          List list = iterator.next();
          Iterator iterator1 = list.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                SearchFilter searchFilter = iterator1.next();
                if (searchFilter.mIsSelect != null) {
                   this.i.put(list, searchFilter);
                }
             }else {
                continue ;
             }
          }
          return;
       }
    }
    public void x(boolean p0){
       this.m = p0;
    }
    public void y(JsSelectCityResult$SelectCityData p0){
       this.f = p0;
    }
    public void z(List p0,SearchFilter p1){
       a1 uoa1 = a1.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa1, "13")) {
          return;
       }
       Iterator iterator = this.i.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          List key = uEntry.getKey();
          this.j.put(key, uEntry.getValue());
       }
       if (this.i.get(p0) != null) {
          this.i.get(p0).mIsSelect = false;
       }
       p1.mIsSelect = true;
       this.i.put(p0, p1);
       a1 ti = this.i;
       if (!PatchProxy.applyVoidOneRefs(ti, this, uoa1, "3") && !this.h.isEmpty()) {
          Iterator iterator1 = this.h.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().a(ti);
          }
       }
       return;
    }
}
