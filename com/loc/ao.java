package com.loc.ao;
import java.lang.String;
import java.lang.Object;
import com.loc.w;
import java.util.List;
import com.loc.al;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.CharSequence;
import com.loc.x;
import java.lang.Exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.loc.be;
import com.loc.bd;
import java.nio.charset.Charset;
import java.lang.Throwable;
import com.loc.an;
import java.lang.ref.WeakReference;
import android.content.Context;
import com.loc.cg;
import com.loc.cj;
import com.loc.ao$1;
import com.loc.ck;
import com.loc.cl;
import com.loc.bt;
import com.loc.l;
import com.loc.s;
import com.loc.bn;
import com.loc.ax;
import com.loc.ay;
import com.loc.ba;
import com.loc.bb;
import com.loc.az;
import com.loc.bo;
import java.lang.StringBuilder;
import com.loc.ce;
import com.loc.cf;
import com.loc.ch;

public class ao	// class@001373
{
    public static WeakReference a;
    public static boolean b;
    public static WeakReference c;
    public static WeakReference d;
    public static String[] e;
    public static int f;
    public static boolean g;
    public static int h;
    public static w i;

    static {
       String[] stringArray = new String[10];
       ao.e = stringArray;
    }
    public void ao(){
       super();
    }
    public static w a(String p0){
       List list = al.a();
       if (list == null) {
          list = new ArrayList();
       }
       if (p0 != null && !("").equals(p0)) {
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                w ow = iterator.next();
                if (al.a(ow.f(), p0)) {
                   return ow;
                }
                continue ;
             }else if(p0.contains("com.amap.api.col")){
                try{
                   return x.a();
                }catch(com.loc.k e0){
                   e0.printStackTrace();
                }
                try{
                   if (!p0.contains("com.amap.co") && (p0.contains("com.amap.opensdk.co") || p0.contains("com.amap.location"))) {
                      w ow1 = x.b();
                      ow1.a(true);
                      return ow1;
                   }
                }catch(com.loc.k e4){
                   e4.printStackTrace();
                   break ;
                }
             }else {
                goto label_0043 ;
             }
          }
       }
    }
    public static String a(List p0){
       be uobe;
       InputStream inputStream;
       String str = null;
       try{
          File uFile = new File("/data/anr/traces.txt");
          if (!uFile.exists()) {
             return str;
          }
          try{
             FileInputStream uFileInputSt = new FileInputStream(uFile);
             int i = uFileInputSt.available();
             int i1 = 0xfa000;
             if (i > i1) {
                uFileInputSt.skip((long)(i - i1));
             }
             uobe = new be(uFileInputSt, bd.b);
             String str1 = null;
             try{
                while (true) {
                   String str2 = (uobe.a()).trim();
                   if (str2.contains("pid")) {
                      while (!str2.startsWith("\"main\"")) {
                         str2 = uobe.a();
                      }
                      str1 = 1;
                   label_004d :
                      if (!str2.equals("") || str1 == null) {
                         if (str1 != null) {
                            if (ao.f > 9) {
                               ao.f = 0;
                            }
                            int f = ao.f;
                            ao.e[f] = str2;
                            f = f + 1;
                            ao.f = f;
                            int h = ao.h;
                            if (h != 5) {
                               if (!ao.g) {
                                  Iterator iterator = p0.iterator();
                                  while (true) {
                                     if (iterator.hasNext()) {
                                        w ow = iterator.next();
                                        boolean b = al.b(ow.f(), str2);
                                        ao.g = b;
                                        if (b) {
                                           ao.i = ow;
                                        }
                                     }else {
                                        continue ;
                                     }
                                  }
                                  return str;
                               }else {
                                  h = h + 1;
                                  ao.h = h;
                                  continue ;
                               }
                            }
                         }else {
                            continue ;
                         }
                      }
                      uobe.close();
                      uFileInputSt.close();
                   }else {
                      goto label_004d ;
                   }
                }
             }catch(java.io.EOFException e0){
             }catch(java.io.FileNotFoundException e0){
             }
          label_00f6 :
             if (ao.g) {
                return ao.b();
             }else {
                goto label_00ff ;
             }
          }catch(java.io.FileNotFoundException e0){
             uobe = str;
          }
          if (uobe) {
             uobe.close();
          }
          if (inputStream) {
             inputStream.close();
             goto label_00f6 ;
          }else {
             goto label_00f6 ;
          }
       }catch(java.io.FileNotFoundException e0){
          uobe = str;
          inputStream = uobe;
          goto label_00e7 ;
       }
    }
    public static WeakReference a(){
       return ao.a;
    }
    public static void a(Context p0){
       List list = al.a();
       if (list != null && list.size()) {
          String str = ao.a(list);
          if (str != null && !("").equals(str)) {
             w i = ao.i;
             if (i != null) {
                ao.a(p0, i, 2, "ANR", str);
             }
          }
       }
       return;
    }
    public static void a(Context p0,cg p1,String p2){
       cj.a().b(new ao$1(p0, p2, p1));
    }
    public static void a(Context p0,w p1,int p2,String p3,String p4){
       String b;
       l.a(p0);
       String str = bt.a(bt.a(p0, p1), bt.a(), p2, p3, p4);
       if (str != null && !("").equals(str)) {
          p3 = s.b(p4);
          if (p2 == 1) {
             b = al.b;
          }else if(p2 == 2){
             b = al.d;
          }else if(!p2){
             b = al.c;
          }
          String str1 = b;
          bn uobn = bt.a(ao.a);
          bt.a(p0, uobn, str1, 1000, 0x3e8000, "1");
          if (uobn.e == null) {
             uobn.e = new ax(new ay(new ba(new bb())));
          }
          bo.a(p3, x.a(str.replaceAll("\n", "<br/>")), uobn);
       }
    label_006b :
       return;
    }
    public static void a(Context p0,Throwable p1,int p2,String p3,String p4){
       String str = x.a(p1);
       w ow = ao.a(str);
       if (!ao.a(ow)) {
          return;
       }
       str = str.replaceAll("\n", "<br/>");
       String str1 = p1.toString();
       if (str1 != null && !("").equals(str1)) {
          StringBuilder str2 = "";
          if (p3 != null) {
             str2 = str2+"class:"+p3;
          }
          if (p4 != null) {
             str2 = str2+" method:"+p4+"$<br/>";
          }
          ao.a(p0, ow, p2, str1, str2+str);
       }
       return;
    }
    public static void a(w p0,Context p1,String p2,String p3){
       if (!ao.a(p0)) {
          return;
       }
       if (p2 != null && !("").equals(p2)) {
          ao.a(p1, p0, 1, p2, p3);
       }
       return;
    }
    public static boolean a(w p0){
       if (p0 != null && p0.e()) {
          return true;
       }
       return false;
    }
    public static String b(){
       StringBuilder str = "";
       for (int f = ao.f; f < 10 && f <= 9; f = f + 1) {
          str = str+ao.e[f];
       }
       for (f = 0; f < ao.f; f = f + 1) {
          str = str+ao.e[f];
       }
       return str;
    }
    public static void b(Context p0){
       ao.b = false;
       ao.a(p0, new ce(ao.b), al.c);
    }
    public static void c(Context p0){
       WeakReference c = ao.c;
       if (c == null || c.get() == null) {
          ao.c = new WeakReference(new cf(p0, 0x36ee80, "hKey", new ch(p0)));
       }
       ao.a(p0, ao.c.get(), al.d);
       return;
    }
    public static void d(Context p0){
       WeakReference d = ao.d;
       if (d == null || d.get() == null) {
          ao.d = new WeakReference(new cf(p0, 0x36ee80, "gKey", new ch(p0)));
       }
       ao.a(p0, ao.d.get(), al.b);
       return;
    }
}
