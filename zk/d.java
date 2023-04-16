package zk.d;
import java.lang.Object;
import com.google.gson.internal.Excluder;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.FieldNamingPolicy;
import java.util.HashMap;
import java.util.ArrayList;
import com.google.gson.Gson;
import java.util.Map;
import java.util.Collection;
import java.util.List;
import zk.a;
import java.util.Collections;
import java.lang.String;
import com.google.gson.DefaultDateTypeAdapter;
import java.util.Date;
import java.lang.Class;
import java.sql.Timestamp;
import java.sql.Date;
import com.google.gson.TypeAdapter;
import zk.j;
import com.google.gson.internal.bind.TypeAdapters;
import zk.c;
import java.lang.reflect.Type;
import zk.i;
import com.google.gson.b;
import zk.e;
import bl.a;
import el.a;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory;

public final class d	// class@002947
{
    public Excluder a;
    public LongSerializationPolicy b;
    public c c;
    public final Map d;
    public final List e;
    public final List f;
    public boolean g;
    public String h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    public void d(){
       super();
       this.a = Excluder.h;
       this.b = LongSerializationPolicy.DEFAULT;
       this.c = FieldNamingPolicy.IDENTITY;
       this.d = new HashMap();
       this.e = new ArrayList();
       this.f = new ArrayList();
       this.g = false;
       this.i = 2;
       this.j = 2;
       this.k = false;
       this.l = false;
       this.m = true;
       this.n = false;
       this.o = false;
       this.p = false;
    }
    public void d(Gson p0){
       super();
       this.a = Excluder.h;
       this.b = LongSerializationPolicy.DEFAULT;
       this.c = FieldNamingPolicy.IDENTITY;
       HashMap hashMap = new HashMap();
       this.d = hashMap;
       ArrayList uArrayList = new ArrayList();
       this.e = uArrayList;
       ArrayList uArrayList1 = new ArrayList();
       this.f = uArrayList1;
       this.g = false;
       this.i = 2;
       this.j = 2;
       this.k = false;
       this.l = false;
       this.m = true;
       this.n = false;
       this.o = false;
       this.p = false;
       this.a = p0.e;
       this.c = p0.f;
       hashMap.putAll(p0.g);
       this.g = p0.h;
       this.k = p0.i;
       this.o = p0.j;
       this.m = p0.k;
       this.n = p0.l;
       this.p = p0.m;
       this.l = p0.n;
       this.b = p0.r;
       this.h = p0.o;
       this.i = p0.p;
       this.j = p0.q;
       uArrayList.addAll(p0.s);
       uArrayList1.addAll(p0.t);
    }
    public d a(a p0){
       this.a = this.a.j(p0, true, false);
       return this;
    }
    public Gson b(){
       DefaultDateTypeAdapter uDefaultDate;
       DefaultDateTypeAdapter uDefaultDate1;
       DefaultDateTypeAdapter uDefaultDate2;
       d uod = this;
       ArrayList uArrayList = new ArrayList(((uod.e.size() + uod.f.size()) + 3));
       uArrayList.addAll(uod.e);
       Collections.reverse(uArrayList);
       ArrayList uArrayList1 = new ArrayList(uod.f);
       Collections.reverse(uArrayList1);
       uArrayList.addAll(uArrayList1);
       d h = uod.h;
       d i = uod.i;
       d j = uod.j;
       if (h != null && !("").equals(h.trim())) {
          uDefaultDate = new DefaultDateTypeAdapter(Date.class, h);
          uDefaultDate1 = new DefaultDateTypeAdapter(Timestamp.class, h);
          uDefaultDate2 = new DefaultDateTypeAdapter(Date.class, h);
       }else {
          DefaultDateTypeAdapter uDefaultDate3 = 2;
          if (i != uDefaultDate3 && j != uDefaultDate3) {
             uDefaultDate = new DefaultDateTypeAdapter(Date.class, i, j);
             uDefaultDate1 = new DefaultDateTypeAdapter(Timestamp.class, i, j);
             uDefaultDate2 = new DefaultDateTypeAdapter(Date.class, i, j);
          }else {
          label_008d :
             Gson gson = new Gson(uod.a, uod.c, uod.d, uod.g, uod.k, uod.o, uod.m, uod.n, uod.p, uod.l, uod.b, uod.h, uod.i, uod.j, uod.e, uod.f, uArrayList);
             return v19;
          }
       }
       uArrayList.add(TypeAdapters.b(Date.class, uDefaultDate));
       uArrayList.add(TypeAdapters.b(Timestamp.class, uDefaultDate1));
       uArrayList.add(TypeAdapters.b(Date.class, uDefaultDate2));
       goto label_008d ;
    }
    public d c(){
       this.m = false;
       return this;
    }
    public d d(){
       this.k = true;
       return this;
    }
    public d e(){
       Excluder uExcluder = this.a.b();
       uExcluder.e = true;
       this.a = uExcluder;
       return this;
    }
    public d f(Type p0,Object p1){
       boolean b = (!(v0 = p1 instanceof i) && (!p1 instanceof b && (p1 instanceof e || p1 instanceof TypeAdapter)))? true: false;
       a.a(b);
       if (p1 instanceof e) {
          this.d.put(p0, p1);
       }
       if (v0 || p1 instanceof b) {
          this.e.add(TreeTypeAdapter.b(a.get(p0), p1));
       }
       if (p1 instanceof TypeAdapter) {
          this.e.add(TypeAdapters.a(a.get(p0), p1));
       }
       return this;
    }
    public d g(j p0){
       this.e.add(p0);
       return this;
    }
    public d h(Class p0,Object p1){
       boolean b = (!(v0 = p1 instanceof i) && (p1 instanceof b || p1 instanceof TypeAdapter))? true: false;
       a.a(b);
       if (p1 instanceof b || v0) {
          this.f.add(new TreeTypeAdapter$SingleTypeFactory(p1, null, false, p0));
       }
       if (p1 instanceof TypeAdapter) {
          this.e.add(TypeAdapters.d(p0, p1));
       }
       return this;
    }
    public d i(){
       this.g = true;
       return this;
    }
    public d j(){
       this.l = true;
       return this;
    }
    public d k(String p0){
       this.h = p0;
       return this;
    }
    public d l(a[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.a = this.a.j(p0[i], true, true);
       }
       return this;
    }
    public d m(FieldNamingPolicy p0){
       this.c = p0;
       return this;
    }
    public d n(){
       this.n = true;
       return this;
    }
}
