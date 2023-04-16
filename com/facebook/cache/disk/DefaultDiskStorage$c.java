package com.facebook.cache.disk.DefaultDiskStorage$c;
import com.facebook.cache.disk.b$c;
import java.lang.String;
import java.io.File;
import com.facebook.cache.disk.DefaultDiskStorage$a;
import java.lang.Object;
import ab.e;
import sa.b;
import sa.a;

public class DefaultDiskStorage$c implements b$c	// class@001042
{
    public final String a;
    public final b b;
    public long c;
    public long d;

    public void DefaultDiskStorage$c(String p0,File p1,DefaultDiskStorage$a p2){
       super();
       e.d(p1);
       e.d(p0);
       this.a = p0;
       this.b = b.b(p1);
       this.c = -1;
       this.d = -1;
    }
    public b a(){
       return this.b;
    }
    public String getId(){
       return this.a;
    }
    public a getResource(){
       return this.a();
    }
    public long getSize(){
       if (this.c < 0) {
          this.c = this.b.size();
       }
       return this.c;
    }
    public long getTimestamp(){
       if (this.d < 0) {
          this.d = this.b.c().lastModified();
       }
       return this.d;
    }
}
