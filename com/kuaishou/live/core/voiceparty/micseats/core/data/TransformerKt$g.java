package com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$g;
import erd.o;
import java.lang.Object;
import ss2.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ss2.d;
import ts2.j$c;
import ts2.j;

public final class TransformerKt$g implements o	// class@001584
{
    public final int b;

    public void TransformerKt$g(int p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       l ol = PatchProxy.applyOneRefs(p0, this, TransformerKt$g.class, "1");
       if (ol != PatchProxyResult.class) {
       }else {
          a.p(p0, "<name for destructuring parameter 0>");
          List list = p0.a();
          int i = p0.b();
          TransformerKt$g tb = this.b;
          if (list.size() < tb) {
             ArrayList uArrayList = new ArrayList(tb);
             for (int i1 = 0; i1 < tb; i1 = i1 + 1) {
                d uod = CollectionsKt___CollectionsKt.F2(list, i1);
                if (uod == null) {
                   uod = new d(i1, false, j$c.a);
                }
                uArrayList.add(uod);
             }
             list = uArrayList;
          }
          ol = new l(list, i);
       }
       return ol;
    }
}
