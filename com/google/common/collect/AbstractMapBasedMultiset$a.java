package com.google.common.collect.AbstractMapBasedMultiset$a;
import com.google.common.collect.AbstractMapBasedMultiset$c;
import com.google.common.collect.AbstractMapBasedMultiset;
import java.lang.Object;
import com.google.common.collect.l;

public class AbstractMapBasedMultiset$a extends AbstractMapBasedMultiset$c	// class@00179f
{
    public final AbstractMapBasedMultiset f;

    public void AbstractMapBasedMultiset$a(AbstractMapBasedMultiset p0){
       this.f = p0;
       super(p0);
    }
    public Object b(int p0){
       return this.f.backingMap.f(p0);
    }
}
