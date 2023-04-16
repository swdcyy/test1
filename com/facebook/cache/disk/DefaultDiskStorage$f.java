package com.facebook.cache.disk.DefaultDiskStorage$f;
import za.b;
import com.facebook.cache.disk.DefaultDiskStorage;
import java.lang.Object;
import java.io.File;
import com.facebook.cache.disk.DefaultDiskStorage$d;
import hb.a;
import ab.e;

public class DefaultDiskStorage$f implements b	// class@001045
{
    public boolean a;
    public final DefaultDiskStorage b;

    public void DefaultDiskStorage$f(DefaultDiskStorage p0){
       this.b = p0;
       super();
    }
    public void a(File p0){
       if (this.a == null && p0.equals(this.b.c)) {
          this.a = true;
       }
       return;
    }
    public void b(File p0){
       if (this.a != null) {
          DefaultDiskStorage$d uod = this.b.n(p0);
          boolean b = false;
          if (uod != null) {
             uod = uod.a;
             if (uod == ".tmp") {
                if (p0.lastModified() - (this.b.e.now() - DefaultDiskStorage.g) <= 0) {
                label_0033 :
                   if (b) {
                   label_0038 :
                      return;
                   }
                }
             }else if(uod == ".cnt"){
                b = true;
             }
             e.f(b);
             b = 1;
             goto label_0033 ;
          }
       }
       p0.delete();
       goto label_0038 ;
    }
    public void c(File p0){
       if (!this.b.a.equals(p0) && this.a == null) {
          p0.delete();
       }
       if (this.a != null && p0.equals(this.b.c)) {
          this.a = false;
       }
       return;
    }
}
