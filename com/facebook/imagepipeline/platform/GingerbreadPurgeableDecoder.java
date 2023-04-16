package com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import jb.b;
import jb.c;
import com.facebook.common.references.a;
import android.os.MemoryFile;
import java.lang.String;
import eb.f;
import java.lang.Object;
import com.facebook.common.memory.PooledByteBuffer;
import gb.a;
import java.io.InputStream;
import java.io.OutputStream;
import com.facebook.common.internal.a;
import com.facebook.common.internal.b;
import java.io.Closeable;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import java.io.FileDescriptor;
import android.graphics.Rect;
import ab.e;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.RuntimeException;
import com.facebook.common.internal.e;
import java.lang.Class;
import java.lang.reflect.Method;

public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder	// class@001111
{
    public final b c;
    public static Method d;

    public void GingerbreadPurgeableDecoder(){
       super();
       this.c = c.c();
    }
    public static MemoryFile j(a p0,int p1,byte[] p2){
       int i = (p2 == null)? 0: p2.length;
       MemoryFile memoryFile = new MemoryFile(null, (i + p1));
       memoryFile.allowPurging(false);
       f uof = new f(p0.j());
       a uoa = new a(uof, p1);
       OutputStream outputStream = memoryFile.getOutputStream();
       a.a(uoa, outputStream);
       if (p2 != null) {
          memoryFile.writeBytes(p2, false, p1, p2.length);
       }
       a.f(p0);
       b.b(uof);
       b.b(uoa);
       b.a(outputStream, true);
       return memoryFile;
    }
    public Bitmap e(a p0,BitmapFactory$Options p1){
       return this.k(p0, p0.j().size(), null, p1);
    }
    public Bitmap f(a p0,int p1,BitmapFactory$Options p2){
       byte[] uobyteArray = (DalvikPurgeableDecoder.g(p0, p1))? null: DalvikPurgeableDecoder.b;
       return this.k(p0, p1, uobyteArray, p2);
    }
    public final Bitmap k(a p0,int p1,byte[] p2,BitmapFactory$Options p3){
       Rect rect = null;
       try{
          MemoryFile memoryFile = GingerbreadPurgeableDecoder.j(p0, p1, p2);
          try{
             FileDescriptor uFileDescrip = this.l(memoryFile);
             GingerbreadPurgeableDecoder tc = this.c;
             if (tc == null) {
                throw new IllegalStateException("WebpBitmapFactory is null");
             }
             Bitmap uBitmap = tc.b(uFileDescrip, rect, p3);
             e.e(uBitmap, "BitmapFactory returned null");
             memoryFile.close();
             return uBitmap;
          }catch(java.io.IOException e3){
          }
          e.a(e3);
          throw rect;
       }catch(java.io.IOException e3){
          int i = rect;
          goto label_002b ;
       }
    }
    public final FileDescriptor l(MemoryFile p0){
       int i = 0;
       try{
          _monitor_enter(this);
          int i1 = 0;
          if (GingerbreadPurgeableDecoder.d == null) {
             try{
                Class[] uClassArray = new Class[i1];
                GingerbreadPurgeableDecoder.d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", uClassArray);
             }catch(java.lang.Exception e6){
                e.a(e6);
                throw i;
             }
          }
          _monitor_exit(this);
          Object[] objArray = new Object[i1];
          p0 = GingerbreadPurgeableDecoder.d.invoke(p0, objArray);
          e.d(p0);
          return p0;
       }catch(java.lang.Exception e6){
          e.a(e6);
          throw i;
       }
    }
}
