package com.google.common.base.Predicates$AndPredicate;
import ok.o;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import com.google.common.base.Predicates$a;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Iterable;

public class Predicates$AndPredicate implements o, Serializable	// class@001720
{
    public final List components;
    public static final long serialVersionUID;

    public void Predicates$AndPredicate(List p0){
       super();
       this.components = p0;
    }
    public void Predicates$AndPredicate(List p0,Predicates$a p1){
       super(p0);
    }
    public boolean apply(Object p0){
       int i = 0;
       while (true) {
          if (i >= this.components.size()) {
             return true;
          }
          if (!this.components.get(i).apply(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public boolean equals(Object p0){
       if (p0 instanceof Predicates$AndPredicate) {
          return this.components.equals(p0.components);
       }
       return false;
    }
    public int hashCode(){
       return (this.components.hashCode() + 0x12472c2c);
    }
    public String toString(){
       StringBuilder str = "Predicates."+"and"+'(';
       Iterator iterator = this.components.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!i) {
             str = str+',';
          }
          str = str+obj;
          i = 0;
       }
       return str+')';
    }
}
