package com.google.common.base.Absent;
import com.google.common.base.Optional;
import java.util.Set;
import java.util.Collections;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import ok.n;
import ok.x;
import ok.h;

public final class Absent extends Optional	// class@0004ad
{
    public static final Absent INSTANCE;
    public static final long serialVersionUID;

    static {
       Absent.INSTANCE = new Absent();
    }
    public void Absent(){
       super();
    }
    public static Optional withType(){
       return Absent.INSTANCE;
    }
    public Set asSet(){
       return Collections.emptySet();
    }
    public boolean equals(Object p0){
       boolean b = (p0 == this)? true: false;
       return b;
    }
    public Object get(){
       throw new IllegalStateException("Optional.get\(\) cannot be called on an absent value");
    }
    public int hashCode(){
       return 0x79a31aac;
    }
    public boolean isPresent(){
       return false;
    }
    public Optional or(Optional p0){
       n.j(p0);
       return p0;
    }
    public Object or(Object p0){
       n.k(p0, "use Optional.orNull\(\) instead of Optional.or\(null\)");
       return p0;
    }
    public Object or(x p0){
       p0 = p0.get();
       n.k(p0, "use Optional.orNull\(\) instead of a Supplier that returns null");
       return p0;
    }
    public Object orNull(){
       return null;
    }
    public final Object readResolve(){
       return Absent.INSTANCE;
    }
    public String toString(){
       return "Optional.absent\(\)";
    }
    public Optional transform(h p0){
       n.j(p0);
       return Optional.absent();
    }
}
