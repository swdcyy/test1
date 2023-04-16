package com.kwai.video.westeros.helpers.ResourceLoader;
import java.lang.Object;
import android.content.Context;
import android.content.res.AssetManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import android.graphics.Bitmap;
import java.lang.Integer;
import android.graphics.BitmapFactory$Options;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.os.Build$VERSION;
import android.media.ExifInterface;
import android.graphics.Matrix;
import com.kwai.video.westeros.helpers.ResourceLoader$Image;
import android.graphics.Bitmap$Config;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.lang.Exception;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Scanner;

public class ResourceLoader	// class@000e83
{
    public final String TAG;
    public AssetManager assetManager;
    public String assetPath;
    public Context context;
    public static final int IMAGE_TYPE_NONE = 0;
    public static final int IMAGE_TYPE_RGBA = 2;
    public static final int IMAGE_TYPE_TEXTURE = 1;

    public void ResourceLoader(){
       super();
       this.TAG = "ResourceLoader";
       this.assetPath = "";
    }
    public void ResourceLoader(Context p0){
       super();
       this.TAG = "ResourceLoader";
       this.assetManager = p0.getAssets();
       this.context = p0;
    }
    public final String getAssetPath(){
       ResourceLoader obj = PatchProxy.apply(null, this, ResourceLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.assetPath == null) {
          obj = this.context;
          if (obj != null) {
             File externalFile = obj.getExternalFilesDir(null);
             if (externalFile == null) {
                externalFile = this.context.getFilesDir();
             }
             this.assetPath = externalFile.getAbsolutePath();
          }else {
             this.assetPath = "";
          }
       }
       return this.assetPath;
    }
    public String getAssetPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ResourceLoader.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getAssetPath()+p0;
    }
    public byte[] loadData(String p0,boolean p1){
       byte[] obj;
       byte[] uobyteArray;
       ResourceLoader resourceLoad = ResourceLoader.class;
       if (PatchProxy.isSupport(resourceLoad)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, resourceLoad, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       InputStream inputStream = (p1)? SplitAssetHelper.open(this.assetManager, p0): new FileInputStream(p0);
       int i1 = 0;
       try{
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          try{
             i1 = 1024;
             byte[] uobyteArray1 = new byte[i1];
             int i2 = inputStream.read(uobyteArray1);
             while (i2 != -1) {
                uByteArrayOu.write(uobyteArray1, i, i2);
             }
             uByteArrayOu.flush();
             uobyteArray1 = uByteArrayOu.toByteArray();
             try{
                uByteArrayOu.close();
             }catch(java.io.IOException e0){
                e0.printStackTrace();
             }
             try{
                inputStream.close();
             }catch(java.io.IOException e5){
                e5.printStackTrace();
             }
             return uobyteArray1;
          }catch(java.io.IOException e0){
             ByteArrayOutputStream uByteArrayOu1 = uByteArrayOu;
             obj = new byte[e0];
             if (i1) {
                try{
                   i1.close();
                }catch(java.io.IOException e6){
                   e6.printStackTrace();
                }
             }
          }
       }catch(java.io.IOException e0){
       }
    }
    public Bitmap loadImageToBitmap(String p0,int p1,boolean p2){
       BitmapFactory$Options obj;
       int this;
       Bitmap uBitmap;
       if (PatchProxy.isSupport(ResourceLoader.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, ResourceLoader.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new BitmapFactory$Options();
       boolean b = true;
       Rect rect = null;
       if (p1 > 0) {
          obj.inJustDecodeBounds = b;
          if (p2) {
             try{
                BitmapFactory.decodeStream(SplitAssetHelper.open(this.assetManager, p0), rect, obj);
             }catch(java.io.IOException e11){
                e11.printStackTrace();
                return rect;
             }
          }else if(new File(p0).exists()){
             BitmapFactory.decodeFile(p0, obj);
          }
          BitmapFactory$Options outWidth = obj.outWidth;
          obj = obj.outHeight;
          this = 1;
          int i = outWidth / this;
          while (i > p1) {
          label_0058 :
             this = this * 2;
          }
          i = obj / this;
          if (i > p1) {
             goto label_0058 ;
          }
       }else {
          this = 1;
       }
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inJustDecodeBounds = false;
       options.inSampleSize = this;
       if (p2) {
          try{
             InputStream inputStream = SplitAssetHelper.open(this.assetManager, p0);
             uBitmap = BitmapFactory.decodeStream(inputStream, rect, options);
             if (Build$VERSION.SDK_INT >= 24) {
                rect = new ExifInterface(inputStream);
             }
          }catch(java.io.IOException e12){
             e12.printStackTrace();
          }
          uBitmap = rect;
       }else if(new File(p0).exists()){
          uBitmap = BitmapFactory.decodeFile(p0, options);
       }else {
          goto label_0094 ;
       }
       try{
          if (rect == null) {
             rect = new ExifInterface(p0);
          }
          int attributeInt = rect.getAttributeInt("Orientation", b);
          if (attributeInt > b && uBitmap != null) {
             Matrix matrix = new Matrix();
             float f = 0xbf800000;
             switch (attributeInt){
                 case 2:
                   matrix.setScale(f, 0x3f800000);
                   break;
                 case 3:
                   matrix.setRotate(180.00f);
                   break;
                 case 4:
                   matrix.setRotate(180.00f);
                   matrix.postScale(f, 0x3f800000);
                   break;
                 case 5:
                   matrix.setRotate(90.00f);
                   matrix.postScale(f, 0x3f800000);
                   break;
                 case 6:
                   matrix.setRotate(90.00f);
                   break;
                 case 7:
                   matrix.setRotate(-90.00f);
                   matrix.postScale(f, 0x3f800000);
                   break;
                 case 8:
                   matrix.setRotate(-90.00f);
                   break;
                 default:
                   return uBitmap;
             }
             uBitmap.recycle();
             return Bitmap.createBitmap(uBitmap, 0, 0, uBitmap.getWidth(), uBitmap.getHeight(), matrix, true);
          }else {
             return uBitmap;
          }
       }catch(java.io.IOException e0){
       }catch(java.lang.OutOfMemoryError e0){
       }
    }
    public ResourceLoader$Image loadImageToRGBA(String p0,int p1,boolean p2){
       Bitmap$Config obj;
       if (PatchProxy.isSupport(ResourceLoader.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, ResourceLoader.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Bitmap uBitmap = this.loadImageToBitmap(p0, p1, p2);
       ResourceLoader$Image image = new ResourceLoader$Image();
       if (uBitmap == null) {
          image.type = 0;
          return image;
       }else {
          obj = Bitmap$Config.ARGB_8888;
          if (uBitmap.getConfig() != obj) {
             uBitmap.recycle();
             uBitmap = uBitmap.copy(obj, true);
          }
          ByteBuffer uByteBuffer = ByteBuffer.allocate(uBitmap.getByteCount());
          uBitmap.copyPixelsToBuffer(uByteBuffer);
          image.type = 2;
          image.buffer = uByteBuffer.array();
          image.width = uBitmap.getWidth();
          image.height = uBitmap.getHeight();
          return image;
       }
    }
    public ResourceLoader$Image loadImageToTexture(String p0,int p1,boolean p2){
       Bitmap uBitmap;
       int i2;
       if (PatchProxy.isSupport(ResourceLoader.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, ResourceLoader.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       try{
          uBitmap = this.loadImageToBitmap(p0, p1, p2);
          ResourceLoader$Image image = new ResourceLoader$Image();
          if (uBitmap == null) {
             image.type = i;
             return image;
          }else {
             int i1 = 1;
             int[] ointArray = new int[i1];
             GLES20.glGenTextures(i1, ointArray, i);
             GLES20.glActiveTexture(0x84c0);
             i2 = ointArray[i];
             GLES20.glBindTexture(3553, i2);
             GLUtils.texImage2D(3553, i, uBitmap, i);
             i2 = 1;
          }
       }catch(java.lang.Exception e0){
          ResourceLoader$Image image1 = new ResourceLoader$Image();
          image1.type = e0;
          return image1;
       }catch(java.lang.Exception e2){
          e2.toString();
          i2 = 0;
       }
       if (!i2 && (uBitmap.getWidth() > 0 && (uBitmap.getHeight() > 0 && !uBitmap.isRecycled()))) {
          Bitmap uBitmap1 = Bitmap.createBitmap(uBitmap.getWidth(), uBitmap.getHeight(), Bitmap$Config.ARGB_8888);
          Canvas uCanvas = new Canvas(uBitmap1);
          try{
             uCanvas.drawBitmap(uBitmap, 0, 0, null);
             GLUtils.texImage2D(3553, i, uBitmap1, i);
             uBitmap = uBitmap1;
             i2 = 1;
          }catch(java.lang.Exception e9){
             e9.toString();
             uBitmap = uBitmap1;
          }
       }
    }
    public String loadText(String p0,boolean p1){
       String obj;
       ResourceLoader resourceLoad = ResourceLoader.class;
       if (PatchProxy.isSupport(resourceLoad)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, resourceLoad, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       InputStream inputStream = (p1)? SplitAssetHelper.open(this.assetManager, p0): new FileInputStream(p0);
       Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
       if (scanner.hasNext()) {
          obj = scanner.next();
       }
       scanner.close();
       return obj;
    }
}
