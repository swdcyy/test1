package nsd.s;
import vsd.d;
import nsd.r;
import nsd.s$a;
import nsd.u;
import java.lang.Class;
import msd.a;
import msd.l;
import msd.p;
import msd.q;
import msd.r;
import msd.s;
import msd.t;
import msd.u;
import msd.v;
import msd.w;
import msd.b;
import msd.c;
import msd.d;
import msd.e;
import msd.f;
import msd.g;
import msd.h;
import msd.i;
import msd.j;
import msd.k;
import msd.m;
import msd.n;
import msd.o;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.Integer;
import kotlin.Pair;
import qrd.r0;
import java.util.Collection;
import java.util.Map;
import trd.t0;
import java.util.HashMap;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import kotlin.text.StringsKt__StringsKt;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Number;
import java.util.LinkedHashMap;
import trd.s0;
import java.lang.Void;
import kotlin.KotlinNothingValueException;
import lsd.a;
import kotlin.reflect.KVisibility;
import kotlin.jvm.KotlinReflectionNotSupportedError;

public final class s implements d, r	// class@001f77
{
    public final Class b;
    public static final Map c;
    public static final HashMap d;
    public static final HashMap e;
    public static final HashMap f;
    public static final Map g;
    public static final s$a h;

    static {
       Object obj;
       char c;
       s.h = new s$a(null);
       Class[] uClassArray = new Class[23];
       int i = 0;
       uClassArray[i] = a.class;
       uClassArray[1] = l.class;
       uClassArray[2] = p.class;
       uClassArray[3] = q.class;
       uClassArray[4] = r.class;
       uClassArray[5] = s.class;
       uClassArray[6] = t.class;
       uClassArray[7] = u.class;
       uClassArray[8] = v.class;
       uClassArray[9] = w.class;
       uClassArray[10] = b.class;
       uClassArray[11] = c.class;
       uClassArray[12] = d.class;
       uClassArray[13] = e.class;
       uClassArray[14] = f.class;
       uClassArray[15] = g.class;
       uClassArray[16] = h.class;
       uClassArray[17] = i.class;
       uClassArray[18] = j.class;
       uClassArray[19] = k.class;
       uClassArray[20] = m.class;
       uClassArray[21] = n.class;
       uClassArray[22] = o.class;
       List list = CollectionsKt__CollectionsKt.L(uClassArray);
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          uArrayList.add(r0.a(obj, Integer.valueOf(i)));
          i = i1;
       }
       s.c = t0.B0(uArrayList);
       HashMap hashMap = new HashMap();
       hashMap.put("boolean", "kotlin.Boolean");
       hashMap.put("char", "kotlin.Char");
       hashMap.put("byte", "kotlin.Byte");
       String str = "kotlin.Short";
       hashMap.put("short", str);
       String str1 = "kotlin.Int";
       hashMap.put("int", str1);
       hashMap.put("float", "kotlin.Float");
       hashMap.put("long", "kotlin.Long");
       hashMap.put("double", "kotlin.Double");
       s.d = hashMap;
       HashMap hashMap1 = new HashMap();
       hashMap1.put("java.lang.Boolean", "kotlin.Boolean");
       hashMap1.put("java.lang.Character", "kotlin.Char");
       hashMap1.put("java.lang.Byte", "kotlin.Byte");
       hashMap1.put("java.lang.Short", str);
       hashMap1.put("java.lang.Integer", str1);
       hashMap1.put("java.lang.Float", "kotlin.Float");
       hashMap1.put("java.lang.Long", "kotlin.Long");
       hashMap1.put("java.lang.Double", "kotlin.Double");
       s.e = hashMap1;
       HashMap hashMap2 = new HashMap();
       hashMap2.put("java.lang.Object", "kotlin.Any");
       hashMap2.put("java.lang.String", "kotlin.String");
       hashMap2.put("java.lang.CharSequence", "kotlin.CharSequence");
       hashMap2.put("java.lang.Throwable", "kotlin.Throwable");
       hashMap2.put("java.lang.Cloneable", "kotlin.Cloneable");
       hashMap2.put("java.lang.Number", "kotlin.Number");
       hashMap2.put("java.lang.Comparable", "kotlin.Comparable");
       hashMap2.put("java.lang.Enum", "kotlin.Enum");
       hashMap2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
       hashMap2.put("java.lang.Iterable", "kotlin.collections.Iterable");
       hashMap2.put("java.util.Iterator", "kotlin.collections.Iterator");
       hashMap2.put("java.util.Collection", "kotlin.collections.Collection");
       hashMap2.put("java.util.List", "kotlin.collections.List");
       hashMap2.put("java.util.Set", "kotlin.collections.Set");
       hashMap2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
       hashMap2.put("java.util.Map", "kotlin.collections.Map");
       hashMap2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
       hashMap2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
       hashMap2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
       hashMap2.putAll(hashMap);
       hashMap2.putAll(hashMap1);
       Collection uCollection = hashMap.values();
       a.o(uCollection, "primitiveFqNames.values");
       iterator = uCollection.iterator();
       c = '.';
       while (iterator.hasNext()) {
          String str2 = iterator.next();
          a.o(str2, "kotlinName");
          StringBuilder str3 = str2;
          Pair pair = r0.a("kotlin.jvm.internal."+StringsKt__StringsKt.e5(str2, c, null, 2, null)+"CompanionObject", str3+".Companion");
          obj = pair.getFirst();
          hashMap2.put(obj, pair.getSecond());
       }
       iterator = s.c.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Class key = uEntry.getKey();
          hashMap2.put(key.getName(), "kotlin.Function"+uEntry.getValue().intValue());
       }
       s.f = hashMap2;
       LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(hashMap2.size()));
       Iterator iterator1 = hashMap2.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry1 = iterator1.next();
          Object key1 = uEntry1.getKey();
          linkedHashMa.put(key1, StringsKt__StringsKt.e5(uEntry1.getValue(), c, null, 2, null));
       }
       s.g = linkedHashMa;
    }
    public void s(Class p0){
       a.p(p0, "jClass");
       super();
       this.b = p0;
    }
    public static void A(){
    }
    public static void B(){
    }
    public static void C(){
    }
    public static void D(){
    }
    public static void E(){
    }
    public static void F(){
    }
    public static void G(){
    }
    public static void H(){
    }
    public static void w(){
    }
    public static void x(){
    }
    public static void y(){
    }
    public static void z(){
    }
    public String N5(){
       return s.h.b(this.j());
    }
    public Collection a(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public boolean b(Object p0){
       return s.h.c(p0, this.j());
    }
    public Collection c(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof s && a.g(a.e(this), a.e(p0)))? true: false;
       return b;
    }
    public Collection g(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public List getAnnotations(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public List getTypeParameters(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public KVisibility getVisibility(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public int hashCode(){
       return a.e(this).hashCode();
    }
    public Object i(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public boolean isAbstract(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public boolean isFinal(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public boolean isOpen(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public Class j(){
       return this.b;
    }
    public boolean k(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public boolean l(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public String o(){
       return s.h.a(this.j());
    }
    public List p(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public boolean q(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public boolean r(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public boolean t(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public String toString(){
       return this.j().toString()+" \(Kotlin reflection is not available\)";
    }
    public List u(){
       this.v();
       throw new KotlinNothingValueException();
    }
    public final Void v(){
       throw new KotlinReflectionNotSupportedError();
    }
}
