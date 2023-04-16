package com.kwai.component.logging.controller.KsLogConfig$a;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.component.logging.controller.KsLogConfig$InsertEvent;
import kc5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.kwai.component.logging.controller.KsLogConfig;

public class KsLogConfig$a	// class@0009b1
{
    public HashMap a;
    public boolean b;

    public void KsLogConfig$a(){
       super();
       this.a = new HashMap();
       this.b = false;
    }
    public KsLogConfig$a a(KsLogConfig$InsertEvent p0,c[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KsLogConfig$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(p0, new ArrayList(Arrays.asList(p1)));
       return this;
    }
    public KsLogConfig b(){
       Object obj = PatchProxy.apply(null, this, KsLogConfig$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KsLogConfig(this);
    }
    public KsLogConfig$a c(boolean p0){
       this.b = p0;
       return this;
    }
}
