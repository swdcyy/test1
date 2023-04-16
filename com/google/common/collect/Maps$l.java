package com.google.common.collect.Maps$l;
import java.util.AbstractMap;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import java.util.Set;
import com.google.common.collect.Maps$l$a;

public abstract class Maps$l extends AbstractMap	// class@00184d
{

    public void Maps$l(){
       super();
    }
    public abstract Iterator a();
    public void clear(){
       Iterators.d(this.a());
    }
    public Set entrySet(){
       return new Maps$l$a(this);
    }
    public abstract int size();
}
