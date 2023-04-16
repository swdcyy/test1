package com.kwai.eve.so.SoVm;
import com.kwai.eve.so.SoVm$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import qrd.l1;
import ml5.a;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import cn.vimfung.luascriptcore.LuaValue;
import java.util.Map;
import java.lang.Long;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.NullPointerException;

public final class SoVm	// class@000dcf
{
    public String actionResult;
    public boolean alive;
    public final Object executeLock;
    public final long nativePtr;
    public static final SoVm$a Companion;
    public static final Object loadLock;

    static {
       SoVm.Companion = new SoVm$a(null);
       SoVm.loadLock = new Object();
    }
    public void SoVm(long p0,boolean p1,String p2){
       super();
       this.nativePtr = p0;
       this.alive = p1;
       this.actionResult = p2;
       this.executeLock = new Object();
    }
    public final void finalize(){
       if (PatchProxy.applyVoid(null, this, SoVm.class, "4")) {
          return;
       }
       Object loadLock = SoVm.loadLock;
       _monitor_enter(loadLock);
       SoVm tnativePtr = this.nativePtr;
       if (tnativePtr - null > 0 && this.alive != null) {
          LuaNativeUtil.unloadSo(tnativePtr);
       }
       _monitor_exit(loadLock);
       return;
    }
    public final a invoke(String p0,a p1){
       SoVm obj = PatchProxy.applyTwoRefs(p0, p1, this, SoVm.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "entry");
       obj = this.executeLock;
       _monitor_enter(obj);
       if (this.alive == null) {
          throw new Exception("The SoVm has been shut down");
       }
       if (p1 != null) {
          p1 = p1.a;
          if (p1 != null) {
          label_0027 :
             p0 = LuaNativeUtil.invokeSo(this.nativePtr, p0, p1);
             if (p0 != null) {
                p1 = p0.get("code");
                if (p1 != null) {
                   long l = p1.longValue();
                   if (l - null) {
                      StringBuilder str = "code: "+l+", desc: ";
                      p0 = p0.get("desc");
                      if (p0 == null) {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }else {
                         throw new Exception(str+p0);
                      }
                   }else if(p0.get("data") != null){
                      _monitor_exit(obj);
                      return new a(p0.get("data"));
                   }else {
                      _monitor_exit(obj);
                      return null;
                   }
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
             }
          }
       }
       LuaValue luaValue = new LuaValue();
       goto label_0027 ;
    }
    public final a invokeProxy(String p0,a p1){
       SoVm obj = PatchProxy.applyTwoRefs(p0, p1, this, SoVm.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "entry");
       obj = this.executeLock;
       _monitor_enter(obj);
       if (!a.g(p0, "recoFriendlyDiversity_SSII")) {
          p0 = "proxy_"+p0;
       }
       _monitor_exit(obj);
       return this.invoke(p0, p1);
    }
    public final void unload(){
       if (PatchProxy.applyVoid(null, this, SoVm.class, "3")) {
          return;
       }
       Object loadLock = SoVm.loadLock;
       _monitor_enter(loadLock);
       if (this.alive != null) {
          this.alive = false;
          LuaNativeUtil.unloadSo(this.nativePtr);
       }
       _monitor_exit(loadLock);
       return;
    }
}
