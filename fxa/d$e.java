package fxa.d$e;
import fxa.d$b;
import fxa.d;
import fxa.d$a;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class d$e extends d$b	// class@002a50
{
    public final d a;

    public void d$e(d p0){
       this.a = p0;
       super(null);
    }
    public String b(){
       return "IDLE";
    }
    public boolean d(int p0,String p1){
       boolean b;
       d$e ta;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d$e uoe = d$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoe, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             this.c(p0+" not handled");
             return false;
          }else {
             Object obj1 = PatchProxy.apply(null, null, IMConfigUtil.class, "40");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                IMConfigInfo iMConfigInfo = IMConfigUtil.i.r();
                iMConfigInfo = (iMConfigInfo != null)? iMConfigInfo.mEnableBlockRequestCallForLastEndedCall: null;
             }
             if (b != null && TextUtils.equals(p1, this.a.h)) {
                this.c(p0+" not handled, because the call of "+p1+" has ended before");
                return false;
             }else {
                this.c(p0+" handled");
                ta = this.a;
                ta.e(ta.c);
                return 1;
             }
          }
       }else {
          this.c(p0+" handled");
          ta = this.a;
          ta.e(ta.b);
          return 1;
       }
    }
}
