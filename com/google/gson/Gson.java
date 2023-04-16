package com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import el.a;
import com.google.gson.internal.Excluder;
import com.google.gson.FieldNamingPolicy;
import java.util.Map;
import java.util.Collections;
import com.google.gson.LongSerializationPolicy;
import java.util.List;
import zk.c;
import java.lang.String;
import java.lang.ThreadLocal;
import java.util.concurrent.ConcurrentHashMap;
import bl.g;
import java.util.ArrayList;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import java.util.Collection;
import com.google.gson.Gson$3;
import java.lang.Long;
import com.google.gson.TypeAdapter;
import zk.j;
import java.lang.Double;
import com.google.gson.Gson$1;
import java.lang.Float;
import com.google.gson.Gson$2;
import java.util.concurrent.atomic.AtomicLong;
import com.google.gson.Gson$4;
import java.util.concurrent.atomic.AtomicLongArray;
import com.google.gson.Gson$5;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonIOException;
import java.lang.Throwable;
import com.google.gson.JsonSyntaxException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import bl.r;
import com.google.gson.internal.bind.a;
import java.lang.AssertionError;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import com.google.gson.Gson$FutureTypeAdapter;
import java.util.Iterator;
import zk.d;
import java.io.Writer;
import com.google.gson.stream.b;
import java.io.StringWriter;
import java.lang.Appendable;
import zk.f;
import com.google.gson.internal.b;
import com.google.gson.internal.bind.b;

public final class Gson	// class@000553
{
    public final ThreadLocal a;
    public final Map b;
    public final g c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final Excluder e;
    public final c f;
    public final List factories;
    public final Map g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final int p;
    public final int q;
    public final LongSerializationPolicy r;
    public final List s;
    public final List t;
    public static final a u;

