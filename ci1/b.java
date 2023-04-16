package ci1.b;
import ei1.a;
import om1.e;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.StringBuilder;
import android.util.Log;
import mm1.c;
import mm1.e;
import java.lang.Integer;
import pm1.b;
import com.yxcorp.utility.SystemUtil;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.RuntimeException;
import com.kuaishou.live.core.show.gift.GiftMessage;
import ci1.a;

public class b implements a	// class@0004c3
{
    public final e a;

    public void b(e p0){
       super();
       this.a = p0;
    }
    public void a(LiveSendGiftBaseTraceInfo p0,boolean p1,Throwable p2){
       String str;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, b.class, "1")) {
          return;
       }
       int i = 1;
       if (p1) {
          str = "[onRequestAfterSendResult] success";
       }else {
          i = 0x18a89;
          str = "[onRequestAfterSendResult] fail.";
          if (p2 instanceof KwaiException) {
             i = p2.getErrorCode();
             str = str+"error: "+Log.getStackTraceString(p2);
          }
       }
       this.a.yk(p0).f("SENDING_GIFT").d("CLIENT_AFTER_SEND_REQUEST_RESULT").g(i).e(str).a();
       return;
    }
    public void b(LiveSendGiftBaseTraceInfo p0,boolean p1,int p2,int p3,String p4){
       String str;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
             return;
          }
       }
       if (p2 == 1) {
          str = "CLIENT_MOCK_RESULT";
       }else if(p2 == 2){
          String str1 = "AFTER_SEND_GIFT";
          str = "CLIENT_HANDLE_FEED_PUSH";
       }else {
          String str2 = "LiveGiftEffectReporter[onEffectMockResult]unknown from:"+p2;
          if (!SystemUtil.I()) {
             b.r(b.a, str2);
             return;
          }else {
             throw new RuntimeException(str2);
          }
       }
       uob = new b(p0, "SENDING_GIFT", str);
       uob.g(p3, p4);
       this.a.Ia(uob);
       return;
    }
    public void c(GiftMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.a(p0);
       return;
    }
}
