package com.kuaishou.android.vader.type.a;
import com.kuaishou.android.vader.type.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.kuaishou.android.vader.type.Operator;
import java.lang.Boolean;
import java.lang.UnsupportedOperationException;

public final class a implements b	// class@000f85
{
    public final boolean a;

    public void a(boolean p0){
       super();
       this.a = p0;
    }
    public b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new IllegalStateException("BoolValue does not contain any field. Request field: "+p0);
    }
    public boolean b(Operator p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == Operator.eq) {
          return (String.valueOf(this.a)).equalsIgnoreCase(p1);
       }
       throw new UnsupportedOperationException("Unsupported operator : "+p0);
    }
}
