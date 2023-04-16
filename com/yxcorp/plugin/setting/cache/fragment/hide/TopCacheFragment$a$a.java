package com.yxcorp.plugin.setting.cache.fragment.hide.TopCacheFragment$a$a;
import erd.o;
import com.yxcorp.plugin.setting.cache.fragment.hide.TopCacheFragment$a;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.ArrayList;
import java.io.File;
import android.app.Application;
import o56.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Number;
import y56.a;
import egd.c;
import egd.b;
import java.util.Comparator;
import trd.x;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.plugin.setting.cache.fragment.hide.TopCacheFragment$LocalResponse;
import brd.t;

public final class TopCacheFragment$a$a implements o	// class@00083a
{
    public final TopCacheFragment$a b;

    public void TopCacheFragment$a$a(TopCacheFragment$a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer;
       int len1;
       Iterator iterator1;
       String str6;
       File[] uFileArray3;
       String str7;
       String str8;
       String str9;
       Object[] objArray1;
       Object obj = this;
       TopCacheFragment$a$a obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       t ot = PatchProxy.applyOneRefs(obj1, obj, TopCacheFragment$a$a.class, str);
       if (ot != patchProxyRe) {
       }else {
          a.p(obj1, "it");
          obj1 = obj.b;
          Objects.requireNonNull(obj1);
          Object[] objArray = null;
          List list = PatchProxy.apply(objArray, obj1, TopCacheFragment$a.class, "2");
          if (list != patchProxyRe) {
          }else {
             ArrayList uArrayList = new ArrayList();
             File[] uFileArray = new File[2];
             Application uApplication = a.b();
             String str1 = "AppEnv.getAppContext\(\)";
             a.o(uApplication, str1);
             File filesDir = uApplication.getFilesDir();
             String str2 = "AppEnv.getAppContext\(\).filesDir";
             a.o(filesDir, str2);
             uFileArray[0] = filesDir.getParentFile();
             uApplication = a.b();
             a.o(uApplication, str1);
             filesDir = uApplication.getExternalCacheDir();
             filesDir = (filesDir != null)? filesDir.getParentFile(): objArray;
             uFileArray[1] = filesDir;
             Iterator iterator = CollectionsKt__CollectionsKt.L(uFileArray).iterator();
             while (iterator.hasNext()) {
                filesDir = iterator.next();
                Application uApplication1 = a.b();
                a.o(uApplication1, str1);
                File filesDir1 = uApplication1.getFilesDir();
                a.o(filesDir1, str2);
                String str3 = (a.g(filesDir, filesDir1.getParentFile()))? "0": str;
                if (filesDir != null) {
                   String absolutePath = filesDir.getAbsolutePath();
                   if (absolutePath != null) {
                      integer = Integer.valueOf(absolutePath.length());
                   label_00a8 :
                      File[] uFileArray1 = (filesDir != null)? filesDir.listFiles(): objArray;
                      a.m(uFileArray1);
                      int len = uFileArray1.length;
                      int i = 0;
                      while (i < len) {
                         object oobject = uFileArray1[i];
                         String str4 = "\(this as java.lang.String\).substring\(startIndex\)";
                         String str5 = "null cannot be cast to non-null type java.lang.String";
                         if (oobject.isDirectory()) {
                            File[] uFileArray2 = oobject.listFiles();
                            len1 = uFileArray2.length;
                            iterator1 = iterator;
                            int i1 = 0;
                            while (i1 < len1) {
                               object oobject1 = uFileArray2[i1];
                               str6 = str;
                               str = str3;
                               uFileArray3 = uFileArray1;
                               if (integer != null) {
                                  str7 = str1;
                                  str1 = oobject1.getAbsolutePath();
                                  str8 = str2;
                                  a.o(str1, "childFile.absolutePath");
                                  Objects.requireNonNull(str1, str5);
                                  str9 = str1.substring(integer.intValue());
                                  a.o(str9, str4);
                               }else {
                                  str7 = str1;
                                  str8 = str2;
                                  str9 = null;
                               }
                               str = str+str9;
                               str9 = (oobject1.isDirectory())? "/": "";
                               long l = a.c(oobject1) >> 20;
                               uArrayList.add(new c(str+str9, l));
                               i1 = i1 + 1;
                               str = str6;
                               uFileArray1 = uFileArray3;
                               str1 = str7;
                               str2 = str8;
                            }
                            str6 = str;
                            uFileArray3 = uFileArray1;
                            str7 = str1;
                            str8 = str2;
                         }else {
                            iterator1 = iterator;
                            str6 = str;
                            uFileArray3 = uFileArray1;
                            str7 = str1;
                            str8 = str2;
                            StringBuilder str10 = str3;
                            if (integer != null) {
                               str9 = oobject.getAbsolutePath();
                               a.o(str9, "file.absolutePath");
                               Objects.requireNonNull(str9, str5);
                               str = str9.substring(integer.intValue());
                               a.o(str, str4);
                            }else {
                               str = null;
                            }
                            long l1 = a.c(oobject) >> 20;
                            uArrayList.add(new c(str10+str, l1));
                         }
                         i = i + 1;
                         iterator = iterator1;
                         str = str6;
                         uFileArray1 = uFileArray3;
                         str1 = str7;
                         str2 = str8;
                         str4 = null;
                         len1 = 1;
                      }
                   }
                }
                integer = objArray;
                goto label_00a8 ;
             }
             if (uArrayList.size() > 1) {
                x.p0(uArrayList, new b());
             }
             CollectionsKt___CollectionsKt.u5(uArrayList, 30).toString();
             list = CollectionsKt___CollectionsKt.u5(uArrayList, 30);
          }
          obj1.p = list;
          ot = t.just(new TopCacheFragment$LocalResponse(obj.b.p));
       }
       return ot;
    }
}
