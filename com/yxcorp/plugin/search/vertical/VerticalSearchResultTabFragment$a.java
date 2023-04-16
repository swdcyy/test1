package com.yxcorp.plugin.search.vertical.VerticalSearchResultTabFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.plugin.search.vertical.VerticalSearchResultTabFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import x6d.x;
import gbd.v;
import com.yxcorp.plugin.search.b;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import cdd.k;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.SearchSource;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import com.yxcorp.plugin.search.result.SearchKeywordContext;

public class VerticalSearchResultTabFragment$a implements ViewPager$i	// class@0007ba
{
    public final VerticalSearchResultTabFragment b;

    public void VerticalSearchResultTabFragment$a(VerticalSearchResultTabFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       VerticalSearchResultTabFragment$a uoa = VerticalSearchResultTabFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       if (uoa.G != p0) {
          uoa.G = p0;
          x ox = uoa.D.get(p0);
          this.b.I.d(ox);
          int i = 1;
          this.b.Rh(i, ox);
          this.b.E.J.onNext(Integer.valueOf(ox.d()));
          if (this.b.F.get(Integer.valueOf(p0)) == null || !this.b.F.get(Integer.valueOf(p0)).booleanValue()) {
             this.b.F.put(Integer.valueOf(p0), Boolean.TRUE);
             SearchResultFragment searchResult = this.b.v.F(p0);
             searchResult.bh(i);
             SearchSource vERTICAL_TAB = SearchSource.VERTICAL_TAB;
             this.b.E.r = vERTICAL_TAB;
             searchResult.Ac().setVisibility(0);
             searchResult.di(this.b.H, vERTICAL_TAB, null);
          }
       }
       return;
    }
}
