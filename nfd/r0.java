package nfd.r0;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import nfd.r0$a;
import com.yxcorp.plugin.search.entity.SearchFilter;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class r0	// class@001dfc
{
    public List a;
    public HashSet b;
    public List c;
    public HashSet d;
    public HashSet e;

    public void r0(){
       super();
       this.d = new HashSet();
       this.e = new HashSet();
       this.b = new HashSet();
    }
    public void a(){
       r0 or0 = r0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or0, "11")) {
          return;
       }
       this.i(objArray);
       this.c = objArray;
       this.b.clear();
       if (!PatchProxy.applyVoid(objArray, this, or0, "5") && !this.e.isEmpty()) {
          Iterator iterator = this.e.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       return;
    }
    public List b(){
       return this.a;
    }
    public List c(){
       return this.c;
    }
    public SearchFilter d(SearchFilter p0){
       SearchFilter searchFilter;
       Object obj = PatchProxy.applyOneRefs(p0, this, r0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       Iterator iterator = this.b.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          searchFilter = iterator.next();
          if ((searchFilter.mFilterType).equals(p0.mFilterType)) {
             break ;
          }
       }
       return searchFilter;
    }
    public String e(){
       StringBuilder obj = PatchProxy.apply(null, this, r0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          SearchFilter searchFilter = iterator.next();
          if (searchFilter.mIsSelect != null) {
             if (obj.length()) {
                obj = obj+",";
             }
             if (!q.f(searchFilter.mOrderFilterTypes)) {
                SearchFilter mSortFilterI = searchFilter.mSortFilterIndex;
                if (mSortFilterI > -1) {
                   obj = obj+searchFilter.mOrderFilterTypes.get(mSortFilterI);
                }
             }
             obj = obj+searchFilter.mFilterType;
          }
       }
       return obj;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, r0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.a) ^ 0x01);
    }
    public boolean g(SearchFilter p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       Iterator iterator = this.b.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          SearchFilter searchFilter = iterator.next();
          if (!TextUtils.x(searchFilter.mFilterType) && (!TextUtils.x(p0.mFilterType) && (searchFilter.mFilterType).equals(p0.mFilterType))) {
             i = 1;
          }
       }
       if (this.b.contains(p0) || i) {
          b = true;
       }
       return b;
    }
    public boolean h(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r0 or0 = r0.class;
       Object obj = PatchProxy.apply(null, this, or0, "20");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       SearchFilter obj1 = PatchProxy.applyOneRefs("1300", this, or0, "21");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Iterator iterator = this.b.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj1 = iterator.next();
                if (obj1 != null && "1300".equals(obj1.mFilterType)) {
                   b = true;
                   break ;
                }
             }else {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public void i(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r0.class, "8")) {
          return;
       }
       this.a = p0;
       this.b.clear();
       if (q.f(this.a)) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().iterator();
          while (iterator1.hasNext()) {
             SearchFilter searchFilter = iterator1.next();
             if (searchFilter != null && searchFilter.mIsSelect != null) {
                this.b.add(searchFilter);
             }
          }
       }
       return;
    }
    public void j(List p0){
       this.c = p0;
    }
}
