package com.google.common.collect.o$e;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;
import com.google.common.collect.o;
import java.lang.Object;
import ok.n;
import java.util.AbstractCollection;

public abstract class o$e extends AbstractSet	// class@000533
{

    public void o$e(){
       super();
    }
    public boolean removeAll(Collection p0){
       return o.m(this, p0);
    }
    public boolean retainAll(Collection p0){
       n.j(p0);
       return super.retainAll(p0);
    }
}
