package com.google.common.collect.CompactHashMap$c;
import com.google.common.collect.CompactHashMap$e;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactHashMap$a;
import java.lang.Object;

public class CompactHashMap$c extends CompactHashMap$e	// class@0017ab
{
    public final CompactHashMap f;

    public void CompactHashMap$c(CompactHashMap p0){
       this.f = p0;
       super(p0, null);
    }
    public Object b(int p0){
       return this.f.values[p0];
    }
}
