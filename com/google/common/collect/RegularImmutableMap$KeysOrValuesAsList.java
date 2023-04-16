package com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList;
import com.google.common.collect.ImmutableList;
import java.lang.Object;
import ok.n;

public final class RegularImmutableMap$KeysOrValuesAsList extends ImmutableList	// class@001872
{
    public final Object[] d;
    public final int e;
    public final int f;

    public void RegularImmutableMap$KeysOrValuesAsList(Object[] p0,int p1,int p2){
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
    }
    public Object get(int p0){
       n.i(p0, this.f);
       return this.d[((p0 * 2) + this.e)];
    }
    public boolean isPartialView(){
       return true;
    }
    public int size(){
       return this.f;
    }
}
