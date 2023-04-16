package wqd.a;
import wqd.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Error;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import io.netty.util.internal.ThreadLocalRandom;
import java.util.Random;

public abstract class a implements h	// class@002907
{
    public final int b;
    public final String c;
    public long d;
    public ByteBuffer e;

    public void a(int p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final int a(a p0){
       if (this == p0) {
          return 0;
       }
       int i = this.hashCode() - p0.hashCode();
       if (i) {
          return i;
       }
       p0 = this.b() - p0.b();
       if (p0 < 0) {
          return -1;
       }
       if (p0 > 0) {
          return 1;
       }
       throw new Error("failed to compare two different constants");
    }
    public final long b(){
       a td = this.d;
       if (!td) {
          _monitor_enter(this);
          td = this.d;
          while (!td) {
             if (PlatformDependent.q()) {
                ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(1);
                this.e = uByteBuffer;
                this.d = PlatformDependent.d(uByteBuffer);
             }else {
                this.e = null;
                this.d = ThreadLocalRandom.current().nextLong();
             }
          }
          _monitor_exit(this);
       }
       return td;
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public final boolean equals(Object p0){
       return super.equals(p0);
    }
    public final int hashCode(){
       return super.hashCode();
    }
    public final int id(){
       return this.b;
    }
    public final String name(){
       return this.c;
    }
    public final String toString(){
       return this.name();
    }
}
