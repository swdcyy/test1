package fl8.a;
import fl8.c;
import kl8.b;
import il8.b;
import java.lang.Object;
import java.util.Stack;
import java.util.HashMap;
import gl8.b;
import hl8.b;
import java.lang.Integer;
import java.util.Map;
import gl8.e;
import el8.d;
import dl8.a;
import hl8.a;
import gl8.a;
import java.util.List;
import java.util.Iterator;
import jl8.c;
import jl8.d;
import java.lang.String;
import java.util.UUID;
import fl8.d;
import el8.a;
import il8.c;

public class a implements c, b	// class@002311
{
    public final Stack a;
    public final Map b;
    public final b c;
    public d d;
    public final a e;
    public boolean f;

    public void a(b p0){
       super();
       this.a = new Stack();
       HashMap hashMap = new HashMap();
       this.b = hashMap;
       this.e = new b();
       this.c = p0;
       hashMap.put(Integer.valueOf(2), new b(this));
    }
    public e a(){
       return this.c.a();
    }
    public final void c(d p0,boolean p1){
       a uoa = this.b.get(Integer.valueOf(p0.a().a));
       if (uoa != null) {
          uoa.c(p0, p1);
       }
       this.h().c(p0, p1);
       return;
    }
    public final void d(d p0){
       a uoa = this.b.get(Integer.valueOf(p0.a().a));
       if (uoa != null) {
          uoa.d(p0);
       }
       this.h().d(p0);
       return;
    }
    public final boolean e(d p0){
       int i2;
       if (this.f != null) {
          return false;
       }
       this.d(p0);
       Iterator iterator = p0.c().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = iterator.next().intValue();
          a td = this.d;
          c uoc = (td != null)? td.a(i1): null;
          if (uoc == null) {
             i2 = 0;
          }else {
             String str = this.g();
             if (uoc.a() || str == null) {
                str = UUID.randomUUID().toString();
             }
             i2 = this.c.b(p0, uoc);
             if (i2) {
                this.a.push(new d(str, uoc.f()));
             }
          }
          i = i | i2;
       }
       this.c(p0, i);
       return i;
    }
    public final String g(){
       String str = (this.a.isEmpty())? null: this.a.peek().a;
       return str;
    }
    public int getPageSize(){
       return this.a.size();
    }
    public a h(){
       return this.e;
    }
    public final void i(d p0){
       this.d = p0;
    }
    public final void j(){
       this.h().j();
    }
    public final boolean k(int p0){
       a uoa = new a();
       uoa.d(p0);
       return this.e(uoa);
    }
    public final void l(int p0,a p1){
       this.b.put(Integer.valueOf(p0), p1);
    }
    public final void m(int p0){
       this.b.remove(Integer.valueOf(p0));
    }
    public final void n(boolean p0){
       this.h().n(p0);
    }
    public boolean o(int p0,boolean p1){
       boolean b = false;
       if (this.f != null) {
          return b;
       }
       p0 = this.r(p0);
       if (p0 == -1) {
          return b;
       }
       this.j();
       if (!p1) {
          p0++;
       }
       for (int i = this.getPageSize() - 1; i >= p0; i--) {
          b = b | this.s(i);
       }
       this.n(b);
       return b;
    }
    public c p(){
       return this.c.c();
    }
    public final boolean pop(){
       if (this.f != null) {
          return false;
       }
       this.j();
       boolean b = this.s((this.a.size() - 1));
       this.n(b);
       return b;
    }
    public void q(boolean p0){
       this.f = p0;
    }
    public final int r(int p0){
       int i = this.getPageSize() - 1;
       while (true) {
          if (i < 0) {
             return -1;
          }
          if (this.a.get(i).b == p0) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return i;
    }
    public final boolean remove(int p0){
       if (this.f != null) {
          return false;
       }
       p0 = this.r(p0);
       if (p0 == -1) {
          return false;
       }
       this.j();
       boolean b = this.s(p0);
       this.n(b);
       return b;
    }
    public final boolean remove(String p0){
       boolean b = false;
       if (p0 == null || (p0.length() && this.f == null)) {
          this.j();
          int i = this.a.size() - 1;
          while (i >= 0) {
             if (p0.equals(this.a.get(i).a)) {
                b = b | this.s(i);
             }
             i = i - 1;
          }
          this.n(b);
       }
    label_0036 :
       return b;
    }
    public final boolean s(int p0){
       if (p0 >= 0 && (p0 >= this.a.size() || this.f != null)) {
          return false;
       }
       boolean b = this.c.remove(p0);
       if (b) {
          this.a.remove(p0);
       }
       return b;
    }
}
