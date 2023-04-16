package com.vivo.push.b.n;
import com.vivo.push.b.s;
import java.lang.String;
import com.vivo.push.a;

public final class n extends s	// class@00103d
{
    public String a;
    public int b;
    public boolean c;

    public void n(){
       super(7);
       this.b = 0;
       this.c = false;
    }
    public final void a(int p0){
       this.b = p0;
    }
    public final void a(boolean p0){
       this.c = p0;
    }
    public final void b(String p0){
       this.a = p0;
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("content", this.a);
       p0.a("log_level", this.b);
       p0.a("is_server_log", this.c);
    }
    public final String d(){
       return this.a;
    }
    public final void d(a p0){
       super.d(p0);
       this.a = p0.a("content");
       this.b = p0.b("log_level", 0);
       this.c = p0.e("is_server_log");
    }
    public final int e(){
       return this.b;
    }
    public final boolean f(){
       return this.c;
    }
    public final String toString(){
       return "OnLogCommand";
    }
}
