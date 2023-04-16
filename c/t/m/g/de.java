package c.t.m.g.de;
import java.lang.Cloneable;
import java.lang.Object;
import android.bluetooth.BluetoothDevice;
import java.lang.String;
import java.lang.System;
import java.util.List;
import org.json.JSONArray;
import java.util.Iterator;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.StringBuilder;

public class de implements Cloneable	// class@000c3f
{
    public String a;
    public int b;
    public int c;
    public String d;
    public int e;
    public long f;

    public void de(){
       super();
    }
    public static de a(BluetoothDevice p0,int p1,byte[] p2){
       de uode = null;
       if (p0 == null) {
          return uode;
       }
       int i = 0;
       int i1 = 2;
       int i2 = 2;
       while (i2 <= 5) {
          int i3 = i2 + 2;
          i3 = p2[i3] & 0x00ff;
          if (i3 == i1) {
             i3 = i2 + 3;
             i3 = p2[i3] & 0x00ff;
             if (i3 == 21) {
                i = 1;
                break ;
             }
          }
          i2 = i2 + 1;
       }
       if (!i) {
          return uode;
       }else {
          uode = new de();
          uode.a((((p2[(i2 + 20)] & 0x00ff) * 256) + (p2[(i2 + 21)] & 0x00ff)));
          uode.b((((p2[(i2 + 22)] & 0x00ff) * 256) + (p2[(i2 + 23)] & 0x00ff)));
          uode.c(p1);
          uode.b((p0.getAddress()).toUpperCase());
          uode.a(p0.getName());
          uode.a(System.currentTimeMillis());
          return uode;
       }
    }
    public static String a(List p0){
       if (p0 == null || !p0.size()) {
          return "[]";
       }
       JSONArray jSONArray = new JSONArray();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          de uode = iterator.next();
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("mac", uode.c());
             jSONObject.put("major", uode.a());
             jSONObject.put("minor", uode.b());
             jSONObject.put("rssi", uode.d());
             long l = uode.e() / 1000;
             jSONObject.put("time", l);
             jSONArray.put(jSONObject);
          }catch(org.json.JSONException e1){
             e1.printStackTrace();
             goto label_0012 ;
          }
       }
       return jSONArray.toString();
    }
    public int a(){
       return this.b;
    }
    public void a(int p0){
       this.b = p0;
    }
    public void a(long p0){
       this.f = p0;
    }
    public void a(String p0){
       this.a = p0;
    }
    public int b(){
       return this.c;
    }
    public void b(int p0){
       this.c = p0;
    }
    public void b(String p0){
       this.d = p0;
    }
    public String c(){
       return this.d;
    }
    public void c(int p0){
       this.e = p0;
    }
    public Object clone(){
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public int d(){
       return this.e;
    }
    public long e(){
       return this.f;
    }
    public String toString(){
       return "Beacon [major="+this.b+", minor="+this.c+", bluetoothAddress="+this.d+", rssi="+this.e+", time="+this.f+"]";
    }
}
