package com.loc.bo;
import com.loc.bn;
import com.loc.cg;
import java.io.File;
import java.lang.String;
import com.loc.bd;
import java.util.ArrayList;
import java.util.List;
import com.loc.am;
import com.loc.bg;
import com.loc.bl;
import com.loc.bm;
import org.json.JSONObject;
import java.lang.Throwable;
import com.loc.an;
import java.util.Iterator;
import java.lang.Object;
import com.loc.az;
import com.loc.bd$a;
import java.io.OutputStream;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.loc.bt;
import com.loc.ca;

public final class bo	// class@0013a3
{

    public static int a(bn p0){
       String str = "code";
       bd uobd = null;
       if (p0.f.c()) {
          boolean b = true;
          p0.f.a(b);
          bd uobd1 = bd.a(new File(p0.a), p0.b);
          ArrayList uArrayList = new ArrayList();
          byte[] uobyteArray = bo.a(uobd1, p0, uArrayList);
          if (uobyteArray == null || !uobyteArray.length) {
             if (uobd1 != null) {
                uobd1.close();
             }
             return -1;
          }else {
             bg.a();
             JSONObject jSONObject = new JSONObject(new String(bg.a(new am(uobyteArray, p0.c)).a));
             if (jSONObject.has(str) && jSONObject.getInt(str) == b) {
                bn f = p0.f;
                if (f != null) {
                   f.a(uobyteArray.length);
                }
                if (p0.f.b() < Integer.MAX_VALUE) {
                   bo.a(uobd1, uArrayList);
                }else {
                   uobd1.d();
                }
                return uobyteArray.length;
             }else {
                uobd = uobd1;
             }
          }
       }
       if (uobd != null) {
          uobd.close();
       }
    label_00a1 :
       return -1;
    }
    public static void a(bd p0,List p1){
       if (p0 == null) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          p0.c(iterator.next());
       }
       p0.close();
       return;
    }
    public static void a(String p0,byte[] p1,bn p2){
       if (bo.a(p2.a, p0)) {
          return;
       }
       File uFile = new File(p2.a);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       bd uobd = bd.a(uFile, p2.b);
       uobd.a(p2.d);
       bd$a uoa = uobd.b(p0);
       OutputStream outputStream = uoa.a();
       outputStream.write(p2.e.b(p1));
       uoa.b();
       uobd.c();
       outputStream.close();
       uobd.close();
       return;
    }
    public static boolean a(String p0,String p1){
       return new File(p0, p1+".0").exists();
    }
    public static byte[] a(bd p0,bn p1,List p2){
       File uFile = p0.b();
       if (uFile != null && uFile.exists()) {
          String[] stringArray = uFile.list();
          int len = stringArray.length;
          int i = 0;
          int i1 = 0;
          while (true) {
             if (i < len) {
                object oobject = stringArray[i];
                if (oobject.contains(".0")) {
                   oobject = oobject.split("\\.")[0];
                   byte[] uobyteArray = bt.a(p0, oobject);
                   i1 = i1 + uobyteArray.length;
                   p2.add(oobject);
                   if (i1 <= p1.f.b()) {
                      p1.g.b(uobyteArray);
                   }else if(i1 <= 0){
                      return null;
                   }else {
                      break ;
                   }
                }
                i = i + 1;
             }else {
                goto label_0041 ;
             }
          }
          return p1.g.a();
       }else {
          byte[] uobyteArray1 = new byte[0];
          return uobyteArray1;
       }
    }
}
