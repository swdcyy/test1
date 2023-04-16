package com.google.common.collect.Range$RangeLexOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import com.google.common.collect.Range;
import qk.h;
import java.lang.Comparable;
import java.lang.Object;

public class Range$RangeLexOrdering extends Ordering implements Serializable	// class@001868
{
    public static final Ordering INSTANCE;
    public static final long serialVersionUID;

    static {
       Range$RangeLexOrdering.INSTANCE = new Range$RangeLexOrdering();
    }
    public void Range$RangeLexOrdering(){
       super();
    }
    public int compare(Range p0,Range p1){
       return h.j().e(p0.lowerBound, p1.lowerBound).e(p0.upperBound, p1.upperBound).i();
    }
    public int compare(Object p0,Object p1){
       return this.compare(p0, p1);
    }
}
