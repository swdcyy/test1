package com.google.common.base.Optional;
import java.io.Serializable;
import java.lang.Object;
import com.google.common.base.Absent;
import com.google.common.base.Present;
import ok.n;
import java.lang.Iterable;
import com.google.common.base.Optional$a;
import java.util.Set;
import ok.x;
import java.lang.String;
import ok.h;

public abstract class Optional implements Serializable	// class@0004b4
{
    public static final long serialVersionUID;

    public void Optional(){
       super();
    }
    public static Optional absent(){
       return Absent.withType();
    }
    public static Optional fromNullable(Object p0){
       p0 = (p0 == null)? Optional.absent(): new Present(p0);
       return p0;
    }
    public static Optional of(Object p0){
       n.j(p0);
       return new Present(p0);
    }
    public static Iterable presentInstances(Iterable p0){
       n.j(p0);
       return new Optional$a(p0);
    }
    public abstract Set asSet();
    public abstract boolean equals(Object p0);
    public abstract Object get();
    public abstract int hashCode();
    public abstract boolean isPresent();
    public abstract Optional or(Optional p0);
    public abstract Object or(Object p0);
    public abstract Object or(x p0);
    public abstract Object orNull();
    public abstract String toString();
    public abstract Optional transform(h p0);
}
