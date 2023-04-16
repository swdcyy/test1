package com.yxcorp.gifshow.relation.select.half.HalfSearchUsersFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.relation.select.half.HalfSearchUsersFragment;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.relation.select.search.SearchUsersFragment;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.os.IBinder;
import com.yxcorp.utility.n;
import rbc.a;

public class HalfSearchUsersFragment$a extends RecyclerView$r	// class@001999
{
    public final View a;
    public final HalfSearchUsersFragment b;

    public void HalfSearchUsersFragment$a(HalfSearchUsersFragment p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(HalfSearchUsersFragment$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HalfSearchUsersFragment$a.class, "1")) {
          return;
       }
       if (this.b.uh() && (p1 == 1 || p1 == 2)) {
          HalfSearchUsersFragment$a tb = this.b;
          if (tb.F != null) {
             n.E(tb.getContext(), this.a.getWindowToken());
             this.b.F.Q2();
          }
       }
       return;
    }
}
