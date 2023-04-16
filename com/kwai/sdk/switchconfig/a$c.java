package com.kwai.sdk.switchconfig.a$c;
import io7.c;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import io7.b;
import java.util.Map;
import com.kwai.sdk.switchconfig.a$c$h;
import java.lang.reflect.Method;
import java.lang.Class;
import java.util.HashMap;
import com.kwai.sdk.switchconfig.v2.a;
import oo7.d;
import po7.g;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import io7.f;
import com.kwai.sdk.switchconfig.v2.SwitchConfig;
import com.kwai.sdk.switchconfig.a$c$g;
import java.util.List;
import com.kwai.sdk.switchconfig.ConfigPriority;
import java.lang.reflect.Type;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.a$c$e;
import com.kwai.sdk.switchconfig.a$x;
import com.kwai.sdk.switchconfig.v2.ConfigPriority;
import com.kwai.sdk.switchconfig.UpdateConfigMode;
import com.kwai.sdk.switchconfig.a$c$d;
import io7.x;
import com.kwai.sdk.switchconfig.a$c$c;
import oo7.g;
import io7.a;
import com.kwai.sdk.switchconfig.a$c$k;
import oo7.a;
import com.kwai.sdk.switchconfig.a$c$a;
import com.kwai.sdk.switchconfig.a$c$b;
import com.kwai.sdk.switchconfig.a$c$f;
import com.kwai.sdk.switchconfig.a$c$l;
import com.kwai.sdk.switchconfig.a$c$i;
import com.kwai.sdk.switchconfig.a$c$j;

public class a$c implements c	// class@001643
{
    public final String a;
    public final a b;

    public void a$c(a p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public int a(String p0,int p1){
       return b.b(this, p0, p1);
    }
    public long b(String p0,long p1){
       return b.c(this, p0, p1);
    }
    public String c(String p0,String p1){
       return b.d(this, p0, p1);
    }
    public boolean d(String p0,boolean p1){
       return b.a(this, p0, p1);
    }
    public Map e(){
       if (a.u) {
          a$c$h uoc$h = new a$c$h(this);
          Object[] objArray = new Object[0];
          a.y(a$c$h.class.getEnclosingMethod(), objArray);
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = a.x().h(this.a).e().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          f uof = new f();
          uof.b = uEntry.getValue();
          uof.e(uEntry.getKey());
          hashMap.put(uEntry.getKey(), uof);
       }
       return hashMap;
    }
    public f f(String p0){
       if (a.u) {
          a$c$g uoc$g = new a$c$g(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$c$g.class.getEnclosingMethod(), objArray);
       }
       SwitchConfig switchConfig = a.x().h(this.a).f(p0);
       if (switchConfig == null) {
          return null;
       }else {
          f uof = new f();
          uof.b = switchConfig;
          uof.e(p0);
          return uof;
       }
    }
    public void g(List p0,ConfigPriority p1){
    }
    public Object getValue(String p0,Type p1,Object p2){
       return b.e(this, p0, p1, p2);
    }
    public void h(JsonObject p0,ConfigPriority p1){
       if (a.u) {
          a$c$e uoc$e = new a$c$e(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$c$e.class.getEnclosingMethod(), objArray);
       }
       if (this.b.e != null) {
          a$x ox = new a$x();
          ox.b = this.a;
          ox.a = "json";
          ox.c = p0;
          ox.d = p1.getValue();
          this.b.a.put(this.a, ox);
          this.b.s();
       }
       a.x().h(this.a).o(p0, ConfigPriority.get(p1.getValue()));
       return;
    }
    public void i(JsonObject p0,ConfigPriority p1,UpdateConfigMode p2){
    }
    public void j(String p0,ConfigPriority p1){
       if (a.u) {
          a$c$d uoc$d = new a$c$d(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$c$d.class.getEnclosingMethod(), objArray);
       }
       if (this.b.e != null) {
          a$x ox = new a$x();
          ox.b = this.a;
          ox.a = "string";
          ox.c = p0;
          ox.d = p1.getValue();
          this.b.a.put(this.a, ox);
          this.b.s();
       }
       a.x().h(this.a).r(p0, ConfigPriority.get(p1.getValue()));
       return;
    }
    public synchronized void k(x p0){
       if (a.u) {
          a$c$c uoc$c = new a$c$c(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$c$c.class.getEnclosingMethod(), objArray);
       }
       a.x().h(this.a).w(this.b.o.get(p0));
       this.b.o.remove(p0);
       return;
    }
    public synchronized void l(String p0,a p1){
       if (a.u) {
          a$c$k uoc$k = new a$c$k(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$c$k.class.getEnclosingMethod(), objArray);
       }
       a.x().h(this.a).v(p0, this.b.n.get(p1));
       this.b.n.remove(p1);
       return;
    }
    public synchronized void m(x p0){
       if (a.u) {
          a$c$a uoc$a = new a$c$a(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$c$a.class.getEnclosingMethod(), objArray);
       }
       if (!this.b.o.containsKey(p0)) {
          this.b.o.put(p0, new a$c$b(this, p0));
       }
       a.x().h(this.a).s(this.b.o.get(p0));
       return;
    }
    public void n(String p0,ConfigPriority p1){
       if (a.u) {
          a$c$f uoc$f = new a$c$f(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$c$f.class.getEnclosingMethod(), objArray);
       }
       if (this.b.e != null) {
          a$x ox = new a$x();
          ox.b = this.a;
          ox.a = "pb";
          ox.c = p0;
          ox.d = p1.getValue();
          this.b.a.put(this.a, ox);
          this.b.s();
       }
       a.x().h(this.a).m(p0, ConfigPriority.get(p1.getValue()));
       return;
    }
    public boolean o(String p0,a p1){
       if (a.u) {
          a$c$l uoc$l = new a$c$l(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$c$l.class.getEnclosingMethod(), objArray);
       }
       return a.x().h(this.a).p(p0, this.b.n.get(p1));
    }
    public synchronized void p(String p0,a p1){
       if (a.u) {
          a$c$i uoc$i = new a$c$i(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$c$i.class.getEnclosingMethod(), objArray);
       }
       if (!this.b.n.containsKey(p1)) {
          this.b.n.put(p1, new a$c$j(this, p1));
       }
       a.x().h(this.a).k(p0, this.b.n.get(p1));
       return;
    }
}
