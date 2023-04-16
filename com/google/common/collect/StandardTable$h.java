package com.google.common.collect.StandardTable$h;
import com.google.common.collect.Maps$t;
import com.google.common.collect.StandardTable;
import java.util.Set;
import com.google.common.collect.StandardTable$h$a;
import java.lang.Object;
import java.util.Map;

public class StandardTable$h extends Maps$t	// class@001890
{
    public final StandardTable e;

    public void StandardTable$h(StandardTable p0){
       this.e = p0;
       super();
    }
    public Set a(){
       return new StandardTable$h$a(this);
    }
    public boolean containsKey(Object p0){
       return this.e.containsRow(p0);
    }
    public Object get(Object p0){
       p0 = (this.e.containsRow(p0))? this.e.row(p0): null;
       return p0;
    }
    public Object remove(Object p0){
       p0 = (p0 == null)? null: this.e.backingMap.remove(p0);
       return p0;
    }
}
