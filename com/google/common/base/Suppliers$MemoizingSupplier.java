package com.google.common.base.Suppliers$MemoizingSupplier;
import ok.x;
import java.io.Serializable;
import java.lang.Object;
import ok.n;
import java.lang.String;
import java.lang.StringBuilder;

public class Suppliers$MemoizingSupplier implements x, Serializable	// class@0004b9
{
    public final x delegate;
    public boolean initialized;
    public Object value;
    public static final long serialVersionUID;

    public void Suppliers$MemoizingSupplier(x p0){
       super();
       n.j(p0);
       this.delegate = p0;
    }
    public Object get(){
       if (this.initialized == null) {
          _monitor_enter(this);
          if (this.initialized == null) {
             Object obj = this.delegate.get();
             this.value = obj;
             this.initialized = true;
             _monitor_exit(this);
             return obj;
          }else {
             _monitor_exit(this);
          }
       }
       return this.value;
    }
    public String toString(){
       return "Suppliers.memoize\("+this.delegate+"\)";
    }
}
