package com.google.common.collect.TreeRangeSet$Complement;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.TreeRangeSet$c;
import java.util.NavigableMap;
import com.google.common.collect.TreeRangeSet$a;
import com.google.common.collect.Range;
import qk.k0;
import java.lang.Comparable;

public final class TreeRangeSet$Complement extends TreeRangeSet	// class@001897
{
    public final TreeRangeSet this$0;

    public void TreeRangeSet$Complement(TreeRangeSet p0){
       this.this$0 = p0;
       super(new TreeRangeSet$c(p0.rangesByLowerBound), null);
    }
    public void add(Range p0){
       this.this$0.remove(p0);
    }
    public k0 complement(){
       return this.this$0;
    }
    public boolean contains(Comparable p0){
       return (this.this$0.contains(p0) ^ 0x01);
    }
    public void remove(Range p0){
       this.this$0.add(p0);
    }
}