    static {
       Gson.u = a.get(Object.class);
    }
    public void Gson(){
       super(Excluder.h, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }
    public void Gson(Excluder p0,c p1,Map p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7,boolean p8,boolean p9,LongSerializationPolicy p10,String p11,int p12,int p13,List p14,List p15,List p16){
       int i = this;
       boolean b = p4;
       boolean b1 = p9;
       LongSerializationPolicy longSerializ = p10;
       super();
       i.a = new ThreadLocal();
       i.b = new ConcurrentHashMap();
       i.e = p0;
       i.f = p1;
       i.g = p2;
       g og = new g(p2);
       i.c = og;
       i.h = p3;
       i.i = b;
       i.j = p5;
       i.k = p6;
       i.l = p7;
       i.m = p8;
       i.n = b1;
       i.r = longSerializ;
       i.o = p11;
       i.p = p12;
       i.q = p13;
       i.s = p14;
       i.t = p15;
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(TypeAdapters.Y);
       uArrayList.add(ObjectTypeAdapter.b);
       uArrayList.add(p0);
       uArrayList.addAll(p16);
       uArrayList.add(TypeAdapters.D);
       uArrayList.add(TypeAdapters.m);
       uArrayList.add(TypeAdapters.g);
       uArrayList.add(TypeAdapters.i);
       uArrayList.add(TypeAdapters.k);
       TypeAdapter t = (longSerializ == LongSerializationPolicy.DEFAULT)? TypeAdapters.t: new Gson$3();
       uArrayList.add(TypeAdapters.c(Long.TYPE, Long.class, t));
       Class tYPE = Double.TYPE;
       Double uDouble = Double.class;
       TypeAdapter v = (b1)? TypeAdapters.v: new Gson$1(this);
       uArrayList.add(TypeAdapters.c(tYPE, uDouble, v));
       tYPE = Float.TYPE;
       TypeAdapter u = (b1)? TypeAdapters.u: new Gson$2(this);
       uArrayList.add(TypeAdapters.c(tYPE, Float.class, u));
       uArrayList.add(TypeAdapters.x);
       uArrayList.add(TypeAdapters.o);
       uArrayList.add(TypeAdapters.q);
       uArrayList.add(TypeAdapters.b(AtomicLong.class, new Gson$4(t).nullSafe()));
       uArrayList.add(TypeAdapters.b(AtomicLongArray.class, new Gson$5(t).nullSafe()));
       uArrayList.add(TypeAdapters.s);
       uArrayList.add(TypeAdapters.z);
       uArrayList.add(TypeAdapters.F);
       uArrayList.add(TypeAdapters.H);
       uArrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.B));
       uArrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.C));
       uArrayList.add(TypeAdapters.J);
       uArrayList.add(TypeAdapters.L);
       uArrayList.add(TypeAdapters.P);
       uArrayList.add(TypeAdapters.R);
       uArrayList.add(TypeAdapters.W);
       uArrayList.add(TypeAdapters.N);
       uArrayList.add(TypeAdapters.d);
       uArrayList.add(DateTypeAdapter.b);
       uArrayList.add(TypeAdapters.U);
       uArrayList.add(TimeTypeAdapter.b);
       uArrayList.add(SqlDateTypeAdapter.b);
       uArrayList.add(TypeAdapters.S);
       uArrayList.add(ArrayTypeAdapter.c);
       uArrayList.add(TypeAdapters.b);
       uArrayList.add(new CollectionTypeAdapterFactory(og));
       uArrayList.add(new MapTypeAdapterFactory(og, b));
       JsonAdapterAnnotationTypeAdapterFactory jsonAdapterA = new JsonAdapterAnnotationTypeAdapterFactory(og);
       i.d = jsonAdapterA;
       uArrayList.add(jsonAdapterA);
       uArrayList.add(TypeAdapters.Z);
       uArrayList.add(new ReflectiveTypeAdapterFactory(og, p1, p0, jsonAdapterA));
       i.factories = Collections.unmodifiableList(uArrayList);
       return;
    }
    public static void a(Object p0,a p1){
       try{
          if (p0 == null || p1.J() == JsonToken.END_DOCUMENT) {
             return;
          }
          throw new JsonIOException("JSON document was not fully consumed.");
       }catch(com.google.gson.stream.MalformedJsonException e0){
          throw new JsonSyntaxException(e0);
       }catch(java.io.IOException e0){
          throw new JsonIOException(e0);
       }
    }
    public static void b(double p0){
       if (!Double.isNaN(p0) && !Double.isInfinite(p0)) {
          return;
       }
       throw new IllegalArgumentException(p0+" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues\(\) method.");
    }
    public Object c(JsonElement p0,Class p1){
       return r.b(p1).cast(this.d(p0, p1));
    }
    public Object d(JsonElement p0,Type p1){
       if (p0 == null) {
          return null;
       }
       return this.e(new a(p0), p1);
    }
    public Object e(a p0,Type p1){
       boolean b = p0.o();
       boolean b1 = true;
       try{
          p0.M(b1);
          p0.J();
          p0.M(b);
          return this.j(a.get(p1)).read(p0);
       }catch(java.io.EOFException e6){
          if (!b1) {
             throw new JsonSyntaxException(e6);
          }
          p0.M(b);
          return null;
       }catch(java.lang.IllegalStateException e6){
          throw new JsonSyntaxException(e6);
       }catch(java.io.IOException e6){
          throw new JsonSyntaxException(e6);
       }catch(java.lang.AssertionError e6){
          AssertionError uAssertionEr = new AssertionError("AssertionError \(GSON 2.8.6\): "+e6.getMessage());
          uAssertionEr.initCause(e6);
          throw uAssertionEr;
       }
    }
    public Object f(Reader p0,Class p1){
       a uoa = this.n(p0);
       Object obj = this.e(uoa, p1);
       Gson.a(obj, uoa);
       return r.b(p1).cast(obj);
    }
    public Object g(Reader p0,Type p1){
       a uoa = this.n(p0);
       p1 = this.e(uoa, p1);
       Gson.a(p1, uoa);
       return p1;
    }
    public Object h(String p0,Class p1){
       return r.b(p1).cast(this.i(p0, p1));
    }
    public Object i(String p0,Type p1){
       if (p0 == null) {
          return null;
       }
       return this.g(new StringReader(p0), p1);
    }
    public TypeAdapter j(a p0){
       TypeAdapter typeAdapter1;
       Gson tb = this.b;
       a u = (p0 == null)? Gson.u: p0;
       TypeAdapter typeAdapter = tb.get(u);
       if (typeAdapter != null) {
          return typeAdapter;
       }else {
          Map map = this.a.get();
          Gson gson = null;
          if (map == null) {
             map = new HashMap();
             this.a.set(map);
             gson = 1;
          }
          Gson$FutureTypeAdapter uFutureTypeA = map.get(p0);
          if (uFutureTypeA != null) {
             return uFutureTypeA;
          }else {
             uFutureTypeA = new Gson$FutureTypeAdapter();
             map.put(p0, uFutureTypeA);
             Iterator iterator = this.factories.iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   throw new IllegalArgumentException("GSON \(2.8.6\) cannot handle "+p0);
                }
                typeAdapter1 = iterator.next().a(this, p0);
                if (typeAdapter1 != null) {
                   if (uFutureTypeA.a == null) {
                      uFutureTypeA.a = typeAdapter1;
                      this.b.put(p0, typeAdapter1);
                      map.remove(p0);
                      if (gson != null) {
                         this.a.remove();
                         break ;
                      }
                      break ;
                   }else {
                      throw new AssertionError();
                   }
                }
             }
             return typeAdapter1;
          }
       }
    }
    public TypeAdapter k(Class p0){
       return this.j(a.get(p0));
    }
    public TypeAdapter l(j p0,a p1){
       Gson td;
       TypeAdapter typeAdapter;
       if (!this.factories.contains(p0)) {
          td = this.d;
       }
       StringBuilder str = null;
       Iterator iterator = this.factories.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new IllegalArgumentException("GSON cannot serialize "+p1);
          }
          j oj = iterator.next();
          if (!str) {
             if (oj == td) {
                str = 1;
             }
          }else {
             typeAdapter = oj.a(this, p1);
             if (typeAdapter != null) {
                break ;
             }
          }
       }
       return typeAdapter;
    }
    public d m(){
       return new d(this);
    }
    public a n(Reader p0){
       a uoa = new a(p0);
       uoa.M(this.m);
       return uoa;
    }
    public b o(Writer p0){
       if (this.j != null) {
          p0.write("\)]}\'\n");
       }
       b uob = new b(p0);
       if (this.l != null) {
          uob.e = "  ";
          uob.f = ": ";
       }
       uob.E(this.h);
       return uob;
    }
    public String p(JsonElement p0){
       StringWriter stringWriter = new StringWriter();
       this.t(p0, stringWriter);
       return stringWriter.toString();
    }
    public String q(Object p0){
       if (p0 == null) {
          return this.p(f.a);
       }
       return this.r(p0, p0.getClass());
    }
    public String r(Object p0,Type p1){
       StringWriter stringWriter = new StringWriter();
       this.w(p0, p1, stringWriter);
       return stringWriter.toString();
    }
    public void s(JsonElement p0,b p1){
       boolean b = p1.o();
       p1.C(true);
       boolean b1 = p1.l();
       p1.A(this.k);
       boolean b2 = p1.k();
       Gson th = this.h;
       try{
          p1.E(th);
          b.b(p0, p1);
          p1.C(b);
          p1.A(b1);
          p1.E(b2);
          return;
       }catch(java.io.IOException e7){
          throw new JsonIOException(e7);
       }catch(java.lang.AssertionError e7){
          AssertionError uAssertionEr = new AssertionError("AssertionError \(GSON 2.8.6\): "+e7.getMessage());
          uAssertionEr.initCause(e7);
          throw uAssertionEr;
       }
    }
    public void t(JsonElement p0,Appendable p1){
       try{
          this.s(p0, this.o(b.c(p1)));
          return;
       }catch(java.io.IOException e1){
          throw new JsonIOException(e1);
       }
    }
    public String toString(){
       return "{serializeNulls:"+this.h+",factories:"+this.factories+",instanceCreators:"+this.c+"}";
    }
    public void u(Object p0,Appendable p1){
       if (p0 != null) {
          this.w(p0, p0.getClass(), p1);
       }else {
          this.t(f.a, p1);
       }
       return;
    }
    public void v(Object p0,Type p1,b p2){
       TypeAdapter typeAdapter = this.j(a.get(p1));
       boolean b = p2.o();
       p2.C(true);
       boolean b1 = p2.l();
       p2.A(this.k);
       boolean b2 = p2.k();
       Gson th = this.h;
       try{
          p2.E(th);
          typeAdapter.write(p2, p0);
          p2.C(b);
          p2.A(b1);
          p2.E(b2);
          return;
       }catch(java.io.IOException e6){
          throw new JsonIOException(e6);
       }catch(java.lang.AssertionError e6){
          AssertionError uAssertionEr = new AssertionError("AssertionError \(GSON 2.8.6\): "+e6.getMessage());
          uAssertionEr.initCause(e6);
          throw uAssertionEr;
       }
    }
    public void w(Object p0,Type p1,Appendable p2){
       try{
          this.v(p0, p1, this.o(b.c(p2)));
          return;
       }catch(java.io.IOException e1){
          throw new JsonIOException(e1);
       }
    }
    public JsonElement x(Object p0){
       if (p0 == null) {
          return f.a;
       }
       return this.y(p0, p0.getClass());
    }
    public JsonElement y(Object p0,Type p1){
       b uob = new b();
       this.v(p0, p1, uob);
       return uob.R();
    }
}
