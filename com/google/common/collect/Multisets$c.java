package com.google.common.collect.Multisets$c;
import com.google.common.collect.o$e;
import com.google.common.collect.k;
import java.util.Collection;
import java.lang.Object;
import com.google.common.collect.k$a;

public abstract class Multisets$c extends o$e	// class@001860
{

    public void Multisets$c(){
       super();
    }
    public abstract k b();
    public void clear(){
       this.b().clear();
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof k$a) {
          if (p0.getCount() <= 0) {
             return b;
          }else if(this.b().count(p0.getElement()) == p0.getCount()){
             b = true;
          }
       }
       return b;
    }
    public boolean remove(Object p0){
       if (p0 instanceof k$a) {
          Object element = p0.getElement();
          int count = p0.getCount();
          if (count) {
             return this.b().setCount(element, count, 0);
          }
       }
       return 0;
    }
}
