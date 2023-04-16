package com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$c;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import c1c.a;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class FilterStateManager$c implements Comparator	// class@001148
{

    public void FilterStateManager$c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FilterStateManager$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p1.e()), Integer.valueOf(p0.e()));
    }
}
