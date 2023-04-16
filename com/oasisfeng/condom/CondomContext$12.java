package com.oasisfeng.condom.CondomContext$12;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomContext;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.os.Handler;
import java.lang.String;
import android.os.Bundle;

public class CondomContext$12 extends CondomCore$WrappedProcedure	// class@000a60
{
    public final Intent a;
    public final BroadcastReceiver b;
    public final Handler c;
    public final int d;
    public final String e;
    public final Bundle f;
    public final CondomContext g;

    public void CondomContext$12(CondomContext p0,Intent p1,BroadcastReceiver p2,Handler p3,int p4,String p5,Bundle p6){
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
       CondomContext.access$1101(this.g, this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
