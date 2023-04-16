package com.kwai.sdk.switchconfig.a$d;
import io7.c;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import io7.b;
import java.util.Map;
import com.kwai.sdk.switchconfig.a$d$h;
import java.lang.reflect.Method;
import java.lang.Class;
import java.util.HashMap;
import com.kwai.sdk.switchconfig.v1.a;
import lo7.d;
import com.kwai.sdk.switchconfig.v1.internal.b;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import io7.f;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;
import com.kwai.sdk.switchconfig.a$d$g;
import java.util.List;
import com.kwai.sdk.switchconfig.ConfigPriority;
import com.kwai.sdk.switchconfig.v1.ConfigPriority;
import java.lang.reflect.Type;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.a$d$e;
import com.kwai.sdk.switchconfig.a$x;
import com.kwai.sdk.switchconfig.UpdateConfigMode;
import com.kwai.sdk.switchconfig.a$d$d;
import io7.x;
import com.kwai.sdk.switchconfig.a$d$c;
import lo7.g;
import io7.a;
import com.kwai.sdk.switchconfig.a$d$k;
import lo7.a;
import com.kwai.sdk.switchconfig.a$d$a;
import com.kwai.sdk.switchconfig.a$d$b;
import com.kwai.sdk.switchconfig.a$d$f;
import com.kwai.sdk.switchconfig.a$d$l;
import com.kwai.sdk.switchconfig.a$d$i;
import com.kwai.sdk.switchconfig.a$d$j;

public class a$d implements c	// class@000f0e
{
    public final String a;
    public final a b;

    public void a$d(a p0,String p1){
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
          a$d$h uod$h = new a$d$h(this);
          Object[] objArray = new Object[0];
          a.y(a$d$h.class.getEnclosingMethod(), objArray);
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = a.z().h(this.a).e().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          f uof = new f();
          uof.a = uEntry.getValue();
          uof.e(uEntry.getKey());
          hashMap.put(uEntry.getKey(), uof);
       }
       return hashMap;
    }
    public f f(String p0){
       if (a.u) {
          a$d$g uod$g = new a$d$g(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$d$g.class.getEnclosingMethod(), objArray);
       }
       SwitchConfig switchConfig = a.z().h(this.a).f(p0);
       if (switchConfig == null) {
          return null;
       }else {
          f uof = new f();
          uof.a = switchConfig;
          uof.e(p0);
          return uof;
       }
    }
    public void g(List p0,ConfigPriority p1){
       a.z().h(this.a).t(p0, ConfigPriority.get(p1.getValue()));
    }
    public Object getValue(String p0,Type p1,Object p2){
       return b.e(this, p0, p1, p2);
    }
    public void h(JsonObject p0,ConfigPriority p1){
       if (a.u) {
          a$d$e uod$e = new a$d$e(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$d$e.class.getEnclosingMethod(), objArray);
       }
       if (this.b.d != null) {
          a$x ox = new a$x();
          ox.b = this.a;
          ox.a = "json";
          ox.c = p0;
          ox.d = p1.getValue();
          this.b.a.put(this.a, ox);
          this.b.r();
       }
       a.z().h(this.a).x(p0, ConfigPriority.get(p1.getValue()));
       return;
    }
    public void i(JsonObject p0,ConfigPriority p1,UpdateConfigMode p2){
       a.z().h(this.a).n(p0, ConfigPriority.get(p1.getValue()), p2);
    }
    public void j(String p0,ConfigPriority p1){
       if (a.u) {
          a$d$d uod$d = new a$d$d(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$d$d.class.getEnclosingMethod(), objArray);
       }
       if (this.b.d != null) {
          a$x ox = new a$x();
          ox.b = this.a;
          ox.a = "string";
          ox.c = p0;
          ox.d = p1.getValue();
          this.b.a.put(this.a, ox);
          this.b.r();
       }
       a.z().h(this.a).w(p0, ConfigPriority.get(p1.getValue()));
       return;
    }
    public synchronized void k(x p0){
       if (a.u) {
          a$d$c uod$c = new a$d$c(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$d$c.class.getEnclosingMethod(), objArray);
       }
       a.z().h(this.a).u(this.b.q.get(p0));
       this.b.q.remove(p0);
       return;
    }
    public synchronized void l(String p0,a p1){
       if (a.u) {
          a$d$k uod$k = new a$d$k(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$d$k.class.getEnclosingMethod(), objArray);
       }
       a.z().h(this.a).r(p0, this.b.p.get(p1));
       this.b.p.remove(p1);
       return;
    }
    public synchronized void m(x p0){
       if (a.u) {
          a$d$a uod$a = new a$d$a(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$d$a.class.getEnclosingMethod(), objArray);
       }
       if (!this.b.q.containsKey(p0)) {
          this.b.q.put(p0, new a$d$b(this, p0));
       }
       a.z().h(this.a).q(this.b.q.get(p0));
       return;
    }
    public void n(String p0,ConfigPriority p1){
       if (a.u) {
          a$d$f uod$f = new a$d$f(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$d$f.class.getEnclosingMethod(), objArray);
       }
       if (this.b.d != null) {
          a$x ox = new a$x();
          ox.b = this.a;
          ox.a = "pb";
          ox.c = p0;
          ox.d = p1.getValue();
          this.b.a.put(this.a, ox);
          this.b.r();
       }
       a.z().h(this.a).m(p0, ConfigPriority.get(p1.getValue()));
       return;
    }
    public boolean o(String p0,a p1){
       if (a.u) {
          a$d$l uod$l = new a$d$l(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$d$l.class.getEnclosingMethod(), objArray);
       }
       return a.z().h(this.a).s(p0, this.b.p.get(p1));
    }
    public synchronized void p(String p0,a p1){
       if (a.u) {
          a$d$i uod$i = new a$d$i(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$d$i.class.getEnclosingMethod(), objArray);
       }
       if (!this.b.p.containsKey(p1)) {
          this.b.p.put(p1, new a$d$j(this, p1));
       }
       a.z().h(this.a).l(p0, this.b.p.get(p1));
       return;
    }
}
