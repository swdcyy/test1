package com.google.common.collect.ImmutableMultimap$c;
import java.lang.Object;
import com.google.common.collect.CompactHashMap;
import java.util.Collection;
import java.util.ArrayList;
import qk.g;
import java.util.Map;
import java.util.Map$Entry;

public class ImmutableMultimap$c	// class@0017f0
{
    public Map a;
    public Comparator b;
    public Comparator c;

    public void ImmutableMultimap$c(){
       super();
       this.a = CompactHashMap.create();
    }
    public Collection a(){
       return new ArrayList();
    }
    public ImmutableMultimap$c b(Object p0,Object p1){
       g.a(p0, p1);
       Collection uCollection = this.a.get(p0);
       if (uCollection == null) {
          Collection uCollection1 = this.a();
          this.a.put(p0, uCollection1);
          uCollection = uCollection1;
       }
       uCollection.add(p1);
       return this;
    }
    public ImmutableMultimap$c c(Map$Entry p0){
       return this.b(p0.getKey(), p0.getValue());
    }
}
