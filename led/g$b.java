package led.g$b;
import qvb.q;
import led.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.p;
import gbd.u;
import e7d.h;
import com.yxcorp.plugin.search.result.SubTabItem;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import com.yxcorp.plugin.search.response.BaseSearchResultResponse;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import e7d.f;
import java.util.List;
import java.lang.Integer;
import android.view.ViewGroup;
import java.util.Objects;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultAggregateAladdinFragment;
import e7d.a;
import com.google.android.material.appbar.AppBarLayout;

public class g$b implements q	// class@001c20
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       g$b uob = g$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "4")) {
          return;
       }
       if (p0 && this.b.W8()) {
          this.b.V8();
       }
       p.a(this, p0, p1);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(g$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, g$b.class, "2")) {
          return;
       }
       if (p0 && (this.b.q.F() != null && this.b.q.F().a() == null)) {
          this.b.V8();
       }
    label_0038 :
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       g$b uob = g$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.b.r.Ac().setRefreshing(false);
       this.b.r.Ac().setTargetOrRefreshViewOffsetY((- this.b.r.Ac().getTargetOrRefreshViewOffset()));
       return;
    }
    public void v2(boolean p0,boolean p1){
       g$b uob = g$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       SearchResultResponse searchResult = this.b.r.q().L0();
       BaseSearchResultResponse mSubTabItems = searchResult.mSubTabItems;
       this.b.t = mSubTabItems;
       boolean b = q.f(mSubTabItems);
       if (!b) {
          SearchResultResponse mExtParams = searchResult.mExtParams;
          if (mExtParams != null) {
             this.b.v = mExtParams.mSubtagWithPic;
          }
          if (this.b.p.Bg().getMinorKeyword() == null) {
             this.b.p.Bg().setMinorKeyword(this.b.t.get(0));
             this.b.s.setTag(Integer.valueOf(0));
          }
          uob = this.b;
          BaseSearchResultResponse mUssid = searchResult.mUssid;
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(mUssid, uob, g.class, "4") && uob.r.kc() == SearchPage.AGGREGATE) {
             g r = uob.r;
             if (r instanceof SearchResultAggregateAladdinFragment) {
                r.q1 = mUssid;
             }else {
                r.b1.v(mUssid);
             }
          }
          this.b.X8();
       }
       if (p0) {
          g x = this.b.x;
          if (x != null) {
             x.p(true, 0);
          }
       }
       if (this.b.r.kc() == SearchPage.AGGREGATE && searchResult.mRecoPymkFlag != null) {
          this.b.V8();
       }
       return;
    }
}
