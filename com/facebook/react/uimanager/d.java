package com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.c;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import ze.m;
import com.facebook.react.uimanager.RenderProfileQueue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Iterator;
import com.facebook.react.uimanager.j$n;
import java.util.Objects;
import com.facebook.react.uimanager.j;
import ze.a1;
import com.facebook.react.uimanager.j$w;
import ze.d0;
import com.facebook.react.uimanager.RenderProfileQueue$a;
import ze.c0;
import java.lang.Number;

public class d	// class@00133d
{
    public final ArrayList a;
    public final j b;
    public final ArrayList c;
    public ArrayList d;
    public d e;
    public long f;
    public int g;
    public boolean h;
    public final String i;
    public final RenderProfileQueue j;
    public boolean k;
    public boolean l;
    public j$y m;
    public final m n;
    public final c o;
    public boolean p;

    public void d(c p0,int p1,String p2){
       super();
       this.k = false;
       this.l = false;
       this.p = false;
       this.a = new ArrayList();
       this.c = new ArrayList();
       this.d = new ArrayList();
       this.b = p0.d;
       this.n = p0.r();
       this.j = p0.C();
       this.g = p1;
       this.i = p2;
       this.o = p0;
    }
    public static int[] l(ArrayList p0){
       int[] obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, d.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0.isEmpty()) {
          return obj;
       }
       int i = p0.size();
       obj = new int[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          obj[i1] = p0.get(i1).intValue();
       }
       return obj;
    }
    public void a(d p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "18")) {
          return;
       }
       this.c.add(p1, p0);
       p0.e = this;
       this.p = true;
       p0.p = true;
       return;
    }
    public void b(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       int i = 0;
       while (i < this.d.size()) {
          d uod = this.d.get(i);
          if (!this.c.contains(uod)) {
             uArrayList.add(Integer.valueOf(i));
             if (uod.h()) {
                uArrayList1.add(Integer.valueOf(uod.f()));
                uArrayList2.add(Integer.valueOf(i));
             }
          }
          i = i + 1;
       }
       if (!uArrayList.isEmpty()) {
          d tb = this.b;
          Objects.requireNonNull(tb);
          j$n on = new j$n(tb, this.f(), d.l(uArrayList), null, d.l(uArrayList1), d.l(uArrayList2));
          p0.add(i);
       }
       return;
    }
    public void c(j$w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.a.add(p0);
       this.p = true;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       if (this.p != null) {
          this.j.c(new d0(this));
          this.p = false;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       this.j.c(new c0(this));
       return;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.size();
    }
    public int f(){
       return this.g;
    }
    public d g(){
       return this.e;
    }
    public boolean h(){
       return this.l;
    }
    public void i(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "14")) {
          return;
       }
       this.c.remove(p0);
       this.p = true;
       return;
    }
    public void j(boolean p0){
       this.k = p0;
    }
    public void k(long p0){
       this.f = p0;
    }
}
