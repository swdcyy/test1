package com.facebook.imagepipeline.producers.m$a;
import com.facebook.imagepipeline.producers.n$a;
import com.facebook.imagepipeline.producers.m;
import id.s;
import java.lang.Object;
import java.util.Objects;
import id.e0;
import id.c0;
import java.lang.String;
import java.util.Map;
import id.i;
import java.io.InputStream;
import kd.b;
import java.lang.Throwable;

public class m$a implements n$a	// class@00113c
{
    public final s a;
    public final m b;

    public void m$a(m p0,s p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(){
       m$a ta = this.a;
       Objects.requireNonNull(this.b);
       ta.c().onProducerFinishWithCancellation(ta.b(), "NetworkFetchProducer", null);
       ta.a().b();
    }
    public void c(InputStream p0,int p1){
       if (b.d()) {
          b.a("NetworkFetcher->onResponse");
       }
       this.b.e(this.a, p0, p1);
       if (b.d()) {
          b.b();
       }
       return;
    }
    public void onFailure(Throwable p0){
       m$a ta = this.a;
       Objects.requireNonNull(this.b);
       ta.c().onProducerFinishWithFailure(ta.b(), "NetworkFetchProducer", p0, null);
       ta.c().onUltimateProducerReached(ta.b(), "NetworkFetchProducer", false);
       ta.b().o("network");
       ta.a().onFailure(p0);
    }
}
