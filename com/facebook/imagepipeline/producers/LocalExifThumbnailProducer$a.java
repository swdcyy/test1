package com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a;
import id.i0;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import id.i;
import id.e0;
import id.c0;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import bd.d;
import android.net.Uri;
import android.media.ExifInterface;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.b;
import java.util.Objects;
import eb.f;
import nd.a;
import ab.e;
import z1.g;
import java.nio.ByteBuffer;
import android.graphics.BitmapFactory$Options;
import java.io.InputStream;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import java.lang.Integer;
import nd.c;
import java.io.Closeable;
import com.facebook.common.references.a;
import nc.a;
import com.facebook.imageformat.a;
import java.util.Map;
import java.lang.Boolean;
import com.facebook.common.internal.ImmutableMap;

public class LocalExifThumbnailProducer$a extends i0	// class@00111f
{
    public final ImageRequest g;
    public final LocalExifThumbnailProducer h;

    public void LocalExifThumbnailProducer$a(LocalExifThumbnailProducer p0,i p1,e0 p2,c0 p3,String p4,ImageRequest p5){
       this.h = p0;
       this.g = p5;
       super(p1, p2, p3, p4);
    }
    public void b(Object p0){
       d.b(p0);
    }
    public Object c(){
       ExifInterface uExifInterfa = this.h.c(this.g.s());
       Pair pair = null;
       if (uExifInterfa != null && uExifInterfa.hasThumbnail()) {
          PooledByteBuffer pooledByteBu = this.h.b.e(uExifInterfa.getThumbnail());
          Objects.requireNonNull(this.h);
          f uof = new f(pooledByteBu);
          e.d(uof);
          g a = a.a;
          ByteBuffer uByteBuffer = a.q();
          if (uByteBuffer == null) {
             uByteBuffer = ByteBuffer.allocate(0x4000);
          }
          BitmapFactory$Options options = new BitmapFactory$Options();
          options.inJustDecodeBounds = true;
          options.inTempStorage = uByteBuffer.array();
          BitmapFactory.decodeStream(uof, pair, options);
          int i = -1;
          if (options.outWidth != i && options.outHeight != i) {
             pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
          }
          a.a(uByteBuffer);
          int i1 = c.a(Integer.parseInt(uExifInterfa.getAttribute("Orientation")));
          int i2 = (pair != null)? pair.first.intValue(): -1;
          if (pair != null) {
             i = pair.second.intValue();
          }
          a uoa = a.o(pooledByteBu);
          d uod = new d(uoa);
          a.f(uoa);
          uod.A(a.a);
          uod.C(i1);
          uod.g = i2;
          uod.h = i;
          pair = uod;
       }
       return pair;
    }
    public Map g(Object p0){
       boolean b = (p0 != null)? true: false;
       return ImmutableMap.of("createdThumbnail", Boolean.toString(b));
    }
}
