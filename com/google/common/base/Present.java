package com.google.common.base.Present;
import com.google.common.base.Optional;
import java.lang.Object;
import java.util.Set;
import java.util.Collections;
import ok.n;
import ok.x;
import java.lang.String;
import java.lang.StringBuilder;
import ok.h;

public final class Present extends Optional	// class@0004b8
{
    public final Object reference;
    public static final long serialVersionUID;

    public void Present(Object p0){
       super();
       this.reference = p0;
    }
    public Set asSet(){
       return Collections.singleton(this.reference);
    }
    public boolean equals(Object p0){
       if (p0 instanceof Present) {
          return this.reference.equals(p0.reference);
       }
       return false;
    }
    public Object get(){
       return this.reference;
    }
    public int hashCode(){
       return (this.reference.hashCode() + 0x598df91c);
    }
    public boolean isPresent(){
       return true;
    }
    public Optional or(Optional p0){
       n.j(p0);
       return this;
    }
    public Object or(Object p0){
       n.k(p0, "use Optional.orNull\(\) instead of Optional.or\(null\)");
       return this.reference;
    }
    public Object or(x p0){
       n.j(p0);
       return this.reference;
    }
    public Object orNull(){
       return this.reference;
    }
    public String toString(){
       return "Optional.of\("+this.reference+"\)";
    }
    public Optional transform(h p0){
       p0 = p0.apply(this.reference);
       n.k(p0, "the Function passed to Optional.transform\(\) must not return null.");
       return new Present(p0);
    }
}
