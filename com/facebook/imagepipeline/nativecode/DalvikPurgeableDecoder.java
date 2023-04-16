package com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import gd.d;
import fd.a;
import java.lang.Object;
import ed.b;
import ed.c;
import com.facebook.common.references.a;
import com.facebook.common.memory.PooledByteBuffer;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import bd.d;
import android.graphics.Rect;
import android.graphics.ColorSpace;
import android.os.Build$VERSION;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder$OreoUtils;
import ab.e;
import fb.c;
import nd.a;
import java.util.Locale;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import java.lang.Throwable;
import java.lang.RuntimeException;
import com.facebook.common.internal.e;

public abstract class DalvikPurgeableDecoder implements d	// class@001109
{
    public final b a;
    public static final byte[] b;

    static {
       a.a();
       DalvikPurgeableDecoder.b = new byte[2]{0xff,0xd9};
    }
    public void DalvikPurgeableDecoder(){
       super();
       this.a = c.a();
    }
    public static boolean g(a p0,int p1){
       PooledByteBuffer pooledByteBu = p0.j();
       int i = 1;
       if (p1 < 2 || (pooledByteBu.F((p1 - 2)) != -1 || pooledByteBu.F((p1 - i)) != -39)) {
          i = false;
       }
       return i;
    }
    public static BitmapFactory$Options h(int p0,Bitmap$Config p1){
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inDither = true;
       options.inPreferredConfig = p1;
       options.inPurgeable = true;
       options.inInputShareable = true;
       options.inSampleSize = p0;
       options.inMutable = true;
       return options;
    }
    public static native void nativePinBitmap(Bitmap p0);
    public a a(d p0,Bitmap$Config p1,Rect p2,int p3,ColorSpace p4){
       BitmapFactory$Options options = DalvikPurgeableDecoder.h(p0.o(), p1);
       if (Build$VERSION.SDK_INT >= 26) {
          DalvikPurgeableDecoder$OreoUtils.a(options, p4);
       }
       a uoa = p0.e();
       e.d(uoa);
       a.f(uoa);
       return this.i(this.f(uoa, p3, options));
    }
    public a b(d p0,Bitmap$Config p1,Rect p2){
       return this.c(p0, p1, p2, null);
    }
    public a c(d p0,Bitmap$Config p1,Rect p2,ColorSpace p3){
       BitmapFactory$Options options = DalvikPurgeableDecoder.h(p0.o(), p1);
       if (Build$VERSION.SDK_INT >= 26) {
          DalvikPurgeableDecoder$OreoUtils.a(options, p3);
       }
       a uoa = p0.e();
       e.d(uoa);
       a.f(uoa);
       return this.i(this.e(uoa, options));
    }
    public a d(d p0,Bitmap$Config p1,Rect p2,int p3){
       return this.a(p0, p1, p2, p3, null);
    }
    public abstract Bitmap e(a p0,BitmapFactory$Options p1);
    public abstract Bitmap f(a p0,int p1,BitmapFactory$Options p2);
    public a i(Bitmap p0){
       DalvikPurgeableDecoder ta;
       try{
          e.d(p0);
          DalvikPurgeableDecoder.nativePinBitmap(p0);
          if (this.a.c(p0)) {
             return a.p(p0, this.a.b());
          }
          p0.recycle();
          Object[] objArray = new Object[]{Integer.valueOf(a.d(p0)),Integer.valueOf(ta.a),Long.valueOf(ta.b),Integer.valueOf(ta.c),Integer.valueOf(ta.d)};
          ta = this.a;
          _monitor_enter(ta);
          _monitor_exit(ta);
          ta = this.a;
          _monitor_enter(ta);
          _monitor_exit(ta);
          ta = this.a;
          _monitor_enter(ta);
          _monitor_exit(ta);
          ta = this.a;
          _monitor_enter(ta);
          _monitor_exit(ta);
          throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", objArray));
       }catch(java.lang.Exception e0){
          p0.recycle();
          e.a(e0);
          throw null;
       }
    }
}
