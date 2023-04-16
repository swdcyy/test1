package com.kuaishou.android.vader.stat.ValueOrException;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.vader.stat.a;
import com.kuaishou.android.vader.stat.ValueOrException$Type;

public abstract class ValueOrException	// class@000726
{

    public void ValueOrException(){
       super();
    }
    public static ValueOrException c(Exception p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ValueOrException.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0);
    }
    public static ValueOrException d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ValueOrException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(p0);
    }
    public abstract Exception a();
    public abstract ValueOrException$Type b();
    public abstract Object e();
}
