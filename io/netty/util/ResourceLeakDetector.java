package io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector$Level;
import java.lang.Class;
import ard.b;
import ard.c;
import java.lang.String;
import zqd.x;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Enum;
import java.util.EnumSet;
import java.util.Iterator;
import java.lang.Integer;
import zqd.w;
import io.netty.util.ResourceLeakDetector$a;
import java.lang.ref.ReferenceQueue;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Objects;
import zqd.f;
import java.lang.StringBuilder;
import wqd.p;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import wqd.o;
import java.lang.ref.Reference;
import java.lang.ref.PhantomReference;
import java.util.concurrent.ConcurrentMap;

public final class ResourceLeakDetector	// class@0010eb
{
    public final ResourceLeakDetector$a a;
    public final ResourceLeakDetector$a b;
    public final ReferenceQueue c;
    public final ConcurrentMap d;
    public final String e;
    public final int f;
    public final int g;
    public final long h;
    public long i;
    public final AtomicBoolean j;
    public long k;
    public static final ResourceLeakDetector$Level l;
    public static final int m;
    public static ResourceLeakDetector$Level n;
    public static final b o;
    public static final String[] p;

    static {
       ResourceLeakDetector$Level level;
       ResourceLeakDetector$Level sIMPLE = ResourceLeakDetector$Level.SIMPLE;
       ResourceLeakDetector.l = sIMPLE;
       b uob = c.a(ResourceLeakDetector.class);
       ResourceLeakDetector.o = uob;
       String str = "io.netty.noResourceLeakDetection";
       boolean b = false;
       if (x.a(str) != null) {
          b = x.c(str, b);
          uob.debug("-Dio.netty.noResourceLeakDetection: {}", Boolean.valueOf(b));
          uob.warn("-Dio.netty.noResourceLeakDetection is deprecated. Use \'-D{}={}\' instead.", "io.netty.leakDetection.level", (sIMPLE.name()).toLowerCase());
       }
       ResourceLeakDetector$Level dISABLED = (b)? ResourceLeakDetector$Level.DISABLED: sIMPLE;
       String str1 = ((x.b("io.netty.leakDetection.level", ((x.b("io.netty.leakDetectionLevel", dISABLED.name())).trim()).toUpperCase())).trim()).toUpperCase();
       Iterator iterator = EnumSet.allOf(ResourceLeakDetector$Level.class).iterator();
       while (iterator.hasNext()) {
          level = iterator.next();
          if (str1.equals(level.name()) || str1.equals(String.valueOf(level.ordinal()))) {
             sIMPLE = level;
          }
       }
       str = "io.netty.leakDetection.maxRecords";
       int i = x.d(str, 4);
       ResourceLeakDetector.m = i;
       ResourceLeakDetector.n = sIMPLE;
       b o = ResourceLeakDetector.o;
       if (o.isDebugEnabled()) {
          o.debug("-D{}: {}", "io.netty.leakDetection.level", (sIMPLE.name()).toLowerCase());
          o.debug("-D{}: {}", str, Integer.valueOf(i));
       }
       String[] stringArray = new String[]{"io.netty.util.ReferenceCountUtil.touch\(","io.netty.buffer.AdvancedLeakAwareByteBuf.touch\(","io.netty.buffer.AbstractByteBufAllocator.toLeakAwareBuffer\(","io.netty.buffer.AdvancedLeakAwareByteBuf.recordLeakNonRefCountingOperation\("};
       ResourceLeakDetector.p = stringArray;
    }
    public void ResourceLeakDetector(Class p0){
       super(w.a(p0));
    }
    public void ResourceLeakDetector(String p0){
       super();
       ResourceLeakDetector$a uoa = new ResourceLeakDetector$a(this, null);
       this.a = uoa;
       ResourceLeakDetector$a uoa1 = new ResourceLeakDetector$a(this, null);
       this.b = uoa1;
       this.c = new ReferenceQueue();
       ConcurrentHashMapV8 uConcurrentH = (PlatformDependent.i)? new ConcurrentHashMapV8(): new ConcurrentHashMap();
       this.d = uConcurrentH;
       this.j = new AtomicBoolean();
       Objects.requireNonNull(p0, "resourceType");
       this.e = p0;
       int i = f.a(128);
       this.f = i;
       i--;
       this.g = i;
       this.h = Long.MAX_VALUE;
       uoa.f = uoa1;
       uoa1.e = uoa;
       return;
    }
    public static ResourceLeakDetector$Level a(){
       return ResourceLeakDetector.n;
    }
    public static String b(Object p0,int p1){
       String[] p;
       StringBuilder str = new StringBuilder(4096);
       if (p0 != null) {
          str = str+"\tHint: ";
          str = (p0 instanceof p)? str+p0.s(): str+p0;
          str = str+w.a;
       }
       p0 = new Throwable().getStackTrace();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (p1 > 0) {
             p1--;
          }else {
             String str1 = oobject.toString();
             p = ResourceLeakDetector.p;
             int len1 = p.length;
             int i1 = 0;
             while (true) {
                if (i1 < len1) {
                   if (str1.startsWith(p[i1])) {
                      p = 1;
                   label_0051 :
                      if (!p) {
                         str = str+9+str1+w.a;
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   p = null;
                   goto label_0051 ;
                }
             }
          }
          i = i + 1;
       }
       return str;
    }
    public o c(Object p0){
       ResourceLeakDetector$Level n = ResourceLeakDetector.n;
       if (n == ResourceLeakDetector$Level.DISABLED) {
          return null;
       }
       if (n.ordinal() < ResourceLeakDetector$Level.PARANOID.ordinal()) {
          ResourceLeakDetector tk = this.k;
          this.k = 1 + tk;
          if (tk & (long)this.g) {
             return null;
          }
          this.d(n);
          return new ResourceLeakDetector$a(this, p0);
       }else {
          this.d(n);
          return new ResourceLeakDetector$a(this, p0);
       }
    }
    public final void d(ResourceLeakDetector$Level p0){
       int i;
       b o = ResourceLeakDetector.o;
       if (!o.isErrorEnabled()) {
          ResourceLeakDetector$a uoa = this.c.poll();
          while (uoa != null) {
             uoa.close();
          }
          return;
       }else if(p0 == ResourceLeakDetector$Level.PARANOID){
          i = 1;
       }else {
          i = this.f;
       }
       long l = this.i * (long)i;
       if (l - this.h > 0 && this.j.compareAndSet(false, true)) {
          o.error("LEAK: You are creating too many "+this.e+" instances.  "+this.e+" is a shared resource that must be reused across the JVM,"+"so that only a few instances are created.");
       }
       ResourceLeakDetector$a uoa1 = this.c.poll();
       while (uoa1 != null) {
          uoa1.clear();
          if (!uoa1.close()) {
             continue ;
          }else {
             String str = uoa1.toString();
             if (this.d.putIfAbsent(str, Boolean.TRUE) == null) {
                if (str.isEmpty()) {
                   Object[] objArray = new Object[]{this.e,"io.netty.leakDetection.level",(ResourceLeakDetector$Level.ADVANCED.name()).toLowerCase(),w.b(this)};
                   ResourceLeakDetector.o.error("LEAK: {}.release\(\) was not called before it\'s garbage-collected. Enable advanced leak reporting to find out where the leak occurred. To enable advanced leak reporting, specify the JVM option \'-D{}={}\' or call {}.setLevel\(\) See http://netty.io/wiki/reference-counted-objects.html for more information.", objArray);
                }else {
                   ResourceLeakDetector.o.error("LEAK: {}.release\(\) was not called before it\'s garbage-collected. See http://netty.io/wiki/reference-counted-objects.html for more information.{}", this.e, str);
                }
             }
          }
       }
       return;
    }
}
