package com.yxcorp.gifshow.easteregg.core.FireworkScriptGroupConverter$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import vfa.a;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class FireworkScriptGroupConverter$a implements Comparator	// class@001aca
{

    public void FireworkScriptGroupConverter$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FireworkScriptGroupConverter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Long.valueOf(p0.a), Long.valueOf(p1.a));
    }
}
