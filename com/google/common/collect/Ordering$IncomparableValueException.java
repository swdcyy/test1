package com.google.common.collect.Ordering$IncomparableValueException;
import java.lang.ClassCastException;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public class Ordering$IncomparableValueException extends ClassCastException	// class@001866
{
    public final Object value;
    public static final long serialVersionUID;

    public void Ordering$IncomparableValueException(Object p0){
       super("Cannot compare value: "+p0);
       this.value = p0;
    }
}
