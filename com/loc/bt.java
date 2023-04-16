package com.loc.bt;
import java.lang.ref.WeakReference;
import com.loc.bn;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.loc.x;
import android.content.Context;
import com.loc.w;
import java.lang.StringBuilder;
import com.loc.o;
import java.lang.Throwable;
import java.lang.StringBuffer;
import com.loc.al;
import com.loc.bd;
import com.loc.bd$b;
import java.io.InputStream;
import com.loc.an;

public final class bt	// class@0013aa
{

    public static bn a(WeakReference p0){
       if (p0 == null || p0.get() == null) {
          p0 = new WeakReference(new bn());
       }
       return p0.get();
    }
    public static String a(){
       return x.a(System.currentTimeMillis());
    }
    public static String a(Context p0,w p1){
       StringBuilder str = "\"sim\":\""+o.f(p0)+"\",\"sdkversion\":\""+p1.c()+"\",\"product\":\""+p1.a()+"\",\"ed\":\""+p1.d()+"\",\"nt\":\""+o.d(p0)+"\",\"np\":\""+o.b(p0)+"\",\"mnc\":\""+o.c(p0)+"\",\"ant\":\""+o.e(p0)+"\"";
       return str;
    }
    public static String a(String p0,String p1,int p2,String p3,String p4){
       return p0+",\"timestamp\":\""+p1+"\",\"et\":\""+p2+"\",\"classname\":\""+p3+"\","+"\"detail\":\""+p4+"\"";
    }
    public static void a(Context p0,bn p1,String p2,int p3,int p4,String p5){
       p1.a = al.c(p0, p2);
       p1.d = p3;
       p1.b = (long)p4;
       p1.c = p5;
    }
    public static byte[] a(bd p0,String p1){
       byte[] uobyteArray = new byte[0];
       bd$b uob = p0.a(p1);
       if (uob != null) {
          InputStream inputStream = uob.a();
          if (inputStream == null) {
             if (inputStream != null) {
                inputStream.close();
             }
             uob.close();
             return uobyteArray;
          }else {
             uobyteArray = new byte[inputStream.available()];
             inputStream.read(uobyteArray);
             inputStream.close();
             uob.close();
             return uobyteArray;
          }
       }else if(uob != null){
          uob.close();
       }
       return uobyteArray;
    }
}
