package com.google.common.collect.TreeRangeSet$d$b;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.TreeRangeSet$d;
import qk.i0;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.collect.Range;
import java.lang.Comparable;
import com.google.common.collect.Cut;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class TreeRangeSet$d$b extends AbstractIterator	// class@00189f
{
    public final i0 d;
    public final TreeRangeSet$d e;

    public void TreeRangeSet$d$b(TreeRangeSet$d p0,i0 p1){
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
          if (this.e.c.lowerBound.isLessThan(range.upperBound)) {
             uEntry = Maps.k(range.upperBound, range);
          }else {
             this.b();
          }
       }
       return uEntry;
    }
}
