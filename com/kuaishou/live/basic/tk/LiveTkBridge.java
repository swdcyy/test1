package com.kuaishou.live.basic.tk.LiveTkBridge;
import tx4.l;
import com.kuaishou.live.basic.tk.LiveTkBridge$Companion;
import nsd.u;
import o63.a;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.basic.tk.LiveTkBridge$subscriberIdsDelegate$1;
import qrd.p;
import qrd.s;
import crd.a;
import com.kuaishou.live.basic.tk.LiveTkBridge$mainScope$2;
import tx4.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ftd.k0;
import com.kuaishou.live.basic.tk.LiveTkBridge$invoke$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import tx4.k;
import com.kuaishou.live.basic.tk.LiveTkBridge$executeCommand$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.basic.tk.LiveTkCommandParams;
import com.kuaishou.live.basic.tk.LiveTkBridge$c;
import o63.o;
import o63.m;
import o63.m$a;
import o63.l;
import qrd.l1;
import o63.j;
import com.kuaishou.live.basic.tk.LiveTkBridge$b;
import o63.p;
import o63.j$a;
import java.util.HashSet;
import com.kuaishou.live.basic.tk.LiveTkBridge$invokeInMainScope$1;
import com.kuaishou.live.basic.tk.LiveTkBridge$AsyncResolver;
import com.kuaishou.live.basic.tk.LiveTkBridge$subscribeChannel$1;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams;
import o63.f;
import com.kuaishou.live.basic.tk.LiveTkBridge$d;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import o63.h;
import com.kuaishou.live.basic.tk.LiveTkBridge$a;
import com.kuaishou.live.basic.tk.LiveTkBridge$unsubscribeChannel$1;
import o63.s;

public final class LiveTkBridge implements l	// class@000d1d
{
    public final p a;
    public final p b;
    public final a c;
    public final p d;
    public boolean e;
    public a f;
    public final a g;
    public final a h;
    public static final LiveTkBridge$Companion i;

