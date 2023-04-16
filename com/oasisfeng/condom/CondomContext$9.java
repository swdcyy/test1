package com.oasisfeng.condom.CondomContext$9;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomContext;
import android.content.Intent;
import android.os.UserHandle;
import java.lang.String;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Bundle;

public class CondomContext$9 extends CondomCore$WrappedProcedure	// class@000a6b
{
    public final Intent a;
    public final UserHandle b;
    public final String c;
    public final BroadcastReceiver d;
    public final Handler e;
    public final int f;
    public final String g;
    public final Bundle h;
    public final CondomContext i;

    public void CondomContext$9(CondomContext p0,Intent p1,UserHandle p2,String p3,BroadcastReceiver p4,Handler p5,int p6,String p7,Bundle p8){
       this.i = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       super();
    }
    public void b(){
       CondomContext.access$801(this.i, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
