package gd.b;
import gd.d;
import ed.d;
import z1.g;
import java.lang.Object;
import android.os.Build$VERSION;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.nio.ByteBuffer;
import bd.d;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory$Options;
import java.io.InputStream;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.IllegalArgumentException;
import android.graphics.ColorSpace;
import com.facebook.common.references.a;
import nc.a;
import ab.e;
import com.facebook.common.memory.PooledByteBuffer;
import gb.a;
import gb.b;
import java.io.IOException;
import eb.e;
import java.lang.String;
import java.util.Objects;
import android.graphics.ColorSpace$Named;
import lnc.a0;
import android.graphics.BitmapRegionDecoder;
import java.lang.Class;
import cb.a;
import java.lang.IllegalStateException;
import fb.c;
import sc.e;

public abstract class b implements d	// class@0016d5
{
    public final d a;
    public final PreverificationHelper b;
    public final g c;
    public static final Class d;
    public static final byte[] e;

    static {
       b.d = b.class;
       b.e = new byte[2]{0xff,0xd9};
    }
    public void b(d p0,int p1,g p2){
       super();
       PreverificationHelper preverificat = (Build$VERSION.SDK_INT >= 26)? new PreverificationHelper(): null;
       this.b = preverificat;
       this.a = p0;
       this.c = p2;
       for (int i = 0; i < p1; i++) {
          this.c.a(ByteBuffer.allocate(0x4000));
       }
       return;
    }
    public static BitmapFactory$Options g(d p0,Bitmap$Config p1){
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inSampleSize = p0.o();
       options.inJustDecodeBounds = true;
       BitmapFactory.decodeStream(p0.k(), null, options);
       if (options.outWidth == -1 || options.outHeight == -1) {
          throw new IllegalArgumentException();
       }
       options.inJustDecodeBounds = false;
       options.inDither = true;
       options.inPreferredConfig = p1;
       options.inMutable = true;
       return options;
    }
    public a a(d p0,Bitmap$Config p1,Rect p2,int p3,ColorSpace p4){
       b uob;
       a uoa;
       d d = p0.d;
       if (d == a.a || (d == a.l && p0.c == null)) {
          e.d(p0.b);
          PooledByteBuffer pooledByteBu = p0.b.j();
          if (pooledByteBu.F((p3 - 2)) != -1 || pooledByteBu.F((p3 - 1)) != -39) {
             uob = null;
          label_0035 :
             BitmapFactory$Options options = b.g(p0, p1);
             InputStream inputStream = p0.k();
             e.d(inputStream);
             if (p0.p() > p3) {
                inputStream = new a(inputStream, p3);
             }
             if (!uob) {
                inputStream = new b(inputStream, b.e);
             }
             if (options.inPreferredConfig != Bitmap$Config.ARGB_8888) {
                int i = 1;
             }
             try{
                uoa = this.e(inputStream, options, p2, p4);
                try{
                   inputStream.close();
                }catch(java.io.IOException e11){
                   e11.printStackTrace();
                }
                return uoa;
             }catch(java.lang.RuntimeException e11){
                if (i) {
                   uoa = this.a(uoa, Bitmap$Config.ARGB_8888, p2, p3, p4);
                   try{
                      inputStream.close();
                   }catch(java.io.IOException e11){
                      e11.printStackTrace();
                   }
                   return uoa;
                }else {
                   throw e11;
                }
             }
          }
       }
       uob = 1;
       goto label_0035 ;
    }
    public a b(d p0,Bitmap$Config p1,Rect p2){
       return this.c(p0, p1, p2, null);
    }
    public a c(d p0,Bitmap$Config p1,Rect p2,ColorSpace p3){
       BitmapFactory$Options options = b.g(p0, p1);
       int i = (options.inPreferredConfig != Bitmap$Config.ARGB_8888)? 1: 0;
       try{
          return this.e(p0.k(), options, p2, p3);
       }catch(java.lang.RuntimeException e4){
          if (i) {
             return this.c(p0, Bitmap$Config.ARGB_8888, p2, p3);
          }else {
             throw e4;
          }
       }
    }
    public a d(d p0,Bitmap$Config p1,Rect p2,int p3){
       return this.a(p0, p1, p2, p3, null);
    }
    public final a e(InputStream p0,BitmapFactory$Options p1,Rect p2,ColorSpace p3){
       Bitmap$Config uConfig;
       Bitmap uBitmap;
       BitmapRegionDecoder uBitmapRegio;
       e.d(p0);
       BitmapFactory$Options outWidth = p1.outWidth;
       BitmapFactory$Options outHeight = p1.outHeight;
       if (p2 != null) {
          outWidth = p2.width() / p1.inSampleSize;
          outHeight = p2.height() / p1.inSampleSize;
       }
       try{
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= 26) {
             b tb = this.b;
             if (tb != null && tb.shouldUseHardwareBitmapConfig(p1.inPreferredConfig)) {
                uConfig = 1;
             label_002e :
                if (p2 == null && uConfig) {
                   p1.inMutable = false;
                   uBitmap = null;
                }else if(p2 != null && uConfig){
                   p1.inPreferredConfig = Bitmap$Config.ARGB_8888;
                }
                uBitmap = this.a.get(this.f(outWidth, outHeight, p1));
                Objects.requireNonNull(uBitmap, "BitmapPool.get returned null");
                p1.inBitmap = uBitmap;
                if (sDK_INT >= 26) {
                   if (p3 == null) {
                      p3 = ColorSpace.get(ColorSpace$Named.SRGB);
                   }
                   p1.inPreferredColorSpace = p3;
                }
                ByteBuffer uByteBuffer = this.c.q();
                if (uByteBuffer == null) {
                   uByteBuffer = ByteBuffer.allocate(0x4000);
                }
                try{
                   p1.inTempStorage = uByteBuffer.array();
                   if (p2 != null && uBitmap != null) {
                      try{
                         a0.a(uBitmap, outWidth, outHeight, p1.inPreferredConfig);
                         uBitmapRegio = BitmapRegionDecoder.newInstance(p0, true);
                         try{
                            Bitmap uBitmap2 = uBitmapRegio.decodeRegion(p2, p1);
                            uBitmapRegio.recycle();
                         label_00a6 :
                            if (p2 == null) {
                               uBitmap2 = BitmapFactory.decodeStream(p0, null, p1);
                            }
                            this.c.a(uByteBuffer);
                            if (uBitmap == null || uBitmap == uBitmap2) {
                               return a.p(uBitmap2, this.a);
                            }else {
                               this.a.a(uBitmap);
                               uBitmap2.recycle();
                               throw new IllegalStateException();
                            }
                         }catch(java.io.IOException e0){
                            Object[] objArray = new Object[true];
                            objArray[0] = p2;
                            a.e(b.d, "Could not decode region %s, decoding full bitmap instead.", objArray);
                            if (uBitmapRegio) {
                               uBitmapRegio.recycle();
                            }
                         }
                      label_00a5 :
                         p2 = null;
                         goto label_00a6 ;
                      }catch(java.io.IOException e0){
                         uBitmapRegio = null;
                         goto label_008c ;
                      }catch(java.lang.IllegalArgumentException e11){
                         if (uBitmap) {
                            this.a.a(uBitmap);
                         }
                         try{
                            p0.reset();
                            Bitmap uBitmap1 = BitmapFactory.decodeStream(p0);
                            if (uBitmap1 != null) {
                               this.c.a(uByteBuffer);
                               return a.p(uBitmap1, e.b());
                            }else {
                               throw e11;
                            }
                         }catch(java.io.IOException e0){
                            throw e11;
                         }
                      }catch(java.lang.RuntimeException e10){
                         if (uBitmap) {
                            this.a.a(uBitmap);
                         }
                         throw e10;
                      }
                   }else {
                      goto label_00a5 ;
                   }
                }catch(java.lang.IllegalArgumentException e11){
                }catch(java.lang.RuntimeException e10){
                }
             }
          }
          uConfig = null;
          goto label_002e ;
       }catch( e0){
       }
    }
    public abstract int f(int p0,int p1,BitmapFactory$Options p2);
}
