package com.google.common.collect.AbstractMapBasedMultiset$b;
import com.google.common.collect.AbstractMapBasedMultiset$c;
import com.google.common.collect.AbstractMapBasedMultiset;
import java.lang.Object;
import com.google.common.collect.k$a;
import com.google.common.collect.l;

public class AbstractMapBasedMultiset$b extends AbstractMapBasedMultiset$c	// class@0017a0
{
    public final AbstractMapBasedMultiset f;

    public void AbstractMapBasedMultiset$b(AbstractMapBasedMultiset p0){
       this.f = p0;
       super(p0);
    }
    public Object b(int p0){
       return this.f.backingMap.d(p0);
    }
}
