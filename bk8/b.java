package bk8.b;
import java.lang.Object;
import bk8.b$a;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;
import java.lang.StringBuilder;
import android.util.Size;
import android.util.Slog;
import java.lang.NumberFormatException;
import org.json.JSONException;
import java.util.Iterator;
import android.os.IBinder;
import android.os.ServiceManager;
import bk8.a;
import bk8.a$a;
import android.os.IBinder$DeathRecipient;
import android.os.RemoteException;

public class b	// class@000427
{
    public IBinder a;
    public IBinder$DeathRecipient b;
    public static b c;
    public static a d;

    public void b(){
       super();
       this.a = null;
       this.b = new b$a(this);
       this.a();
    }
    public static b b(){
       if (b.d == null) {
          b uob = b.class;
          _monitor_enter(uob);
          if (b.d == null) {
             b.c = new b();
          }
          _monitor_exit(uob);
       }
       return b.c;
    }
    public static List e(String p0,String p1){
       List list = null;
       if (p0.isEmpty() || p1.isEmpty()) {
          Slog.w("OMediaManager", "input param is invalid.");
          return list;
       }else {
          try{
             ArrayList uArrayList = new ArrayList();
             JSONObject jSONObject = new JSONObject(p0);
             String str = p1+"StreamSize";
             if (jSONObject.has(str)) {
                String str1 = jSONObject.getString(str);
                if (!str1.isEmpty()) {
                   List list1 = (str1.isEmpty())? list: str1.split(",");
                   if (list1 == null || !list1.length) {
                      Slog.w("OMediaManager", "stream split fail."+str1);
                   }else {
                      int len = list1.length;
                      int i = 0;
                      while (i < len) {
                         object oobject = list1[i];
                         Size size = (oobject.isEmpty())? new Size(0, 0): Size.parseSize(oobject);
                         if (size.getHeight() > 0 && size.getWidth() > 0) {
                            uArrayList.add(size);
                         }
                         i = i + 1;
                      }
                   }
                }
             }else {
                Slog.w("OMediaManager", "capabiliyJson:"+jSONObject+"key:"+str);
             }
             list = uArrayList;
          }catch(org.json.JSONException e9){
             e9.printStackTrace();
             Slog.w("OMediaManager", "got a json exception.");
          }catch(java.lang.NumberFormatException e0){
             e0.printStackTrace();
             Slog.w("OMediaManager", "capablity format is invalid."+p0+" "+p1);
          }
          return list;
       }
    }
    public static boolean g(String p0,String p1,Size p2){
       if (p0 != null && (!p0.isEmpty() && (p1 == null || p1.isEmpty()))) {
          Slog.w("OMediaManager", "input param is invalid.");
          return false;
       }else {
          List list = b.e(p0, p1);
          if (list == null || !list.size()) {
             Slog.w("OMediaManager", "feature size is empty.");
             return false;
          }else {
             Iterator iterator = list.iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   return false;
                }
                if (p2.equals(iterator.next())) {
                   break ;
                }
             }
             return true;
          }
       }
    }
    public final boolean a(){
       IBinder iBinder = ServiceManager.checkService("omedia");
       this.a = iBinder;
       a uoa = a$a.L1(iBinder);
       b.d = uoa;
       int i = 0;
       if (uoa != null) {
          try{
             this.a.linkToDeath(this.b, i);
             i = true;
          }catch(android.os.RemoteException e0){
             b.d = null;
             this.a = null;
          }
       }
    }
    public String c(String p0){
       if (b.d == null && !this.a()) {
          return null;
       }
       try{
          return b.d.X0(p0);
       }catch(android.os.RemoteException e3){
          b.d = v1;
          e3.printStackTrace();
          return v1;
       }
    }
    public String d(){
       if (b.d == null && !this.a()) {
          return null;
       }
       try{
          return b.d.D0();
       }catch(android.os.RemoteException e0){
          b.d = v1;
          e0.printStackTrace();
          return v1;
       }
    }
    public String f(String p0){
       String str = null;
       if (b.d == null && !this.a()) {
          return str;
       }
       try{
          p0 = b.d.C1("1.1:2019-03-27", p0);
          if (p0 != null) {
             str = p0+":"+"1.1";
          }
          return str;
       }catch(android.os.RemoteException e4){
          b.d = str;
          e4.printStackTrace();
          return str;
       }
    }
    public boolean h(String p0){
       if (b.d == null && !this.a()) {
          return false;
       }
       try{
          return b.d.Y(p0);
       }catch(android.os.RemoteException e3){
          b.d = null;
          e3.printStackTrace();
          return v1;
       }
    }
}
