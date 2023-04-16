package com.oasisfeng.condom.CondomApplication$8;
import com.oasisfeng.condom.CondomCore$WrappedProcedure;
import com.oasisfeng.condom.CondomApplication;
import android.content.Intent;
import java.lang.String;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Bundle;
import android.app.Application;

public class CondomApplication$8 extends CondomCore$WrappedProcedure	// class@000a5a
{
    public final Intent a;
    public final String b;
    public final BroadcastReceiver c;
    public final Handler d;
    public final int e;
    public final String f;
    public final Bundle g;
    public final CondomApplication h;

    public void CondomApplication$8(CondomApplication p0,Intent p1,String p2,BroadcastReceiver p3,Handler p4,int p5,String p6,Bundle p7){
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
       this.h.c.sendOrderedBroadcast(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
