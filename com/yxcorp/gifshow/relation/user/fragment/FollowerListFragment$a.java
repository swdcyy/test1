package com.yxcorp.gifshow.relation.user.fragment.FollowerListFragment$a;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.relation.user.fragment.FollowerListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.refresh.RefreshLayout;

public class FollowerListFragment$a extends f	// class@0019fa
{
    public final FollowerListFragment l;

    public void FollowerListFragment$a(FollowerListFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, FollowerListFragment$a.class, "1")) {
          return;
       }
       this.j();
       View view = this.J0();
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.h(R.string.arg_RES_7f1014c0);
       uoa.k(R.drawable.arg_RES_7f0805f6);
       uoa.a(view);
       this.a.K(view);
       return;
    }
}
