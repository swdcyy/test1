package com.google.common.collect.StandardTable$c$d;
import com.google.common.collect.Maps$s;
import com.google.common.collect.StandardTable$c;
import java.util.Map;
import java.lang.Object;
import ok.o;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.util.Collection;

public class StandardTable$c$d extends Maps$s	// class@001884
{
    public final StandardTable$c c;

    public void StandardTable$c$d(StandardTable$c p0){
       this.c = p0;
       super(p0);
    }
    public boolean remove(Object p0){
       boolean b = (p0 != null && this.c.f(Maps.F(Predicates.d(p0))))? true: false;
       return b;
    }
    public boolean removeAll(Collection p0){
       return this.c.f(Maps.F(Predicates.e(p0)));
    }
    public boolean retainAll(Collection p0){
       return this.c.f(Maps.F(Predicates.g(Predicates.e(p0))));
    }
}
