package com.google.common.collect.ImmutableList$b;
import qk.a;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.lang.Object;
import java.util.List;

public class ImmutableList$b extends a	// class@0004da
{
    public final ImmutableList d;

    public void ImmutableList$b(ImmutableList p0,int p1){
       super(p0.size(), p1);
       this.d = p0;
    }
    public Object a(int p0){
       return this.d.get(p0);
    }
}
