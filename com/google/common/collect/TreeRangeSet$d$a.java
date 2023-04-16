package com.google.common.collect.TreeRangeSet$d$a;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.TreeRangeSet$d;
import java.util.Iterator;
import java.lang.Object;
import com.google.common.collect.Range;
import java.lang.Comparable;
import com.google.common.collect.Cut;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class TreeRangeSet$d$a extends AbstractIterator	// class@00189e
{
    public final Iterator d;
    public final TreeRangeSet$d e;

    public void TreeRangeSet$d$a(TreeRangeSet$d p0,Iterator p1){
       this.e = p0;
       this.d = p1;
       super();
    }
    public Object a(){
       Map$Entry uEntry = null;
       if (!this.d.hasNext()) {
          this.b();
       }else {
          Range range = this.d.next();
          if (this.e.c.upperBound.isLessThan(range.upperBound)) {
             this.b();
          }else {
             uEntry = Maps.k(range.upperBound, range);
          }
       }
       return uEntry;
    }
}
