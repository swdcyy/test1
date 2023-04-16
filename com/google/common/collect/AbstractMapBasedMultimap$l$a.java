package com.google.common.collect.AbstractMapBasedMultimap$l$a;
import java.util.ListIterator;
import com.google.common.collect.AbstractMapBasedMultimap$k$a;
import com.google.common.collect.AbstractMapBasedMultimap$l;
import com.google.common.collect.AbstractMapBasedMultimap$k;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import java.util.AbstractCollection;
import com.google.common.collect.AbstractMapBasedMultimap;

public class AbstractMapBasedMultimap$l$a extends AbstractMapBasedMultimap$k$a implements ListIterator	// class@00179b
{
    public final AbstractMapBasedMultimap$l e;

    public void AbstractMapBasedMultimap$l$a(AbstractMapBasedMultimap$l p0){
       this.e = p0;
       super(p0);
    }
    public void AbstractMapBasedMultimap$l$a(AbstractMapBasedMultimap$l p0,int p1){
       this.e = p0;
       super(p0, p0.p().listIterator(p1));
    }
    public void add(Object p0){
       this.b().add(p0);
       p0 = this.e;
       AbstractMapBasedMultimap$l g = p0.g;
       g.totalSize = g.totalSize + 1;
       if (this.e.isEmpty()) {
          p0.b();
       }
       return;
    }
    public final ListIterator b(){
       this.a();
       return this.b;
    }
    public boolean hasPrevious(){
       return this.b().hasPrevious();
    }
    public int nextIndex(){
       return this.b().nextIndex();
    }
    public Object previous(){
       return this.b().previous();
    }
    public int previousIndex(){
       return this.b().previousIndex();
    }
    public void set(Object p0){
       this.b().set(p0);
    }
}
