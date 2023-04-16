package com.google.common.collect.ImmutableMultimap$Keys;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableMultimap;
import java.lang.Object;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import com.google.common.collect.k$a;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map$Entry;
import com.google.common.collect.Multisets$ImmutableEntry;

public class ImmutableMultimap$Keys extends ImmutableMultiset	// class@0017ec
{
    public final ImmutableMultimap this$0;

    public void ImmutableMultimap$Keys(ImmutableMultimap p0){
       this.this$0 = p0;
       super();
    }
    public boolean contains(Object p0){
       return this.this$0.containsKey(p0);
    }
    public int count(Object p0){
       p0 = this.this$0.map.get(p0);
       int i = (p0 == null)? 0: p0.size();
       return i;
    }
    public ImmutableSet elementSet(){
       return this.this$0.keySet();
    }
    public Set elementSet(){
       return this.elementSet();
    }
    public k$a getEntry(int p0){
       Map$Entry uEntry = this.this$0.map.entrySet().asList().get(p0);
       Object key = uEntry.getKey();
       return new Multisets$ImmutableEntry(key, uEntry.getValue().size());
    }
    public boolean isPartialView(){
       return true;
    }
    public int size(){
       return this.this$0.size();
    }
}
