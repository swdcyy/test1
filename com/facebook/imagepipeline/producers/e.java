package com.facebook.imagepipeline.producers.e;
import id.e;
import com.facebook.imagepipeline.producers.f;
import java.util.concurrent.Future;
import com.facebook.imagepipeline.producers.n$a;

public class e extends e	// class@001131
{
    public final Future a;
    public final n$a b;
    public final f c;

    public void e(f p0,Future p1,n$a p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void c(){
       if (this.a.cancel(false)) {
          this.b.b();
       }
       return;
    }
}
