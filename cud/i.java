package cud.i;
import java.lang.Object;
import okio.b;
import cud.i$a;
import cud.i$b;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import okio.m;

public final class i	// class@000c8c
{
    public final b a;
    public boolean b;
    public boolean c;
    public m d;
    public final m e;
    public final n f;
    public final long g;

    public void i(long p0){
       super();
       this.g = p0;
       this.a = new b();
       StringBuilder str = (p0 - 1 >= 0)? 1: null;
       if (str) {
          this.e = new i$a(this);
          this.f = new i$b(this);
          return;
       }else {
          throw new IllegalArgumentException("maxBufferSize < 1: "+p0.toString());
       }
    }
    public final b a(){
       return this.a;
    }
    public final m b(){
       return this.d;
    }
    public final boolean c(){
       return this.b;
    }
    public final boolean d(){
       return this.c;
    }
    public final m e(){
       return this.e;
    }
}
