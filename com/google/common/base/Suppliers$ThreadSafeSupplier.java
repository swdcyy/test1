package com.google.common.base.Suppliers$ThreadSafeSupplier;
import ok.x;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class Suppliers$ThreadSafeSupplier implements x, Serializable	// class@00172e
{
    public final x delegate;
    public static final long serialVersionUID;

    public void Suppliers$ThreadSafeSupplier(x p0){
       super();
       this.delegate = p0;
    }
    public Object get(){
       Suppliers$ThreadSafeSupplier tdelegate = this.delegate;
       _monitor_enter(tdelegate);
       _monitor_exit(tdelegate);
       return this.delegate.get();
    }
    public String toString(){
       return "Suppliers.synchronizedSupplier\("+this.delegate+"\)";
    }
}
