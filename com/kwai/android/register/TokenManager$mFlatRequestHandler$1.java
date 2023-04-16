package com.kwai.android.register.TokenManager$mFlatRequestHandler$1;
import android.os.Handler$Callback;
import java.lang.Object;
import android.os.Message;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import com.kwai.android.common.bean.Channel;
import android.os.Bundle;
import com.kwai.android.register.TokenManager;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Enum;
import java.util.Map;
import com.kwai.android.api.PushApi;
import com.kwai.android.register.TokenManager$mFlatRequestHandler$1$1;
import com.android.kwai.foundation.network.IRpcService$Callback;
import p45.f;
import com.kwai.android.pushlog.PushLogger;
import java.lang.Exception;
import kotlin.Pair;
import qrd.r0;
import java.lang.Throwable;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;

public final class TokenManager$mFlatRequestHandler$1 implements Handler$Callback	// class@0009df
{
    public static final TokenManager$mFlatRequestHandler$1 INSTANCE;

    static {
       TokenManager$mFlatRequestHandler$1.INSTANCE = new TokenManager$mFlatRequestHandler$1();
    }
    public void TokenManager$mFlatRequestHandler$1(){
       super();
    }
    public final boolean handleMessage(Message p0){
       int i;
       a.p(p0, "message");
       try{
          i = 1;
          object oobject = Channel.values()[p0.getData().getInt("channelOrdinal")];
          String str = p0.getData().getString("token");
          a.m(str);
          TokenManager.access$getTokenUploadingMap$p(TokenManager.INSTANCE).put(oobject.name(), str);
          TokenManager$mFlatRequestHandler$1$1 omFlatReques = new TokenManager$mFlatRequestHandler$1$1(oobject, SystemClock.elapsedRealtime(), p0.getData().getBoolean("ignoreRestrict"), str);
          PushApi.INSTANCE.registerPushToken(oobject, str, v10);
       }catch(java.lang.Exception e1){
          Pair[] pairArray = new Pair[i];
          pairArray[0] = r0.a("channelType", String.valueOf(p0.what));
          PushLogger.c().f("tag_error_token_handler_callback", String.valueOf(e1.getMessage()), e1, pairArray);
          PushLogcat.INSTANCE.e("KwaiPushSDK", "token upload handler has fatal error!!! channelType: "+p0.what, e1);
       }
       return i;
    }
}
