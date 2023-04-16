package com.oasisfeng.condom.CondomApplication$4;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomApplication;
import android.content.Intent;
import java.lang.String;
import android.app.Application;

public class CondomApplication$4 extends CondomCore$WrappedProcedure	// class@000a56
{
    public final Intent a;
    public final String b;
    public final CondomApplication c;

    public void CondomApplication$4(CondomApplication p0,Intent p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void b(){
       this.c.c.sendBroadcast(this.a, this.b);
    }
}
