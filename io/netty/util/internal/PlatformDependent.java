package io.netty.util.internal.PlatformDependent;
import java.lang.Object;
import java.lang.Class;
import ard.b;
import ard.c;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.ClassLoader;
import zqd.x;
import java.util.Locale;
import java.lang.CharSequence;
import java.util.concurrent.BlockingQueue;
import java.lang.Integer;
import java.lang.Boolean;
import io.netty.util.internal.f;
import java.lang.reflect.Method;
import java.lang.Number;
import java.util.List;
import java.util.regex.Matcher;
import java.lang.Long;
import java.lang.Runtime;
import zqd.y;
import io.netty.util.internal.c;
import java.io.File;
import java.lang.System;
import java.lang.StringBuilder;
import java.nio.ByteOrder;
import java.lang.Throwable;
import java.nio.ByteBuffer;
import io.netty.util.internal.a;
import java.lang.SecurityManager;
import zqd.q;
import java.security.PrivilegedAction;
import java.security.AccessController;
import zqd.s;
import java.lang.Process;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import wqd.g;
import java.nio.charset.Charset;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.lang.Exception;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import io.netty.util.internal.g;
import sun.misc.Unsafe;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import io.netty.util.internal.i;
import zqd.e;
import io.netty.util.internal.chmv8.LongAdderV8;
import io.netty.util.internal.PlatformDependent$AtomicLongCounter;
import io.netty.util.internal.PlatformDependent$a;
import java.util.Queue;
import io.netty.util.internal.MpscLinkedQueue;

public final class PlatformDependent	// class@00111c
{
    public static final b a;
    public static final Pattern b;
    public static final boolean c;
    public static final boolean d;
    public static Boolean e;
    public static final int f;
    public static final boolean g;
    public static final boolean h;
    public static final boolean i;
    public static final boolean j;
    public static final long k;
    public static final long l;
    public static final boolean m;
    public static final File n;
    public static final int o;
    public static final int p;
    public static final boolean q;

