package fa2.k;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import java.text.DecimalFormat;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;

public class k extends CountDownTimer	// class@002909
{
    public final LiveHourlyRankStrengthNoticeExpandView a;

    public void k(LiveHourlyRankStrengthNoticeExpandView p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       this.a.N();
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, k.class, "1")) {
          return;
       }
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       long l = mILLISECONDS.toMinutes(p0);
       TimeUnit mINUTES = TimeUnit.MINUTES;
       long l1 = mILLISECONDS.toSeconds((p0 - mINUTES.toMillis(l)));
       p0 = ((p0 - mINUTES.toMillis(l)) - TimeUnit.SECONDS.toMillis(l1)) / 10;
       String str = ":";
       String str1 = "00";
       if (l - null > 0) {
          DecimalFormat uDecimalForm = new DecimalFormat(str1);
          this.a.C.setText(uDecimalForm.format(l)+str+uDecimalForm.format(l1));
       }else {
          this.a.C.setText(new DecimalFormat(str1).format(l)+str+new DecimalFormat(str1).format(l1)+"."+new DecimalFormat(str1).format(p0));
          k ta = this.a;
          if (ta.M != null) {
             ta.M = false;
          }
       }
       return;
    }
}
