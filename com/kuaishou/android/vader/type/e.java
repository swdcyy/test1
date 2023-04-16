package com.kuaishou.android.vader.type.e;
import com.kuaishou.android.vader.type.b;
import java.lang.Number;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.kuaishou.android.vader.type.Operator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Double;
import java.lang.Math;
import java.lang.UnsupportedOperationException;

public final class e implements b	// class@000f89
{
    public final Number a;

    public void e(Number p0){
       super();
       this.a = p0;
    }
    public b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new IllegalStateException("NumberValue does not contain any field. Request field: "+p0);
    }
    public boolean b(Operator p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != Operator.eq) {
          throw new UnsupportedOperationException("Unsupported operator: "+p0);
       }
       Class class = this.a.getClass();
       boolean b = true;
       if (class != Integer.class && (class != Long.class && (class == Byte.class || class == Short.class))) {
          if (this.a.longValue() - Long.parseLong(p1)) {
             b = false;
          }
          return b;
       }else if(Math.abs((this.a.doubleValue() - Double.valueOf(Double.parseDouble(p1)).doubleValue())) - 0x3ee4f8b580000000 < 0){
          b = false;
       }
       return b;
    }
}
