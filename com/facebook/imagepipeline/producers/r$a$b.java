package com.facebook.imagepipeline.producers.r$a$b;
import id.e;
import com.facebook.imagepipeline.producers.r$a;
import com.facebook.imagepipeline.producers.r;
import id.i;
import id.c0;
import com.facebook.imagepipeline.producers.JobScheduler;

public class r$a$b extends e	// class@001145
{
    public final r a;
    public final i b;
    public final r$a c;

    public void r$a$b(r$a p0,r p1,i p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       if (this.c.e.i()) {
          this.c.g.e();
       }
       return;
    }
    public void c(){
       this.c.g.a();
       this.c.f = true;
       this.b.b();
    }
}
