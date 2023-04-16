package com.google.common.collect.ImmutableList$ReverseImmutableList;
import com.google.common.collect.ImmutableList;
import java.lang.Object;
import ok.n;
import java.util.List;
import com.google.common.collect.ImmutableCollection;
import java.util.Iterator;
import qk.t0;
import java.util.ListIterator;
import qk.u0;
import java.util.AbstractCollection;

public class ImmutableList$ReverseImmutableList extends ImmutableList	// class@0017dc
{
    public final ImmutableList d;

    public void ImmutableList$ReverseImmutableList(ImmutableList p0){
       super();
       this.d = p0;
    }
    public boolean contains(Object p0){
       return this.d.contains(p0);
    }
    public final int d(int p0){
       return ((this.size() - 1) - p0);
    }
    public Object get(int p0){
       n.i(p0, this.size());
       return this.d.get(this.d(p0));
    }
    public int indexOf(Object p0){
       int i = this.d.lastIndexOf(p0);
       i = (i >= 0)? this.d(i): -1;
       return i;
    }
    public boolean isPartialView(){
       return this.d.isPartialView();
    }
    public Iterator iterator(){
       return super.iterator();
    }
    public final int l(int p0){
       return (this.size() - p0);
    }
    public int lastIndexOf(Object p0){
       int i = this.d.indexOf(p0);
       i = (i >= 0)? this.d(i): -1;
       return i;
    }
    public ListIterator listIterator(){
       return super.listIterator();
    }
    public ListIterator listIterator(int p0){
       return super.listIterator(p0);
    }
    public ImmutableList reverse(){
       return this.d;
    }
    public int size(){
       return this.d.size();
    }
    public ImmutableList subList(int p0,int p1){
       n.m(p0, p1, this.size());
       return this.d.subList(this.l(p1), this.l(p0)).reverse();
    }
    public List subList(int p0,int p1){
       return this.subList(p0, p1);
    }
}
