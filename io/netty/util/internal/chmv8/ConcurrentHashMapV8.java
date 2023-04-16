package io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.util.concurrent.ConcurrentMap;
import java.io.Serializable;
import java.lang.Runtime;
import java.io.ObjectStreamField;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$Segment;
import java.lang.String;
import java.lang.Class;
import java.lang.Integer;
import java.util.concurrent.atomic.AtomicInteger;
import sun.misc.Unsafe;
import java.lang.reflect.Field;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$g;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import java.lang.Error;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.util.Map;
import java.lang.Comparable;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$a;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.lang.RuntimeException;
import java.security.PrivilegedActionException;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$KeySetView;
import java.lang.Boolean;
import zqd.d;
import zqd.z;
import zqd.c;
import io.netty.util.internal.chmv8.ForkJoinPool;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$a0;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$e;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$y;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b0;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$l;
import java.util.Objects;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import java.lang.Thread;
import java.util.Enumeration;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$c0;
import java.util.Set;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$EntrySetView;
import java.util.Iterator;
import java.util.Map$Entry;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$d;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachMappingTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ForkJoinTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachTransformedMappingTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachEntryTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachTransformedEntryTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachKeyTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachTransformedKeyTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachValueTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachTransformedValueTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$k;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$n;
import java.io.ObjectInputStream;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceMappingsTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceEntriesTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ReduceEntriesTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$v;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$h;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceEntriesToDoubleTask;
import java.lang.Double;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$w;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$m;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceEntriesToIntTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$x;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$p;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceEntriesToLongTask;
import java.lang.Long;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ReduceKeysTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceKeysTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceKeysToDoubleTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceKeysToIntTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceKeysToLongTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$s;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceMappingsToDoubleTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$t;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceMappingsToIntTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$u;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceMappingsToLongTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ReduceValuesTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceValuesTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceValuesToDoubleTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceValuesToIntTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceValuesToLongTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$SearchMappingsTask;
import java.util.concurrent.atomic.AtomicReference;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$SearchEntriesTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$SearchKeysTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$SearchValuesTask;
import java.lang.StringBuilder;
import java.util.Collection;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$ValuesView;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream$PutField;

public class ConcurrentHashMapV8 implements ConcurrentMap, Serializable	// class@001168
{
    public ConcurrentHashMapV8$r[] b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ConcurrentHashMapV8$g[] h;
    public ConcurrentHashMapV8$KeySetView i;
    public ConcurrentHashMapV8$ValuesView j;
    public ConcurrentHashMapV8$EntrySetView k;
    public ConcurrentHashMapV8$r[] table;
    public static final int NCPU = 0;
    public static final AtomicInteger counterHashCodeGenerator;
    public static final Unsafe l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final ObjectStreamField[] serialPersistentFields;
    public static final long serialVersionUID;
    public static final int t;

