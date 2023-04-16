package com.yxcorp.gifshow.map.search.SearchFragment$mSearchHistoryItemCallback$1;
import com.kwai.feature.component.impl.ISearchHistoryItemClickCallback;
import com.yxcorp.gifshow.map.search.SearchFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kwai.feature.component.searchhistory.b;
import java.util.Objects;
import g06.f;
import hka.l;
import com.yxcorp.gifshow.util.rx.RxBus;
import d3d.a;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import java.lang.Integer;
import l6b.a;
import g6b.c;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import com.kuaishou.android.model.mix.Location;
import com.yxcorp.gifshow.map.PhotoSource;
import b6b.q;
import com.yxcorp.map.search.SearchEditorLayout;

public final class SearchFragment$mSearchHistoryItemCallback$1 implements ISearchHistoryItemClickCallback	// class@001ccf
{
    public final SearchFragment this$0;

    public void SearchFragment$mSearchHistoryItemCallback$1(SearchFragment p0){
       this.this$0 = p0;
       super();
    }
    public void onClearAllClick(){
       if (PatchProxy.applyVoid(null, this, SearchFragment$mSearchHistoryItemCallback$1.class, "1")) {
          return;
       }
       SearchFragment k = this.this$0.k;
       Objects.requireNonNull(k, "null cannot be cast to non-null type com.kwai.feature.component.searchhistory.SearchHistoryAble");
       b.a(0x4abd6a99).a(k.K());
       SearchFragment k1 = this.this$0.k;
       if (k1 instanceof l) {
          Objects.requireNonNull(k1, "null cannot be cast to non-null type com.yxcorp.gifshow.fragment.component.Refreshable");
          k1.a();
       }
       RxBus.f.b(new a());
       return;
    }
    public void onItemDeleteBtnClick(int p0,String p1){
    }
    public void onItemKeywordClick(int p0,SearchHistoryData p1,String p2){
       if (PatchProxy.isSupport(SearchFragment$mSearchHistoryItemCallback$1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, SearchFragment$mSearchHistoryItemCallback$1.class, "2")) {
          return;
       }
       if (p1 != null) {
          SearchHistoryData mLocation = p1.mLocation;
          if (mLocation != null) {
             c uoc = SearchFragment.ch(this.this$0).a();
             if (uoc != null) {
                uoc.d("SEARCH");
             }
             MapCenterInfo mapCenterInf = new MapCenterInfo(mLocation.latitude, mLocation.longitude, PhotoSource.FROM_SEARCH, q.d.b());
             uoc.mPoiName = mLocation.mTitle;
             c uoc1 = SearchFragment.ch(this.this$0).a();
             if (uoc1 != null) {
                uoc1.c(uoc, "SEARCH");
             }
          }
       }
       SearchFragment l = this.this$0.l;
       if (l != null) {
          l.e();
       }
       return;
    }
}
