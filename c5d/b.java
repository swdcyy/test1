package c5d.b;
import c5d.b$a;
import nsd.u;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import npb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.lang.Math;
import java.lang.Boolean;
import c5d.b$b;
import java.util.List;
import java.util.Collections;
import crd.b;
import java.util.Iterator;
import java.lang.Iterable;

public final class b	// class@0004e9
{
    public final HashMap a;
    public final ArrayList b;
    public final ArrayList c;
    public String d;
    public b e;
    public b f;
    public final String g;
    public boolean h;
    public b$b i;
    public long j;
    public boolean k;
    public static final b$a l;

    static {
       b.l = new b$a(null);
    }
    public void b(){
       super();
       this.a = new HashMap();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = "";
       this.g = ",";
       this.k = true;
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(this.d());
    }
    public final a b(int p0){
       b obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "17");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.c.isEmpty()) {
          return null;
       }else {
          obj = this.a;
          b tc = this.c;
          if (PatchProxy.isSupport(uob)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "18");
             if (obj1 != patchProxyRe) {
                p0 = obj1.intValue();
             }else {
             label_0040 :
                int i = this.c.size();
                p0 = (i > 0)? (p0 + i) % i: 0;
             }
          }else {
             goto label_0040 ;
          }
          return obj.get(tc.get(p0));
       }
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.d() + 1;
       a uoa = this.b(i);
       while (this.g(uoa)) {
          int i1 = a.g(uoa, this.a()) ^ 0x01;
          if (i1) {
             i = i + 1;
             uoa = this.b(i);
          }else {
             break ;
          }
       }
       return uoa;
    }
    public final int d(){
       Object obj = PatchProxy.apply(null, this, b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max(0, this.c.indexOf(this.d));
    }
    public final a e(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.d() - 1;
       a uoa = this.b(i);
       while (this.g(uoa)) {
          int i1 = a.g(uoa, this.a()) ^ 0x01;
          if (i1) {
             i = i - 1;
             uoa = this.b(i);
          }else {
             break ;
          }
       }
       return uoa;
    }
    public final String f(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getId();
    }
    public final boolean g(a p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (this.h == null || (p0 == null || p0.a() != b)) {
          b = false;
       }
       return b;
    }
    public final a h(){
       a obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c();
       if (obj != null) {
          this.d = this.f(obj);
          this.i(true);
       }
       return obj;
    }
    public final void i(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "20")) {
          return;
       }
       uob = this.i;
       if (uob != null) {
          uob.a(this.e(), this.a(), this.c(), p0);
       }
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, b.class, "21")) {
          return;
       }
       b ti = this.i;
       if (ti != null) {
          ti.b();
       }
       return;
    }
    public final void k(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "14")) {
          return;
       }
       this.c.clear();
       uob = this.j;
       if (!uob) {
          this.c.addAll(this.b);
       }else if(!uob - 2){
          this.c.addAll(this.b);
          this.c.remove(this.d);
          Collections.shuffle(this.c);
          this.c.add(false, this.d);
       }else if(!uob - 1){
          this.c.addAll(this.b);
       }
       if (p0) {
          this.i(false);
       }
       return;
    }
    public final void l(List p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "8")) {
          return;
       }
       a.p(p0, "list");
       uob = this.e;
       if (uob != null && !uob.isDisposed()) {
          uob = this.e;
          if (uob != null) {
             uob.dispose();
          }
          this.e = null;
       }
       this.a.clear();
       this.b.clear();
       if (p0.isEmpty() ^ 1) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             String str = this.f(uoa);
             this.a.put(str, uoa);
             this.b.add(str);
          }
          if (p1 > 0 && p1 < this.b.size()) {
             iterator = this.b.get(p1);
             a.o(iterator, "mDataList[start]");
          }else {
             iterator = this.b.get(0);
             a.o(iterator, "mDataList[0]");
          }
          this.d = iterator;
       }
       this.j();
       this.k(1);
       return;
    }
}
