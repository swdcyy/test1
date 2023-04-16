package com.oasisfeng.condom.CondomContext$6;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomContext;
import android.content.Intent;
import android.os.UserHandle;
import java.lang.String;

public class CondomContext$6 extends CondomCore$WrappedProcedure	// class@000a68
{
    public final Intent a;
    public final UserHandle b;
    public final String c;
    public final CondomContext d;

    public void CondomContext$6(CondomContext p0,Intent p1,UserHandle p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void b(){
       CondomContext.access$501(this.d, this.a, this.b, this.c);
    }
}