    static {
       Class tYPE;
       ObjectStreamField objectStream1;
       ConcurrentHashMapV8.NCPU = Runtime.getRuntime().availableProcessors();
       ObjectStreamField[] objectStream = new ObjectStreamField[]{new ObjectStreamField("segments", ConcurrentHashMapV8$Segment[].class),new ObjectStreamField("segmentMask", tYPE),objectStream1};
       tYPE = Integer.TYPE;
       objectStream1 = new ObjectStreamField("segmentShift", tYPE);
       ConcurrentHashMapV8.serialPersistentFields = objectStream;
       AtomicInteger uAtomicInteg = new AtomicInteger();
       try{
          ConcurrentHashMapV8.counterHashCodeGenerator = uAtomicInteg;
          Unsafe unsafe = ConcurrentHashMapV8.getUnsafe();
          ConcurrentHashMapV8.l = unsafe;
          ConcurrentHashMapV8.m = unsafe.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("d"));
          ConcurrentHashMapV8.n = unsafe.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("e"));
          ConcurrentHashMapV8.o = unsafe.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("f"));
          ConcurrentHashMapV8.p = unsafe.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("c"));
          ConcurrentHashMapV8.q = unsafe.objectFieldOffset(ConcurrentHashMapV8.class.getDeclaredField("g"));
          ConcurrentHashMapV8.r = unsafe.objectFieldOffset(ConcurrentHashMapV8$g.class.getDeclaredField("h"));
          ConcurrentHashMapV8.s = (long)unsafe.arrayBaseOffset(ConcurrentHashMapV8$r[].class);
          int i = unsafe.arrayIndexScale(ConcurrentHashMapV8$r[].class);
          if (!((i - 1) & i)) {
             ConcurrentHashMapV8.t = Integer.numberOfLeadingZeros(i) - 31;
          }
          throw new Error("data type scale not a power of two");
       }catch(java.lang.Exception e0){
          throw new Error(e0);
       }
    }
    public void ConcurrentHashMapV8(){
       super();
    }
    public void ConcurrentHashMapV8(int p0){
       super();
       if (p0 < 0) {
          throw new IllegalArgumentException();
       }
       p0 = (p0 >= 0x20000000)? 0x40000000: ConcurrentHashMapV8.f(((p0 + (p0 >> 1)) + 1));
       this.d = p0;
       return;
    }
    public void ConcurrentHashMapV8(int p0,float p1){
       super(p0, p1, 1);
    }
    public void ConcurrentHashMapV8(int p0,float p1,int p2){
       super();
       if (p1 <= 0 || (p0 < 0 || p2 <= 0)) {
          throw new IllegalArgumentException();
       }
       if (p0 < p2) {
          p0 = p2;
       }
       long l = (long)((double)((float)(long)p0 / p1) + 0x3ff0000000000000);
       l = (l - 0x40000000 >= 0)? 0x40000000: ConcurrentHashMapV8.f((int)l);
       this.d = l;
       return;
    }
    public void ConcurrentHashMapV8(Map p0){
       super();
       this.d = 16;
       this.putAll(p0);
    }
    public static final boolean casTabAt(ConcurrentHashMapV8$r[] p0,int p1,ConcurrentHashMapV8$r p2,ConcurrentHashMapV8$r p3){
       return ConcurrentHashMapV8.l.compareAndSwapObject(p0, (((long)p1 << ConcurrentHashMapV8.t) + ConcurrentHashMapV8.s), p2, p3);
    }
    public static Class comparableClassFor(Object p0){
       if (p0 instanceof Comparable) {
          p0 = p0.getClass();
          if (p0 == String.class) {
             return p0;
          }else {
             Type[] genericInter = p0.getGenericInterfaces();
             if (genericInter != null) {
                int i = 0;
                while (i < genericInter.length) {
                   object oobject = genericInter[i];
                   if (oobject instanceof ParameterizedType && oobject.getRawType() == Comparable.class) {
                      Type[] actualTypeAr = oobject.getActualTypeArguments();
                      if (actualTypeAr != null && (actualTypeAr.length == 1 && actualTypeAr[0] == p0)) {
                         return p0;
                      }
                   }
                label_0037 :
                   i = i + 1;
                }
             }
          }
       }
       return null;
    }
    public static int compareComparables(Class p0,Object p1,Object p2){
       int i = (p2 == null || p2.getClass() != p0)? 0: p1.compareTo(p2);
       return i;
    }
    public static final int f(int p0){
       int i = 1;
       p0 = p0 - i;
       p0 = p0 | (p0 >> 1);
       p0 = p0 | (p0 >> 2);
       p0 = p0 | (p0 >> 4);
       p0 = p0 | (p0 >> 8);
       p0 = p0 | (p0 >> 16);
       if (p0 < 0) {
       }else if(p0 >= 0x40000000){
          i = 0x40000000;
       }else {
          i = i + p0;
       }
       return i;
    }
    public static Unsafe getUnsafe(){
       try{
          return Unsafe.getUnsafe();
       }catch(java.lang.SecurityException e0){
          try{
             return AccessController.doPrivileged(new ConcurrentHashMapV8$a());
          }catch(java.security.PrivilegedActionException e0){
             throw new RuntimeException("Could not initialize intrinsics", e0.getCause());
          }
       }
    }
    public static ConcurrentHashMapV8$KeySetView newKeySet(){
       return new ConcurrentHashMapV8$KeySetView(new ConcurrentHashMapV8(), Boolean.TRUE);
    }
    public static ConcurrentHashMapV8$KeySetView newKeySet(int p0){
       return new ConcurrentHashMapV8$KeySetView(new ConcurrentHashMapV8(p0), Boolean.TRUE);
    }
    public static final void setTabAt(ConcurrentHashMapV8$r[] p0,int p1,ConcurrentHashMapV8$r p2){
       ConcurrentHashMapV8.l.putObjectVolatile(p0, (((long)p1 << ConcurrentHashMapV8.t) + ConcurrentHashMapV8.s), p2);
    }
    public static final int spread(int p0){
       return ((p0 ^ (p0 >> 16)) & Integer.MAX_VALUE);
    }
    public static final ConcurrentHashMapV8$r tabAt(ConcurrentHashMapV8$r[] p0,int p1){
       return ConcurrentHashMapV8.l.getObjectVolatile(p0, (((long)p1 << ConcurrentHashMapV8.t) + ConcurrentHashMapV8.s));
    }
    public static ConcurrentHashMapV8$r untreeify(ConcurrentHashMapV8$r p0){
       ConcurrentHashMapV8$r or = null;
       int i = or;
       while (p0 != null) {
          ConcurrentHashMapV8$r or1 = new ConcurrentHashMapV8$r(p0.b, p0.c, p0.d, null);
          if (i == null) {
             or = or1;
          }else {
             i.e = or1;
          }
          p0 = p0.e;
          i = or1;
       }
       return or;
    }
    public final void a(long p0,int p1){
       long l;
       d this;
       int b;
       ConcurrentHashMapV8 uConcurrentH = this;
       int i = p1;
       ConcurrentHashMapV8 h = uConcurrentH.h;
       if (h == null) {
          ConcurrentHashMapV8 c = uConcurrentH.c;
          l = c + p0;
          if (ConcurrentHashMapV8.l.compareAndSwapLong(this, ConcurrentHashMapV8.p, c, l)) {
          label_0047 :
             if (i >= 0) {
                c = uConcurrentH.d;
                while (l - (long)c >= 0) {
                   ConcurrentHashMapV8 table = uConcurrentH.table;
                   if (table != null && table.length < 0x40000000) {
                      if (c < null) {
                         if (c != -1 && uConcurrentH.e > uConcurrentH.f) {
                            ConcurrentHashMapV8 b1 = uConcurrentH.b;
                            if (b1 != null) {
                               b = c - 1;
                               if (ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.m, c, b)) {
                                  uConcurrentH.g(table, b1);
                               }
                            }
                         }
                      }else if(ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.m, c, -2)){
                         uConcurrentH.g(table, null);
                      }
                      l = this.sumCount();
                   }
                }
             }
          label_0091 :
             return;
          }
       }
       this = d.b();
       z e = this.e;
       int i1 = 1;
       if (e != null && h != null) {
          boolean i2 = h.length - i1;
          if (i2 >= 0) {
             object oobject = h[(i2 & e.a)];
             if (oobject != null) {
                ConcurrentHashMapV8$g h1 = oobject.h;
                i2 = ConcurrentHashMapV8.l.compareAndSwapLong(oobject, ConcurrentHashMapV8.r, h1, (h1 + p0));
                if (!i2) {
                   b = i2;
                label_0093 :
                   this.c(this, p0, e, b);
                   return;
                }else if(i <= i1){
                   return;
                }else {
                   l = this.sumCount();
                   goto label_0047 ;
                }
             }
          }
       }
       b = true;
       goto label_0093 ;
    }
    public final int batchFor(long p0){
       if (p0 - Long.MAX_VALUE) {
          long l = this.sumCount();
          if (l - 1 > 0 && l - p0 >= 0) {
             int i = ForkJoinPool.I << 2;
             if (p0 > 0) {
                l = l / p0;
                if (l - (long)i < 0) {
                   i = (int)l;
                }
             }
             return i;
          }
       }
       return 0;
    }
    public final void c(d p0,long p1,c p2,boolean p3){
       int i;
       int i3;
       ConcurrentHashMapV8$g[] ogArray;
       ConcurrentHashMapV8 uConcurrentH = this;
       long l = p1;
       c uoc = p2;
       if (!uoc) {
          uoc = new c();
          i = ConcurrentHashMapV8.counterHashCodeGenerator.addAndGet(0x61c88647);
          if (!i) {
             i = 1;
          }
          uoc.a = i;
          p0.e = uoc;
       }else {
          i = uoc.a;
       }
       int i1 = i;
       i = p3;
       while (true) {
          int i2 = i;
          i3 = i1;
          int i4 = 0;
          break ;
       }
       do {
          ConcurrentHashMapV8 h = uConcurrentH.h;
          if (h != null) {
             int len = h.length;
             if (len > 0) {
                i = len - 1;
                i = i & i3;
                object oobject = h[i];
                if (oobject == null) {
                   if (uConcurrentH.g == null) {
                      ConcurrentHashMapV8$g og = new ConcurrentHashMapV8$g(l);
                      if (uConcurrentH.g == null && ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.q, 0, 1)) {
                         ConcurrentHashMapV8 h1 = uConcurrentH.h;
                         if (h1 != null) {
                            i1 = h1.length;
                            if (i1 > 0) {
                               i1--;
                               i1 = i1 & i3;
                               if (h1[i1] == null) {
                                  h1[i1] = og;
                                  i = 1;
                               }
                            }
                         }
                         i = 0;
                      }else {
                      label_00c8 :
                         i4 = 0;
                      }
                   }else {
                      goto label_00c8 ;
                   }
                }else if(!i2){
                   i2 = 1;
                }else {
                   Unsafe l1 = ConcurrentHashMapV8.l;
                   ConcurrentHashMapV8$g h2 = oobject.h;
                   long l2 = h2 + l;
                   if (!l1.compareAndSwapLong(oobject, ConcurrentHashMapV8.r, h2, l2)) {
                      if (uConcurrentH.h != h || len >= ConcurrentHashMapV8.NCPU) {
                         goto label_00c8 ;
                      }else if(!i4){
                         i4 = 1;
                      }else if(uConcurrentH.g == null && l1.compareAndSwapInt(this, ConcurrentHashMapV8.q, 0, 1)){
                         if (uConcurrentH.h == h) {
                            i = len << 1;
                            ogArray = new ConcurrentHashMapV8$g[i];
                            for (i1 = 0; i1 < len; i1++) {
                               ogArray[i1] = h[i1];
                            }
                            uConcurrentH.h = ogArray;
                         }
                         uConcurrentH.g = 0;
                         i = i2;
                         i1 = i3;
                      }
                   }
                }
                i = i3 << 13;
                i = i ^ i3;
                i1 = i >> 17;
                i = i ^ i1;
                i1 = i << 5;
                i3 = i ^ i1;
             }else if(uConcurrentH.g == null && (uConcurrentH.h == h && ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.q, 0, 1))){
                if (uConcurrentH.h == h) {
                   ogArray = new ConcurrentHashMapV8$g[2];
                   i1 = i3 & 0x01;
                   ogArray[i1] = new ConcurrentHashMapV8$g(l);
                   uConcurrentH.h = ogArray;
                   i = 1;
                }else {
                   i = 0;
                }
                uConcurrentH.g = 0;
                if (!i) {
                }
             }else {
                ConcurrentHashMapV8 c = uConcurrentH.c;
                long l3 = c + l;
                if (!ConcurrentHashMapV8.l.compareAndSwapLong(this, ConcurrentHashMapV8.p, c, l3)) {
                }
             }
          }else {
             goto label_00d6 ;
          }
          break ;
          uConcurrentH.g = 0;
       } while (i);
       uoc.a = i3;
       return;
    }
    public void clear(){
       ConcurrentHashMapV8$a0 g;
       ConcurrentHashMapV8 ttable = this.table;
       long l = 0;
       while (true) {
          int i = 0;
          break ;
       }
       while (true) {
          ConcurrentHashMapV8$r or = -1;
          if (ttable != null && i < ttable.length) {
             ConcurrentHashMapV8$r or1 = ConcurrentHashMapV8.tabAt(ttable, i);
             if (or1 == null) {
                i = i + 1;
             }else {
                ConcurrentHashMapV8$r b = or1.b;
                if (b == or) {
                   ttable = this.helpTransfer(ttable, or1);
                }else {
                   _monitor_enter(or1);
                   if (ConcurrentHashMapV8.tabAt(ttable, i) == or1) {
                      or = null;
                      if (b >= null) {
                         b = or1;
                      }else if(or1 instanceof ConcurrentHashMapV8$a0){
                         g = or1.g;
                      }else {
                         g = or;
                      }
                      while (b != null) {
                         l = l - 1;
                         b = b.e;
                      }
                      int i1 = i + 1;
                      ConcurrentHashMapV8.setTabAt(ttable, i, or);
                      i = i1;
                   }
                   _monitor_exit(or1);
                }
             }
          }else if(l){
             this.a(l, or);
             break ;
          }
          break ;
       }
       return;
    }
    public Object compute(Object p0,ConcurrentHashMapV8$e p1){
       Object obj2;
       Object obj3;
       if (p0 == null || p1 == null) {
          throw null;
       }
       int i = ConcurrentHashMapV8.spread(p0.hashCode());
       ConcurrentHashMapV8 ttable = this.table;
       ConcurrentHashMapV8$r obj = null;
       ConcurrentHashMapV8$r obj1 = null;
       ConcurrentHashMapV8$r or = null;
       while (ttable == null) {
       label_0100 :
          ttable = this.e();
       }
       int len = ttable.length;
       if (!len) {
          goto label_0100 ;
       }else {
          len = len - 1;
          len = len & i;
          ConcurrentHashMapV8$r or1 = ConcurrentHashMapV8.tabAt(ttable, len);
          if (or1 == null) {
             ConcurrentHashMapV8$y oy = new ConcurrentHashMapV8$y();
             _monitor_enter(oy);
             if (ConcurrentHashMapV8.casTabAt(ttable, len, null, oy)) {
                obj = p1.a(p0, null);
                if (obj != null) {
                   or = new ConcurrentHashMapV8$r(i, p0, obj, null);
                   obj1 = 1;
                }else {
                   obj1 = or;
                   or = null;
                }
                ConcurrentHashMapV8.setTabAt(ttable, len, or);
                or = obj1;
                obj1 = obj;
                obj = 1;
             }
             _monitor_exit(oy);
             if (!obj) {
             }
          }else {
             ConcurrentHashMapV8$r b = or1.b;
             if (b == -1) {
                ttable = this.helpTransfer(ttable, or1);
                goto label_0012 ;
             }else {
                _monitor_enter(or1);
                if (ConcurrentHashMapV8.tabAt(ttable, len) == or1) {
                   if (b >= null) {
                      b = null;
                      obj1 = or1;
                      obj = 1;
                      while (true) {
                         if (obj1.b == i) {
                            ConcurrentHashMapV8$r c = obj1.c;
                            if (c == p0 || (c != null && p0.equals(c))) {
                               obj2 = p1.a(p0, obj1.d);
                               if (obj2 != null) {
                                  obj1.d = obj2;
                                  break ;
                               }else {
                                  or = obj1.e;
                                  if (b != null) {
                                     b.e = or;
                                  }else {
                                     ConcurrentHashMapV8.setTabAt(ttable, len, or);
                                  }
                                  or = -1;
                                  break ;
                               }
                            }else {
                            label_008f :
                               b = obj1.e;
                               if (b == null) {
                                  obj3 = p1.a(p0, null);
                                  if (obj3 != null) {
                                     obj1.e = new ConcurrentHashMapV8$r(i, p0, obj3, null);
                                     obj2 = obj3;
                                     or = 1;
                                     break ;
                                  }else {
                                     obj2 = obj3;
                                     break ;
                                  }
                               }else {
                                  obj = obj + 1;
                                  b = obj1;
                                  obj1 = b;
                               }
                            }
                         }else {
                            goto label_008f ;
                         }
                      }
                      obj1 = obj2;
                   }else if(or1 instanceof ConcurrentHashMapV8$a0){
                      obj = or1;
                      ConcurrentHashMapV8$a0 f = obj.f;
                      ConcurrentHashMapV8$b0 uob0 = (f != null)? f.b(i, p0, null): null;
                      b = (uob0 == null)? null: uob0.d;
                      obj3 = p1.a(p0, b);
                      if (obj3 != null) {
                         if (uob0 != null) {
                            uob0.d = obj3;
                         }else {
                            obj.f(i, p0, obj3);
                            obj1 = obj3;
                            obj = 1;
                            or = 1;
                         }
                      }else if(uob0 != null){
                         if (obj.g(uob0)) {
                            ConcurrentHashMapV8.setTabAt(ttable, len, ConcurrentHashMapV8.untreeify(obj.g));
                         }
                         obj1 = obj3;
                         obj = 1;
                         or = -1;
                      }
                      obj1 = obj3;
                      obj = 1;
                   }
                }
                _monitor_exit(or1);
                if (obj) {
                   if (obj >= 8) {
                      this.h(ttable, len);
                   }
                }else {
                   goto label_0012 ;
                }
             }
          }
          if (or != null) {
             this.a((long)or, obj);
          }
          return obj1;
       }
    }
    public Object computeIfAbsent(Object p0,ConcurrentHashMapV8$l p1){
       ConcurrentHashMapV8$a0 obj2;
       if (p0 == null || p1 == null) {
          throw null;
       }
       int i = ConcurrentHashMapV8.spread(p0.hashCode());
       ConcurrentHashMapV8 ttable = this.table;
       ConcurrentHashMapV8$r obj = null;
       ConcurrentHashMapV8$r obj1 = null;
       while (ttable == null) {
       label_00ce :
          ttable = this.e();
       }
       int len = ttable.length;
       if (!len) {
          goto label_00ce ;
       }else {
          len = len - 1;
          len = len & i;
          ConcurrentHashMapV8$r or = ConcurrentHashMapV8.tabAt(ttable, len);
          int i1 = 1;
          if (or == null) {
             ConcurrentHashMapV8$y oy = new ConcurrentHashMapV8$y();
             _monitor_enter(oy);
             if (ConcurrentHashMapV8.casTabAt(ttable, len, null, oy)) {
                obj1 = p1.apply(p0);
                obj = (obj1 != null)? new ConcurrentHashMapV8$r(i, p0, obj1, null): null;
                ConcurrentHashMapV8.setTabAt(ttable, len, obj);
                obj = obj1;
                obj1 = 1;
             }
             _monitor_exit(oy);
             if (obj1 == null) {
             }
          }else {
             ConcurrentHashMapV8$r b = or.b;
             if (b == -1) {
                ttable = this.helpTransfer(ttable, or);
                goto label_0012 ;
             }else {
                _monitor_enter(or);
                if (ConcurrentHashMapV8.tabAt(ttable, len) == or) {
                   if (b >= null) {
                      obj1 = or;
                      int i2 = 1;
                      while (true) {
                         if (obj1.b == i) {
                            b = obj1.c;
                            if (b == p0 || (b != null && p0.equals(b))) {
                               obj1 = obj1.d;
                            label_008b :
                               i1 = 0;
                               break ;
                            }else {
                            label_0077 :
                               b = obj1.e;
                               if (b == null) {
                                  obj2 = p1.apply(p0);
                                  if (obj2 != null) {
                                     obj1.e = new ConcurrentHashMapV8$r(i, p0, obj2, null);
                                     obj1 = obj2;
                                     break ;
                                  }else {
                                     obj1 = obj2;
                                     goto label_008b ;
                                  }
                               }else {
                                  i2 = i2 + 1;
                                  obj1 = b;
                               }
                            }
                         }else {
                            goto label_0077 ;
                         }
                      }
                      obj = obj1;
                      obj1 = i2;
                   label_00b6 :
                      _monitor_exit(or);
                      if (obj1 != null) {
                         if (obj1 >= 8) {
                            this.h(ttable, len);
                         }
                         if (!i1) {
                            return obj;
                         }
                      }else {
                         goto label_0012 ;
                      }
                   }else if(or instanceof ConcurrentHashMapV8$a0){
                      obj1 = 2;
                      obj = or;
                      obj2 = obj.f;
                      if (obj2 != null) {
                         ConcurrentHashMapV8$b0 uob0 = obj2.b(i, p0, null);
                         if (uob0 != null) {
                            obj = uob0.d;
                         }
                      }
                      Object obj3 = p1.apply(p0);
                      if (obj3 != null) {
                         obj.f(i, p0, obj3);
                         obj = obj3;
                         goto label_00b6 ;
                      }else {
                         obj = obj3;
                      }
                   }
                }
                i1 = 0;
                goto label_00b6 ;
             }
          }
          if (obj != null) {
             this.a(1, obj1);
          }
          return obj;
       }
    }
    public Object computeIfPresent(Object p0,ConcurrentHashMapV8$e p1){
       if (p0 == null || p1 == null) {
          throw null;
       }
       int i = ConcurrentHashMapV8.spread(p0.hashCode());
       ConcurrentHashMapV8 ttable = this.table;
       int i1 = 0;
       Object obj = null;
       int i2 = 0;
       while (ttable == null) {
       label_00a5 :
          ttable = this.e();
       }
       int len = ttable.length;
       if (!len) {
          goto label_00a5 ;
       }else {
          len = len - 1;
          len = len & i;
          ConcurrentHashMapV8$r or = ConcurrentHashMapV8.tabAt(ttable, len);
          if (or != null) {
             ConcurrentHashMapV8$r b = or.b;
             if (b == -1) {
                ttable = this.helpTransfer(ttable, or);
                goto label_0012 ;
             }else {
                _monitor_enter(or);
                if (ConcurrentHashMapV8.tabAt(ttable, len) == or) {
                   if (b >= null) {
                      i2 = 1;
                      int i3 = 0;
                      b = or;
                      while (true) {
                         if (b.b == i) {
                            ConcurrentHashMapV8$r c = b.c;
                            if (c == p0 || (c != null && p0.equals(c))) {
                               obj = p1.a(p0, b.d);
                               if (obj != null) {
                                  b.d = obj;
                                  break ;
                               }else {
                                  ConcurrentHashMapV8$r e = b.e;
                                  if (i3 != null) {
                                     i3.e = e;
                                  }else {
                                     ConcurrentHashMapV8.setTabAt(ttable, len, e);
                                  }
                               }
                            }else {
                            label_0060 :
                               ConcurrentHashMapV8$r e1 = b.e;
                               if (e1 != null) {
                                  i2 = i2 + 1;
                                  e1 = b;
                                  b = e1;
                               }
                            }
                         }else {
                            goto label_0060 ;
                         }
                      }
                   }else if(or instanceof ConcurrentHashMapV8$a0){
                      i2 = 2;
                      b = or;
                      ConcurrentHashMapV8$a0 f = b.f;
                      if (f != null) {
                         ConcurrentHashMapV8$b0 uob0 = f.b(i, p0, null);
                         if (uob0 != null) {
                            obj = p1.a(p0, uob0.d);
                            if (obj != null) {
                               uob0.d = obj;
                            }else if(b.g(uob0)){
                               ConcurrentHashMapV8.setTabAt(ttable, len, ConcurrentHashMapV8.untreeify(b.g));
                            }
                         }
                      }
                   }
                   i1 = -1;
                }
             label_0098 :
                _monitor_exit(or);
                if (!i2) {
                }
             }
          }
          if (i1) {
             this.a((long)i1, i2);
          }
          return obj;
       }
    }
    public boolean contains(Object p0){
       return this.containsValue(p0);
    }
    public boolean containsKey(Object p0){
       boolean b = (this.get(p0) != null)? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8 ttable = this.table;
       if (ttable != null) {
          ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(ttable, ttable.length, 0, ttable.length);
          ConcurrentHashMapV8$r or = oz.e();
          while (or != null) {
             or = or.d;
             if (or == p0 || (or != null && p0.equals(or))) {
                return true;
             }
          }
       }
       return 0;
    }
    public final ConcurrentHashMapV8$r[] e(){
       int i;
       int i1;
       ConcurrentHashMapV8 ttable = this.table;
       while (ttable == null || !ttable.length) {
          ttable = this.d;
          if (ttable < null) {
             Thread.yield();
          }else if(ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.m, ttable, -1)){
             ConcurrentHashMapV8 ttable1 = this.table;
             if (ttable1 == null || !ttable1.length) {
                ttable1 = (ttable > null)? ttable: 16;
                ConcurrentHashMapV8$r[] orArray = new ConcurrentHashMapV8$r[ttable1];
                this.table = orArray;
                i = ttable1 - (ttable1 >> 2);
                ttable1 = orArray;
             }
             this.d = i;
             ttable = ttable1;
             break ;
          }
       }
       return ttable;
    }
    public Enumeration elements(){
       ConcurrentHashMapV8 ttable = this.table;
       int i = (ttable == null)? 0: ttable.length;
       ConcurrentHashMapV8$c0 uoc0 = new ConcurrentHashMapV8$c0(ttable, i, 0, i, this);
       return v6;
    }
    public Set entrySet(){
       ConcurrentHashMapV8 tk = this.k;
       if (tk != null) {
       }else {
          tk = new ConcurrentHashMapV8$EntrySetView(this);
          this.k = tk;
       }
       return tk;
    }
    public boolean equals(Object p0){
       Map$Entry obj;
       if (p0 != this) {
          if (!p0 instanceof Map) {
             return false;
          }else {
             ConcurrentHashMapV8 ttable = this.table;
             int i = (ttable == null)? 0: ttable.length;
             ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(ttable, i, false, i);
             while (true) {
                ConcurrentHashMapV8$r or = oz.e();
                if (or != null) {
                   ConcurrentHashMapV8$r d = or.d;
                   obj = p0.get(or.c);
                   if (obj == null || (obj != d && !obj.equals(d))) {
                      return false;
                   }
                   continue ;
                }else {
                   p0 = p0.entrySet().iterator();
                   while (true) {
                      if (p0.hasNext()) {
                         obj = p0.next();
                         Object key = obj.getKey();
                         if (key != null) {
                            Object value = obj.getValue();
                            if (value != null) {
                               key = this.get(key);
                               if (key != null && (value == key || value.equals(key))) {
                               }
                            }
                         }
                      }
                   }
                   return false;
                }
             }
          }
       }
       return true;
    }
    public void forEach(long p0,ConcurrentHashMapV8$d p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$ForEachMappingTask uForEachMapp = new ConcurrentHashMapV8$ForEachMappingTask(null, this.batchFor(p0), 0, 0, this.table, p1);
       v7.invoke();
    }
    public void forEach(long p0,ConcurrentHashMapV8$e p1,ConcurrentHashMapV8$b p2){
       if (p1 == null || p2 == null) {
          throw null;
       }
       ConcurrentHashMapV8$ForEachTransformedMappingTask uForEachTran = new ConcurrentHashMapV8$ForEachTransformedMappingTask(null, this.batchFor(p0), 0, 0, this.table, p1, p2);
       v8.invoke();
       return;
    }
    public void forEach(ConcurrentHashMapV8$d p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8 ttable = this.table;
       if (ttable != null) {
          ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(ttable, ttable.length, 0, ttable.length);
          ConcurrentHashMapV8$r or = oz.e();
          while (or != null) {
             p0.a(or.c, or.d);
          }
       }
       return;
    }
    public void forEachEntry(long p0,ConcurrentHashMapV8$b p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$ForEachEntryTask uForEachEntr = new ConcurrentHashMapV8$ForEachEntryTask(null, this.batchFor(p0), 0, 0, this.table, p1);
       v7.invoke();
    }
    public void forEachEntry(long p0,ConcurrentHashMapV8$l p1,ConcurrentHashMapV8$b p2){
       if (p1 == null || p2 == null) {
          throw null;
       }
       ConcurrentHashMapV8$ForEachTransformedEntryTask uForEachTran = new ConcurrentHashMapV8$ForEachTransformedEntryTask(null, this.batchFor(p0), 0, 0, this.table, p1, p2);
       v8.invoke();
       return;
    }
    public void forEachKey(long p0,ConcurrentHashMapV8$b p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$ForEachKeyTask uForEachKeyT = new ConcurrentHashMapV8$ForEachKeyTask(null, this.batchFor(p0), 0, 0, this.table, p1);
       v7.invoke();
    }
    public void forEachKey(long p0,ConcurrentHashMapV8$l p1,ConcurrentHashMapV8$b p2){
       if (p1 == null || p2 == null) {
          throw null;
       }
       ConcurrentHashMapV8$ForEachTransformedKeyTask uForEachTran = new ConcurrentHashMapV8$ForEachTransformedKeyTask(null, this.batchFor(p0), 0, 0, this.table, p1, p2);
       v8.invoke();
       return;
    }
    public void forEachValue(long p0,ConcurrentHashMapV8$b p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$ForEachValueTask uForEachValu = new ConcurrentHashMapV8$ForEachValueTask(null, this.batchFor(p0), 0, 0, this.table, p1);
       v7.invoke();
    }
    public void forEachValue(long p0,ConcurrentHashMapV8$l p1,ConcurrentHashMapV8$b p2){
       if (p1 == null || p2 == null) {
          throw null;
       }
       ConcurrentHashMapV8$ForEachTransformedValueTask uForEachTran = new ConcurrentHashMapV8$ForEachTransformedValueTask(null, this.batchFor(p0), 0, 0, this.table, p1, p2);
       v8.invoke();
       return;
    }
    public final void g(ConcurrentHashMapV8$r[] p0,ConcurrentHashMapV8$r[] p1){
       int i2;
       int i4;
       ConcurrentHashMapV8$r[] orArray3;
       int i8;
       int i10;
       int i11;
       int i12;
       ConcurrentHashMapV8$k ok2;
       ConcurrentHashMapV8 uConcurrentH1;
       ConcurrentHashMapV8 d;
       int i13;
       int i14;
       ConcurrentHashMapV8$r[] orArray5;
       ConcurrentHashMapV8$r or4;
       ConcurrentHashMapV8$k ok3;
       int i15;
       ConcurrentHashMapV8$r or5;
       ConcurrentHashMapV8$a0 uoa01;
       ConcurrentHashMapV8$r[] orArray = this;
       ConcurrentHashMapV8$r[] orArray1 = p0;
       int len = orArray1.length;
       int nCPU = ConcurrentHashMapV8.NCPU;
       int i = (nCPU > 1)? (len >> 3) / nCPU: len;
       int i1 = (i < 16)? 16: i;
       if (p1 == null) {
          ConcurrentHashMapV8$r[] orArray2 = new ConcurrentHashMapV8$r[(len << 1)];
          orArray.b = orArray2;
          orArray.f = len;
          orArray.e = len;
          ConcurrentHashMapV8$k ok = new ConcurrentHashMapV8$k(orArray1);
          i2 = len;
          while (i2 > 0) {
             int i3 = (i2 > i1)? i2 - i1: 0;
             for (i4 = i3; i4 < i2; i4 = i4 + 1) {
                orArray2[i4] = ok;
             }
             i4 = len + i3;
             int i5 = len + i2;
             while (i4 < i5) {
                orArray2[i4] = ok;
                i4 = i4 + 1;
             }
             ConcurrentHashMapV8.l.putOrderedInt(orArray, ConcurrentHashMapV8.o, i3);
             i2 = i3;
          }
          orArray3 = orArray2;
       }else {
          orArray3 = p1;
       }
       int len1 = orArray3.length;
       ConcurrentHashMapV8$k ok1 = new ConcurrentHashMapV8$k(orArray3);
       ConcurrentHashMapV8$r or = -1;
       nCPU = 0;
       ConcurrentHashMapV8$r or1 = null;
       int i6 = 1;
       int i7 = 0;
       while (i6) {
          i4 = nCPU - 1;
          if (i4 >= or1 || i7) {
             nCPU = i4;
             or1 = or1;
          }else {
             ConcurrentHashMapV8 e = orArray.e;
             if (e <= orArray.f) {
                nCPU = -1;
             }else {
                Unsafe l = ConcurrentHashMapV8.l;
                long n = ConcurrentHashMapV8.n;
                if (e > i1) {
                   i = e - i1;
                   i8 = i;
                }else {
                   i8 = 0;
                }
                ConcurrentHashMapV8 uConcurrentH = e;
                int i9 = i4;
                i10 = or1;
                if (l.compareAndSwapInt(this, n, uConcurrentH, i8)) {
                   nCPU = uConcurrentH - 1;
                   or1 = i8;
                }else {
                   nCPU = i9;
                   or1 = i10;
                }
             }
          }
          i6 = 0;
       }
       i10 = or1;
       ConcurrentHashMapV8$r[] orArray4 = null;
       if (nCPU >= 0 && nCPU < len) {
          i2 = nCPU + len;
          if (i2 >= len1) {
          label_01dc :
             i11 = i1;
             i12 = len1;
             ok2 = ok1;
             uConcurrentH1 = this;
             if (i7) {
                uConcurrentH1.b = orArray4;
                uConcurrentH1.table = orArray3;
                uConcurrentH1.d = (len << 1) - (len >> 1);
                return;
             }else {
                i1 = 1;
                do {
                   d = uConcurrentH1.d;
                   i13 = d + 1;
                } while (ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.m, d, i13));
                if (i13 != -1) {
                   return;
                }else {
                   i = len;
                   i6 = 1;
                   i7 = 1;
                }
             }
          }else {
             ConcurrentHashMapV8$r or2 = ConcurrentHashMapV8.tabAt(orArray1, nCPU);
             if (or2 == null) {
                if (ConcurrentHashMapV8.casTabAt(orArray1, nCPU, orArray4, ok1)) {
                   ConcurrentHashMapV8.setTabAt(orArray3, nCPU, orArray4);
                   ConcurrentHashMapV8.setTabAt(orArray3, i2, orArray4);
                label_00da :
                   i = nCPU;
                   uConcurrentH1 = orArray;
                   i11 = i1;
                   i12 = len1;
                   ok2 = ok1;
                   i6 = 1;
                }else {
                   i = nCPU;
                   uConcurrentH1 = orArray;
                   i11 = i1;
                   i12 = len1;
                   ok2 = ok1;
                }
             }else {
                ConcurrentHashMapV8$r b = or2.b;
                if (b == or) {
                   goto label_00da ;
                }else {
                   _monitor_enter(or2);
                   if (ConcurrentHashMapV8.tabAt(orArray1, nCPU) == or2) {
                      if (b >= null) {
                         i4 = b & len;
                         or1 = or2.e;
                         ConcurrentHashMapV8$r or3 = or2;
                         while (or1 != null) {
                            i14 = or1.b & len;
                            if (i14 != i4) {
                               or3 = or1;
                               i4 = i14;
                            }
                            or1 = or1.e;
                            or = -1;
                         }
                         if (!i4) {
                            orArray5 = orArray4;
                            orArray4 = or3;
                         }else {
                            orArray5 = or3;
                         }
                         or1 = or2;
                         while (or1 != or3) {
                            or = or1.b;
                            ConcurrentHashMapV8$r c = or1.c;
                            i11 = i1;
                            ConcurrentHashMapV8$r d1 = or1.d;
                            i6 = or & len;
                            if (!i6) {
                               or4 = or3;
                               orArray4 = new ConcurrentHashMapV8$r(or, c, d1, orArray4);
                            }else {
                               or4 = or3;
                               orArray5 = new ConcurrentHashMapV8$r(or, c, d1, orArray5);
                            }
                            or1 = or1.e;
                            or3 = or4;
                            i1 = i11;
                            c = 1;
                         }
                         i11 = i1;
                         ConcurrentHashMapV8.setTabAt(orArray3, nCPU, orArray4);
                         ConcurrentHashMapV8.setTabAt(orArray3, i2, orArray5);
                         ConcurrentHashMapV8.setTabAt(orArray1, nCPU, ok1);
                         i12 = len1;
                         ok2 = ok1;
                      }else {
                         i11 = i1;
                         if (or2 instanceof ConcurrentHashMapV8$a0) {
                            b = or2;
                            ConcurrentHashMapV8$r[] orArray6 = orArray4;
                            ConcurrentHashMapV8$r[] orArray7 = orArray6;
                            or4 = b;
                            ConcurrentHashMapV8$a0 uoa0 = b.g;
                            i4 = 0;
                            i14 = 0;
                            ConcurrentHashMapV8$r[] orArray8 = orArray7;
                            while (uoa0 != null) {
                               i12 = len1;
                               ConcurrentHashMapV8$r b1 = uoa0.b;
                               ok3 = ok1;
                               ConcurrentHashMapV8$b0 uob0 = new ConcurrentHashMapV8$b0(b1, uoa0.c, uoa0.d, null, null);
                               i15 = b1 & len;
                               if (!i15) {
                                  orArray.i = orArray7;
                                  if (orArray7 == null) {
                                     orArray4 = orArray;
                                  }else {
                                     orArray7.e = orArray;
                                  }
                                  i14 = i14 + 1;
                                  orArray7 = orArray;
                               }else {
                                  orArray.i = orArray6;
                                  if (orArray6 == null) {
                                     orArray8 = orArray;
                                  }else {
                                     orArray6.e = orArray;
                                  }
                                  i4 = i4 + 1;
                                  orArray6 = orArray;
                               }
                               uoa0 = uoa0.e;
                               len1 = i12;
                               ok1 = ok3;
                            }
                            i12 = len1;
                            ok3 = ok1;
                            i15 = 6;
                            if (i14 <= i15) {
                               or5 = ConcurrentHashMapV8.untreeify(orArray4);
                            }else if(i4){
                               or5 = new ConcurrentHashMapV8$a0(orArray4);
                            }else {
                               or5 = or4;
                            }
                            if (i4 <= i15) {
                               b = ConcurrentHashMapV8.untreeify(orArray8);
                            }else if(i14){
                               uoa01 = new ConcurrentHashMapV8$a0(orArray8);
                            }else {
                               uoa01 = or4;
                            }
                            ConcurrentHashMapV8.setTabAt(orArray3, nCPU, or5);
                            ConcurrentHashMapV8.setTabAt(orArray3, i2, b);
                            orArray1 = p0;
                            ok2 = ok3;
                            ConcurrentHashMapV8.setTabAt(orArray1, nCPU, ok2);
                         }
                      }
                      i6 = 1;
                   label_01d3 :
                      _monitor_exit(or2);
                      uConcurrentH1 = this;
                      i = nCPU;
                   }else {
                      i11 = i1;
                   }
                   i12 = len1;
                   ok2 = ok1;
                   goto label_01d3 ;
                }
             }
             i1 = 1;
          }
       }else {
          goto label_01dc ;
       }
       nCPU = i;
       ok1 = ok2;
       orArray = uConcurrentH1;
       or1 = i10;
       i1 = i11;
       len1 = i12;
       or = -1;
       goto label_0064 ;
    }
    public Object get(Object p0){
       int i = ConcurrentHashMapV8.spread(p0.hashCode());
       ConcurrentHashMapV8 ttable = this.table;
       ConcurrentHashMapV8$r or = null;
       if (ttable != null) {
          int len = ttable.length;
          if (len > 0) {
             len = len - 1;
             len = len & i;
             ConcurrentHashMapV8$r or1 = ConcurrentHashMapV8.tabAt(ttable, len);
             if (or1 != null) {
                ConcurrentHashMapV8$r b = or1.b;
                if (b == i) {
                   b = or1.c;
                   if (b == p0 || (b != null && p0.equals(b))) {
                      return or1.d;
                   }
                }else if(b < null){
                   p0 = or1.a(i, p0);
                   if (p0 != null) {
                      or = p0.d;
                   }
                   return or;
                }
                or1 = or1.e;
                while (or1 != null) {
                   if (or1.b == i) {
                      b = or1.c;
                      if (b == p0 || (b != null && p0.equals(b))) {
                         return or1.d;
                      }
                   }
                }
             }
          }
       }
       return or;
    }
    public Object getOrDefault(Object p0,Object p1){
       p0 = this.get(p0);
       if (p0 == null) {
       }else {
          p1 = p0;
       }
       return p1;
    }
    public final void h(ConcurrentHashMapV8$r[] p0,int p1){
       ConcurrentHashMapV8$r[] orArray = null;
       if (p0.length < 64) {
          if (p0 == this.table) {
             ConcurrentHashMapV8 td = this.d;
             if (td >= null && ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.m, td, -2)) {
                this.g(p0, orArray);
             }
          }
       }else {
          ConcurrentHashMapV8$r or = ConcurrentHashMapV8.tabAt(p0, p1);
          if (or != null && or.b >= null) {
             _monitor_enter(or);
             if (ConcurrentHashMapV8.tabAt(p0, p1) == or) {
                ConcurrentHashMapV8$r or1 = or;
                ConcurrentHashMapV8$r[] orArray1 = orArray;
                while (or1 != null) {
                   ConcurrentHashMapV8$b0 uob0 = new ConcurrentHashMapV8$b0(or1.b, or1.c, or1.d, null, null);
                   v10.i = orArray1;
                   if (orArray1 == null) {
                      orArray = v10;
                   }else {
                      orArray1.e = v10;
                   }
                   or1 = or1.e;
                   orArray1 = v10;
                }
                ConcurrentHashMapV8.setTabAt(p0, p1, new ConcurrentHashMapV8$a0(orArray));
             }
             _monitor_exit(or);
          }
       }
    label_005a :
       return;
    }
    public int hashCode(){
       ConcurrentHashMapV8 ttable = this.table;
       int i = 0;
       if (ttable != null) {
          ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(ttable, ttable.length, i, ttable.length);
          ConcurrentHashMapV8$r or = oz.e();
          while (or != null) {
             int i1 = or.d.hashCode() ^ or.c.hashCode();
             i = i + i1;
          }
       }
       return i;
    }
    public final ConcurrentHashMapV8$r[] helpTransfer(ConcurrentHashMapV8$r[] p0,ConcurrentHashMapV8$r p1){
       if (p1 instanceof ConcurrentHashMapV8$k) {
          ConcurrentHashMapV8$k f = p1.f;
          if (f != null) {
             if (f == this.b && (p0 == this.table && this.e > this.f)) {
                ConcurrentHashMapV8 td = this.d;
                if (td < -1 && ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.m, td, (td - 1))) {
                   this.g(p0, f);
                }
             }
          label_002d :
             return f;
          }
       }
       return this.table;
    }
    public final void i(int p0){
       int len;
       if (p0 >= 0x20000000) {
          p0 = 0x40000000;
       }else {
          len = p0 >> 1;
          p0 = p0 + len;
          p0++;
          p0 = ConcurrentHashMapV8.f(p0);
       }
       ConcurrentHashMapV8 td = this.d;
       while (td >= null) {
          ConcurrentHashMapV8 ttable = this.table;
          if (ttable != null) {
             len = ttable.length;
             if (len) {
                if (p0 <= td || len >= 0x40000000) {
                   break ;
                }else if(ttable == this.table && ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.m, td, -2)){
                   this.g(ttable, null);
                }
             }
          }
          ConcurrentHashMapV8 uConcurrentH = (td > p0)? td: p0;
          if (ConcurrentHashMapV8.l.compareAndSwapInt(this, ConcurrentHashMapV8.m, td, -1)) {
             if (this.table == ttable) {
                ConcurrentHashMapV8$r[] orArray = new ConcurrentHashMapV8$r[uConcurrentH];
                this.table = orArray;
                len = uConcurrentH >> 2;
                td = uConcurrentH - len;
             }
             this.d = td;
          }
       }
       return;
    }
    public boolean isEmpty(){
       boolean b = (this.sumCount() <= 0)? true: false;
       return b;
    }
    public ConcurrentHashMapV8$KeySetView keySet(){
       ConcurrentHashMapV8 ti = this.i;
       if (ti != null) {
       }else {
          ti = new ConcurrentHashMapV8$KeySetView(this, null);
          this.i = ti;
       }
       return ti;
    }
    public ConcurrentHashMapV8$KeySetView keySet(Object p0){
       Objects.requireNonNull(p0);
       return new ConcurrentHashMapV8$KeySetView(this, p0);
    }
    public Set keySet(){
       return this.keySet();
    }
    public Enumeration keys(){
       ConcurrentHashMapV8 ttable = this.table;
       int i = (ttable == null)? 0: ttable.length;
       ConcurrentHashMapV8$n on = new ConcurrentHashMapV8$n(ttable, i, 0, i, this);
       return v6;
    }
    public long mappingCount(){
       long l = this.sumCount();
       if (l < 0) {
          l = 0;
       }
       return l;
    }
    public Object merge(Object p0,Object p1,ConcurrentHashMapV8$e p2){
       Object obj2;
       ConcurrentHashMapV8$b0 uob0;
       ConcurrentHashMapV8 uConcurrentH = this;
       Object obj = p0;
       Object obj1 = p1;
       ConcurrentHashMapV8$e uoe = p2;
       if (!obj || (!obj1 || !uoe)) {
          throw null;
       }
       int i = ConcurrentHashMapV8.spread(p0.hashCode());
       ConcurrentHashMapV8 table = uConcurrentH.table;
       int i1 = 0;
       int i2 = 0;
       ConcurrentHashMapV8$r or = null;
       while (table == null) {
       label_00e3 :
          table = this.e();
       }
       int len = table.length;
       if (!len) {
          goto label_00e3 ;
       }else {
          len = len - 1;
          len = len & i;
          ConcurrentHashMapV8$r or1 = ConcurrentHashMapV8.tabAt(table, len);
          int i3 = 1;
          if (or1 == null) {
             if (!ConcurrentHashMapV8.casTabAt(table, len, null, new ConcurrentHashMapV8$r(i, obj, obj1, null))) {
             }
          }else {
             ConcurrentHashMapV8$r b = or1.b;
             if (b == -1) {
                table = uConcurrentH.helpTransfer(table, or1);
                goto label_001c ;
             }else {
                _monitor_enter(or1);
                if (ConcurrentHashMapV8.tabAt(table, len) == or1) {
                   if (b >= null) {
                      b = null;
                      ConcurrentHashMapV8$r or2 = or1;
                      i2 = 1;
                      while (true) {
                         if (or2.b == i) {
                            ConcurrentHashMapV8$r c = or2.c;
                            if (c == obj || (c != null && obj.equals(c))) {
                               obj2 = uoe.a(or2.d, obj1);
                               if (obj2 != null) {
                                  or2.d = obj2;
                                  break ;
                               }else {
                                  or2 = or2.e;
                                  if (b != null) {
                                     b.e = or2;
                                  }else {
                                     ConcurrentHashMapV8.setTabAt(table, len, or2);
                                  }
                                  or = -1;
                                  break ;
                               }
                            }else {
                            label_0077 :
                               b = or2.e;
                               if (b == null) {
                                  or2.e = new ConcurrentHashMapV8$r(i, obj, obj1, null);
                                  obj2 = obj1;
                                  or = 1;
                                  break ;
                               }else {
                                  i2 = i2 + 1;
                                  b = or2;
                                  or2 = b;
                               }
                            }
                         }else {
                            goto label_0077 ;
                         }
                      }
                      i1 = i2;
                      i2 = obj2;
                   }else if(or1 instanceof ConcurrentHashMapV8$a0){
                      i1 = 2;
                      ConcurrentHashMapV8$r or3 = or1;
                      ConcurrentHashMapV8$a0 f = or3.f;
                      b = (f == null)? null: f.b(i, obj, null);
                      Object obj3 = (b == null)? obj1: uoe.a(b.d, obj1);
                      if (obj3 != null) {
                         if (b != null) {
                            b.d = obj3;
                         }else {
                            or3.f(i, obj, obj3);
                            i2 = obj3;
                            or = 1;
                         }
                      }else if(b != null){
                         if (or3.g(b)) {
                            ConcurrentHashMapV8.setTabAt(table, len, ConcurrentHashMapV8.untreeify(or3.g));
                         }
                         i2 = obj3;
                         or = -1;
                      }
                      i2 = obj3;
                   }
                }
                _monitor_exit(or1);
                if (i1) {
                   if (i1 >= 8) {
                      uConcurrentH.h(table, len);
                   }
                   i3 = or;
                   obj1 = i2;
                }else {
                   goto label_001c ;
                }
             }
          }
          if (i3) {
             uConcurrentH.a((long)i3, i1);
          }
          return obj1;
       }
    }
    public Object put(Object p0,Object p1){
       return this.putVal(p0, p1, false);
    }
    public void putAll(Map p0){
       this.i(p0.size());
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          this.putVal(key, uEntry.getValue(), false);
       }
       return;
    }
    public Object putIfAbsent(Object p0,Object p1){
       return this.putVal(p0, p1, true);
    }
    public final Object putVal(Object p0,Object p1,boolean p2){
       ConcurrentHashMapV8$r c;
       if (p0 == null || p1 == null) {
          throw null;
       }
       int i = ConcurrentHashMapV8.spread(p0.hashCode());
       int i1 = 0;
       ConcurrentHashMapV8 ttable = this.table;
       while (ttable == null) {
       label_0095 :
          ttable = this.e();
       }
       int len = ttable.length;
       if (!len) {
          goto label_0095 ;
       }else {
          len = len - 1;
          len = len & i;
          ConcurrentHashMapV8$r or = ConcurrentHashMapV8.tabAt(ttable, len);
          if (or == null) {
             if (!ConcurrentHashMapV8.casTabAt(ttable, len, null, new ConcurrentHashMapV8$r(i, p0, p1, null))) {
             }
          }else {
             ConcurrentHashMapV8$r b = or.b;
             if (b == -1) {
                ttable = this.helpTransfer(ttable, or);
                goto label_0010 ;
             }else {
                _monitor_enter(or);
                if (ConcurrentHashMapV8.tabAt(ttable, len) == or) {
                   if (b >= null) {
                      i1 = 1;
                      b = or;
                      while (true) {
                         if (b.b == i) {
                            c = b.c;
                            if (c == p0 || (c != null && p0.equals(c))) {
                               c = b.d;
                               if (!p2) {
                                  b.d = p1;
                                  break ;
                               }
                            }else {
                            label_0059 :
                               c = b.e;
                               if (c == null) {
                                  b.e = new ConcurrentHashMapV8$r(i, p0, p1, null);
                               label_007e :
                                  c = null;
                                  break ;
                               }else {
                                  i1 = i1 + 1;
                                  b = c;
                               }
                            }
                         }else {
                            goto label_0059 ;
                         }
                      }
                   }else if(or instanceof ConcurrentHashMapV8$a0){
                      i1 = 2;
                      ConcurrentHashMapV8$b0 uob0 = or.f(i, p0, p1);
                      if (uob0 != null) {
                         c = uob0.d;
                         if (!p2) {
                            uob0.d = p1;
                         }
                      }else {
                         goto label_007e ;
                      }
                   }else {
                      goto label_007e ;
                   }
                }else {
                   goto label_007e ;
                }
                _monitor_exit(or);
                if (i1) {
                   if (i1 >= 8) {
                      this.h(ttable, len);
                   }
                   if (c != null) {
                      return c;
                   }
                }else {
                   goto label_0010 ;
                }
             }
          }
          this.a(1, i1);
          return null;
       }
    }
    public final void readObject(ObjectInputStream p0){
       int i2;
       ConcurrentHashMapV8$r or2;
       ConcurrentHashMapV8$r c;
       int i = this;
       i.d = -1;
       p0.defaultReadObject();
       long l = 0;
       long l1 = l;
       ConcurrentHashMapV8$r or = null;
       ConcurrentHashMapV8$r obj = p0.readObject();
       ConcurrentHashMapV8$r obj1 = p0.readObject();
       long l2 = 1;
       while (obj != null && obj1 != null) {
          l1 = l1 + l2;
          or = new ConcurrentHashMapV8$r(ConcurrentHashMapV8.spread(obj.hashCode()), obj, obj1, or);
       }
       int i1 = 0;
       if (!l1 - l) {
          i.d = i1;
       }else {
          obj1 = 1;
          if (l1 - 0x20000000 >= 0) {
             i2 = 0x40000000;
          }else {
             int i6 = (int)l1;
             i2 = ConcurrentHashMapV8.f(((i6 + (i6 >> 1)) + obj1));
          }
          ConcurrentHashMapV8$r[] orArray = new ConcurrentHashMapV8$r[i2];
          int i3 = i2 - 1;
          while (or != null) {
             ConcurrentHashMapV8$r e = or.e;
             ConcurrentHashMapV8$r b = or.b;
             int i4 = b & i3;
             ConcurrentHashMapV8$r or1 = ConcurrentHashMapV8.tabAt(orArray, i4);
             if (or1 == null) {
                or2 = 1;
             }else {
                or2 = or.c;
                if (or1.b < null) {
                   if (or1.f(b, or2, or.d) == null) {
                      l = l + l2;
                   }
                }else {
                   obj = or1;
                   int i5 = 0;
                   while (true) {
                      if (obj != null) {
                         if (obj.b == b) {
                            c = obj.c;
                            if (c == or2 || (c != null && or2.equals(c))) {
                               or2 = null;
                            label_008f :
                               if (or2 && i5 >= 8) {
                                  l = l + 1;
                                  or.e = or1;
                                  or2 = or;
                                  ConcurrentHashMapV8$b0 uob0 = null;
                                  ConcurrentHashMapV8$b0 uob01 = null;
                                  while (or2 != null) {
                                     long l4 = l;
                                     ConcurrentHashMapV8$b0 uob02 = new ConcurrentHashMapV8$b0(or2.b, or2.c, or2.d, null, null);
                                     c.i = uob01;
                                     if (uob01 == null) {
                                        uob0 = c;
                                     }else {
                                        uob01.e = c;
                                     }
                                     or2 = or2.e;
                                     uob01 = c;
                                     l = l4;
                                  }
                                  ConcurrentHashMapV8.setTabAt(orArray, i4, new ConcurrentHashMapV8$a0(uob0));
                               }
                            }
                         }
                         i5 = i5 + 1;
                         obj = obj.e;
                         c = 1;
                      }else {
                         or2 = 1;
                         goto label_008f ;
                      }
                   }
                }
                or2 = null;
             }
             long l3 = 1;
             if (or2 != null) {
                l = l + l3;
                or.e = or1;
                ConcurrentHashMapV8.setTabAt(orArray, i4, or);
             }
             l2 = l3;
             or = e;
             obj1 = 1;
          }
          i.table = orArray;
          i.d = i2 - (i2 >> 2);
          i.c = l;
       }
       return;
    }
    public Object reduce(long p0,ConcurrentHashMapV8$e p1,ConcurrentHashMapV8$e p2){
       if (p1 == null || p2 == null) {
          throw null;
       }
       ConcurrentHashMapV8$MapReduceMappingsTask mapReduceMap = new ConcurrentHashMapV8$MapReduceMappingsTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2);
       return v9.invoke();
    }
    public Object reduceEntries(long p0,ConcurrentHashMapV8$l p1,ConcurrentHashMapV8$e p2){
       if (p1 == null || p2 == null) {
          throw null;
       }
       ConcurrentHashMapV8$MapReduceEntriesTask mapReduceEnt = new ConcurrentHashMapV8$MapReduceEntriesTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2);
       return v9.invoke();
    }
    public Map$Entry reduceEntries(long p0,ConcurrentHashMapV8$e p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$ReduceEntriesTask reduceEntrie = new ConcurrentHashMapV8$ReduceEntriesTask(null, this.batchFor(p0), 0, 0, this.table, null, p1);
       return v8.invoke();
    }
    public double reduceEntriesToDouble(long p0,ConcurrentHashMapV8$v p1,double p2,ConcurrentHashMapV8$h p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceEntriesToDoubleTask mapReduceEnt = new ConcurrentHashMapV8$MapReduceEntriesToDoubleTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v11.invoke().doubleValue();
    }
    public int reduceEntriesToInt(long p0,ConcurrentHashMapV8$w p1,int p2,ConcurrentHashMapV8$m p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceEntriesToIntTask mapReduceEnt = new ConcurrentHashMapV8$MapReduceEntriesToIntTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v10.invoke().intValue();
    }
    public long reduceEntriesToLong(long p0,ConcurrentHashMapV8$x p1,long p2,ConcurrentHashMapV8$p p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceEntriesToLongTask mapReduceEnt = new ConcurrentHashMapV8$MapReduceEntriesToLongTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v11.invoke().longValue();
    }
    public Object reduceKeys(long p0,ConcurrentHashMapV8$e p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$ReduceKeysTask reduceKeysTa = new ConcurrentHashMapV8$ReduceKeysTask(null, this.batchFor(p0), 0, 0, this.table, null, p1);
       return v8.invoke();
    }
    public Object reduceKeys(long p0,ConcurrentHashMapV8$l p1,ConcurrentHashMapV8$e p2){
       if (p1 == null || p2 == null) {
          throw null;
       }
       ConcurrentHashMapV8$MapReduceKeysTask mapReduceKey = new ConcurrentHashMapV8$MapReduceKeysTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2);
       return v9.invoke();
    }
    public double reduceKeysToDouble(long p0,ConcurrentHashMapV8$v p1,double p2,ConcurrentHashMapV8$h p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceKeysToDoubleTask mapReduceKey = new ConcurrentHashMapV8$MapReduceKeysToDoubleTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v11.invoke().doubleValue();
    }
    public int reduceKeysToInt(long p0,ConcurrentHashMapV8$w p1,int p2,ConcurrentHashMapV8$m p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceKeysToIntTask mapReduceKey = new ConcurrentHashMapV8$MapReduceKeysToIntTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v10.invoke().intValue();
    }
    public long reduceKeysToLong(long p0,ConcurrentHashMapV8$x p1,long p2,ConcurrentHashMapV8$p p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceKeysToLongTask mapReduceKey = new ConcurrentHashMapV8$MapReduceKeysToLongTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v11.invoke().longValue();
    }
    public double reduceToDouble(long p0,ConcurrentHashMapV8$s p1,double p2,ConcurrentHashMapV8$h p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceMappingsToDoubleTask mapReduceMap = new ConcurrentHashMapV8$MapReduceMappingsToDoubleTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v11.invoke().doubleValue();
    }
    public int reduceToInt(long p0,ConcurrentHashMapV8$t p1,int p2,ConcurrentHashMapV8$m p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceMappingsToIntTask mapReduceMap = new ConcurrentHashMapV8$MapReduceMappingsToIntTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v10.invoke().intValue();
    }
    public long reduceToLong(long p0,ConcurrentHashMapV8$u p1,long p2,ConcurrentHashMapV8$p p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceMappingsToLongTask mapReduceMap = new ConcurrentHashMapV8$MapReduceMappingsToLongTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v11.invoke().longValue();
    }
    public Object reduceValues(long p0,ConcurrentHashMapV8$e p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$ReduceValuesTask reduceValues = new ConcurrentHashMapV8$ReduceValuesTask(null, this.batchFor(p0), 0, 0, this.table, null, p1);
       return v8.invoke();
    }
    public Object reduceValues(long p0,ConcurrentHashMapV8$l p1,ConcurrentHashMapV8$e p2){
       if (p1 == null || p2 == null) {
          throw null;
       }
       ConcurrentHashMapV8$MapReduceValuesTask mapReduceVal = new ConcurrentHashMapV8$MapReduceValuesTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2);
       return v9.invoke();
    }
    public double reduceValuesToDouble(long p0,ConcurrentHashMapV8$v p1,double p2,ConcurrentHashMapV8$h p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceValuesToDoubleTask mapReduceVal = new ConcurrentHashMapV8$MapReduceValuesToDoubleTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v11.invoke().doubleValue();
    }
    public int reduceValuesToInt(long p0,ConcurrentHashMapV8$w p1,int p2,ConcurrentHashMapV8$m p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceValuesToIntTask mapReduceVal = new ConcurrentHashMapV8$MapReduceValuesToIntTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v10.invoke().intValue();
    }
    public long reduceValuesToLong(long p0,ConcurrentHashMapV8$x p1,long p2,ConcurrentHashMapV8$p p3){
       if (p1 == null || p3 == null) {
          throw 0;
       }
       ConcurrentHashMapV8$MapReduceValuesToLongTask mapReduceVal = new ConcurrentHashMapV8$MapReduceValuesToLongTask(null, this.batchFor(p0), 0, 0, this.table, null, p1, p2, p3);
       return v11.invoke().longValue();
    }
    public Object remove(Object p0){
       return this.replaceNode(p0, null, null);
    }
    public boolean remove(Object p0,Object p1){
       Objects.requireNonNull(p0);
       boolean b = (p1 != null && this.replaceNode(p0, null, p1) != null)? true: false;
       return b;
    }
    public Object replace(Object p0,Object p1){
       if (p0 != null && p1 != null) {
          return this.replaceNode(p0, p1, null);
       }
       throw null;
    }
    public boolean replace(Object p0,Object p1,Object p2){
       if (p0 == null || (p1 == null || p2 == null)) {
          throw false;
       }
       boolean b = (this.replaceNode(p0, p2, p1) != null)? true: false;
       return b;
    }
    public void replaceAll(ConcurrentHashMapV8$e p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8 ttable = this.table;
       if (ttable != null) {
          ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(ttable, ttable.length, 0, ttable.length);
          ConcurrentHashMapV8$r or = oz.e();
          while (or != null) {
             ConcurrentHashMapV8$r d = or.d;
             or = or.c;
             Object obj = p0.a(or, d);
             Objects.requireNonNull(obj);
             while (this.replaceNode(or, obj, d) == null) {
                d = this.get(or);
                if (d == null) {
                }
             }
          }
       }
       return;
    }
    public final Object replaceNode(Object p0,Object p1,Object p2){
       ConcurrentHashMapV8$r c;
       int i = ConcurrentHashMapV8.spread(p0.hashCode());
       ConcurrentHashMapV8 ttable = this.table;
       while (true) {
          if (ttable == null) {
             return null;
          }
          int len = ttable.length;
          if (!len) {
             return null;
          }
          len = len - 1;
          len = len & i;
          ConcurrentHashMapV8$r or = ConcurrentHashMapV8.tabAt(ttable, len);
          if (or == null) {
          label_00b3 :
             return null;
          }
          ConcurrentHashMapV8$r b = or.b;
          if (b == -1) {
             ttable = this.helpTransfer(ttable, or);
          }else {
             ConcurrentHashMapV8$r obj = null;
             _monitor_enter(or);
             if (ConcurrentHashMapV8.tabAt(ttable, len) == or) {
                if (b >= null) {
                   obj = null;
                   b = or;
                   while (true) {
                      if (b.b == i) {
                         c = b.c;
                         if (c == p0 || (c != null && p0.equals(c))) {
                            c = b.d;
                            if (p2 != null && (p2 == c || (c != null && p2.equals(c)))) {
                               if (p1 != null) {
                                  b.d = p1;
                               }else if(obj != null){
                                  obj.e = b.e;
                               }else {
                                  ConcurrentHashMapV8.setTabAt(ttable, len, b.e);
                               }
                            }else {
                            label_009f :
                               c = null;
                            }
                         }else {
                         label_0062 :
                            obj = b.e;
                            if (obj == null) {
                               goto label_009f ;
                            }else {
                               obj = b;
                               b = obj;
                            }
                         }
                      }else {
                         goto label_0062 ;
                      }
                   }
                }else if(or instanceof ConcurrentHashMapV8$a0){
                   b = or;
                   ConcurrentHashMapV8$a0 f = b.f;
                   if (f != null) {
                      ConcurrentHashMapV8$b0 uob0 = f.b(i, p0, null);
                      if (uob0 != null) {
                         c = uob0.d;
                         if (p2 != null && (p2 == c || (c != null && p2.equals(c)))) {
                            if (p1 != null) {
                               uob0.d = p1;
                            }else if(b.g(uob0)){
                               ConcurrentHashMapV8.setTabAt(ttable, len, ConcurrentHashMapV8.untreeify(b.g));
                            }
                         }else {
                            goto label_009f ;
                         }
                      }else {
                         goto label_009f ;
                      }
                   }else {
                      goto label_009f ;
                   }
                }
                obj = 1;
             label_00a3 :
                _monitor_exit(or);
                if (obj != null) {
                   if (c != null) {
                      if (p1 == null) {
                         this.a(-1, -1);
                         break ;
                      }
                      break ;
                   }else {
                      goto label_00b3 ;
                   }
                }
             }
             c = null;
             goto label_00a3 ;
          }
       }
       return c;
    }
    public Object search(long p0,ConcurrentHashMapV8$e p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$SearchMappingsTask searchMappin = new ConcurrentHashMapV8$SearchMappingsTask(null, this.batchFor(p0), 0, 0, this.table, p1, new AtomicReference());
       return v8.invoke();
    }
    public Object searchEntries(long p0,ConcurrentHashMapV8$l p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$SearchEntriesTask searchEntrie = new ConcurrentHashMapV8$SearchEntriesTask(null, this.batchFor(p0), 0, 0, this.table, p1, new AtomicReference());
       return v8.invoke();
    }
    public Object searchKeys(long p0,ConcurrentHashMapV8$l p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$SearchKeysTask searchKeysTa = new ConcurrentHashMapV8$SearchKeysTask(null, this.batchFor(p0), 0, 0, this.table, p1, new AtomicReference());
       return v8.invoke();
    }
    public Object searchValues(long p0,ConcurrentHashMapV8$l p1){
       Objects.requireNonNull(p1);
       ConcurrentHashMapV8$SearchValuesTask searchValues = new ConcurrentHashMapV8$SearchValuesTask(null, this.batchFor(p0), 0, 0, this.table, p1, new AtomicReference());
       return v8.invoke();
    }
    public int size(){
       int i;
       long l = this.sumCount();
       if (l < 0) {
          i = 0;
       }else if(l - 0x7fffffff > 0){
          i = Integer.MAX_VALUE;
       }else {
          i = (int)l;
       }
       return i;
    }
    public final long sumCount(){
       ConcurrentHashMapV8 th = this.h;
       ConcurrentHashMapV8 tc = this.c;
       if (th != null) {
          int i = 0;
          while (i < th.length) {
             object oobject = th[i];
             if (oobject != null) {
                tc = tc + oobject.h;
             }
             i = i + 1;
          }
       }
       return tc;
    }
    public String toString(){
       String str1;
       ConcurrentHashMapV8 ttable = this.table;
       int i = 0;
       int i1 = (ttable == null)? 0: ttable.length;
       ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(ttable, i1, i, i1);
       StringBuilder str = '{';
       ConcurrentHashMapV8$r or = oz.e();
       if (or != null) {
          ConcurrentHashMapV8$r c = or.c;
          or = or.d;
          while (c == this) {
             c = "\(this Map\)";
             break ;
             str = str+','+' ';
          }
          str = str+c+'=';
          if (or == this) {
             str1 = "\(this Map\)";
          }
          str = str+str1;
          or = oz.e();
          if (or != null) {
          }
       }
       return str+'}';
    }
    public Collection values(){
       ConcurrentHashMapV8 tj = this.j;
       if (tj != null) {
       }else {
          tj = new ConcurrentHashMapV8$ValuesView(this);
          this.j = tj;
       }
       return tj;
    }
    public final void writeObject(ObjectOutputStream p0){
       int i = 0;
       int i1 = 1;
       int i2 = 1;
       int i3 = 0;
       int i4 = 16;
       while (i2 < i4) {
          i3 = i3 + 1;
          i2 = i2 << 1;
       }
       i3 = i3 - 32;
       i2 = i2 - i1;
       ConcurrentHashMapV8$Segment[] segmentArray = new ConcurrentHashMapV8$Segment[i4];
       for (int i5 = 0; i5 < i4; i5 = i5 + 1) {
          segmentArray[i5] = new ConcurrentHashMapV8$Segment(0x3f400000);
       }
       p0.putFields().put("segments", segmentArray);
       p0.putFields().put("segmentShift", i3);
       p0.putFields().put("segmentMask", i2);
       p0.writeFields();
       ConcurrentHashMapV8 ttable = this.table;
       if (ttable != null) {
          ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(ttable, ttable.length, i, ttable.length);
          ConcurrentHashMapV8$r or = oz.e();
          while (or != null) {
             p0.writeObject(or.c);
             p0.writeObject(or.d);
          }
       }
       p0.writeObject(null);
       p0.writeObject(null);
       return;
    }
}
