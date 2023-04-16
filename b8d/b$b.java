package b8d.b$b;
import qvb.q;
import b8d.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import nfd.r0;
import java.util.List;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import nfd.x3;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.SearchSource;
import e7d.a;
import java.util.Collection;
import ekd.q;
import qvb.p;
import qvb.i;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import nfd.b1;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.yxcorp.plugin.search.response.SearchResultExtParams;

public class b$b implements q	// class@0003b5
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, b$b.class, "3")) {
          return;
       }
       if (!p0) {
          return;
       }
       this.b.z.a();
       b$b tb = this.b;
       tb.A = null;
       b c = tb.C;
       if (c != null) {
          c.clear();
       }
       x3.a(this.b.q.g7(), -1);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       List list = null;
       if (p0) {
          if (this.b.q.b1.m() == SearchSource.FILTER_SECOND || this.b.q.b1.m() == SearchSource.SEARCH_FILTER) {
             if (q.f(this.b.z.c())) {
                uob = this.b;
                uob.B = false;
                uob.A = list;
             }else {
                this.b.B = true;
             }
          }else {
             this.b.z.j(list);
             uob = this.b;
             uob.B = false;
             uob.V8(false);
          }
       }
       if (p0) {
          b$b tb = this.b;
          if (tb.q.X == null) {
             tb.z.a();
             tb = this.b;
             tb.A = list;
             b c = tb.C;
             if (c != null) {
                c.clear();
             }
             x3.a(this.b.q.g7(), -1);
          }
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "2")) {
          return;
       }
       if (p0) {
          b$b tb = this.b;
          if (tb.z != null) {
             SearchResultResponse searchResult = tb.q.q().L0();
             if (!q.f(this.b.C)) {
                b$b tb1 = this.b;
                b1.f(tb1.C, tb1.q, 0);
                tb1 = this.b;
                b1.i(tb1.C, searchResult, tb1.p.f());
             }
             if (this.b.q.b1.m() == SearchSource.FILTER_SECOND || this.b.q.b1.m() == SearchSource.SEARCH_FILTER) {
                SearchResultResponse mExtParams = searchResult.mExtParams;
                if (mExtParams != null && (!q.f(mExtParams.mSecondFilters) && !q.f(this.b.z.c()))) {
                   mExtParams.A = searchResult.mExtParams.mSecondFilters;
                }
             }
          }
       }
    label_008d :
       return;
    }
}
