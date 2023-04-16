package com.google.common.collect.CompactHashMap$b;
import com.google.common.collect.CompactHashMap$e;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactHashMap$a;
import java.lang.Object;
import com.google.common.collect.CompactHashMap$g;

public class CompactHashMap$b extends CompactHashMap$e	// class@0017aa
{
    public final CompactHashMap f;

    public void CompactHashMap$b(CompactHashMap p0){
       this.f = p0;
       super(p0, null);
    }
    public Object b(int p0){
       return new CompactHashMap$g(this.f, p0);
    }
}
