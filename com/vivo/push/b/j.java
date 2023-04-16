package com.vivo.push.b.j;
import com.vivo.push.b.s;
import com.vivo.push.a;
import java.lang.String;

public final class j extends s	// class@001039
{
    public int a;
    public int b;

    public void j(){
       super(12);
       this.a = -1;
       this.b = -1;
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.a);
       p0.a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }
    public final int d(){
       return this.a;
    }
    public final void d(a p0){
       super.d(p0);
       this.a = p0.b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.a);
       this.b = p0.b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }
    public final int e(){
       return this.b;
    }
    public final String toString(){
       return "OnChangePushStatusCommand";
    }
}
