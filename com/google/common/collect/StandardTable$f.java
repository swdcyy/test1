package com.google.common.collect.StandardTable$f;
import com.google.common.collect.Maps$t;
import com.google.common.collect.StandardTable;
import java.util.Set;
import com.google.common.collect.StandardTable$f$a;
import java.lang.Object;
import java.util.Collection;
import com.google.common.collect.StandardTable$f$b;
import java.util.Map;

public class StandardTable$f extends Maps$t	// class@00188b
{
    public final StandardTable e;

    public void StandardTable$f(StandardTable p0){
       this.e = p0;
       super();
    }
    public Set a(){
       return new StandardTable$f$a(this);
    }
    public boolean containsKey(Object p0){
       return this.e.containsColumn(p0);
    }
    public Collection e(){
       return new StandardTable$f$b(this);
    }
    public Map f(Object p0){
       p0 = (this.e.containsColumn(p0))? this.e.column(p0): null;
       return p0;
    }
    public Object get(Object p0){
       return this.f(p0);
    }
    public Set keySet(){
       return this.e.columnKeySet();
    }
    public Object remove(Object p0){
       p0 = (this.e.containsColumn(p0))? this.e.removeColumn(p0): null;
       return p0;
    }
}
