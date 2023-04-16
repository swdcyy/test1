package com.google.common.base.Suppliers$SupplierOfInstance;
import ok.x;
import java.io.Serializable;
import java.lang.Object;
import ok.k;
import java.lang.String;
import java.lang.StringBuilder;

public class Suppliers$SupplierOfInstance implements x, Serializable	// class@00172d
{
    public final Object instance;
    public static final long serialVersionUID;

    public void Suppliers$SupplierOfInstance(Object p0){
       super();
       this.instance = p0;
    }
    public boolean equals(Object p0){
       if (p0 instanceof Suppliers$SupplierOfInstance) {
          return k.a(this.instance, p0.instance);
       }
       return false;
    }
    public Object get(){
       return this.instance;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.instance};
       return k.b(objArray);
    }
    public String toString(){
       return "Suppliers.ofInstance\("+this.instance+"\)";
    }
}
