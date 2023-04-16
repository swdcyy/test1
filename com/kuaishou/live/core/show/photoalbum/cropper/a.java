package com.kuaishou.live.core.show.photoalbum.cropper.a;
import android.os.AsyncTask;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView;
import android.graphics.Bitmap;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$RequestSizeOptions;
import android.net.Uri;
import android.graphics.Bitmap$CompressFormat;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.content.Context;
import android.widget.FrameLayout;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.photoalbum.cropper.a$a;
import com.kuaishou.live.core.show.photoalbum.cropper.c$a;
import com.kuaishou.live.core.show.photoalbum.cropper.c;
import java.lang.Exception;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$b;
import android.graphics.Rect;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$c;

public final class a extends AsyncTask	// class@000d69
{
    public final WeakReference a;
    public final Bitmap b;
    public final Uri c;
    public final Context d;
    public final float[] e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final CropImageView$RequestSizeOptions p;
    public final Uri q;
    public final Bitmap$CompressFormat r;
    public final int s;

    public void a(CropImageView p0,Bitmap p1,float[] p2,int p3,boolean p4,int p5,int p6,int p7,int p8,boolean p9,boolean p10,CropImageView$RequestSizeOptions p11,Uri p12,Bitmap$CompressFormat p13,int p14){
       int i = this;
       super();
       i.a = new WeakReference(p0);
       i.d = p0.getContext();
       i.b = p1;
       i.e = p2;
       i.c = null;
       i.f = p3;
       i.i = p4;
       i.j = p5;
       i.k = p6;
       i.l = p7;
       i.m = p8;
       i.n = p9;
       i.o = p10;
       i.p = p11;
       i.q = p12;
       i.r = p13;
       i.s = p14;
       i.g = 0;
       i.h = 0;
    }
    public void a(CropImageView p0,Uri p1,float[] p2,int p3,int p4,int p5,boolean p6,int p7,int p8,int p9,int p10,boolean p11,boolean p12,CropImageView$RequestSizeOptions p13,Uri p14,Bitmap$CompressFormat p15,int p16){
       int i = this;
       super();
       i.a = new WeakReference(p0);
       i.d = p0.getContext();
       i.c = p1;
       i.e = p2;
       i.f = p3;
       i.i = p6;
       i.j = p7;
       i.k = p8;
       i.g = p4;
       i.h = p5;
       i.l = p9;
       i.m = p10;
       i.n = p11;
       i.o = p12;
       i.p = p13;
       i.q = p14;
       i.r = p15;
       i.s = p16;
       i.b = null;
    }
    public Object doInBackground(Object[] p0){
       c$a uoa1;
       c$a uoa2;
       Object obj = this;
       a$a uoa = PatchProxy.applyOneRefs(p0, obj, a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          boolean i = 1;
          try{
             uoa1 = null;
             if (!this.isCancelled()) {
                a c = obj.c;
                if (c != null) {
                   uoa2 = c.d(obj.d, c, obj.e, obj.f, obj.g, obj.h, obj.i, obj.j, obj.k, obj.l, obj.m, obj.n, obj.o);
                }else {
                   a b = obj.b;
                   if (b != null) {
                      uoa2 = c.f(b, obj.e, obj.f, obj.i, obj.j, obj.k, obj.n, obj.o);
                   }else {
                      uoa = new a$a(uoa1, i);
                   }
                }
                Bitmap uBitmap = c.w(uoa2.a, obj.l, obj.m, obj.p);
                a q = obj.q;
                if (q == null) {
                   uoa = new a$a(uBitmap, uoa2.b);
                }else {
                   c.z(obj.d, uBitmap, q, obj.r, obj.s);
                   if (uBitmap != null) {
                      uBitmap.recycle();
                   }
                   uoa1 = new a$a(obj.q, uoa2.b);
                }
             }
          }catch(java.lang.Exception e0){
             if (obj.q == null) {
                i = false;
             }
             uoa1 = new a$a(e0, i);
          }
          uoa = uoa1;
       }
       return uoa;
    }
    public void onPostExecute(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
       }else if(p0 != null){
          CropImageView uCropImageVi = null;
          if (!this.isCancelled()) {
             CropImageView uCropImageVi1 = this.a.get();
             if (uCropImageVi1 != null) {
                if (!PatchProxy.applyVoidOneRefs(p0, uCropImageVi1, CropImageView.class, "46")) {
                   uCropImageVi1.J = null;
                   uCropImageVi1.h();
                   uCropImageVi = uCropImageVi1.y;
                   if (uCropImageVi != null) {
                      CropImageView$b uob = new CropImageView$b(uCropImageVi1.i, uCropImageVi1.z, p0.a, p0.b, p0.c, uCropImageVi1.getCropPoints(), uCropImageVi1.getCropRect(), uCropImageVi1.getWholeImageRect(), uCropImageVi1.getRotatedDegrees(), p0.e);
                      uCropImageVi.a(uCropImageVi1, v13);
                   }
                }
                uCropImageVi = 1;
             }
          }
          if (uCropImageVi == null) {
             p0 = p0.a;
             if (p0 != null) {
                p0.recycle();
             }
          }
       }
       return;
    }
}
