package com.oasisfeng.condom.CondomContext$13;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomContext;
import android.content.Intent;
import android.os.UserHandle;
import android.content.BroadcastReceiver;
import android.os.Handler;
import java.lang.String;
import android.os.Bundle;

public class CondomContext$13 extends CondomCore$WrappedProcedure	// class@000a61
{
    public final Intent a;
    public final UserHandle b;
    public final BroadcastReceiver c;
    public final Handler d;
    public final int e;
    public final String f;
    public final Bundle g;
    public final CondomContext h;

    public void CondomContext$13(CondomContext p0,Intent p1,UserHandle p2,BroadcastReceiver p3,Handler p4,int p5,String p6,Bundle p7){
       this.h = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       super();
    }
    public void b(){
       CondomContext.access$1201(this.h, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
