package com.yxcorp.gifshow.relation.select.search.SearchUsersFragment$b;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.relation.select.search.SearchUsersFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.refresh.RefreshLayout;

public class SearchUsersFragment$b extends f	// class@0019bd
{
    public final SearchUsersFragment l;

    public void SearchUsersFragment$b(SearchUsersFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, SearchUsersFragment$b.class, "1")) {
          return;
       }
       this.x();
       View view = this.J0();
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.i(a1.r(R.string.arg_RES_7f104628, this.l.H));
       uoa.a(view);
       this.a.K(view);
       return;
    }
}
