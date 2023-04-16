package p4.b;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import java.lang.String;
import java.lang.System;
import r4.b;
import java.util.Map;
import r4.i;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.util.List;

public class b	// class@0028b2
{
    public Map a;
    public String b;

    public void b(){
       this.a = new ConcurrentHashMap();
    }
    public void a(Context p0,String p1,String p2){
       i oi;
       i oi2;
       b uob = this;
       String str = p1;
       SharedPreferences$Editor obj = p2;
       long l = System.currentTimeMillis() + b.g(p1);
       if (!obj) {
       }else if(!str.equals("GUID") && (str.equals("APID") || !("").equals(obj))){
          if (uob.a.containsKey(str)) {
             oi = uob.a.get(str);
             oi.a = obj;
             oi.b = l;
          }else {
             oi = new i(obj, l);
             uob.a.put(str, oi);
          }
          obj = o.c(p0, "cache", 0).edit();
          i oi1 = 2;
          switch (p1.hashCode()){
              case 0x1ec18a:
                if (str.equals("APID")) {
                   oi2 = null;
                }else {
                label_009c :
                   oi2 = -1;
                }
                break;
              case 0x1ed44f:
                if (str.equals("AUID")) {
                   oi2 = 2;
                }else {
                   goto label_009c ;
                }
                break;
              case 0x20316c:
                if (str.equals("DUID")) {
                   oi2 = 3;
                }else {
                   goto label_009c ;
                }
                break;
              case 0x218e89:
                if (str.equals("GUID")) {
                   oi2 = 1;
                }else {
                   goto label_009c ;
                }
                break;
              case 0x253181:
                if (str.equals("OUID")) {
                   oi2 = 4;
                }else {
                   goto label_009c ;
                }
                break;
              case 0x221a0c70:
                if (str.equals("OUID_STATUS")) {
                   oi2 = 5;
                }else {
                   goto label_009c ;
                }
                break;
              default:
                goto label_009c ;
          }
          if (oi2) {
             if (oi2 != 1) {
                if (oi2 != oi1) {
                   if (oi2 != 3) {
                      if (oi2 != 4) {
                         if (oi2 == 5) {
                            obj.putString("OUID_STATUS", oi.a);
                            oi1 = oi.b;
                         }
                      }else {
                         obj.putString("OUID", oi.a);
                         str = "OUID_TIME";
                         oi1 = oi.b;
                      }
                   }else {
                      obj.putString("DUID", oi.a);
                      str = "DUID_TIME";
                      oi1 = oi.b;
                   }
                }else {
                   obj.putString("AUID", oi.a);
                   str = "AUID_TIME";
                   oi1 = oi.b;
                }
                obj.putLong("OUID_STATUS_TIME", oi1);
             }else {
                b.d(obj, oi, "GUID", "GUID_TIME", "GUID_IV");
             }
          }else {
             b.d(obj, oi, "APID", "APID_TIME", "APID_IV");
          }
          g.a(obj);
       }
    }
    public void b(Context p0,List p1,boolean p2){
       throw null;
    }
    public boolean c(String p0){
       boolean b = (this.a.isEmpty() || !this.a.containsKey(p0))? false: true;
       return b;
    }
    public boolean d(String p0){
       boolean b = false;
       if (this.a.isEmpty() || (this.a.containsKey(p0) && this.a.get(p0).a(p0))) {
          b = true;
       }
    label_0021 :
       return b;
    }
}
