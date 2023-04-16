package com.oasisfeng.condom.CondomContext$4;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomContext;
import android.content.Intent;
import java.lang.String;

public class CondomContext$4 extends CondomCore$WrappedProcedure	// class@000a66
{
    public final Intent a;
    public final String b;
    public final CondomContext c;

    public void CondomContext$4(CondomContext p0,Intent p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void b(){
       CondomContext.access$301(this.c, this.a, this.b);
    }
}
