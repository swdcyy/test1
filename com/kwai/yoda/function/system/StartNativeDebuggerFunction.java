package com.kwai.yoda.function.system.StartNativeDebuggerFunction;
import com.kwai.yoda.function.c;
import com.kwai.yoda.function.system.StartNativeDebuggerFunction$a;
import nsd.u;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.function.system.StartNativeDebuggerFunction$b;
import yz7.e;
import java.lang.CharSequence;
import ty7.j;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import ty7.a;
import com.kwai.yoda.kernel.YodaException;
import java.lang.Throwable;
import com.kwai.yoda.function.system.StartNativeDebuggerFunction$c;
import com.kwai.yoda.function.system.StartNativeDebuggerFunction$d;
import erd.g;
import crd.b;
import com.kwai.yoda.bridge.YodaException;

public final class StartNativeDebuggerFunction extends c	// class@0011ff
{
    public static final StartNativeDebuggerFunction$a f;

    static {
       StartNativeDebuggerFunction.f = new StartNativeDebuggerFunction$a(null);
    }
    public void StartNativeDebuggerFunction(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       a a;
       t ot1;
       StartNativeDebuggerFunction startNativeD = StartNativeDebuggerFunction.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(startNativeD)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, startNativeD, "1")) {
             return;
          }
       }
       StartNativeDebuggerFunction$b uob = e.a(p3, StartNativeDebuggerFunction$b.class);
       String str = "The Input parameter is invalid.";
       StartNativeDebuggerFunction$b uob1 = 0x1e84f;
       if (uob != null) {
          StartNativeDebuggerFunction$b uob2 = (!uob.ip.length())? 1: null;
          if (!uob2) {
             uob2 = (!uob.port.length())? 1: null;
             if (!uob2) {
                if (uob.wsAddressPrefix.length()) {
                   i = 0;
                }
                if (!i) {
                   j c = j.c;
                   StartNativeDebuggerFunction$b ip = uob.ip;
                   uob1 = uob.port;
                   uob = uob.wsAddressPrefix;
                   Objects.requireNonNull(c);
                   t ot = PatchProxy.applyThreeRefs(ip, uob1, uob, c, j.class, "6");
                   if (ot != PatchProxyResult.class) {
                   }else {
                      a.q(ip, "ip");
                      a.q(uob1, "port");
                      a.q(uob, "wsAddressPrefix");
                      a = j.a;
                      if (a != null) {
                         ot1 = a.a(ip, uob1, uob);
                         if (ot1 != null) {
                         label_00a4 :
                            ot = ot1;
                         }
                      }
                      ot1 = t.error(new YodaException(0x1e855, "The dev tool is disabled"));
                      a.h(ot1, "Observable.error\(\n      ¡­s disabled\"\n      \)\n    \)");
                      goto label_00a4 ;
                   }
                   StartNativeDebuggerFunction startNativeD1 = this;
                   YodaBaseWebView yodaBaseWebV = p0;
                   String str1 = p1;
                   String str2 = p2;
                   String str3 = p4;
                   StartNativeDebuggerFunction$c uoc = new StartNativeDebuggerFunction$c(startNativeD1, yodaBaseWebV, str1, str2, str3);
                   StartNativeDebuggerFunction$d uod = new StartNativeDebuggerFunction$d(startNativeD1, yodaBaseWebV, str1, str2, str3);
                   this.k(ot.subscribe(uob, ip));
                   return;
                }
             }
          }
       label_00be :
          throw new YodaException(uob1, str);
       }else {
          throw new YodaException(uob1, str);
       }
    }
}
