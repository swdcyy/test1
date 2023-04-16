package com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.reflect.Parameter;
import java.lang.StringBuilder;
import java.util.Objects;
import java.lang.RuntimeException;
import com.kwai.sdk.switchconfig.a$o;
import java.lang.Class;
import java.lang.Integer;
import com.kwai.sdk.switchconfig.v2.a;
import oo7.d;
import com.kwai.sdk.switchconfig.v1.a;
import lo7.d;
import com.kwai.sdk.switchconfig.a$n;
import java.lang.Long;
import com.kwai.sdk.switchconfig.a$q;
import com.kwai.sdk.switchconfig.a$p;
import java.lang.Boolean;
import java.util.Map;
import com.kwai.sdk.switchconfig.a$k;
import io7.f;
import com.kwai.sdk.switchconfig.a$j;
import java.util.List;
import com.kwai.sdk.switchconfig.ConfigPriority;
import com.kwai.sdk.switchconfig.a$i;
import java.lang.reflect.Type;
import com.kwai.sdk.switchconfig.a$m;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.a$f;
import com.kwai.sdk.switchconfig.UpdateConfigMode;
import com.kwai.sdk.switchconfig.a$g;
import com.kwai.sdk.switchconfig.a$e;
import io7.x;
import com.kwai.sdk.switchconfig.a$v;
import io7.a;
import com.kwai.sdk.switchconfig.a$s;
import com.kwai.sdk.switchconfig.a$u;
import com.kwai.sdk.switchconfig.a$h;
import com.kwai.sdk.switchconfig.a$t;
import com.kwai.sdk.switchconfig.a$r;
import com.kwai.sdk.switchconfig.a$a;
import com.kwai.sdk.switchconfig.v2.ConfigPriority;
import com.kwai.sdk.switchconfig.v1.ConfigPriority;
import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import io7.d;
import java.lang.Throwable;
import android.util.Log;
import io7.r;
import io7.g;
import io7.h;
import android.content.Context;
import lo7.e;
import no7.a;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.a$x;
import com.kwai.sdk.switchconfig.v1.internal.b;
import com.kwai.sdk.switchconfig.a$b;
import com.kwai.sdk.switchconfig.a$c;
import com.kwai.sdk.switchconfig.a$d;
import com.kwai.sdk.switchconfig.a$w;
import io7.j;
import io7.k;
import oo7.e;
import qo7.a;
import po7.g;
import com.kwai.sdk.switchconfig.a$l;
import com.kwai.sdk.switchconfig.v2.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import po7.i;
import com.kwai.sdk.switchconfig.v2.logger.a;
import oo7.f;
import com.kwai.sdk.switchconfig.v2.internal.SwitchConfigUpdateReceiver;
import android.content.Intent;
import com.kwai.sdk.switchconfig.v1.internal.a;
import com.kwai.sdk.switchconfig.v1.loggerII.b;
import mo7.i;
import lo7.f;
import com.kwai.sdk.switchconfig.v1.internal.SwitchConfigUpdateReceiver;

public class a implements c	// class@000f23
{
    public Map a;
    public Set b;
    public d c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Context h;
    public String i;
    public e j;
    public double k;
    public a l;
    public boolean m;
    public Map n;
    public Map o;
    public Map p;
    public Map q;
    public boolean r;
    public final HashMap s;
    public static final a t;
    public static boolean u;
    public static boolean v;

