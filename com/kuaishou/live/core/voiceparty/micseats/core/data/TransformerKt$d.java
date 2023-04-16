package com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$d;
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
import java.util.Iterator;
import java.lang.Iterable;
import ss2.d;

public final class TransformerKt$d implements o	// class@001581
{
    public static final TransformerKt$d b;

    static {
       TransformerKt$d.b = new TransformerKt$d();
    }
    public void TransformerKt$d(){
       super();
    }
    public Object apply(Object p0){
       l ol = PatchProxy.applyOneRefs(p0, this, TransformerKt$d.class, "1");
       if (ol != PatchProxyResult.class) {
       }else {
          a.p(p0, "<name for destructuring parameter 0>");
          int i = p0.b();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.a().iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = (!obj.getId())? 1: null;
             if (!obj1) {
                uArrayList.add(obj);
             }
          }
          ol = new l(uArrayList, i);
       }
       return ol;
    }
}
