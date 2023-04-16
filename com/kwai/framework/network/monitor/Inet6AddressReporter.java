package com.kwai.framework.network.monitor.Inet6AddressReporter;
import com.kwai.framework.network.monitor.Inet6AddressReporter$a;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import java.net.NetworkInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.Ref$ObjectRef;
import qe6.b;
import com.kwai.privacykit.interceptor.MacAddressInterceptor;
import java.util.Enumeration;
import com.kwai.framework.deviceid.a;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import trd.v;
import java.net.InetAddress;
import java.net.Inet6Address;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.List;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kwai.framework.network.monitor.Inet6AddressReporter$addInet6AddressLocked$1;
import msd.l;
import trd.y;
import com.kwai.framework.network.monitor.Inet6AddressReporter$addInet6AddressLocked$2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import okio.ByteString;
import java.lang.IllegalStateException;
import xb6.a;
import java.lang.Throwable;
import q87.c;

public final class Inet6AddressReporter	// class@0017fb
{
    public final ReentrantLock a;
    public final List b;
    public final List c;
    public static final Inet6AddressReporter$a d;

    static {
       Inet6AddressReporter.d = new Inet6AddressReporter$a(null);
    }
    public void Inet6AddressReporter(){
       super();
       this.a = new ReentrantLock();
       this.b = new ArrayList();
       this.c = new ArrayList();
    }
    public final void a(NetworkInterface p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, Inet6AddressReporter.class, "5")) {
          return;
       }
       String name = p0.getName();
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       Object obj = null;
       objectRef.element = obj;
       if (b.a()) {
          objectRef.element = MacAddressInterceptor.getHardwareAddress(p0);
       }
       Enumeration uEnumeration = a.c(p0);
       a.o(uEnumeration, "networkInterface.inetAddresses");
       Iterator iterator = v.f0(uEnumeration);
       while (iterator.hasNext()) {
          InetAddress inetAddress = iterator.next();
          if (!inetAddress instanceof Inet6Address) {
             continue ;
          }else {
             InetAddress inetAddress1 = inetAddress;
             if (!inetAddress1.isLinkLocalAddress() && (!inetAddress1.isSiteLocalAddress() && (inetAddress1.isLoopbackAddress() || inetAddress1.isAnyLocalAddress()))) {
                continue ;
             }else {
                a.o(name, "name");
                b = false;
                int i = 2;
                if (StringsKt__StringsKt.O2(name, "wlan", b, i, obj)) {
                   this.b.add(inetAddress);
                }else if(StringsKt__StringsKt.O2(name, "rmnet", b, i, obj)){
                   this.c.add(inetAddress);
                }else if(StringsKt__StringsKt.O2(name, "bridge", b, i, obj)){
                   continue ;
                }else {
                   b.a(0x4b316083).f1("unknown_network_interface", name, 21);
                }
             }
          }
       }
       Inet6AddressReporter$addInet6AddressLocked$2 uoaddInet6Ad = 1;
       if (this.b.size() > uoaddInet6Ad) {
          y.K0(this.b, new Inet6AddressReporter$addInet6AddressLocked$1(this, objectRef));
       }
       if (this.c.size() > uoaddInet6Ad) {
          y.K0(this.c, new Inet6AddressReporter$addInet6AddressLocked$2(this, objectRef));
       }
       return;
    }
    public final boolean b(Inet6Address p0,byte[] p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Inet6AddressReporter inet6Address = Inet6AddressReporter.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, inet6Address, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p1 == null || p1.length != 6) {
          return b;
       }
       int i = 8;
       ByteString uByteString = ByteString.of(p0.getAddress(), i, i);
       ByteString uByteString1 = PatchProxy.applyOneRefs(p1, this, inet6Address, "7");
       if (uByteString1 != patchProxyRe) {
       }else {
          int i1 = 1;
          byte[] uobyteArray = (p1.length == 6)? 1: null;
          if (uobyteArray) {
             uobyteArray = new byte[i];
             uobyteArray[b] = (byte)(p1[b] | 2);
             uobyteArray[i1] = p1[i1];
             uobyteArray[2] = p1[2];
             uobyteArray[3] = (byte)255;
             uobyteArray[4] = (byte)254;
             uobyteArray[5] = p1[3];
             uobyteArray[6] = p1[4];
             uobyteArray[7] = p1[5];
             uByteString1 = ByteString.of(uobyteArray);
             a.o(uByteString1, "ByteString.of\(\n        m¡­],\n        macAddress[5]\)");
          }else {
             throw new IllegalStateException("Check failed.".toString());
          }
       }
       return a.g(uByteString, uByteString1);
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, Inet6AddressReporter.class, "4")) {
          return;
       }
       this.b.clear();
       this.c.clear();
       Enumeration networkInter = NetworkInterface.getNetworkInterfaces();
       a.o(networkInter, "interfaces");
       Iterator iterator = v.f0(networkInter);
       while (iterator.hasNext()) {
          NetworkInterface networkInter1 = iterator.next();
          a.o(networkInter1, "networkInterface");
          String name = networkInter1.getName();
          a.o(name, "networkInterface.name");
          if (StringsKt__StringsKt.O2(name, "dummy", false, 2, null)) {
             continue ;
          }else {
             try{
                this.a(networkInter1);
             }catch(java.io.IOException e3){
                a.C().e("Inet6AddressReporter", "Failed getting ipv6 address.", e3);
                goto label_0025 ;
             }catch(java.lang.Exception e3){
                a.C().e("Inet6AddressReporter", "Some unknown error: ", e3);
                goto label_0025 ;
             }
          }
       }
       return;
    }
}
