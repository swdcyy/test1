package com.kwai.android.register.TokenManager;
import java.util.concurrent.ConcurrentHashMap;
import android.os.Handler;
import android.os.Looper;
import com.kwai.android.register.TokenManager$mFlatRequestHandler$1;
import android.os.Handler$Callback;
import java.lang.Object;
import com.kwai.android.common.bean.Channel;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.register.Register;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.android.register.Register$Companion;
import java.lang.StringBuilder;
import java.lang.Enum;
import java.util.Objects;
import p45.g;
import com.kwai.android.pushlog.PushLogger;
import kotlin.Pair;
import qrd.r0;
import com.kwai.android.common.utils.PushLogcat;
import com.kwai.android.common.ext.StringExtKt;
import java.lang.CharSequence;
import zsd.u;
import com.kwai.android.common.config.PushPreference;
import android.os.Message;
import android.os.Bundle;
import com.kwai.android.common.config.PushConfigManager;
import java.lang.System;

public final class TokenManager	// class@0009e0
{
    public static final TokenManager INSTANCE;
    public static final Handler mFlatRequestHandler;
    public static final ConcurrentHashMap tokenUploadingMap;

    static {
       TokenManager.INSTANCE = new TokenManager();
       TokenManager.tokenUploadingMap = new ConcurrentHashMap();
       TokenManager.mFlatRequestHandler = new Handler(Looper.getMainLooper(), TokenManager$mFlatRequestHandler$1.INSTANCE);
    }
    public void TokenManager(){
       super();
    }
    public static final ConcurrentHashMap access$getTokenUploadingMap$p(TokenManager p0){
       return TokenManager.tokenUploadingMap;
    }
    public static final void uploadToken(Channel p0,String p1,boolean p2){
       String str7;
       Pair[] pairArray;
       StringBuilder str8;
       String str9;
       a.p(p0, "channel");
       String str = ", ignoreRestrict:";
       String str1 = ", token:";
       String str2 = "KwaiPushSDK";
       String str3 = " token: ";
       String str4 = "\(this as java.lang.String\).toLowerCase\(\)";
       String str5 = "null cannot be cast to non-null type java.lang.String";
       String str6 = "ignoreRestrict";
       int i = 1;
       if (!Register.Companion.getRegisterSuccessChannel().contains(p0)) {
          str7 = p0.name();
          Objects.requireNonNull(str7, str5);
          str5 = str7.toLowerCase();
          a.o(str5, str4);
          pairArray = new Pair[i];
          pairArray[0] = r0.a(str6, String.valueOf(p2));
          PushLogger.g().e(p0, 2, str5+str3+p1, pairArray);
          PushLogcat.INSTANCE.i(str2, "uploadToken not register channel:"+p0.name()+str1+StringExtKt.toUndercover(p1)+str+p2);
          return;
       }else if(p1 == null || u.S1(p1)){
          str8 = 1;
       }else {
          str8 = null;
       }
       if (str8) {
          str7 = p0.name();
          Objects.requireNonNull(str7, str5);
          str5 = str7.toLowerCase();
          a.o(str5, str4);
          Pair[] pairArray1 = new Pair[i];
          pairArray1[0] = r0.a(str6, String.valueOf(p2));
          PushLogger.g().e(p0, i, str5+str3+p1, pairArray1);
          PushLogcat.INSTANCE.i(str2, "uploadToken token is blank channel:"+p0.name()+str1+StringExtKt.toUndercover(p1)+str+p2);
          return;
       }else {
          int i1 = 3;
          if (!p2) {
             TokenManager iNSTANCE = TokenManager.INSTANCE;
             if (!iNSTANCE.isTokenHasChanged(p0, p1) && !iNSTANCE.isTimeToUpdateTokenToServer(p0)) {
                str9 = p0.name();
                Objects.requireNonNull(str9, str5);
                str5 = str9.toLowerCase();
                a.o(str5, str4);
                pairArray = new Pair[i];
                pairArray[0] = r0.a(str6, String.valueOf(p2));
                PushLogger.g().e(p0, i1, str5+str3+p1+" period:"+PushPreference.getChannelTokenRegisterPeriod()+" is too often!!", pairArray);
                PushLogcat.INSTANCE.i(str2, "uploadToken token is upload too often channel:"+p0.name()+str1+StringExtKt.toUndercover(p1)+str+p2);
                return;
             }
          }
          if (!p2 && TokenManager.INSTANCE.isSameTokenUploading(p0, p1)) {
             str9 = p0.name();
             Objects.requireNonNull(str9, str5);
             str5 = str9.toLowerCase();
             a.o(str5, str4);
             pairArray = new Pair[i];
             pairArray[0] = r0.a(str6, String.valueOf(p2));
             PushLogger.g().e(p0, i1, str5+str3+p1+" is not change, and same token are uploading on the way!!! ", pairArray);
             PushLogcat.INSTANCE.i(str2, "uploadToken token: token is not change!!! channel:"+p0.name()+str1+StringExtKt.toUndercover(p1)+str+p2+" and same token are uploading on the way!!!");
             return;
          }else {
             Handler mFlatRequest = TokenManager.mFlatRequestHandler;
             mFlatRequest.removeMessages(p0.type);
             Message message = Message.obtain(mFlatRequest, p0.type);
             a.o(message, "message");
             message.setData(new Bundle());
             message.getData().putString("token", p1);
             message.getData().putInt("channelOrdinal", p0.ordinal());
             message.getData().putBoolean(str6, p2);
             mFlatRequest.sendMessageDelayed(message, PushConfigManager.INSTANCE.getFlatUploadTokenDelayMs());
             return;
          }
       }
    }
    public static void uploadToken$default(Channel p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x04) {
          p2 = false;
       }
       TokenManager.uploadToken(p0, p1, p2);
       return;
    }
    public final boolean isSameTokenUploading(Channel p0,String p1){
       boolean b;
       try{
          b = a.g(TokenManager.tokenUploadingMap.get(p0.name()), p1);
       }catch(java.lang.Exception e0){
          b = false;
       }
       return b;
    }
    public final boolean isTimeToUpdateTokenToServer(Channel p0){
       boolean b = ((System.currentTimeMillis() - PushPreference.getChannelTokenUpdateTime(p0)) - PushPreference.getChannelTokenRegisterPeriod() >= 0)? true: false;
       return b;
    }
    public final boolean isTokenHasChanged(Channel p0,String p1){
       return (a.g(PushPreference.getChannelToken(p0), p1) ^ 0x01);
    }
    public final void removeSameToken(Channel p0,String p1){
       ConcurrentHashMap tokenUploadi = TokenManager.tokenUploadingMap;
       if (a.g(tokenUploadi.get(p0.name()), p1)) {
          tokenUploadi.remove(p0.name());
       }
       return;
    }
}
