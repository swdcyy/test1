package com.google.common.collect.AbstractMapBasedMultimap$l;
import java.util.List;
import com.google.common.collect.AbstractMapBasedMultimap$k;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.lang.Object;
import java.util.Collection;
import java.util.ListIterator;
import com.google.common.collect.AbstractMapBasedMultimap$l$a;

public class AbstractMapBasedMultimap$l extends AbstractMapBasedMultimap$k implements List	// class@00179c
{
    public final AbstractMapBasedMultimap g;

    public void AbstractMapBasedMultimap$l(AbstractMapBasedMultimap p0,Object p1,List p2,AbstractMapBasedMultimap$k p3){
       this.g = p0;
       super(p0, p1, p2, p3);
    }
    public void add(int p0,Object p1){
       this.m();
       this.p().add(p0, p1);
       AbstractMapBasedMultimap$l tg = this.g;
       tg.totalSize = tg.totalSize + 1;
       if (this.l().isEmpty()) {
          this.b();
       }
       return;
    }
    public boolean addAll(int p0,Collection p1){
       if (p1.isEmpty()) {
          return false;
       }
       int i = this.size();
       boolean b = this.p().addAll(p0, p1);
       if (b) {
          AbstractMapBasedMultimap$l tg = this.g;
          tg.totalSize = tg.totalSize + (this.l().size() - i);
          if (!i) {
             this.b();
          }
       }
       return b;
    }
    public Object get(int p0){
       this.m();
       return this.p().get(p0);
    }
    public int indexOf(Object p0){
       this.m();
       return this.p().indexOf(p0);
    }
    public int lastIndexOf(Object p0){
       this.m();
       return this.p().lastIndexOf(p0);
    }
    public ListIterator listIterator(){
       this.m();
       return new AbstractMapBasedMultimap$l$a(this);
    }
    public ListIterator listIterator(int p0){
       this.m();
       return new AbstractMapBasedMultimap$l$a(this, p0);
    }
    public List p(){
       return this.l();
    }
    public Object remove(int p0){
       this.m();
       AbstractMapBasedMultimap$l tg = this.g;
       tg.totalSize = tg.totalSize - 1;
       this.n();
       return this.p().remove(p0);
    }
    public Object set(int p0,Object p1){
       this.m();
       return this.p().set(p0, p1);
    }
    public List subList(int p0,int p1){
       this.m();
       AbstractMapBasedMultimap$l tg = this.g;
       AbstractMapBasedMultimap$k tb = this.b;
       List list = this.p().subList(p0, p1);
       AbstractMapBasedMultimap$k ok = (this.d() == null)? this: this.d();
       return tg.wrapList(tb, list, ok);
    }
}
