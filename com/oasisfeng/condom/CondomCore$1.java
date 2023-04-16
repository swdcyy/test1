package com.oasisfeng.condom.CondomCore$1;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedureThrows;
import com.oasisfeng.condom.CondomCore;
import android.content.Intent;
import com.oasisfeng.condom.CondomCore$Function;
import com.oasisfeng.condom.OutboundType;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Iterator;

public class CondomCore$1 implements CondomCore$WrappedValueProcedureThrows	// class@000a6e
{
    public final CondomCore$WrappedValueProcedureThrows a;
    public final Intent b;
    public final CondomCore$Function c;
    public final OutboundType d;
    public final CondomCore e;

    public void CondomCore$1(CondomCore p0,CondomCore$WrappedValueProcedureThrows p1,Intent p2,CondomCore$Function p3,OutboundType p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public Object a(){
       List list = this.a.a();
       if (list != null && this.e.mOutboundJudge != null) {
          CondomCore$1 tb = this.b;
          if (tb == null || CondomCore.getTargetPackage(tb) == null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                String str = this.c.apply(iterator.next());
                if (str != null && this.e.shouldBlockRequestTarget(this.d, this.b, str)) {
                   iterator.remove();
                }
             }
          }
       }
       return list;
    }
}
