package com.google.common.collect.AbstractMapBasedMultimap$b;
import com.google.common.collect.AbstractMapBasedMultimap$d;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class AbstractMapBasedMultimap$b extends AbstractMapBasedMultimap$d	// class@00178d
{
    public final AbstractMapBasedMultimap g;

    public void AbstractMapBasedMultimap$b(AbstractMapBasedMultimap p0){
       this.g = p0;
       super(p0);
    }
    public Object a(Object p0,Object p1){
       return Maps.k(p0, p1);
    }
}
