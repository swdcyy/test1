package com.yxcorp.gifshow.relation.explore.fragment.b;
import lnc.c3$a;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import dac.i;
import java.lang.Runnable;

public final class b implements c3$a	// class@001810
{
    public final ExploreFriendContactFragment a;

    public void b(ExploreFriendContactFragment p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       p0.postDelayed(new i(ta), 300);
    }
}
