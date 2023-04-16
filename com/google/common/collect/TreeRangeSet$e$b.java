package com.google.common.collect.TreeRangeSet$e$b;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.TreeRangeSet$e;
import java.util.Iterator;
import java.lang.Object;
import com.google.common.collect.Range;
import com.google.common.collect.Cut;
import java.lang.Comparable;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class TreeRangeSet$e$b extends AbstractIterator	// class@0018a2
{
    public final Iterator d;
    public final TreeRangeSet$e e;

    public void TreeRangeSet$e$b(TreeRangeSet$e p0,Iterator p1){
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
          if (this.e.c.lowerBound.compareTo(range.upperBound) >= 0) {
             this.b();
          }else {
             range = range.intersection(this.e.c);
             if (this.e.b.contains(range.lowerBound)) {
                uEntry = Maps.k(range.lowerBound, range);
             }else {
                this.b();
             }
          }
       }
       return uEntry;
    }
}
