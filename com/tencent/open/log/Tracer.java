package com.tencent.open.log.Tracer;
import com.tencent.open.log.c;
import com.tencent.open.log.g;
import java.lang.Object;
import java.lang.Thread;
import java.lang.String;
import java.lang.Throwable;
import com.tencent.open.log.d$a;

public abstract class Tracer	// class@000f60
{
    public int a;
    public boolean b;
    public g c;

    public void Tracer(){
       super(c.a, true, g.a);
    }
    public void Tracer(int p0,boolean p1,g p2){
       super();
       this.a = c.a;
       this.b = true;
       this.c = g.a;
       this.a(p0);
       this.a(p1);
       this.a(p2);
    }
    public void a(int p0){
       this.a = p0;
    }
    public void a(int p0,Thread p1,long p2,String p3,String p4,Throwable p5){
       if (this.d() && d$a.a(this.a, p0)) {
          this.doTrace(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void a(g p0){
       this.c = p0;
    }
    public void a(boolean p0){
       this.b = p0;
    }
    public boolean d(){
       return this.b;
    }
    public abstract void doTrace(int p0,Thread p1,long p2,String p3,String p4,Throwable p5);
    public g e(){
       return this.c;
    }
}
