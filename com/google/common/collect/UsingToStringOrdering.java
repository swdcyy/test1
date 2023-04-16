package com.google.common.collect.UsingToStringOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.lang.Object;
import java.lang.String;

public final class UsingToStringOrdering extends Ordering implements Serializable	// class@0018a5
{
    public static final UsingToStringOrdering INSTANCE;
    public static final long serialVersionUID;

    static {
       UsingToStringOrdering.INSTANCE = new UsingToStringOrdering();
    }
    public void UsingToStringOrdering(){
       super();
    }
    public int compare(Object p0,Object p1){
       return (p0.toString()).compareTo(p1.toString());
    }
    public final Object readResolve(){
       return UsingToStringOrdering.INSTANCE;
    }
    public String toString(){
       return "Ordering.usingToString\(\)";
    }
}
