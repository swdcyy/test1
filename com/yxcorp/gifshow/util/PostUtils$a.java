package com.yxcorp.gifshow.util.PostUtils$a;
import com.yxcorp.utility.AsyncTask;
import java.io.File;
import erd.g;
import java.lang.Object;
import java.lang.Void;
import android.net.Uri;
import ekd.x0;
import android.app.Application;
import o56.a;
import android.content.ContentResolver;
import java.lang.String;
import com.kuaishou.gifshow.files.a;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.media.model.ImageConfig;
import q46.l;
import lnc.p3;
import q87.c;
import android.graphics.Bitmap;
import wkd.b;
import j80.c;
import qkd.b;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import java.io.OutputStream;
import oe6.a;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import android.content.Context;
import java.lang.Throwable;
import w46.b;

public class PostUtils$a extends AsyncTask	// class@001f22
{
    public final File p;
    public final g q;

    public void PostUtils$a(File p0,g p1){
       this.p = p0;
       this.q = p1;
       super();
    }
    public Object b(Object[] p0){
       int i1;
       Throwable throwable;
       Bitmap uBitmap;
       PostUtils$a tp;
       Uri uri = x0.e(this.p);
       int i = 0;
       try{
          i1 = 0;
          String str = a.d(a.b().getContentResolver(), uri);
          if (str != null) {
             b0 uob0 = BitmapUtil.E(str);
             int singleImageL = l.a().getSingleImageLongSide();
             if (uob0.a <= singleImageL && uob0.b <= singleImageL) {
                Object[] objArray1 = new Object[i];
                p3.D().w("PostUtils", "doInBackground: size not clip", objArray1);
                tp = this.p;
             }else {
                uBitmap = BitmapUtil.t(str, singleImageL, singleImageL, i);
                if (uBitmap == null) {
                   if (uBitmap == null || uBitmap.isRecycled()) {
                   label_00c7 :
                      return i1;
                   }
                }else {
                   int i2 = -1504323719;
                   try{
                      File uFile = b.Z(b.a(i2).o());
                      if (!uFile.exists() && !uFile.createNewFile()) {
                         if (uBitmap.isRecycled()) {
                         }
                      }else {
                         uBitmap.compress(Bitmap$CompressFormat.JPEG, 100, new FileOutputStream(uFile));
                         BitmapUtil.L(uFile, a.n(), 40);
                         y6.s(RecordPostPlugin.class, LoadPolicy.SILENT_IMMEDIATE).e().Oo(a.b(), uFile);
                         if (!uBitmap.isRecycled()) {
                            uBitmap.recycle();
                         }
                         tp = uFile;
                         goto label_00c7 ;
                      }
                   }catch(java.lang.Exception e2){
                   }
                   Object[] objArray = new Object[i];
                   p3.D().u("PostShareRouter", throwable, objArray);
                   if (!uBitmap || uBitmap.isRecycled()) {
                   }
                }
                uBitmap.recycle();
                goto label_00c7 ;
             }
          }
       }catch(java.lang.Exception e7){
          throwable = e7;
          uBitmap = i1;
          goto label_00b3 ;
       }
    }
    public void j(Object p0){
       try{
          this.q.accept(p0);
       }catch(java.lang.Exception e4){
          p3.D().e("PostUtils", "onPostExecute: ", e4);
       }
       return;
    }
}
