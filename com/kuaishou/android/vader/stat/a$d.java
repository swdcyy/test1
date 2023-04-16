package com.kuaishou.android.vader.stat.a$d;
import com.kuaishou.android.vader.stat.ValueOrException;
import com.kuaishou.android.vader.stat.a$a;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.UnsupportedOperationException;
import com.kuaishou.android.vader.stat.ValueOrException$Type;
import java.lang.Enum;

public abstract class a$d extends ValueOrException	// class@00072a
{

    public void a$d(){
       super();
    }
    public void a$d(a$a p0){
       super();
    }
    public Exception a(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException(this.b().toString());
    }
    public Object e(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException(this.b().toString());
    }
}
