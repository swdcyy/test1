package com.google.common.collect.CompactHashMap$a;
import com.google.common.collect.CompactHashMap$e;
import com.google.common.collect.CompactHashMap;
import java.lang.Object;

public class CompactHashMap$a extends CompactHashMap$e	// class@0017a9
{
    public final CompactHashMap f;

    public void CompactHashMap$a(CompactHashMap p0){
       this.f = p0;
       super(p0, null);
    }
    public Object b(int p0){
       return this.f.keys[p0];
    }
}
