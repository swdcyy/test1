package com.google.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.AbstractMap;
import com.google.gson.internal.LinkedTreeMap$a;
import java.util.Comparator;
import com.google.gson.internal.LinkedTreeMap$e;
import java.lang.Math;
import java.lang.Object;
import java.util.Set;
import com.google.gson.internal.LinkedTreeMap$b;
import java.lang.Comparable;
import java.lang.ClassCastException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.String;
import java.util.Map$Entry;
import com.google.gson.internal.LinkedTreeMap$c;
import java.util.Objects;
import java.util.LinkedHashMap;
import java.util.Map;

public final class LinkedTreeMap extends AbstractMap implements Serializable	// class@00056f
{
    public Comparator comparator;
    public LinkedTreeMap$b entrySet;
    public final LinkedTreeMap$e header;
    public LinkedTreeMap$c keySet;
    public int modCount;
    public LinkedTreeMap$e root;
    public int size;
    public static final boolean $assertionsDisabled;
    public static final Comparator b;

    static {
       LinkedTreeMap.b = new LinkedTreeMap$a();
    }
    public void LinkedTreeMap(){
       super(LinkedTreeMap.b);
    }
    public void LinkedTreeMap(Comparator p0){
       super();
       this.size = 0;
       this.modCount = 0;
       this.header = new LinkedTreeMap$e();
       if (p0 != null) {
       }else {
          p0 = LinkedTreeMap.b;
       }
       this.comparator = p0;
       return;
    }
    public final void a(LinkedTreeMap$e p0,boolean p1){
       int i3;
       while (p0 != null) {
          LinkedTreeMap$e c = p0.c;
          LinkedTreeMap$e d = p0.d;
          LinkedTreeMap$e uoe = null;
          LinkedTreeMap$e i = (c != null)? c.i: 0;
          LinkedTreeMap$e i1 = (d != null)? d.i: 0;
          int i2 = i - i1;
          if (i2 == -2) {
             c = d.c;
             i = d.d;
             i = (i != null)? i.i: 0;
             if (c != null) {
                uoe = c.i;
             }
             i3 = uoe - i;
             if (i3 == -1 || (!i3 && !p1)) {
                this.e(p0);
             }else {
                this.f(d);
                this.e(p0);
             }
             if (p1) {
                break ;
             }
          }else {
             int i5 = 1;
             if (i2 == 2) {
                d = c.c;
                i = c.d;
                i = (i != null)? i.i: 0;
                if (d != null) {
                   uoe = d.i;
                }
                i3 = uoe - i;
                if (i3 == i5 || (!i3 && !p1)) {
                   this.f(p0);
                }else {
                   this.e(c);
                   this.f(p0);
                }
                if (p1) {
                   break ;
                }
             }else if(!i2){
                int i4 = i + 1;
                p0.i = i4;
                if (p1) {
                   break ;
                }
             }else {
                int i6 = Math.max(i, i1) + i5;
                p0.i = i6;
                if (!p1) {
                   break ;
                }
             }
          }
          p0 = p0.b;
       }
       return;
    }
    public final void c(LinkedTreeMap$e p0,LinkedTreeMap$e p1){
       LinkedTreeMap$e b = p0.b;
       p0.b = null;
       if (p1 != null) {
          p1.b = b;
       }
       if (b != null) {
          b.c = (b.c == p0)? p1: p1;
       }else {
          this.root = p1;
       }
       return;
    }
    public void clear(){
       this.root = null;
       this.size = 0;
       this.modCount = this.modCount + 1;
       LinkedTreeMap theader = this.header;
       theader.f = theader;
       theader.e = theader;
    }
    public boolean containsKey(Object p0){
       boolean b = (this.findByObject(p0) != null)? true: false;
       return b;
    }
    public final void e(LinkedTreeMap$e p0){
       int i1;
       LinkedTreeMap$e c = p0.c;
       LinkedTreeMap$e d = p0.d;
       LinkedTreeMap$e c1 = d.c;
       LinkedTreeMap$e d1 = d.d;
       p0.d = c1;
       if (c1 != null) {
          c1.b = p0;
       }
       this.c(p0, d);
       d.c = p0;
       p0.b = d;
       LinkedTreeMap$e uoe = null;
       c = (c != null)? c.i: 0;
       c1 = (c1 != null)? c1.i: 0;
       int i = Math.max(c, c1) + 1;
       p0.i = i;
       if (d1 != null) {
          uoe = d1.i;
       }
       d.i = Math.max(i, uoe) + 1;
       return;
    }
    public Set entrySet(){
       LinkedTreeMap tentrySet = this.entrySet;
       if (tentrySet != null) {
       }else {
          tentrySet = new LinkedTreeMap$b(this);
          this.entrySet = tentrySet;
       }
       return tentrySet;
    }
    public final void f(LinkedTreeMap$e p0){
       int i1;
       LinkedTreeMap$e c = p0.c;
       LinkedTreeMap$e d = p0.d;
       LinkedTreeMap$e c1 = c.c;
       LinkedTreeMap$e d1 = c.d;
       p0.c = d1;
       if (d1 != null) {
          d1.b = p0;
       }
       this.c(p0, c);
       c.d = p0;
       p0.b = c;
       LinkedTreeMap$e uoe = null;
       d = (d != null)? d.i: 0;
       d1 = (d1 != null)? d1.i: 0;
       int i = Math.max(d, d1) + 1;
       p0.i = i;
       if (c1 != null) {
          uoe = c1.i;
       }
       c.i = Math.max(i, uoe) + 1;
       return;
    }
    public LinkedTreeMap$e find(Object p0,boolean p1){
       int i;
       LinkedTreeMap$e c;
       LinkedTreeMap$e uoe1;
       LinkedTreeMap tcomparator = this.comparator;
       LinkedTreeMap troot = this.root;
       LinkedTreeMap$e uoe = null;
       if (troot != null) {
          Comparable uComparable = (tcomparator == LinkedTreeMap.b)? p0: uoe;
          while (true) {
             if (uComparable != null) {
                i = uComparable.compareTo(troot.g);
             label_001f :
                if (!i) {
                   return troot;
                }else if(i < 0){
                   c = troot.c;
                }else {
                   c = troot.d;
                }
                if (c != null) {
                   troot = c;
                }
             }else {
                i = tcomparator.compare(p0, troot.g);
                goto label_001f ;
             }
          }
       }else {
          i = 0;
       }
       if (!p1) {
          return uoe;
       }else {
          LinkedTreeMap theader = this.header;
          if (troot == null) {
             if (tcomparator != LinkedTreeMap.b || p0 instanceof Comparable) {
                uoe1 = new LinkedTreeMap$e(troot, p0, theader, theader.f);
                this.root = uoe1;
             }else {
                throw new ClassCastException(p0.getClass().getName()+" is not Comparable");
             }
          }else {
             uoe1 = new LinkedTreeMap$e(troot, p0, theader, theader.f);
             troot.c = (i < 0)? uoe1: uoe1;
             this.a(troot, 1);
          }
          this.size = this.size + 1;
          this.modCount = this.modCount + 1;
          return uoe1;
       }
    }
    public LinkedTreeMap$e findByEntry(Map$Entry p0){
       LinkedTreeMap$e uoe = this.findByObject(p0.getKey());
       int i = 1;
       if (uoe != null) {
          LinkedTreeMap$e h = uoe.h;
          p0 = p0.getValue();
          int i1 = (h == p0 || (h != null && h.equals(p0)))? 1: 0;
          if (i1) {
          label_0024 :
             if (!i) {
                uoe = null;
             }
             return uoe;
          }
       }
       i = 0;
       goto label_0024 ;
    }
    public LinkedTreeMap$e findByObject(Object p0){
       LinkedTreeMap$e uoe = null;
       if (p0 != null) {
          boolean b = false;
          try{
             uoe = this.find(p0, b);
          }catch(java.lang.ClassCastException e0){
          }
       }
       return e0;
    }
    public Object get(Object p0){
       p0 = this.findByObject(p0);
       p0 = (p0 != null)? p0.h: null;
       return p0;
    }
    public Set keySet(){
       LinkedTreeMap tkeySet = this.keySet;
       if (tkeySet != null) {
       }else {
          tkeySet = new LinkedTreeMap$c(this);
          this.keySet = tkeySet;
       }
       return tkeySet;
    }
    public Object put(Object p0,Object p1){
       Objects.requireNonNull(p0, "key == null");
       p0 = this.find(p0, true);
       LinkedTreeMap$e h = p0.h;
       p0.h = p1;
       return h;
    }
    public Object remove(Object p0){
       p0 = this.removeInternalByKey(p0);
       p0 = (p0 != null)? p0.h: null;
       return p0;
    }
    public void removeInternal(LinkedTreeMap$e p0,boolean p1){
       LinkedTreeMap$e f;
       if (p1) {
          f = p0.f;
          f.e = p0.e;
          p0.e.f = f;
       }
       f = p0.c;
       LinkedTreeMap$e d = p0.d;
       LinkedTreeMap$e b = p0.b;
       boolean b1 = false;
       if (f != null && d != null) {
          if (f.i > d.i) {
             d = f.d;
             d = f;
             f = d;
             while (f != null) {
                d = f.d;
             }
          }else {
             f = d.c;
             d = f;
             f = d;
             while (d != null) {
                f = d.c;
             }
             d = f;
          }
          this.removeInternal(d, b1);
          f = p0.c;
          if (f != null) {
             b = f.i;
             d.c = f;
             f.b = d;
             p0.c = null;
          }else {
             int i = 0;
          }
          f = p0.d;
          if (f != null) {
             b1 = f.i;
             d.d = f;
             f.b = d;
             p0.d = null;
          }
          d.i = Math.max(b, b1) + 1;
          this.c(p0, d);
          return;
       }else if(f != null){
          this.c(p0, f);
          p0.c = null;
       }else if(d != null){
          this.c(p0, d);
          p0.d = null;
       }else {
          this.c(p0, null);
       }
       this.a(b, b1);
       this.size = this.size - 1;
       this.modCount = this.modCount + 1;
       return;
    }
    public LinkedTreeMap$e removeInternalByKey(Object p0){
       p0 = this.findByObject(p0);
       if (p0 != null) {
          this.removeInternal(p0, true);
       }
       return p0;
    }
    public int size(){
       return this.size;
    }
    public final Object writeReplace(){
       return new LinkedHashMap(this);
    }
}
