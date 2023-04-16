package com.yxcorp.gifshow.widget.cdn.DesignPreloadManager;
import com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$sDownloadListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Iterator;
import zyc.a;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import java.lang.CharSequence;
import kotlin.Result;
import kotlin.text.StringsKt__StringsKt;
import kotlin.jvm.internal.a;
import zsd.u;
import qrd.l1;
import java.lang.NullPointerException;
import java.lang.Throwable;
import qrd.j0;
import java.lang.StringBuilder;
import zyc.d;
import com.yxcorp.utility.Log;
import java.io.File;
import wsd.m;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$tempUseLastModifiedDirectory$lastModifiedFile$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import zyc.i;
import java.net.URL;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import java.util.Collections;
import java.io.Serializable;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$a;

public final class DesignPreloadManager	// class@001960
{
    public static final p a;
    public static final ConcurrentHashMap b;
    public static final DesignPreloadManager c;

    static {
       DesignPreloadManager.c = new DesignPreloadManager();
       DesignPreloadManager.a = s.c(DesignPreloadManager$sDownloadListener$2.INSTANCE);
       DesignPreloadManager.b = new ConcurrentHashMap();
    }
    public void DesignPreloadManager(){
       super();
    }
    public final void a(List p0,String p1,boolean p2){
       String str3;
       Iterator iterator3;
       Iterator iterator4;
       Iterator iterator5;
       File uFile1;
       Throwable obj3;
       DesignPreloadManager uDesignPrelo = this;
       String str = p1;
       String str1 = ".zip";
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          a uoa = iterator.next();
          String str2 = uoa.a();
          Iterator iterator1 = uoa.c.entrySet().iterator();
          while (true) {
             if (iterator1.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                String key = uEntry.getKey();
                Iterator iterator2 = uEntry.getValue().entrySet().iterator();
                while (true) {
                   if (iterator2.hasNext()) {
                      uEntry = iterator2.next();
                      String key1 = uEntry.getKey();
                      String obj = uEntry.getValue();
                      boolean i = (key1 == null || !key1.length())? 1: 0;
                      if (!i) {
                         i = (obj == null || !obj.length())? true: false;
                         if (i) {
                         label_033e :
                            str3 = str1;
                            iterator3 = iterator;
                         label_0113 :
                            iterator4 = iterator1;
                            iterator5 = iterator2;
                         }else {
                            i = StringsKt__StringsKt.v3(obj, 47, 0, 0, 6, null) + 1;
                            Object obj1 = obj;
                            if (obj1 != null) {
                               String str4 = obj1.substring(i);
                               a.o(str4, "\(this as java.lang.String\).substring\(startIndex\)");
                               iterator3 = iterator;
                               String obj2 = null;
                               if (u.H1(str4, str1, false, 2, obj2)) {
                                  str4 = u.g2(str4, ".zip", "", false, 4, null);
                               }else {
                                  obj3 = Result.constructor-impl(l1.a);
                                  obj3 = Result.exceptionOrNull-impl(obj3);
                                  if (obj3 != null) {
                                     obj3.printStackTrace();
                                  }
                                  str4 = obj2;
                               }
                               i = (str4 == null || !str4.length())? true: false;
                               if (!i) {
                                  char c = '/';
                                  String str5 = (u.S1(str2))? str+c+key+c+key1+c: str+c+str2+c+key+c+key1+c;
                                  String str6 = str5;
                                  obj2 = str4+str1;
                                  i = d.c(str6+str4+c) ^ 0x01;
                                  obj = "design_cdn#manager";
                                  str = " => ";
                                  if (!i) {
                                     str5 = str6+str4+'/';
                                     uDesignPrelo.b(str2, key).put(key1, str5);
                                     Log.g(obj, "Preload no need download: "+key1+str+str5);
                                  }else {
                                     File uFile = new File(str6);
                                     if (uFile.exists()) {
                                        File[] uFileArray = uFile.listFiles();
                                        if (uFileArray != null) {
                                           str4 = (!uFileArray.length)? 1: 0;
                                           if (!str4) {
                                              str4 = null;
                                           label_01e6 :
                                              if (!str4) {
                                                 i b = i.b;
                                                 Iterator iterator6 = SequencesKt___SequencesKt.i0(ArraysKt___ArraysKt.h5(uFileArray), DesignPreloadManager$tempUseLastModifiedDirectory$lastModifiedFile$1.INSTANCE).iterator();
                                                 if (!iterator6.hasNext()) {
                                                    str3 = str1;
                                                    uFile1 = null;
                                                 }else {
                                                    str3 = str1;
                                                    File uFile2 = iterator6.next();
                                                    while (iterator6.hasNext()) {
                                                       iterator5 = iterator6;
                                                       obj3 = iterator6.next();
                                                       if (b.compare(uFile2, obj3) < 0) {
                                                          uFile2 = obj3;
                                                       }
                                                       iterator6 = iterator5;
                                                    }
                                                    uFile1 = uFile2;
                                                 }
                                                 if (uFile1 != null) {
                                                    str5 = uFile1.getAbsolutePath();
                                                    a.o(str5, "absolutePath");
                                                    iterator4 = iterator1;
                                                    iterator5 = iterator2;
                                                    if (!u.H1(str5, "/", false, 2, null)) {
                                                       str5 = str5+'/';
                                                    }
                                                    a.o(str5, "folderPath");
                                                    uDesignPrelo.b(str2, key).put(key1, str5);
                                                    Log.g(obj, "Preload use last file: "+key1+str+str5);
                                                 label_027f :
                                                    if (!p2) {
                                                       str5 = new URL(obj1).getPath();
                                                       a.o(str5, "URL\(url\).path");
                                                       if (str5 != null) {
                                                          str4 = str5.substring(1);
                                                          a.o(str4, "\(this as java.lang.String\).substring\(startIndex\)");
                                                          if (str4 != null) {
                                                             str5 = d.d(str4);
                                                             b[] uobArray = new b[]{DesignPreloadManager.a.getValue()};
                                                             DownloadManager.n().E(new DownloadTask$DownloadRequest(Collections.singletonList(str5)).setNeedCDNReport(true).setTag(str2+'#'+key).setDestinationDir(str6).setDestinationFileName(obj2).setDownloadTaskType(DownloadTask$DownloadTaskType.PRE_DOWNLOAD).setBizInfo("com.kwai.library.widget.kid:kid-cdn", "design_kid_"+key, null).setAllowedNetworkTypes(3), uobArray);
                                                             Log.g(obj, "Preload download task: "+str5+str+str6+'/'+obj2);
                                                          }
                                                       }else {
                                                          break ;
                                                       }
                                                    }
                                                 }else {
                                                 label_027b :
                                                    iterator4 = iterator1;
                                                    iterator5 = iterator2;
                                                    goto label_027f ;
                                                 }
                                              }
                                           }
                                        }
                                        str4 = 1;
                                        goto label_01e6 ;
                                     }
                                     str3 = str1;
                                     goto label_027b ;
                                  }
                               }
                               str3 = str1;
                               goto label_0113 ;
                            }else {
                               throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                         }
                      }else {
                         goto label_033e ;
                      }
                      iterator = iterator3;
                      str = p1;
                      iterator1 = iterator4;
                      str1 = str3;
                      iterator2 = iterator5;
                   }else {
                      str = p1;
                   }
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
             }else {
                str = p1;
             }
          }
       }
    }
    public final Map b(String p0,String p1){
       ConcurrentHashMap b = DesignPreloadManager.b;
       ConcurrentHashMap uConcurrentH = b.get(p0);
       int i = 0;
       ConcurrentHashMap uConcurrentH1 = (uConcurrentH == null || uConcurrentH.isEmpty())? 1: null;
       if (uConcurrentH1) {
          uConcurrentH = new ConcurrentHashMap();
       }
       uConcurrentH1 = uConcurrentH.get(p1);
       if (uConcurrentH1 == null || uConcurrentH1.isEmpty()) {
          i = 1;
       }
       if (i) {
          uConcurrentH1 = new ConcurrentHashMap();
       }
       uConcurrentH.put(p1, uConcurrentH1);
       b.put(p0, uConcurrentH);
       return uConcurrentH1;
    }
    public final boolean c(){
       Object obj = Result.constructor-impl(DownloadManager.j());
       boolean b = (Result.exceptionOrNull-impl(obj) == null)? true: false;
       return b;
    }
}
