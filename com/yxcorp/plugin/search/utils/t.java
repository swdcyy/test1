package com.yxcorp.plugin.search.utils.t;
import com.yxcorp.plugin.search.widget.SearchDanmakuView$d;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper$b;
import crd.b;
import lnc.b9;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import brd.t;
import nfd.e2;
import erd.o;
import t45.d;
import brd.z;
import nfd.z1;
import com.yxcorp.plugin.search.utils.w;
import erd.g;

public final class t implements SearchDanmakuView$d	// class@0007b3
{
    public final SearchLiveDanmakuHelper a;

    public void t(SearchLiveDanmakuHelper p0){
       this.a = p0;
    }
    public final void a(int p0){
       t ta = this.a;
       Objects.requireNonNull(ta);
       SearchLiveDanmakuHelper searchLiveDa = SearchLiveDanmakuHelper.class;
       if (PatchProxy.isSupport(searchLiveDa) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, searchLiveDa, "7") && (ta.m != null || (ta.n < (ta.j - 1) && (ta.d.e() - p0) <= 10)))) {
          b9.a(ta.h);
          ta.m = true;
          ta.h = t.timer(((ta.l + ta.i) - SystemClock.elapsedRealtime()), TimeUnit.MILLISECONDS).flatMap(new e2(ta)).observeOn(d.a).subscribe(new z1(ta), w.b);
       }
    label_0065 :
       return;
    }
}
