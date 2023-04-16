package com.eclipsesource.v8.utils.V8ObjectUtils$ListWrapper;
import java.util.List;
import java.lang.Object;
import java.lang.System;

public class V8ObjectUtils$ListWrapper	// class@00101e
{
    public List list;

    public void V8ObjectUtils$ListWrapper(List p0){
       super();
       this.list = p0;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof V8ObjectUtils$ListWrapper && p0.list == this.list) {
          b = true;
       }
       return b;
    }
    public int hashCode(){
       return System.identityHashCode(this.list);
    }
}
