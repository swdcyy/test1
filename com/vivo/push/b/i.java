package com.vivo.push.b.i;
import com.vivo.push.b.s;
import com.vivo.push.a;
import java.lang.String;

public final class i extends s	// class@001038
{
    public String a;
    public String b;
    public String c;

    public void i(int p0){
       super(p0);
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("app_id", this.a);
       p0.a("client_id", this.b);
       p0.a("client_token", this.c);
    }
    public final String d(){
       return this.a;
    }
    public final void d(a p0){
       super.d(p0);
       this.a = p0.a("app_id");
       this.b = p0.a("client_id");
       this.c = p0.a("client_token");
    }
    public final String e(){
       return this.c;
    }
    public final String toString(){
       return "OnBindCommand";
    }
}
