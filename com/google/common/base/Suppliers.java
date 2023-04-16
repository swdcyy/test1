package com.google.common.base.Suppliers;
import ok.x;
import com.google.common.base.Suppliers$a;
import com.google.common.base.Suppliers$MemoizingSupplier;
import java.io.Serializable;
import java.lang.Object;
import com.google.common.base.Suppliers$SupplierOfInstance;
import com.google.common.base.Suppliers$ThreadSafeSupplier;
import ok.n;

public final class Suppliers	// class@0004be
{

    public static x a(x p0){
       if (p0 instanceof Suppliers$a || p0 instanceof Suppliers$MemoizingSupplier) {
          return p0;
       }
       Suppliers$MemoizingSupplier memoizingSup = (p0 instanceof Serializable)? new Suppliers$MemoizingSupplier(p0): new Suppliers$a(p0);
       return memoizingSup;
    }
    public static x b(Object p0){
       return new Suppliers$SupplierOfInstance(p0);
    }
    public static x c(x p0){
       n.j(p0);
       return new Suppliers$ThreadSafeSupplier(p0);
    }
}
