package com.google.common.base.Equivalence$Identity;
import java.io.Serializable;
import com.google.common.base.Equivalence;
import java.lang.Object;
import java.lang.System;

public final class Equivalence$Identity extends Equivalence implements Serializable	// class@001715
{
    public static final Equivalence$Identity INSTANCE;
    public static final long serialVersionUID;

    static {
       Equivalence$Identity.INSTANCE = new Equivalence$Identity();
    }
    public void Equivalence$Identity(){
       super();
    }
    public boolean doEquivalent(Object p0,Object p1){
       return false;
    }
    public int doHash(Object p0){
       return System.identityHashCode(p0);
    }
    public final Object readResolve(){
       return Equivalence$Identity.INSTANCE;
    }
}
