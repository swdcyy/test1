package com.xiaomi.push.service.k0;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.j0;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import ys8.g0;
import java.util.Iterator;
import java.lang.Object;
import com.xiaomi.push.ig;
import com.xiaomi.push.hh;
import com.xiaomi.push.is;
import com.xiaomi.push.id;
import com.xiaomi.push.service.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.xiaomi.push.hu;
import com.xiaomi.push.i;
import com.xiaomi.push.service.XMPushService;
import rs8.c;

public class k0 extends XMPushService$j	// class@00117d
{
    public final String c;
    public final List d;
    public final String e;
    public final j0 f;

    public void k0(j0 p0,int p1,String p2,List p3,String p4){
       this.f = p0;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super(p1);
    }
    public String a(){
       return "Send tiny data.";
    }
    public void b(){
       String str = j0.c(this.f, this.c);
       ArrayList uArrayList = g0.c(this.d, this.c, str, 0x8000);
       if (uArrayList != null) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             ig oig = iterator.next();
             oig.a("uploadWay", "longXMPushService");
             id oid = g.b(this.c, str, oig, hh.i);
             if (!TextUtils.isEmpty(this.e) && !TextUtils.equals(this.c, this.e)) {
                if (oid.a() == null) {
                   hu ohu = new hu();
                   ohu.a("-1");
                   oid.a(ohu);
                }
                oid.a().b("ext_traffic_source_pkg", this.e);
             }
             j0.b(this.f).a(this.c, i.d(oid), true);
          }
       }else {
          c.u("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack\(\) in XMPushService.");
       }
       return;
    }
}
