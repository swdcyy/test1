package com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import o63.j;
import java.lang.Object;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand$mainScope$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import o63.k;
import lp3.e;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o63.o;
import o63.p;
import o63.l;
import o63.j$a;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ftd.k0;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand$execute$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.robust.PatchProxyResult;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand$decodeParams$2;
import java.util.concurrent.CancellationException;
import ftd.l0;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand$doExecute$1;
import csd.b;
import o63.m;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;
import o63.q;
import java.util.Objects;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand$encodeResult$2;
import java.lang.Exception;
import o63.m$a;
import qrd.l1;
import lp3.c;

public abstract class AbstractLiveJsCommand implements j	// class@001d1d
{
    public k a;
    public e b;
    public boolean c;
    public final p d;

    public void AbstractLiveJsCommand(){
       super();
       this.d = s.c(AbstractLiveJsCommand$mainScope$2.INSTANCE);
    }
    public abstract Class a();
    public final void b(k p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AbstractLiveJsCommand.class, "8")) {
          return;
       }
       a.p(p0, "commandId");
       a.p(p1, "serviceManager");
       this.a = p0;
       this.b = p1;
       this.c = o.a(p0.getCommandName());
       this.j();
       return;
    }
    public final void c(p p0,l p1,j$a p2){
       String this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AbstractLiveJsCommand.class, "10")) {
          return;
       }
       a.p(p0, "params");
       a.p(p1, "resolver");
       a.p(p2, "jsPage");
       LiveJsBridgeLogTag cOMMON = LiveJsBridgeLogTag.COMMON;
       StringBuilder str = "AbstractLiveJsCommand.execute: ";
       AbstractLiveJsCommand ta = this.a;
       this = "commandId";
       if (ta == null) {
          a.S(this);
       }
       str = str+ta.getNameSpace()+'.';
       ta = this.a;
       if (ta == null) {
          a.S(this);
       }
       b.Z(cOMMON, str+ta.getCommandName()+' '+p0+' '+p2);
       a.f(this.f(), null, null, new AbstractLiveJsCommand$execute$1(this, p0, p1, p2, null), 3, null);
       return;
    }
    public final Object d(String p0,Class p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AbstractLiveJsCommand.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.i(z0.e(), new AbstractLiveJsCommand$decodeParams$2(p0, p1, null), p2);
    }
    public final void destroy(){
       if (PatchProxy.applyVoid(null, this, AbstractLiveJsCommand.class, "9")) {
          return;
       }
       this.k();
       l0.f(this.f(), null, 1, null);
       return;
    }
    public final Object e(p p0,l p1,j$a p2,c p3){
       AbstractLiveJsCommand$doExecute$1 uodoExecute$;
       AbstractLiveJsCommand$doExecute$1 l$5;
       AbstractLiveJsCommand$doExecute$1 l$2;
       AbstractLiveJsCommand$doExecute$1 l$0;
       l ol;
       AbstractLiveJsCommand a;
       int i2;
       AbstractLiveJsCommand$doExecute$1 l$1;
       AbstractLiveJsCommand$doExecute$1 l$01;
       if (p3 instanceof AbstractLiveJsCommand$doExecute$1) {
          uodoExecute$ = p3;
          AbstractLiveJsCommand$doExecute$1 label = uodoExecute$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uodoExecute$.label = label - i;
             try{
             label_0018 :
                AbstractLiveJsCommand$doExecute$1 result = uodoExecute$.result;
                AbstractLiveJsCommand obj = b.h();
                AbstractLiveJsCommand$doExecute$1 label1 = uodoExecute$.label;
                AbstractLiveJsCommand$doExecute$1 uodoExecute$1 = 2;
                int i1 = 1;
                if (label1 != null) {
                   try{
                      if (label1 != i1) {
                         if (label1 != uodoExecute$1) {
                            if (label1 == 3) {
                               l$5 = uodoExecute$.L$5;
                               l$2 = uodoExecute$.L$2;
                               l$0 = uodoExecute$.L$0;
                               try{
                                  j0.n(result);
                                  try{
                                  label_0121 :
                                     LiveJsBridgeLogTag cOMMON = LiveJsBridgeLogTag.COMMON;
                                     StringBuilder str = "AbstractLiveJsCommand.execute: ";
                                     obj = l$0.a;
                                     if (obj == null) {
                                        a.S("commandId");
                                     }
                                     str = str+obj.getNameSpace()+'.';
                                     a = l$0.a;
                                     if (a == null) {
                                        a.S("commandId");
                                     }
                                     b.Z(cOMMON, str+a.getCommandName()+" result: "+l$5);
                                     l$2.b(l$5);
                                  }catch(java.lang.Exception e11){
                                     ol = l$2;
                                  }
                               }catch(java.lang.Exception e11){
                               }
                            }else {
                               throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                         }else {
                            l$5 = uodoExecute$.L$4;
                            l$2 = uodoExecute$.L$3;
                            l$0 = uodoExecute$.L$2;
                            label1 = uodoExecute$.L$1;
                            uodoExecute$1 = uodoExecute$.L$0;
                            try{
                               j0.n(result);
                               result = l$0;
                               l$0 = uodoExecute$1;
                               uodoExecute$1 = label1;
                               label1 = result;
                               try{
                               label_00f1 :
                                  uodoExecute$.L$0 = l$0;
                                  uodoExecute$.L$1 = uodoExecute$1;
                                  uodoExecute$.L$2 = result;
                                  uodoExecute$.L$3 = l$2;
                                  uodoExecute$.L$4 = l$5;
                                  uodoExecute$.L$5 = label1;
                                  uodoExecute$.label = 3;
                                  Objects.requireNonNull(l$0);
                                  if (a.i(z0.e(), new AbstractLiveJsCommand$encodeResult$2(l$0, label1, (i1 ^ a.g(l$2.a(), q.c)), null), uodoExecute$) == obj) {
                                     return obj;
                                  }else {
                                     l$2 = result;
                                     l$5 = label1;
                                     goto label_0121 ;
                                  }
                               }catch(java.lang.Exception e11){
                                  i2 = result;
                               }
                            }catch(java.lang.Exception e11){
                            }
                         }
                      }else {
                         l$5 = uodoExecute$.L$7;
                         l$2 = uodoExecute$.L$4;
                         l$0 = uodoExecute$.L$3;
                         label1 = uodoExecute$.L$2;
                         l$1 = uodoExecute$.L$1;
                         l$01 = uodoExecute$.L$0;
                         j0.n(result);
                         result = l$2;
                         l$2 = label1;
                         label1 = result;
                      }
                   }catch(java.lang.Exception e11){
                   }
                }else {
                   j0.n(result);
                   Ref$ObjectRef objectRef = new Ref$ObjectRef();
                   objectRef.element = null;
                   String commandParam = p0.getCommandParams();
                   if (commandParam != null) {
                      Class uClass = this.a();
                      if (uClass != null) {
                         uodoExecute$.L$0 = this;
                         uodoExecute$.L$1 = p0;
                         uodoExecute$.L$2 = p1;
                         uodoExecute$.L$3 = p2;
                         uodoExecute$.L$4 = objectRef;
                         uodoExecute$.L$5 = commandParam;
                         uodoExecute$.L$6 = uClass;
                         uodoExecute$.L$7 = objectRef;
                         uodoExecute$.label = i1;
                         label1 = this.d(commandParam, uClass, uodoExecute$);
                         if (label1 == obj) {
                            return obj;
                         }else {
                            l$01 = this;
                            l$1 = p0;
                            Ref$ObjectRef objectRef1 = objectRef;
                         }
                      }
                   }
                   l$01 = this;
                label_00d7 :
                   uodoExecute$.L$0 = l$01;
                   uodoExecute$.L$1 = l$5;
                   uodoExecute$.L$2 = l$2;
                   uodoExecute$.L$3 = l$0;
                   uodoExecute$.L$4 = result;
                   uodoExecute$.label = uodoExecute$1;
                   label1 = l$01.l(result.element, l$0, uodoExecute$);
                   if (label1 == obj) {
                      return obj;
                   }else {
                      uodoExecute$1 = l$5;
                      l$5 = result;
                      result = l$2;
                      l$2 = l$0;
                      l$0 = l$01;
                      goto label_00f1 ;
                   }
                }
                l$5.element = label1;
                l$5 = l$1;
                goto label_00d7 ;
             }catch(java.lang.Exception e11){
             }catch(java.lang.Exception e11){
                i2 = l$2;
             }
             ol.b(m.g.b(e11));
          }
       }
       uodoExecute$ = new AbstractLiveJsCommand$doExecute$1(this, p3);
       goto label_0018 ;
    }
    public final k0 f(){
       Object obj = PatchProxy.apply(null, this, AbstractLiveJsCommand.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final c g(Class p0){
       AbstractLiveJsCommand obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsCommand.class, "6");
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
    public final e h(){
       AbstractLiveJsCommand obj = PatchProxy.apply(null, this, AbstractLiveJsCommand.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("serviceManager");
       }
       return obj;
    }
    public final c i(Class p0){
       AbstractLiveJsCommand obj = PatchProxy.applyOneRefs(p0, this, AbstractLiveJsCommand.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       obj = this.b;
       if (obj == null) {
          a.S("serviceManager");
       }
       return obj.c(p0);
    }
    public void j(){
    }
    public void k(){
    }
    public abstract Object l(Object p0,j$a p1,c p2);
}
