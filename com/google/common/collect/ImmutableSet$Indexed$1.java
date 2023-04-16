package com.google.common.collect.ImmutableSet$Indexed$1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet$Indexed;
import java.lang.Object;
import com.google.common.collect.ImmutableCollection;
import java.util.AbstractCollection;

public class ImmutableSet$Indexed$1 extends ImmutableList	// class@0017f8
{
    public final ImmutableSet$Indexed this$0;

    public void ImmutableSet$Indexed$1(ImmutableSet$Indexed p0){
       this.this$0 = p0;
       super();
    }
    public Object get(int p0){
       return this.this$0.get(p0);
    }
    public boolean isPartialView(){
       return this.this$0.isPartialView();
    }
    public int size(){
       return this.this$0.size();
    }
}
