package com.oasisfeng.condom.CondomApplication$3;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomApplication;
import android.content.Intent;
import android.app.Application;

public class CondomApplication$3 extends CondomCore$WrappedProcedure	// class@000a55
{
    public final Intent a;
    public final CondomApplication b;

    public void CondomApplication$3(CondomApplication p0,Intent p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(){
       this.b.c.sendBroadcast(this.a);
    }
}
