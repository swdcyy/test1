package com.kuaishou.android.vader.stat.a;
import java.lang.Object;
import java.lang.Exception;
import com.kuaishou.android.vader.stat.ValueOrException;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.android.vader.stat.a$b;
import com.kuaishou.android.vader.stat.a$c;

public final class a	// class@00072b
{

    public void a(){
       super();
    }
    public static ValueOrException a(Exception p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       return new a$b(p0);
    }
    public static ValueOrException b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       return new a$c(p0);
    }
}
