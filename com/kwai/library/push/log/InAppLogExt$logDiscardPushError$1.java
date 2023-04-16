package com.kwai.library.push.log.InAppLogExt$logDiscardPushError$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.library.push.model.InAppNotification;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class InAppLogExt$logDiscardPushError$1 extends Lambda implements l	// class@0008ce
{
    public static final InAppLogExt$logDiscardPushError$1 INSTANCE;

    static {
       InAppLogExt$logDiscardPushError$1.INSTANCE = new InAppLogExt$logDiscardPushError$1();
    }
    public void InAppLogExt$logDiscardPushError$1(){
       super(1);
    }
    public final CharSequence invoke(InAppNotification p0){
       a.p(p0, "it");
       String bizType = p0.getBizType();
       a.o(bizType, "it.bizType");
       return bizType;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
