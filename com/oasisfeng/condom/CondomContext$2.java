package com.oasisfeng.condom.CondomContext$2;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomContext;
import android.content.Intent;
import java.lang.Object;
import android.content.ComponentName;

public class CondomContext$2 implements CondomCore$WrappedValueProcedure	// class@000a64
{
    public final Intent a;
    public final CondomContext b;

    public void CondomContext$2(CondomContext p0,Intent p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object a(){
       return CondomContext.access$101(this.b, this.a);
    }
}
