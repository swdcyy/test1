package com.google.common.collect.Lists$TransformingSequentialList;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import ok.h;
import java.lang.Object;
import ok.n;
import java.util.ListIterator;
import com.google.common.collect.Lists$TransformingSequentialList$a;

public class Lists$TransformingSequentialList extends AbstractSequentialList implements Serializable	// class@001820
{
    public final List fromList;
    public final h function;
    public static final long serialVersionUID;

    public void Lists$TransformingSequentialList(List p0,h p1){
       super();
       n.j(p0);
       this.fromList = p0;
       n.j(p1);
       this.function = p1;
    }
    public void clear(){
       this.fromList.clear();
    }
    public ListIterator listIterator(int p0){
       return new Lists$TransformingSequentialList$a(this, this.fromList.listIterator(p0));
    }
    public int size(){
       return this.fromList.size();
    }
}
