package com.google.common.collect.TreeRangeSet$SubRangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeSet$e;
import java.util.NavigableMap;
import com.google.common.collect.TreeRangeSet$a;
import java.lang.String;
import java.lang.Object;
import ok.n;
import java.lang.Comparable;

public final class TreeRangeSet$SubRangeSet extends TreeRangeSet	// class@001898
{
    public final Range restriction;
    public final TreeRangeSet this$0;

    public void TreeRangeSet$SubRangeSet(TreeRangeSet p0,Range p1){
       this.this$0 = p0;
       super(new TreeRangeSet$e(Range.all(), p1, p0.rangesByLowerBound), null);
       this.restriction = p1;
    }
    public void add(Range p0){
       n.h(this.restriction.encloses(p0), "Cannot add range %s to subRangeSet\(%s\)", p0, this.restriction);
       super.add(p0);
    }
    public void clear(){
       this.this$0.remove(this.restriction);
    }
    public boolean contains(Comparable p0){
       boolean b = (this.restriction.contains(p0) && this.this$0.contains(p0))? true: false;
       return b;
    }
    public boolean encloses(Range p0){
       boolean b = false;
       if (!this.restriction.isEmpty() && this.restriction.encloses(p0)) {
          p0 = this.this$0.rangeEnclosing(p0);
          if (p0 != null && !p0.intersection(this.restriction).isEmpty()) {
             b = true;
          }
       }
       return b;
    }
    public Range rangeContaining(Comparable p0){
       Range range = null;
       if (!this.restriction.contains(p0)) {
          return range;
       }
       Range range1 = this.this$0.rangeContaining(p0);
       if (range1 != null) {
          range = range1.intersection(this.restriction);
       }
       return range;
    }
    public void remove(Range p0){
       if (p0.isConnected(this.restriction)) {
          this.this$0.remove(p0.intersection(this.restriction));
       }
       return;
    }
}
