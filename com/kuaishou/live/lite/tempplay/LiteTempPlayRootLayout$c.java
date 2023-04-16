package com.kuaishou.live.lite.tempplay.LiteTempPlayRootLayout$c;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.lite.tempplay.LiteTempPlayRootLayout$b;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class LiteTempPlayRootLayout$c implements Comparator	// class@000b7c
{

    public void LiteTempPlayRootLayout$c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiteTempPlayRootLayout$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p0.a()), Integer.valueOf(p1.a()));
    }
}
