package com.google.common.collect.StandardTable$h$a;
import com.google.common.collect.StandardTable$i;
import com.google.common.collect.StandardTable$h;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$a;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import com.google.common.collect.e;
import java.util.Iterator;
import com.google.common.collect.StandardTable$h$a$a;
import ok.h;
import com.google.common.collect.Maps;

public class StandardTable$h$a extends StandardTable$i	// class@00188f
{
    public final StandardTable$h c;

    public void StandardTable$h$a(StandardTable$h p0){
       this.c = p0;
       super(p0.e, null);
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry && (p0.getKey() != null && (p0.getValue() instanceof Map && e.e(this.c.e.backingMap.entrySet(), p0)))) {
          b = true;
       }
    label_0026 :
       return b;
    }
    public Iterator iterator(){
       return Maps.b(this.c.e.backingMap.keySet(), new StandardTable$h$a$a(this));
    }
    public boolean remove(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry && (p0.getKey() != null && (p0.getValue() instanceof Map && this.c.e.backingMap.entrySet().remove(p0)))) {
          b = true;
       }
    label_0026 :
       return b;
    }
    public int size(){
       return this.c.e.backingMap.size();
    }
}
