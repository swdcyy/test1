package ck0.a;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import fk0.a;
import android.os.Bundle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.LinkedHashMap;
import lj0.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public final class a extends KrnLogCommonParams	// class@0004d0
{
    public Map mDegradeInfo;

    public void a(a p0,Bundle p1){
       a.p(p0, "bundleMeta");
       a.p(p1, "degradeInfo");
       super(p0, null, 2, null);
       this.mDegradeInfo = new LinkedHashMap();
       this.h(p1);
    }
    public void a(c p0,Bundle p1){
       a.p(p1, "degradeInfo");
       super(p0, null, 2, null);
       this.mDegradeInfo = new LinkedHashMap();
       this.h(p1);
    }
    public final void h(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          a.o(str, "key");
          Object obj = p0.get(str);
          a.m(obj);
          a.o(obj, "degradeInfo[key]!!");
          this.mDegradeInfo.put(str, obj);
       }
       return;
    }
}
