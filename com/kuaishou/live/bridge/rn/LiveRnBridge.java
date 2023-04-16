package com.kuaishou.live.bridge.rn.LiveRnBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kuaishou.live.bridge.rn.LiveRnChannelHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.Promise;
import com.kuaishou.live.external.invoke.krn.LiveRnCommandParams;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o63.o;
import java.util.Objects;
import o63.a;
import l41.a;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import o63.j;
import java.lang.StringBuilder;
import java.lang.System;
import com.kuaishou.live.bridge.rn.LiveRnBridge$a;
import qs5.e;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import java.lang.Throwable;
import com.facebook.react.bridge.ReadableMap;
import com.kuaishou.live.external.invoke.krn.LiveJsContainerParams;
import t71.b;
import java.lang.Runnable;
import q33.b;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import ri0.a;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Boolean;
import java.lang.Integer;
import o63.m;
import o63.m$a;
import t71.d;
import t71.e;

public class LiveRnBridge extends KrnBridge	// class@000e2d
{
    public final LiveRnChannelHandler mChannelHandler;
    public final ReactApplicationContext mReactApplicationContext;

    public void LiveRnBridge(ReactApplicationContext p0){
       super(p0);
       this.mReactApplicationContext = p0;
       this.mChannelHandler = new LiveRnChannelHandler(p0);
    }
    public static void a(LiveRnBridge p0,Promise p1,LiveRnCommandParams p2,String p3){
       p0.lambda$execute$0(p1, p2, p3);
    }
    private void lambda$execute$0(Promise p0,LiveRnCommandParams p1,String p2){
       this.doExecute(p0, p1, p2);
    }
    public final void doExecute(Promise p0,LiveRnCommandParams p1,String p2){
       boolean b;
       String str = "liveId not exits";
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRnBridge.class, "4")) {
          return;
       }
       try{
          b = o.a(p1.getCommand());
          Objects.requireNonNull(p2);
          a uoa = a.a(p2);
          int i = -1;
          if (uoa == null) {
             b.Z(LiveJsBridgeLogTag.RN, str);
             this.startExecuteError(b, p0, i, str);
             return;
          }else if(p1.getCommand() == null){
             this.startExecuteError(b, p0, i, "command is required");
             return;
          }else {
             j oj = uoa.Ce("KwaiLive", p1.getCommand());
             if (oj == null) {
                this.startExecuteError(b, p0, -2, "command not found: "+p1.getCommand());
                return;
             }else {
                LiveRnBridge$a uoa1 = new LiveRnBridge$a(this, "LiveRnBridge"+System.currentTimeMillis(), p1, uoa, oj, b, p0);
                LivePluginManager.h(true, str);
             }
          }
       }catch(java.lang.Exception e12){
          b.I(LiveJsBridgeLogTag.RN, "execute command failed", e12);
          p0.reject(e12);
       }
       return;
    }
    public void execute(ReadableMap p0,Promise p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRnBridge.class, str)) {
          return;
       }
       LiveRnCommandParams liveRnComman = this.parseReadableMap(p0, p1);
       if (liveRnComman == null) {
          p1.reject(str, "params is required");
          return;
       }else {
          b.Z(LiveJsBridgeLogTag.RN, "execute command: "+liveRnComman.getCommand()+" "+p0);
          LiveJsContainerParams containerPar = liveRnComman.getContainerParams();
          Objects.requireNonNull(containerPar);
          this.mReactApplicationContext.runOnUiQueueThread(new b(this, p1, liveRnComman, containerPar.a()));
          return;
       }
    }
    public String getName(){
       return "LiveRnBridge";
    }
    public final b parseChannelParams(ReadableMap p0,Promise p1,Class p2){
       b obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveRnBridge.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          Gson a = a.a;
          b uob = a.h(a.q(a.b(p0)), p2);
          LiveJsContainerParams liveJsContai = uob.a();
          if (liveJsContai == null) {
             b.Z(LiveJsBridgeLogTag.RN, "containerParams is required");
             p1.reject("1", "containerParams is required");
             return obj;
          }else {
             String str = liveJsContai.a();
             if (str != null && !str.isEmpty()) {
                return uob;
             }
             b.Z(LiveJsBridgeLogTag.RN, "liveId is required");
             p1.reject("1", "liveId is required");
             return obj;
          }
       }catch(java.lang.Exception e9){
          b.I(LiveJsBridgeLogTag.RN, "parse json failed", e9);
          p1.reject("parse json failed", e9);
          return obj;
       }
    }
    public final LiveRnCommandParams parseReadableMap(ReadableMap p0,Promise p1){
       String str = "containerParams is required";
       LiveRnCommandParams obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveRnBridge.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          Gson a = a.a;
          LiveRnCommandParams liveRnComman = a.h(a.q(this.toHashMap(p0)), LiveRnCommandParams.class);
          String command = liveRnComman.getCommand();
          LiveJsContainerParams containerPar = liveRnComman.getContainerParams();
          if (command == null || command.isEmpty()) {
             b.Z(LiveJsBridgeLogTag.RN, "command is required");
             p1.reject("1", "command is required");
             return obj;
          }else if(containerPar == null){
             b.Z(LiveJsBridgeLogTag.RN, str);
             p1.reject("1", str);
             return obj;
          }else {
             str = containerPar.a();
             if (str != null && !str.isEmpty()) {
                return liveRnComman;
             }
             b.Z(LiveJsBridgeLogTag.RN, "liveId is required");
             p1.reject("1", "liveId is required");
             return obj;
          }
       }catch(java.lang.Exception e8){
          b.I(LiveJsBridgeLogTag.RN, "parse json failed", e8);
          p1.reject("parse json failed", e8);
          return obj;
       }
    }
    public final void startExecuteError(boolean p0,Promise p1,int p2,String p3){
       if (PatchProxy.isSupport(LiveRnBridge.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, Integer.valueOf(p2), p3, this, LiveRnBridge.class, "5")) {
          return;
       }
       if (p0) {
          p1.reject("1", p3);
       }else {
          m om = m.class;
          if (PatchProxy.isSupport(om)) {
             om = PatchProxy.applyTwoRefs(Integer.valueOf(p2), p3, null, om, "9");
             if (om != PatchProxyResult.class) {
             label_0048 :
                p1.resolve(om.d(false, true));
             }
          }
          om = m.g.a(p2, p3);
          goto label_0048 ;
       }
       return;
    }
    public void subscribeChannel(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRnBridge.class, "2")) {
          return;
       }
       LiveJsBridgeLogTag rN = LiveJsBridgeLogTag.RN;
       b.Z(rN, "subscribeChannel: "+p0+", for: "+this);
       d uod = this.parseChannelParams(p0, p1, d.class);
       if (uod != null) {
          try{
             String str = this.mChannelHandler.a(uod);
             b.Z(rN, "subscribeChannel success, id: "+str+", for: "+this);
             p1.resolve(str);
          }catch(java.lang.Exception e5){
             b.I(LiveJsBridgeLogTag.RN, "subscribeChannel failed, for: "+this, e5);
             p1.reject(e5);
          }
       }
    }
    public void unsubscribeChannel(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRnBridge.class, "3")) {
          return;
       }
       b.Z(LiveJsBridgeLogTag.RN, "unsubscribeChannel: "+p0+", for: "+this);
       e uoe = this.parseChannelParams(p0, p1, e.class);
       if (uoe != null) {
          try{
             this.mChannelHandler.b(uoe);
             p1.resolve(null);
          }catch(java.lang.Exception e4){
             p1.reject(e4);
          }
       }
    }
}
