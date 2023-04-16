package com.google.common.collect.AbstractMapBasedMultimap$c;
import com.google.common.collect.Maps$t;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.AbstractMapBasedMultimap$c$a;
import com.google.common.collect.AbstractMapBasedMultimap$c$b;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import java.lang.Object;
import com.google.common.collect.Maps;
import java.util.Map$Entry;
import java.util.Collection;
import com.google.common.collect.a;
import java.lang.String;

public class AbstractMapBasedMultimap$c extends Maps$t	// class@001790
{
    public final Map e;
    public final AbstractMapBasedMultimap f;

    public void AbstractMapBasedMultimap$c(AbstractMapBasedMultimap p0,Map p1){
       this.f = p0;
       super();
       this.e = p1;
    }
    public Set a(){
       return new AbstractMapBasedMultimap$c$a(this);
    }
    public void clear(){
       AbstractMapBasedMultimap$c tf = this.f;
       if (this.e == tf.map) {
          tf.clear();
       }else {
          Iterators.d(new AbstractMapBasedMultimap$c$b(this));
       }
       return;
    }
    public boolean containsKey(Object p0){
       return Maps.x(this.e, p0);
    }
    public boolean equals(Object p0){
       boolean b = (this == p0 || this.e.equals(p0))? true: false;
       return b;
    }
    public Map$Entry f(Map$Entry p0){
       Object key = p0.getKey();
       return Maps.k(key, this.f.wrapCollection(key, p0.getValue()));
    }
    public Object get(Object p0){
       Collection uCollection = Maps.y(this.e, p0);
       p0 = (uCollection == null)? null: this.f.wrapCollection(p0, uCollection);
       return p0;
    }
    public int hashCode(){
       return this.e.hashCode();
    }
    public Set keySet(){
       return this.f.keySet();
    }
    public Object remove(Object p0){
       p0 = this.e.remove(p0);
       if (p0 == null) {
          p0 = null;
       }else {
          Collection uCollection = this.f.createCollection();
          uCollection.addAll(p0);
          AbstractMapBasedMultimap$c tf = this.f;
          tf.totalSize = tf.totalSize - p0.size();
          p0.clear();
          p0 = uCollection;
       }
       return p0;
    }
    public int size(){
       return this.e.size();
    }
    public String toString(){
       return this.e.toString();
    }
}
