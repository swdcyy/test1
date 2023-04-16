package com.kwai.android.register.KuaiShouRegister;
import com.kwai.android.register.Register;
import com.kwai.android.register.KuaiShouRegister$Companion;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.register.KuaiShouRegister$linkPushTokenListener$1;
import com.kwai.android.register.KuaiShouRegister$refreshTokenReceiver$1;
import com.kwai.chat.kwailink.client.c0;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.register.TokenManager;
import java.lang.CharSequence;
import zsd.u;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.ext.StringExtKt;
import p45.f;
import com.kwai.android.pushlog.PushLogger;
import kotlin.Pair;
import qrd.r0;
import com.yxcorp.gifshow.push.kuaishou.KuaishouListener;
import java.util.Set;
import trd.d1;
import o75.e0;
import o75.c0;
import com.kwai.android.common.utils.ContextProvider;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Intent;

public final class KuaiShouRegister extends Register	// class@0009d3
{
    public final c0 linkPushTokenListener;
    public final KuaiShouRegister$refreshTokenReceiver$1 refreshTokenReceiver;
    public static final String CMD_PUSH = "Push.ZtPush.Push";
    public static final KuaiShouRegister$Companion Companion;

    static {
       KuaiShouRegister.Companion = new KuaiShouRegister$Companion(null);
    }
    public void KuaiShouRegister(Context p0){
       a.p(p0, "context");
       super(p0);
       this.linkPushTokenListener = KuaiShouRegister$linkPushTokenListener$1.INSTANCE;
       this.refreshTokenReceiver = new KuaiShouRegister$refreshTokenReceiver$1(this);
    }
    public final boolean isKwaiLinkConnected(){
       c0 uoc0 = c0.e();
       a.o(uoc0, "KwaiLinkClient.getInstance\(\)");
       return c0.n(uoc0.f());
    }
    public void refreshToken(boolean p0){
       String str = c0.i();
       if (this.isKwaiLinkConnected()) {
          TokenManager.uploadToken(Channel.KS, str, p0);
       }else {
          Channel uChannel = null;
          StringBuilder str1 = (str == null || u.S1(str))? 1: null;
          if (!str1) {
             TokenManager.uploadToken(Channel.KS, str, p0);
          }else {
             Channel kS = Channel.KS;
             PushLogcat.INSTANCE.i("KwaiPushSDK", "refreshToken "+kS+" refreshToken is not execute! token: "+StringExtKt.toUndercover(str)+"  state: "+this.isKwaiLinkConnected()+' ');
             str1 = kS;
             Pair[] pairArray = new Pair[]{r0.a("isSendAvailableState", String.valueOf(this.isKwaiLinkConnected())),r0.a("token", String.valueOf(str))};
             PushLogger.c().h("tag_info_refresh_token", str1+" refreshToken is not execute! ", pairArray);
          }
       }
       return;
    }
    public boolean register(){
       String[] stringArray = new String[]{"Push.ZtPush.Push"};
       c0.e().C(new KuaishouListener(), d1.q(stringArray));
       c0.A(this.linkPushTokenListener);
       Context context = ContextProvider.getContext();
       a.o(context, "ContextProvider.getContext\(\)");
       ContextProvider.getContext().registerReceiver(this.refreshTokenReceiver, new IntentFilter("com.action.kwai.force.refreshToken.ACTION"), context.getPackageName()+".refreshToken.ALLOW_RECEIVED", null);
       return true;
    }
    public String sdkVersion(){
       return "3.6.24";
    }
}
