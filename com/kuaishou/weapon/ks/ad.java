package com.kuaishou.weapon.ks.ad;
import java.lang.Object;
import org.json.JSONArray;
import java.lang.Runtime;
import java.lang.String;
import java.lang.Process;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;
import com.kuaishou.weapon.ks.bm;
import java.lang.CharSequence;
import java.util.Iterator;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.System;
import android.text.TextUtils;

public class ad	// class@0011bf
{

    public void ad(){
       super();
    }
    public static JSONArray a(){
       JSONArray jSONArray = new JSONArray();
       DataInputStream uDataInputSt = new DataInputStream(Runtime.getRuntime().exec("cat /proc/net/route").getInputStream());
       BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(uDataInputSt));
       HashSet hashSet = new HashSet();
       String str = uBufferedRea.readLine();
       while (str != null) {
          str = bm.a(str);
          if (str.contains("tun") || str.contains("ppp")) {
             hashSet.add(str.split("\t")[0]);
          }
       }
       Iterator iterator = hashSet.iterator();
       while (iterator.hasNext()) {
          jSONArray.put(iterator.next());
       }
       try{
          uDataInputSt.close();
          try{
             uBufferedRea.close();
             return e0;
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
       }
    }
    public static boolean a(Context p0){
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       if (systemServic == null) {
          return false;
       }
       return systemServic.getNetworkInfo(17).isConnectedOrConnecting();
    }
    public static String b(){
       String property = System.getProperty("http.proxyHost");
       if (TextUtils.isEmpty(property)) {
          property = "";
       }
       return property;
    }
    public static String b(Context p0){
       JSONArray jSONArray = ad.a();
       if (jSONArray != null) {
          return jSONArray.toString();
       }
       if (ad.a(p0)) {
          return "[\"con\"]";
       }
       return "";
    }
}
