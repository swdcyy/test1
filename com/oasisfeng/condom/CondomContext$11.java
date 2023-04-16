package com.oasisfeng.condom.CondomContext$11;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomContext;
import android.content.Intent;
import android.os.UserHandle;

public class CondomContext$11 extends CondomCore$WrappedProcedure	// class@000a5f
{
    public final Intent a;
    public final UserHandle b;
    public final CondomContext c;

    public void CondomContext$11(CondomContext p0,Intent p1,UserHandle p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void b(){
       CondomContext.access$1001(this.c, this.a, this.b);
    }
}
