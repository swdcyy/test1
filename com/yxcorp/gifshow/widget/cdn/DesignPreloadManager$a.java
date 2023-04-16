package com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$a;
import com.yxcorp.download.k;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.download.DownloadTask;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import com.yxcorp.utility.Log;
import java.io.File;
import java.lang.CharSequence;
import kotlin.Pair;
import kotlin.io.FilesKt__UtilsKt;
import com.yxcorp.gifshow.widget.cdn.a;
import com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$a$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Exception;
import java.lang.Throwable;
import zyc.d;
import java.lang.Long;
import java.lang.System;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import qrd.r0;

public final class DesignPreloadManager$a extends k	// class@00195d
{
    public final ConcurrentHashMap c;

    public void DesignPreloadManager$a(){
       super();
       this.c = new ConcurrentHashMap();
    }
    public void a(DownloadTask p0){
       String str = "task ";
       String str1 = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getId()): str1;
       str = str+integer+" blockComplete: ";
       if (p0 != null) {
          str1 = p0.getUrl();
       }
       Log.g("design_cdn#manager", str+str1);
       if (p0 != null) {
          str = p0.getTargetFilePath();
          if (str != null) {
             File uFile = new File(str);
             if (!uFile.exists()) {
                Log.n("design_cdn#manager", "task "+p0.getId()+" blockComplete cause: "+str+" not exists!");
                return;
             }else {
                File parentFile = uFile.getParentFile();
                if (parentFile != null) {
                   str = parentFile.getName();
                   Pair pair = (str == null || !str.length())? 1: null;
                   if (pair) {
                      Log.n("design_cdn#manager", "task "+p0.getId()+" blockComplete cause: parent is null or empty!");
                      return;
                   }else {
                      pair = this.q(p0);
                      if (pair != null) {
                         String str2 = pair.component1();
                         Object obj = pair.component2();
                         try{
                            String str3 = FilesKt__UtilsKt.a0(uFile);
                            String absolutePath = new File(parentFile, str3).getAbsolutePath();
                            a.g(uFile, absolutePath);
                            DesignPreloadManager$a$a uoa$a = new DesignPreloadManager$a$a(str2, obj, str, absolutePath, parentFile, str3);
                            k1.o(v12);
                            Log.g("design_cdn#manager", "task "+p0.getId()+" blockComplete: unzip success: "+str+" => "+absolutePath);
                         }catch(java.lang.Exception e0){
                            e0.printStackTrace();
                            Log.e("design_cdn#manager", "task "+p0.getId()+" blockComplete cause: unzip error!", e0);
                         }
                         d.a(uFile);
                         return;
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void b(DownloadTask p0){
       StringBuilder str = "task ";
       String str1 = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getId()): str1;
       str = str+integer+" canceled: ";
       if (p0 != null) {
          str1 = p0.getUrl();
       }
       Log.g("design_cdn#manager", str+str1);
       Pair pair = this.q(p0);
       if (pair != null) {
          pair.getSecond();
       }
       return;
    }
    public void c(DownloadTask p0){
       StringBuilder str = "task ";
       String str1 = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getId()): str1;
       str = str+integer+" completed: ";
       if (p0 != null) {
          str1 = p0.getUrl();
       }
       Log.g("design_cdn#manager", str+str1);
       if (p0 != null) {
          this.c.remove(Integer.valueOf(p0.getId()));
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       StringBuilder str = "task ";
       String str1 = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getId()): str1;
       str = str+integer+" error: ";
       if (p0 != null) {
          str1 = p0.getUrl();
       }
       Log.d("design_cdn#manager", str+str1);
       if (p1 != null) {
          p1.printStackTrace();
       }
       Pair pair = this.q(p0);
       if (pair != null) {
          pair.getSecond();
       }
       return;
    }
    public void j(DownloadTask p0,long p1,long p2){
       StringBuilder str = "task ";
       String str1 = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getId()): str1;
       str = str+integer+" pending: ";
       if (p0 != null) {
          str1 = p0.getUrl();
       }
       Log.g("design_cdn#manager", str+str1);
       return;
    }
    public void o(DownloadTask p0){
       StringBuilder str = "task ";
       String str1 = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getId()): str1;
       str = str+integer+" pending: ";
       if (p0 != null) {
          str1 = p0.getUrl();
       }
       Log.g("design_cdn#manager", str+str1);
       if (p0 != null) {
          this.c.put(Integer.valueOf(p0.getId()), Long.valueOf(System.currentTimeMillis()));
       }
       Pair pair = this.q(p0);
       if (pair != null) {
          pair.getSecond();
       }
       return;
    }
    public final Pair q(DownloadTask p0){
       Pair pair = null;
       Pair tag = (p0 != null)? p0.getTag(): pair;
       if (!tag instanceof String) {
          tag = pair;
       }
       Object obj = tag;
       if (obj != null) {
          String[] stringArray = new String[]{"#"};
          List list = StringsKt__StringsKt.H4(obj, stringArray, false, 0, 6, null);
          if (list.size() == 2) {
             pair = r0.a(list.get(0), list.get(1));
          }
       }
       return pair;
    }
}
