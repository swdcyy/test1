package isd.h$b;
import trd.b;
import isd.h;
import java.util.ArrayDeque;
import java.io.File;
import isd.h$a;
import java.lang.Object;
import isd.h$b$b;
import isd.i;
import java.lang.Enum;
import isd.h$b$a;
import kotlin.NoWhenBranchMatchedException;
import isd.h$b$c;
import isd.h$c;
import kotlin.jvm.internal.a;

public final class h$b extends b	// class@00150b
{
    public final ArrayDeque d;
    public final h e;

    public void h$b(h p0){
       this.e = p0;
       super();
       ArrayDeque uArrayDeque = new ArrayDeque();
       this.d = uArrayDeque;
       if (p0.a.isDirectory()) {
          uArrayDeque.push(this.e(p0.a));
       }else if(p0.a.isFile()){
          uArrayDeque.push(new h$b$b(this, p0.a));
       }else {
          this.b();
       }
       return;
    }
    public void a(){
       File uFile = this.f();
       if (uFile != null) {
          this.c(uFile);
       }else {
          this.b();
       }
       return;
    }
    public final h$a e(File p0){
       h$b$a uob$a;
       int i = i.a[this.e.b.ordinal()];
       if (i != 1) {
          if (i == 2) {
             uob$a = new h$b$a(this, p0);
          }else {
             throw new NoWhenBranchMatchedException();
          }
       }else {
          uob$a = new h$b$c(this, p0);
       }
       return uob$a;
    }
    public final File f(){
       File uFile;
       while (true) {
          h$c uoc = this.d.peek();
          if (uoc == null) {
             return null;
          }
          uFile = uoc.b();
          if (uFile == null) {
             this.d.pop();
          }else if(!a.g(uFile, uoc.a()) && (!uFile.isDirectory() || this.d.size() >= this.e.f)){
             break ;
          }else {
             this.d.push(this.e(uFile));
          }
       }
       return uFile;
    }
}
