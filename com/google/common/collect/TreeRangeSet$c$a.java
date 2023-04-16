package com.google.common.collect.TreeRangeSet$c$a;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.TreeRangeSet$c;
import com.google.common.collect.Cut;
import qk.i0;
import java.lang.Object;
import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class TreeRangeSet$c$a extends AbstractIterator	// class@00189b
{
    public Cut d;
    public final Cut e;
    public final i0 f;
    public final TreeRangeSet$c g;

    public void TreeRangeSet$c$a(TreeRangeSet$c p0,Cut p1,i0 p2){
       this.g = p0;
       this.e = p1;
       this.f = p2;
       super();
       this.d = p1;
    }
    public Object a(){
       Map$Entry uEntry;
       Range range1;
       if (this.g.d.upperBound.isLessThan(this.d) || this.d == Cut.aboveAll()) {
          this.b();
          uEntry = null;
       }else if(this.f.hasNext()){
          Range range = this.f.next();
          range1 = Range.create(this.d, range.lowerBound);
          this.d = range.upperBound;
       }else {
          range1 = Range.create(this.d, Cut.aboveAll());
          this.d = Cut.aboveAll();
       }
       uEntry = Maps.k(range1.lowerBound, range1);
       return uEntry;
    }
}
