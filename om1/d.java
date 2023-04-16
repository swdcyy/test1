package om1.d;
import mm1.d;
import om1.e;
import java.lang.Object;
import mm1.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lm1.k;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;

public final class d implements d	// class@00353f
{
    public final e a;

    public void d(e p0){
       this.a = p0;
    }
    public final boolean a(c p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       StringBuilder obj = PatchProxy.applyOneRefs(p0, ta, e.class, "9");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          String str = "AFTER_SEND_GIFT";
          if (ta.c.d() && (str.equals(p0.e()) && 1 == p0.c())) {
             b.P(b.a, "[LiveSendGiftTracer][checkNeedReport]filter by only log after send failed");
          }else {
             String str1 = p0.e();
             Objects.requireNonNull(str1);
             int i = str1.hashCode();
             if (i != -1398094059) {
                if (i != -349580092) {
                   if (i != 0x722af0cb || !str1.equals("PRE_SEND_GIFT")) {
                   label_0076 :
                      obj = -1;
                   }else {
                      obj = 2;
                   }
                }else if(!str1.equals(str)){
                   goto label_0076 ;
                }else {
                   obj = 1;
                }
             }else if(!str1.equals("SENDING_GIFT")){
                goto label_0076 ;
             }else {
                obj = null;
             }
             if (obj) {
                if (obj != 1) {
                   if (obj != 2) {
                      b.P(b.a, "[LiveSendGiftTracer][checkNeedReport]unknown stage:"+str1);
                   }else {
                      b = ta.c.b();
                   }
                }else {
                   b = ta.c.a();
                }
             }else {
                b = ta.c.c();
             }
          }
       }
       return (b ^ 0x01);
    }
}
