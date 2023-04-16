package com.yxcorp.gifshow.homepage.krn.c;
import erd.g;
import com.yxcorp.gifshow.homepage.krn.SchoolDanmakuView;
import java.lang.Object;
import com.yxcorp.gifshow.homepage.krn.network.SchoolDanmakuResponse;
import java.util.Objects;
import com.yxcorp.gifshow.homepage.krn.b;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import hta.d;
import com.yxcorp.gifshow.homepage.krn.d;

public final class c implements g	// class@001768
{
    public final SchoolDanmakuView b;

    public void c(SchoolDanmakuView p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          tb.setAdapter(new b(p0.mDanmakuDataList, tb.f));
          if (!PatchProxy.applyVoid(null, tb, SchoolDanmakuView.class, "4")) {
             p0 = tb.b;
             if (p0 != null) {
                p0.dispose();
             }
             tb.scrollBy(0, 0);
             tb.b = t.interval(1, TimeUnit.SECONDS).observeOn(a.c()).subscribe(new d(tb), d.b);
          }
       }
       return;
    }
}
