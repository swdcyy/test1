package kshark.lite.HprofHeapGraph;
import rtd.a;
import kshark.lite.HprofHeapGraph$a;
import nsd.u;
import rtd.j;
import rtd.w;
import kshark.lite.internal.HprofInMemoryIndex;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import rtd.f;
import kshark.lite.internal.LruCache;
import kshark.lite.HeapObject$HeapClass;
import java.util.LinkedHashMap;
import std.i;
import kshark.lite.HeapObject;
import std.i$a;
import std.i$b;
import kshark.lite.HeapObject$b;
import std.i$c;
import kshark.lite.HeapObject$c;
import std.i$d;
import kshark.lite.HeapObject$d;
import kotlin.NoWhenBranchMatchedException;
import wsd.m;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.SequencesKt___SequencesKt;
import kshark.lite.HprofHeapGraph$objects$1;
import msd.l;
import java.util.Objects;
import kshark.lite.internal.SortedBytesMap;
import std.a;
import utd.e;
import utd.h;
import kshark.lite.PrimitiveType;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import utd.b;
import java.util.List;
import kshark.lite.HprofVersion;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import zsd.u;
import java.lang.Character;
import utd.f;
import kshark.lite.internal.hppc.LongObjectScatterMap$entrySequence$1;
import msd.a;
import kotlin.sequences.SequencesKt__SequencesKt;
import java.util.Iterator;
import java.lang.Long;
import java.lang.Number;
import utd.d;
import kshark.lite.internal.hppc.LongLongScatterMap$entrySequence$1;
import utd.c;
import java.lang.IllegalStateException;
import rtd.l$a$a$a$a;
import kshark.lite.HprofHeapGraph$instances$1;
import kshark.lite.HprofHeapGraph$classes$1;
import kshark.lite.HprofHeapGraph$objectArrays$1;
import kshark.lite.HprofHeapGraph$primitiveArrays$1;
import rtd.l$a$a;
import java.util.Map;
import kshark.lite.HprofHeapGraph$readObjectRecord$1;
import okio.b;
import kshark.lite.c;
import rtd.l$a$a$a$b;

public final class HprofHeapGraph implements a	// class@001b9f
{
    public final f b;
    public final LruCache c;
    public final HeapObject$HeapClass d;
    public Map e;
    public final j f;
    public final w g;
    public final HprofInMemoryIndex h;
    public static int i;
    public static final HprofHeapGraph$a j;

