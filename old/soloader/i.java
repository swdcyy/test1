package old.soloader.i;
import old.soloader.c;
import android.content.Context;
import java.lang.String;
import java.io.File;
import java.lang.StringBuilder;
import android.content.pm.ApplicationInfo;
import java.util.HashMap;
import java.io.RandomAccessFile;
import java.io.FileDescriptor;
import java.lang.Throwable;
import android.os.StrictMode$ThreadPolicy;
import java.lang.Object;
import java.io.IOException;
import old.soloader.f;
import old.soloader.i$b;
import old.soloader.h;
import old.soloader.i$d;
import java.io.InputStream;
import old.soloader.h$a;
import java.lang.Math;
import android.os.Parcel;
import old.soloader.i$f;
import old.soloader.i$c;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import old.soloader.i$e;
import old.soloader.i$a;
import java.lang.Thread;
import java.lang.Runnable;
import java.io.DataInput;

public abstract class i extends c	// class@00201e
{
    public final Context c;
    public String d;
    public String[] e;
    public final Map f;

    public void i(Context p0,String p1){
       super(new File(p0.getApplicationInfo().dataDir+"/"+p1), 1);
       this.f = new HashMap();
       this.c = p0;
    }
    public static void m(File p0,byte p1){
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "rw");
       randomAccess.seek(0);
       randomAccess.write(p1);
       randomAccess.setLength(randomAccess.getFilePointer());
       randomAccess.getFD().sync();
       randomAccess.close();
    }
    public int a(String p0,int p1,StrictMode$ThreadPolicy p2){
       Object obj = this.h(p0);
       _monitor_enter(obj);
       _monitor_exit(obj);
       return this.d(p0, p1, this.a, p2);
    }
    public void b(int p0){
       String str = "releasing dso store lock for ";
       c ta = this.a;
       if (!ta.mkdirs() && !ta.isDirectory()) {
          throw new IOException("cannot mkdir: "+ta);
       }
       f uof = new f(new File(this.a, "dso_lock"));
       StringBuilder str1 = "locked dso store "+this.a;
       if (this.j(uof, p0, this.g())) {
          uof = null;
       }else {
          StringBuilder str2 = "dso store is up-to-date: "+this.a;
       }
       if (uof != null) {
          str+this.a;
          uof.close();
       }else {
          "not releasing dso store lock for "+this.a+" \(syncer thread started\)";
       }
       return;
    }
    public final void e(i$b[] p0){
       String[] stringArray = this.a.list();
       if (stringArray == null) {
          throw new IOException("unable to list directory "+this.a);
       }
       int i = 0;
       while (i < stringArray.length) {
          object oobject = stringArray[i];
          if (oobject.equals("dso_state") || (oobject.equals("dso_lock") || (!oobject.equals("dso_deps") && !oobject.equals("dso_manifest")))) {
             File uFile = null;
             int i1 = 0;
             while (!uFile && i1 < p0.length) {
                if ((p0[i1].b).equals(oobject)) {
                   uFile = 1;
                }
                i1 = i1 + 1;
             }
             if (!uFile) {
                uFile = new File(this.a, oobject);
                StringBuilder str = "deleting unaccounted-for file "+uFile;
                h.a(uFile);
             }
          }
       label_005e :
          i = i + 1;
       }
       return;
    }
    public final void f(i$d p0,byte[] p1){
       File uFile;
       RandomAccessFile randomAccess;
       String str = "rw";
       if (!this.a.setWritable(true, true)) {
          throw new IOException("cannot make directory writable for us: "+this.a);
       }
       c ta = this.a;
       i$b b = p0.b.b;
       try{
          uFile = new File(ta, b);
          randomAccess = new RandomAccessFile(uFile, str);
       }catch(java.io.IOException e0){
          uFile.toString();
          h.a(uFile);
          randomAccess = new RandomAccessFile(uFile, e0);
       }
       try{
          int i = p0.c.available();
          if (i > 1) {
             h$a.a(randomAccess.getFD(), (long)i);
          }
          p0 = p0.c;
          i = Integer.MAX_VALUE;
          for (int i1 = 0; i1 < i; i1 = i1 + i3) {
             int i2 = i - i1;
             int i3 = p0.read(p1, 0, Math.min(p1.length, i2));
             if (i3 != -1) {
                randomAccess.write(p1, 0, i3);
             }else {
                break ;
             }
          }
          randomAccess.setLength(randomAccess.getFilePointer());
          if (uFile.setExecutable(true, 0)) {
             randomAccess.close();
             return;
          }else {
             throw new IOException("cannot make file executable: "+uFile);
          }
       }catch(java.io.IOException e9){
          h.a(uFile);
          throw e9;
       }
    }
    public byte[] g(){
       Parcel parcel = Parcel.obtain();
       i$f uof = this.i();
       i$c a = uof.a().a;
       parcel.writeByte(1);
       parcel.writeInt(a.length);
       for (int i = 0; i < a.length; i = i + 1) {
          parcel.writeString(a[i].b);
          parcel.writeString(a[i].c);
       }
       uof.close();
       parcel.recycle();
       return parcel.marshall();
    }
    public final Object h(String p0){
       i tf = this.f;
       _monitor_enter(tf);
       Object obj = this.f.get(p0);
       if (obj == null) {
          obj = new Object();
          this.f.put(p0, obj);
       }
       _monitor_exit(tf);
       return obj;
    }
    public abstract i$f i();
    public final boolean j(f p0,int p1,byte[] p2){
       int i;
       byte b;
       i$c uoc1;
       File uFile = new File(this.a, "dso_state");
       String str = "rw";
       RandomAccessFile randomAccess = new RandomAccessFile(uFile, str);
       try{
          i = 0;
          b = randomAccess.readByte();
          if (b != true) {
             Objects.toString(this.a);
             b = 0;
          }
       }catch(java.io.EOFException e0){
       }
       e0.close();
       File uFile1 = new File(this.a, "dso_deps");
       i$f uof = null;
       RandomAccessFile randomAccess1 = new RandomAccessFile(uFile1, str);
       int i1 = (int)randomAccess1.length();
       byte[] uobyteArray = new byte[i1];
       if (randomAccess1.read(uobyteArray) != i1) {
          b = 0;
       }
       if (!Arrays.equals(uobyteArray, p2)) {
          b = 0;
       }
       if (!b || (p1 & 0x02)) {
          i.m(uFile, i);
          uof = this.i();
          i$c uoc = uof.a();
          this.k(b, uoc, uof.c());
          uof.close();
          uoc1 = uoc;
       }else {
          uoc1 = uof;
       }
       randomAccess1.close();
       if (uoc1 == null) {
          return i;
       }else {
          i$a uoa = new i$a(this, uFile1, p2, uoc1, uFile, p0);
          if (p1 & 0x01) {
             new Thread(v9, "SoSync:"+this.a.getName()).start();
          }else {
             v9.run();
          }
          return true;
       }
    }
    public final void k(byte p0,i$c p1,i$e p2){
       i$b[] uobArray;
       byte[] uobyteArray;
       i$d uod;
       int i;
       int i1;
       i$c a;
       RandomAccessFile randomAccess = new RandomAccessFile(new File(this.a, "dso_manifest"), "rw");
       i$c uoc = (p0 == 1)? i$c.a(randomAccess): null;
    }
    public void l(String[] p0){
       this.e = p0;
    }
}
