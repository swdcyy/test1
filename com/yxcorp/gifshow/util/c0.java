package com.yxcorp.gifshow.util.c0;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager;
import com.kwai.video.clipkit.log.ClipEditImageImportLog;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo;
import com.yxcorp.gifshow.model.MultiplePhotosProject;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.util.z;
import android.content.Context;
import java.lang.String;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import mca.a;
import android.app.Application;
import o56.a;
import com.kwai.video.clipkit.utils.Utils$Size;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import android.graphics.BitmapFactory$Options;
import com.yxcorp.gifshow.media.util.h;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.io.File;
import android.graphics.Matrix;
import com.yxcorp.gifshow.util.z$g;
import java.lang.Math;
import com.yxcorp.gifshow.util.z$b;
import com.yxcorp.gifshow.util.z$d;
import com.yxcorp.gifshow.util.z$c;
import com.yxcorp.gifshow.util.z$e;
import com.yxcorp.gifshow.util.z$a;
import qkd.b;
import android.graphics.Rect;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$b$a;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$b;
import com.yxcorp.gifshow.model.MultiplePhotosProject$a;
import java.util.Iterator;
import java.util.UUID;
import java.util.Collection;
import com.yxcorp.gifshow.model.MultiplePhotosProject$b;
import com.yxcorp.gifshow.model.MultiplePhotosProject$Type;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo$Status;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType;
import lnc.e5;
import brd.t;
import brd.z;
import java.lang.Boolean;

public final class c0 implements Callable	// class@001f5e
{
    public final MultiplePhotosWorkManager b;
    public final ClipEditImageImportLog c;
    public final MultiplePhotosWorkManager$CropWorkInfo d;
    public final MultiplePhotosProject e;
    public final List f;

