package com.kuaishou.android.vader.type.c;
import com.kuaishou.android.vader.type.b;
import dr.c;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Field;
import com.kuaishou.android.vader.type.Operator;

public final class c implements b	// class@000f87
{
    public final MessageNano a;
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(MessageNano p0){
       super();
       this.a = p0;
    }
    public b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Field field = this.a.getClass().getField(p0);
       field.setAccessible(true);
       return c.b.a(field.get(this.a));
    }
    public boolean b(Operator p0,String p1){
       return true;
    }
}
