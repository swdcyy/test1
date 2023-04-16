package com.kwai.feature.component.searchhistory.c;
import qvb.f;
import java.lang.String;
import xl8.b;
import java.lang.Boolean;
import java.lang.Object;
import wkd.b;
import com.kwai.feature.component.searchhistory.b;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g06.j;
import java.util.concurrent.Callable;
import java.util.List;
import com.kwai.feature.component.searchhistory.SearchHistoryResponse;
import la6.b;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import java.util.ArrayList;
import java.util.Collection;
import j06.d;

public class c extends f	// class@0012a1
{
    public final b p;
    public String q;
    public String r;
    public b s;

    public void c(String p0){
       super();
       this.s = new b(Boolean.FALSE);
       this.q = p0;
       this.p = b.a(0x4abd6a99);
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new j(this));
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(SearchHistoryResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       super.d2(p0, p1);
       int i = 0;
       for (int i1 = 0; i1 < p1.size(); i1 = i1 + 1) {
          p1.get(i1).mPosition = i1;
       }
       if (p1.size() > 10) {
          p1.clear();
          p1.addAll(new ArrayList(p1.subList(i, 10)));
       }
       if (!PatchProxy.applyVoid(null, this, c.class, "2")) {
          this.r = d.a("history");
       }
       return;
    }
}
