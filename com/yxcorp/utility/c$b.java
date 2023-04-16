package com.yxcorp.utility.c$b;
import android.telephony.PhoneStateListener;
import com.yxcorp.utility.c$a;
import java.util.List;
import com.yxcorp.utility.c;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Object;
import com.yxcorp.utility.c$c;
import android.telephony.CellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.telephony.cdma.CdmaCellLocation;

public class c$b extends PhoneStateListener	// class@0009b8
{

    public void c$b(){
       super();
    }
    public void c$b(c$a p0){
       super();
    }
    public void onCellInfoChanged(List p0){
       c.d = p0;
       String a = c.a;
       StringBuilder str = "onCellInfoChanged:";
       int i = (p0 != null)? p0.size(): 0;
       Log.g(a, str+i);
       i = c.h ^ 1;
       Iterator iterator = c.j.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(i);
       }
       if (!c.h) {
          c.h = true;
       }
       return;
    }
    public void onCellLocationChanged(CellLocation p0){
       c.c = p0;
       if (p0 instanceof GsmCellLocation) {
          Log.g(c.a, "onCellLocationChanged cid="+p0.getCid()+", lac="+p0.getLac());
       }else if(p0 instanceof CdmaCellLocation){
          Log.g(c.a, "onCellLocationChanged sid="+p0.getBaseStationId()+", nid="+p0.getNetworkId());
       }
       int i = c.i ^ 1;
       Iterator iterator = c.j.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(i);
       }
       if (!c.i) {
          c.i = true;
       }
       return;
    }
}
