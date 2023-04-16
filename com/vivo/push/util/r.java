package com.vivo.push.util.r;
import android.content.Context;
import android.net.NetworkInfo;
import java.lang.String;
import java.lang.Object;
import android.net.ConnectivityManager;
import java.lang.Throwable;
import com.vivo.push.util.p;

public final class r	// class@0010c0
{

    public static NetworkInfo a(Context p0){
       try{
          return p0.getSystemService("connectivity").getActiveNetworkInfo();
       }catch(java.lang.Exception e1){
          p.a("NetUtils", e1);
          return null;
       }
    }
}
