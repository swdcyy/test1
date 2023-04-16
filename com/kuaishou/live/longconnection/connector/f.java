package com.kuaishou.live.longconnection.connector.f;
import hf3.b;
import lf3.a;
import java.lang.Object;
import mf3.a;
import java.util.ArrayList;
import pf3.c;
import android.content.Context;
import t45.c;
import java.lang.String;
import mf3.b;
import lf3.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import if3.g;
import java.util.List;
import com.kuaishou.live.longconnection.connector.c;
import if3.s;
import com.kuaishou.live.longconnection.connector.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import if3.e;
import if3.d;
import java.lang.Long;
import com.kuaishou.live.longconnection.connector.l$c;
import java.lang.Boolean;
import lf3.g;
import java.lang.Integer;
import com.kuaishou.live.longconnection.connector.f$a;

public class f	// class@000c6c
{
    public final int a;
    public s b;
    public c c;
    public boolean d;
    public boolean e;
    public final b f;
    public final a g;
    public final List h;
    public final a i;
    public int j;
    public c k;
    public static int l;

    public void f(b p0,a p1){
       super();
       this.g = new a();
       this.h = new ArrayList();
       this.j = 0;
       this.k = new c();
       this.f = p0;
       this.i = p1;
       c.h(p0.a);
       int l = f.l;
       f.l = l + 1;
       this.a = l;
       Object[] objArray = new Object[0];
       b.a(this.e(), "new LiveFeedConnectorManager", objArray);
    }
    public void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "14")) {
          return;
       }
       f tc = this.c;
       if (tc == null) {
          this.h.add(new g(this, p0));
       }else {
          tc.c(p0);
       }
       return;
    }
    public l b(s p0){
       l obj = PatchProxy.applyOneRefs(p0, this, f.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.a(this.e(), "buildLongConnectionParams, liveStreamId="+this.f.e()+", mAttach="+this.f.b()+", Race="+p0.a, objArray);
       obj = new l();
       if (!TextUtils.isEmpty(this.f.j)) {
          obj.b = this.f.j;
       }
       if (!TextUtils.isEmpty(this.f.l)) {
          obj.A = this.f.l;
       }
       if (!TextUtils.isEmpty(this.f.k)) {
          obj.E = this.f.k;
       }
       f tf = this.f;
       obj.z = tf.i;
       double[] uodoubleArra = tf.g();
       obj.c = this.f.e();
       f tf1 = this.f;
       obj.d = tf1.m;
       obj.e = tf1.b;
       obj.f = tf1.c;
       obj.g = tf1.d;
       obj.h = tf1.e;
       obj.i = tf1.f;
       obj.j = tf1.g;
       obj.k = tf1.n;
       obj.l = tf1.o;
       obj.m = tf1.p;
       obj.n = tf1.q;
       obj.o = tf1.r;
       obj.p = tf1.f();
       obj.w = uodoubleArra[i];
       obj.x = uodoubleArra[1];
       obj.J = new e(p0);
       obj.K = new d(this);
       obj.y = Long.parseLong(this.f.j());
       obj.q = this.f.h();
       obj.t = this.f.k();
       obj.r = this.f.c();
       obj.C = this.f.a();
       obj.D = this.f.h;
       obj.u = this.g.a();
       obj.v = this.g.f;
       f tf2 = this.f;
       obj.F = tf2.s;
       obj.G = tf2.t;
       obj.H = tf2.u;
       obj.I = tf2.v;
       obj.L = tf2.w;
       obj.M = tf2.x;
       obj.N = tf2.y;
       obj.O = tf2.z;
       obj.P = tf2.A;
       obj.Q = this.k;
       return obj;
    }
    public a c(){
       return this.g;
    }
    public l$c d(){
       f obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          return null;
       }
       return obj.j();
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, f.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFeedConnectorManager-index-"+this.a;
    }
    public boolean f(){
       return this.e;
    }
    public boolean g(){
       f obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = (obj != null && obj.isConnected())? true: false;
       return b;
    }
    public void h(int p0,Class p1,g p2,boolean p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, f.class, "12")) {
          return;
       }
       f tc = this.c;
       if (tc == null) {
          f$a uoa = new f$a(this, p0, p1, p2, p3);
          this.h.add(v7);
       }else {
          tc.J(p0, p1, p2, p3);
       }
       return;
    }
}
