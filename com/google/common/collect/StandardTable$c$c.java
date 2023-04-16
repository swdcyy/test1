package com.google.common.collect.StandardTable$c$c;
import com.google.common.collect.Maps$m;
import com.google.common.collect.StandardTable$c;
import java.util.Map;
import java.lang.Object;
import com.google.common.collect.StandardTable;
import java.util.Collection;
import ok.o;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;

public class StandardTable$c$c extends Maps$m	// class@001883
{
    public final StandardTable$c c;

    public void StandardTable$c$c(StandardTable$c p0){
       this.c = p0;
       super(p0);
    }
    public boolean contains(Object p0){
       StandardTable$c$c tc = this.c;
       return tc.f.contains(p0, tc.e);
    }
    public boolean remove(Object p0){
       StandardTable$c$c tc = this.c;
       boolean b = (tc.f.remove(p0, tc.e) != null)? true: false;
       return b;
    }
    public boolean retainAll(Collection p0){
       return this.c.f(Maps.p(Predicates.g(Predicates.e(p0))));
    }
}
