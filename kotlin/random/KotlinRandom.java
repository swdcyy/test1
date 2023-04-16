package kotlin.random.KotlinRandom;
import java.util.Random;
import ssd.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.UnsupportedOperationException;

public final class KotlinRandom extends Random	// class@0018b0
{
    public final e impl;
    public boolean seedInitialized;

    public void KotlinRandom(e p0){
       a.p(p0, "impl");
       super();
       this.impl = p0;
    }
    public final e getImpl(){
       return this.impl;
    }
    public int next(int p0){
       return this.impl.a(p0);
    }
    public boolean nextBoolean(){
       return this.impl.b();
    }
    public void nextBytes(byte[] p0){
       a.p(p0, "bytes");
       this.impl.d(p0);
    }
    public double nextDouble(){
       return this.impl.g();
    }
    public float nextFloat(){
       return this.impl.j();
    }
    public int nextInt(){
       return this.impl.k();
    }
    public int nextInt(int p0){
       return this.impl.l(p0);
    }
    public long nextLong(){
       return this.impl.n();
    }
    public void setSeed(long p0){
       if (this.seedInitialized != null) {
          throw new UnsupportedOperationException("Setting seed is not supported.");
       }
       this.seedInitialized = true;
       return;
    }
}
