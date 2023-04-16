package com.google.common.collect.ImmutableSet$Indexed;
import com.google.common.collect.ImmutableSet;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet$Indexed$1;
import java.util.Iterator;
import qk.t0;

public abstract class ImmutableSet$Indexed extends ImmutableSet	// class@0017f9
{

    public void ImmutableSet$Indexed(){
       super();
    }
    public int copyIntoArray(Object[] p0,int p1){
       return this.asList().copyIntoArray(p0, p1);
    }
    public ImmutableList createAsList(){
       return new ImmutableSet$Indexed$1(this);
    }
    public abstract Object get(int p0);
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.asList().iterator();
    }
}
