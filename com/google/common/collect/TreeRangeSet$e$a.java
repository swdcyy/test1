package com.google.common.collect.TreeRangeSet$e$a;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.TreeRangeSet$e;
import java.util.Iterator;
import com.google.common.collect.Cut;
import java.lang.Object;
import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class TreeRangeSet$e$a extends AbstractIterator	// class@0018a1
{
    public final Iterator d;
    public final Cut e;
    public final TreeRangeSet$e f;

    public void TreeRangeSet$e$a(TreeRangeSet$e p0,Iterator p1,Cut p2){
       this.f = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public Object a(){
       Map$Entry uEntry = null;
       if (!this.d.hasNext()) {
          this.b();
       }else {
          Range range = this.d.next();
          if (this.e.isLessThan(range.lowerBound)) {
             this.b();
          }else {
             range = range.intersection(this.f.c);
             uEntry = Maps.k(range.lowerBound, range);
          }
       }
       return uEntry;
    }
}
