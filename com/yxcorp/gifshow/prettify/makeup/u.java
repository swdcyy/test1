package com.yxcorp.gifshow.prettify.makeup.u;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.makeup.v;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import f1c.d;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import f1c.s0;
import android.view.View;

public final class u implements Runnable	// class@001198
{
    public final v b;

    public void u(v p0){
       this.b = p0;
    }
    public final void run(){
       u tb = this.b;
       tb.p(tb.f.n().getFilterItemList(), new s0(tb));
    }
}
