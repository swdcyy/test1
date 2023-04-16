package com.yxcorp.gifshow.social.bridge.Klink.a;
import kjc.b;
import java.util.HashSet;
import java.lang.Object;
import kjc.d;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zk.d;
import com.google.gson.Gson;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkBridgeTagsParams;
import f55.g;
import java.util.Set;
import com.kwai.chat.kwailink.client.c0;
import f85.a;
import android.os.Bundle;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkCallbackResult;
import com.yxcorp.gifshow.social.bridge.Klink.a$a;
import o75.b0;
import com.kwai.yoda.event.d;
import com.kwai.yoda.bridge.YodaBaseWebView;
import js6.a;
import p55.a;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkListenCommands;
import java.util.Objects;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import o75.f0;
import java.util.Map;
import java.util.Iterator;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkAppIDParams;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkBridgeSendParams;
import com.kwai.chat.kwailink.data.PacketData;
import android.util.Base64;
import com.yxcorp.gifshow.social.bridge.Klink.a$b;
import o75.j0;
import kjc.a;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkStateParams;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkState;
import java.lang.Enum;
import kjc.c;
import o75.e0;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkInstanceIDParams;
import java.lang.Number;
import java.lang.Long;
import com.kwai.chat.kwailink.client.s;
import com.kwai.chat.kwailink.client.c0$b;

public class a implements b	// class@001d50
{
    public c0 f;
    public b0 g;
    public e0 h;
    public d i;
    public static final Set j;

    static {
       a.j = new HashSet();
    }
    public void a(){
       super();
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = new d();
    }
    public static String Pa(Object p0){
       d obj = PatchProxy.applyOneRefs(p0, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       obj = new d();
       obj.n();
       return obj.b().q(p0);
    }
    public void H(KlinkBridgeTagsParams p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       KlinkBridgeTagsParams mBizId = p0.mBizId;
       if (mBizId == null || mBizId.isEmpty()) {
          p1.a(-1, "Klink subscribe tag, biz id is null.", null);
          return;
       }else {
          Set j = a.j;
          this.i.b(j);
          this.Na().H(p0.mBizId, j, this.i);
          return;
       }
    }
    public void La(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.Na().c();
       p0.onSuccess(new KlinkCallbackResult(true));
       return;
    }
    public final c0 Na(){
       c0 obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          obj = c0.class;
          _monitor_enter(obj);
          if (this.f == null) {
             this.f = c0.e();
             this.g = new a$a(this);
             this.f.z(this.g);
          }
          _monitor_exit(obj);
       }
       return this.f;
    }
    public void Oa(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "12")) {
          return;
       }
       d.f().c(null, p0, a.Pa(p1));
       a b = a.b;
       b.MM(p0, a.Pa(p1));
       b.GO(p0, p1);
       return;
    }
    public void V(a p0,KlinkBridgeTagsParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "6")) {
          return;
       }
       Bundle uBundle = null;
       if (p1.mBizId == null) {
          p2.a(-1, "Klink subscribe tag, biz id is null.", uBundle);
          return;
       }else if(p1.mTags.isEmpty()){
          p2.a(-1, "Klink subscribe tag, tags is null.", uBundle);
          return;
       }else {
          WeakReference weakReferenc = new WeakReference(p0);
          this.i.b(p1.mTags);
          this.Na().H(p1.mBizId, p1.mTags, this.i);
          p2.onSuccess(new KlinkCallbackResult(true));
          return;
       }
    }
    public void Y2(KlinkListenCommands p0,g p1){
       Map a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       c0 uoc0 = this.Na();
       a th = this.h;
       p0 = p0.mCommands;
       Objects.requireNonNull(uoc0);
       if (!PatchProxy.applyVoidTwoRefs(th, p0, uoc0, c0.class, "30")) {
          a.e("KwaiLinkClient", "unsetPacketReceiveListener, listener="+th+", commands="+p0);
          if (!PatchProxy.applyVoidTwoRefs(th, p0, null, f0.class, "10")) {
             String str = "$";
             if (!PatchProxy.applyVoidThreeRefs(th, str, p0, null, f0.class, "2")) {
                f0.h(p0);
                a = f0.a;
                if (!PatchProxy.applyVoidFourRefs(th, str, p0, a, null, f0.class, "8")) {
                   _monitor_enter(a);
                   str = f0.a(str);
                   Map map = a.get(str);
                   if (map == null) {
                      _monitor_exit(a);
                   }else {
                      Iterator iterator = p0.iterator();
                      while (iterator.hasNext()) {
                         String str1 = iterator.next();
                         Set set = map.get(str1);
                         if (set == null) {
                            continue ;
                         }else {
                            set.remove(th);
                            if (set.isEmpty()) {
                               map.remove(str1);
                            }
                         }
                      }
                      if (map.isEmpty()) {
                         a.remove(str);
                      }
                      _monitor_exit(a);
                   }
                }
             }
          }
       }
       p1.onSuccess(new KlinkCallbackResult(true));
       return;
    }
    public void b1(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       p0.onSuccess(new KlinkAppIDParams(String.valueOf(this.Na().d())));
       return;
    }
    public void e8(KlinkBridgeSendParams p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       PacketData packetData = new PacketData();
       packetData.t(p0.mCommand);
       KlinkBridgeSendParams mRequestData = p0.mRequestData;
       int i = 2;
       if (mRequestData != null && !mRequestData.isEmpty()) {
          packetData.w(Base64.decode(p0.mRequestData, i));
       }
       mRequestData = p0.mLogParam;
       if (mRequestData != null && !mRequestData.isEmpty()) {
          packetData.E(Base64.decode(p0.mLogParam, i));
       }
       mRequestData = p0.mSubBiz;
       if (mRequestData != null && !mRequestData.isEmpty()) {
          packetData.H(p0.mSubBiz);
       }
       this.Na().u(packetData, (int)p0.mTransferTimeoutInMilliseconds, (int)p0.mCacheTimeoutInMilliseconds, new a$b(this, p1), true);
       return;
    }
    public String getNameSpace(){
       return a.a(this);
    }
    public void n5(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       p0.onSuccess(new KlinkStateParams(KlinkState.values()[this.Na().f()].name()));
       return;
    }
    public void u3(KlinkListenCommands p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       if (this.h == null) {
          this.h = new c(this);
       }
       this.Na().C(this.h, p0.mCommands);
       p1.onSuccess(new KlinkCallbackResult(true));
       return;
    }
    public void z4(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       c0 uoc0 = this.Na();
       Objects.requireNonNull(uoc0);
       Object obj = PatchProxy.apply(null, uoc0, c0.class, "64");
       long l = (obj != PatchProxyResult.class)? obj.longValue(): c0.b("getInstanceId", Long.valueOf(0), s.a).longValue();
       p0.onSuccess(new KlinkInstanceIDParams(String.valueOf(l)));
       return;
    }
}
