package com.kwai.video.clipkit.utils.Utils;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.math.BigDecimal;
import android.graphics.Bitmap;
import java.lang.Boolean;
import java.io.File;
import com.kwai.video.clipkit.utils.Utils$Size;
import android.graphics.BitmapFactory$Options;
import java.lang.Math;
import android.os.Build$VERSION;
import android.graphics.ColorSpace$Named;
import android.graphics.ColorSpace;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.os.StatFs;
import android.os.Environment;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceDetectOut;
import com.kwai.video.clipkit.utils.FaceUtils;
import java.util.LinkedList;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceInfo;
import com.kwai.video.westeros.models.MmuFace;
import com.kwai.video.westeros.models.MmuResourceConfig;
import com.kwai.video.westeros.mmuplugin.MmuPlugin;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.lang.StringBuilder;
import java.io.IOException;
import android.media.ExifInterface;
import java.lang.Exception;
import java.util.Locale;

public class Utils	// class@001afe
{

    public void Utils(){
       super();
    }
    public static double cutDoubleToNDecimalPlaces(double p0,int p1){
       Utils utils = Utils.class;
       if (PatchProxy.isSupport(utils)) {
          Object obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), Integer.valueOf(p1), null, utils, "9");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       if (p1 <= 0) {
          return p0;
       }else {
          return new BigDecimal(p0).setScale(p1, 1).doubleValue();
       }
    }
    public static Bitmap decodeFile(String p0,int p1,int p2,boolean p3){
       Bitmap obj;
       if (PatchProxy.isSupport(Utils.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), null, Utils.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p0 == null || !new File(p0).exists()) {
          return obj;
       }else {
          Utils.getSize(p0);
          BitmapFactory$Options options = new BitmapFactory$Options();
          if (p1 > 0 && p2 > 0) {
             int width = Utils$Size.width;
             if (width > p1 || Utils$Size.height > p2) {
                width = (p3)? Math.min((width / p1), (Utils$Size.height / p2)): Math.max((width / p1), (Utils$Size.height / p2));
                options.inSampleSize = Utils.getRightInSampleSize(width);
             }
          }
          if (Build$VERSION.SDK_INT >= 26) {
             options.inPreferredColorSpace = ColorSpace.get(ColorSpace$Named.SRGB);
          }
          Bitmap uBitmap = BitmapFactory.decodeFile(p0, options);
          if (uBitmap == null) {
             return obj;
          }else {
             Bitmap bitmapWithRo = Utils.getBitmapWithRotate(p0, uBitmap);
             if (p1 > 0 && p2 > 0) {
                int width1 = bitmapWithRo.getWidth();
                int height = bitmapWithRo.getHeight();
                if (p3) {
                   if (width1 != p1 || height != p2) {
                      bitmapWithRo = Bitmap.createScaledBitmap(bitmapWithRo, p1, p2, true);
                   }
                }else if(width1 > p1 || height > p2){
                   Rect rectWithRati = Utils$Size.getRectWithRatioKept((long)width1, (long)height, (long)p1, (long)p2);
                   p2 = rectWithRati.width();
                   bitmapWithRo = Bitmap.createScaledBitmap(bitmapWithRo, p2, rectWithRati.height(), true);
                }
             }
             return bitmapWithRo;
          }
       }
    }
    public static Bitmap getBitmapWithRotate(String p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Utils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = new String[]{"jpg","jpeg","png",".heic","heif"};
       if (Utils.isVaildPictureFormat(Utils.toLowerCase(p0), stringArray)) {
          int i = Utils.readPictureDegree(p0);
          if (i) {
             Matrix matrix = new Matrix();
             matrix.setRotate((float)i);
             Bitmap uBitmap = Bitmap.createBitmap(p1, 0, 0, p1.getWidth(), p1.getHeight(), matrix, false);
             if (uBitmap != p1) {
                p1.recycle();
             }
             p1 = uBitmap;
          }
       }
       return p1;
    }
    public static long getDirectoryAvailableSpace(File p0){
       StatFs obj = PatchProxy.applyOneRefs(p0, null, Utils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = new StatFs(p0.getPath());
       return (obj.getBlockSizeLong() * obj.getAvailableBlocksLong());
    }
    public static long getDirectoryTotalSpace(File p0){
       StatFs obj = PatchProxy.applyOneRefs(p0, null, Utils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = new StatFs(p0.getPath());
       return (obj.getBlockSizeLong() * obj.getBlockCountLong());
    }
    public static int getRightInSampleSize(int p0){
       int i = 1;
       int i1 = i * 2;
       while (i1 <= p0) {
          i = i1;
       }
       return i;
    }
    public static long getRomAvailableSpace(){
       Object obj = PatchProxy.apply(null, null, Utils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Utils.getDirectoryAvailableSpace(Environment.getDataDirectory());
    }
    public static long getRomTotalSpace(){
       Object obj = PatchProxy.apply(null, null, Utils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Utils.getDirectoryTotalSpace(Environment.getDataDirectory());
    }
    public static Utils$Size getSize(String p0){
       BitmapFactory$Options obj = PatchProxy.applyOneRefs(p0, null, Utils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BitmapFactory$Options();
       obj.inJustDecodeBounds = true;
       BitmapFactory.decodeFile(p0, obj);
       int i = Utils.readPictureDegree(p0);
       if (i == 90 || i == 270) {
          return new Utils$Size(obj.outHeight, obj.outWidth);
       }
       return new Utils$Size(obj.outWidth, obj.outHeight);
    }
    public static boolean isVaildPictureFormat(String p0,String[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Utils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       p0 = Utils.toLowerCase(p0);
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p0.endsWith(Utils.toLowerCase(p1[i]))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static Bitmap preProcessBitmapForFaceBlend(String p0,String p1,String p2,Context p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, Utils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = false;
       Bitmap uBitmap = Utils.decodeFile(p0, 1280, 1280, b);
       if (uBitmap == null) {
          return null;
       }
       YCNNModelInfo$KSFaceDetectOut faceDetect = FaceUtils.getFaceDetect(uBitmap);
       faceDetect.faces.size();
       if (faceDetect.faces.isEmpty()) {
          uBitmap.recycle();
          return null;
       }else {
          MmuFace mmuFace = FaceUtils.mmuFaceFromYCNNFace(faceDetect.faces.get(b));
          MmuResourceConfig mmuResourceC = FaceUtils.getMmuResourceConfig(p1, p2);
          if (mmuResourceC == null) {
             return null;
          }
          uBitmap.recycle();
          return MmuPlugin.getFaceReplacedBitmap(uBitmap, mmuFace, mmuResourceC, p3);
       }
    }
    public static String readContent(File p0){
       BufferedReader obj = PatchProxy.applyOneRefs(p0, null, Utils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.exists()) {
          return null;
       }
       try{
          obj = new BufferedReader(new InputStreamReader(new FileInputStream(p0)));
          StringBuilder str = "";
          try{
             String str1 = obj.readLine();
             while (str1 != null) {
                str = str+str1+"\n";
             }
             try{
                obj.close();
                return str;
             }catch(java.io.IOException e0){
                return v1;
             }
          }catch(java.io.IOException e4){
             e4.printStackTrace();
             return null;
          }
       }catch(java.io.FileNotFoundException e0){
       }
    }
    public static int readPictureDegree(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Utils.class, "5");
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
    public static String toLowerCase(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Utils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return p0;
       }
       return p0.toLowerCase(Locale.US);
    }
}
