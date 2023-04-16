package com.google.common.collect.RegularImmutableTable$Values;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.RegularImmutableTable$a;
import java.lang.Object;
import com.google.common.collect.s;

public final class RegularImmutableTable$Values extends ImmutableList	// class@001878
{
    public final RegularImmutableTable this$0;

    public void RegularImmutableTable$Values(RegularImmutableTable p0){
       this.this$0 = p0;
       super();
    }
    public void RegularImmutableTable$Values(RegularImmutableTable p0,RegularImmutableTable$a p1){
       super(p0);
    }
    public Object get(int p0){
       return this.this$0.getValue(p0);
    }
    public boolean isPartialView(){
       return true;
    }
    public int size(){
       return this.this$0.size();
    }
}
