package r6c.c;
import com.kwai.android.common.intercept.Interceptor;
import java.lang.Object;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.command.CommandChain;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.common.bean.CommandData;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Exception;

public final class c implements Interceptor	// class@002312
{

    public void c(){
       super();
    }
    public void intercept(Chain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "chain");
          PushLogcat iNSTANCE = PushLogcat.INSTANCE;
          String str = "command process CommandVivoTransparentInterceptor interceptor run...channel:"+p0.getChannel()+" id:"+p0.getCommandData().msgId;
          try{
             iNSTANCE.i("KwaiPushSDK", str);
             if (p0.getChannel() == Channel.VIVO) {
                b.a(0x4b316083).F(23);
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          p0.proceed();
       }
       return;
    }
    public int supportProcess(){
       return 2;
    }
}