package com.yxcorp.gifshow.util.z;
import android.content.Context;
import java.lang.String;
import com.kwai.video.clipkit.log.ClipEditImageImportLog;
import java.lang.Object;
import gq.a;
import q87.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.StringBuilder;
import java.lang.Math;
import android.graphics.BitmapFactory$Options;
import java.io.File;
import java.lang.System;
import android.app.Application;
import o56.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.media.util.c;
import mca.a;
import com.kwai.video.clipkit.log.ClipEditLogger;
import java.util.UUID;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;
import android.graphics.Bitmap$Config;
import android.graphics.ColorSpace$Named;
import android.graphics.ColorSpace;
import android.graphics.BitmapFactory;
import com.kwai.feature.post.api.core.model.GSConfig;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import qkd.b;
import com.yxcorp.gifshow.media.util.h;

public class z	// class@001fc2
{
    public Context a;
    public ClipEditImageImportLog b;
    public String c;

    public void z(Context p0,String p1,ClipEditImageImportLog p2){
       super();
       this.c = "";
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosHelper", "MultiplePhotosHelper", objArray);
       this.a = p0;
       this.c = p1;
       this.b = p2;
    }
    public static void a(Size p0,Size p1){
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosHelper", "calculateCropSize inSize:"+p0+",maxSize:"+p1, objArray);
       Size b = p0.b;
       Size b1 = p1.b;
       if (b > b1 || p0.c > p1.c) {
          float f = Math.min(((float)b1 / (float)b), ((float)p1.c / (float)p0.c));
          p0.b = (int)((float)p0.b * f);
          p0.c = (int)((float)p0.c * f);
       }
       return;
    }
    public static String b(String p0,BitmapFactory$Options p1,Size p2,File p3,boolean p4,String p5){
       ClipEditImageImportLog uClipEditIma;
       String str = p0;
       Object obj = p1;
       String obj1 = p2;
       Object obj2 = p3;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MultiplePhotosHelper", "covertGifToJpg originImageUrl:"+str+",originImageOption:"+obj+",maxSize:"+obj1+",outputFolder:"+obj2, objArray);
       long l = System.currentTimeMillis();
       if (p4) {
          uClipEditIma = new ClipEditImageImportLog();
          uClipEditIma.mSingleImport = true;
          double d = 1024.00f;
          uClipEditIma.mDeviceMemory = ((double)z.j(a.b()) / d) / d;
          uClipEditIma.mAtlasLongSide = obj1.b;
          uClipEditIma.insertOriginSize(str, obj.outWidth, obj.outHeight);
          uClipEditIma.mSuccess = true;
       }else {
          uClipEditIma = false;
       }
       if (z.l(p0, p1)) {
          File uFile = new File(obj2, z.d());
          Bitmap uBitmap = BitmapUtil.w(str, obj1.b, obj1.c, i, z.e());
          if (uBitmap != null) {
             Bitmap uBitmap1 = c.c(null, uBitmap, uBitmap.getWidth(), uBitmap.getHeight(), 100, uFile.getAbsolutePath(), true, true);
             obj1 = uFile.getAbsolutePath();
             Object[] objArray1 = new Object[i];
             a.D().w("MultiplePhotosHelper", "gif to jpg,path:"+obj1, objArray1);
             if (p4 && uClipEditIma) {
                uClipEditIma.insertLongCropSize(uFile.getAbsolutePath(), uBitmap1.getWidth(), uBitmap1.getHeight());
             }
             str = obj1;
             i = 1;
          }
       }
       if (p4 && uClipEditIma) {
          if (!i) {
             uClipEditIma.insertLongCropSize(str, obj.outWidth, obj.outHeight);
          }
          uClipEditIma.mImageEditStrategy = a.x();
          uClipEditIma.mCostTime = System.currentTimeMillis() - l;
          ClipEditLogger.reportImageImportLog(p5, uClipEditIma);
       }
       return str;
    }
    public static String d(){
       return "tmp_"+UUID.randomUUID().toString()+".jpg";
    }
    public static boolean e(){
       boolean b = (Build$VERSION.SDK_INT >= 26 && !RomUtils.w())? true: false;
       return b;
    }
    public static boolean f(Bitmap p0){
       boolean b = (Build$VERSION.SDK_INT >= 26 && (!RomUtils.w() || (RomUtils.w() && p0.getConfig() == Bitmap$Config.RGBA_F16)))? true: false;
       return b;
    }
    public static boolean g(BitmapFactory$Options p0){
       if (p0 == null) {
          return z.e();
       }
       boolean b = (Build$VERSION.SDK_INT >= 26 && (!RomUtils.w() || (RomUtils.w() && p0.outColorSpace == ColorSpace.get(ColorSpace$Named.DISPLAY_P3))))? true: false;
       return b;
    }
    public static BitmapFactory$Options h(String p0){
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inJustDecodeBounds = true;
       BitmapFactory.decodeFile(p0, options);
       if (z.e()) {
          options.inPreferredColorSpace = ColorSpace.get(ColorSpace$Named.SRGB);
       }
       return options;
    }
    public static int i(){
       return GSConfig.a();
    }
    public static long j(Context p0){
       if (p0 != null) {
          ActivityManager systemServic = p0.getSystemService("activity");
          if (systemServic != null) {
             ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
             systemServic.getMemoryInfo(memoryInfo);
             return memoryInfo.totalMem;
          }
       }
       return 0;
    }
    public static boolean k(int p0,int p1,int p2){
       boolean b = true;
       if (p2 <= 0) {
          p2 = 1;
       }
       if (((((long)(p0 / p2) * 1) * (long)(p1 / p2)) * 4) - 0x2328000 <= 0) {
          b = false;
       }
       return b;
    }
    public static boolean l(String p0,BitmapFactory$Options p1){
       boolean b;
       p0 = '.'+b.z(new File(p0).getName());
       b = (("image/gif").equals(p1.outMimeType) || (".gif").equals(p0))? true: false;
       return b;
    }
    public static boolean m(Context p0){
       boolean b = false;
       if (p0 != null && z.j(p0) - 0x80000000 <= 0) {
          b = true;
       }
       return b;
    }
    public static boolean n(String p0){
       boolean b = (h.b(p0) > 0)? true: false;
       return b;
    }
    public static Bitmap o(Bitmap p0,Size p1){
       if (p0.getWidth() <= p1.b && p0.getHeight() <= p1.c) {
          return p0;
       }
       float f = Math.min(((float)p1.b / (float)p0.getWidth()), ((float)p1.c / (float)p0.getHeight()));
       return Bitmap.createScaledBitmap(p0, (int)Math.ceil((double)((float)p0.getWidth() * f)), (int)Math.ceil((double)(f * (float)p0.getHeight())), true);
    }
    public final String c(){
       return "lp_"+UUID.randomUUID().toString()+".jpg";
    }
}
