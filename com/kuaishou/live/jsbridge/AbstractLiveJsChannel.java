package com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import o63.f;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel$a;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel$mainScope$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ftd.k0;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel$publish$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import kotlin.jvm.internal.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel$notifyUnsubscribeEvent$1;
import java.util.HashSet;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel$publish$2;
import o63.h;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.Map;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel$notifySubscribeEvent$1;
import java.util.concurrent.CancellationException;
import ftd.l0;
import lp3.e;
import java.lang.Number;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel$encodeResult$2;
import lp3.c;

public abstract class AbstractLiveJsChannel implements f	// class@001d17
{
    public String a;
    public e b;
    public final ConcurrentHashMap c;
    public final p d;
    public boolean e;
    public AtomicInteger f;
    public static final AbstractLiveJsChannel$a g;

    static {
       AbstractLiveJsChannel.g = new AbstractLiveJsChannel$a(null);
    }
    public void AbstractLiveJsChannel(){
       super();
       this.c = new ConcurrentHashMap();
       this.d = s.c(AbstractLiveJsChannel$mainScope$2.INSTANCE);
       this.f = new AtomicInteger();
    }
    public final void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractLiveJsChannel.class, "10")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       a.f(this.h(), null, null, new AbstractLiveJsChannel$publish$1(this, p0, null), 3, null);
       return;
    }
    public final void b(String p0){
       AbstractLiveJsChannel uAbstractLiv = AbstractLiveJsChannel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAbstractLiv, "13")) {
          return;
       }
       a.p(p0, "subscribeId");
       if (this.e != null) {
          return;
       }
       if (this.c.remove(p0) != null && !PatchProxy.applyVoidOneRefs(p0, this, uAbstractLiv, "17")) {
          a.f(this.h(), null, null, new AbstractLiveJsChannel$notifyUnsubscribeEvent$1(this, p0, null), 3, null);
       }
       return;
    }
    public final void c(HashSet p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AbstractLiveJsChannel.class, "11")) {
          return;
       }
       a.p(p0, "subscribeIds");
       if (this.e != null) {
          return;
       }
       a.f(this.h(), null, null, new AbstractLiveJsChannel$publish$2(this, p0, p1, null), 3, null);
       return;
    }
    public final String d(h p0,LiveJsSubscribeParams$Params p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, AbstractLiveJsChannel.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "subscriber");
       if (this.e != null) {
          return null;
       }
       obj = PatchProxy.apply(null, this, AbstractLiveJsChannel.class, "18");
       if (obj != patchProxyRe) {
       }else {
          StringBuilder str = "sub-id-"+this.f.incrementAndGet()+'-'+System.currentTimeMillis()+':';
          AbstractLiveJsChannel uAbstractLiv = PatchProxy.apply(null, this, AbstractLiveJsChannel.class, "1");
          if (uAbstractLiv != patchProxyRe) {
          }else {
             uAbstractLiv = this.a;
             if (uAbstractLiv == null) {
                a.S("channelName");
             }
          }
          obj = str+uAbstractLiv;
       }
       this.c.put(obj, p0);
       if (!PatchProxy.applyVoidTwoRefs(obj, p1, this, AbstractLiveJsChannel.class, "16")) {
          a.f(this.h(), null, null, new AbstractLiveJsChannel$notifySubscribeEvent$1(this, obj, p1, null), 3, null);
       }
       return obj;
    }
    public final void destroy(){
       if (PatchProxy.applyVoid(null, this, AbstractLiveJsChannel.class, "15")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       l0.f(this.h(), null, true, null);
       this.l();
       this.c.clear();
       return;
    }
    public final void e(String p0,e p1){
       AbstractLiveJsChannel uAbstractLiv = AbstractLiveJsChannel.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uAbstractLiv, "9")) {
          return;
       }
       a.p(p0, "channelName");
       a.p(p1, "serviceManager");
       if (!PatchProxy.applyVoidOneRefs(p0, this, uAbstractLiv, "2")) {
          a.p(p0, "<set-?>");
          this.a = p0;
       }
       this.b = p1;
       this.k();
       return;
    }
    public final int f(){
       Object obj = PatchProxy.apply(null, this, AbstractLiveJsChannel.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.size();
    }
    public final Object g(Object p0,c p1){
       return a.i(z0.e(), new AbstractLiveJsChannel$encodeResult$2(p0, null), p1);
    }
    public String getChannelName(){
       AbstractLiveJsChannel obj = PatchProxy.apply(null, this, AbstractLiveJsChannel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("channelName");
       }
       return obj;
    }
    public final k0 h(){
       Object obj = PatchProxy.apply(null, this, AbstractLiveJsChannel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final c i(Class p0){
       AbstractLiveJsChannel obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsChannel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       obj = this.b;
       if (obj == null) {
          a.S("serviceManager");
       }
       c uoc = obj.a(p0);
       a.o(uoc, "serviceManager.getService\(clazz\)");
       return uoc;
    }
    public final e j(){
       AbstractLiveJsChannel obj = PatchProxy.apply(null, this, AbstractLiveJsChannel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("serviceManager");
       }
       return obj;
    }
    public void k(){
    }
    public void l(){
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AbstractLiveJsChannel.class, "5")) {
          return;
       }
       a.p(p0, "subscribeId");
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractLiveJsChannel.class, "6")) {
          return;
       }
       a.p(p0, "subscribeId");
       return;
    }
}
