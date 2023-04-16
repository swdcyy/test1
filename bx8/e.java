package bx8.e;
import erd.o;
import bx8.j;
import java.io.File;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import f66.i;
import jq.a;
import java.lang.String;
import q87.c;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.System;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import ekd.s;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import com.yxcorp.gifshow.util.PostUtils;

public final class e implements o	// class@000473
{
    public final j b;
    public final boolean c;
    public final File d;

    public void e(j p0,boolean p1,File p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       String str;
       int i1;
       Object[] objArray4;
       j b1;
       int i2;
       File uFile2;
       e uoe = this;
       e b = uoe.b;
       e c = uoe.c;
       e d = uoe.d;
       List list = p0;
       Objects.requireNonNull(b);
       j oj = j.class;
       int i = 0;
       if (!list.size()) {
          Object[] objArray = new Object[i];
          a.b().w("AuditInfoUploadManager", "has no extract frames", objArray);
          str = "";
       }else {
          Object[] objArray1 = new Object[i];
          a.b().s("AuditInfoUploadManager", "fileUpload filePathList size: "+list.size(), objArray1);
          String str1 = "ad.zip";
          if (c != null) {
             String absolutePath = d.getAbsolutePath();
             if (!PatchProxy.applyVoidTwoRefs(absolutePath, list, b, oj, "11")) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Bitmap uBitmap = BitmapUtil.s(iterator.next());
                   int width = uBitmap.getWidth();
                   int height = uBitmap.getHeight();
                   if (!width || !height) {
                      objArray4 = new Object[0];
                      a.b().t("AuditInfoUploadManager", "saveImages bitmapWidth: "+width+", bitmapHeight: "+height, objArray4);
                   }else {
                      i oi = 1;
                      if (height > width) {
                         b1 = b.b;
                         if (width > b1) {
                            i2 = b1 * height;
                            i2 = i2 / width;
                         }else {
                         label_008e :
                            oi = null;
                            b1 = 0;
                            i2 = 0;
                         }
                      }else {
                         j b2 = b.b;
                         if (height > b2) {
                            int i3 = width * b2;
                            i3 = i3 / height;
                         }else {
                            goto label_008e ;
                         }
                      }
                      if (oi) {
                         uBitmap = Bitmap.createScaledBitmap(uBitmap, b1, i2, i);
                      }
                      objArray4 = new Object[0];
                      a.b().s("AuditInfoUploadManager", "origin bitmap width: "+width+", height: "+height+", compressed size: width: "+b1+", height: "+i2, objArray4);
                      File uFile1 = new File(absolutePath);
                      String str2 = System.currentTimeMillis()+".jpg";
                      try{
                         uFile2 = new File(uFile1, str2);
                         BitmapUtil.S(uBitmap, uFile2.getAbsolutePath(), b.c);
                      }catch(java.io.IOException e0){
                         Object[] objArray5 = new Object[0];
                         a.b().u("ExtractFrameInfoUploadManager", e0, objArray5);
                      }
                      objArray4 = new Object[0];
                      a.b().s("AuditInfoUploadManager", "compressImageSize: path: "+uFile2.getAbsolutePath(), objArray4);
                   }
                   i = null;
                }
             }
             str = d.getAbsolutePath();
             File obj = PatchProxy.applyOneRefs(str, b, oj, "12");
             if (obj != PatchProxyResult.class) {
                str = obj;
                i1 = 0;
             }else {
                obj = new File(str);
                File uFile = new File(str, str1);
                s.c(obj, uFile);
                i1 = 0;
                Object[] objArray3 = new Object[i1];
                a.b().s("AuditInfoUploadManager", "zipFiles: sourceDir: "+obj.getAbsolutePath()+", zipDstFile: "+uFile, objArray3);
                str = uFile.getAbsolutePath();
             }
             Object[] objArray2 = new Object[i1];
             a.b().s("AuditInfoUploadManager", "fileUpload zipFilePath: "+str, objArray2);
          }else {
             i1 = 0;
             uFile2 = new File(d.getParent(), str1);
             if (!PatchProxy.applyVoidTwoRefs(d, uFile2, b, oj, "14")) {
                ZipOutputStream zipOutputStr = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(uFile2)));
                LinkedList linkedList = new LinkedList();
                if (d.isDirectory()) {
                   File[] uFileArray = d.listFiles();
                   if (uFileArray != null) {
                      int len = uFileArray.length;
                      for (; i1 < len; i1 = i1 + 1) {
                         b.a(zipOutputStr, uFileArray[i1], linkedList);
                      }
                   }
                }
                try{
                   zipOutputStr.close();
                }catch(java.lang.Exception e0){
                   PostUtils.D("AuditInfoUploadManager", "close", e0);
                }
             }
          }
       }
       return str;
    }
}
