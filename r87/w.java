package r87.w;
import java.lang.String;
import r87.w$a;
import java.lang.Object;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel$MapMode;
import java.nio.MappedByteBuffer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.io.IOException;
import r87.c;
import r87.z;
import r87.z$a;
import java.util.LinkedList;
import s87.c;
import java.util.HashMap;
import java.util.Map;
import q87.d;
import r87.n;
import java.lang.ThreadLocal;
import r87.d;

public class w	// class@002333
{
    public File a;
    public boolean b;
    public ByteBuffer c;
    public final int d;
    public final w$a e;
    public int f;
    public long g;
    public long h;
    public c i;
    public final z j;
    public static boolean k = true;

    public void w(int p0,String p1,w$a p2,boolean p3){
       boolean b;
       FileChannel channel;
       super();
       this.b = true;
       this.g = 0;
       this.h = 0;
       this.d = p0;
       if (this.a == null) {
          File uFile = new File(p1);
          this.a = uFile;
          if (!uFile.exists() || (!this.a.length() - (long)p0 && (!this.a.canWrite() || !this.a.canRead()))) {
             this.a.delete();
          }
          if (!this.a.exists()) {
             try{
                this.a.createNewFile();
             }catch(java.io.IOException e0){
                this.a = null;
             }
          }
       }
    }
    public final void a(int p0){
       this.f = this.f + p0;
       if (this.b == null) {
          return;
       }
       this.c.position(0);
       this.c.putInt(this.f);
       this.c.position(this.c.position());
       return;
    }
    public final z$a b(){
       z$a uoa;
       this.c.flip();
       w tj = this.j;
       z b = tj.b;
       _monitor_enter(b);
       if (tj.b.isEmpty()) {
          uoa = new z$a();
          byte[] uobyteArray = new byte[tj.a];
          uoa.a = uobyteArray;
          uoa.b = 0;
          _monitor_exit(b);
       }else {
          uoa = tj.b.pop();
          _monitor_exit(b);
       }
       uoa.b = this.c.remaining();
       if (this.b != null) {
          this.c.position(4);
          uoa.b = uoa.b - 4;
       }
       this.c.get(uoa.a, 0, uoa.b);
       this.c.clear();
       this.f = 0;
       if (this.b != null) {
          this.c.putInt(0);
          this.c.position(4);
       }
       this.g = 0;
       this.h = 0;
       return uoa;
    }
    public z$a c(){
       if (this.f <= null) {
          return null;
       }
       _monitor_enter(this);
       _monitor_exit(this);
       return this.b();
    }
    public final void d(int p0,String p1){
       this.c = ByteBuffer.allocateDirect(p0);
       c uoc = c.b();
       if (uoc.e != null) {
       }else {
          uoc.e = true;
          HashMap hashMap = new HashMap();
          hashMap.put("errMsg", p1);
          uoc.d("obiwan_mmap_open_fail", hashMap);
       }
       return;
    }
    public void e(d p0){
       byte[] uobyteArray = n.c.get().a.a(p0);
       this.f(uobyteArray, uobyteArray.length, p0.d);
    }
    public final void f(byte[] p0,int p1,long p2){
       z$a uoa;
       w tg = this.g;
       _monitor_enter(this);
       long l = this.h + 1;
       this.h = l;
       if (!this.g - null) {
          this.g = p2;
          tg = p2;
       }
       if (this.c.remaining() < p1) {
          uoa = this.b();
          p2 = p2 - this.g;
       }else {
          p2 = -1;
          uoa = null;
       }
       int i = 0;
       if (this.c.remaining() < p1) {
          i = 1;
       }else {
          this.c.put(p0, i, p1);
          this.a(p1);
       }
       _monitor_exit(this);
       if (i) {
          w te = this.e;
          if (te != null) {
             te.b(null, uoa);
             this.e.a(p0);
          }
          return;
       }else {
          w te1 = this.e;
          if (te1 != null && uoa != null) {
             d uod = new d();
             uod.a = tg;
             uod.b = p2;
             uod.c = l;
             te1.b(uod, uoa);
          }
          return;
       }
    }
}
