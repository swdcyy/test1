package com.kwai.dva.dex2oat.util.b$d;
import java.nio.ByteBuffer;
import com.kwai.dva.dex2oat.util.b$a;
import java.lang.Object;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.String;

public class b$d	// class@000d22
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public String k;

    public void b$d(ByteBuffer p0,int p1,b$a p2){
       super();
       if (p1 != 1) {
          if (p1 == 2) {
             this.a = p0.getInt();
             this.b = p0.getInt();
             this.c = p0.getLong();
             this.d = p0.getLong();
             this.e = p0.getLong();
             this.f = p0.getLong();
             this.g = p0.getInt();
             this.h = p0.getInt();
             this.i = p0.getLong();
             this.j = p0.getLong();
          }else {
             throw new IOException("Unexpected elf class: "+p1);
          }
       }else {
          this.a = p0.getInt();
          this.b = p0.getInt();
          this.c = (long)p0.getInt();
          this.d = (long)p0.getInt();
          this.e = (long)p0.getInt();
          this.f = (long)p0.getInt();
          this.g = p0.getInt();
          this.h = p0.getInt();
          this.i = (long)p0.getInt();
          this.j = (long)p0.getInt();
       }
       this.k = null;
       return;
    }
}
