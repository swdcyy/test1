package com.google.common.collect.TreeRangeSet$c$b;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.TreeRangeSet$c;
import com.google.common.collect.Cut;
import qk.i0;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class TreeRangeSet$c$b extends AbstractIterator	// class@00189c
{
    public Cut d;
    public final Cut e;
    public final i0 f;
    public final TreeRangeSet$c g;

    public void TreeRangeSet$c$b(TreeRangeSet$c p0,Cut p1,i0 p2){
       this.g = p0;
       this.e = p1;
       this.f = p2;
       super();
       this.d = p1;
    }
    public Object a(){
       Map$Entry uEntry = null;
       if (this.d == Cut.belowAll()) {
          this.b();
       }else if(this.f.hasNext()){
          Range range = this.f.next();
          Range range1 = Range.create(range.upperBound, this.d);
          this.d = range.lowerBound;
          if (this.g.d.lowerBound.isLessThan(range1.lowerBound)) {
             uEntry = Maps.k(range1.lowerBound, range1);
          }
       }else if(this.g.d.lowerBound.isLessThan(Cut.belowAll())){
          this.d = Cut.belowAll();
          uEntry = Maps.k(Cut.belowAll(), Range.create(Cut.belowAll(), this.d));
       }
       this.b();
       return uEntry;
    }
}
