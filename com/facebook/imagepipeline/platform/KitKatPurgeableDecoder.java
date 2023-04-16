package com.facebook.imagepipeline.platform.KitKatPurgeableDecoder;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import ed.n;
import com.facebook.common.references.a;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import java.lang.Object;
import com.facebook.common.memory.PooledByteBuffer;
import android.graphics.BitmapFactory;
import ab.e;
import java.lang.Boolean;

public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder	// class@001112
{
    public final n c;

    public void KitKatPurgeableDecoder(n p0){
       super();
       this.c = p0;
    }
    public Bitmap e(a p0,BitmapFactory$Options p1){
       PooledByteBuffer pooledByteBu = p0.j();
       int i = pooledByteBu.size();
       a uoa = this.c.a(i);
       byte[] uobyteArray = uoa.j();
       pooledByteBu.D(0, uobyteArray, 0, i);
       Bitmap uBitmap = BitmapFactory.decodeByteArray(uobyteArray, 0, i, p1);
       e.e(uBitmap, "BitmapFactory returned null");
       a.f(uoa);
       return uBitmap;
    }
    public Bitmap f(a p0,int p1,BitmapFactory$Options p2){
       int i = (DalvikPurgeableDecoder.g(p0, p1))? 0: DalvikPurgeableDecoder.b;
       PooledByteBuffer pooledByteBu = p0.j();
       boolean b = (p1 <= pooledByteBu.size())? true: false;
       e.a(Boolean.valueOf(b));
       int i1 = p1 + 2;
       a uoa = this.c.a(i1);
       byte[] uobyteArray = uoa.j();
       pooledByteBu.D(0, uobyteArray, 0, p1);
       if (i != null) {
          uobyteArray[p1] = -1;
          p1++;
          uobyteArray[p1] = -39;
          p1 = i1;
       }
       Bitmap uBitmap = BitmapFactory.decodeByteArray(uobyteArray, 0, p1, p2);
       e.e(uBitmap, "BitmapFactory returned null");
       a.f(uoa);
       return uBitmap;
    }
}