    public void c0(MultiplePhotosWorkManager p0,ClipEditImageImportLog p1,MultiplePhotosWorkManager$CropWorkInfo p2,MultiplePhotosProject p3,List p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       boolean width;
       int i4;
       BitmapFactory$Options outHeight;
       c0 uoc01;
       c0 uoc02;
       c0 uoc03;
       Size size;
       Matrix matrix;
       z oz2;
       BitmapFactory$Options options2;
       String str11;
       object oobject1;
       BitmapFactory$Options options3;
       z$g og1;
       z$b uob;
       String str14;
       String absolutePath;
       z$g og2;
       int i8;
       String str15;
       MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf1;
       Size size3;
       MultiplePhotosProject$a uoa1;
       Iterator iterator;
       Object[] objArray4;
       z oz3;
       c0 uoc05;
       Matrix matrix2;
       Object[] objArray6;
       c0 uoc0 = this;
       c0 b = uoc0.b;
       c0 d = uoc0.d;
       c0 e = uoc0.e;
       c0 f = uoc0.f;
       z oz = new z(b.a, b.e, uoc0.c);
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosHelper", "onPreloadCropWorkInfo cropWorkInfo:"+d, objArray);
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       double d1 = 1024.00f;
       oz.b.mDeviceMemory = ((double)z.j(oz.a) / d1) / d1;
       z b1 = oz.b;
       if (a.x()) {
          ClipKitConfigManager.getAtlasPreviewSize(a.b());
          width = Utils$Size.width;
       }else {
          width = z.i();
       }
       b1.mAtlasLongSide = width;
       b1 = oz.b;
       b1.mMaxImageMemory = 35.16f;
       b1.mMinCheckScale = 2.78f;
       int i = -1;
       MultiplePhotosWorkManager$CropWorkInfo b2 = d.b;
       boolean len = b2.length;
       z oz1 = oz;
       int i1 = 0;
       while (i1 < len) {
          object oobject = b2[i1];
          i = i + 1;
          int i2 = i1;
          int i3 = i;
          Object[] objArray1 = new Object[0];
          a.D().w("MultiplePhotosHelper", "onPreloadCropWorkInfo index:"+i+",photo:"+oobject, objArray1);
          MultiplePhotosWorkManager$CropWorkInfo c = d.c;
          BitmapFactory$Options options = z.h(oobject);
          i1 = h.b(oobject);
          width = i1 % 180;
          MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf = b2;
          width = (width == 90)? true: false;
          BitmapFactory$Options outWidth = (width)? options.outWidth: options.outHeight;
          if (width) {
             i4 = len;
             outHeight = options.outHeight;
          }else {
             i4 = len;
             outHeight = options.outWidth;
          }
          if (a.x()) {
             ClipKitConfigManager.getAtlasPreviewSize(a.b());
             uoc01 = f;
             uoc02 = b;
             uoc03 = e;
             size = new Size(Utils$Size.width, Utils$Size.height);
          }else {
             uoc02 = b;
             uoc03 = e;
             uoc01 = f;
             size = new Size(z.i(), z.i());
          }
          String str = z.b(oobject, options, size, c, false, "");
          c0 uoc04 = d;
          ArrayList uArrayList2 = uArrayList1;
          String str1 = ",degree:";
          String str2 = ",widthHeightReverse:";
          boolean b3 = width;
          ArrayList uArrayList3 = uArrayList;
          String str3 = ",maxSize:";
          String str4 = ",photoOriginHeight:";
          String str5 = ",photoOriginWidth:";
          objArray = new Object[0];
          a.D().w("MultiplePhotosHelper", "getCropWorkInfosForSinglePhoto originImageUrl:"+oobject+",outputFolder:"+c+",originImageOption:"+options+str1+i1+",widthHeightReverse:"+width+",photoOriginHeight:"+outWidth+",photoOriginWidth:"+outHeight+str3+size+",finalOriginImageUrl:"+str, objArray);
          oz1.b.insertOriginSize(oobject, outHeight, outWidth);
          float f1 = (float)outHeight;
          float f2 = (float)outWidth / f1;
          String str6 = "getCropWorkInfosForSinglePhoto picName:";
          BitmapFactory$Options options1 = outWidth;
          String str7 = ",file:";
          String str8 = ",finalOutputFilepath:";
          if (f2 - 2.78f > 0) {
             float f3 = 0x3fe38e39;
             if (!a.x()) {
                f2 = (float)z.i() / f3;
                size.b = (int)f2;
             }
             if (i1) {
                matrix = new Matrix();
                matrix.setRotate((float)i1);
             }else if(MultiplePhotosWorkManager.e()){
                matrix = new Matrix();
             }else {
                options2 = null;
             }
             z$g og = options;
             String str9 = str2;
             String str10 = str6;
             boolean b4 = b3;
             oz2 = oz1;
             int i5 = i1;
             options2 = outHeight;
             str11 = str3;
             Size size1 = size;
             String str12 = str8;
             oobject1 = oobject;
             options3 = options1;
             String str13 = str7;
             og1 = new z$g(oz, str, matrix, size, 100);
             f1 = f1 * f3;
             int i6 = (int)Math.ceil((double)f1);
             if (i5 != 90) {
                if (i5 != 180) {
                   if (i5 != 270) {
                      b1 = oz2;
                      uob = new z$b(b1, options2, options3, i6);
                   }else {
                      b1 = oz2;
                      uob = new z$d(b1, options2, options3, i6);
                   }
                }else {
                   b1 = oz2;
                   uob = new z$c(b1, options2, options3, i6);
                }
             }else {
                b1 = oz2;
                uob = new z$e(b1, options2, options3, i6);
             }
             objArray = new Object[0];
             a.D().w("MultiplePhotosHelper", "getCropWorkInfosForSinglePhoto need crop LimitSize:"+z.i()+str1+i5+",deltaDistance:"+i6+",cropStrategy:"+uob, objArray);
             MultiplePhotosProject$a uoa = null;
             int i7 = 0;
             Rect rect = null;
             while (uob.c()) {
                str14 = oz.c();
                File uFile = new File(c, str14);
                absolutePath = uFile.getAbsolutePath();
                str1 = str12;
                oz2 = oz;
                Object[] objArray2 = new Object[0];
                a.D().w("MultiplePhotosHelper", "getCropWorkInfosForSinglePhoto cropStrategy valid picName:"+str14+str13+uFile+str1+absolutePath, objArray2);
                b.q(uFile);
                if (rect == null) {
                   rect = new Rect(uob.b());
                }
                og2 = og;
                og2.b.a(new MultiplePhotosWorkManager$b$a(absolutePath, uob.b()));
                len = b4;
                i8 = (len)? uob.b().height(): uob.b().width();
                int i9 = (len)? uob.b().width(): uob.b().height();
                Size size2 = new Size(i8, i9);
                str15 = str13;
                uCropWorkInf1 = c;
                z$b uob1 = uob;
                size3 = size1;
                Rect rect1 = rect;
                Object[] objArray3 = new Object[0];
                a.D().w("MultiplePhotosHelper", "getCropWorkInfosForSinglePhoto firstLongPictureTopRect:"+rect+str1+absolutePath+",picWidth:"+i8+",picHeight:"+i9+str9+len+",cropSize:"+size2+str11+size3+",index:"+i7, objArray3);
                z.a(size2, size3);
                size = size2.b;
                Size c1 = size2.c;
                uoa1 = new MultiplePhotosProject$a(str14, oobject1, i7, i8, i9, size, c1);
                b1.b.insertLongCropSize(str14, size, c1);
                if (uoa == null) {
                   uoa = c;
                }
                og2.d.add(c);
                uob1.a();
                i7 = i7 + 1;
                size1 = size3;
                str13 = str15;
                rect = rect1;
                c = uCropWorkInf1;
                oz = oz2;
                uob = uob1;
                og = og2;
                b4 = len;
                str12 = str1;
             }
             uCropWorkInf1 = c;
             oz2 = oz;
             og2 = og;
             str1 = str12;
             str15 = str13;
             iterator = og2.d.iterator();
             while (iterator.hasNext()) {
                iterator.next().b = i7;
             }
             String str16 = "hp_"+UUID.randomUUID().toString()+".jpg";
             File uFile1 = new File(uCropWorkInf1, str16);
             String absolutePath1 = uFile1.getAbsolutePath();
             objArray4 = new Object[0];
             a.D().w("MultiplePhotosHelper", str10+str16+str15+uFile1+str1+absolutePath1+",firstLongPictureTopRect:"+rect, objArray4);
             b.q(uFile1);
             og2.a.a(new MultiplePhotosWorkManager$b$a(absolutePath1, rect));
             uoa1 = new MultiplePhotosProject$a(str16, oobject1, 0, uoa.mWidth, uoa.mHeight, uoa.mCropWidth, uoa.mCropHeight);
             og2.c.add(absolutePath1);
             b1.b.insertAtlasCropSize(str16, uoa.mWidth, uoa.mHeight);
             oz3 = b1;
             og1 = og2;
             oz1 = oz2;
          }else {
             MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf2 = c;
             str11 = str3;
             size3 = size;
             b1 = oz1;
             int i10 = i1;
             options2 = outHeight;
             str1 = str8;
             oz2 = oz;
             oobject1 = oobject;
             options3 = options1;
             String str17 = str7;
             absolutePath = str6;
             Matrix matrix1 = new Matrix();
             if (i10) {
                matrix1 = new Matrix();
                matrix1.setRotate((float)i10);
             }else if(MultiplePhotosWorkManager.e()){
                matrix2 = new Matrix();
             label_045a :
                if (!a.x() && z.m(b1.a)) {
                   size = new Size(1920, 1920);
                   int i11 = 1;
                   while (z.k(options2, options3, i11)) {
                      i11 = i11 * 2;
                   }
                   i = options2 / i11;
                   size.b = Math.min(i, size.b);
                   i8 = options3 / i11;
                   size.c = Math.min(i8, size.c);
                   objArray6 = new Object[0];
                   a.D().w("MultiplePhotosHelper", "getCropWorkInfosForSinglePhoto isSmallRAMDevice maxSize:"+size+",sample:"+i11+str5+options2+str4+options3, objArray6);
                }else {
                   size = size3;
                }
                if (options3 <= size.c && (options2 > size.b || z.n(oobject1))) {
                   str3 = oz2.c();
                   File uFile2 = new File(uCropWorkInf2, str3);
                   str14 = uFile2.getAbsolutePath();
                   objArray4 = new Object[0];
                   a.D().w("MultiplePhotosHelper", absolutePath+str3+str17+uFile2+str1+str14, objArray4);
                   b.q(uFile2);
                }else {
                   objArray = new Object[0];
                   a.D().w("MultiplePhotosHelper", "getCropWorkInfosForSinglePhoto finalOutputFilepath:"+str+",picName:"+str, objArray);
                   str3 = str;
                   str14 = str3;
                }
                og1 = new z$g(oz2, str, matrix2, size, 100);
                oz.b.a(new MultiplePhotosWorkManager$b$a(str14, null));
                Size size4 = new Size(options2, options3);
                z.a(size4, size);
                String str18 = str3;
                object oobject2 = oobject1;
                options1 = options2;
                BitmapFactory$Options options4 = options3;
                uoa1 = new MultiplePhotosProject$a(str18, oobject2, 0, options1, options4, size4.b, size4.c);
                oz.d.add(oz1);
                oz1 = oz2;
                oz1.b.insertLongCropSize(str3, size4.b, size4.c);
                oz.a.a(new MultiplePhotosWorkManager$b$a(str14, null));
                uoa1 = new MultiplePhotosProject$a(str18, oobject2, 0, options1, options4, size4.b, size4.c);
                oz.c.add(og1);
                oz1.b.insertAtlasCropSize(str3, size4.b, size4.c);
                Object[] objArray5 = new Object[0];
                a.D().w("MultiplePhotosHelper", "getCropWorkInfosForSinglePhoto cropSize:"+size4+str11+size, objArray5);
                oz3 = oz1;
                og1 = oz;
             }
             matrix2 = matrix1;
             goto label_045a ;
          }
          ArrayList uArrayList4 = new ArrayList();
          uArrayList4.add(og1.b);
          uArrayList4.add(og1.a);
          ArrayList uArrayList5 = uArrayList3;
          uArrayList5.addAll(og1.d);
          ArrayList uArrayList6 = uArrayList2;
          uArrayList6.addAll(og1.c);
          uoc05 = uoc04;
          uoc05.d.addAll(uArrayList4);
          i1 = i2 + 1;
          uArrayList1 = uArrayList6;
          oz = oz1;
          i = i3;
          b2 = uCropWorkInf;
          len = i4;
          f = uoc01;
          b = uoc02;
          e = uoc03;
          oz1 = oz3;
          ArrayList uArrayList7 = uArrayList5;
          d = uoc05;
          uArrayList = uArrayList7;
       }
       uoc02 = b;
       uoc03 = e;
       uoc01 = f;
       objArray = null;
       uoc05 = d;
       oz1.b.mImageEditStrategy = a.x();
       uoc03.a();
       MultiplePhotosProject$Type lONGPICTURE = MultiplePhotosProject$Type.LONGPICTURE;
       MultiplePhotosProject$b uob2 = new MultiplePhotosProject$b(lONGPICTURE, uoc03.f());
       MultiplePhotosProject$Type aTLAS = MultiplePhotosProject$Type.ATLAS;
       MultiplePhotosProject$b uob3 = new MultiplePhotosProject$b(aTLAS, uoc03.f());
       uob2.mPictures.addAll(uArrayList);
       uob3.mPictures.addAll(uArrayList1);
       c0 uoc06 = uoc03;
       if (!PatchProxy.applyVoid(objArray, uoc06, MultiplePhotosProject.class, "12")) {
          uoc06.lastUpdateTime = System.currentTimeMillis();
          MultiplePhotosProject.j(uoc06, new File(uoc06.a, "config.bat"));
       }
       uob3.b();
       uob2.b();
       uoc06.i(aTLAS, uob3);
       uoc06.i(lONGPICTURE, uob2);
       Object[] objArray7 = new Object[0];
       a.D().w("MultiplePhotosWorkManager", "notifyPhotoCropTaskPrepared cropWorkInfo:"+uoc05, objArray7);
       uoc05.c(MultiplePhotosWorkManager$CropWorkInfo$Status.PREPARED);
       MultiplePhotosWorkManager$CropPhotoWorkEvent uCropPhotoWo = new MultiplePhotosWorkManager$CropPhotoWorkEvent(uoc05, MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Prepared, objArray);
       uCropPhotoWo.d = uoc06;
       RxBus.f.b(uCropPhotoWo);
       uoc05.c(MultiplePhotosWorkManager$CropWorkInfo$Status.PENDING);
       iterator = uoc05.d.iterator();
       while (iterator.hasNext()) {
          MultiplePhotosWorkManager$b uob4 = iterator.next();
          f = uoc02;
          uoc01.add(t.fromCallable(new e5(f, uob4, uoc05)).subscribeOn(f.d));
          objArray6 = new Object[0];
          a.D().A("MultiplePhotosWorkManager", "generatePhotoCropTasksFromWorkInfo singlePhotoCropTask:"+uob4, objArray6);
       }
       return Boolean.TRUE;
    }
}
