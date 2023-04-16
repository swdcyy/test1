package com.google.common.collect.ImmutableList$SubList;
import com.google.common.collect.ImmutableList;
import java.lang.Object;
import ok.n;
import java.util.List;
import java.util.Iterator;
import qk.t0;
import java.util.ListIterator;
import qk.u0;

public class ImmutableList$SubList extends ImmutableList	// class@0017dd
{
    public final int length;
    public final int offset;
    public final ImmutableList this$0;

    public void ImmutableList$SubList(ImmutableList p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.offset = p1;
       this.length = p2;
    }
    public Object get(int p0){
       n.i(p0, this.length);
       return this.this$0.get((p0 + this.offset));
    }
    public boolean isPartialView(){
       return true;
    }
    public Iterator iterator(){
       return super.iterator();
    }
    public ListIterator listIterator(){
       return super.listIterator();
    }
    public ListIterator listIterator(int p0){
       return super.listIterator(p0);
    }
    public int size(){
       return this.length;
    }
    public ImmutableList subList(int p0,int p1){
       n.m(p0, p1, this.length);
       ImmutableList$SubList toffset = this.offset;
       return this.this$0.subList((p0 + toffset), (p1 + toffset));
    }
    public List subList(int p0,int p1){
       return this.subList(p0, p1);
    }
}
