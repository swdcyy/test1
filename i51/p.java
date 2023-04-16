package i51.p;
import java.lang.Object;
import i51.g;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.lang.Number;
import d61.g;
import zb6.a;
import java.lang.IllegalArgumentException;
import android.os.SystemClock;
import k2b.u1;

public class p	// class@002832
{
    public static String a = "";
    public static long b;

    public void p(){
       super();
    }
    public static String a(g p0,String p1,String p2,String p3,String p4,long p5,int p6,int p7){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Long.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          Object obj = PatchProxy.apply(objArray, null, op, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p.b(p0, p1, p2, p3, p4, p5, p6, p7, -1, -1, null);
    }
    public static String b(g p0,String p1,String p2,String p3,String p4,long p5,int p6,int p7,int p8,int p9,Throwable p10){
       i3 obj;
       String str;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       if (PatchProxy.isSupport(p.class)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = Long.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = p10;
          obj = PatchProxy.apply(objArray, null, p.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.d("live_stream_id", TextUtils.k(p0.getLiveStreamId()));
       obj.d("anchor_user_id", TextUtils.k(p0.d()));
       obj.a("is_anchor", Boolean.valueOf(p0.e()));
       if (!TextUtils.x(p2)) {
          obj.d("host", p2);
       }
       if (!TextUtils.x(p3)) {
          obj.d("port", p3);
       }
       if (!TextUtils.x(p4)) {
          obj.d("url", p4);
       }
       if (!TextUtils.x(p1)) {
          obj.d("vlaue", p1);
       }
       Integer integer = -1;
       if (p8 != integer) {
          obj.c("reconnectCount", Integer.valueOf(p8));
       }
       if (p9 != integer) {
          obj.c("speedLevel", Integer.valueOf(p9));
       }
       obj.c("start_play_source_type", Integer.valueOf(p0.g()));
       if (p10 != null) {
          obj.c("domain", Integer.valueOf(3));
          obj.d("message", TextUtils.k(g.e(p10)));
          obj.c("code", Integer.valueOf(a.b(p10)));
       }
       obj.c("time_cost", Long.valueOf(p5));
       obj.d("unique_id", p.a);
       if (PatchProxy.isSupport(p.class)) {
          str = PatchProxy.applyOneRefs(Integer.valueOf(p6), null, p.class, "12");
          if (str != PatchProxyResult.class) {
          }else {
             switch (p6){
                 case 0:
                   str = "UNKNOWN1";
                   break;
                 case 1:
                   str = "START";
                   break;
                 case 2:
                   str = "RETRY";
                   break;
                 case 3:
                   str = "PAUSE";
                   break;
                 case 4:
                   str = "RESUME";
                   break;
                 case 5:
                   str = "PENDING";
                   break;
                 case 6:
                   str = "PROCESSING";
                   break;
                 case 7:
                   str = "SUCCESS";
                   break;
                 case 8:
                   str = "FAIL";
                   break;
                 case 9:
                   str = "CANCEL";
                   break;
                 case 10:
                   str = "FINISH";
                   break;
                 default:
                   throw new IllegalArgumentException("status is null");
             }
          }
       }else {
          goto label_011f ;
       }
       obj.d("status", str);
       return obj.e();
    }
    public static synchronized void c(g p0){
       _monitor_enter(p.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, p.class, "9")) {
          _monitor_exit(p.class);
          return;
       }else if(p.a == null || !p.b){
          _monitor_exit(p.class);
          return;
       }else {
          u1.R("LS_ACTIVELY_CLOSING_LONG_CONNECTION", p.a(p0, null, null, null, null, (SystemClock.elapsedRealtime() - p.b), 7, 17), 3);
          p.a = null;
          p.b = 0;
          _monitor_exit(p.class);
          return;
       }
    }
}
