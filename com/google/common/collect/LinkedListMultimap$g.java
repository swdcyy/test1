package com.google.common.collect.LinkedListMultimap$g;
import qk.b;
import java.lang.Object;

public final class LinkedListMultimap$g extends b	// class@0004ec
{
    public final Object b;
    public Object c;
    public LinkedListMultimap$g d;
    public LinkedListMultimap$g e;
    public LinkedListMultimap$g f;
    public LinkedListMultimap$g g;

    public void LinkedListMultimap$g(Object p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Object getKey(){
       return this.b;
    }
    public Object getValue(){
       return this.c;
    }
    public Object setValue(Object p0){
       LinkedListMultimap$g tc = this.c;
       this.c = p0;
       return tc;
    }
}
