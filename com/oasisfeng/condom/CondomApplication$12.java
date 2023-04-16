package com.oasisfeng.condom.CondomApplication$12;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomApplication;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.os.Handler;
import java.lang.String;
import android.os.Bundle;
import android.app.Application;

public class CondomApplication$12 extends CondomCore$WrappedProcedure	// class@000a51
{
    public final Intent a;
    public final BroadcastReceiver b;
    public final Handler c;
    public final int d;
    public final String e;
    public final Bundle f;
    public final CondomApplication g;

    public void CondomApplication$12(CondomApplication p0,Intent p1,BroadcastReceiver p2,Handler p3,int p4,String p5,Bundle p6){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       super();
    }
    public void b(){
       this.g.c.sendStickyOrderedBroadcast(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
