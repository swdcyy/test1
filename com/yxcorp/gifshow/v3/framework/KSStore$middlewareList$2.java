package com.yxcorp.gifshow.v3.framework.KSStore$middlewareList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Iterator;
import java.lang.Iterable;

public final class KSStore$middlewareList$2 extends Lambda implements a	// class@001524
{
    public final c[] $_middlewareList;
    public final KSStore this$0;

    public void KSStore$middlewareList$2(KSStore p0,c[] p1){
       this.this$0 = p0;
       this.$_middlewareList = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List obj = PatchProxy.apply(null, this, KSStore$middlewareList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ArraysKt___ArraysKt.uy(this.$_middlewareList);
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          iterator.next().a = this.this$0;
       }
       return obj;
    }
}
