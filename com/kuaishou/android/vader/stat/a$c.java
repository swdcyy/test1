package com.kuaishou.android.vader.stat.a$c;
import com.kuaishou.android.vader.stat.a$d;
import java.lang.Object;
import com.kuaishou.android.vader.stat.a$a;
import com.kuaishou.android.vader.stat.ValueOrException$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.vader.stat.ValueOrException;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$c extends a$d	// class@000729
{
    public final Object a;

    public void a$c(Object p0){
       super(null);
       this.a = p0;
    }
    public ValueOrException$Type b(){
       return ValueOrException$Type.VALUE;
    }
    public Object e(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof ValueOrException && (this.b() == p0.b() && this.a.equals(p0.e()))) {
          b = true;
       }
    label_0031 :
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.hashCode();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ValueOrException{value="+this.a+"}";
    }
}
