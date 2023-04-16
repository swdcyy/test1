package com.google.common.base.Equivalence$Equals;
import java.io.Serializable;
import com.google.common.base.Equivalence;
import java.lang.Object;

public final class Equivalence$Equals extends Equivalence implements Serializable	// class@001713
{
    public static final Equivalence$Equals INSTANCE;
    public static final long serialVersionUID;

    static {
       Equivalence$Equals.INSTANCE = new Equivalence$Equals();
    }
    public void Equivalence$Equals(){
       super();
    }
    public boolean doEquivalent(Object p0,Object p1){
       return p0.equals(p1);
    }
    public int doHash(Object p0){
       return p0.hashCode();
    }
    public final Object readResolve(){
       return Equivalence$Equals.INSTANCE;
    }
}
