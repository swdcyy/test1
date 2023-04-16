package com.kuaishou.bowl.core.trigger.a$b;
import erd.g;
import com.kuaishou.bowl.core.trigger.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import pv.a;
import java.util.Map;
import nv.c;

public class a$b implements g	// class@0011b1
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          String[] stringArray = new String[]{"msg"};
          String[] stringArray1 = new String[]{p0.getMessage()};
          c.d("MarketingTrigger excute error", a.a(stringArray, stringArray1));
       }
       return;
    }
}
