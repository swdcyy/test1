package com.google.common.collect.StandardTable$i;
import com.google.common.collect.o$e;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$a;
import java.util.Map;

public abstract class StandardTable$i extends o$e	// class@001891
{
    public final StandardTable b;

    public void StandardTable$i(StandardTable p0){
       this.b = p0;
       super();
    }
    public void StandardTable$i(StandardTable p0,StandardTable$a p1){
       super(p0);
    }
    public void clear(){
       this.b.backingMap.clear();
    }
    public boolean isEmpty(){
       return this.b.backingMap.isEmpty();
    }
}
