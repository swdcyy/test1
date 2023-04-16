package com.google.common.collect.ImmutableSortedMap$1EntrySet$1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap$1EntrySet;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.AbstractMap$SimpleImmutableEntry;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.List;

public class ImmutableSortedMap$1EntrySet$1 extends ImmutableList	// class@001800
{
    public final ImmutableSortedMap$1EntrySet this$1;

    public void ImmutableSortedMap$1EntrySet$1(ImmutableSortedMap$1EntrySet p0){
       this.this$1 = p0;
       super();
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public Map$Entry get(int p0){
       return new AbstractMap$SimpleImmutableEntry(this.this$1.this$0.keySet.asList().get(p0), this.this$1.this$0.valueList.get(p0));
    }
    public boolean isPartialView(){
       return true;
    }
    public int size(){
       return this.this$1.this$0.size();
    }
}
