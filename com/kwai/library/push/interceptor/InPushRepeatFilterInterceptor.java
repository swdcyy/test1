package com.kwai.library.push.interceptor.InPushRepeatFilterInterceptor;
import ly6.f;
import com.kwai.library.push.interceptor.InPushRepeatFilterInterceptor$a;
import nsd.u;
import com.kwai.library.push.interceptor.InPushRepeatFilterInterceptor$Companion$pushIdSets$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import ly6.f$a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.push.model.InAppNotification;
import java.util.Objects;
import java.util.Set;
import com.kwai.library.push.utils.c;
import lnc.i3;
import com.kwai.library.push.channel.bean.PRIORITY;
import java.lang.Integer;
import java.lang.Number;
import ny6.a;

public final class InPushRepeatFilterInterceptor implements f	// class@0008cd
{
    public static final p a;
    public static final InPushRepeatFilterInterceptor$a b;

    static {
       InPushRepeatFilterInterceptor.b = new InPushRepeatFilterInterceptor$a(null);
       InPushRepeatFilterInterceptor.a = s.c(InPushRepeatFilterInterceptor$Companion$pushIdSets$2.INSTANCE);
    }
    public void InPushRepeatFilterInterceptor(){
       super();
    }
    public boolean a(f$a p0){
       a.p(p0, "chain");
       InAppNotification data = p0.getData();
       String str = "chain.data";
       a.o(data, str);
       Objects.requireNonNull(InPushRepeatFilterInterceptor.b);
       String str1 = "push";
       a.p(data, str1);
       if (data.getIsFromKlink()) {
          String msgId = data.getMsgId();
          a.o(msgId, "push.msgId");
          if (!InPushRepeatFilterInterceptor.a.getValue().add(msgId)) {
             data = null;
          label_0039 :
             if (!data) {
                c.e("errorCode={10016}, receive repeat push", 0x2720, p0.getData());
                InAppNotification data1 = p0.getData();
                a.o(data1, str);
                a.p("hide_clear_queue", "tag");
                a.p(data1, str1);
                i3 oi3 = i3.f();
                oi3.d("id", data1.getMsgId());
                oi3.d("type", data1.getBizType());
                oi3.c("priority", Integer.valueOf(data1.getPriorityType().mValue));
                String str2 = oi3.e();
                a.o(str2, "it");
                a.c("hide_clear_queue", str2);
                return false;
             }else {
                return p0.a(p0.getData());
             }
          }
       }
       data = 1;
       goto label_0039 ;
    }
}
