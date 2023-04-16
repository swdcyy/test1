package old.soloader.i$a;
import java.lang.Runnable;
import old.soloader.i;
import java.io.File;
import old.soloader.i$c;
import old.soloader.f;
import java.lang.Object;
import java.io.RandomAccessFile;
import java.lang.String;
import old.soloader.c;
import java.util.Objects;
import old.soloader.i$b;
import old.soloader.h;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.RuntimeException;

public class i$a implements Runnable	// class@002018
{
    public final File b;
    public final byte[] c;
    public final i$c d;
    public final File e;
    public final f f;
    public final i g;

    public void i$a(i p0,File p1,byte[] p2,i$c p3,File p4,f p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void run(){
       String str = " \(from syncer thread\)";
       String str1 = "releasing dso store lock for ";
       RandomAccessFile randomAccess = new RandomAccessFile(this.b, "rw");
       randomAccess.write(this.c);
       randomAccess.setLength(randomAccess.getFilePointer());
       randomAccess.close();
       RandomAccessFile randomAccess1 = new RandomAccessFile(new File(this.g.a, "dso_manifest"), "rw");
       i$a td = this.d;
       Objects.requireNonNull(td);
       randomAccess1.writeByte(1);
       randomAccess1.writeInt(td.a.length);
       int i = 0;
       i$c a = td.a;
       while (i < a.length) {
          randomAccess1.writeUTF(a[i].b);
          randomAccess1.writeUTF(td.a[i].c);
          i = i + 1;
       }
       randomAccess1.close();
       h.b(this.g.a);
       td = this.e;
       try{
          i.m(td, 1);
          str1+this.g.a+str;
          this.f.close();
          return;
       }catch(java.io.IOException e0){
          throw new RuntimeException(e0);
       }
    }
}
