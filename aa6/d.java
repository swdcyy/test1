package aa6.d;
import d0d.g$b;
import com.kwai.framework.logger.uploader.e;
import java.lang.Object;
import java.lang.String;
import d0d.h;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import java.lang.Float;
import o56.c;
import o56.a;
import java.lang.reflect.Type;
import ta6.g;
import java.util.Random;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ApiCostDetailStatEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class d implements g$b	// class@00005a
{
    public final e a;

    public void d(e p0){
       this.a = p0;
    }
    public void a(String p0,boolean p1,boolean p2){
       h.a(this, p0, p1, p2);
    }
    public final void b(ClientStat$StatPackage p0,boolean p1,boolean p2){
       float f1;
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (a.t().d("disable_log_api_upload", false)) {
       }else {
          float f = 0.00f;
          if (p1) {
             a uoa = a.t();
             Class tYPE = Float.TYPE;
             if (a.a().c()) {
                f = 0.10f;
             }
             f1 = uoa.getValue("log_api_ratio", tYPE, Float.valueOf(f)).floatValue();
          }else {
             f1 = a.t().getValue("log_api_fail_ratio", Float.TYPE, Float.valueOf(f)).floatValue();
          }
          if (ta.mRandom.nextFloat() - f1 <= 0) {
             ta.ratio = f1;
             b.a(0x4b316083).j(p0);
          }
       }
       return;
    }
}