    static {
       LiveTkBridge.i = new LiveTkBridge$Companion(null);
    }
    public void LiveTkBridge(a p0,a p1){
       a.p(p0, "jsBridgeService");
       a.p(p1, "dismiss");
       super();
       this.g = p0;
       this.h = p1;
       LazyThreadSafetyMode nONE = LazyThreadSafetyMode.NONE;
       p op = s.b(nONE, LiveTkBridge$subscriberIdsDelegate$1.INSTANCE);
       this.a = op;
       this.b = op;
       this.c = new a();
       this.d = s.b(nONE, LiveTkBridge$mainScope$2.INSTANCE);
    }
    public void LiveTkBridge(a p0,a p1,a p2){
       a.p(p0, "jsBridgeService");
       a.p(p1, "dismiss");
       a.p(p2, "tkWidgetOnClick");
       super(p0, p1);
       this.f = p2;
    }
    public Object a(String p0,String p1,h p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveTkBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.f(this.e(), null, null, new LiveTkBridge$invoke$1(this, p0, p1, p2, null), 3, null);
       return null;
    }
    public Object b(String p0,String p1,String p2,h p3){
       return k.a(this, p0, p1, p2, p3);
    }
    public final Object d(String p0,h p1,c p2){
       LiveTkBridge$executeCommand$1 uoexecuteCom;
       LiveTkBridge$executeCommand$1 uoexecuteCom1;
       LiveTkBridge$executeCommand$1 l$0;
       if (p2 instanceof LiveTkBridge$executeCommand$1) {
          uoexecuteCom = p2;
          LiveTkBridge$executeCommand$1 label = uoexecuteCom.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoexecuteCom.label = label - i;
          label_0018 :
             LiveTkBridge$executeCommand$1 result = uoexecuteCom.result;
             j obj = b.h();
             LiveTkBridge$executeCommand$1 label1 = uoexecuteCom.label;
             String str = null;
             if (label1 != null) {
                if (label1 == 1) {
                   uoexecuteCom1 = uoexecuteCom.L$2;
                   l$0 = uoexecuteCom.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                b.Z(LiveJsBridgeLogTag.TK, "execute: "+p0+' '+p1);
                if (p0 != null) {
                   uoexecuteCom.L$0 = this;
                   uoexecuteCom.L$1 = p0;
                   uoexecuteCom.L$2 = p1;
                   uoexecuteCom.L$3 = p0;
                   uoexecuteCom.label = 1;
                   result = LiveTkBridge.i.a(p0, LiveTkCommandParams.class, uoexecuteCom);
                   if (result == obj) {
                      return obj;
                   }else {
                      l$0 = this;
                   }
                }else {
                   l$0 = this;
                   result = str;
                label_0081 :
                   if (result != null) {
                      str = result.getCommand();
                   }
                   LiveTkBridge$c uoc = new LiveTkBridge$c(uoexecuteCom1, result, o.a(str));
                   if (l$0.e != null) {
                      uoc.b(m.g.c("LiveTkBridge is destroyed"));
                      return l1.a;
                   }else if(result != null){
                      String command = result.getCommand();
                      if (command != null) {
                         obj = l$0.g.Ce("KwaiLive", command);
                         if (obj != null) {
                            obj.c(result, uoc, new LiveTkBridge$b(l$0));
                            return l1.a;
                         }else {
                            uoc.b(m.g.a(-2, "unknown command: "+command));
                            return l1.a;
                         }
                      }else {
                         uoc.b(m.g.c("command is required"));
                         return l1.a;
                      }
                   }else {
                      uoc.b(m.g.c("invalid params: params"));
                      return l1.a;
                   }
                }
             }
             goto label_0081 ;
          }
       }
       uoexecuteCom = new LiveTkBridge$executeCommand$1(this, p2);
       goto label_0018 ;
    }
    public final k0 e(){
       Object obj = PatchProxy.apply(null, this, LiveTkBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final HashSet f(){
       Object obj = PatchProxy.apply(null, this, LiveTkBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final Object g(String p0,String p1,h p2,c p3){
       LiveTkBridge$invokeInMainScope$1 oinvokeInMai;
       LiveTkBridge$invokeInMainScope$1 l$4;
       LiveTkBridge$AsyncResolver uAsyncResolv1;
       if (p3 instanceof LiveTkBridge$invokeInMainScope$1) {
          oinvokeInMai = p3;
          LiveTkBridge$invokeInMainScope$1 label = oinvokeInMai.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oinvokeInMai.label = label - i;
          label_0018 :
             LiveTkBridge$invokeInMainScope$1 result = oinvokeInMai.result;
             Object obj = b.h();
             LiveTkBridge$invokeInMainScope$1 label1 = oinvokeInMai.label;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 != 2) {
                      if (label1 == 3) {
                         l$4 = oinvokeInMai.L$4;
                         j0.n(result);
                      label_00c9 :
                         l$4.b(result);
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      l$4 = oinvokeInMai.L$4;
                      j0.n(result);
                   label_0108 :
                      l$4.b(result);
                   }
                }else {
                   j0.n(result);
                }
             }else {
                j0.n(result);
                LiveTkBridge$AsyncResolver uAsyncResolv = new LiveTkBridge$AsyncResolver(p2, this.e());
                if (p0 != null) {
                   switch (p0.hashCode()){
                       case 0xc8889059:
                         if (p0.equals("subscribeChannel")) {
                            oinvokeInMai.L$0 = this;
                            oinvokeInMai.L$1 = p0;
                            oinvokeInMai.L$2 = p1;
                            oinvokeInMai.L$3 = p2;
                            oinvokeInMai.L$4 = uAsyncResolv;
                            oinvokeInMai.label = 2;
                            p0 = this.h(p1, p2, oinvokeInMai);
                            if (p0 == obj) {
                               return obj;
                            }else {
                               result = p0;
                               uAsyncResolv1 = uAsyncResolv;
                               goto label_0108 ;
                            }
                         }
                         break;
                       case 0xf3bb2216:
                         if (p0.equals("executeCommand")) {
                            oinvokeInMai.L$0 = this;
                            oinvokeInMai.L$1 = p0;
                            oinvokeInMai.L$2 = p1;
                            oinvokeInMai.L$3 = p2;
                            oinvokeInMai.L$4 = uAsyncResolv;
                            oinvokeInMai.label = 1;
                            if (this.d(p1, p2, oinvokeInMai) == obj) {
                               return obj;
                            }
                         }
                         break;
                       case 0x48324cf2:
                         if (p0.equals("unsubscribeChannel")) {
                            oinvokeInMai.L$0 = this;
                            oinvokeInMai.L$1 = p0;
                            oinvokeInMai.L$2 = p1;
                            oinvokeInMai.L$3 = p2;
                            oinvokeInMai.L$4 = uAsyncResolv;
                            oinvokeInMai.label = 3;
                            p0 = this.i(p1, oinvokeInMai);
                            if (p0 == obj) {
                               return obj;
                            }else {
                               result = p0;
                               uAsyncResolv1 = uAsyncResolv;
                               goto label_00c9 ;
                            }
                         }
                         break;
                       case 0x6c121ece:
                         if (p0.equals("tkWidgetOnClick")) {
                            LiveTkBridge tf = this.f;
                            if (tf != null) {
                               l1 ol1 = tf.invoke();
                            }
                         }
                         break;
                       default:
                   }
                }
                b.B(LiveJsBridgeLogTag.TK, "invalid functionName");
             }
             return l1.a;
          }
       }
       oinvokeInMai = new LiveTkBridge$invokeInMainScope$1(this, p3);
       goto label_0018 ;
    }
    public final Object h(String p0,h p1,c p2){
       LiveTkBridge$subscribeChannel$1 osubscribeCh;
       LiveTkBridge$subscribeChannel$1 osubscribeCh1;
       LiveTkBridge$subscribeChannel$1 l$0;
       m om;
       if (p2 instanceof LiveTkBridge$subscribeChannel$1) {
          osubscribeCh = p2;
          LiveTkBridge$subscribeChannel$1 label = osubscribeCh.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             osubscribeCh.label = label - i;
          label_0018 :
             LiveTkBridge$subscribeChannel$1 result = osubscribeCh.result;
             Object obj = b.h();
             LiveTkBridge$subscribeChannel$1 label1 = osubscribeCh.label;
             if (label1 != null) {
                if (label1 == true) {
                   osubscribeCh1 = osubscribeCh.L$2;
                   l$0 = osubscribeCh.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                b.Z(LiveJsBridgeLogTag.TK, "subscribeChannel: "+p0+' '+p1);
                if (this.e != null) {
                   return m.g.c("LiveTkBridge is destroyed");
                }else if(p1 == null){
                   return m.g.c("function is required");
                }else if(p0 != null){
                   osubscribeCh.L$0 = this;
                   osubscribeCh.L$1 = p0;
                   osubscribeCh.L$2 = p1;
                   osubscribeCh.L$3 = p0;
                   osubscribeCh.label = 1;
                   result = LiveTkBridge.i.a(p0, LiveJsSubscribeParams.class, osubscribeCh);
                   if (result == obj) {
                      return obj;
                   }else {
                      l$0 = this;
                   }
                }else {
                label_00f2 :
                   return m.g.c("invalid params");
                }
             }
             if (result != null) {
                String str = result.a();
                if (str != null) {
                   f uof = l$0.g.V9(str);
                   if (uof != null) {
                      String str1 = uof.d(new LiveTkBridge$d(new LiveTkBridge$AsyncResolver(osubscribeCh1, l$0.e())), result.b());
                      if (str1 != null) {
                         l$0.f().add(str1);
                         LiveTkBridge$a uoa = new LiveTkBridge$a(0, str1, null, 5, null);
                         om = m.g.f(l$0.f(), true);
                         if (om != null) {
                         label_00df :
                            return om;
                         }
                      }
                      om = m.g.c("subscribe failed");
                      goto label_00df ;
                   }else {
                      return m.g.c("channel is not found");
                   }
                }else {
                   return m.g.c("channel is required");
                }
             }else {
                goto label_00f2 ;
             }
          }
       }
       osubscribeCh = new LiveTkBridge$subscribeChannel$1(this, p2);
       goto label_0018 ;
    }
    public final Object i(String p0,c p1){
       LiveTkBridge$unsubscribeChannel$1 ounsubscribe;
       LiveTkBridge$unsubscribeChannel$1 l$0;
       if (p1 instanceof LiveTkBridge$unsubscribeChannel$1) {
          ounsubscribe = p1;
          LiveTkBridge$unsubscribeChannel$1 label = ounsubscribe.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             ounsubscribe.label = label - i;
          label_0018 :
             LiveTkBridge$unsubscribeChannel$1 result = ounsubscribe.result;
             Object obj = b.h();
             LiveTkBridge$unsubscribeChannel$1 label1 = ounsubscribe.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$0 = ounsubscribe.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                b.Z(LiveJsBridgeLogTag.TK, "unsubscribeChannel: "+p0);
                if (this.e != null) {
                   return m.g.c("LiveTkBridge is destroyed");
                }else if(p0 != null){
                   ounsubscribe.L$0 = this;
                   ounsubscribe.L$1 = p0;
                   ounsubscribe.L$2 = p0;
                   ounsubscribe.label = 1;
                   result = LiveTkBridge.i.a(p0, s.class, ounsubscribe);
                   if (result == obj) {
                      return obj;
                   }else {
                      l$0 = this;
                   }
                }else {
                label_00b1 :
                   return m.g.c("invalid params");
                }
             }
             if (result != null) {
                String str = result.a();
                if (str != null) {
                   f uof = l$0.g.j9(str);
                   if (uof != null) {
                      uof.b(str);
                      l$0.f().remove(str);
                      return m$a.g(m.g, null, false, 3, null);
                   }else {
                      return m.g.c("invalid subscribeId");
                   }
                }else {
                   return m.g.c("subscribeId is required");
                }
             }else {
                goto label_00b1 ;
             }
          }
       }
       ounsubscribe = new LiveTkBridge$unsubscribeChannel$1(this, p1);
       goto label_0018 ;
    }
}
