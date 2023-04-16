package com.facebook.common.memory.c;
import eb.a;
import java.lang.Object;
import java.lang.Boolean;
import ab.e;
import java.io.InputStream;
import java.io.OutputStream;
import eb.e;

public class c	// class@000448
{
    public final int a;
    public final a b;

    public void c(a p0){
       super();
       e.a(Boolean.valueOf(true));
       this.a = 0x4000;
       this.b = p0;
    }
    public long a(InputStream p0,OutputStream p1){
       byte[] uobyteArray = this.b.get(this.a);
       long l = 0;
       int i = p0.read(uobyteArray, 0, this.a);
       while (i != -1) {
          p1.write(uobyteArray, 0, i);
          l = l + (long)i;
       }
       this.b.a(uobyteArray);
       return l;
    }
}
