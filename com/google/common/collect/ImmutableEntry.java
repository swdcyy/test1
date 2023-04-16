package com.google.common.collect.ImmutableEntry;
import java.io.Serializable;
import qk.b;
import java.lang.Object;
import java.lang.UnsupportedOperationException;

public class ImmutableEntry extends b implements Serializable	// class@0004d5
{
    public final Object key;
    public final Object value;
    public static final long serialVersionUID;

    public void ImmutableEntry(Object p0,Object p1){
       super();
       this.key = p0;
       this.value = p1;
    }
    public final Object getKey(){
       return this.key;
    }
    public final Object getValue(){
       return this.value;
    }
    public final Object setValue(Object p0){
       throw new UnsupportedOperationException();
    }
}
