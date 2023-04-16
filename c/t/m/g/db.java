package c.t.m.g.db;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import android.net.wifi.ScanResult;
import java.lang.String;
import c.t.m.g.ed;
import java.lang.StringBuilder;

public class db	// class@000c39
{

    public static boolean a(List p0,List p1){
       boolean b = false;
       if (p0 != null && p1 != null) {
          int i = p0.size();
          int i1 = p1.size();
          boolean b1 = true;
          if (!i && !i1) {
             return b1;
          }else if(!i || !i1){
             if (p0.size() > p1.size()) {
                p1 = p0;
                p0 = p1;
             }
             Iterator iterator = p0.iterator();
             int i2 = 0;
             while (iterator.hasNext()) {
                ScanResult scanResult = iterator.next();
                Iterator iterator1 = p1.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if ((iterator1.next().BSSID).equals(scanResult.BSSID)) {
                         i2 = i2 + 1;
                      }
                   }else {
                      continue ;
                   }
                }
             }
             i1 = i1 + i;
             double d = 0x3feb333333333333;
             if ((double)(i2 * 2) - ((double)i1 * d) < 0 || i2 < 13) {
                b = true;
             }
             if (ed.a) {
                ed.a("TxWifiChange", "isDiffrent:c="+i+",k="+i2+",f="+i1+",fun_r="+d+",s="+b);
             }
          }
       }
       return b;
    }
}
