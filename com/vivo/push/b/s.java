package com.vivo.push.b.s;
import com.vivo.push.o;
import com.vivo.push.a;
import java.lang.String;

public class s extends o	// class@001042
{
    public String a;
    public int b;

    public void s(int p0){
       super(p0);
       this.a = null;
       this.b = 0;
    }
    public void c(a p0){
       p0.a("req_id", this.a);
       p0.a("status_msg_code", this.b);
    }
    public void d(a p0){
       this.a = p0.a("req_id");
       this.b = p0.b("status_msg_code", this.b);
    }
    public final String g(){
       return this.a;
    }
    public final int h(){
       return this.b;
    }
    public String toString(){
       return "OnReceiveCommand";
    }
}
