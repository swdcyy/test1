package com.google.common.collect.RegularImmutableMap$EntrySet$1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMap$EntrySet;
import java.lang.Object;
import java.util.Map$Entry;
import ok.n;
import java.util.AbstractMap$SimpleImmutableEntry;

public class RegularImmutableMap$EntrySet$1 extends ImmutableList	// class@00186f
{
    public final RegularImmutableMap$EntrySet this$0;

    public void RegularImmutableMap$EntrySet$1(RegularImmutableMap$EntrySet p0){
       this.this$0 = p0;
       super();
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public Map$Entry get(int p0){
       n.i(p0, this.this$0.size);
       RegularImmutableMap$EntrySet$1 tthis$0 = this.this$0;
       RegularImmutableMap$EntrySet alternatingK = tthis$0.alternatingKeysAndValues;
       p0 = p0 * 2;
       RegularImmutableMap$EntrySet keyOffset = tthis$0.keyOffset;
       return new AbstractMap$SimpleImmutableEntry(alternatingK[(p0 + keyOffset)], alternatingK[(p0 + (keyOffset ^ 0x01))]);
    }
    public boolean isPartialView(){
       return true;
    }
    public int size(){
       return this.this$0.size;
    }
}
