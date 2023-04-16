package com.kwai.emotionsdk.core.EmotionManagerDelegate$c;
import erd.g;
import com.kwai.emotionsdk.core.EmotionManagerDelegate;
import java.lang.Object;
import bk5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import kotlin.jvm.internal.a;
import ok5.a;
import java.io.File;
import ak5.j;
import ak5.a;
import ak5.a$c;
import com.kwai.emotionsdk.util.a;
import java.nio.charset.Charset;
import java.lang.System;
import java.util.zip.ZipFile;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nk5.m;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import ekd.p;
import android.text.TextUtils;
import java.io.IOException;
import jl5.h;
import ck5.m;
import dk5.b;
import java.util.Objects;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.util.Map;
import java.util.Iterator;
import com.kwai.emotionsdk.bean.EmotionInfo;
import dk5.b$a;
import android.graphics.Bitmap;
import dk5.a;
import jk5.c;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode;
import bk5.c;

public final class EmotionManagerDelegate$c implements g	// class@000d87
{
    public final EmotionManagerDelegate b;

    public void EmotionManagerDelegate$c(EmotionManagerDelegate p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       StringBuilder str1;
       a a;
       boolean b;
       Bitmap uBitmap;
       String str7;
       object oobject;
       Object obj = this;
       j obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, EmotionManagerDelegate$c.class, str)) {
       }else if((obj1.b()).length() > 0){
          str1 = 1;
       }else {
          str1 = null;
       }
       if (str1) {
          Thread thread = Thread.currentThread();
          a.o(thread, "Thread.currentThread\(\)");
          a.a("EmotionManagerDelegate", "initEmotionDataInternal 5 "+obj1.b()+" thread "+thread.getName());
          File uFile = new File(obj1.b());
          obj1 = j.o();
          a.o(obj1, "KwaiEmotionManager.getInstance\(\)");
          a = obj1.i().a;
          a.o(a, "KwaiEmotionManager.getIn¡­nce\(\).config.mEnvCallback");
          String str2 = a.a();
          String str3 = "message_emoji_resource";
          if (!PatchProxy.applyVoidThreeRefs(uFile, str2, str3, null, a.class, "2")) {
             Charset uCharset = a.c();
             if (!PatchProxy.applyVoidFourRefs(uFile, str2, str3, uCharset, null, a.class, "4")) {
                String str6 = new File(str2).getPath()+"_folder_"+System.currentTimeMillis();
                File uFile1 = new File(str6);
                uFile1.mkdirs();
                ZipFile zipFile = new ZipFile(uFile);
                Enumeration uEnumeration = zipFile.entries();
                int i = 1024;
                byte[] uobyteArray = new byte[i];
                while (uEnumeration.hasMoreElements()) {
                   ZipEntry zipEntry = uEnumeration.nextElement();
                   str7 = "debug";
                   if (TextUtils.x(zipEntry.getName())) {
                      m.b(str7, "empty"+zipEntry.getName());
                   }
                   m.b(str7, "ze name"+zipEntry.getName());
                   if (zipEntry.isDirectory()) {
                      new File(a.f(new File(uFile1, a.e(zipEntry)).getPath(), uCharset)).mkdirs();
                   }else {
                      BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(a.d(str6, a.e(zipEntry), uCharset)));
                      BufferedInputStream uBufferedInp = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                      int i1 = uBufferedInp.read(uobyteArray, 0, i);
                      while (i1 != -1) {
                         uBufferedOut.write(uobyteArray, 0, i1);
                      }
                      p.c(uBufferedInp);
                      p.d(uBufferedOut);
                   }
                }
                uFile = new File(str2);
                if (!uFile.exists()) {
                   uFile.mkdirs();
                }
                File[] uFileArray = uFile1.listFiles();
                str7 = "rename failed, ";
                if (uFileArray.length == 1 && !TextUtils.isEmpty(str3)) {
                   if (!uFileArray[0].renameTo(a.b(uFile, str3))) {
                      throw new IOException(str7+uFile);
                   }
                }else {
                   int len = uFileArray.length;
                   int i2 = 0;
                   while (true) {
                      if (i2 < len) {
                         oobject = uFileArray[i2];
                         if (oobject.renameTo(a.b(uFile, oobject.getName()))) {
                            i2 = i2 + 1;
                         }else {
                            throw new IOException(str7+uFile);
                         }
                      }
                   }
                }
                p.g(zipFile);
                a.a(uFile1);
                uFile1.delete();
             }
          }
          b = true;
          h.j(b);
       }else {
          oobject = 1;
       }
       if (obj.b.e() != null) {
          b uob = b.e();
          m om = obj.b.e();
          Objects.requireNonNull(uob);
          if (PatchProxy.applyVoidOneRefs(om, uob, b.class, "2") || (om != null && !q.f(om.c()))) {
             EmotionPackage uEmotionPack = om.c().get(0);
             if (!PatchProxy.applyVoidOneRefs(uEmotionPack, uob, b.class, "3") && uEmotionPack != null) {
                uob.b = uEmotionPack;
                if (uEmotionPack.mEmotions != null) {
                   uob.c.clear();
                   uob.e.clear();
                   Iterator iterator = uEmotionPack.mEmotions.iterator();
                   while (iterator.hasNext()) {
                      Object obj2 = iterator.next();
                      b$a uoa = new b$a(obj2.mId);
                      String str4 = "EmojiDataManagerInternal";
                      if (!PatchProxy.applyVoidOneRefs(obj2, uoa, b$a.class, str)) {
                         uoa.c = obj2.mEmotionImageSmallUrl;
                         uoa.d = obj2.mEmotionImageBigUrl;
                         try{
                            uBitmap = h.c(obj2.mId);
                         }catch(java.lang.Exception e0){
                            m.b(str4, "saveEmotion getEmojiBitmap error "+e0);
                            uBitmap = null;
                         }
                         if (uBitmap != null) {
                            uoa.a = uBitmap;
                         }else {
                            m.b(str4, "saveEmotion - 2");
                            h.a(obj2, new a(uoa));
                         }
                      }
                      if (PatchProxy.applyVoidTwoRefs(obj2, uoa, uob, b.class, "4")) {
                         continue ;
                      }else {
                         EmotionInfo mEmotionCode = obj2.mEmotionCode;
                         if (mEmotionCode == null) {
                         }else {
                            Iterator iterator1 = mEmotionCode.iterator();
                            c uoc = null;
                            while (iterator1.hasNext()) {
                               EmotionInfo$EmotionCode uEmotionCode = iterator1.next();
                               Iterator iterator2 = uEmotionCode.mCode.iterator();
                               while (iterator2.hasNext()) {
                                  String str5 = iterator2.next();
                                  uob.c.put(str5, uoa);
                                  uob.d.put(str5, obj2.mEmotionCode);
                               }
                               if ((uob.f()).equals(uEmotionCode.mLanguage)) {
                                  uob.e.add(new c(uEmotionCode.mCode.get(0), obj2.mId, obj2.mEmotionImageSmallUrl, obj2.mHidePanel));
                                  uoc = 1;
                               }else {
                                  continue ;
                               }
                            }
                            if (uoc == null) {
                               mEmotionCode = obj2.mEmotionCode;
                               if (mEmotionCode != null && (!mEmotionCode.isEmpty() && !obj2.mEmotionCode.get(0).mCode.isEmpty())) {
                                  uob.e.add(new c(obj2.mEmotionCode.get(0).mCode.get(0), obj2.mId, obj2.mEmotionImageSmallUrl, obj2.mHidePanel));
                               }else {
                                  continue ;
                               }
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_035a :
       return;
    }
}
