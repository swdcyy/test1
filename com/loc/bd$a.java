package com.loc.bd$a;
import com.loc.bd;
import com.loc.bd$c;
import java.lang.Object;
import java.io.OutputStream;
import java.io.File;
import java.io.FileOutputStream;
import com.loc.bd$a$a;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class bd$a	// class@001387
{
    public final bd a;
    public final bd$c b;
    public final boolean[] c;
    public boolean d;
    public boolean e;

    public void bd$a(bd p0,bd$c p1){
       this.a = p0;
       super();
       this.b = p1;
       boolean[] uobooleanArr = (bd$c.e(p1))? null: new boolean[bd.f(p0)];
       this.c = uobooleanArr;
       return;
    }
    public void bd$a(bd p0,bd$c p1,byte p2){
       super(p0, p1);
    }
    public static bd$c a(bd$a p0){
       return p0.b;
    }
    public static boolean[] b(bd$a p0){
       return p0.c;
    }
    public static boolean c(bd$a p0){
       p0.d = true;
       return true;
    }
    public final OutputStream a(){
       FileOutputStream uFileOutputS;
       if (bd.f(this.a) <= 0) {
          throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of "+bd.f(this.a));
       }
       bd$a ta = this.a;
       _monitor_enter(ta);
       if (bd$c.b(this.b) != this) {
          throw new IllegalStateException();
       }
       if (!bd$c.e(this.b)) {
          this.c[0] = true;
       }
       File uFile = this.b.b(0);
       try{
          uFileOutputS = new FileOutputStream(uFile);
       }catch(java.io.FileNotFoundException e0){
          File uFile1 = bd.g(this.a);
          uFile1.mkdirs();
          uFileOutputS = new FileOutputStream(uFile);
       }catch(java.io.FileNotFoundException e0){
          _monitor_exit(e0);
          return bd.e();
       }
    }
    public final void b(){
       if (this.d != null) {
          bd.a(this.a, this, false);
          this.a.c(bd$c.d(this.b));
       }else {
          bd.a(this.a, this, true);
       }
       this.e = true;
       return;
    }
    public final void c(){
       bd.a(this.a, this, false);
    }
}
