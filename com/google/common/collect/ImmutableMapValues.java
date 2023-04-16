package com.google.common.collect.ImmutableMapValues;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMapValues$2;
import java.lang.Object;
import qk.t0;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.ImmutableMapValues$a;
import java.util.Map;

public final class ImmutableMapValues extends ImmutableCollection	// class@0017ea
{
    public final ImmutableMap map;

    public void ImmutableMapValues(ImmutableMap p0){
       super();
       this.map = p0;
    }
    public ImmutableList asList(){
       return new ImmutableMapValues$2(this, this.map.entrySet().asList());
    }
    public boolean contains(Object p0){
       boolean b = (p0 != null && Iterators.f(this.iterator(), p0))? true: false;
       return b;
    }
    public boolean isPartialView(){
       return true;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return new ImmutableMapValues$a(this);
    }
    public int size(){
       return this.map.size();
    }
}
