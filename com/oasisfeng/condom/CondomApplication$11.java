package com.oasisfeng.condom.CondomApplication$11;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomApplication;
import android.content.Intent;
import android.os.UserHandle;
import android.app.Application;

public class CondomApplication$11 extends CondomCore$WrappedProcedure	// class@000a50
{
    public final Intent a;
    public final UserHandle b;
    public final CondomApplication c;

    public void CondomApplication$11(CondomApplication p0,Intent p1,UserHandle p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void b(){
       this.c.c.sendStickyBroadcastAsUser(this.a, this.b);
    }
}
