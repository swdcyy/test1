package com.kuaishou.android.vader.stat.a$b;
import com.kuaishou.android.vader.stat.a$d;
import java.lang.Exception;
import com.kuaishou.android.vader.stat.a$a;
import com.kuaishou.android.vader.stat.ValueOrException$Type;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.vader.stat.ValueOrException;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$b extends a$d	// class@000f81
{
    public final Exception a;

    public void a$b(Exception p0){
       super(null);
       this.a = p0;
    }
    public Exception a(){
       return this.a;
    }
    public ValueOrException$Type b(){
       return ValueOrException$Type.EXCEPTION;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof ValueOrException && (this.b() == p0.b() && this.a.equals(p0.a()))) {
          b = true;
       }
    label_0031 :
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.hashCode();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ValueOrException{exception="+this.a+"}";
    }
}
