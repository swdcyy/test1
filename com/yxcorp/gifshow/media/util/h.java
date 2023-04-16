package com.yxcorp.gifshow.media.util.h;
import java.lang.Object;
import java.io.File;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.n0;
import qkd.b;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.lang.Number;
import android.media.ExifInterface;
import java.lang.Exception;
import android.content.Context;
import java.lang.Integer;
import android.graphics.Bitmap$CompressFormat;
import com.yxcorp.gifshow.media.util.c;
import java.io.IOException;
import java.lang.Throwable;
import java.io.FileOutputStream;
import java.io.OutputStream;
import ekd.p;

public final class h	// class@001d27
{

    public void h(){
       super();
    }
    public static Bitmap a(File p0){
       Bitmap uBitmap = null;
       String obj = PatchProxy.applyOneRefs(p0, uBitmap, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.exists()) {
          obj = n0.d(p0.getAbsolutePath());
          if (b.M(obj) || b.O(obj)) {
             uBitmap = BitmapFactory.decodeFile(p0.getAbsolutePath());
             int i = h.b(p0.getAbsolutePath());
             if (i) {
                Matrix matrix = new Matrix();
                matrix.setRotate((float)i);
                uBitmap = Bitmap.createBitmap(uBitmap, 0, 0, uBitmap.getWidth(), uBitmap.getHeight(), matrix, false);
             }
          }
       }
       return uBitmap;
    }
    public static int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       try{
          int attributeInt = new ExifInterface(p0).getAttributeInt("Orientation", 1);
          if (attributeInt != 3) {
             if (attributeInt != 6) {
                if (attributeInt == 8) {
                   i = 270;
                }
             }else {
                i = 90;
             }
          }else {
             i = 180;
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return i;
    }
    public static void c(Context p0,Bitmap p1,String p2,int p3){
       Bitmap$CompressFormat jPEG;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, h.class, "2")) {
          return;
       }
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{"post_album_tool",p0,p1,p2,Integer.valueOf(p3)};
          if (!PatchProxy.applyVoid(objArray, null, oh, "3")) {
          label_0043 :
             String str = n0.d(p2);
             if (b.M(str)) {
                jPEG = Bitmap$CompressFormat.JPEG;
             }else if(b.O(str)){
                jPEG = Bitmap$CompressFormat.PNG;
             }else {
                throw new IOException("Unknown file extension");
             }
             if (jPEG == Bitmap$CompressFormat.JPEG) {
                try{
                   c.d("post_album_tool", p0, p1, p1.getWidth(), p1.getHeight(), p3, p2, true);
                }catch(com.kwai.video.videoprocessor.JpegBuilderException e10){
                   throw new IOException(e10);
                }
             }else {
                FileOutputStream uFileOutputS = new FileOutputStream(p2);
                p1.compress(jPEG, p3, uFileOutputS);
                p.d(uFileOutputS);
             }
          }
       }else {
          goto label_0043 ;
       }
       return;
    }
    public static void d(Bitmap p0,String p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, h.class, "1")) {
          return;
       }
       h.c(null, p0, p1, p2);
       return;
    }
}
