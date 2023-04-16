package com.google.common.collect.RegularImmutableTable$CellSet;
import com.google.common.collect.ImmutableSet$Indexed;
import com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.RegularImmutableTable$a;
import java.lang.Object;
import com.google.common.collect.s$a;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.s;

public final class RegularImmutableTable$CellSet extends ImmutableSet$Indexed	// class@001877
{
    public final RegularImmutableTable this$0;

    public void RegularImmutableTable$CellSet(RegularImmutableTable p0){
       this.this$0 = p0;
       super();
    }
    public void RegularImmutableTable$CellSet(RegularImmutableTable p0,RegularImmutableTable$a p1){
       super(p0);
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof s$a) {
          Object obj = this.this$0.get(p0.getRowKey(), p0.getColumnKey());
          if (obj != null && obj.equals(p0.getValue())) {
             b = true;
          }
       }
       return b;
    }
    public s$a get(int p0){
       return this.this$0.getCell(p0);
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public boolean isPartialView(){
       return false;
    }
    public int size(){
       return this.this$0.size();
    }
}