    static {
       a.t = new a();
       a.u = false;
       a.v = false;
    }
    public void a(){
       super();
       this.a = new HashMap();
       this.b = new HashSet();
       this.d = false;
       this.e = false;
       this.f = false;
       this.g = false;
       this.n = new HashMap();
       this.o = new HashMap();
       this.p = new HashMap();
       this.q = new HashMap();
       this.r = false;
       this.s = new HashMap();
    }
    public static a t(){
       return a.t;
    }
    public static void y(Method p0,Object[] p1){
       if (Build$VERSION.SDK_INT >= 26) {
          Parameter[] parameters = p0.getParameters();
          if (parameters.length == p1.length) {
             for (int i = 0; i < parameters.length; i = i + 1) {
                parameters[i].getName();
                Objects.toString(p1[i]);
             }
          }else {
             throw new RuntimeException("args count error!");
          }
       }
       return;
    }
    public int a(String p0,int p1){
       if (a.u) {
          a$o oo = new a$o(this);
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1)};
          a.y(a$o.class.getEnclosingMethod(), objArray);
       }
       int i = (a.t().v())? a.x().a(p0, p1): a.z().a(p0, p1);
       return i;
    }
    public long b(String p0,long p1){
       if (a.u) {
          a$n on = new a$n(this);
          Object[] objArray = new Object[]{p0,Long.valueOf(p1)};
          a.y(a$n.class.getEnclosingMethod(), objArray);
       }
       long l = (a.t().v())? a.x().b(p0, p1): a.z().b(p0, p1);
       return l;
    }
    public String c(String p0,String p1){
       if (a.u) {
          a$q oq = new a$q(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$q.class.getEnclosingMethod(), objArray);
       }
       p0 = (a.t().v())? a.x().c(p0, p1): a.z().c(p0, p1);
       return p0;
    }
    public boolean d(String p0,boolean p1){
       if (a.u) {
          a$p op = new a$p(this);
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1)};
          a.y(a$p.class.getEnclosingMethod(), objArray);
       }
       boolean b = (a.t().v())? a.x().d(p0, p1): a.z().d(p0, p1);
       return b;
    }
    public Map e(){
       if (a.u) {
          a$k ok = new a$k(this);
          Object[] objArray = new Object[0];
          a.y(a$k.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          return this.u("SOURCE_DEFAULT").e();
       }else {
          return this.u("SOURCE_DEFAULT").e();
       }
    }
    public f f(String p0){
       if (a.u) {
          a$j oj = new a$j(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$j.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          return this.u("SOURCE_DEFAULT").f(p0);
       }else {
          return this.u("SOURCE_DEFAULT").f(p0);
       }
    }
    public void g(List p0,ConfigPriority p1){
       if (a.u) {
          a$i oi = new a$i(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$i.class.getEnclosingMethod(), objArray);
       }
       this.u("SOURCE_DEFAULT").g(p0, p1);
       return;
    }
    public Object getValue(String p0,Type p1,Object p2){
       if (a.u) {
          a$m om = new a$m(this);
          Object[] objArray = new Object[]{p0,p1,p2};
          a.y(a$m.class.getEnclosingMethod(), objArray);
       }
       p1 = (a.t().v())? a.x().getValue(p0, p1, p2): a.z().getValue(p0, p1, p2);
       if (a.v) {
          "[子线程获取开关]getValue key:"+p0+" defaultvalue:"+p2+" returnvalue:"+p1;
       }
       return p1;
    }
    public void h(JsonObject p0,ConfigPriority p1){
       if (a.u) {
          a$f uof = new a$f(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$f.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          this.u("SOURCE_DEFAULT").h(p0, p1);
       }else {
          this.u("SOURCE_DEFAULT").h(p0, p1);
       }
       return;
    }
    public void i(JsonObject p0,ConfigPriority p1,UpdateConfigMode p2){
       if (a.u) {
          a$g og = new a$g(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$g.class.getEnclosingMethod(), objArray);
       }
       this.u("SOURCE_DEFAULT").i(p0, p1, p2);
       return;
    }
    public void j(String p0,ConfigPriority p1){
       if (a.u) {
          a$e uoe = new a$e(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$e.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          this.u("SOURCE_DEFAULT").j(p0, p1);
       }else {
          this.u("SOURCE_DEFAULT").j(p0, p1);
       }
       return;
    }
    public void k(x p0){
       if (a.u) {
          a$v ov = new a$v(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$v.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          this.u("SOURCE_DEFAULT").k(p0);
       }else {
          this.u("SOURCE_DEFAULT").k(p0);
       }
       return;
    }
    public void l(String p0,a p1){
       if (a.u) {
          a$s os = new a$s(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$s.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          this.u("SOURCE_DEFAULT").l(p0, p1);
       }else {
          this.u("SOURCE_DEFAULT").l(p0, p1);
       }
       return;
    }
    public void m(x p0){
       if (a.u) {
          a$u ou = new a$u(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$u.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          this.u("SOURCE_DEFAULT").m(p0);
       }else {
          this.u("SOURCE_DEFAULT").m(p0);
       }
       return;
    }
    public void n(String p0,ConfigPriority p1){
       if (a.u) {
          a$h oh = new a$h(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$h.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          this.u("SOURCE_DEFAULT").n(p0, p1);
       }else {
          this.u("SOURCE_DEFAULT").n(p0, p1);
       }
       return;
    }
    public boolean o(String p0,a p1){
       if (a.u) {
          a$t ot = new a$t(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$t.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          return this.u("SOURCE_DEFAULT").o(p0, p1);
       }else {
          return this.u("SOURCE_DEFAULT").o(p0, p1);
       }
    }
    public void p(String p0,a p1){
       if (a.u) {
          a$r or = new a$r(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$r.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          this.u("SOURCE_DEFAULT").p(p0, p1);
       }else {
          this.u("SOURCE_DEFAULT").p(p0, p1);
       }
       return;
    }
    public void q(String p0,ConfigPriority[] p1){
       ConfigPriority[] uConfigPrior;
       int i = 0;
       if (a.u) {
          a$a uoa = new a$a(this);
          Object[] objArray = new Object[]{p0,p1};
          a.y(a$a.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          uConfigPrior = new ConfigPriority[p1.length];
          for (; i < p1.length; i = i + 1) {
             uConfigPrior[i] = ConfigPriority.get(p1[i].getValue());
          }
          a.x().u(p0, uConfigPrior);
       }else {
          uConfigPrior = new ConfigPriority[p1.length];
          for (; i < p1.length; i = i + 1) {
             uConfigPrior[i] = ConfigPriority.get(p1[i].getValue());
          }
          a.z().p(p0, uConfigPrior);
       }
       return;
    }
    public void r(){
       Arrays.toString(this.a.keySet().toArray());
       if (this.a.keySet().containsAll(this.b)) {
          this.c.a(this.w(this.a));
       }
       return;
    }
    public void s(){
       ConfigPriority lOW;
       a$x a;
       Arrays.toString(this.a.keySet().toArray());
       if (this.a.keySet().containsAll(this.b)) {
          a ta = this.a;
          if (a.u) {
             r or = new r(this);
             Object[] objArray = new Object[]{ta};
             a.y(r.class.getEnclosingMethod(), objArray);
          }
          if (this.f == null) {
             this.f = true;
             a.z().k(this.h, this.i, new g(this), this.k, new h(this), this.m);
             ConfigPriority[] uConfigPrior = new ConfigPriority[]{lOW,ConfigPriority.MIDDLE};
             lOW = ConfigPriority.LOW;
             a.z().p("SOURCE_DEFAULT", uConfigPrior);
             uConfigPrior = new ConfigPriority[]{lOW};
             a.z().p("SOURCE_LIVE", uConfigPrior);
          }
          Iterator iterator = ta.entrySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                a$x b = uEntry.getValue().b;
                lOW = ConfigPriority.get(uEntry.getValue().d);
                a = uEntry.getValue().a;
                int i = -1;
                int i1 = a.hashCode();
                if (i1 != -891985903) {
                   if (i1 != 3570) {
                      if (i1 == 0x31ece8 && a.equals("json")) {
                         i = 2;
                      }
                   }else if(a.equals("pb")){
                      i = 1;
                   }
                }else if(a.equals("string")){
                   i = 0;
                }
                if (i) {
                   if (i != 1) {
                      if (i == 2) {
                         a.z().h(b).x(uEntry.getValue().c, lOW);
                      }else {
                         throw new RuntimeException("migrateKuaishouAndNebulaAppV2ToV1 unknow sourceType");
                      }
                   }else {
                      a.z().h(b).y(uEntry.getValue().c, lOW, 1);
                   }
                }else {
                   a.z().h(b).w(uEntry.getValue().c, lOW);
                }
             }else {
                this.c.a(1);
                break ;
             }
          }
       }
       return;
    }
    public c u(String p0){
       if (a.u) {
          a$b uob = new a$b(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$b.class.getEnclosingMethod(), objArray);
       }
       if (this.s.containsKey(p0)) {
          return this.s.get(p0);
       }else {
          a ts = this.s;
          _monitor_enter(ts);
          if (!this.s.containsKey(p0)) {
             if (a.t().v()) {
                this.s.put(p0, new a$c(this, p0));
             }else {
                this.s.put(p0, new a$d(this, p0));
             }
          }
          _monitor_exit(ts);
          return this.s.get(p0);
       }
    }
    public boolean v(){
       return this.r;
    }
    public final boolean w(Map p0){
       ConfigPriority lOW;
       a$x a;
       if (a.u) {
          a$w ow = new a$w(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$w.class.getEnclosingMethod(), objArray);
       }
       if (this.g == null) {
          this.g = true;
          a.x().l(this.h, this.i, new j(this), this.k, new k(this));
          ConfigPriority[] uConfigPrior = new ConfigPriority[]{lOW,ConfigPriority.MIDDLE};
          lOW = ConfigPriority.LOW;
          a.x().u("SOURCE_DEFAULT", uConfigPrior);
          uConfigPrior = new ConfigPriority[]{lOW};
          a.x().u("SOURCE_LIVE", uConfigPrior);
       }
       Iterator iterator = p0.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return 1;
          }
          Map$Entry uEntry = iterator.next();
          a$x b = uEntry.getValue().b;
          lOW = ConfigPriority.get(uEntry.getValue().d);
          a = uEntry.getValue().a;
          int i = -1;
          int i1 = a.hashCode();
          if (i1 != -891985903) {
             if (i1 != 3570) {
                if (i1 == 0x31ece8 && a.equals("json")) {
                   i = 2;
                }
             }else if(a.equals("pb")){
                i = 1;
             }
          }else if(a.equals("string")){
             i = 0;
          }
          if (i) {
             if (i != 1) {
                if (i == 2) {
                   a.x().h(b).o(uEntry.getValue().c, lOW);
                }else {
                   break ;
                }
             }else {
                a.x().h(b).n(uEntry.getValue().c, lOW, 1);
             }
          }else {
             a.x().h(b).r(uEntry.getValue().c, lOW);
          }
       }
       throw new RuntimeException("migrateKuaishouAndNebulaAppV2ToV1 unknow sourceType");
    }
    public void x(String p0){
       a a;
       Iterator iterator;
       Intent intent;
       if (a.u) {
          a$l ol = new a$l(this);
          Object[] objArray = new Object[]{p0};
          a.y(a$l.class.getEnclosingMethod(), objArray);
       }
       if (a.t().v()) {
          a = a.x().a;
          if (a.c() && (a.a() && !TextUtils.equals(a.b, p0))) {
             a.b = p0;
             iterator = a.f.entrySet().iterator();
             while (iterator.hasNext()) {
                iterator.next().getValue().i(p0);
             }
             a.d.c(p0);
             a g = a.g;
             if (!TextUtils.equals(g.j, p0)) {
                g.j = p0;
                g.i = "user_"+g.j;
             }
             if (f.c()) {
                a.d.d(a.b);
                if (!f.d()) {
                   intent = new Intent();
                   intent.setPackage(a.d().e().getPackageName());
                   intent.setAction("com.kwai.sdk.switchconfig.internal.SwitchConfigUpdateReceiver");
                   intent.putExtra("ARG_ACTION_TYPE", 1);
                   a.d().e().sendBroadcast(intent);
                }
             }
          }
       }else {
          a = a.z().a;
          if (a.c() && (a.a() && !TextUtils.equals(a.b, p0))) {
             a.b = p0;
             iterator = a.f.entrySet().iterator();
             while (iterator.hasNext()) {
                iterator.next().getValue().o(p0);
             }
             iterator = a.g.entrySet().iterator();
             while (iterator.hasNext()) {
                iterator.next().getValue().r = true;
             }
             a.d.c(p0);
             if (f.c()) {
                a.d.d(a.b);
                if (!f.d()) {
                   intent = new Intent();
                   intent.setPackage(a.d().e().getPackageName());
                   intent.setAction("com.kwai.sdk.switchconfig.internal.SwitchConfigUpdateReceiver");
                   intent.putExtra("ARG_ACTION_TYPE", 1);
                   a.d().e().sendBroadcast(intent);
                }
             }
          }
       }
       return;
    }
}
