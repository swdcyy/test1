package com.kuaishou.dfp.envdetect.Proxy.EngineProxy;
import android.content.Context;
import java.lang.Object;
import l30.y;
import com.kuaishou.dfp.envdetect.jni.Watermelon;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import l30.k;
import i30.t;
import l30.o;
import l30.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.ContentResolver;
import android.provider.Settings$Global;
import com.kwai.framework.deviceid.a;
import android.provider.Settings$System;
import i30.n;
import java.lang.Boolean;
import java.lang.StringBuilder;
import i30.a;

public class EngineProxy	// class@000834
{
    public String mBqpInfo;
    public Context mContext;
    public String mCpuInfo;
    public String mEgidJson;
    public String mInodes;
    public String mKeeper;
    public String mManus;
    public y mPre;
    public String mProps;
    public Watermelon mWatermelon;
    public static EngineProxy singleton;

    public void EngineProxy(Context p0){
       super();
       this.mCpuInfo = "";
       this.mBqpInfo = "";
       this.mInodes = "";
       this.mKeeper = "";
       this.mManus = "";
       this.mProps = "";
       this.mEgidJson = "";
       this.mContext = p0;
       this.mPre = new y(p0);
       this.mWatermelon = Watermelon.getInstance();
    }
    public static EngineProxy getInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EngineProxy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (EngineProxy.singleton == null) {
          _monitor_enter(EngineProxy.class);
          if (EngineProxy.singleton == null) {
             EngineProxy.singleton = new EngineProxy(p0);
          }
          _monitor_exit(EngineProxy.class);
       }
       return EngineProxy.singleton;
    }
    public static String getLocalStatus(int p0,String p1){
       String obj1;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EngineProxy uEngineProxy = EngineProxy.class;
       Object obj = null;
       if (PatchProxy.isSupport(uEngineProxy)) {
          obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, obj, uEngineProxy, "18");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = "";
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          String[] obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, obj, ok, "41");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
          label_0036 :
             Context uContext = t.c().d();
             obj2 = (o.a(uContext, "TLdlfk3bpUaCQLpj0AbyBYA6n2J80GXXSo3dA6+k/fs804+yY5wCmHuUWorGwZFn")).split("@");
             if (p0) {
                int i = 1;
                if (p0 != i) {
                   if (p0 != 2) {
                      str = obj1;
                   }else {
                      str = a.b(uContext, obj2[2], p1);
                      if (TextUtils.isEmpty(str)) {
                         str = Settings$Global.getString(uContext.getContentResolver(), p1);
                      }
                   }
                }else {
                   str = a.b(uContext, obj2[i], p1);
                   if (TextUtils.isEmpty(str)) {
                      str = a.g(uContext.getContentResolver(), p1);
                   }
                }
             }else {
                str = a.b(uContext, obj2[0], p1);
                if (TextUtils.isEmpty(str)) {
                   str = Settings$System.getString(uContext.getContentResolver(), p1);
                }
             }
             if (!TextUtils.isEmpty(str)) {
                obj1 = str;
             }
          }
       }else {
          goto label_0036 ;
       }
       return obj1;
    }
    public static String getrooted(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EngineProxy.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return n.o(p0, false);
    }
    public synchronized String bqp(){
       String obj = PatchProxy.apply(null, this, EngineProxy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isReject()) {
          return "";
       }
       if (!TextUtils.isEmpty(this.mBqpInfo)) {
          return this.mBqpInfo;
       }
       obj = this.mWatermelon.jniCommand(0x120007, null, null, null);
       this.mBqpInfo = obj;
       return obj;
    }
    public String ckro(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EngineProxy.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Watermelon.sLibLoadFail) {
          return "KWE_NS";
       }
       if (!this.mPre.a()) {
          return "KWE_NPN";
       }
       return Watermelon.getInstance().jniCommand(0x120002, p0, null, null);
    }
    public synchronized String crtt(){
       String obj = PatchProxy.apply(null, this, EngineProxy.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isReject()) {
          return "";
       }
       if (!TextUtils.isEmpty(this.mCpuInfo)) {
          return this.mCpuInfo;
       }
       obj = this.mWatermelon.jniCommand(0x11000c, null, null, null);
       this.mCpuInfo = obj;
       return obj;
    }
    public synchronized String gRdi(){
       Object obj = PatchProxy.apply(null, this, EngineProxy.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mInodes)) {
          return this.mInodes;
       }
       if (this.isReject()) {
          return "";
       }
       this.mInodes = Watermelon.getInstance().jniCommand(0x110010, null, null, null);
       return this.mInodes;
    }
    public String getDu(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EngineProxy.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isReject()) {
          return "";
       }
       return this.mWatermelon.jniCommand(0x11001a, p0, null, null);
    }
    public synchronized String getKeeperSeed(){
       String obj = PatchProxy.apply(null, this, EngineProxy.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mKeeper)) {
          return this.mKeeper;
       }
       if (this.isReject()) {
          return "";
       }
       obj = this.mWatermelon.jniCommand(0x110014, null, null, null);
       this.mKeeper = obj;
       return obj;
    }
    public synchronized String getManus(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EngineProxy.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mManus)) {
          return this.mManus;
       }
       if (this.isReject()) {
          return "";
       }
       this.mManus = this.mWatermelon.jniCommand(0x11001c, p0, this.mContext.getPackageName(), null);
       return this.mManus;
    }
    public final boolean isReject(){
       Object obj = PatchProxy.apply(null, this, EngineProxy.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Watermelon.sLibLoadFail) {
          return true;
       }
       if (!this.mPre.a()) {
          return true;
       }
       return false;
    }
    public synchronized String lpss(){
       String obj = PatchProxy.apply(null, this, EngineProxy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mProps)) {
          return this.mProps;
       }
       if (this.isReject()) {
          return "";
       }
       obj = this.mWatermelon.jniCommand(0x110013, null, null, null);
       this.mProps = obj;
       return obj;
    }
    public String mmcc(){
       Object obj = PatchProxy.apply(null, this, EngineProxy.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isReject()) {
          return "";
       }
       return this.mWatermelon.jniCommand(0x120001, null, null, null);
    }
    public String nzz(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EngineProxy.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isReject()) {
          return "";
       }
       return this.mWatermelon.jniCommand(0x120005, p0, null, null);
    }
    public String rdd(){
       Object obj = PatchProxy.apply(null, this, EngineProxy.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isReject()) {
          return "";
       }
       return this.mWatermelon.jniCommand(0x120006, null, null, null);
    }
    public byte[] simpleEncrypt(byte[] p0,byte[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EngineProxy.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isReject()) {
          return null;
       }
       return this.mWatermelon.ssec(p0, p1, this.mContext);
    }
    public synchronized String stdd(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(EngineProxy.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, EngineProxy.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.isReject()) {
          return "";
       }else if(TextUtils.isEmpty(p1)){
          p1 = (p2)? "1"+a.a().l(): "0"+a.a().l();
       }else if(p2){
          p1 = "1"+p1;
       }else {
          p1 = "0"+p1;
       }
       return this.mWatermelon.jniCommand(0x13001b, "", p0, p1);
    }
    public synchronized String sted(String p0,boolean p1){
       String str;
       EngineProxy uEngineProxy = EngineProxy.class;
       if (PatchProxy.isSupport(uEngineProxy)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uEngineProxy, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.isReject()) {
          return "";
       }else if(TextUtils.isEmpty(p0) && !TextUtils.isEmpty(this.mEgidJson)){
          return this.mEgidJson;
       }else if(p1){
          str = "1"+a.a().l();
       }else {
          str = "0"+a.a().l();
       }
       if (!TextUtils.isEmpty(p0)) {
          return this.mWatermelon.jniCommand(0x11001b, "", p0, str);
       }else {
          p0 = this.mWatermelon.jniCommand(0x11001b, "", p0, str);
          this.mEgidJson = p0;
          return p0;
       }
    }
}
