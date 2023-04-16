package com.ks.klppullclient.KlpPullClient;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.ks.klppullclient.KlpLogLevel;
import com.ks.klppullclient.KlpLogListener;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Enum;

public class KlpPullClient	// class@000743
{
    public static KlpLogListener a;

    public void KlpPullClient(){
       super();
    }
    public static void AddPreConnectUrls(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KlpPullClient.class, "3")) {
          return;
       }
       KlpPullClient._addPreConnectUrls(p0, p1);
       return;
    }
    public static void PrintVersion(){
       if (PatchProxy.applyVoid(null, null, KlpPullClient.class, "2")) {
          return;
       }
       KlpPullClient._printVersion();
       return;
    }
    public static native void _addPreConnectUrls(String p0,String p1);
    public static native void _printVersion();
    public static native void _setLogLevel(int p0);
    public static void loadSoManually(){
       if (PatchProxy.applyVoid(null, null, KlpPullClient.class, "1")) {
          return;
       }
       System.loadLibrary("klp_pull_client_shared");
       return;
    }
    public static void postLog(KlpLogLevel p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KlpPullClient.class, "5")) {
          return;
       }
       if (KlpPullClient.a == null) {
          return;
       }
       KlpPullClient.a.onLog(p0, p1, (long)p1.length());
       return;
    }
    public static void postLogFromNative(int p0,String p1,long p2){
       if (PatchProxy.isSupport(KlpPullClient.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), null, KlpPullClient.class, "6")) {
          return;
       }
       if (KlpPullClient.a == null) {
          return;
       }
       KlpPullClient.a.onLog(KlpLogLevel.values()[p0], p1, p2);
       return;
    }
    public static void setLogLevel(KlpLogLevel p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KlpPullClient.class, "4")) {
          return;
       }
       KlpPullClient._setLogLevel(p0.ordinal());
       return;
    }
    public static void setLogListener(KlpLogListener p0){
       KlpPullClient.a = p0;
    }
}
