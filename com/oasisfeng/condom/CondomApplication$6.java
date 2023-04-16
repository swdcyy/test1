package com.oasisfeng.condom.CondomApplication$6;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomApplication;
import android.content.Intent;
import android.os.UserHandle;
import java.lang.String;
import android.app.Application;

public class CondomApplication$6 extends CondomCore$WrappedProcedure	// class@000a58
{
    public final Intent a;
    public final UserHandle b;
    public final String c;
    public final CondomApplication d;

    public void CondomApplication$6(CondomApplication p0,Intent p1,UserHandle p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void b(){
       this.d.c.sendBroadcastAsUser(this.a, this.b, this.c);
    }
}
