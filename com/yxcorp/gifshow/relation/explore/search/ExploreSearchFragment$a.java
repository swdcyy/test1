package com.yxcorp.gifshow.relation.explore.search.ExploreSearchFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;

public class ExploreSearchFragment$a extends RecyclerView$r	// class@00186e
{
    public final ExploreSearchFragment a;

    public void ExploreSearchFragment$a(ExploreSearchFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(ExploreSearchFragment$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ExploreSearchFragment$a.class, "1")) {
          return;
       }
       if (!p1) {
          n.C(this.a.getActivity());
       }
       return;
    }
}
