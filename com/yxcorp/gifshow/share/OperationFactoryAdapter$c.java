package com.yxcorp.gifshow.share.OperationFactoryAdapter$c;
import java.util.Comparator;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Comparable;
import xrd.b;

public final class OperationFactoryAdapter$c implements Comparator	// class@001b56
{
    public final l b;

    public void OperationFactoryAdapter$c(l p0){
       this.b = p0;
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, OperationFactoryAdapter$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(this.b.invoke(p0), this.b.invoke(p1));
    }
}
