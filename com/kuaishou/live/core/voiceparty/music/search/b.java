package com.kuaishou.live.core.voiceparty.music.search.b;
import qvb.f;
import java.lang.Object;
import wkd.b;
import com.kwai.feature.component.searchhistory.b;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wt2.d;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import java.util.List;
import com.kwai.feature.component.searchhistory.SearchHistoryResponse;
import la6.b;
import com.kwai.feature.component.searchhistory.SearchHistoryData;

public class b extends f	// class@0017e5
{
    public boolean p;
    public int q;
    public final b r;

    public void b(){
       super();
       this.r = b.a(0x4abd6a99);
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new d(this)).subscribeOn(d.c).observeOn(d.a);
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(SearchHistoryResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       for (int i = 0; i < p1.size(); i++) {
          p1.get(i).mPosition = i;
       }
       return;
    }
    public void i2(boolean p0){
       this.p = p0;
    }
}
