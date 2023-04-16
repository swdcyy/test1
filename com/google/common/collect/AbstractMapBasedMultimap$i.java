package com.google.common.collect.AbstractMapBasedMultimap$i;
import java.util.SortedMap;
import com.google.common.collect.AbstractMapBasedMultimap$c;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.Comparator;
import java.lang.Object;
import com.google.common.collect.AbstractMapBasedMultimap$j;

public class AbstractMapBasedMultimap$i extends AbstractMapBasedMultimap$c implements SortedMap	// class@001797
{
    public SortedSet g;
    public final AbstractMapBasedMultimap h;

    public void AbstractMapBasedMultimap$i(AbstractMapBasedMultimap p0,SortedMap p1){
       this.h = p0;
       super(p0, p1);
    }
    public Set c(){
       return this.g();
    }
    public Comparator comparator(){
       return this.i().comparator();
    }
    public Object firstKey(){
       return this.i().firstKey();
    }
    public SortedSet g(){
       return new AbstractMapBasedMultimap$j(this.h, this.i());
    }
    public SortedSet h(){
       AbstractMapBasedMultimap$i tg = this.g;
       if (tg == null) {
          tg = this.g();
          this.g = tg;
       }
       return tg;
    }
    public SortedMap headMap(Object p0){
       return new AbstractMapBasedMultimap$i(this.h, this.i().headMap(p0));
    }
    public SortedMap i(){
       return this.e;
    }
    public Set keySet(){
       return this.h();
    }
    public Object lastKey(){
       return this.i().lastKey();
    }
    public SortedMap subMap(Object p0,Object p1){
       return new AbstractMapBasedMultimap$i(this.h, this.i().subMap(p0, p1));
    }
    public SortedMap tailMap(Object p0){
       return new AbstractMapBasedMultimap$i(this.h, this.i().tailMap(p0));
    }
}
