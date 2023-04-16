package com.yxcorp.gifshow.trending.list.TrendingSubListFragment$a;
import ykc.b0;
import com.yxcorp.gifshow.trending.list.TrendingSubListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.f;

public class TrendingSubListFragment$a extends b0	// class@001daf
{
    public final TrendingSubListFragment l;

    public void TrendingSubListFragment$a(TrendingSubListFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, TrendingSubListFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.k(R.drawable.common_emptystate_nocontent);
       obj.h(R.string.arg_RES_7f104da5);
       return obj;
    }
}
