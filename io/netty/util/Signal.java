package io.netty.util.Signal;
import wqd.h;
import java.lang.Error;
import io.netty.util.Signal$a;
import java.lang.String;
import io.netty.util.Signal$b;
import java.lang.Class;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import wqd.i;
import wqd.a;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.System;

public final class Signal extends Error implements h	// class@0010ee
{
    public final Signal$b constant;
    public static final i b;
    public static final long serialVersionUID;

    static {
       Signal.b = new Signal$a();
    }
    public void Signal(int p0,String p1,Signal$a p2){
       super();
       this.constant = new Signal$b(p0, p1);
    }
    public static Signal valueOf(Class p0,String p1){
       i b = Signal.b;
       Objects.requireNonNull(b);
       Objects.requireNonNull(p0, "firstNameComponent");
       Objects.requireNonNull(p1, "secondNameComponent");
       return b.b(p0.getName()+'#'+p1);
    }
    public static Signal valueOf(String p0){
       return Signal.b.b(p0);
    }
    public int compareTo(Signal p0){
       if (this == p0) {
          return 0;
       }
       return this.constant.a(p0.constant);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public boolean equals(Object p0){
       boolean b = (this == p0)? true: false;
       return b;
    }
    public void expect(Signal p0){
       if (this == p0) {
          return;
       }
       throw new IllegalStateException("unexpected signal: "+p0);
    }
    public Throwable fillInStackTrace(){
       return this;
    }
    public int hashCode(){
       return System.identityHashCode(this);
    }
    public int id(){
       return this.constant.id();
    }
    public Throwable initCause(Throwable p0){
       return this;
    }
    public String name(){
       return this.constant.name();
    }
    public String toString(){
       return this.name();
    }
}
