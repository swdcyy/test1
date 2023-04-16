package r87.g;
import java.lang.Object;
import r87.h;
import r87.f;
import java.lang.Runnable;
import f97.a;
import q87.b;
import com.kwai.logger.KwaiLog;
import java.lang.String;
import java.io.File;
import java.lang.System;
import r87.e;
import java.io.FileFilter;
import java.util.List;
import java.lang.Exception;
import b97.c;
import s87.c;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import r87.g$a;
import java.util.Comparator;
import java.util.Collections;

public class g	// class@00231c
{
    public final h a;
    public File b;
    public File c;
    public File d;

    public void g(){
       super();
       this.a = null;
    }
    public void g(h p0){
       super();
       this.a = p0;
       this.c();
       a.a(new f(this));
    }
    public static void b(){
       if (KwaiLog.i().b() == null) {
          return;
       }
       File uFile = new File(KwaiLog.i().b());
       if (uFile.exists() && uFile.isDirectory()) {
          uFile.listFiles(new e(System.currentTimeMillis()));
       }
       return;
    }
    public static void f(File p0,List p1){
       if (p0 == null) {
          return;
       }
       try{
          if (!p0.exists()) {
             return;
          }else if(p0.isDirectory()){
             File[] uFileArray = p0.listFiles();
             if (uFileArray != null && uFileArray.length) {
                int len = uFileArray.length;
                for (int i = 0; i < len; i = i + 1) {
                   g.f(uFileArray[i], p1);
                }
             }
             return;
          }else if(g.l(p0.getName())){
             p1.add(p0);
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public static boolean l(String p0){
       boolean b = (p0 != null && (p0.endsWith(".log") || p0.endsWith(".log.zip")))? true: false;
       return b;
    }
    public final void a(){
       g tb = this.b;
       int i = 0;
       int i1 = 1;
       tb = (tb != null && (!tb.exists() || (this.b.canWrite() && c.b(this.b) - this.a.c > 0)))? 1: null;
       if (tb) {
          List list = this.j(this.b);
          int i2 = list.size() - i1;
          int i3 = 0;
          long l = i3;
          while (true) {
             File uFile = -1;
             if (i2 >= 0) {
                long l1 = list.get(i2).length() + l;
                if (l1 - this.a.c <= 0) {
                   l = l + list.get(i2).length();
                   i2 = i2 - 1;
                }else if(i2 != uFile){
                   for (; i <= i2; i = i + 1) {
                      list.get(i).getAbsolutePath();
                      c.a(list.get(i));
                   }
                   i2 = i2 + i1;
                   if (i2 < list.size()) {
                      long l2 = this.g(list.get(i2).getName());
                      if (l2 - i3) {
                         long l3 = System.currentTimeMillis() - l2;
                         if (l3 - i3 > 0) {
                            c uoc = c.b();
                            h a = this.a.a;
                            l3 = l3 / 1000;
                            if (uoc.e(uoc.d)) {
                               HashMap hashMap = new HashMap();
                               if (TextUtils.isEmpty(a)) {
                                  hashMap.put("module", "");
                               }else {
                                  hashMap.put("module", a);
                               }
                               hashMap.put("duration", l3);
                               uoc.d("obiwan_log_total_duration", hashMap);
                            }
                         }
                      }
                   }
                }
             }else {
                i2 = -1;
                goto label_005b ;
             }
          }
       }
       return;
    }
    public final void c(){
       File uFile = new File(KwaiLog.i().b(), this.a.a);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       this.b = uFile;
       uFile = new File(this.b, KwaiLog.i().d());
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       this.c = uFile;
       return;
    }
    public void d(){
       Locale uS = Locale.US;
       String str = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS", uS).format(new Date(System.currentTimeMillis()));
       StringBuilder str1 = "LaunchTime-";
       if (KwaiLog.e == null) {
          KwaiLog.e = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss", uS).format(new Date(KwaiLog.d));
       }
       File uFile = new File(this.c, str1+KwaiLog.e+"-"+"FileCreateTime-"+str+"."+"V1"+"."+this.a.a+".log");
       try{
          this.d = uFile;
          uFile.createNewFile();
          return;
       }catch(java.io.IOException e0){
       }
    }
    public final void e(File p0){
       c.c(p0);
    }
    public final long g(String p0){
       if (!TextUtils.isEmpty(p0)) {
          String str = "FileCreateTime-";
          if (p0.contains(str)) {
             try{
                p0 = p0.substring((p0.indexOf(str) + 15), p0.indexOf(".V1"));
                if (TextUtils.isEmpty(p0)) {
                   return 0;
                }else {
                   Locale uS = Locale.US;
                   SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS", uS);
                   return simpleDateFo.parse(p0).getTime();
                }
             }catch(java.text.ParseException e6){
                e6.printStackTrace();
             }
          }
       }
    }
    public synchronized File h(){
       g tc = this.c;
       if (tc == null || !tc.exists()) {
          this.c();
       }
       tc = this.d;
       if (tc != null && tc.exists()) {
          if (this.d.length() - this.a.d < 0) {
             return this.d;
          }else {
             this.e(this.d);
          }
       }
       this.d();
       this.a();
       return this.d;
    }
    public h i(){
       return this.a;
    }
    public final List j(File p0){
       if (p0 == null || !p0.exists()) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       g.f(p0, uArrayList);
       Collections.sort(uArrayList, new g$a(this));
       return uArrayList;
    }
    public String k(){
       return this.c.getAbsolutePath();
    }
}
