package androidx.room.g0;
import a3.c;
import v2.o;
import android.content.Context;
import java.lang.String;
import java.io.File;
import java.util.concurrent.Callable;
import java.lang.Object;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Channels;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import x2.d;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import androidx.room.t;
import x2.a;
import java.lang.RuntimeException;
import x2.c;
import a3.b;

public class g0 implements c, o	// class@00026f
{
    public final Context b;
    public final String c;
    public final File d;
    public final Callable e;
    public final int f;
    public final c g;
    public t h;
    public boolean i;

    public void g0(Context p0,String p1,File p2,Callable p3,int p4,c p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void a(File p0,boolean p1){
       ReadableByteChannel readableByte;
       if (this.c != null) {
          readableByte = Channels.newChannel(SplitAssetHelper.open(this.b.getAssets(), this.c));
       }else if(this.d != null){
          readableByte = new FileInputStream(this.d).getChannel();
       }else {
          g0 te = this.e;
          if (te != null) {
             try{
                readableByte = Channels.newChannel(te.call());
             }catch(java.lang.Exception e5){
                throw new IOException("inputStreamCallable exception on call", e5);
             }
          }else {
             throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
          }
       }
       File uFile = File.createTempFile("room-copy-helper", ".tmp", this.b.getCacheDir());
       uFile.deleteOnExit();
       d.a(readableByte, new FileOutputStream(uFile).getChannel());
       File parentFile = p0.getParentFile();
       if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
          this.b(uFile, p1);
          if (uFile.renameTo(p0)) {
             return;
          }else {
             throw new IOException("Failed to move intermediate file \("+uFile.getAbsolutePath()+"\) to destination \("+p0.getAbsolutePath()+"\).");
          }
       }else {
          throw new IOException("Failed to create directories for "+p0.getAbsolutePath());
       }
    }
    public final void b(File p0,boolean p1){
    }
    public void c(t p0){
       this.h = p0;
    }
    public synchronized void close(){
       this.g.close();
       this.i = false;
    }
    public final void d(boolean p0){
       String databaseName = this.getDatabaseName();
       File databasePath = this.b.getDatabasePath(databaseName);
       g0 th = this.h;
       int b = (th == null || th.l != null)? true: false;
       a uoa = new a(databaseName, this.b.getFilesDir(), b);
       uoa.b();
       if (!databasePath.exists()) {
          try{
             this.a(databasePath, p0);
             uoa.c();
             return;
          }catch(java.io.IOException e7){
             throw new RuntimeException("Unable to copy database file.", e7);
          }
       }else if(this.h == null){
          uoa.c();
          return;
       }else {
          try{
             b = c.c(databasePath);
             g0 tf = this.f;
             if (b == tf) {
                uoa.c();
                return;
             }else if(this.h.a(b, tf)){
                uoa.c();
                return;
             }else if(this.b.deleteDatabase(databaseName)){
                this.a(databasePath, p0);
             }
             uoa.c();
             return;
          }catch(java.io.IOException e0){
             uoa.c();
             return;
          }
       }
    }
    public synchronized b e0(){
       if (this.i == null) {
          boolean b = true;
          this.d(b);
          this.i = b;
       }
       return this.g.e0();
    }
    public String getDatabaseName(){
       return this.g.getDatabaseName();
    }
    public c getDelegate(){
       return this.g;
    }
    public void setWriteAheadLoggingEnabled(boolean p0){
       this.g.setWriteAheadLoggingEnabled(p0);
    }
    public synchronized b z3(){
       if (this.i == null) {
          this.d(false);
          this.i = true;
       }
       return this.g.z3();
    }
}
