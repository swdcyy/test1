package com.oasisfeng.condom.CondomContext$1;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomContext;
import android.content.Intent;
import android.content.ServiceConnection;
import java.lang.Object;
import java.lang.Boolean;

public class CondomContext$1 implements CondomCore$WrappedValueProcedure	// class@000a63
{
    public final Intent a;
    public final ServiceConnection b;
    public final int c;
    public final CondomContext d;

    public void CondomContext$1(CondomContext p0,Intent p1,ServiceConnection p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public Object a(){
       return Boolean.valueOf(CondomContext.access$001(this.d, this.a, this.b, this.c));
    }
}
