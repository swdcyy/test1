package com.google.common.collect.RegularImmutableMap$KeySet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import java.lang.Object;
import java.util.Iterator;
import qk.t0;
import java.util.Map;

public final class RegularImmutableMap$KeySet extends ImmutableSet	// class@001871
{
    public final ImmutableMap d;
    public final ImmutableList e;

    public void RegularImmutableMap$KeySet(ImmutableMap p0,ImmutableList p1){
       super();
       this.d = p0;
       this.e = p1;
    }
    public ImmutableList asList(){
       return this.e;
    }
    public boolean contains(Object p0){
       boolean b = (this.d.get(p0) != null)? true: false;
       return b;
    }
    public int copyIntoArray(Object[] p0,int p1){
       return this.asList().copyIntoArray(p0, p1);
    }
    public boolean isPartialView(){
       return true;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.asList().iterator();
    }
    public int size(){
       return this.d.size();
    }
}