    static {
       int b2;
       char c;
       long l2;
       File obj = Object.class;
       PlatformDependent platformDepe = PlatformDependent.class;
       PlatformDependent.a = c.a(platformDepe);
       PlatformDependent.b = Pattern.compile("\\s*-XX:MaxDirectMemorySize\\s*=\\s*\([0-9]+\)\\s*\([kKmMgG]?\)\\s*$");
       int i = 1;
       boolean b = false;
       Class.forName("android.app.Application", b, PlatformDependent.p());
       boolean b1 = true;
       if (b1) {
          PlatformDependent.a.debug("Platform: Android");
       }
       PlatformDependent.c = b1;
       String str = "";
       b1 = ((x.b("os.name", str)).toLowerCase(Locale.US)).contains("win");
       if (b1) {
          PlatformDependent.a.debug("Platform: Windows");
       }
       PlatformDependent.d = b1;
       boolean i1 = 6;
       String str1 = 8;
       if (!PlatformDependent.r()) {
          Class.forName("java.time.Clock", b, PlatformDependent.i(obj));
          i1 = 8;
       }
    label_006e :
       b a = PlatformDependent.a;
       if (a.isDebugEnabled()) {
          a.debug("Java version: {}", Integer.valueOf(i1));
       }
       PlatformDependent.f = i1;
       PlatformDependent.g = PlatformDependent.r() ^ i;
       i1 = x.c("io.netty.noUnsafe", b);
       a.debug("-Dio.netty.noUnsafe: {}", Boolean.valueOf(i1));
       if (PlatformDependent.r()) {
          a.debug("sun.misc.Unsafe: unavailable \(Android\)");
       }else if(i1){
          a.debug("sun.misc.Unsafe: unavailable \(io.netty.noUnsafe\)");
       }else {
          String str2 = "io.netty.tryUnsafe";
          String str3 = (x.a(str2) != null)? 1: null;
          i1 = (str3)? x.c(str2, i): x.c("org.jboss.netty.tryUnsafe", i);
          if (!i1) {
             a.debug("sun.misc.Unsafe: unavailable \(io.netty.tryUnsafe/org.jboss.netty.tryUnsafe\)");
          }else {
             i1 = f.n();
             str3 = "sun.misc.Unsafe: {}";
             String str4 = (i1)? "available": "unavailable";
             a.debug(str3, str4);
          label_00dc :
             PlatformDependent.h = i1;
             b1 = (i1 && PlatformDependent.f < str1)? true: false;
             PlatformDependent.i = b1;
             b1 = (i1 && !x.c("io.netty.noPreferDirect", b))? true: false;
             PlatformDependent.j = b1;
             String obj1 = null;
             long l = 0;
             Class[] uClassArray = new Class[b];
             Object[] objArray = new Object[b];
             long l1 = Class.forName("sun.misc.VM", i, PlatformDependent.p()).getDeclaredMethod("maxDirectMemory", uClassArray).invoke(obj1, objArray).longValue();
             if (l1 - l <= 0) {
                Class[] uClassArray1 = new Class[b];
                Object[] objArray1 = new Object[b];
                Class[] uClassArray2 = new Class[b];
                Object[] objArray2 = new Object[b];
                List list = Class.forName("java.lang.management.RuntimeMXBean", i, PlatformDependent.p()).getDeclaredMethod("getInputArguments", uClassArray2).invoke(Class.forName("java.lang.management.ManagementFactory", i, PlatformDependent.p()).getDeclaredMethod("getRuntimeMXBean", uClassArray1).invoke(obj1, objArray1), objArray2);
                int i2 = list.size() - i;
                while (i2 >= 0) {
                   Matcher matcher1 = PlatformDependent.b.matcher(list.get(i2));
                   if (!matcher1.matches()) {
                      i2 = i2 - 1;
                   }else {
                      l1 = Long.parseLong(matcher1.group(i));
                      c = (matcher1.group(2)).charAt(b);
                      if (c != 'G') {
                         if (c != 'K') {
                            if (c != 'M') {
                               if (c != 'g') {
                                  if (c != 'k') {
                                     if (c != 'm') {
                                        break ;
                                     }
                                  }
                               }else {
                               label_01a0 :
                                  l2 = 0x40000000;
                               }
                            }
                            l2 = 0x100000;
                         }
                         l2 = 1024;
                      }else {
                         goto label_01a0 ;
                      }
                      l1 = l1 * l2;
                      break ;
                   }
                }
                if (l1 - l <= 0) {
                   l = Runtime.getRuntime().maxMemory();
                   PlatformDependent.a.debug("maxDirectMemory: {} bytes \(maybe\)", Long.valueOf(l));
                   l1 = l;
                }else {
                   PlatformDependent.a.debug("maxDirectMemory: {} bytes", Long.valueOf(l1));
                }
             }
             PlatformDependent.k = l1;
             PlatformDependent.l = f.d;
             if (!PlatformDependent.r()) {
                b1 = x.c("io.netty.noJavassist", b);
                b a2 = PlatformDependent.a;
                a2.debug("-Dio.netty.noJavassist: {}", Boolean.valueOf(b1));
                if (b1) {
                   a2.debug("Javassist: unavailable \(io.netty.noJavassist\)");
                }else {
                   c.b(obj, PlatformDependent.i(platformDepe));
                   a2.debug("Javassist: available");
                   b2 = true;
                label_020d :
                   PlatformDependent.m = b2;
                   obj = PlatformDependent.I(x.a("io.netty.tmpdir"));
                   if (obj != null) {
                      PlatformDependent.a.debug("-Dio.netty.tmpdir: {}", obj);
                   }else {
                      obj = PlatformDependent.I(x.a("java.io.tmpdir"));
                      if (obj != null) {
                         PlatformDependent.a.debug("-Dio.netty.tmpdir: {} \(java.io.tmpdir\)", obj);
                      }else if(PlatformDependent.u()){
                         obj = PlatformDependent.I(System.getenv("TEMP"));
                         if (obj != null) {
                            PlatformDependent.a.debug("-Dio.netty.tmpdir: {} \(%TEMP%\)", obj);
                         }else {
                            String env = System.getenv("USERPROFILE");
                            if (env != null) {
                               File uFile = PlatformDependent.I(env+"\\AppData\\Local\\Temp");
                               if (uFile != null) {
                                  PlatformDependent.a.debug("-Dio.netty.tmpdir: {} \(%USERPROFILE%\\AppData\\Local\\Temp\)", uFile);
                                  obj = uFile;
                               }else {
                                  obj = PlatformDependent.I(env+"\\Local Settings\\Temp");
                                  if (obj != null) {
                                     PlatformDependent.a.debug("-Dio.netty.tmpdir: {} \(%USERPROFILE%\\Local Settings\\Temp\)", obj);
                                  }
                               }
                            }
                         }
                      }else {
                         obj = PlatformDependent.I(System.getenv("TMPDIR"));
                         if (obj != null) {
                            PlatformDependent.a.debug("-Dio.netty.tmpdir: {} \($TMPDIR\)", obj);
                         }
                      }
                      obj = (PlatformDependent.u())? new File("C:\\Windows\\Temp"): new File("/tmp");
                      PlatformDependent.a.warn("Failed to get the temporary directory; falling back to: {}", obj);
                   }
                   PlatformDependent.n = obj;
                   b2 = x.d("io.netty.bitMode", b);
                   if (b2 > 0) {
                      PlatformDependent.a.debug("-Dio.netty.bitMode: {}", Integer.valueOf(b2));
                   }else {
                      b2 = x.d("sun.arch.data.model", b);
                      if (b2 > 0) {
                         PlatformDependent.a.debug("-Dio.netty.bitMode: {} \(sun.arch.data.model\)", Integer.valueOf(b2));
                      }else {
                         b2 = x.d("com.ibm.vm.bitmode", b);
                         if (b2 > 0) {
                            PlatformDependent.a.debug("-Dio.netty.bitMode: {} \(com.ibm.vm.bitmode\)", Integer.valueOf(b2));
                         }else {
                            Locale uS = Locale.US;
                            obj1 = ((x.b("os.arch", str)).toLowerCase(uS)).trim();
                            if (("amd64").equals(obj1) || ("x86_64").equals(obj1)) {
                               b2 = 64;
                            }else if(!("i386").equals(obj1) && (!("i486").equals(obj1) && (("i586").equals(obj1) || ("i686").equals(obj1)))){
                               b2 = 32;
                            }
                            if (b2 > 0) {
                               PlatformDependent.a.debug("-Dio.netty.bitMode: {} \(os.arch: {}\)", Integer.valueOf(b2), obj1);
                            }
                            Matcher matcher = Pattern.compile("\([1-9][0-9]+\)-?bit").matcher((x.b("java.vm.name", str)).toLowerCase(uS));
                            if (matcher.find()) {
                               b2 = Integer.parseInt(matcher.group(i));
                            }else {
                               b2 = 64;
                            }
                         }
                      }
                   }
                   PlatformDependent.o = b2;
                   b2 = (!PlatformDependent.q())? -1: f.a();
                   PlatformDependent.p = b2;
                   if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                      b = true;
                   }
                   PlatformDependent.q = b;
                   b a1 = PlatformDependent.a;
                   if (a1.isDebugEnabled()) {
                      a1.debug("-Dio.netty.noPreferDirect: {}", Boolean.valueOf((PlatformDependent.j ^ i)));
                   }
                   if (!PlatformDependent.q() && !PlatformDependent.r()) {
                      a1.info("Your platform does not provide complete low-level API for accessing direct buffers reliably. Unless explicitly requested, heap buffer will always be preferred to avoid potential system unstability.");
                   }
                }
             }
             b2 = false;
             goto label_020d ;
          }
       }
       i1 = false;
       goto label_00dc ;
    }
    public void PlatformDependent(){
       super();
    }
    public static void A(byte[] p0,int p1,byte p2){
       f.q(p0, p1, p2);
    }
    public static void B(long p0,int p1){
       f.r(p0, p1);
    }
    public static void C(byte[] p0,int p1,int p2){
       f.s(p0, p1, p2);
    }
    public static void D(long p0,long p1){
       f.t(p0, p1);
    }
    public static void E(byte[] p0,int p1,long p2){
       f.u(p0, p1, p2);
    }
    public static void F(long p0,short p1){
       f.v(p0, p1);
    }
    public static void G(byte[] p0,int p1,short p2){
       f.w(p0, p1, p2);
    }
    public static void H(Throwable p0){
       if (!PlatformDependent.q()) {
          throw p0;
       }
       f.x(p0);
       return;
    }
    public static File I(String p0){
       if (p0 == null) {
          return null;
       }
       File uFile = new File(p0);
       uFile.mkdirs();
       if (!uFile.isDirectory()) {
          return null;
       }
       try{
          return uFile.getAbsoluteFile();
       }catch(java.lang.Exception e0){
          return uFile;
       }
    }
    public static void a(long p0,long p1,long p2){
       f.b(p0, p1, p2);
    }
    public static void b(long p0,byte[] p1,int p2,long p3){
       f.c(null, p0, p1, (PlatformDependent.l + (long)p2), p3);
    }
    public static void c(byte[] p0,int p1,long p2,long p3){
       f.c(p0, (PlatformDependent.l + (long)p1), null, p2, p3);
    }
    public static long d(ByteBuffer p0){
       return f.i(p0, f.c);
    }
    public static boolean e(){
       return PlatformDependent.j;
    }
    public static void f(ByteBuffer p0){
       if (PlatformDependent.q() && !PlatformDependent.r()) {
          a.a(p0);
       }
       return;
    }
    public static byte g(long p0){
       return f.d(p0);
    }
    public static byte h(byte[] p0,int p1){
       return f.e(p0, p1);
    }
    public static ClassLoader i(Class p0){
       ClassLoader classLoader = (System.getSecurityManager() == null)? p0.getClassLoader(): AccessController.doPrivileged(new q(p0));
       return classLoader;
    }
    public static int j(long p0){
       return f.f(p0);
    }
    public static int k(byte[] p0,int p1){
       return f.g(p0, p1);
    }
    public static long l(long p0){
       return f.h(p0);
    }
    public static long m(byte[] p0,int p1){
       return f.j(p0, p1);
    }
    public static short n(long p0){
       return f.l(p0);
    }
    public static short o(byte[] p0,int p1){
       return f.m(p0, p1);
    }
    public static ClassLoader p(){
       ClassLoader systemClassL = (System.getSecurityManager() == null)? ClassLoader.getSystemClassLoader(): AccessController.doPrivileged(new s());
       return systemClassL;
    }
    public static boolean q(){
       return PlatformDependent.h;
    }
    public static boolean r(){
       return PlatformDependent.c;
    }
    public static boolean s(){
       ServerSocket serverSocket;
       boolean b = false;
       if (PlatformDependent.u()) {
          return b;
       }
       b uob = 4;
       String[] stringArray = new String[]{"/usr/bin/id","/bin/id","/usr/xpg4/bin/id","id"};
       Pattern pattern = Pattern.compile("^\(?:0|[1-9][0-9]*\)$");
       int i = 0;
       while (true) {
          int i1 = 1;
          CharSequence uCharSequenc = null;
          if (i < uob) {
             String[] stringArray1 = new String[2];
             stringArray1[b] = stringArray[i];
             stringArray1[i1] = "-u";
             Process process = Runtime.getRuntime().exec(stringArray1);
             BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(process.getInputStream(), g.f));
             String str = uBufferedRea.readLine();
             uBufferedRea.close();
             try{
                if (!process.waitFor()) {
                   uCharSequenc = str;
                }
                try{
                   uBufferedRea.close();
                   try{
                      process.destroy();
                   }catch(java.lang.Exception e0){
                   }
                   if (uCharSequenc != null && pattern.matcher(uCharSequenc).matches()) {
                      PlatformDependent.a.debug("UID: {}", uCharSequenc);
                      return ("0").equals(uCharSequenc);
                   }else {
                      i = i + 1;
                   }
                }catch(java.io.IOException e0){
                }
             }catch(java.lang.InterruptedException e0){
             }
          }else {
             PlatformDependent.a.debug("Could not determine the current UID using /usr/bin/id; attempting to bind at privileged ports.");
             Pattern pattern1 = Pattern.compile(".*\(?:denied|not.*permitted\).*");
             int i2 = 1023;
          label_0097 :
             if (i2 > 0) {
                try{
                   try{
                      serverSocket = new ServerSocket();
                      serverSocket.setReuseAddress(i1);
                      serverSocket.bind(new InetSocketAddress(i2));
                      b a = PlatformDependent.a;
                      if (a.isDebugEnabled()) {
                         a.debug("UID: 0 \(succeded to bind at port {}\)", Integer.valueOf(i2));
                      }
                      try{
                         serverSocket.close();
                         return i1;
                      }catch(java.lang.Exception e0){
                      }
                   }catch(java.lang.Exception e4){
                   }
                   String message = e4.getMessage();
                   if (message == null) {
                      message = "";
                   }
                   if (pattern1.matcher(message.toLowerCase()).matches()) {
                      if (serverSocket) {
                         try{
                            serverSocket.close();
                            break ;
                         }catch(java.lang.Exception e0){
                         }
                      }else {
                      }
                   }else if(serverSocket != null){
                      serverSocket.close();
                   }
                   i2 = i2 - 1;
                   goto label_0097 ;
                }catch(java.lang.Exception e4){
                   serverSocket = uCharSequenc;
                   goto label_00c4 ;
                }
             }else {
             }
          }
       }
       PlatformDependent.a.debug("UID: non-root \(failed to bind at any privileged ports\)");
       return b;
    }
    public static boolean t(){
       return f.h;
    }
    public static boolean u(){
       return PlatformDependent.d;
    }
    public static AtomicIntegerFieldUpdater v(Class p0,String p1){
       if (PlatformDependent.q()) {
          return new g(f.b, p0, p1);
       }
       return null;
    }
    public static AtomicReferenceFieldUpdater w(Class p0,String p1){
       if (PlatformDependent.q()) {
          return new i(f.b, p0, p1);
       }
       return null;
    }
    public static e x(){
       if (PlatformDependent.h) {
          return new LongAdderV8();
       }
       return new PlatformDependent$AtomicLongCounter(null);
    }
    public static Queue y(){
       return new MpscLinkedQueue();
    }
    public static void z(long p0,byte p1){
       f.p(p0, p1);
    }
}
