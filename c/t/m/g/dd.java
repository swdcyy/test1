package c.t.m.g.dd;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import android.net.wifi.ScanResult;
import java.lang.String;

public class dd	// class@000c3e
{
    public static final List a;

    static {
       ArrayList uArrayList = new ArrayList();
       dd.a = uArrayList;
       uArrayList.add("mobile");
       uArrayList.add("16wifi");
       uArrayList.add("cmcc");
       uArrayList.add("360wifi");
       uArrayList.add("androidap");
       uArrayList.add("htcphone");
       uArrayList.add("xiaomi");
       uArrayList.add("lenovo");
       uArrayList.add("macbook");
    }
    public static void a(List p0){
       HashSet hashSet = new HashSet();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ScanResult bSSID = iterator.next().BSSID;
          if (bSSID != null && (!bSSID.equals("000000000000") && (!bSSID.equals("00-00-00-00-00-00") && (bSSID.equals("00:00:00:00:00:00") || bSSID.equals("02:00:00:00:00:00"))))) {
             iterator.remove();
          }else if(hashSet.contains(bSSID)){
             iterator.remove();
          }else {
             hashSet.add(bSSID);
          }
       }
       return;
    }
}