    static {
       HprofHeapGraph.j = new HprofHeapGraph$a(null);
       HprofHeapGraph.i = 3000;
    }
    public void HprofHeapGraph(j p0,w p1,HprofInMemoryIndex p2){
       a.p(p0, "header");
       a.p(p1, "reader");
       a.p(p2, "index");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.b = new f();
       this.c = new LruCache(HprofHeapGraph.i);
       this.d = this.g("java.lang.Object");
       this.e = new LinkedHashMap();
    }
    public final HeapObject A(int p0,i p1,long p2){
       if (p1 instanceof i$a) {
          HeapObject$HeapClass heapClass = new HeapObject$HeapClass(this, p1, p2, p0);
       }else if(p1 instanceof i$b){
          HeapObject$b uob = new HeapObject$b(this, p1, p2, p0);
       }else if(p1 instanceof i$c){
          HeapObject$c uoc = new HeapObject$c(this, p1, p2, p0);
       }else if(p1 instanceof i$d){
          HeapObject$d uod = new HeapObject$d(this, p1, p2, p0);
       }else {
          throw new NoWhenBranchMatchedException();
       }
       return v0;
    }
    public m a(){
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = 0;
       HprofHeapGraph th = this.h;
       return SequencesKt___SequencesKt.b1(SequencesKt___SequencesKt.f2(SequencesKt___SequencesKt.f2(SequencesKt___SequencesKt.f2(th.d(), th.e()), th.f()), th.g()), new HprofHeapGraph$objects$1(this, intRef));
    }
    public HeapObject b(int p0){
       HprofHeapGraph hprofHeapGra;
       e uoe;
       a uoa;
       int i = this.x();
       HprofInMemoryIndex hprofInMemor = 1;
       if (p0 < 0) {
       }else if(i > p0){
          hprofHeapGra = 1;
       label_000e :
          if (hprofHeapGra) {
             hprofHeapGra = this.h;
             Objects.requireNonNull(hprofHeapGra);
             HprofInMemoryIndex hprofInMemor1 = (p0 > 0)? 1: null;
             String str = "Failed requirement.";
             if (hprofInMemor1) {
                if (p0 < hprofHeapGra.d.e()) {
                   uoe = h.c(hprofHeapGra.d.g(p0), hprofHeapGra.h(hprofHeapGra.d.d(p0)));
                }else {
                   int i1 = p0 - hprofHeapGra.d.e();
                   if (i1 < hprofHeapGra.e.e()) {
                      uoa = hprofHeapGra.e.d(i1);
                      i$b uob = new i$b(uoa.d(hprofHeapGra.a), uoa.b(), uoa.d(hprofHeapGra.j));
                      uoe = h.c(hprofHeapGra.e.g(i1), v11);
                   }else {
                      i1 = i1 - hprofHeapGra.e.e();
                      if (i1 < hprofHeapGra.f.e()) {
                         uoa = hprofHeapGra.f.d(i1);
                         i$c uoc = new i$c(uoa.d(hprofHeapGra.a), uoa.b(), uoa.d(hprofHeapGra.k));
                         uoe = h.c(hprofHeapGra.f.g(i1), v11);
                      }else {
                         i1 = i1 - hprofHeapGra.f.e();
                         if (p0 >= hprofHeapGra.g.e()) {
                            hprofInMemor = null;
                         }
                         if (hprofInMemor != null) {
                            uoa = hprofHeapGra.g.d(i1);
                            i$d uod = new i$d(uoa.d(hprofHeapGra.a), PrimitiveType.values()[uoa.a()], uoa.d(hprofHeapGra.l));
                            uoe = h.c(hprofHeapGra.g.g(i1), v10);
                         }else {
                            throw new IllegalArgumentException(str.toString());
                         }
                      }
                   }
                }
                return this.A(p0, uoe.b, uoe.a);
             }else {
                throw new IllegalArgumentException(str.toString());
             }
          }else {
             throw new IllegalArgumentException(p0+" should be in range [0, "+this.x()+'['.toString());
          }
       }
       hprofHeapGra = null;
       goto label_000e ;
    }
    public int c(){
       return this.f.a();
    }
    public void close(){
       this.g.close();
    }
    public HeapObject d(long p0){
       b uob;
       a uoa;
       HprofHeapGraph td = this.d;
       if (td != null && !p0 - td.d()) {
          return this.d;
       }
       td = this.h;
       int i = td.d.f(p0);
       if (i >= 0) {
          uob = h.a(i, td.h(td.d.d(i)));
       }else {
          i = td.e.f(p0);
          if (i >= 0) {
             uoa = td.e.d(i);
             i$b uob1 = new i$b(uoa.d(td.a), uoa.b(), uoa.d(td.j));
             uob = h.a((td.d.e() + i), i);
          }else {
             i = td.f.f(p0);
             if (i >= 0) {
                uoa = td.f.d(i);
                i$c uoc = new i$c(uoa.d(td.a), uoa.b(), uoa.d(td.k));
                uob = h.a(((td.d.e() + td.e.e()) + i), i);
             }else {
                i = td.g.f(p0);
                if (i >= 0) {
                   uoa = td.g.d(i);
                   i$d uod = new i$d(uoa.d(td.a), PrimitiveType.values()[uoa.a()], uoa.d(td.l));
                   uob = h.a((((td.d.e() + td.e.e()) + i) + td.g.e()), i);
                }else {
                   uob = null;
                }
             }
          }
       }
       if (uob != null) {
          return this.A(uob.a, uob.b, p0);
       }else {
          return null;
       }
    }
    public List e(){
       return this.h.h;
    }
    public boolean f(long p0){
       HprofHeapGraph th = this.h;
       boolean b = true;
       if (th.d.c(p0) != null) {
       }else if(th.e.c(p0) != null || (th.f.c(p0) != null || th.g.c(p0) != null)){
          b = false;
       }
       return b;
    }
    public HeapObject$HeapClass g(String p0){
       Character uCharacter;
       HeapObject$HeapClass heapClass;
       HeapObject$HeapClass heapClass1;
       Long longx1;
       String str = "className";
       a.p(p0, str);
       int i = -1;
       if (this.f.b() != HprofVersion.ANDROID) {
          int i1 = StringsKt__StringsKt.h3(p0, '[', 0, false, 6, null);
          if (i1 != i) {
             p0 = p0.substring(0, i1);
             a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             StringBuilder str1 = u.c2("[", ((p0.length() - i1) / 2));
             switch (p0.hashCode()){
                 case 0xb0f77bd1:
                   if (p0.equals("double")) {
                      uCharacter = Character.valueOf('D');
                   }else {
                   label_00af :
                      p0 = 'L'+p0+';';
                   }
                   break;
                 case 0x197ef:
                   if (p0.equals("int")) {
                      uCharacter = Character.valueOf('I');
                   }else {
                      goto label_00af ;
                   }
                   break;
                 case 0x2e6108:
                   if (p0.equals("byte")) {
                      uCharacter = Character.valueOf('B');
                   }else {
                      goto label_00af ;
                   }
                   break;
                 case 0x2e9356:
                   if (p0.equals("char")) {
                      uCharacter = Character.valueOf('C');
                   }else {
                      goto label_00af ;
                   }
                   break;
                 case 0x32c67c:
                   if (p0.equals("long")) {
                      uCharacter = Character.valueOf('J');
                   }else {
                      goto label_00af ;
                   }
                   break;
                 case 0x5d0225c:
                   if (p0.equals("float")) {
                      uCharacter = Character.valueOf('F');
                   }else {
                      goto label_00af ;
                   }
                   break;
                 case 0x685847c:
                   if (p0.equals("short")) {
                      uCharacter = Character.valueOf('S');
                   }else {
                      goto label_00af ;
                   }
                   break;
                 default:
                   goto label_00af ;
             }
             uCharacter = str1+uCharacter;
          }
       }
       String str2 = uCharacter;
       HprofHeapGraph th = this.h;
       Objects.requireNonNull(th);
       a.p(str2, str);
       if (th.m != null) {
          str2 = u.f2(str2, '.', '/', false, 4, null);
       }
       HprofInMemoryIndex b = th.b;
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = i;
       Iterator iterator = SequencesKt__SequencesKt.p(new LongObjectScatterMap$entrySequence$1(b, intRef, (b.d + 1))).iterator();
       while (true) {
          if (iterator.hasNext()) {
             heapClass = iterator.next();
             if (!a.g(heapClass.b(), str2)) {
                continue ;
             }
          }else {
             heapClass = null;
          }
          Long longx = (heapClass != null)? Long.valueOf(heapClass.a()): null;
          if (longx != null) {
             long l = longx.longValue();
             HprofInMemoryIndex c = th.c;
             Ref$IntRef intRef1 = new Ref$IntRef();
             intRef1.element = i;
             Iterator iterator1 = SequencesKt__SequencesKt.p(new LongLongScatterMap$entrySequence$1(c, intRef1, (c.d + 1))).iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   heapClass1 = iterator1.next();
                   Object obj = (!heapClass1.b - l)? 1: null;
                   if (!obj) {
                      continue ;
                   }
                }else {
                   heapClass1 = null;
                }
                if (heapClass1 != null) {
                   longx1 = Long.valueOf(heapClass1.a);
                label_016d :
                   if (longx1 == null) {
                      break ;
                   }else {
                      return this.u(longx1.longValue());
                   }
                }
             }
             return null;
          }
          longx1 = null;
          goto label_016d ;
       }
    }
    public f getContext(){
       return this.b;
    }
    public final String h(long p0){
       int i1;
       String str2;
       d a;
       HprofHeapGraph th = this.h;
       HprofInMemoryIndex c = th.c;
       d uod = null;
       int i = -1;
       if (!p0 - uod) {
          if (c.f != null) {
             i1 = c.d + 1;
          }else {
          label_002f :
             i1 = -1;
          }
       }else {
          a = c.a;
          d d = c.d;
          int i5 = c.c(p0) & d;
          long l = a[i5];
          while (true) {
             if (l - uod) {
                if (!l - p0) {
                   i1 = i5;
                   break ;
                }else {
                   i5 = i5 + 1;
                   i5 = i5 & d;
                   l = a[i5];
                }
             }else {
                goto label_002f ;
             }
          }
       }
       i = (i1 != i)? 1: 0;
       if (i) {
          String str = th.c(c.b[i1]);
          if (th.m != null) {
             str = u.f2(str, '/', '.', false, 4, null);
          }
          if (this.f.b() != HprofVersion.ANDROID) {
             int i2 = 2;
             if (StringsKt__StringsKt.P4(str, '[', false, i2, null)) {
                int i3 = StringsKt__StringsKt.v3(str, '[', 0, false, 6, null);
                int i4 = i3 + 1;
                String str1 = u.c2("[]", i4);
                char c1 = str.charAt(i4);
                if (c1 != 'F') {
                   if (c1 != 'L') {
                      if (c1 != 'S') {
                         if (c1 != 'Z') {
                            if (c1 != 'I') {
                               if (c1 != 'J') {
                                  switch (c1){
                                      case 'B':
                                        str2 = "byte"+str1;
                                        break;
                                      case 'C':
                                        str2 = "char"+str1;
                                        break;
                                      case 'D':
                                        str2 = "double"+str1;
                                        break;
                                      default:
                                        throw new IllegalStateException("Unexpected type char "+c1.toString());
                                  }
                               }else {
                                  str2 = "long"+str1;
                               }
                            }else {
                               str2 = "int"+str1;
                            }
                         }else {
                            str2 = "boolean"+str1;
                         }
                      }else {
                         str2 = "short"+str1;
                      }
                   }else {
                      str2 = str.substring((i3 + i2), (str.length() - 1));
                      a.o(str2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                      str2 = str2+str1;
                   }
                }else {
                   str2 = "float"+str1;
                }
                return str2;
             }
          }
          return str;
       }else {
          throw new IllegalArgumentException("Unknown key "+p0.toString());
       }
    }
    public final String i(long p0,l$a$a$a$a p1){
       a.p(p1, "fieldRecord");
       return this.h.a(p0, p1.a);
    }
    public int j(){
       return this.h.e.e();
    }
    public m k(){
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = this.s();
       return SequencesKt___SequencesKt.b1(this.h.e(), new HprofHeapGraph$instances$1(this, intRef));
    }
    public int l(){
       return this.h.g.e();
    }
    public m o(){
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = 0;
       return SequencesKt___SequencesKt.b1(this.h.d(), new HprofHeapGraph$classes$1(this, intRef));
    }
    public m p(){
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = this.s() + this.j();
       return SequencesKt___SequencesKt.b1(this.h.f(), new HprofHeapGraph$objectArrays$1(this, intRef));
    }
    public m r(){
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = (this.s() + this.j()) + this.v();
       return SequencesKt___SequencesKt.b1(this.h.g(), new HprofHeapGraph$primitiveArrays$1(this, intRef));
    }
    public int s(){
       return this.h.d.e();
    }
    public HeapObject u(long p0){
       HeapObject heapObject = this.d(p0);
       if (heapObject != null) {
          return heapObject;
       }
       throw new IllegalArgumentException("Object id "+p0+" not found in heap dump.");
    }
    public int v(){
       return this.h.f.e();
    }
    public int x(){
       return (((this.s() + this.j()) + this.v()) + this.h.g.e());
    }
    public final l$a$a y(long p0,i p1,l p2){
       Object obj1;
       HprofHeapGraph hprofHeapGra = this;
       HprofHeapGraph c = hprofHeapGra.c;
       HprofHeapGraph$readObjectRecord$1 obj = c.a.get(Long.valueOf(p0));
       int i = 1;
       if (obj != null) {
          c.d = c.d + i;
       }else {
          c.e = c.e + i;
          obj1 = null;
       }
       if (obj != null) {
          return obj;
       }else {
          c = hprofHeapGra.g;
          long l = p1.a();
          long l1 = p1.b();
          obj = new HprofHeapGraph$readObjectRecord$1(p2);
          Objects.requireNonNull(c);
          a.p(obj, "withRecordReader");
          int i1 = 0;
          int i2 = (l1 > 0)? 1: 0;
          if (i2) {
             long l2 = l;
             while (true) {
                if (l1 > 0) {
                   long l3 = c.d.G1(c.b, l2, l1);
                   w ow = (l3 > 0)? 1: null;
                   if (ow) {
                      l2 = l2 + l3;
                      l1 = l1 - l3;
                   }else {
                      break ;
                   }
                }else {
                   obj1 = obj.invoke(c.c);
                   if (!c.b.p()) {
                      i1 = 1;
                   }
                   if (i1) {
                      c = hprofHeapGra.c;
                      c.b = c.b + i;
                      c.a.put(Long.valueOf(p0), obj1);
                      return obj1;
                   }else {
                      throw new IllegalStateException("Buffer not fully consumed: "+c.b.p()+" bytes left".toString());
                   }
                }
             }
             throw new IllegalStateException("Requested "+l1+" bytes after reading "+(l2 - l)+", got 0 bytes instead.".toString());
          }else {
             throw new IllegalArgumentException("recordSize "+l1+" must be > 0".toString());
          }
       }
    }
    public final String z(long p0,l$a$a$a$b p1){
       a.p(p1, "fieldRecord");
       return this.h.a(p0, p1.a);
    }
}
