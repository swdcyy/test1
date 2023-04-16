package com.yxcorp.gifshow.push.kuaishou.KuaishouListener$onReceive$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.kuaishou.KuaishouListener$onReceive$1;
import java.lang.Object;
import qrd.l1;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.chat.kwailink.data.PacketData;
import java.util.Objects;
import p45.a;
import com.kwai.android.pushlog.PushLogger;
import java.lang.NullPointerException;
import java.lang.String;
import com.kwai.android.common.bean.Channel;
import java.lang.Throwable;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import zsd.d;
import java.nio.charset.Charset;
import com.google.gson.JsonElement;
import com.kwai.android.common.ext.PushDataExtKt;
import com.kwai.android.register.Processor;
import java.lang.IllegalStateException;

public final class KuaishouListener$onReceive$1$1 extends Lambda implements a	// class@001679
{
    public final KuaishouListener$onReceive$1 this$0;

    public void KuaishouListener$onReceive$1$1(KuaishouListener$onReceive$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Iterator iterator = this.this$0.$list.iterator();
       while (iterator.hasNext()) {
          PacketData packetData = iterator.next();
          if (packetData != null) {
             byte[] uobyteArray = packetData.b();
             Objects.requireNonNull(this.this$0.this$0);
             String str = " json: ";
             String str1 = "KwaiPushSDK";
             String str2 = "";
             if (uobyteArray == null) {
                Channel kS = Channel.KS;
                PushLogger.a().h(str2, new NullPointerException("ks told us byteArray is null"), kS);
                PushLogcat.e$default(PushLogcat.INSTANCE, "KwaiPushSDK", "process "+kS+" push failed, because byteArray is null.", null, 4, null);
             }else {
                String str3 = new String(uobyteArray, d.a);
                JsonElement jsonElement = PushDataExtKt.toJson(str3);
                if (PushDataExtKt.isPushDataType(jsonElement)) {
                   Processor.showNotification(str3, Channel.KS);
                }else if(PushDataExtKt.isCommandDataType(jsonElement)){
                   Processor.commandProcess(str3, Channel.KS);
                }else if(PushDataExtKt.isOldDataProtocol(jsonElement)){
                   Processor.showNotification(str3, Channel.KS);
                }else {
                   IllegalStateException illegalState = new IllegalStateException("deserialize protocol not recognized!");
                   Channel kS1 = Channel.KS;
                   PushLogger.a().h(str3, illegalState, kS1);
                   PushLogcat.INSTANCE.e(str1, "deserialize protocol not recognized! channel:"+kS1+str+str3, illegalState);
                }
             }
          }
       }
       return;
    }
}
