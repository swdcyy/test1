package com.google.common.collect.ImmutableSortedMap$1EntrySet;
import com.google.common.collect.ImmutableMapEntrySet;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap$1EntrySet$1;
import java.util.Iterator;
import qk.t0;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;

public class ImmutableSortedMap$1EntrySet extends ImmutableMapEntrySet	// class@001801
{
    public final ImmutableSortedMap this$0;

    public void ImmutableSortedMap$1EntrySet(ImmutableSortedMap p0){
       this.this$0 = p0;
       super();
    }
    public ImmutableList createAsList(){
       return new ImmutableSortedMap$1EntrySet$1(this);
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.asList().iterator();
    }
    public ImmutableMap map(){
       return this.this$0;
    }
}
