package com.yxcorp.gifshow.follow.stagger.container.b;
import lnc.l$b;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView;
import mia.g;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class b implements l$b	// class@001157
{
    public final HomeFollowFragment a;

    public void b(HomeFollowFragment p0){
       this.a = p0;
    }
    public final void a(RecyclerView$Adapter p0){
       b ta = this.a;
       if (ta.g7().R0()) {
          ta.h0().post(new g(ta));
       }
       return;
    }
}
