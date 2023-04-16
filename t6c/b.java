package t6c.b;
import com.kwai.android.register.core.register.BaseChannelInterceptor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.exceptionhandler.constant.CrashProtectorConstants$CrashType;
import p66.a;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.register.RegisterChain;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import t6c.a;
import java.lang.Enum;
import i6c.a;
import android.content.SharedPreferences;
import com.yxcorp.utility.RomUtils;

public final class b extends BaseChannelInterceptor	// class@00246e
{

    public void b(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(CrashProtectorConstants$CrashType.PUSH);
    }
    public void intercept(Chain p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "chain");
          int i = a.a[p0.getChannel().ordinal()];
          b = false;
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      if (i != 5 || (a.a.getBoolean("vivoPushEnabled", true) && (RomUtils.w() && !this.a()))) {
                      label_00a3 :
                         b = 1;
                      }
                   }else if(a.a.getBoolean("meizuPushEnabled", true) && (RomUtils.o() && !this.a())){
                      goto label_00a3 ;
                   }
                }else if(a.a.getBoolean("OppoPushInit", b) && (RomUtils.s() || (RomUtils.r() && !this.a()))){
                   goto label_00a3 ;
                }
             }else if(a.a.getBoolean("huaweiPushEnabled", true) && (RomUtils.n() && !this.a())){
                goto label_00a3 ;
             }
          }else if(a.a.getBoolean("xiaomiPushEnabled", true) && !this.a()){
             goto label_00a3 ;
          }
          if (b) {
             p0.proceed();
          }
       }
       return;
    }
}
